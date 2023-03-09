package services;

import dtos.requests.CastVoteRequest;
import dtos.responses.CastVoteResponse;

public interface VoteService {
    CastVoteResponse castVote(CastVoteRequest request);
}