public class test{

  public static void printTab(int[][] a){
    for(int i = 0; i <a.length ; i++)
        System.out.println(i+1+ ":   "+a[i][0] +  " | "+ a[i][1]);
  }
  public static void initialse(int[][] a){
    int i = 0;
    int tmp = 0;
    int b= 0;
    while( i <28){
      for( int   j = b; j < 7 ; j++ ){
        a[i][0]= tmp;
        a[i][1]=j;
        i++;
      }
      b++;
      tmp++;
    }
  }


  public static void main(String[] args){
    int[][] tab = new int[28][2];
    initialse(tab);
    printTab(tab);
  }
}
