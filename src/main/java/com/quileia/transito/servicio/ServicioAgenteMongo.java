package com.quileia.transito.servicio;

import com.quileia.transito.dto.AgenteDto;
import com.quileia.transito.modelo.Agente;
import com.quileia.transito.repositorio.RepositorioAgente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioAgenteMongo implements ServicioAgente{


    private final RepositorioAgente repositorioAgente;


    public ServicioAgenteMongo( @Autowired RepositorioAgente repositorioAgente) {
        this.repositorioAgente = repositorioAgente;
    }

    @Override
    public Agente crear(AgenteDto agenteDto) {
        return repositorioAgente.save( new Agente(agenteDto));
    }

    @Override
    public List<Agente> obtenerAgentes() {
        return repositorioAgente.findAll();
    }


}
