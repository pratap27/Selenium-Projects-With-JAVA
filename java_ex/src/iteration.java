
public class iteration {  
public static void main(String[] args) {  
    aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==3&&j==3){  
                        break bb;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        }  
}  
}  

	
