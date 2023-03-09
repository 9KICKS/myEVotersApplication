package services;

import data.models.Candidate;
import dtos.requests.AddCandidateRequest;
import dtos.requests.EditCandidateRequest;
import dtos.requests.GetCandidateRequest;
import java.util.List;

public interface CandidateService {
    List<Candidate> getCandidates();

    Candidate getCandidateById(int id);

    Candidate addCandidate(AddCandidateRequest request);

    Candidate editCandidate(EditCandidateRequest request);

    void removeCandidate(int id);

    List<Candidate> searchCandidates(GetCandidateRequest request);
}