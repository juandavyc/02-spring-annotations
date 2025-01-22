package com.juandavyc.spring_boot_demo.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;


@ToString(callSuper = true)
@Log
@Setter
@Getter

public class PowerStone extends Stone {

    public PowerStone(
            String color,
            String name,
            String location,
            Integer energyLevel
    ) {
        super(color, name, location, energyLevel);
    }

    @Override
    public void usePower() {
        // Business logic
        System.out.println("Increase power and energy: " + super.toString());
    }


}