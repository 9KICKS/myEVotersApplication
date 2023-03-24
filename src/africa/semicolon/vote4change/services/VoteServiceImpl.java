package africa.semicolon.vote4change.services;

import africa.semicolon.vote4change.data.models.Candidate;
import africa.semicolon.vote4change.data.models.Vote;
import africa.semicolon.vote4change.dtos.requests.CastVoteRequest;
import africa.semicolon.vote4change.dtos.responses.CastVoteResponse;
import java.util.ArrayList;
import java.util.List;

public class VoteServiceImpl implements VoteService {
    private final List<Candidate> candidates;
    private final List<Vote> votes;

    public VoteServiceImpl(List<Candidate> candidates) {
        this.candidates = candidates;
        this.votes = new ArrayList<>();
    }

    @Override
    public CastVoteResponse castVote(CastVoteRequest request) {
        String candidateName = request.getCandidateName();
        Candidate candidate = findCandidateByName(candidateName);
        if (candidate == null) {
            return new CastVoteResponse(false, "Invalid Candidate name.");
        }
        Vote vote = new Vote(request.getCandidateName(), candidate);
        votes.add(vote);
        return new CastVoteResponse(true, "Vote cast successfully.");
    }

    private Candidate findCandidateByName(String candidateName) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(candidateName)) {
                return candidate;
            }
        }
        return null;
    }
}