package dtos.responses;

public class AddCandidateResponse {
    private final boolean addSuccessful;
    private final String message;

    public AddCandidateResponse(boolean addSuccessful, String message) {
        this.addSuccessful = addSuccessful;
        this.message = message;
    }

    public boolean isAddSuccessful() {
        return addSuccessful;
    }

    public String getMessage() {
        return message;
    }
}