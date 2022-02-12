package com.amiroshnikov.fromJSONtoDB.repository;

import com.amiroshnikov.fromJSONtoDB.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
