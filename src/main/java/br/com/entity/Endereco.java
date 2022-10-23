package br.com.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Data
@DynamicUpdate
@Entity
@Table(name = "TAB_ENDERECO")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ENDERECO", nullable = false)
    private Long id;

    @Column(name = "CEP")
    private String cep;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "RUA")
    private String rua;
    @Column(name = "LOGRADOURO")
    private String logradouro;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "PAIS")
    private String pais;
}
