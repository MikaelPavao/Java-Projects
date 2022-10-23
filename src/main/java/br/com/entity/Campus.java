package br.com.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@DynamicUpdate
@Table(name = "TAB_CAMPUS")
public class Campus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CAMPUS", nullable = false)
    private Long id;
    @Column(name = "NOME")
    String nome;
    @Column(name = "NRO_CADASTRO_MEC")
    Integer numeroCadastroMEC;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID_ENDERECO", foreignKey = @ForeignKey(name = "TAB_CAMPUS_TAB_ENDERECO_FK"))
    Endereco endereco;
}
