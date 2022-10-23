package br.com.entity.enuns;

public enum EstadoCivilEnum {
    CASADO("CASADO"),
    SOLTEIRO("SOLTEIRO"),
    VIUVO("VIUVO"),
    DESQUITADO("DESQUITADO");

    private String estadoCivil;

    EstadoCivilEnum(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
}
