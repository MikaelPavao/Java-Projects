package br.com.entity.enuns;

public enum DisciplinasEnum {
    MATEMATICA_1("MATEMATICA_1"),
    MATEMETICA_2("MATEMATICA_2"),
    FISICA_1("FISICA_1"),
    FISICA_2("FISICA_2"),
    GEOGRAFIA("GEOGRAFIA"),
    HISTORIA("HISTORIA"),
    ESTUDO_APLICADO("ESTUDO_APLICADO");

    private String disciplina;
    DisciplinasEnum(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
