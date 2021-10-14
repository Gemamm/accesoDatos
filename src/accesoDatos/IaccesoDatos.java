package accesoDatos;


public interface IaccesoDatos {
    // ES ESTATICA Y FINAL AUNQUE NO SE DEFINA.
    int MAX_REGISTRO = 10;
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    // todos estos metodos son abstractos y publicos por defecto.
    
}
