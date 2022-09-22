package com.example.film.reposotori;

import com.example.film.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepo extends MongoRepository<User, String> {
    @Query("{name:'?0'}")
    User findItemByName(String name);
}
