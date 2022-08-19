package com.jere.delivery.service;

import com.jere.delivery.domain.Dia;
import java.util.List;

public interface DiaService {
    
    public List<Dia> listarDias();
    
    public void agregarDia(Dia dia);
    
    public void eliminarDia(Dia dia);
    
    public Dia encontrarDia(Dia dia);
    
    public void limpiarPlanilla();
}
