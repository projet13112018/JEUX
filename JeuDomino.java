import java.util.Scanner;
import java.util.ArrayList;
public class JeuDomino{
  Plateau table;
  Joueur[] joueurs;
   Scanner sc = new Scanner(System.in);

  public JeuDomino(){
    this.table = new Plateau();
    System.out.println("Nombre de joueur: ");
    int nbjoueur = sc.nextInt(); //AJOUTER UNE EXCEPTION
    joueurs = new Joueur[nbjoueur];
  }


  public ArrayList<PieceDomino> initialisePackDomino(){ //LES 28 DOMINOS
    ArrayList<PieceDomino> a = new ArrayList<PieceDomino>();
    int i = 0;
    int tmp = 0;
    int b= 0;
    while( i <28){
      for( int   j = b; j < 7 ; j++ ){
        a.add( new PieceDominoNormal(tmp,j));
        i++;
      }
      b++;
      tmp++;
    }
    return  a;
  }


  public void initialiseMainJoueur();








}
