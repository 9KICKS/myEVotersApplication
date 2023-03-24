package africa.semicolon.vote4change.Controllers;

import africa.semicolon.vote4change.data.models.Candidate;
import africa.semicolon.vote4change.dtos.requests.CastVoteRequest;
import africa.semicolon.vote4change.dtos.responses.CastVoteResponse;
import africa.semicolon.vote4change.services.VoteService;
import africa.semicolon.vote4change.services.VoteServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class VoteController {
    private final VoteService voteService;

    public VoteController() {
        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Atiku Abubakar", "PDP"));
        candidates.add(new Candidate("Rabiu Musa Kwankwaso", "NNPP"));
        candidates.add(new Candidate("Peter Obi", "LP"));
        candidates.add(new Candidate("Bola Tinubu", "APC"));
        this.voteService = new VoteServiceImpl(candidates);
    }

    public CastVoteResponse castVote(CastVoteRequest request) {
        String candidateName = request.getCandidateName();
        switch (candidateName) {
            case "1" -> candidateName = "Atiku Abubakar";
            case "2" -> candidateName = "Rabiu Musa Kwankwaso";
            case "3" -> candidateName = "Peter Obi";
            case "4" -> candidateName = "Bola Tinubu";
        }
        request.setCandidateName(candidateName);
        return voteService.castVote(request);
    }
}