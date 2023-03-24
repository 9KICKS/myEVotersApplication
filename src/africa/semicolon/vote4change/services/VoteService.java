package africa.semicolon.vote4change.services;

import africa.semicolon.vote4change.dtos.requests.CastVoteRequest;
import africa.semicolon.vote4change.dtos.responses.CastVoteResponse;

public interface VoteService {
    CastVoteResponse castVote(CastVoteRequest request);
}