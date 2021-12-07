package com.Ejercicio2.repository;

import com.Ejercicio2.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Laptoprepository extends JpaRepository<Laptop, Long> {
}
