package com.juandavyc.spring_boot_demo.components;

import com.github.javafaker.Faker;
import com.juandavyc.spring_boot_demo.models.Thanos;
import com.juandavyc.spring_boot_demo.services.GauntletService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@ConditionalOnClass(
        value = {
                Faker.class,
        }
) // Que tienen que existir esas clases
// Using when we depends on third libraries

public class ThanosComponent {

    private final GauntletService gauntletService;
    private final Thanos thanos;

    //@Autowired no hay necesidad pues ya esta autowired.

    public ThanosComponent(
            GauntletService gauntletService,
            Thanos thanos

    ) {
        this.gauntletService = gauntletService;
        this.thanos = thanos;
    }

    @PostConstruct
    public void init(){
        log.info("Loading thanos whit configs: {}",thanos);
    }

    public void snap() {

        final var faker = new Faker();
        final var country = faker.country().name();

        log.info("Thanos used the gauntlet to perform snap in {}", country);

        this.gauntletService.useFullPower();

        final var impactPoint = faker.random().nextInt(1000);

        log.info("Thanos performed a attack of {} points", impactPoint);


    }


}
