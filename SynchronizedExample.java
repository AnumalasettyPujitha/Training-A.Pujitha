class Trainees{
	public void message(String companyName) {
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Welcome to the Company "+companyName);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Company extends Thread{
	Trainees trainee;
	String companyName;
	Company(Trainees trainee,String companyName){
		this.trainee=trainee;
		this.companyName=companyName;
	}
	public void run() {
		trainee.message(companyName);
	}
}
public class SynchronizedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainees batch10=new Trainees();
		Company motivity=new Company(batch10,"Motivity");
		Company jnit=new Company(batch10,"JNIT");
		motivity.start();
		jnit.start();
	}

}
