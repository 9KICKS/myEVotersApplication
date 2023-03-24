package africa.semicolon.vote4change.data.models;

public class Candidate {
    private int candidateID;
    private String name;
    private String politicalParty;

    public Candidate(String name, String politicalParty) {
        this.name = name;
        this.politicalParty = politicalParty;
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
}