package com.example.Repository;

import com.example.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Object> findByName(String name);
}
