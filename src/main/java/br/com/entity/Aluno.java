package br.com.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@DynamicUpdate
@Table(name = "TAB_ALUNO")
@PrimaryKeyJoinColumn(name = "ID_ALUNO", referencedColumnName = "ID_CLIENTE_PF", foreignKey = @ForeignKey(name = "TAB_ALUNO_TAB_CLI_PF_FK"))
public class Aluno extends ClientePessoaFisica {

    @ManyToMany(targetEntity = Disciplina.class)
    @JoinTable(name = "TAB_REL_ALUNO_DISCIPLINA",
            joinColumns = @JoinColumn(name = "ID_ALUNO",
                    referencedColumnName = "ID_ALUNO",
                    foreignKey = @ForeignKey(name = "TAB_ALUNO_TAB_REL_ALUNO_DISCIPLINA_FK")),
            inverseJoinColumns = @JoinColumn(name = "ID_DISCIPLINA",
                    referencedColumnName = "ID_DISCIPLINA",
                    foreignKey = @ForeignKey(name = "TAB_DISCIPLINA_TAB_REL_ALUNO_DISCIPLINA_FK")))
    private Set<Disciplina> disciplina;
}
