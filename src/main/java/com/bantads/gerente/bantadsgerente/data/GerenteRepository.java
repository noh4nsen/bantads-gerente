package com.bantads.gerente.bantadsgerente.data;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bantads.gerente.bantadsgerente.model.Gerente;

public interface GerenteRepository extends JpaRepository<Gerente, UUID> {

}
