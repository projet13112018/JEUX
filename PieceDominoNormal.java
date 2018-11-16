public class PieceDominoNormal extends PieceDomino {

  public PieceDominoNormal(int va, int vb){
    super(va, vb);
  }

  public void afficher(){
    if(inverse)
      System.out.print(partA.toString() + "|"+ partB.toString() );
    else
      System.out.print(partB.toString() + "|" +partA.toString() );
  }
  public void inverser(){
    this.inverse = true;
  }
}
