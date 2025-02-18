import java.util.*;
class Main {
    public static void main(String[] args) {
        String a="abcabcabc";
        char[] b=a.toCharArray();
        int[] c=new  int[b.length];
        int count=0;
        int index;
        boolean[] d=new boolean[26];
        for(int i=0;i<26;i++){
            d[i]=false;
        }
        for(int i=0;i<b.length;i++){
            index=(int)b[i]-97;
            d[index]=true;
        }
        for(int i=0;i<26;i++){
            if(d[i]==true)
            count++;
        } 
        System.out.println(count);
        
}
}
