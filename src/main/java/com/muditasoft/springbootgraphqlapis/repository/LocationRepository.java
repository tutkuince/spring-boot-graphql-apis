package com.muditasoft.springbootgraphqlapis.repository;

import com.muditasoft.springbootgraphqlapis.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
