package br.com.terapcontroll.cadastropessoas.task.model;

import br.com.terapcontroll.cadastropessoas.person.model.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_task")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeTarefa;

    private String descricao;

    private String nivelDificuldade;

    // @OneToMany uma task pode ter várias pessoas
    @OneToMany (mappedBy = "taskModel")
    private List<PessoaModel> pessoa;
}
