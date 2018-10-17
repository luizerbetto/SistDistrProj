package MainStore;

public class MainStore {

    public static void main(String[] args){
    	
    	//Cria��o e preenchimento da Blackboard
    	BlackboardStore store = new BlackboardStore();
    	
    	//criar uma tela
    	//bot�o cliente
        Thread client = new Thread(new ClientRunnable(store), "client1");
        Thread adm = new Thread(new AdmRunnable(store), "amd1");
        System.out.println("Starting Runnable threads");
        client.start();
        adm.start();
        System.out.println("MyThreads has been started");
        
    }
}
