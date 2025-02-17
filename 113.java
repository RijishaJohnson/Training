class Main {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,0};
        int i;
        int count=0;
        int prev=0;
       for(i=0;i<arr.length;i++)
      {
        if( arr[i]==1)
        {   count++;
            }
        else
        { 
            if(count>prev){
                prev=count;
             }
            count=0
       }    
               }
       if(count>prev){
           prev=count;
       } 
       System.out.print(prev);
    }  
    
}
