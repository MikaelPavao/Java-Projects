package br.com.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "TAB_CLIENTE_PJ")
@PrimaryKeyJoinColumn(name = "ID_CLIENTE_PJ", referencedColumnName = "ID_CLIENTE", foreignKey = @ForeignKey(name = "TAB_CLI_PJ_TAB_CLIENTE_FK"))
public class ClientePessoaJuridica extends Cliente {
    @Column(name = "DATA_ABERTURA_CNPJ", columnDefinition = "DATE")
    Date dtAberturaCnpj;
    @Column(name = "RAZAO_SOCIAL")
    String razaoSocial;
    @Column(name = "CNPJ")
    String cnpj;
    @Column(name = "NOME_SOCIO")
    String nomeSocio;
    @Column(name = "AREA_ATUACAO")
    String areaAtuacao;
}
