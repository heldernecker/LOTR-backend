package com.lotrlcg.demo.hero;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HeroRepository extends CrudRepository<Hero, Long>{

}
