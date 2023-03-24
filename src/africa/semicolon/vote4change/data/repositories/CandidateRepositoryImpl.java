package africa.semicolon.vote4change.data.repositories;

import africa.semicolon.vote4change.data.models.Candidate;
import java.util.ArrayList;
import java.util.List;

public class CandidateRepositoryImpl implements CandidateRepository {
    private final List<Candidate> candidates;

    public CandidateRepositoryImpl() {
        candidates = new ArrayList<>();
    }

    @Override
    public List<Candidate> getAllCandidates() {
        return candidates;
    }

    @Override
    public Candidate getCandidateById(int id) {
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateID() == id) {
                return candidate;
            }
        }
        return null;
    }

    @Override
    public Candidate getCandidateByName(String name) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                return candidate;
            }
        }
        return null;
    }
}