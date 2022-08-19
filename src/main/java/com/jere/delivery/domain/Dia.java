package com.jere.delivery.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="dia")
public class Dia implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Long idDia;
    
    private double montoAPagar;
    
    private int cantidadDeViajes;
    
    private double gananciasDelDia;
}
