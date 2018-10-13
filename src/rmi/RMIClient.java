package rmi;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RMIClient{
	
	public static RmiClientInterface rmi_interface;
	public static Scanner keyboard;
	
	public static String username,password;
	
	public static void principalMenu() throws IOException {
		System.out.println("--------------Welcome to DropMusic----------------");
		System.out.println("Já tem uma conta? [sim ou nao]");
		keyboard =new Scanner(System.in);
		String option = keyboard.next();
		System.out.println("Option: "+option);
		if(option.equalsIgnoreCase("sim")) {
			login();
		}
		else if(option.equalsIgnoreCase("nao")) {
			registerUser();
		}
		else {
			System.out.println("Responda corretamente");
			principalMenu();
		}
		System.out.println(username);
		
		secondaryMenu();
		
		
	}
	
	public static void secondaryMenu() {
		System.out.println("--------------Menu----------------");
		System.out.println("1-Gerir artistas, álbuns e músicas\n2-Pesquisar músicas\n3-Consultar detalhes sobre  álbum e sobre artista\n4-Escrever critica a um álbum\n5-Dar privilégios de editor a um utilizador\n6-Notificação imediata de re-edição de descição textual\n7-Transferência de musicas para o servidor\n8-Partilha de ficheiros musicais\n9-Transferencia de musicas do servidor para o utilizador\n10-Sair\n\n");
		keyboard = new Scanner(System.in);
		System.out.print("Opção: ");
		String option = keyboard.next();
		try {
			int option1= Integer.parseInt(option);
			
			switch(option1) {
			case 1:
				programManagement();
				break;
			case 2:
				searchMusics();
				break;
			case 3:
				consultDetailsAboutlbunAndArtist();
				break;
			case 4:
				writeReviewToAlbun();
				break;
			case 5:
				givePrivileges();
				break;
			case 6:
				reeditionNotification();
				break;
			case 7:
				uploadToServer();
				break;
			case 8:
				shareFiles();
				break;
			case 9:
				downloadMusic();
				break;
			case 10:
				System.exit(0);
				break;
			default:
				System.exit(0);
			}
			
		}catch(NumberFormatException ne){
			System.exit(0);
		}
	}

	
	
	public static void downloadMusic() {
		// TODO Auto-generated method stub
		
	}

	public static void shareFiles() {
		// TODO Auto-generated method stub
		
	}

	public static void uploadToServer() {
		// TODO Auto-generated method stub
		
	}

	public static void reeditionNotification() {
		// TODO Auto-generated method stub
		
	}

	public static void givePrivileges() {
		// TODO Auto-generated method stub
		
	}

	public static void writeReviewToAlbun() {
		// TODO Auto-generated method stub
		
	}

	public static void consultDetailsAboutlbunAndArtist() {
		System.out.println("-----Consultar detalhes sobre Albun e sobre artista-----");
		System.out.println("1-Artista\n2-Albun\n3-Voltar atrás");
		System.out.print("Opção: ");
		keyboard = new Scanner(System.in);
		String option = keyboard.next();
		try {
			int option1= Integer.parseInt(option);
			switch(option1) {
			case 1:
				consultDetailsOfArtist();
				break;
			case 2:
				consultDetailsOfAlbun();
				break;
			case 3:
				programManagement();
			default:
				System.exit(0);
			}
		}catch(NumberFormatException nfe) {
			System.exit(0);
		}
	}

	public static void consultDetailsOfAlbun() {
		// TODO Auto-generated method stub
		
	}

	public static void consultDetailsOfArtist() {
		// TODO Auto-generated method stub
		
	}

	public static void searchMusics() {
		System.out.println("-------------Procurar Musicas-------------");
		System.out.println("\nProcurar por:\n1-Artistas\n2-Albuns\n3-Genero Musical\n4-Voltar");
		System.out.print("Opção: ");
		keyboard = new Scanner(System.in);
		String option = keyboard.next();
		try {
			int option1= Integer.parseInt(option);
			switch(option1) {
			case 1:
				searchByArtist();
				break;
			case 2:
				searchByAlbuns();
				break;
			case 3:
				searchByMusicalGender();
				break;
			case 4:
				programManagement();
			default:
				System.exit(0);
			}
		}catch(NumberFormatException nfe) {
			System.exit(0);
		}
	}
	
	public static void searchByMusicalGender() {
		// TODO Auto-generated method stub
		
	}

	public static void searchByAlbuns() {
		// TODO Auto-generated method stub
		
	}

	public static void searchByArtist() {
		// TODO Auto-generated method stub
		
	}

	public static void programManagement() {
		
		System.out.println("-----------Gerir artistas, albuns e musicas-----------");
		System.out.println("1-Artistas\n2-Musicas\n3-Albuns4-Sair\n");
		System.out.print("Opção: ");
		keyboard= new Scanner(System.in);
		String option= keyboard.next();
		try {
			int option1= Integer.parseInt(option);
			switch(option1) {
			case 1:
				artistsManagementMenu();
				break;
			case 2:
				musicManagementMenu();
				break;
			case 3:
				albunsManagementMenu();
				break;
			case 4:
				System.exit(0);
			default:
				System.exit(0);
			}
		}catch(NumberFormatException nfe) {
			System.exit(0);
		}
		
	}

	public static void musicManagementMenu() {
		if(username.contains("qqrcoisa")) {
			System.out.println("--------------Gerir Musicas------------");
			System.out.println("1-Inserir\n2-Remover\n3-Alterar\n4-Voltar atrás");
			System.out.print("Opção: ");
			keyboard= new Scanner(System.in);
			String option = keyboard.next();
			try {
				int option1= Integer.parseInt(option);
				switch(option1) {
				case 1:
					insertMusic();
					break;
				case 2:
					removeMusic();
					break;
				case 3:
					changeMusic();
					break;
				case 4:
					programManagement();
				default:
					System.exit(0);
				}
			}catch(NumberFormatException nfe) {
				System.exit(0);
			}
		}else {
			System.out.println("--------------Listar Musicas------------");
			//artists list function
		}
	}
	
	public static void changeMusic() {
		// TODO Auto-generated method stub
		
	}

	public static void removeMusic() {
		// TODO Auto-generated method stub
		
	}

	public static void insertMusic() {
		// TODO Auto-generated method stub
		
	}

	public static void artistsManagementMenu() {
		
		if(username.contains("qqrcoisa")) {
			System.out.println("--------------Gerir Artistas------------");
			System.out.println("1-Inserir\n2-Remover\n3-Alterar\n4-Voltar atrás");
			System.out.print("Opção: ");
			keyboard= new Scanner(System.in);
			String option = keyboard.next();
			try {
				int option1= Integer.parseInt(option);
				switch(option1) {
				case 1:
					insertArtist();
					break;
				case 2:
					removeArtist();
					break;
				case 3:
					changeArtist();
					break;
				case 4:
					programManagement();
				default:
					System.exit(0);
				}
			}catch(NumberFormatException nfe) {
				System.exit(0);
			}
		}else {
			System.out.println("--------------Listar Artistas------------");
			//artists list function
		}
	}
	
	public static void insertArtist() {}
	
	public static void removeArtist() {}
	
	public static void changeArtist() {}
	
	public static void albunsManagementMenu() {
		if(username.contains("qqrcoisa")) {
			System.out.println("--------------Gerir Albuns------------");
			System.out.println("1-Inserir\n2-Remover\n3-Alterar\n4-Voltar atrás");
			System.out.print("Opção: ");
			keyboard= new Scanner(System.in);
			String option = keyboard.next();
			try {
				int option1= Integer.parseInt(option);
				switch(option1) {
				case 1:
					insertAlbum();
					break;
				case 2:
					removeAlbuns();
					break;
				case 3:
					changeAlbuns();
					break;
				case 4:
					programManagement();
				default:
					System.exit(0);
				}
			}catch(NumberFormatException nfe) {
				System.exit(0);
			}
		}else {
			System.out.println("--------------Listar Albuns------------");
			//artists list function
		}
	}
	
	public static void changeAlbuns() {
		// TODO Auto-generated method stub
		
	}

	public static void removeAlbuns() {
		// TODO Auto-generated method stub
		
	}

	public static void insertAlbum() {

		// TODO Auto-generated method stub		
	}
	
	public static void login() {
		System.out.println("--------------Login----------------");
		System.out.print("Username: ");
		keyboard =new Scanner(System.in);
		username = keyboard.next();
		System.out.print("Password: ");
		password = keyboard.next();
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		//depois de verificar tudo vai para o menu

	

	}
	
	public static void registerUser() {
		System.out.println("--------------Registar Utilizador----------------");
		System.out.print("Nome: ");
		keyboard =new Scanner(System.in);
		String name = keyboard.next();
		System.out.print("Username: ");
		username = keyboard.next();
		System.out.print("Password: ");
		password = keyboard.next();
		System.out.print("Privilégios de utilizador [editor ou normal]: ");
		String privillege = keyboard.next();
		System.out.println(name);
		System.out.println(username);
		System.out.println(password);
		System.out.println(privillege);

	}
	
	public static void main(String args[]) throws Exception, NotBoundException {
		try {
			rmi_interface = (RmiClientInterface)Naming.lookup("rmi://localhost:1099/localhost");
			System.out.println(rmi_interface.SimpleMessage());
			principalMenu();
		}catch(RemoteException re){
			System.out.println(re.getMessage());
		}
	}
	
}