package data.repositories;

import data.models.Candidate;

import java.util.List;

public interface CandidateRepository {
    List<Candidate> getAllCandidates();

    Candidate getCandidateById(int id);

    void updateCandidate(Candidate candidate);
}