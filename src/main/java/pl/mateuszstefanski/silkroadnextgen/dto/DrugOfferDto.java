package pl.mateuszstefanski.silkroadnextgen.dto;

import lombok.Data;
import pl.mateuszstefanski.silkroadnextgen.model.DrugForm;

import javax.validation.constraints.Digits;
import java.math.BigDecimal;

@Data
public class DrugOfferDto {

    private String drugName;

    private String drugDescription;

    private DrugForm drugForm;


    @Digits(integer = 10, fraction = 2)
    private BigDecimal price;
}
