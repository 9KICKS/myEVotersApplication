package africa.semicolon.vote4change.services;

import africa.semicolon.vote4change.data.models.Candidate;
import java.util.ArrayList;
import java.util.List;

public class CandidateServiceImpl implements CandidateService {
    private final List<Candidate> candidates;

    private int nextCandidateId;

    public CandidateServiceImpl() {
        candidates = new ArrayList<>();
        nextCandidateId = 1;
    }

    @Override
    public List<Candidate> getCandidates() {
        return new ArrayList<>(candidates);
    }

    @Override
    public Candidate getCandidateById(int id) {
        return candidates.stream()
                .filter(candidate -> candidate.getCandidateID() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void removeCandidate(int id) {
        candidates.removeIf(candidate -> candidate.getCandidateID() == id);
    }
}