package com.company.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Connexion {

    private String serverName;
    private String name;
    final int port = 8085;
    Socket socket;
    final Scanner scan = new Scanner(System.in);


    public Connexion(){
        System.out.print("Client ou Server ? ");
        String status = scan.nextLine();
        switch (status){
            case "client": asClient();
            case "server": asServer();
            default:asServer();
        }
    }

    public void asClient(){
        System.out.print("Nom du serveur: ");
        serverName = scan.nextLine();
        try {
            socket = new Socket(serverName, port);
            System.out.println("Connexion etablished");
            System.out.print("Votre nom: ");
            name = scan.nextLine();
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }

    public void asServer(){
        try {
            socket = new ServerSocket(port).accept();//ouverture du port choisi
            System.out.println("Connexion etablished");
            System.out.print("Votre nom: ");
            name = scan.nextLine();
        } catch (IOException e) {
            System.err.println(e.toString());
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public String getName(){
        return name;
    }
}
