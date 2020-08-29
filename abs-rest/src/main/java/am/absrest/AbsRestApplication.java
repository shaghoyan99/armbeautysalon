package am.absrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"am.abscomman.*","am.absrest.*"})
@EnableJpaRepositories(basePackages = {"am.abscomman.*","am.absrest.*"})
@EntityScan("am.abscommon.*")
public class AbsRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbsRestApplication.class, args);
	}

}
