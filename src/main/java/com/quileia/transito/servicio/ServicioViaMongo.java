package com.quileia.transito.servicio;

import com.quileia.transito.dto.ViaDto;
import com.quileia.transito.modelo.Via;
import com.quileia.transito.repositorio.RepositorioAgente;
import com.quileia.transito.repositorio.RepositorioVia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioViaMongo implements ServicioVia{

    private final RepositorioVia repositorioVia;


    public ServicioViaMongo( @Autowired RepositorioVia repositorioVia) {
        this.repositorioVia = repositorioVia;
    }

    @Override
    public Via crearVia(ViaDto viaDto) {
        return repositorioVia.save( new Via(viaDto));
    }

    @Override
    public List<Via> obtenerVias() {
        return repositorioVia.findAll();
    }
}
