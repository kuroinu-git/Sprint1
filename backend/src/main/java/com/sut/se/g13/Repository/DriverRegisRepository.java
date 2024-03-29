package com.sut.se.g13.Repository;

import com.sut.se.g13.Entity.DriverRegis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DriverRegisRepository extends JpaRepository<DriverRegis, Long> {
    DriverRegis findByDriverregisid(long driverregisid);
}