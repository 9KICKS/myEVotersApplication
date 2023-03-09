package Controllers;

import data.models.Candidate;
import dtos.requests.AddCandidateRequest;
import dtos.requests.EditCandidateRequest;
import services.CandidateService;
import services.CandidateServiceImpl;

public class CandidateController {
    private final CandidateService candidateService = new CandidateServiceImpl();

    public Candidate addCandidate(AddCandidateRequest request) {
        return candidateService.addCandidate(request);
    }

    public Candidate editCandidate(EditCandidateRequest request) {
        return candidateService.editCandidate(request);
    }
}