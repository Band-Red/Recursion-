/*public class Recursion {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Recursion "+num+" = "+R(num));
    }
     public static long R(int num){
        if(num>=1){
            return num*R(num-1);        
        }
        else{
           return 1;
        }
    }
}
---------------------------------------------------------------------------------------*/
public class Recursion {
    public static void main(String[] args) {
        int num = 5;
        long Factorail=add(num);
        System.out.println("Facctorail "+num+" = "+Factorail);
    }
     public static long add(int num){
        if(num>=1){
            return num+add(num-1);        
        }
        else{
           return 1;
        }
    }
}
//----------------------------------------------------------------------------------------