class Main {
    public static void main(String[] args) {
        int fn=5;
        int ln=20;
        for(int i=fn;i<=ln;i++){
            int  count=0;
            for( int j=1;j<=i;j++){
                if(i%j==0)
                count++;
            }
            if(count==2)
             System.out.println(i);
            }
        }
    
    }
