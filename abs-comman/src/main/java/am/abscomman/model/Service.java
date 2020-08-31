package am.abscomman.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "services")
//
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private double price;
    private String userTypeService;
    @OneToMany(fetch = FetchType.LAZY)
    private List<User> manager;
    @ManyToMany(mappedBy = "services", fetch = FetchType.LAZY)
    private List<Hairdresser> hairdressers ;



}
