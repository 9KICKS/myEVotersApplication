package services;

import data.models.Candidate;
import data.models.Vote;
import dtos.requests.CastVoteRequest;
import dtos.responses.CastVoteResponse;
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
        int candidateId = request.getCandidateId();
        Candidate candidate = findCandidateById(candidateId);
        if (candidate == null) {
            return new CastVoteResponse(false, "Invalid Candidate ID.");
        }
        Vote vote = new Vote(request.getUserId(), candidate);
        votes.add(vote);
        return new CastVoteResponse(true, "Vote cast successfully.");
    }

    private Candidate findCandidateById(int candidateId) {
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateID() == candidateId) {
                return candidate;
            }
        }
        return null;
    }
}