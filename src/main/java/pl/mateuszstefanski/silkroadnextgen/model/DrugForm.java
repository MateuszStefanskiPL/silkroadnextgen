package pl.mateuszstefanski.silkroadnextgen.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DrugForm {
    WEED("Weed"),
    HASHISH("Hashish"),
    PILLS("Pills"),
    CAPSULES("Capsules"),
    POWDER("Powder"),
    OTHER("Other");

    private String drugForm;



}
