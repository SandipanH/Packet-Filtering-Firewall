/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfirewall;

/**
 *
 * @author imSandipan
 */
class serverThread extends Thread
{
    public void run()
    {
        serverwindow s = new serverwindow();
    }
}
class firewallThread extends Thread
{
    public void run()
    {
        firewallwindow f = new firewallwindow();
    }
}
class clientThread extends Thread
{
    public void run()
    {
        clientwindow c = new clientwindow();
    }
}
public class Testfirewall {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        new serverThread().start();
        new firewallThread().start();
        new clientThread().start();
        
        
        
    }
    
}
