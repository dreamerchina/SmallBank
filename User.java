
public class User {	
		private String name;
		private int id;
		private int pw;
		private double balance;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPw() {
			return pw;
		}
		public void setPw(int pw) {
			this.pw = pw;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public User(String name,int id,int pw,double balance){
			this.name=name;
			this.id=id;
			this.pw=pw;
			this.balance=balance;
			
		}
		
	

}
