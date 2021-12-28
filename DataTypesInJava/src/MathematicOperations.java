public class MathematicOperations {
    public static void main(String[] args){
        double x = 2.1;
        double y = 3;

        //Redondea hacia arriba y retorna un int
        System.out.println(Math.ceil(x));
        //Redondea hacia abajo
        System.out.println(Math.floor(x));

        //Potencias
        System.out.println(Math.pow(x,3));

        //Mayor entre dos numeros
        System.out.println(Math.max(x, y));

        //Raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo
        //Pi * radio^2

        System.out.println(Math.PI * Math.pow(y,2));

        //Area de esfera 4*PI * r^2

        System.out.println(4*Math.PI * (Math.pow(y,2)));

        //Volumen de esfera
        System.out.println((4/3)+Math.PI* Math.pow(y,3));
    }
}
