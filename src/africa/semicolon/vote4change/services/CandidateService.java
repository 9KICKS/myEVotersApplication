package africa.semicolon.vote4change.services;

import africa.semicolon.vote4change.data.models.Candidate;

import java.util.List;

public interface CandidateService {
    List<Candidate> getCandidates();
    Candidate getCandidateById(int id);
    void removeCandidate(int id);
}