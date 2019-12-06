package com.muditasoft.springbootgraphqlapis.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.muditasoft.springbootgraphqlapis.entity.Dog;
import com.muditasoft.springbootgraphqlapis.exception.DogNotFoundException;
import com.muditasoft.springbootgraphqlapis.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DogMutation implements GraphQLMutationResolver {

    private final DogRepository dogRepository;

    public DogMutation(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Boolean deleteDogBreed(String breed) {
        List<Dog> dogList = dogRepository.findAll();

        for (Dog dog: dogList) {
            if (dog.getBreed().equals(breed)) {
                dogRepository.delete(dog);
                return true;
            }
        }
        return false;
    }

    public Dog updateDogName(String newName, Long id) {
        Optional<Dog> optionalDog = dogRepository.findById(id);

        if (optionalDog.isPresent()) {
            Dog dog = optionalDog.get();

            // Set new name to dog
            dog.setName(newName);
            dogRepository.save(dog);
            return dog;
        } else {
            throw new DogNotFoundException("Dog Not Found", id);
        }

    }
}
