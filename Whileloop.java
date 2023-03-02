import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.event.SwingPropertyChangeSupport;

public class Whileloop {
    public static void main(String[] args) throws Exception {
        int i=0;
        do{
            System.out.println("the number is :" + i);
            i++;
        }
        while(i<=10)  ;
    }
 
}  

