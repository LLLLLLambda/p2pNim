package com.company.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client {
    private JPanel ui_panelCard;
    private JPanel ui_panelHome;
    private JButton ui_buttonServer;
    private JButton ui_buttonClient;
    private JPanel ui_panelLogin;
    private JTextField ui_textfieldIP;
    private JTextField ui_textfieldPort;
    private JLabel ui_labelIP;
    private JButton ui_buttonAnnule;
    private JButton ui_buttonValider;

    public Client() {
        ui_buttonServer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui_labelIP.setVisible(false);
                ui_textfieldIP.setVisible(false);
                ui_panelHome.setVisible(false);
                ui_panelLogin.setVisible(true);
            }
        });
        ui_buttonClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui_panelHome.setVisible(false);
                ui_panelLogin.setVisible(true);
            }
        });
        ui_buttonValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //recover data
                //griser et mettre un loading
                //appeler le fonction en back
                //fin du loading et agir en fonction de la reponse
            }
        });
        ui_buttonAnnule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui_panelHome.setVisible(true);
                ui_panelLogin.setVisible(false);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public JPanel getUi_panelCard() {
        return ui_panelCard;
    }
}
