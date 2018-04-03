<<<<<<< HEAD
=======

>>>>>>> 2c263a1fda9698042c984669cade3d6e333e47d3
import java.io.*;
import java.net.*;
class UDPClient
{
<<<<<<< HEAD
   public static void main(String args[]) throws Exception
   {
      BufferedReader inFromUser =
      new BufferedReader(new InputStreamReader(System.in));
      DatagramSocket clientSocket = new DatagramSocket();
      InetAddress IPAddress = InetAddress.getByName("localhost");
      byte[] sendData = new byte[1024];
      byte[] receiveData = new byte[1024];
      boolean flag=true;
      while(flag)
       {
      String sentence = inFromUser.readLine();
      sendData = sentence.getBytes();
      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
      clientSocket.send(sendPacket);
      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
      clientSocket.receive(receivePacket);
      String modifiedSentence = new String(receivePacket.getData(),0,receivePacket.getLength());
      System.out.println("FROM SERVER:" + modifiedSentence);
       if(sentence.equals("bye"))
        flag=false;
      }
        clientSocket.close();
   }

=======
	public static void main(String args[]) throws Exception
	{
	BufferedReader inFromUser =
	new BufferedReader(new InputStreamReader(System.in));
	DatagramSocket clientSocket = new DatagramSocket();
	InetAddress IPAddress = InetAddress.getByName("localhost");
	byte[] sendData = new byte[1024];
	byte[] receiveData = new byte[1024];
	boolean flag=true;
	while(flag)
	{
		String sentence = inFromUser.readLine();
		sendData = sentence.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
		clientSocket.send(sendPacket);
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		clientSocket.receive(receivePacket);
		String modifiedSentence = new String(receivePacket.getData());
		System.out.println("FROM SERVER:" + modifiedSentence);
		if(sentence.equals("bye"))
		flag=false;
	}
	clientSocket.close();
	}
>>>>>>> 2c263a1fda9698042c984669cade3d6e333e47d3
}
