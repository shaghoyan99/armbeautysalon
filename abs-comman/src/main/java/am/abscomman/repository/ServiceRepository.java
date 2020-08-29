package am.abscomman.repository;

import am.abscomman.model.Service;
import am.abscomman.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Integer> {

}
