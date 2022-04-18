package com.client.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

import com.client.ClientSocket;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NonSslSocket {
	
	private String host;
	private int port;
	
	

	public void run(int messageLength) {

		try {
			Socket socket = new Socket();
			SocketAddress address = new InetSocketAddress(host,port);
			socket.connect(address);
		
			ClientSocket clientSocket = new ClientSocket(socket);
			clientSocket.sendFixedLength(messageLength);
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
