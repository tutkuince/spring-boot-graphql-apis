package com.muditasoft.springbootgraphqlapis.service;

import com.muditasoft.springbootgraphqlapis.entity.Location;

import java.util.List;

public interface LocationService {
    List<Location> retrieveLocations();
}
