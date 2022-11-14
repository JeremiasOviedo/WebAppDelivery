package com.jere.delivery.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "viaje")
public class Viaje implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idViaje;

    @Column()
    private double montoDelPedido;

    @Column()
    private double valorDelViaje;

    
    
}
