package br.com.repository;

import br.com.entity.Campus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CampusRepository extends JpaRepository<Campus, Long> {
}
