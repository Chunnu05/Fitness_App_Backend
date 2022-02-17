package com.fitness.app.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.fitness.app.entity.VenderUser;

@EnableMongoRepositories
@Repository
public interface RegisterRepository  extends  MongoRepository<VenderUser,String>{

	public VenderUser findByEmail(String email);
}


//JpaRepository<VenderUser, Long>