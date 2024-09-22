/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SemPadrao;

/**
 *
 * @author kauao
 */
public class Main {
    public static void main(String[] args) {
        TarefaSimples tarefaSimples = new TarefaSimples();
        TarefaRecorrente tarefaRecorrente = new TarefaRecorrente();
        TarefaComPrazo tarefaComPrazo = new TarefaComPrazo();

        System.out.println("Criando tarefa simples:");
        tarefaSimples.criarTarefa();
        
        System.out.println("\nCriando tarefa recorrente:");
        tarefaRecorrente.criarTarefa();
        
        System.out.println("\nCriando tarefa com prazo:");
        tarefaComPrazo.criarTarefa();
    }
}