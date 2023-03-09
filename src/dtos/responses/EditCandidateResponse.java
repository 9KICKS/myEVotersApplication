package dtos.responses;

public class EditCandidateResponse {
    private final int candidateID;
    private final String candidateName;
    private final String politicalParty;
    private final String details;

    public EditCandidateResponse(int candidateID, String candidateName, String politicalParty, String details) {
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

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getDetails() {
        return details;
    }
}