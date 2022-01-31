package pl.mateuszstefanski.silkroadnextgen.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mateuszstefanski.silkroadnextgen.model.DrugOffer;
import pl.mateuszstefanski.silkroadnextgen.repository.DrugOffersRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DrugOffersService {

    private DrugOffersRepository drugOffersRepository;

    public List<DrugOffer> getAllOffers(){
       return drugOffersRepository.findAll();
    }
}
