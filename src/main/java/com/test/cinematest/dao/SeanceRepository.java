package com.test.cinematest.dao;

import com.test.cinematest.model.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepository extends MongoRepository<Seance, String> {
}
