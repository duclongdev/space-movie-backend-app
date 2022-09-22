package com.example.film;

import com.example.film.model.User;
import com.example.film.reposotori.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class FilmApplication implements CommandLineRunner {
    @Autowired
    FilmRepo filmRepo;
    public static void main(String[] args) {
        SpringApplication.run(FilmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        filmRepo.save(new User("dasdas", "Nguyen duc long"));
//        filmRepo.save(new User("dasdas", "Nguyen duc long"));

    }
}
