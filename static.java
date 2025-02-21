import java.util.*;
class Main {
  
    public static void main(String[] args) {
        Outer.Inner obj=new Outer.Inner();
        obj.get();
        }
}

class Outer{
  static class Inner{
   static int f=5;
    static void get(){
      for(int i=1;i<=f;i++){
        for( int j=1;j<=i;j++){
          if(j==2||j==4){
            System.out.print("# ");
          }
          else{
            System.out.print("* ");
          }
        }
          System.out.println();
        
    }
  }
}
  }
