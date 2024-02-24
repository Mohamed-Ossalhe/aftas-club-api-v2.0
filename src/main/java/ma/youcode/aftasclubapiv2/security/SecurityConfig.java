package ma.youcode.aftasclubapiv2.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.util.List;
/**
 * Configuration class for Spring Security settings.
 * This class configures the security aspects of the application, including CORS settings,
 * CSRF protection, session management, authentication providers, and JWT filter integration.
 * It also defines the security filter chain that specifies which requests are secured and how.
 *
 * @author Mohamed Ossalhe
 */
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableMethodSecurity
public class SecurityConfig {
}
