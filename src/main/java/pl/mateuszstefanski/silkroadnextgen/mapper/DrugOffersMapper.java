package pl.mateuszstefanski.silkroadnextgen.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import pl.mateuszstefanski.silkroadnextgen.dto.DrugOfferDto;
import pl.mateuszstefanski.silkroadnextgen.model.DrugOffer;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DrugOffersMapper {

        List<DrugOfferDto> map(List<DrugOffer> source);

        DrugOfferDto map(DrugOffer source);

        @AfterMapping
        default void afterDrugOfferToDto(DrugOffer source, @MappingTarget DrugOfferDto target){
            target.setDrugName(source.getDrugName());
            target.setDrugDescription(source.getDrugDescription());
            target.setDrugForm(source.getDrugForm());
            target.setPrice(source.getPricePerGramOrOnePiece());
        }


}
