package pl.mateuszstefanski.silkroadnextgen.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
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
    @JoinColumn(name = "offer_id")
    private List<DrugOffer> offers;
}
