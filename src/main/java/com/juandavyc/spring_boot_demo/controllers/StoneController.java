package com.juandavyc.spring_boot_demo.controllers;

import com.juandavyc.spring_boot_demo.models.PowerStone;
import com.juandavyc.spring_boot_demo.models.Stone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Slf4j
public class StoneController {


    private Stone stone;

    @Autowired
    public StoneController(
            @Qualifier("power") Stone stone
    ){
        this.stone = stone;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public Stone getStone(){
        log.info("getStone - run");
        return this.stone;
    }

}