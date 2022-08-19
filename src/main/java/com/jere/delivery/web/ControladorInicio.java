package com.jere.delivery.web;

import com.jere.delivery.domain.Dia;
import com.jere.delivery.domain.Mes;
import com.jere.delivery.domain.Viaje;
import com.jere.delivery.service.DiaService;
import com.jere.delivery.service.MesService;
import com.jere.delivery.service.OperacionesCombinadas;
import com.jere.delivery.service.OperacionesLogicas;
import com.jere.delivery.service.ViajeService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private ViajeService viajeservice;

    @Autowired
    private DiaService diaservice;

    @Autowired
    private MesService messervice;
    @Autowired
    private OperacionesLogicas operaciones;

    @Autowired
    private OperacionesCombinadas operacionescombinadas;

    @GetMapping("/")
    public String inicio(Model model) {

        List<Viaje> viajes = viajeservice.listarViajes();
        List<Dia> dias = diaservice.listarDias();
        List<Mes> meses = messervice.listarMeses();
        int cantidadDeViajes = operaciones.calcularCantidadDeViajes();
        int gananciasDelDia = operaciones.calcularGananciasDelDia();
        int montoAPagar = operaciones.calcularMonto();
        int cantidadDeDias = operaciones.calcularCantidadDeDias();
        int gananciasDelMes = operaciones.calcularGananciasMensuales();

        model.addAttribute("viajes", viajes);
        model.addAttribute("dias", dias);
        model.addAttribute("meses", meses);
        model.addAttribute("cantidadDeViajes", cantidadDeViajes);
        model.addAttribute("gananciasDelDia", gananciasDelDia);
        model.addAttribute("montoAPagar", montoAPagar);
        model.addAttribute("cantidadDeDias", cantidadDeDias);
        model.addAttribute("gananciasDelMes", gananciasDelMes);

        return "index";
    }

    @PostMapping("/agregarViaje")
    public String agregarViaje(Model model, Viaje viaje) {

        viajeservice.agregarViaje(viaje);

        return "redirect:/";
    }

    @GetMapping("/eliminarViaje")
    public String eliminarViaje(Viaje viaje) {

        viajeservice.eliminarViaje(viaje);

        return "redirect:/";
    }

    @PostMapping("/eliminarTodoViajes")
    public String eliminarTodoViajes() {

        viajeservice.limpiarPlanilla();

        return "redirect:/";
    }

    @PostMapping("/agregarDia")
    public String agregarDia(Dia dia) {

        operacionescombinadas.cerrarDia(dia);

        return "redirect:/";
    }

    @GetMapping("/eliminarDia")
    public String eliminarDia(Dia dia) {

        diaservice.eliminarDia(dia);

        return "redirect:/";
    }

    @PostMapping("/cerrarMes")
    public String cerrarMes(Mes mes) {
        operacionescombinadas.cerrarMes(mes);

        return "redirect:/";
    }

    @PostMapping("/eliminarTodoDias")
    public String eliminarTodoDias() {
        diaservice.limpiarPlanilla();

        return "redirect:/";
    }
    
    @PostMapping("/eliminarTodoMeses")
    public String eliminarTodoMeses(){
        messervice.limpiarPlanilla();
        
        return"redirect:/";
    }
}
