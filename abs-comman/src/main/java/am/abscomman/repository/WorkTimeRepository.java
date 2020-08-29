package am.abscomman.repository;

import am.abscomman.model.Hairdresser;
import am.abscomman.model.WorkTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkTimeRepository extends JpaRepository<WorkTime,Integer> {

}
