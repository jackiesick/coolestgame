
public class App implements Runnable 
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i);

            try{
                Thread.sleep(1000);
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

    for(int i = 1; i <= 5; i++)
        {
            System.out.println("poes");

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }

        

        
    }
}
