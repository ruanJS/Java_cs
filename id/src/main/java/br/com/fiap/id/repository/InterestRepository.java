package br.com.fiap.id.repository;

import br.com.fiap.id.model.Interest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterestRepository extends JpaRepository<Interest, Long> {
    // não precisa implementar os métodos findById, save, findAll e deleteById,
    // pois eles já são fornecidos pelo JpaRepository
}
