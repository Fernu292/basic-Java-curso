public class updatingVariables {
    public static void main(String[] args){
        int salary = 1000;
        //Bono de $200
        salary+=200;
        System.out.println(salary);

        //pension : $50 de descuento
        salary-=50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //Comida $45
        salary+=(30*2)-(45);
        System.out.println(salary);

        //Actualizando strings, concatenando

        String employeeName = "Luis Fernando";
        employeeName += " Nuñez";

        System.out.println(employeeName);

        employeeName+= " Rangel";
        System.out.println("Tu nombre es: "+employeeName);

    }
}
