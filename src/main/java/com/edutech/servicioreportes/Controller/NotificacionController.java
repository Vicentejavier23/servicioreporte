package com.edutech.servicioreportes.Controller;

import com.edutech.servicioreportes.Model.Notificacion;
import com.edutech.servicioreportes.Service.NotificacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {

    private final NotificacionService servicio;

    public NotificacionController(NotificacionService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Notificacion> obtenerTodas() {
        return servicio.listar();
    }

    @PostMapping
    public Notificacion enviar(@RequestBody Notificacion notificacion) {
        return servicio.enviar(notificacion);
    }
}
