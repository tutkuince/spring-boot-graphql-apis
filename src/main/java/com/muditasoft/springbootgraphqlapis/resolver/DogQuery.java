package com.muditasoft.springbootgraphqlapis.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.muditasoft.springbootgraphqlapis.entity.Dog;
import com.muditasoft.springbootgraphqlapis.exception.DogNotFoundException;
import com.muditasoft.springbootgraphqlapis.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class DogQuery implements GraphQLQueryResolver {

    private final DogRepository dogRepository;

    public DogQuery(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Iterable<Dog> findAllDogs() {
        return dogRepository.findAll();
    }

    public Dog findDogById(Long id) {
        Optional<Dog> dog = dogRepository.findById(id);

        if (dog.isPresent()) {
            return dog.get();
        } else {
            throw new DogNotFoundException("Dog Not Found: ", id);
        }
    }
}
