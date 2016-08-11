package ex01_atm;

public class MainClass {
	public static void main(String[] args){
		ATM2 obj=new ATM2(10000);
		
		ATM_USER2 user1=new ATM_USER2(obj, "서보원");
		ATM_USER2 user2=new ATM_USER2(obj, "최재규");
		ATM_USER2 user3=new ATM_USER2(obj, "노경아");
		
		user1.start();
		user2.start();
		user3.start();
	}
}
