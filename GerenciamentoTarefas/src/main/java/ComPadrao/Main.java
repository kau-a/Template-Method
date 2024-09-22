/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComPadrao;

/**
 *
 * @author kauao
 */
public class Main {
    public static void main(String[] args) {
        Tarefa tarefaSimples = new TarefaSimples();
        Tarefa tarefaRecorrente = new TarefaRecorrente();
        Tarefa tarefaComPrazo = new TarefaComPrazo();

        System.out.println("Criando tarefa simples:");
        tarefaSimples.criarTarefa();
        
        System.out.println("\nCriando tarefa recorrente:");
        tarefaRecorrente.criarTarefa();
        
        System.out.println("\nCriando tarefa com prazo:");
        tarefaComPrazo.criarTarefa();
    }
}
