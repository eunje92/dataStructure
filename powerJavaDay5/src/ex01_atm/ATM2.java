package ex01_atm;

class ATM2 {
	private int total;
	
	public ATM2(int total){
		this.total=total;
	}
	
	void deposit(int amount, String name){
		total+=amount;
		System.out.println(name+" : 입금 금액 : "+amount);
	}
	
	void withdraw(int amount, String name){
		if((total-amount)>0){
			total-=amount;
			System.out.println(name+" : 출금 금액 : "+amount);
		}else{
			System.out.println(amount+"를 출금하려고 하였으나");
			System.out.println(name+"님의 잔액이 부족해 출금할 수 없습니다.");
		}
	}
	
	public void getTotal(){
		System.out.println("현재 계좌 잔액은 : "+total+"원 입니다.");
	}
}
