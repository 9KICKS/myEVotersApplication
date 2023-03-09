package data.models;

public class Vote {
    private int voteID;
    private final User user;
    private final Candidate candidate;

    public Vote(int userID, Candidate candidate) {
        this.user = new User(userID);
        this.candidate = candidate;
    }

    public void setVoteID(int VoteID) {
        this.voteID = voteID;
    }

    public int getVoteID() {
        return voteID;
    }

    public User getUser() {
        return user;
    }

    public Candidate getCandidate() {
        return candidate;
    }
}