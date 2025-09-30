
public class Ejecutar{
    public static void main(String[] args){

        OperacionesMatematicas objOpe = new OperacionesMatematicas(5, 0);

        System.out.println(objOpe.sumar());
        System.out.println(objOpe.restar());
        System.out.println(objOpe.multiplicar());
        System.out.println(objOpe.dividir());

         
    }
}