package br.com.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DynamicUpdate
@Table(name = "TAB_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE", nullable = false)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "SOBRENOME")
    private String sobreNome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_ENDERECO", foreignKey = @ForeignKey(name = "TAB_CLIENTE_TAB_ENDERECO_FK"))
    private Endereco endereco;

}
