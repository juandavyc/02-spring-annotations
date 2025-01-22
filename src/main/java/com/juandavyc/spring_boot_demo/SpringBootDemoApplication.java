package com.juandavyc.spring_boot_demo;

import com.juandavyc.spring_boot_demo.components.ThanosComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {


    //
//	@Autowired
//	ObjectMapper objectMapper;
//
//	@Autowired
//	PowerStone stone;

    // @Value(value = "${spring.application.name:defaultValue}")

//    @Value("${server.port}")
//    private String value;



    @Autowired
    private ThanosComponent thanos;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//		String myJSON = objectMapper.writeValueAsString(stone);
//		System.out.println(myJSON);
//      System.out.println(//value);

        thanos.snap();
    }
}
