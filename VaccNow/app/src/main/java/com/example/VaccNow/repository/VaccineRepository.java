package com.example.VaccNow.repository;

import com.example.VaccNow.model.Branch;
import com.example.VaccNow.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine,Integer> {
}
