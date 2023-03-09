package data.repositories;

import data.models.Candidate;
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
    public void updateCandidate(Candidate candidate) {
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getCandidateID() == candidate.getCandidateID()) {
                candidates.set(i, candidate);
                break;
            }
        }
    }
}