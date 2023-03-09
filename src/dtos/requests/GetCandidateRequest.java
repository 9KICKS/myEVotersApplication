package dtos.requests;

public class GetCandidateRequest {
    private final String candidateName;
    private final String politicalParty;
    private final int electionID;

    public GetCandidateRequest(String candidateName, String politicalParty, int electionID) {
        this.candidateName = candidateName;
        this.politicalParty = politicalParty;
        this.electionID = electionID;
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
}