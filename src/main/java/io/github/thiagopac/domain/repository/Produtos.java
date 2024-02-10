package io.github.thiagopac.domain.repository;

import io.github.thiagopac.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
