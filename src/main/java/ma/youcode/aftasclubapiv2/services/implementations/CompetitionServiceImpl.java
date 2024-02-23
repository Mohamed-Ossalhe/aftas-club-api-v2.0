package ma.youcode.aftasclubapiv2.services.implementations;

import ma.youcode.aftasclubapiv2.dto.requests.CompetitionRequest;
import ma.youcode.aftasclubapiv2.dto.responses.CompetitionResponse;
import ma.youcode.aftasclubapiv2.entities.Competition;
import ma.youcode.aftasclubapiv2.mapper.CompetitionMapper;
import ma.youcode.aftasclubapiv2.repositories.CompetitionRepository;
import ma.youcode.aftasclubapiv2.services.CompetitionService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CompetitionServiceImpl extends AbstractServiceImpl<UUID, CompetitionRequest, CompetitionResponse, Competition, CompetitionRepository, CompetitionMapper> implements CompetitionService {
}
