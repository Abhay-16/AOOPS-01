import java.util.*;


class Q02 {
    
    public static void main(String args[]) {
        
        Scanner in=new Scanner(System.in);
        
        int n,flag=0;
        System.out.println("ENTER THE NUMBER\n");
        n=in.nextInt();
        
        
        try {
            
            if(n==0 || n==1)
            {
                flag=1;
            }
            
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            
            if(flag==1)
            {
                throw new NumberNotPrimeException("Not prime");
            }else{

                System.out.println("Prime number.");
            }
        } catch(NumberNotPrimeException p) {
            System.out.println(p);
        }
    }
}



class NumberNotPrimeException extends Exception {

    NumberNotPrimeException(String str){
        System.out.println(str);
    }

} 