package collection;

public class Stackk{
    private int[] stack;
    private int maxsize;
    private int top=-1;

    Stackk(int size){
        stack=new int[size];
        maxsize=size;
    }
    public boolean isEmpty(){
         if( top==-1){
            return true;
         }
         return false;
    }
    public boolean isFull(){
        if(top==maxsize-1){
            return true;
        }
        return false;
    }

    public void push(int data){
        if (isFull()){
            System.out.println("Stack OverFlow");
            return;
        }
        stack[++top]=data;
    }
    
    public int pop(){
        if(isEmpty()){
               System.out.println("Stack is Underflow");
               return top;
        }
        return stack[top--];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" ");
        }

    }
    

}
package collection;

public class Stack1 {
    public static void main(String [] args){
    Stackk s1=new Stackk(5);
    Stackk s2=new Stackk(5);
    Stackk output=new Stackk(10);
    Stackk output2=new Stackk(10);
    s1.push(2);
    s1.push(4);
    s1.push(6);
   s1.push(8);
   s1.push(10);
    System.out.println("Stack 1:");
    s1.display();
    s2.push(1);
    s2.push(3);
    s2.push(5);
    s2.push(7);
    s2.push(9);
    System.out.println("Stack 2:");
    s2.display();
   while(! s1.isEmpty()&&!s2.isEmpty()){
   int v1=s1.pop();
   int v2=s2.pop();
   if(v1+v2 %2==0){
       output.push(v1);
       output.push(v2);
   }
   else{
    output.push(v2);
       output.push(v1);
   }
    
  }
System.out.println(".......");
  while(!output.isEmpty()){
    int v3=output.pop();
     output2.push(v3);
  }
  output2.display();

}
}


