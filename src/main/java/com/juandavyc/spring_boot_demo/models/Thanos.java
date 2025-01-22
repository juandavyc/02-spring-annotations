package com.juandavyc.spring_boot_demo.models;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "thanos.config") // tienen que coincidir sufijo es despues
@AllArgsConstructor
@Data // setter getter tostring
@NoArgsConstructor

public class Thanos {

    private String planet;
    private String galaxy;
    private Integer destructionLevel;

}
