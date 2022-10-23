package br.com.service.impl;

import br.com.entity.Aluno;
import br.com.entity.Campus;
import br.com.entity.Disciplina;
import br.com.entity.enuns.DisciplinasEnum;
import br.com.repository.AlunoRepository;
import br.com.repository.CampusRepository;
import br.com.repository.DisciplinaRepository;
import br.com.service.UniPavaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Transactional
public class UniPavaoServiceImpl implements UniPavaoService {

    private final CampusRepository campusRepository;
    private final DisciplinaRepository disciplinaRepository;
    private final AlunoRepository alunoRepository;

    @Override
    public Campus cadastrarCampus(Campus campus) {
        return campusRepository.saveAndFlush(campus);
    }

    @Override
    public Aluno cadstrarAluno(Aluno aluno) {
        return alunoRepository.saveAndFlush(aluno);
    }

    @Override
    public Aluno cadstrarAlunoDisciplina(Aluno aluno, List<DisciplinasEnum> disciplinas) {
        Set<Disciplina> disciplinaList = disciplinaRepository.findByNomeDisciplina(disciplinas);
        aluno.setDisciplina(disciplinaList);
        return alunoRepository.saveAndFlush(aluno);
    }

    @Override
    public Disciplina cadastrarDisciplina(Disciplina disciplina, Long idCampus) {
        Campus campus = campusRepository.findById(idCampus).get();
        disciplina.setCampus(campus);
        return disciplinaRepository.saveAndFlush(disciplina);
    }
}
