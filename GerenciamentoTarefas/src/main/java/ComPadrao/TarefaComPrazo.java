/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComPadrao;

/**
 *
 * @author kauao
 */
public class TarefaComPrazo extends Tarefa {

    @Override
    protected void definirNome() {
        System.out.println("Nome da tarefa com prazo definido.");
    }

    @Override
    protected void definirDescricao() {
        System.out.println("Descrição da tarefa com prazo definida.");
    }

    @Override
    protected void configurarRepeticao() {
        System.out.println("Tarefa com prazo não possui repetição.");
    }

    @Override
    protected void salvarTarefa() {
        System.out.println("Tarefa com prazo salva com sucesso e prazo configurado.");
    }
}