package com.client;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.client.socket.NonSslSocket;

@SpringBootApplication
public class XpmClientApplication {

	public static void main(String[] args)throws InterruptedException {
		String host = "127.0.0.1";
		int port = 9999;
		
		try {
			System.out.println("메세지길이:" );
			Scanner sc = new Scanner (System.in);
			
			int messageLength = Integer.parseInt(sc.nextLine());
			
			NonSslSocket socket = new NonSslSocket(host,port);
			socket.run(messageLength);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
