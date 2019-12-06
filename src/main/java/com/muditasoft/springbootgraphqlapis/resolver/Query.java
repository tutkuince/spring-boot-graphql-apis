package com.muditasoft.springbootgraphqlapis.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.muditasoft.springbootgraphqlapis.entity.Location;
import com.muditasoft.springbootgraphqlapis.repository.LocationRepository;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private LocationRepository locationRepository;

    public Query(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Iterable<Location> findAllLocations() {
        return locationRepository.findAll();
    }
}
