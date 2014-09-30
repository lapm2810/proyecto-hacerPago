

package proyectosistemadepago;



public class Pago extends Object{
    
 public Pago(){
     System.out.println("a ver si es cierto que aparezco");
 }
    public float hacerPago(int horasTrabajadas,float sueldo){
        float pago=horasTrabajadas*sueldo;
        return pago;
    }
    
}
