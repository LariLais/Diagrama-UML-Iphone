
// Classe que implementa as interfaces para o iPhone

import interfaces.AparelhoTelefonico;
import interfaces.NavagadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavagadorInternet {
    // Implementação dos métodos das interfaces aqui
    // ...
    
    @Override
    public void tocar() {
        // Implementação da reprodução de música
    }
    
    @Override
    public void pausar() {
        // Implementação de pausar a música
    }
    
    @Override
    public void selecionarMusica(String musica) {
        // Implementação para selecionar uma música
    }
    
    @Override
    public void ligar(String numero) {
        // Implementação para fazer uma ligação
    }
    
    @Override
    public void atender() {
        // Implementação para atender uma chamada
    }
    
    @Override
    public void iniciarCorreioVoz() {
        // Implementação para iniciar o correio de voz
    }
    
    @Override
    public void exibirPagina(String url) {
        // Implementação para exibir uma página web
    }
    
    @Override
    public void adicionarNovaAba(String url) {
        // Implementação para adicionar uma nova aba no navegador
    }
    
    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página web
    }
}