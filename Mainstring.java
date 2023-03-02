import javax.swing.plaf.basic.BasicGraphicsUtils;

public class Mainstring {
    public static void main(String[] args) throws Exception {
        String txt="My bag is pink in colour";
        System.out.println("the length is: "+ txt.length());
        System.out.println("the upper case: " + txt.toUpperCase());
        System.out.println("the lower case: " + txt.toLowerCase());
        System.out.println("the locate a word : " + txt.indexOf("bag"));
        String sentence1= "i want";
        String sent2=" to drink water";
        System.out.println(sentence1+ sent2);    
        System.out.println(sentence1.concat(sent2));  
        String num1="22";
        String num2= "01";
        System.out.println(num1+num2);// prints string
        int a=2;
        int b=3;
        System.out.println(a+b);// prints number
        System.out.println(a+num1);// acts as string
        String txt1="It\'s a car";// "\",'\\',
        String txt2="Beautiful park unknown as \" Cloudnine\" park";
        System.out.println(txt2);
        System.out.println(txt1);
    }
}