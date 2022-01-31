package pl.mateuszstefanski.silkroadnextgen.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mateuszstefanski.silkroadnextgen.dto.DrugOfferDto;
import pl.mateuszstefanski.silkroadnextgen.mapper.DrugOffersMapper;
import pl.mateuszstefanski.silkroadnextgen.service.DrugOffersService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/drugffers")
public class DrugOffersController {

    private DrugOffersService drugOffersService;
    private DrugOffersMapper drugOffersMapper;

    @GetMapping
    List<DrugOfferDto> getOffers(){
        var drugOffers = drugOffersService.getAllOffers();
        return drugOffersMapper.map(drugOffers);
    }
}
