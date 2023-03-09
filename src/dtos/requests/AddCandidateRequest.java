package dtos.requests;

public class AddCandidateRequest {
    private final String candidateName;
    private final String politicalParty;
    private final int electionID;
    private final String details;

    public AddCandidateRequest(String candidateName, String politicalParty, int electionID, String details) {
        this.candidateName = candidateName;
        this.politicalParty = politicalParty;
        this.electionID = electionID;
        this.details = details;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public int getElectionID() {
        return electionID;
    }

    public String getDetails() {
        return details;
    }
}