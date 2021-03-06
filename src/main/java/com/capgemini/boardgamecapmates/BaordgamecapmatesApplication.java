package com.capgemini.boardgamecapmates;

/** Profiles and rankings
 * @author Artur Szaniawski
 *  * @version 1.0
 * 
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@SpringBootApplication
public class BaordgamecapmatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaordgamecapmatesApplication.class, args);

	}
}
