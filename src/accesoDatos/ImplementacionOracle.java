
package accesoDatos;


public class ImplementacionOracle implements IaccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde Oracle");
    }
    
    
    
}
