package com.jere.delivery.service;

import com.jere.delivery.dao.DiaDao;
import com.jere.delivery.domain.Dia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaServiceImpl implements DiaService {

    @Autowired
    private DiaDao diadao;

    @Override
    public List<Dia> listarDias() {

        return (List<Dia>) diadao.findAll();
    }

    @Override
    public void agregarDia(Dia dia) {

        diadao.save(dia);
    }

    @Override
    public void eliminarDia(Dia dia) {

        diadao.delete(dia);
    }

    @Override
    public Dia encontrarDia(Dia dia) {

        return diadao.findById(dia.getIdDia()).orElse(null);
    }

    @Override
    public void limpiarPlanilla() {
        diadao.deleteAll();
    }

}
