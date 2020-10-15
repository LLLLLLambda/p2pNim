package com.company.server;

import com.company.client.Client;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import javax.swing.*;

public class Main {

    private static InputStream in;
    private static OutputStream out;
    private static Socket socket;


    public static void main(String[] args) throws IOException {
        //Lancement du JFrame
        JFrame frame = new JFrame("Projet pear to pear");
        frame.setContentPane(new Client().getUi_panelCard());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Connexion connexion = new Connexion();
        Socket socket = connexion.getSocket();
        Jeu jeu = new Jeu(socket);



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