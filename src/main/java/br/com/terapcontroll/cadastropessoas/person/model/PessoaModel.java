package br.com.terapcontroll.cadastropessoas.person.model;

import br.com.terapcontroll.cadastropessoas.task.model.TaskModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_pessoa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private String cargo;

    private BigDecimal salario;

    // @ManyToOne cada pessoa tem apenas uma task
    @ManyToOne
    @JoinColumn(name = "task_id") // Chave estrangeira aq (Foreing key here)
    private TaskModel taskModel;
}
