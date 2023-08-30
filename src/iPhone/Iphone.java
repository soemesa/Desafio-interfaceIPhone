package iPhone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	private String modelo;
    private int armazenamento;

    // Construtor
    public Iphone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        // Implementação para pausar música
    }

    @Override
    public void selecionarMusica() {
        // Implementação para selecionar uma música
    }

    
    
    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
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

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina() {
        // Implementação para exibir uma página na internet
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação para adicionar uma nova aba no navegador
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar uma página no navegador
    }
}
