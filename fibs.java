package guii;

public class fibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,i,count=10;    
		 System.out.print(a+" "+b);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  c=a+b;    
		  System.out.print(" "+c);    
		  a=b;    
		  b=c;    
		 }    

	}

}
