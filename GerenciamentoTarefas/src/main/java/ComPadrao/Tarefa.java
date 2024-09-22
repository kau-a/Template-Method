/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComPadrao;

/**
 *
 * @author kauao
 */
public abstract class Tarefa {
    
    // Método template
    public final void criarTarefa() {
        definirNome();
        definirDescricao();
        configurarRepeticao();
        salvarTarefa();
    }
    
    // Métodos abstratos para serem implementados pelas subclasses
    protected abstract void definirNome();
    protected abstract void definirDescricao();
    protected abstract void configurarRepeticao();
    
    // Método comum para salvar a tarefa
    protected void salvarTarefa() {
        System.out.println("Tarefa salva com sucesso!");
    }
}