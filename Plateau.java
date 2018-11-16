public class Plateau{
  Part[][] plate;

  public Plateau(){
    this.plate =new Part[20][20];
  }

  public void afficher(){
    for(int i = 0; i<20; i++){

      for(int j = 0; j<20; j++){
        if(plate[i][j] != null)
          if(plate[i][j] instanceof PartIndic)
            System.out.print("|("+plate[i][j].toString()+")" );
          else
            System.out.print("| " +plate[i][j].toString()+" ");
        else
          System.out.print("|   ");
      }
      System.out.println();
    }
  }

  public void indication(int x , int y){
    Part partTmp = new Part(plate[x][y].valeur );
    int tmp = 0;
    if(positionCorrect(x+1,y,partTmp.valeur ) ){
      tmp++;
      poserPart(x+1, y , new PartIndic(tmp), true );
        tmp++;
        poserPart(x-1, y , new PartIndic(tmp), true );
    }else if(positionCorrect(x,y+1,partTmp.valeur)){
        tmp++;
        poserPart(x, y+1 , new PartIndic(tmp), true );
    }else if(positionCorrect(x,y-1,partTmp.valeur)){
        tmp++;
        poserPart(x, y-1 , new PartIndic(tmp), true );
    }
    afficher();

  }

  public void poserPart(int x ,int y , Part p, boolean forcer){
    if(isEmpty())
      this.plate[x][y] = p;
    else{
      // System.out.println( positionCorrect(x,y,p.valeur) ) ;
      if( positionCorrect(x,y,p.valeur) || forcer)
        if(this.plate[x][y] == null)
          this.plate[x][y] = p;
    }
  }

  public void poserDomino(int x , int y , PieceDomino domino, char direction, boolean auto){
    poserPart(x,y,domino.inverse?domino.partA:domino.partB,auto);
    if(direction == 'v')
      poserPart(x,y+1,domino.inverse?domino.partB:domino.partA,auto);
    else if (direction == 'h')
      poserPart(x+1,y,domino.inverse?domino.partB:domino.partA,auto);
  }

  public boolean isEmpty(){
    for(int i = 0; i<20; i++)
      for(int j = 0; j<20; j++)
        if( plate[i][j] != null) return  false;
    return true;
  }

  public boolean positionCorrect(int x , int y, int v ){
    if( this.plate[x][y] == null){
      if( plate[x][y+1] != null )
            if( plate[x][y+1].valeur != v )
              return false;
      if( plate[x][y-1] != null )
            if(plate[x][y-1].valeur != v  )
              return false;
      if( plate[x+1][y] != null )
          if(  plate[x+1][y].valeur != v  )
            return false;
      if( plate[x-1][y] != null )
          if( plate[x-1][y].valeur != v  )
            return false;
      return true;
    }
    return  false;
  }


}
