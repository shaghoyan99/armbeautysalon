package am.absweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"am.abscomman.*","am.absweb.*"})
@EnableJpaRepositories(basePackages = {"am.abscomman.*","am.absweb.*"})
@EntityScan("am.abscommon.*")
public class AbsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbsWebApplication.class, args);
	}

}
