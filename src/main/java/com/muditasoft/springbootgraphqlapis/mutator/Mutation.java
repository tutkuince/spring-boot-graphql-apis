package com.muditasoft.springbootgraphqlapis.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.muditasoft.springbootgraphqlapis.entity.Location;
import com.muditasoft.springbootgraphqlapis.exception.LocationNotFoundException;
import com.muditasoft.springbootgraphqlapis.repository.LocationRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {

    private LocationRepository locationRepository;

    public Mutation(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location newLocation(String name, String address) {
        Location location = new Location(name, address);
        locationRepository.save(location);
        return location;
    }

    public boolean deleteLocation(Long id) {
        locationRepository.deleteById(id);
        return true;
    }

    public Location updateLocationName(String newName, Long id) {
        Optional<Location> optionalLocation =
                locationRepository.findById(id);

        if(optionalLocation.isPresent()) {
            Location location = optionalLocation.get();
            location.setName(newName);
            locationRepository.save(location);
            return location;
        } else {
            throw new LocationNotFoundException("Location Not Found", id);
        }
    }


}
