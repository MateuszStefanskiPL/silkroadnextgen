package pl.mateuszstefanski.silkroadnextgen.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class DrugOffer {

    @Id
    @Access(AccessType.PROPERTY)
    @GeneratedValue
    @Column(name = "offer_id")
    private Long drugOfferId;

    @Column(name = "name")
    private String drugName;

    private String drugDescription;

    @Enumerated(EnumType.STRING)
    private DrugForm drugForm;

    @Column(name = "weight/quantity")
    private Double drugWeightOrQuantity;

    @Column(name = "price")
    private BigDecimal pricePerGramOrOnePiece;




}
