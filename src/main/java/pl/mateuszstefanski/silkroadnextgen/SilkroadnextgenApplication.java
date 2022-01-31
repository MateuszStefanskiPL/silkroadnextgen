package pl.mateuszstefanski.silkroadnextgen;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.mateuszstefanski.silkroadnextgen.model.DrugForm;
import pl.mateuszstefanski.silkroadnextgen.model.DrugOffer;
import pl.mateuszstefanski.silkroadnextgen.model.User;
import pl.mateuszstefanski.silkroadnextgen.repository.DrugOffersRepository;
import pl.mateuszstefanski.silkroadnextgen.repository.UsersRepository;


import java.math.BigDecimal;
import java.util.Arrays;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@SpringBootApplication
public class SilkroadnextgenApplication implements CommandLineRunner {


    private final DrugOffersRepository drugOffersRepository;
    private final UsersRepository usersRepository;

    public static void main(String[] args) {
        SpringApplication.run(SilkroadnextgenApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        initData();
    }

    void initData(){
        var drugOffer_1 = DrugOffer.builder()
                .drugName("Marijuana")
                .drugDescription("If you want to relax")
                .drugForm(DrugForm.WEED)
                .pricePerGramOrOnePiece(BigDecimal.valueOf(50.00))
                .build();

        var drugOffer_2 = DrugOffer.builder()
                .drugName("Cocaine")
                .drugDescription("If you want to feel like wolf from wall street")
                .drugForm(DrugForm.POWDER)
                .pricePerGramOrOnePiece(BigDecimal.valueOf(500.00))
                .build();

        var drugOffer_3 = DrugOffer.builder()
                .drugName("Extase")
                .drugDescription("If you want to love the world")
                .drugForm(DrugForm.PILLS)
                .pricePerGramOrOnePiece(BigDecimal.valueOf(10.00))
                .build();

        var user1 = User.builder()
                .email("nonameuse@gmail.com")
                .phone("555-555-555")
                .password("secretpassword")
                .build();

        var user2 = User.builder()
                .email("shorti@o2.pl")
                .phone("500-008-856")
                .password("passss")
                .build();

        var user3 = User.builder()
                .email("maa@ass.com")
                .phone("789654123")
                .password("123asa11")
                .build();

        drugOffersRepository.saveAll(Arrays.asList(drugOffer_1,drugOffer_2,drugOffer_3));
        usersRepository.saveAll(Arrays.asList(user1,user2,user3));


    }
}
