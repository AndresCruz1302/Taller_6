
package Taller6;

public class Paciente {
    int codigo;
    protected String motivoC;
    protected String nombre;
    protected String apellidos;
    protected String sexo;
    protected String fecha;
    protected String lugar;
    protected String med;
    protected String direccion;
    protected String dia;
    protected String mes;
    protected String año;
   public void pacient(){    
       
       System.out.println("Infomración del paciente:");
       System.out.println("  •Codigo:" +" "+ codigo);
       System.out.println("  •Nombres:" +" "+ nombre );
       System.out.println("  •Apellidos:" +" "+ apellidos);
       System.out.println("  •Sexo:" +" "+ sexo);
       System.out.println("  •Direccion:"+" "+direccion);                            
    
       System.out.println("  •Lugar de atencion" + " " + lugar);
       System.out.println("  •Motivo de consulta:" + " " + motivoC);
       System.out.println("  •Medico:" + " " + med);
       System.out.println("  •Fecha:"+dia+"/"+mes+"/"+año);

   
       }
   }

