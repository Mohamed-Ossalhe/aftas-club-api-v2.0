package ma.youcode.aftasclubapiv2.services.implementations;

import ma.youcode.aftasclubapiv2.dto.requests.HuntRequest;
import ma.youcode.aftasclubapiv2.dto.responses.HuntResponse;
import ma.youcode.aftasclubapiv2.entities.Hunting;
import ma.youcode.aftasclubapiv2.mapper.HuntingMapper;
import ma.youcode.aftasclubapiv2.repositories.HuntingRepository;
import ma.youcode.aftasclubapiv2.services.HuntingService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HuntingServiceImpl extends AbstractServiceImpl<UUID, HuntRequest, HuntResponse, Hunting, HuntingRepository, HuntingMapper> implements HuntingService
{
}
