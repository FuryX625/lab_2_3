class Main {
  public static void main(String[] args) {
    int wielkosc=5, linia;
    for(linia=wielkosc;linia>0;linia--){
      for(int kolumna=linia;kolumna>0;kolumna--){
       System.out.print(" "); 
      }
      for(int i=2*(wielkosc-linia)+1;i>0;i--){
        System.out.print("*");  
      }
      System.out.print("\n");
      
    }
  }
}