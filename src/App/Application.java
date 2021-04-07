package App;

import Utils.Tasks;

public class Application {
	public static void main(String[] args) {
		
		System.out.println("Numero de vacantes para Ingeniero Programador: "+Tasks.VacantE+"\n");
		
		Tasks.Tasks_Developer();
		
		System.out.println("\nNumero de vacantes para el area de Marketing: "+Tasks.VacantM+"\n");
		
		Tasks.Tasks_Marketeer();
		
		System.out.println("\nNumero de vacantes para Contador Publico: "+Tasks.VacantA+"\n");
		
		Tasks.Tasks_Accountant();
	}
 
}
