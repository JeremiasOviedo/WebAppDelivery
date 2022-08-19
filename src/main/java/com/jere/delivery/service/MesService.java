package com.jere.delivery.service;

import com.jere.delivery.domain.Mes;
import java.util.List;

public interface MesService {
    
    public List<Mes> listarMeses();
    
    public void agregarMes(Mes mes);
    
    public void eliminarMes(Mes mes);
    
    public Mes encontrarMes(Mes mes);
    
    public void limpiarPlanilla();
    
}
