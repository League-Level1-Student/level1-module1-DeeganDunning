package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
String minutes =	JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
String flavor = JOptionPane.showInputDialog("What flavor do you want?");
Popcorn pc = new Popcorn(flavor);



}
}
