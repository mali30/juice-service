package com.mohamedali.msscjuiceservice.bootstrap;

import com.mohamedali.msscjuiceservice.domain.JuiceEntity;
import com.mohamedali.msscjuiceservice.repositories.JuiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

// want it run on startup of application
// will run each time spring context starts
@Component
public class JuiceLoader implements CommandLineRunner {

    // will get injected by spring repository jpa
    private final JuiceRepository juiceRepository;

    public JuiceLoader(JuiceRepository juiceRepository) {
        this.juiceRepository = juiceRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadJuiceObjects();
    }

    private void loadJuiceObjects() {
        if(juiceRepository.count() == 0){
            juiceRepository
                    .save(JuiceEntity.builder()
            .juiceName("Orange Juice")
            .juiceStyle("Orange Company")
                            .upc("1234")
                            .price(BigDecimal.valueOf(222.34))
                            .minOnHand(40)
                            .build());

            juiceRepository
                    .save(JuiceEntity.builder()
                            .juiceName("Apple Juice")
                            .juiceStyle("Apple Company")
                            .upc("1234")
                            .price(BigDecimal.valueOf(100.00))
                            .minOnHand(100)
                            .build());
        }

        System.out.println("Loading Juice" + juiceRepository.count());
    }


}
