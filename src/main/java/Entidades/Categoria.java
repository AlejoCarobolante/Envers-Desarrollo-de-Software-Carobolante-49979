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
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "Categoria")
@Audited
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "categorias")
    private Set<Articulo> articulos = new HashSet<>();

    @NonNull private String denominacion;

    public Categoria(String nombreCategoria) {
    }

    public Calendar getArticulos() {
    }
}
