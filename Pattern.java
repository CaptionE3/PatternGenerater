// Eitan A   pd.4
//This is a collection of methods that create various patterns using loops

//creates the star pattern
public class Pattern{
       //precondition *
       //postcondition ***
    public static void stars(int rows){
        String star="*";
        while(rows>0){
            System.out.println(star);
            rows-=1;
            star+="**";
            
            
            

        }
       

    }
    //precondition i=1
    //postcondition prints triangle with i  j number of times
     public static void triangle(int rows){
        
       for ( int i=1; i<=rows; i++){
        for(int j=1; j<=i; j++){
            System.out.print(i);
            
            
        }
        System.out.println();
    }
    }
    //precondition prints i j times
    //postcondition i-2

    public static void odds(int rows){
        
       for ( int i=rows; i>=1; i-=2){
        for(int j=i; j>=1; j--){
            System.out.print(i); 
            
            
        }
        System.out.println();
    }
    }
    public static void eo(int maxE){
        String output="E";
        if(maxE %2 ==0){
            output="o";
       }
       //precondition eo=0
       //postcondition number of characters in each row decreace each time
         for ( int i=1; i<=maxE; i++){
        for(int j=1; j<=i; j++){
            System.out.print(output);
              
            
        }
        if(output.equals("E"))
            output="o";
        else
            output="E";

        System.out.println();
    }
   
   for ( int i=maxE-1; i>=0; i--){
        for(int j=1; j<=i; j++){
            System.out.print(output);
              
            
        }
        if(output.equals("E"))
            output="o";
        else
            output="E";

        System.out.println();
    }

    }
// precondition prints i j times
//postcondition prints i-2 j-2 times 
    public static void pyramid(int rows){
       for ( int i=rows; i>=1; i-=1){
        for(int j=i*2-1; j>=1; j--){
            System.out.print(rows-i+1); 
            
            
        }
        System.out.println();
    
    }

    }
    public static void main(String [] args){
       //stars(7);
       //triangle(9);
        //odds(9);
        //eo(9);
        pyramid(5);
    }

}