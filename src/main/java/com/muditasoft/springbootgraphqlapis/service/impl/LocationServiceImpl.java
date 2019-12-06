package com.muditasoft.springbootgraphqlapis.service.impl;

import com.muditasoft.springbootgraphqlapis.entity.Location;
import com.muditasoft.springbootgraphqlapis.repository.LocationRepository;
import com.muditasoft.springbootgraphqlapis.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> retrieveLocations() {
        return locationRepository.findAll();
    }
}
