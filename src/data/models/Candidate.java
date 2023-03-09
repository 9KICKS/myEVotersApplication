package data.models;

public class Candidate {
    private int candidateID;
    private String name;
    private String politicalParty;
    private int voteCount;

    public Candidate(int candidateID, String name, String politicalParty, int voteCount) {
        this.candidateID = candidateID;
        this.name = name;
        this.politicalParty = politicalParty;
        this.voteCount = voteCount;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(PoliticalParty politicalParty) {
        this.politicalParty = String.valueOf(politicalParty);
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}