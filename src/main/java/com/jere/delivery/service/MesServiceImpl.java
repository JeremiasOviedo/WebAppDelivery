package com.jere.delivery.service;

import com.jere.delivery.dao.MesDao;
import com.jere.delivery.domain.Mes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesServiceImpl implements MesService {

    @Autowired
    private MesDao mesdao;

    @Override
    public List<Mes> listarMeses() {

        return (List<Mes>) mesdao.findAll();
    }

    @Override
    public void agregarMes(Mes mes) {

        mesdao.save(mes);
    }

    @Override
    public void eliminarMes(Mes mes) {

        mesdao.delete(mes);
    }

    @Override
    public Mes encontrarMes(Mes mes) {

        return mesdao.findById(mes.getIdMes()).orElse(null);
    }

    @Override
    public void limpiarPlanilla() {
        mesdao.deleteAll();
    }

}
