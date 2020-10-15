package com.company.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Jeu {

    private int nbBaton;
    private Player player1;
    private Player player2;
    private Socket socket;
    private InputStream in;
    private OutputStream out;

    public Jeu(Socket socket) throws IOException {
        this.socket = socket;
        this.in = socket.getInputStream();
        this.out = socket.getOutputStream();
        this.nbBaton = 21;

    }

    public void tirerBaton(Player player, int nb){
        this.nbBaton -= nb;
        if(this.nbBaton == 0){
            System.out.println("player a gagné !");
        }
    }

    public String read() throws IOException {

        String str = new String();
        int length = in.read();
        byte[] message = new byte[length];
        for(int i=0; i < length; i++){
            in.read(message, i, 1);
        }
        return str;
    }



}
