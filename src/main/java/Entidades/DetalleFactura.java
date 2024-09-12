package Entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "DetalleFactura")
@Audited
public class DetalleFactura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_articulo")
    private Articulo articulo;

    @NonNull private int cantidad;
    @NonNull private int subtotal;

    public void setArticulo(Articulo art2) {
    }

    public void setCantidad(int i) {
    }

    public void setSubtotal(int i) {
    }
}


