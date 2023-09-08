package iphone7;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador{

	
	
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina...");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Aba...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina...");
		
	}

	@Override
	public void ligar() {
		System.out.println("Chamando...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música...");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica...");
	}
	
	
	public static void main(String[] args) {
		Iphone a = new Iphone();
		
		//Navegador
		a.adicionarNovaAba();
		a.exibirPagina();
		a.atualizarPagina();
		
		//Telefone
		a.atender();
		a.iniciarCorreioVoz();
		a.ligar();
		
		//Musica
		a.pausar();
		a.selecionarMusica();
		a.tocar();
	}
	
}
