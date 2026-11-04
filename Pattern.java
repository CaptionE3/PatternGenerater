// Eitan A   pd.4
//This is a collection of methods that create various patterns using loops

//creates the star pattern
public class Pattern{
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
       for ( number=1; number<=rows; number++)
        for(int i=1; i<=number; i++){
            System.out.println(number+"");
           
            
        }
    }
    public static void main(String [] args){
       stars(7);
       numbers(9);


    }

}