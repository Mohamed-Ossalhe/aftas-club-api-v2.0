package ma.youcode.aftasclubapiv2.services.implementations;

import ma.youcode.aftasclubapiv2.dto.requests.UserRequest;
import ma.youcode.aftasclubapiv2.dto.responses.UserResponse;
import ma.youcode.aftasclubapiv2.entities.User;
import ma.youcode.aftasclubapiv2.mapper.UserMapper;
import ma.youcode.aftasclubapiv2.repositories.UserRepository;
import ma.youcode.aftasclubapiv2.services.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl extends AbstractServiceImpl<UUID, UserRequest, UserResponse, User, UserRepository, UserMapper> implements UserService {
}
