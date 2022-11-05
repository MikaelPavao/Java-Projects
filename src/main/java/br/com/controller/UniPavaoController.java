package br.com.controller;

import br.com.config.ConfigLogger;
import br.com.entity.Aluno;
import br.com.entity.Campus;
import br.com.entity.Disciplina;
import br.com.entity.enuns.DisciplinasEnum;
import br.com.service.UniPavaoService;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

import static br.com.DefaultConstants.*;

@RestController
@RequiredArgsConstructor
public class UniPavaoController {
    private ConfigLogger logger = ConfigLogger.getLogger();
    private final UniPavaoService uniPavaoService;

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping(value = "/aluno/Disciplina/cadastro")
    public ResponseEntity<Aluno> cadastroDisciplinaAluno(@RequestBody Aluno aluno,
                                                         @RequestParam(name = "disciplina") List<DisciplinasEnum> disciplinasEnum) {
        Aluno _aluno = uniPavaoService.cadstrarAlunoDisciplina(aluno, disciplinasEnum);
        logger.info("Aluno cadastrado com sucesso");
        return ResponseEntity.ok(_aluno);
    }

    @PostMapping(value = "/aluno/cadastro")
    public ResponseEntity<Aluno> cadastroAluno(@RequestBody Aluno aluno) {
        Aluno _aluno = uniPavaoService.cadstrarAluno(aluno);
        logger.info("Aluno cadastrado com sucesso");
        return ResponseEntity.ok(_aluno);
    }

    @PostMapping(value = "/campus/cadastro")
    public ResponseEntity<Campus> cadastrarCampus(@RequestBody Campus campus) {
        Campus _campus = uniPavaoService.cadastrarCampus(campus);
        logger.info("Campus cadastrado com sucesso");
        return ResponseEntity.ok().body(_campus);
    }

    @PostMapping(value = "/disciplina/cadastro")
    public ResponseEntity<Disciplina> cadastrarDisciplina(@RequestBody Disciplina disciplina,
                                                          @RequestParam(name = "idCampus") Long idCampus) {
//        Disciplina _disciplina = uniPavaoService.cadastrarDisciplina(disciplina, idCampus);
        ProducerRecord<String, String> mensagem_enviada = new ProducerRecord<>(DEFAULT_TOPIC, UUID.randomUUID().toString(), idCampus.toString());
        kafkaTemplate.send(mensagem_enviada);
        logger.info("Disciplina cadastrada com sucesso");
        return ResponseEntity.ok().body(disciplina);
    }

    @KafkaListener(id = CLIENT_ID,groupId = GROUP_ID,topics = DEFAULT_TOPIC)
    public void ouvinteTeste(String msg){
        logger.info("Mensagem recebida: " + msg);
    }

}
