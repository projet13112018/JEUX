abstract class PieceDomino{
  final Part partA,partB;
  boolean inverse= false;
  public PieceDomino(int va, int vb){
    this.partA = new Part(va);

    this.partB = new Part(vb);

  }
  abstract public void afficher();


  abstract public void inverser();


}
