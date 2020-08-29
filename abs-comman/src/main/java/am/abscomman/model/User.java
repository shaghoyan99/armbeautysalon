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
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String mainPhoto;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Pictures> pictures;
    @OneToMany(fetch = FetchType.LAZY)
    private List<WorkTime> workTime;
    @Enumerated(value = EnumType.STRING)
    @Column(columnDefinition = "enum('MALE','FEMALE')")
    private Gender gender;
    @Enumerated(value = EnumType.STRING)
    @Column(columnDefinition = "enum('ADMIN','MANAGER','USER')")
    private Role role;
    private String city;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;




}
