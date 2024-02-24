package ma.youcode.aftasclubapiv2.services.implementations;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.youcode.aftasclubapiv2.dto.requests.AuthenticationRequest;
import ma.youcode.aftasclubapiv2.dto.requests.UserRequest;
import ma.youcode.aftasclubapiv2.dto.responses.AuthenticationResponse;
import ma.youcode.aftasclubapiv2.entities.User;
import ma.youcode.aftasclubapiv2.enums.UserRole;
import ma.youcode.aftasclubapiv2.services.AuthenticationService;

import java.io.IOException;

public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public AuthenticationResponse register(UserRequest request) {
        return createNewUser(request, UserRole.MEMBER);
    }

    @Override
    public AuthenticationResponse registerJury(UserRequest request) {
        return createNewUser(request, UserRole.JURY);
    }

    @Override
    public AuthenticationResponse registerMember(UserRequest request) {
        return createNewUser(request, UserRole.MEMBER);
    }

    @Override
    public AuthenticationResponse registerAdmin(UserRequest request) {
        return createNewUser(request, UserRole.ADMIN);
    }

    @Override
    public AuthenticationResponse createNewUser(UserRequest request, UserRole role) {
        return null;
    }

    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        return null;
    }

    @Override
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    public Boolean checkToken(String token) {
        return null;
    }
}
