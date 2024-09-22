/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComPadrao;

/**
 *
 * @author kauao
 */
public class TarefaRecorrente extends Tarefa {

    @Override
    protected void definirNome() {
        System.out.println("Nome da tarefa recorrente definido.");
    }

    @Override
    protected void definirDescricao() {
        System.out.println("Descrição da tarefa recorrente definida.");
    }

    @Override
    protected void configurarRepeticao() {
        System.out.println("Tarefa recorrente configurada para repetição semanal.");
    }
}