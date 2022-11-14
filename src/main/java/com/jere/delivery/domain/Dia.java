package com.jere.delivery.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "dia")
public class Dia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column()
    private Long idDia;

    @Column()
    private double montoAPagar;

    @Column()
    private int cantidadDeViajes;

    @Column()
    private double gananciasDelDia;

}
