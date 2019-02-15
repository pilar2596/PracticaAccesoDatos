
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pilar
 */
public class GestorConexion {

    Connection conn1;
    String cadenaResult = "";

    public GestorConexion() {

        conn1 = null;

        try {

            String url1 = "jdbc:mysql://localhost:3306/papeleria";
            String user = "root";
            String password = "";

            conn1 = (Connection) DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Conectado a papeleria...");

            }
        } catch (SQLException ex) {
            System.out.println("ERROR: direccion o usuario/clave no valida");
            ex.printStackTrace();
        }

    }

    public void cerrar_conexion() {

        try {
            conn1.close();
            System.out.println("Conexion cerrada");
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexion");
            ex.printStackTrace();
        }

    }

    public void insertarCliente(String dni, String nombre, String apellido, String telefono, String direccion, String correo) {
        try {
            conn1.setAutoCommit(false);

            Statement sta = conn1.createStatement();

            sta.executeUpdate("INSERT INTO cliente VALUES('" + dni + "', '" + nombre + "', '" + apellido + "', '" + telefono + "', '" + direccion + "', '" + correo + "')");

            System.out.println("Cliente creado");

            sta.close();

            conn1.commit();
        } catch (Exception e) {
            System.out.println("Se ha producido un error");

            try {
                if (conn1 != null) {
                    conn1.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
                cadenaResult = se2.toString();
            }

            e.printStackTrace();
            cadenaResult = e.toString();
        }
    }

    public void insertarProducto(String codigo, String nombre, String precio, String descripcion, String stock) {
        try {
            conn1.setAutoCommit(false);
            Statement sta = conn1.createStatement();

            sta.executeUpdate("INSERT INTO producto VALUES('" + codigo + "', '" + nombre + "', '" + precio + "', '" + descripcion + "', '" + stock + "')");
            System.out.println("producto insertado");

            sta.close();
            conn1.commit();

        } catch (Exception e) {
            System.out.println("Error al insertar el producto");

            try {
                if (conn1 != null) {
                    conn1.rollback();

                }

            } catch (Exception se2) {
                se2.printStackTrace();
                cadenaResult = se2.toString();

            }
            e.printStackTrace();
            cadenaResult = e.toString();
        }
    }
    
     public void insertarCompra(String nTicket, String dni_Cliente, String codigo_producto, String fecha, String cantidad, String precio) {
        try {
            conn1.setAutoCommit(false);

            Statement sta = conn1.createStatement();

            sta.executeUpdate("INSERT INTO compra VALUES('" + nTicket + "', '" + dni_Cliente + "', '" + codigo_producto + "', '" + fecha + "', '" + cantidad + "', '" + precio + "')");

            System.out.println("compra creado");

            sta.close();

            conn1.commit();
        } catch (Exception e) {
            System.out.println("Se ha producido un error");

            try {
                if (conn1 != null) {
                    conn1.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
                cadenaResult = se2.toString();
            }

            e.printStackTrace();
            cadenaResult = e.toString();
        }
    }

    public void ActualizarProducto(String codigo, String nombre, String precio, String descripcion, String stock) {
        try {
            conn1.setAutoCommit(false);
            Statement sta = conn1.createStatement();

            sta.executeUpdate ("UPDATE producto SET  nombre = '"+ nombre+"', precio = '"+precio+"',   descripcion = ' "+descripcion+"',  stock = '"+stock+"' WHERE codigo= '"+codigo+"'");
            System.out.println("producto actulizado");

            sta.close();
            conn1.commit();

        } catch (Exception e) {
            System.out.println("Error al modificar el producto");

            try {
                if (conn1 != null) {
                    conn1.rollback();

                }

            } catch (Exception se2) {
                se2.printStackTrace();
                cadenaResult = se2.toString();

            }
            e.printStackTrace();
            cadenaResult = e.toString();
        }
    }
    
    
    public void ActualizarCliente (String dni, String nombre, String apellido, String telefono, String direccion, String correo){
         try {
            conn1.setAutoCommit(false);
            Statement sta = conn1.createStatement();

            sta.executeUpdate ("UPDATE producto SET  nombre = '"+ nombre+"', apellido = '"+apellido+"',   telefono = ' "+telefono+"',  direccion = '"+direccion+"' WHERE dni= '"+dni+"'");
            System.out.println("producto actulizado");

            sta.close();
            conn1.commit();

        } catch (Exception e) {
            System.out.println("Error al modificar el producto");

            try {
                if (conn1 != null) {
                    conn1.rollback();

                }

            } catch (Exception se2) {
                se2.printStackTrace();
                cadenaResult = se2.toString();

            }
            e.printStackTrace();
            cadenaResult = e.toString();
        }
        
    }
    
    public void ActualizarCompra (String nTicket, String dni_Cliente, String codigo_producto, String fecha, String cantidad, String precio){
         try {
            conn1.setAutoCommit(false);
            Statement sta = conn1.createStatement();

            sta.executeUpdate ("UPDATE producto SET  dni_Cliente = '"+dni_Cliente+"',   codigo_producto = ' "+codigo_producto+"',  fecha = '"+fecha+"', cantidad ='"+cantidad+"', precio = '"+precio+"'  WHERE nTicket= '"+nTicket+"'");
            System.out.println("producto actulizado");

            sta.close();
            conn1.commit();

        } catch (Exception e) {
            System.out.println("Error al modificar el producto");

            try {
                if (conn1 != null) {
                    conn1.rollback();

                }

            } catch (Exception se2) {
                se2.printStackTrace();
                cadenaResult = se2.toString();

            }
            e.printStackTrace();
            cadenaResult = e.toString();
        }
        
    }

    public void bajaCliente(String dni) {
        try {
            conn1.setAutoCommit(false);
            Statement sta = conn1.createStatement();
            sta.executeUpdate("DELETE FROM  cliente WHERE dni like " + dni);

            System.out.println("cliente borrado");

            sta.close();
            conn1.commit();

        } catch (Exception e) {
            System.out.println("Error al dar de bajael cliente");

            try {
                if (conn1 != null) {
                    conn1.rollback();

                }

            } catch (Exception se2) {
                se2.printStackTrace();
                cadenaResult = se2.toString();

            }
            e.printStackTrace();
            cadenaResult = e.toString();
        }
    }

    public void bajaProducto(String codigo) {
        try {
            conn1.setAutoCommit(false);
            Statement sta = conn1.createStatement();
            sta.executeUpdate("DELETE FROM  producto WHERE codigo like " + codigo);

            System.out.println("producto borrado");

            sta.close();
            conn1.commit();

        } catch (Exception e) {
            System.out.println("Error al dar de baja el producto");

            try {
                if (conn1 != null) {
                    conn1.rollback();

                }

            } catch (Exception se2) {
                se2.printStackTrace();
                cadenaResult = se2.toString();

            }
            e.printStackTrace();
            cadenaResult = e.toString();
        }
    }

    public String consulta_Statement() {
        String error = "error";

        try {
            conn1.setAutoCommit(false);
            Statement sta = conn1.createStatement();

            String query = "SELECT * FROM Cliente ";
            ResultSet rs = sta.executeQuery(query);
            ResultSetMetaData metaDatos = rs.getMetaData();

            int numColumnas = metaDatos.getColumnCount();

            return cadenaResult;

        } catch (Exception e) {
            System.out.println("error");

            try {
                if (conn1 != null) {
                    conn1.rollback();
                }
            } catch (Exception se2) {
                se2.printStackTrace();
            }
            e.printStackTrace();
            return error;

        }

    }
}
