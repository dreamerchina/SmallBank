import java.util.*;

public class Main {
	    
    public static void main(String args[]){
    	System.out.println("����������˺�����");
    	Scanner id1=new Scanner(System.in);
		Scanner pw1=new Scanner(System.in);
	    
	    int id=id1.nextInt();
	    System.out.println("����˺���"+id);
	    System.out.println("��������ǣ�");
	    int pw=pw1.nextInt();
	    Bank custom=new Bank();
	    int m=custom.login(id,pw);
	    
	    for(int i=0;i<9;i++){
	    	select(m);
	    }
       
        
    	
    }
    static void add(int m){
    	Scanner money1=new Scanner(System.in);
    	System.out.println("money:");
    	double money=money1.nextDouble();
        Data data=new Data();
        double sum=money+data.us[m].getBalance();
        System.out.println("���Ϊ:"+sum);
        data.us[m].setBalance(sum);
 }
    static void back(){
    	Scanner n1=new Scanner(System.in);
    	int n=n1.nextInt();
        if(n==1){
        	System.out.print("1.��ѯ����");
		    System.out.print("2.��Ǯ");
		    System.out.println("3.ȡǮ");
		    System.out.println("4.��ѯ���");
		    
        }
        
        
        
    	
    }
    static void reduce(int m){
    	Scanner money1=new Scanner(System.in);
    	double money=money1.nextDouble();
        Data data=new Data();
        double sum=data.us[m].getBalance()-money;
        System.out.println("���Ϊ:"+sum);
        data.us[m].setBalance(sum);
    }
    static void select(int m){
    	 Scanner num1=new Scanner(System.in);
         int num=num1.nextInt();
         switch(num){
         case 1:
         	Data data=new Data();
         	System.out.println(data.us[m].getName());
         	System.out.println("1.�˳�");
         	back(); 
         	break;
         case 2:
             add(m);
             System.out.println("1.�˳�");
             back();
             break;
         case 3:
         	reduce(m);
         	System.out.println("1.�˳�");
         	back();
         	break;
 		case 4:
         	Data data1=new Data();
         	System.out.println(data1.us[m].getBalance());
         	System.out.println("1.�˳�");
         	back();
         	break;
        default:
        	
         }
         
    }
}

