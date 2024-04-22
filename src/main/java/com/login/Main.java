package com.login;

public class Main {
    public static void main(String[] args) {
        Security security = new Security();

        LoginPage loginPage = new LoginPage(security.getLoginInfo());
    }
}