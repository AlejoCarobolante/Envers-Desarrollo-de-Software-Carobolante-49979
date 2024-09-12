package Entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "Factura")
@Audited
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fk_detalleFactura")
    private Set<DetalleFactura> detalleFacturas = new HashSet<>();

    @NonNull private String fecha;
    @NonNull private int numero;
    @NonNull private int total;

    public void setCliente(Cliente cli1) {
    }

    public void setFecha(String s) {
    }

    public Calendar getDetalleFacturas() {
    }

    public void setTotal(int i) {
    }
}

