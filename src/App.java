import java.io.*;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class App implements Runnable 
{
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void run()
    {

        for(double i = 1; i <= 10; i += 0.01)
        {
            System.out.print("\r" + df.format(i));


            try{
                TimeUnit.MILLISECONDS.sleep(10); 
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args)
    {
        new GUI();

        GUI.create();
        Runnable r1 = new App();

    Thread timer = new Thread(r1);
    timer.start();

    }
}
