package com.jere.delivery.service;

import com.jere.delivery.domain.Dia;
import com.jere.delivery.domain.Mes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperacionesCombinadasImpl implements OperacionesCombinadas {

    @Autowired
    private ViajeService viajeservice;
    @Autowired
    private DiaService diaservice;
    @Autowired
    private MesService messervice;

    @Override
    public void cerrarDia(Dia dia) {

        diaservice.agregarDia(dia);
        System.out.println("Dia agregado correctamente");
        viajeservice.limpiarPlanilla();
        System.out.println("Se limpio la planilla de viajes");

    }

    @Override
    public void cerrarMes(Mes mes) {

        messervice.agregarMes(mes);
        System.out.println("Mes agregado correctamente");
        diaservice.limpiarPlanilla();
        System.out.println("Se limpio la planilla de dias");

    }

}
