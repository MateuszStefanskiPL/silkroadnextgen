package pl.mateuszstefanski.silkroadnextgen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mateuszstefanski.silkroadnextgen.model.DrugOffer;

@Repository
public interface DrugOffersRepository extends JpaRepository<DrugOffer, Long> {
}
