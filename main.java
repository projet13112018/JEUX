public class main{

  public static void main( String[] args){
      //int[][] a= new tab[56][56];
      Plateau plate = new Plateau();
      PieceDominoNormal d= new PieceDominoNormal(2,5);
      plate.afficher();

      plate.poserDomino(12,12, d,'v', true);
      plate.afficher();
      plate.indication(12,12);
    //  System.out.printf("%6d | %5d | %6d", 0, 42, -12);

  }
}
