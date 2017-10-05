import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class movie {
   private static String moviename;
   static String incorrect="Incorrect words are: ";
   static String status="Status: ";
   static StringBuilder copy=new StringBuilder();
   static  int length;
    public static String chooses(File file,int x) throws FileNotFoundException{
        Scanner sc= new Scanner(file);
        String title;

        Random rand= new Random();
        int n=rand.nextInt(x);
        for(int i=0;i<n;i++) {
            sc.nextLine();
        }
        title=sc.nextLine();
        moviename=title;
        movie.length=moviename.length();
        return title;
        }

        public static void displayfinal(){
        System.out.println(moviename);
        }
        public static void create(){
            for(int i = 0, n = moviename.length(); i < n; i++){
                copy.append("_");
            }
        }
        public static void display(char character){
            for (int i = 0 ; i < moviename.length(); i++) {
                char c = moviename.charAt(i);
                if(c==character) {
                    copy.setCharAt(i,c);
                    movie.length--;
                }
                System.out.println(status+"   "+copy);
                System.out.println(movie.incorrect);
                System.out.println("");
                if(movie.length==0){
                    System.out.print("Congrats! The movie was"+moviename);

                }
            }
        }
        public static boolean check(char character){
          return (moviename.indexOf(character)>=0);

        }

        public static void wrong(char character){
            movie.incorrect+=character;

            System.out.println(status+"   "+copy);
            System.out.println(movie.incorrect);
        }

        public static int nooflines(String location) throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader(location));
            int lines = 0;
            while (reader.readLine() != null) lines++;
            reader.close();
            return lines;
        }
    }

