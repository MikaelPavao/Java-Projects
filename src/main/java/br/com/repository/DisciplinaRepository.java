package br.com.repository;

import br.com.entity.Disciplina;
import br.com.entity.enuns.DisciplinasEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Repository
@Transactional
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    @Query(value = "SELECT D FROM Disciplina D WHERE D.nome IN (:disciplinasEnum)")
    Set<Disciplina> findByNomeDisciplina(@Param(value = "disciplinasEnum") List<DisciplinasEnum> disciplinasEnum);
}
