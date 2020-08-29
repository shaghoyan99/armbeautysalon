package am.abscomman.repository;

import am.abscomman.model.Hairdresser;
import am.abscomman.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HairdresserRepository extends JpaRepository<Hairdresser,Integer> {

}
