package dtos.responses;

public class CastVoteResponse {
    private final boolean voteCastSuccessful;
    private final String message;

    public CastVoteResponse(boolean voteCastSuccessful, String message) {
        this.voteCastSuccessful = voteCastSuccessful;
        this.message = message;
    }

    public boolean isVoteCastSuccessful() {
        return voteCastSuccessful;
    }

    public String getMessage() {
        return message;
    }
}