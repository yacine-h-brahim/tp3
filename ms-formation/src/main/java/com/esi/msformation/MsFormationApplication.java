package com.esi.msformation;

import com.esi.msformation.entities.Formation;
import com.esi.msformation.repositories.FormationRepository;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@EnableFeignClients
public class MsFormationApplication implements CommandLineRunner {

    @Resource
    FormationRepository formationRepository;

    @Resource
    RepositoryRestConfiguration repositoryRestConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(MsFormationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Formation.class);

        Formation f1=  formationRepository.save(new Formation(null, "Java",30,null));
        Formation f2=formationRepository.save(new Formation(null, "Angular",40,null));

    }
}
