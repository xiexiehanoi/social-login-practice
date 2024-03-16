package login.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "social-login.google")
@PropertySource(value = "classpath:application.yml")
public class GoogleLoginConfig {
    private String clientId;
    private String clientSecret;
    private String redirectUri;
}