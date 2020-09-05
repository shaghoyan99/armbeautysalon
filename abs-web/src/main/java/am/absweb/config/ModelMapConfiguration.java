package am.absweb.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapConfiguration {

    @Bean
    public ModelMapper modelMapper () {
        return new ModelMapper();
    }
}
