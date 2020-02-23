class Triangulo {
  
  double ladoA, ladoB, ladoC;
  
  public void carregaValores(double a, double b, double c) {
    if (a < b + c && b < a + c && c < a + b) {
      ladoA = a;
      ladoB = b;
      ladoC = c;
    }
    else {
      System.out.println("N�o � Tri�ngulo!");
    }
  }
  
  public double area() {
    double p = (ladoA + ladoB + ladoC) / 2;
    double area = Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    return area;
  }
  
  public void classifica() {
    
    
    if (ladoA == ladoB && ladoB == ladoC) {
      System.out.println("Tri�ngulo Equil�tero");
    } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
      System.out.println("Tri�ngulo Is�sceles");
    } else {
      System.out.println("Tri�ngulo Escaleno");
    }
  }
}