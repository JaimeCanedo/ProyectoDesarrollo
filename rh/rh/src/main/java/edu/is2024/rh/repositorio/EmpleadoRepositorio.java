package edu.is2024.rh.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.is2024.rh.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
