package com.lotrlcg.demo.score;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ScoreRepository extends CrudRepository<Score, Long> {

}
