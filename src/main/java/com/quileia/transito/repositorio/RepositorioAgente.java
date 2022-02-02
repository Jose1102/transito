package com.quileia.transito.repositorio;

import com.quileia.transito.modelo.Agente;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioAgente extends MongoRepository<Agente, Integer> {
}
