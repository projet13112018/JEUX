import java.util.ArrayList;
import java.util.Scanner;
public class Joueur{
  String pseudo ;
  ArrayList<PieceDomino> dominos = new ArrayList();
  Scanner sc = new Scanner(System.in);
  public Joueur(ArrayList d ){
    this.pseudo = sc.nextLine();
    dominos = d;
  }




}
