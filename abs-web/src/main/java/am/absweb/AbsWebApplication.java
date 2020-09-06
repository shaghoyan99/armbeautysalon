package am.absweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@ComponentScan({"am.abscomman.*","am.absweb.*"})
@EnableJpaRepositories(basePackages = {"am.abscomman.*","am.absweb.*"})
@EntityScan("am.abscomman.*")
public class AbsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbsWebApplication.class, args);
	}

}
