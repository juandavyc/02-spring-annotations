package com.juandavyc.spring_boot_demo.services;

import com.juandavyc.spring_boot_demo.models.*;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@Getter
@Slf4j
@ConditionalOnBean(value = { // similar ConditionalOnClass
        MindStone.class,
        SpaceStone.class,
        PowerStone.class,
        RealityStone.class,
        SoulStone.class,
        TimeStone.class
}) // value=MindStone.class // name="mind" // no continuara no tenga el bean o los beans
public class GauntletServiceImpl implements com.juandavyc.spring_boot_demo.services.GauntletService {


    private final Stone mind;
    private final Stone space;
    private final Stone power;
    private final Stone reality;
    private final Stone soul;
    private final Stone time;

    @Autowired
    public GauntletServiceImpl(
            @Qualifier("mind") Stone mind,
            @Qualifier("space") Stone space,
            @Qualifier("power") Stone power,
            @Qualifier("reality") Stone reality,
            @Qualifier("soul") Stone soul,
            @Qualifier("time") Stone time

    ) {
        this.mind = mind;
        this.space = space;
        this.power = power;
        this.reality = reality;
        this.soul = soul;
        this.time = time;
    }

    @Override
    public void useGauntlet(String stoneName) {

        switch (stoneName) {
            case "mind" -> log.info("useStone: " + this.mind);
            case "space" ->  log.info("useStone: " + this.space);
            case "power" -> log.info("useStone: " + this.power);
            case "reality" -> log.info("useStone: " + this.reality);
            case "soul" -> log.info("useStone: " + this.soul);
            case "time" -> log.info("useStone: " + this.time);
            default -> throw new IllegalArgumentException("invalid name");
        }

    }

    @Override
    public void useFullPower() {

        if (this.space != null &&
                this.mind != null &&
                this.power != null &&
                this.reality != null &&
                this.soul != null &&
                this.time != null) {

           log.info("USING 'ALL' POWER");

        } else {
            throw new IllegalStateException("Cant be use full power because this need all stones");
        }
    }

}