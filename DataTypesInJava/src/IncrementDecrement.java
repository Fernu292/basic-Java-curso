public class IncrementDecrement {
    public static void main(String[] args){
        int lives = 5;
        lives-=1;

        System.out.println(lives);//4

        //Posfija de operadores
        lives--;//Decremento

        System.out.println(lives);//3

        lives++;//Incremento

        System.out.println(lives);//4

        //Prefija de operadores
        int gift = 100+ lives++;//posfijo accede al  valor antes del incremento
        System.out.println(gift);
        System.out.println(lives);

        gift = 100+ ++lives;//prefijo hace el incremento primero de la variable

    }
}
