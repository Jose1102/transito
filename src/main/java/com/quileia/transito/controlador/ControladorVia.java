package com.quileia.transito.controlador;

import com.quileia.transito.dto.ViaDto;
import com.quileia.transito.modelo.Agente;
import com.quileia.transito.modelo.Via;
import com.quileia.transito.servicio.ServicioVia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/via" )
public class ControladorVia {

    private final ServicioVia servicioVia;

    public ControladorVia(@Autowired ServicioVia servicioVia){
        this.servicioVia = servicioVia;

    }
    @PostMapping
    public ResponseEntity<Via> crearVia(@RequestBody ViaDto viaDto){
        return ResponseEntity.ok(servicioVia.crearVia(viaDto));

    }

    @GetMapping("/obtenerVias")
    public ResponseEntity<List<Via>> getZones(){
        return ResponseEntity.ok(servicioVia.obtenerVias());

    }
}
