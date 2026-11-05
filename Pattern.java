// Eitan A   pd.4
//This is a collection of methods that create various patterns using loops

//creates the star pattern
public class Pattern{
        //precondition star = *
        //postcondition star +2
    public static void stars(int rows){
        String star="*";
        while(rows>0){
            System.out.println(star);
            rows-=1;
            star+="**";
            
            
            

        }
       

    }
    
     public static void numbers(int rows){
        int number=1;
       for ( int i=1; i<=rows; i++)
        for(int j=1; j<=i; j++){
            System.out.print(i);
            
            
        }
        //System.printLn(i);
    }
    public static void main(String [] args){
       stars(7);
       numbers(9);


    }

}