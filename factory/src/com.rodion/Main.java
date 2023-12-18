package com.rodion;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new WindowDialog();
        dialog.render();

        dialog = new WebDialog();
        dialog.render();
    }
}