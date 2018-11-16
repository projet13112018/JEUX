public class PieceDominoGommette extends PieceDomino {
  final Part a, b;
   public PieceDominoGommette(int va,int ca, int va2, int ca2){
     this.a = new PartGommette(va,ca);
     this.b = new PartGommette(va2,ca2);
   }
   void afficher();

}
