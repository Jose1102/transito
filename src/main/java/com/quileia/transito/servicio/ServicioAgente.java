package com.quileia.transito.servicio;

import com.quileia.transito.dto.AgenteDto;
import com.quileia.transito.modelo.Agente;

import java.util.List;

public interface ServicioAgente {
    Agente crear(AgenteDto agenteDto);

    List<Agente> obtenerAgentes();
}
