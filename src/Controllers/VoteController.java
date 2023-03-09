package Controllers;

import data.models.Candidate;
import dtos.requests.CastVoteRequest;
import dtos.responses.CastVoteResponse;
import services.VoteService;
import services.VoteServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class VoteController {
    private final VoteService voteService;

    public VoteController() {
        List<Candidate> candidates = new ArrayList<>();
        this.voteService = new VoteServiceImpl(candidates);
    }

    public CastVoteResponse castVote(CastVoteRequest request) {
        return voteService.castVote(request);
    }
}