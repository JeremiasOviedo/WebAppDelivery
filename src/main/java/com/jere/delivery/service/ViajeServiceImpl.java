package com.jere.delivery.service;

import com.jere.delivery.dao.ViajeDao;
import com.jere.delivery.domain.Viaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViajeServiceImpl implements ViajeService {

    @Autowired
    private ViajeDao viajedao;

    @Override
    public List<Viaje> listarViajes() {

        return (List<Viaje>) viajedao.findAll();
    }

    @Override
    public void agregarViaje(Viaje viaje) {
        viajedao.save(viaje);
    }

    @Override
    public void eliminarViaje(Viaje viaje) {
        viajedao.delete(viaje);
    }

    @Override
    public void limpiarPlanilla() {
        viajedao.deleteAll();
    }

    @Override
    public Viaje encontrarViaje(Viaje viaje) {

        return viajedao.findById(viaje.getIdViaje()).orElse(null);
    }

}
