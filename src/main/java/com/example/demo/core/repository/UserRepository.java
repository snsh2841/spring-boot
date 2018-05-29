package com.example.demo.core.repository;

import com.example.demo.core.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsrLoginId(String usrLoginId);
}
