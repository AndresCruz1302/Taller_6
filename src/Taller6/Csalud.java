
package Taller6;

public class Csalud extends Paciente {
    
      @Override
      public void pacient(){
       System.out.println("  •Lugar de atencion" + " " + lugar);
       System.out.println("Infomración:");
       System.out.println("  •Codigo:" +" "+ codigo);
       System.out.println("  •Nombres:" +" "+ nombre );
       System.out.println("  •Apellidos:" +" "+ apellidos);
       System.out.println("  •Sexo:" +" "+ sexo);
       System.out.println("  •Direccion:"+" "+direccion);                            
    
       System.out.println("  •Motivo de consulta:" + " " + motivoC);
       System.out.println("  •Medico:" + " " + med);
       System.out.println("  •Fecha:"+dia+"/"+mes+"/"+año);
      }
    
}
