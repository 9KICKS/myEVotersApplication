package dtos.requests;

import data.models.PoliticalParty;

public class EditCandidateRequest {
    private final int candidateID;
    private final String candidateName;
    private final String politicalParty;
    private final String details;

    public EditCandidateRequest(int candidateID, String candidateName, String politicalParty, String details) {
        this.candidateID = candidateID;
        this.candidateName = candidateName;
        this.politicalParty = politicalParty;
        this.details = details;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public PoliticalParty getPoliticalParty() {
        return new PoliticalParty(-1, politicalParty);
    }

    public String getDetails() {
        return details;
    }
}