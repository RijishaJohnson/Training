import java.util.*;
class Main{
    public static void main(String[]args){
      Scanner in=new Scanner(System.in);
      System.out.print("Enter a sentence:");
      String sen=in.nextLine();
      String[] word=sen.split(" ");
      StringBuilder rev=new StringBuilder();
      for(int i=word.length-1;i>=0;i--){
          rev.append(word[i]).append(" ");
      }
      System.out.println("reversed  String:"+rev.toString().trim());
    }
}