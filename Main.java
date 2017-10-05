import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.lang.Exception;
public class Main {


    public static void main(String[] args) throws IOException{

        boolean chance=true;
        int count =0;
        int x=3;
        Scanner sc=new Scanner(System.in);
        String location="movie.txt";
        File file = new File(location);
        try{
             x=movie.nooflines(location);
        }
        catch (Exception e){
             System.exit(0);
        }
        String name=movie.chooses(file,x);
        movie.create();
        System.out.println("Guess the movie:"+"\n"+"  "+movie.copy+"");
        movie.displayfinal();
        while (chance){
         char ch=sc.next(".").charAt(0);
            if(movie.check(ch))
            movie.display(ch);
            else {
                movie.wrong(ch);
            count++;
            }
            if(count>=10) chance=false;
        }



    }
}
