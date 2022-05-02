package pruebas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pruebas {
    
    public static void procesaFichero(String ruta) throws FileNotFoundException{
               //ruta = ruta.replace("\\","\\\\");
        File f = new File(ruta);
        int nLinea = 0;
        boolean  camposOK = false;
        ArrayList <String> campos = new ArrayList();
        ArrayList <String> valores = new ArrayList();
	
        if (f.isFile()) {
            Scanner escaner = new Scanner(f);
            while(escaner.hasNext()) {
                nLinea++;
                String linea = escaner.nextLine();
                if (nLinea>6) {
                    if (linea.contains(":") && nLinea>6) {
                        String campo = linea.substring(0, linea.indexOf(":"));
                        String valor = linea.substring(linea.indexOf(":")+2);
                        valores.add(valor);
                         if (!camposOK)
                            campos.add(campo);  
                    }
                    else if (linea.contains("==")) {
                        camposOK = true;
            }       
                }
            }
            System.out.print("(");
            for (int i=0; i<campos.size();i++) {
                System.out.print(campos.get(i));
                if (i<campos.size()-1)
                System.out.print(",");
            }
            System.out.println(")");
            
            for (int i=1; i<valores.size() +1;i++) {
                System.out.print(valores.get(i-1));
                if (i%campos.size()==0)
                    System.out.println("");
                else 
                     System.out.print(",");      
            }
            System.out.println();
        }
        else 
            System.out.println("No existe");  
    }

    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner teclado = new Scanner(System.in);
        
        /*System.out.print("Ruta: ");
        String ruta = teclado.nextLine();*/
        
        String ruta = "C:\\listaEmpleados\\listado.txt";
        procesaFichero(ruta);

        //File f = new File("C:\\listaEmpleados\\listado.txt");
        
        

    }    
}
