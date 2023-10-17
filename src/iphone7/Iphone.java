package iphone7;

import java.util.Random;
import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador{
	
	private long imei;
	private boolean navegadorAberto;
	private boolean reprodutorMusicalAberto;
	private boolean telefoneAberto;
	
	public Iphone() {
		this.imei = gerarImei();
		this.navegadorAberto = false;
		this.reprodutorMusicalAberto = false;
		this.telefoneAberto = false;
	}

	private long gerarImei() {
		Random novoImei = new Random();
		
		return novoImei.nextLong(999999999);
	}
	
	//Navegador
	public void abrirNavegador() {
		Scanner scanner = new Scanner(System.in);
		
		if(!navegadorAberto) {
			System.out.println("Abrindo navegador...");
		}else {
			System.out.println("Navegador já Aberto");
		}
			
		int opcao = 0;
		
		do {
			
			System.out.println("Escolha as opções: \n"
					+ "[1]: Adicionar nova aba.\n"
					+ "[2]: Exibir Página.\n"
					+ "[3]: Atualizar Página.\n"
					+ "[0]: Fechar Navegador\n");
			
			opcao = scanner.nextInt();
			
			switch (opcao) {
			
			//Adicionar nova aba
			case 1: 
				adicionarNovaAba();
				break;
				
			//Exibindo página
			case 2: 
				exibirPagina();
				break;
				
			//Atualizando página
			case 3: 
				atualizarPagina();
				break;
				
			//Fechando navegador
			case 0:
				System.out.println("Fechando navegador...");
				this.navegadorAberto = false;
				break;
				
			//Opção Inválida
			default:
				System.out.println("Opção inválida !!!");
				break;
			}
		}while(opcao != 0);
		
			

		}
		
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Página...\n");
		
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Aba...\n");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina...\n");
		
	}
	
	
	//Telefone
	public void abrirTelefone() {
		Scanner scanner1 = new Scanner(System.in);
		
		if(!telefoneAberto) {
			System.out.println("Abrindo telefone...");
		}else {
			System.out.println("Telefone já Aberto");
		}
			
		int opcao = 0;
		
		do {
			
			System.out.println("Escolha as opções: \n"
					+ "[1]: Ligar.\n"
					+ "[2]: Atender.\n"
					+ "[3]: Iniciar Correio de Voz.\n"
					+ "[0]: Fechar Telefone\n");
			
			opcao = scanner1.nextInt();
			
			switch (opcao) {
			
			//Adicionar nova aba
			case 1: 
				ligar();
				break;
				
			//Exibindo página
			case 2: 
				atender();
				break;
				
			//Atualizando página
			case 3: 
				iniciarCorreioVoz();
				break;
				
			//Fechando navegador
			case 0:
				System.out.println("Fechando telefone...");
				this.telefoneAberto = false;
				break;
				
			//Opção Inválida
			default:
				System.out.println("Opção inválida !!!");
				break;
			}
			
		}while(opcao != 0);
		
			
			
	}
	
	@Override
	public void ligar() {
		System.out.println("Chamando...\n");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação...\n");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz...\n");
		
	}
	
	
	//Reprodutor de música
	public void abrirReprodutorMusica() {
		Scanner scanner2 = new Scanner(System.in);
		
		if(!telefoneAberto) {
			System.out.println("Abrindo reprodutor de música...");
		}else {
			System.out.println("Reprodutor de música já aberto");
		}
			
		
		int opcao = 0;
		
		do {
			
			System.out.println("Escolha as opções: \n"
					+ "[1]: Tocar.\n"
					+ "[2]: Pausar.\n"
					+ "[3]: Selecionar Música.\n"
					+ "[0]: Fechar Reprodutor de Música\n");
			
			opcao = scanner2.nextInt();
			
			switch (opcao) {
			
			//Adicionar nova aba
			case 1: 
				tocar();
				break;
				
			//Exibindo página
			case 2: 
				pausar();
				break;
				
			//Atualizando página
			case 3: 
				selecionarMusica();
				break;
				
			//Fechando navegador
			case 0:
				System.out.println("Fechando reprodutor de música...");
				this.reprodutorMusicalAberto = false;
				break;
				
			//Opção Inválida
			default:
				System.out.println("Opção inválida !!!");
				break;
			}
		}while(opcao != 0);
		
			
			
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando música...\n");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música...\n");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica...\n");
	}
	
	//Getters and Setters
	public long getImei() {
		return imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}

	public boolean isNavegadorAberto() {
		return navegadorAberto;
	}

	public void setNavegadorAberto(boolean navegadorAberto) {
		this.navegadorAberto = navegadorAberto;
	}

	public boolean isReprodutorMusicalAberto() {
		return reprodutorMusicalAberto;
	}

	public void setReprodutorMusicalAberto(boolean reprodutorMusicalAberto) {
		this.reprodutorMusicalAberto = reprodutorMusicalAberto;
	}

	public boolean isTelefoneAberto() {
		return telefoneAberto;
	}

	public void setTelefoneAberto(boolean telefoneAberto) {
		this.telefoneAberto = telefoneAberto;
	}

	//Método Main
	public static void main(String[] args) {
		Iphone iphone1 = new Iphone();
		Scanner scanner = new Scanner(System.in);
		
		int condicao = 0;
		
		do {
			System.out.println("==================================");
			System.out.println("|Iphone 7 Java Menu by : JVPCoder|");
			System.out.println("==================================");
			
			System.out.println("[1]: Abrir Telefone.");
			System.out.println("[2]: Abrir Navegador.");
			System.out.println("[3]: Abrir Reprodutor De Musica.");
			System.out.println("[0]: Fechar Iphone.");
			
			condicao = scanner.nextInt();
			
			switch (condicao) {
			//Telefone
			case 1:
				iphone1.abrirTelefone();
				break;
				
			//Navegador
			case 2:
				iphone1.abrirNavegador();
				break;
			
			//Musica	
			case 3:
				iphone1.abrirReprodutorMusica();
				break;
			
			case 0:
				System.out.println("Fechando Iphone.. \n Até !");
				break;
				
			default:
				System.out.println("Opção Inválida !!!");
				break;
			}
			
		}while(condicao != 0);
		
		scanner.close();
	}
	
}
