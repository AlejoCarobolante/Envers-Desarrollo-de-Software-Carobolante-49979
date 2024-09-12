package Entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "Domicilio")
@AllArgsConstructor
@Audited
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;

    @NonNull private String nombreCalle;
    @NonNull private int numero;

    public Domicilio(String nombreLugar, int i) {
    }

    public void setCliente(Cliente cli1) {
    }
}
