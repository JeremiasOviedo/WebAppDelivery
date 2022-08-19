package com.jere.delivery.service;

import com.jere.delivery.domain.Viaje;
import java.util.List;

public interface ViajeService {
    
    public List<Viaje> listarViajes();
    
    public void agregarViaje(Viaje viaje);
    
    public void eliminarViaje(Viaje viaje);
    
    public void limpiarPlanilla();
    
    public Viaje encontrarViaje(Viaje viaje);
}
