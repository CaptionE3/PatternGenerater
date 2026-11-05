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
    //precondition number=1
    //postcondition number+=1 
     public static void numbers(int rows){
        
       for ( int i=1; i<=rows; i++){
        for(int j=1; j<=i; j++){
            System.out.print(i);
            
            
        }
        System.out.println();
    }
    }
    public static void odds(int rows){
        
       for ( int i=rows; i>=1; i-=2){
        for(int j=rows; j>=i; j-=2){
            System.out.print(i);
            
            
        }
        System.out.println();
    }
    }
    public static void main(String [] args){
       stars(7);
       numbers(9);
        odds(5);

    }

}