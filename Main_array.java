public class Main_array {
    public static void main(String[] args) throws Exception {
        String[] colours={ "blue", "red","brown","white","black"};
        System.out.println(colours[0]);
        colours[2]="grey";
        System.out.println("the colour change: " + colours[2]);
        System.out.println(colours.length);// colours.length
    //    for(int i=0 ;i<=colours.length;i++){
      //      System.out.println("All the colours are: " + colours[i]);
        
        for(String i: colours){
            System.out.println(i);
        }

}
}

