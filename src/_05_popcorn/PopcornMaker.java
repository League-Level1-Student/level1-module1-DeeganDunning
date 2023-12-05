package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
String minutes =	JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
String flavor = JOptionPane.showInputDialog("What flavor do you want?");
Popcorn pc = new Popcorn(flavor);
Microwave mw = new Microwave();
int time =  Integer.parseInt(minutes); 

mw.putInMicrowave(pc);
mw.setTime(time);
mw.startMicrowave();





}
}
