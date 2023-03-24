package africa.semicolon.vote4change.dtos.requests;

public class CastVoteRequest {
    private String candidateName;

    public CastVoteRequest(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }
}