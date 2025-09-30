import java.util.Scanner;

public class OperacionesMatematicas {

    private int num1, num2;

    public OperacionesMatematicas(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumar(){
        return num1 + num2;
    }

    public int restar(){
        return num1 - num2;
    }

    public int multiplicar(){
        return num1 * num2;
    }

    public double dividir(){
        double resultado;
        if (num2 == 0){
            resultado = 0.0;
        }
        else {
        return num1 / num2;
        }
        return resultado;
    }

public class OperMate {
     public int leerEnteros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer valor: ");
        int num1 = sc.nextInt();
        sc.close();
        return num1;
    }
}
   

}
