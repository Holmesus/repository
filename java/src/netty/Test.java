package netty;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("10.51.130.158",9777);
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true); 
		out.print("{\"11\":\"111\"}");
		out.flush();
        socket.shutdownOutput();//关闭输出流
	}
}
