package ma.youcode.aftasclubapiv2.services.implementations;

import ma.youcode.aftasclubapiv2.dto.requests.RankRequest;
import ma.youcode.aftasclubapiv2.dto.responses.RankResponse;
import ma.youcode.aftasclubapiv2.entities.Ranking;
import ma.youcode.aftasclubapiv2.entities.embedded.RankId;
import ma.youcode.aftasclubapiv2.mapper.RankingMapper;
import ma.youcode.aftasclubapiv2.repositories.RankingRepository;
import ma.youcode.aftasclubapiv2.services.RankingService;
import org.springframework.stereotype.Service;

@Service
public class RankingServiceImpl extends AbstractServiceImpl<RankId, RankRequest, RankResponse, Ranking, RankingRepository, RankingMapper> implements RankingService
{
}
