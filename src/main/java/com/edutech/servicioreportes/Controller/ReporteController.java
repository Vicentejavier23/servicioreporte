package com.edutech.servicioreportes.Controller;

import com.edutech.servicioreportes.Model.Reporte;
import com.edutech.servicioreportes.Service.ReporteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    private final ReporteService servicio;

    public ReporteController(ReporteService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Reporte> obtenerTodos() {
        return servicio.listar();
    }

    @PostMapping
    public Reporte crear(@RequestBody Reporte reporte) {
        return servicio.guardar(reporte);
    }
}
