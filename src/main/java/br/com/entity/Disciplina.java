package br.com.entity;

import br.com.entity.enuns.DisciplinasEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@DynamicUpdate
@Table(name = "TAB_DISCIPLINA")
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISCIPLINA", nullable = false)
    private Long id;

    @Column(name = "NOME")
    @Enumerated(EnumType.STRING)
    private DisciplinasEnum nome;

    @Column(name = "SALA")
    private String sala;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_CAMPUS",
            referencedColumnName = "ID_CAMPUS",
            foreignKey = @ForeignKey(name = "TAB_DISCIPLINA_CAMPUS_FK"))
    private Campus campus;

    @Column(name = "MAXIMO_ALUNOS")
    private Integer maxAlunos;

    @Column(name = "CARGA_HORARIA")
    private Integer cargaHoraria;
}
