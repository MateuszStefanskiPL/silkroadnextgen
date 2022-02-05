package pl.mateuszstefanski.silkroadnextgen.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String phone;
    private String password;

    @OneToMany
    private List<DrugOffer> offers;

}
