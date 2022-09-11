package com.bantads.gerente.bantadsgerente.data;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bantads.gerente.bantadsgerente.model.Gerente;

public interface GerenteRepository extends JpaRepository<Gerente, UUID> {
    public Gerente findByIdExternoUsuario(UUID idExternoUsuario);
    public Gerente findByCpf(String cpf);
    @Transactional
    public Long deleteBySaga(UUID saga);
    @Query("from Gerente where cpf = :cpf and id != :id")
	public Optional<Gerente> findByLoginAndSenha(@Param("cpf") String cpf, @Param("id") UUID id);
}
