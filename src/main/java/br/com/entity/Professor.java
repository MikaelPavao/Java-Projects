package br.com.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@DynamicUpdate
@PrimaryKeyJoinColumn(name = "ID_PROFESSOR", referencedColumnName = "ID_CLIENTE_PJ", foreignKey = @ForeignKey(name = "TAB_PROFESSOR_TAB_CLI_PJ_FK"))
@Table(name = "TAB_PROFESSOR")
public class Professor extends ClientePessoaJuridica {

    @Column(name = "MATERIA")
    String materia;
    @Column(name = "ESPECIALIDADE")
    String especialidade;
    @ManyToOne(targetEntity = Campus.class)
    @JoinColumn(name = "ID_CAMPUS",
            referencedColumnName = "ID_CAMPUS",
            foreignKey = @ForeignKey(name = "TAB_PROFESSOR_CAMPUS_FK"))
    Campus campus;
    @ManyToMany(targetEntity = Disciplina.class)
    @JoinTable(name = "TAB_REL_PROFESSOR_DISCIPLINA",
            joinColumns = @JoinColumn(name = "ID_PROFESSOR",
                    referencedColumnName = "ID_PROFESSOR",
                    foreignKey = @ForeignKey(name = "TAB_PROFESSOR_TAB_REL_PROFESSOR_DISCIPLINA_FK")),
            inverseJoinColumns = @JoinColumn(name = "ID_DISCIPLINA",
                    referencedColumnName = "ID_DISCIPLINA",
                    foreignKey = @ForeignKey(name = "TAB_DISCIPLINA_TAB_REL_PROFESSOR_DISCIPLINA_FK")))
    private Set<Disciplina> disciplinas;

}
