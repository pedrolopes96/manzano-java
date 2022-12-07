import java.util.Scanner;

class calculadora {
  
  public static void recebeMtz(int mtzA[][], int mtzB[][]){
    Scanner sc = new Scanner(System.in);
    int lA, cA, cB, l, c;
    
    lA = mtzA.length;
    cA = mtzA[0].length;
    cB = mtzB[0].length;

    for(l=0;l<lA;l++)
      for(c=0;c<cA;c++){
        System.out.println("Digite o elemento A" + (l+1) + (c+1) + " da Matriz A");
        mtzA[l][c] = sc.nextInt();
      }

    for(l=0;l<cA;l++)
      for(c=0;c<cB;c++){
        System.out.println("Digite o elemento B" + (l+1) + (c+1) + " da Matriz B");
        mtzB[l][c] = sc.nextInt();
      }
    
    
  }
  public static void multMtz(int mtzA[][], int mtzB[][], int mtzX[][]){
    int lA, cA, cB, l, c, x, result = 0;
    lA = mtzA.length;
    cA = mtzA[0].length;
    cB = mtzB[0].length;
    
    for(l=0;l<lA;l++){
      for(c=0;c<cB;c++){
        for(x=0;x<cA;x++){
          result = result + mtzA[l][x]*mtzB[x][c];
        }
        mtzX[l][c] = result;
        result = 0;
      }
    }

    System.out.println("O produto das matrizes é:");
    for(l=0;l<lA;l++){
      for(c=0;c<cB;c++)
        System.out.print(mtzX[l][c] + "\t");
      System.out.println("\n");
    }
  }
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int lA, cA, cB, l, c;
    
    do{
      System.out.println("Digite a quantidade de linhas da matriz A (1/10)");
      lA = sc.nextInt();
      if (lA > 10 || lA < 1)
        System.out.println("Digite um número valido para as linhas");
    }while(lA > 10 || lA < 1);
    do{
      System.out.println("Digite a quantidade de colunas da matriz A (1/10)");
      cA = sc.nextInt();
      if (cA > 10 || cA < 1)
        System.out.println("Digite um número valido para as colunas de A");
    }while(cA > 10 || cA < 1);
    System.out.println("A matriz A é " + lA + "x" + cA);
    System.out.println("A matriz B deve ter " + cA + " linhas");
    do{
      System.out.println("Digite a quantidade de colunas da matriz B (1/10)");
      cB = sc.nextInt();
      if (cB > 10 || cB < 1)
        System.out.println("Digite um número valido para as colunas de B");
    }while(cB > 10 || cB < 1);
    System.out.println("A matriz B é " + cA + "x" + cB);
    System.out.println("A matriz resultante será " + lA + "x" + cB);

    int mtzA [][] = new int [lA][cA];
    int mtzB [][] = new int [cA][cB];
    int mtzX [][] = new int [lA][cB];
    
    recebeMtz(mtzA,mtzB);
    multMtz(mtzA, mtzB, mtzX);
  }
}