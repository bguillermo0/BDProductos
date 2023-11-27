import java.sql.Connection;

public class BaseDatosProyecto {
    public static void main(String[] args) {

        //Conexión BBDD
        Connection connection = GestionDB.getConnection();

        //Insertar los productos en tabla 'productos'
        TablaProductos.getJsonFromProducts();

        //Insertar los empleados en tabla 'empleados'
        TablaTrabajadores.getJsonFromEmployees();

        //Insertar los productos en tabla 'pedidos'
        TablaPedidos.getOrders();

        //Insertar productos > 1000€ en la tabla 'products_fav'
        TablaProductosFav.getTableProductsFav();

        //Mostrar datos
        MostrarDatos.showEmployees();
        MostrarDatos.showProducts();
        MostrarDatos.showOrders();
        MostrarDatos.showProductsEconomy();
    }
}