package GameEngineSystem;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class IPAddress {
    
    public static void getAddress() throws UnknownHostException {
   
        InetAddress addr = InetAddress.getLocalHost(); //address of client
        String ipAddress = addr.getHostAddress(); //* ip number of client
        System.out.println("IP address" + ipAddress); //testing print ip
        
        String hostname = addr.getHostName(); //name of the client
        System.out.println("Name of hostname : " + hostname); //testing print name
     
    }
    
}
