package am.abscomman.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(fetch = FetchType.LAZY)
    private List<User> manager;
    private Date date;
    private String time;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Service> services;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Hairdresser> hairdressers;
    @OneToMany(fetch = FetchType.LAZY)
    private List<User> users;
    private String phoneNumber;
}
