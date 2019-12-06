package com.muditasoft.springbootgraphqlapis.repository;

import com.muditasoft.springbootgraphqlapis.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
