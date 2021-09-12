package ru.tcreator.boot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.tcreator.boot.profile.SystemProfile;
import ru.tcreator.boot.profile.settings.DevProfile;
import ru.tcreator.boot.profile.settings.ProductionProfile;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(prefix = "tcreator.profile", name = "dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "tcreator.profile", name = "dev", havingValue = "false")
    public SystemProfile productionProfile() {
        return new ProductionProfile();
    }
}
