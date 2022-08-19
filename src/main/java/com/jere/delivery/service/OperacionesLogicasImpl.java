package com.jere.delivery.service;

import com.jere.delivery.domain.Dia;
import com.jere.delivery.domain.Viaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperacionesLogicasImpl implements OperacionesLogicas {

    //Estas son operaciones basicas, que requieren de un solo dato/accion.
    @Autowired
    private ViajeService viajeservice;

    @Autowired
    private DiaService diaservice;

    @Override
    public int calcularMonto() {
        int montoTotal = 0;

        Viaje viaje;
        List<Viaje> viajes = viajeservice.listarViajes();

        for (int i = 0; i < viajes.size(); i++) {
            viaje = viajes.get(i);

            montoTotal += viaje.getMontoDelPedido();
        }

        return montoTotal;
    }

    @Override
    public int calcularGananciasDelDia() {
        int ganancias = 0;

        Viaje viaje;
        List<Viaje> viajes = viajeservice.listarViajes();

        for (int i = 0; i < viajes.size(); i++) {
            viaje = viajes.get(i);

            ganancias += viaje.getValorDelViaje();
        }

        return ganancias;
    }

    @Override
    public int calcularCantidadDeViajes() {
        List<Viaje> viajes = viajeservice.listarViajes();
        return viajes.size();

    }

    @Override
    public int calcularGananciasMensuales() {
        int gananciasMensuales = 0;

        Dia dia;
        List<Dia> dias = diaservice.listarDias();

        for (int i = 0; i < dias.size(); i++) {

            dia = dias.get(i);

            gananciasMensuales += dia.getGananciasDelDia();

        }

        return gananciasMensuales;
    }

    @Override
    public int calcularCantidadDeDias() {

        List<Dia> dias = diaservice.listarDias();

        return dias.size();
    }
}
