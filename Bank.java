import java.util.*;
public class Bank {
	public  int login(int id,int pw){
		
	    Data data=new Data();
	    for(int i = 0;i<data.us.length;i++){
	    	if(id==data.us[i].getId()){
	    		System.out.println("�˺���ȷ");
	    		if(pw==data.us[i].getPw()){
	    			System.out.print("1.��ѯ����");
	    		    System.out.print("2.��Ǯ");
	    		    System.out.println("3.ȡǮ");
	    		    System.out.println("4.��ѯ���");
	    		    return i;
	    		}else{
	    			System.out.println("�������");
	    		}
	    		break;
	    	}
	    	
	    	
	    	
	    }
		return pw;
			
		
	}

}
