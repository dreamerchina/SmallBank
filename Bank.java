import java.util.*;
public class Bank {
	public  int login(int id,int pw){
		
	    Data data=new Data();
	    for(int i = 0;i<data.us.length;i++){
	    	if(id==data.us[i].getId()){
	    		System.out.println("ÕËºÅÕýÈ·");
	    		if(pw==data.us[i].getPw()){
	    			System.out.print("1.²éÑ¯ÐÕÃû");
	    		    System.out.print("2.´æÇ®");
	    		    System.out.println("3.È¡Ç®");
	    		    System.out.println("4.²éÑ¯Óà¶î");
	    		    return i;
	    		}else{
	    			System.out.println("ÃÜÂë´íÎó");
	    		}
	    		break;
	    	}
	    	
	    	
	    	
	    }
		return pw;
			
		
	}

}
