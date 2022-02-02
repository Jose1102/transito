package com.quileia.transito.servicio;

import com.quileia.transito.dto.ViaDto;
import com.quileia.transito.modelo.Via;

import java.util.List;

public interface ServicioVia {

    Via crearVia(ViaDto viaDto);

    List<Via> obtenerVias();
}
