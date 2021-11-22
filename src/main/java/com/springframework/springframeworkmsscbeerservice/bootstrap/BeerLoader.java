package com.springframework.springframeworkmsscbeerservice.bootstrap;

import com.springframework.springframeworkmsscbeerservice.domain.Beer;
import com.springframework.springframeworkmsscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0){
             beerRepository.save(Beer.builder()
                     .beerName("Strom")
                     .beerStyle("IPA")
                     .quantityToBrew(200)
                     .minOnHand(12)
                     .upc(3333300054L)
                     .price(new BigDecimal("150"))
                     .build());


        }


        System.out.println("Load Beers" + beerRepository.count());
    }
}
