package com.desafio.desafiob2w;

import com.desafio.desafiob2w.repository.IPlanetDataAccess;
import com.desafio.desafiob2w.resource.PlanetResource;
import com.desafio.desafiob2w.service.PlanetService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = {PlanetResource.class, PlanetService.class, IPlanetDataAccess.class})
@EnableMongoRepositories(basePackageClasses = IPlanetDataAccess.class)
        public class DesafioB2wApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
			SpringApplication.run(DesafioB2wApplication.class, args);

		for (String name: applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}

