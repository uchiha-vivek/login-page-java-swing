package com.login;

 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements Action {

     JFrame  frame =new JFrame();
     JButton loginButton = new JButton("LOGIN");
     JButton resetButton = new JButton("RESET");
     JTextField userIdField = new JTextField();
     JPasswordField passwordField = new JPasswordField();
     JLabel userIdLabel= new JLabel("userId:");
     JLabel passwordLabel = new JLabel("password:");
     JLabel messageLabel = new JLabel("TEST");

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> logInfoOriginal){
        loginInfo =logInfoOriginal;
             
          userIdLabel.setBounds(50,100,75,25);
          passwordLabel.setBounds(50,150,75,25);
           
          messageLabel.setBounds(125,250,250,35);
          messageLabel.setFont(new Font(null,Font.ITALIC,25));
          userIdField.setBounds(125,100,200,25);
          passwordField.setBounds(125,150,200,25);
          loginButton.setBounds(125,200,100,25);
          loginButton.addActionListener(this);
          loginButton.setFocusable(false);
          resetButton.setBounds(225,200,100,25);
          resetButton.addActionListener(this);
          resetButton.setFocusable(false);
          frame.add(loginButton);
          frame.add(resetButton);
          frame.add(userIdField);
          frame.add(passwordField);
          frame.add(userIdLabel);
          frame.add(passwordLabel);
          frame.add(messageLabel);
          frame.setSize(400,400);
          frame.setLayout(null);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPropertyChangeListener'");
    }

    @Override
    public Object getValue(String arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValue'");
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEnabled'");
    }

    @Override
    public void putValue(String arg0, Object arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putValue'");
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePropertyChangeListener'");
    }

    @Override
    public void setEnabled(boolean arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEnabled'");
    }

}
