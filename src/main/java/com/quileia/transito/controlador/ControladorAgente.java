package com.quileia.transito.controlador;

import com.quileia.transito.dto.AgenteDto;
import com.quileia.transito.modelo.Agente;
import com.quileia.transito.servicio.ServicioAgente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping( "/agente" )
public class ControladorAgente {


    private final ServicioAgente servicioAgente;

    public ControladorAgente(@Autowired ServicioAgente servicioAgente) {
        this.servicioAgente = servicioAgente;
    }

    @PostMapping
    public ResponseEntity<Agente> crearAgente(@RequestBody AgenteDto agenteDto){
        return ResponseEntity.ok(servicioAgente.crear(agenteDto));

    }

    @GetMapping("/obtenerAgentes")
    public ResponseEntity<List<Agente>> obtenerAgente(){
        return ResponseEntity.ok(servicioAgente.obtenerAgentes());

    }


}
