package com.Ejercicio3.repository;

import com.Ejercicio3.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Laptoprepository extends JpaRepository<Laptop, Long> {
}
