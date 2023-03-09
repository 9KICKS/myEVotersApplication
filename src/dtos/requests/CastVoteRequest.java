package dtos.requests;

public class CastVoteRequest {
    private int userId;
    private int candidateId;

    public CastVoteRequest(int userId, int candidateId) {
        this.userId = userId;
        this.candidateId = candidateId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }
}