package accesoDatos;

public class ImplementacionMysql implements IaccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde Mysql");
    }

}
