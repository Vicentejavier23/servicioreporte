package com.edutech.servicioreportes.Repository;


import com.edutech.servicioreportes.Model.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
}
