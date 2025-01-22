package com.juandavyc.spring_boot_demo.models;

import lombok.ToString;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;

@ToString(callSuper = true) // llamar propiedades del padre
@Log
public class MindStone extends Stone {

    public MindStone(
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
        System.out.println("userPower: MindFactory " + super.toString());
    }


}
