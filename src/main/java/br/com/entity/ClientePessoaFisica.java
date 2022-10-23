package br.com.entity;

import br.com.entity.enuns.EstadoCivilEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "TAB_CLIENTE_PF")
@PrimaryKeyJoinColumn(name = "ID_CLIENTE_PF", referencedColumnName = "ID_CLIENTE", foreignKey = @ForeignKey(name = "TAB_CLI_PF_TAB_CLIENTE_FK"))
public class ClientePessoaFisica extends Cliente {
    @Column(name = "NOME_MAE")
    String nomeMae;
    @Column(name = "NOME_PAI")
    String nomePai;
    @Column(name = "ESTADO_CIVIL")
    @Enumerated(EnumType.STRING)
    EstadoCivilEnum estadoCivil;
    @Column(name = "DATA_NASCIMENTO", columnDefinition = "DATE")
    Date dtNascimento;
    @Column(name = "CPF")
    String cpf;
}
