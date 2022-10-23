package br.com.service;

import br.com.entity.Aluno;
import br.com.entity.Campus;
import br.com.entity.Disciplina;
import br.com.entity.enuns.DisciplinasEnum;

import java.util.List;


public interface UniPavaoService {
    Aluno cadstrarAlunoDisciplina(Aluno aluno, List<DisciplinasEnum> disciplinas);
    Disciplina cadastrarDisciplina(Disciplina disciplina, Long idCampus);
    Aluno cadstrarAluno(Aluno aluno);
    Campus cadastrarCampus(Campus campus);
}
