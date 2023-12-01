class Main {
  public static void main(String[] args) {
    Matrice matrix = new Matrice("quadranti");
    Vigenere vig = new Vigenere(0,26,0,26, matrix);
    Thread t = new Thread(vig);
    t.start();
    //gang
    try {
    t.join(); }
    catch (InterruptedException e) {
      System.out.println("bona");
    }
    matrix.stampa();
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un segreto!");
  }
}