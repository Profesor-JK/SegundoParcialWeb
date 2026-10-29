[Usuario.java](https://github.com/user-attachments/files/34147688/Usuario.java)
package org.gerdoc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "CONTRASEÑA")
    private Integer contraseña;
}
