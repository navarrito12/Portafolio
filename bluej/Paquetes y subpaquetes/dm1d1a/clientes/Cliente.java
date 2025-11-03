package dm1d1a.clientes;

// import proveedores.preferentes.ProveedorPreferente;
// import fidelizados.ClienteFidelizado;
import dm1d1a.fidelizados.ClienteFidelizado;

public class Cliente
{
    public Cliente() {
        System.out.println("Soy un cliente de la clase Cliente del paquete clientes");
        // ProveedorPreferente pp1=new ProveedorPreferente();
        ClienteFidelizado cf1=new ClienteFidelizado();        
    }
}
