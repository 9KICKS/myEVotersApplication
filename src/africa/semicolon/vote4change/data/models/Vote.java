package africa.semicolon.vote4change.data.models;

public class Vote {
    private int voteID;
    private final Candidate candidate;
    private String user;

    public Vote(String candidateName, Candidate candidate) {
        this.candidate = candidate;
    }

    public void setVoteID(int VoteID) {
        this.voteID = voteID;
    }

    public int getVoteID() {
        return voteID;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}