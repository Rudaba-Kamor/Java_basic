public class Forloop {
    public static void main(String[] args) throws Exception {
       for(int i=0;i<=100;i++)
       {
        if(i==64){
            break;
        }
        System.out.println(i);
       }
       System.out.println("new line new program");

      int[] numbers={1,2,3,4,5,6};
      for( int i:numbers){
        System.out.println(i);
       }

    }    
}
