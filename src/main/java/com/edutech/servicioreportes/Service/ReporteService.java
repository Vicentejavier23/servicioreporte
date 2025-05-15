package com.edutech.servicioreportes.Service;


import com.edutech.servicioreportes.Model.Reporte;
import com.edutech.servicioreportes.Repository.ReporteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteService {
    private final ReporteRepository repo;

    public ReporteService(ReporteRepository repo) {
        this.repo = repo;
    }

    public List<Reporte> listar() {
        return repo.findAll();
    }

    public Reporte guardar(Reporte reporte) {
        return repo.save(reporte);
    }
}
