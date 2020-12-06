
package Reloj;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Valmir Junior
 */
public class Reloj extends Thread{
    private JLabel hora;
    public Reloj (JLabel hora){
        this.hora=hora;
        
    }
    public void run(){
        while (true){
            Date hoy = new Date ();
            SimpleDateFormat s=new SimpleDateFormat ("hh:mm:ss");
            hora.setText(s.format(hoy));
            try{sleep(1000);
                
            }catch(Exception ex){
            
            }
        }
    }
}

    

    
    

