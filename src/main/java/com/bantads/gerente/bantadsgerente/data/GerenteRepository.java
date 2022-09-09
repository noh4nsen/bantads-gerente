package com.bantads.gerente.bantadsgerente.data;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bantads.gerente.bantadsgerente.model.Gerente;

public interface GerenteRepository extends JpaRepository<Gerente, UUID> {
    public Gerente findByIdExternoUsuario(UUID idExternoUsuario);

    @Transactional
    public Long deleteBySaga(UUID saga);
}
