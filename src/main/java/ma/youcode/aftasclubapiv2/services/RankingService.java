package ma.youcode.aftasclubapiv2.services;

import ma.youcode.aftasclubapiv2.dto.requests.RankRequest;
import ma.youcode.aftasclubapiv2.dto.responses.RankResponse;
import ma.youcode.aftasclubapiv2.entities.embedded.RankId;

import java.util.UUID;

public interface RankingService extends _Service<RankId, RankRequest, RankResponse> {
}
