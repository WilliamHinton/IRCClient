import java.io.*;

public class ClientMain {
  public static void main(String[] args) throws IOException{
    if(args.length < 1){
      System.out.println("Please enter a port number.");
      System.exit(1);
    }

    int portNumber = Integer.parseInt(args[1]);

    String serverName = args[0];

    Thread t = new testServer(portNumber);
    t.start();
    GreetingClient client = new GreetingClient(portNumber, serverName);
  }
}
