package com.juandavyc.spring_boot_demo.models;

import lombok.ToString;
import lombok.extern.java.Log;

@ToString(callSuper = true)

public class RealityStone extends Stone {


    public RealityStone(
            String color,
            String name,
            String location,
            Integer energyLevel
    ) {
        super(color, name, location, energyLevel);
    }

    @Override
    public void usePower() {
        System.out.println("userPower: RealityStone "+super.toString());
    }
}
