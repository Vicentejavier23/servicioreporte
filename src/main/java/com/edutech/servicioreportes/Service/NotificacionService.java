package com.edutech.servicioreportes.Service;


import com.edutech.servicioreportes.Model.Notificacion;
import com.edutech.servicioreportes.Repository.NotificacionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificacionService {
    private final NotificacionRepository repo;

    public NotificacionService(NotificacionRepository repo) {
        this.repo = repo;
    }

    public List<Notificacion> listar() {
        return repo.findAll();
    }

    public Notificacion enviar(Notificacion notificacion) {
        notificacion.setEnviadaEn(LocalDateTime.now());
        return repo.save(notificacion);
    }
}
