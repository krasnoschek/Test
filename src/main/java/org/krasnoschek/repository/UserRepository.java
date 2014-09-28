package org.krasnoschek.repository;


import org.krasnoschek.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String>{

    List<User> findByUserName(String username);
}
