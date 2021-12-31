public class IfStatement {
    public static void main(String [] args){
        boolean isBluetoothEnabled = true;
        int flieSended = 3;
        if (isBluetoothEnabled){
            flieSended++;
            System.out.println("Archivo enviado");
        }

        //Operadores Logicos

        //AND

        if(isBluetoothEnabled && flieSended>=3){
            System.out.println("Bluetooth activado y datos enviados");
        }
        //OR
        if(isBluetoothEnabled || flieSended==3){
            System.out.println("Bluetooth o archivos enviados");
        }

        //Switch case

        switch (flieSended){
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            case 4:
                System.out.println("El numero es 4");
                break;
        }
    }
}
