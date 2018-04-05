import java.io.*;

public class ClientMain {
  public static void main(String[] args) throws IOException{
    if(args.length < 1){
      System.out.println("Please enter a port number.");
      System.exit(1);
    }

    try {
      int portNumber = Integer.parseInt(args[0]);
    } catch (NumberFormatException n) {
      n.printStackTrace();
    }

    String serverName = args[1];

    GreetingClient client = new GreetingClient(portNumber, serverName);

  }
}
