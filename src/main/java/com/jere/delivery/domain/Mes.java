package com.jere.delivery.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data  
@Entity
@Table(name="mes")
public class Mes implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idMes;
    
    private int cantidadDeDias;
   
    private double gananciasDelMes;
}
