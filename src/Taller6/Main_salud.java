

package Taller6;

import java.util.Scanner;

public class Main_salud {
        public static void main(String[] args) {
            Scanner a=new Scanner(System.in);
            Paciente salud=new Paciente();
            Medico b= new Medico();
            Csalud c=new Csalud();
            String p="si";
            System.out.println("Si desea consultar la informacion escriba: ");
            System.out.println("1. Paciente, 2. Medico, 3. Centro");
            String info=a.next();
            if("Paciente".equalsIgnoreCase(info)){ 
                         while("si".equalsIgnoreCase(p)){
                             System.out.println("Codigo");
                            salud.codigo=a.nextInt();
                            System.out.println("Apellidos");
                            salud.apellidos=a.next();
                            System.out.println("Nombre");
                            salud.nombre=a.next();
                            System.out.println("Sexo");
                            salud.sexo=a.next();
                            System.out.println("Direccion(evite usar espacios o caracteres especiales)");
                            salud.direccion=a.next();
                            System.out.println("Lugar");
                            salud.lugar=a.next();
                            System.out.println("Motivo de consulta");
                            salud.motivoC=a.next();
                            System.out.println("Medico que lo atendio");
                            salud.med=a.next();
                            System.out.println("Fecha");
                                System.out.println("Dia");
                            salud.dia=a.next();
                                System.out.println("Mes");
                            salud.mes=a.next();
                                System.out.println("Año");
                            salud.año=a.next();    
                             salud.pacient();
                         System.out.println("¿desea ingresar otro paciente? (si/no)");
                         p=a.next();
                         }
           }
            if("Medico".equalsIgnoreCase(info)){ 
                
                        System.out.println("Nombre del medico");
                        b.med=a.next();
                        
                        while("si".equalsIgnoreCase(p)){
                            System.out.println("Información del paciente:");
                                    System.out.println("Codigo");
                                    b.codigo=a.nextInt();
                                    System.out.println("Apellidos");
                                    b.apellidos=a.next();
                                    System.out.println("Nombre");
                                    b.nombre=a.next();
                                    System.out.println("Sexo");
                                    b.sexo=a.next();
                                    System.out.println("Direccion(evite usar espacios o caracteres especiales)");
                                    b.direccion=a.next();
                                    System.out.println("Lugar");
                                    b.lugar=a.next();
                                    System.out.println("Motivo de consulta");
                                    b.motivoC=a.next();
                                    System.out.println("Fecha");
                                        System.out.println("Dia");
                                    b.dia=a.next();
                                        System.out.println("Mes");
                                    b.mes=a.next();
                                        System.out.println("Año");
                                    b.año=a.next();  
                                     b.pacient();
                                    System.out.println("¿desea ingresar otro paciente? (si/no)");
                                    p=a.next();
                                    if("si".equalsIgnoreCase(p)){
                                    System.out.println("¿desea ingresar otro Medico? (si/no)");
                                    String z=a.next();
                                    if("si".equalsIgnoreCase(z)){
                                         System.out.println("Nombre del medico");
                                         b.med=a.next();
                                         
                                    }
                        }
           
              }
            }
            if("centro".equalsIgnoreCase(info)){
                        System.out.println("Nombre del centro de salud");
                        c.lugar=a.next();
                       while("si".equalsIgnoreCase(p)){
                           System.out.println("Información del paciente:");
                                    System.out.println("Codigo");
                                    c.codigo=a.nextInt();
                                    System.out.println("Apellidos");
                                    c.apellidos=a.next();
                                    System.out.println("Nombre");
                                    c.nombre=a.next();
                                    System.out.println("Sexo");
                                    c.sexo=a.next();
                                    System.out.println("Direccion(evite usar espacios o caracteres especiales)");
                                    c.direccion=a.next();
                                    System.out.println("Motivo de consulta");
                                    c.motivoC=a.next();
                                    System.out.println("Medico que lo atendio");
                                    c.med=a.next();
                                    System.out.println("Fecha");
                                        System.out.println("Dia");
                                    c.dia=a.next();
                                        System.out.println("Mes");
                                    c.mes=a.next();
                                        System.out.println("Año");
                                    c.año=a.next();        
                                    c.pacient();
                                    System.out.println("¿desea ingresar otro paciente? (si/no)");
                                    p=a.next();
                                    if("si".equalsIgnoreCase(p)){
                                    System.out.println("¿desea ingresar otro lugar de atención? (si/no)");
                                    String z=a.next();
                                    if("si".equalsIgnoreCase(z)){
                                         System.out.println("Nombre del centro de salud");
                                         b.med=a.next();
                                         
                        }
              
                     }
                 }
        
            }
        }
}
        
