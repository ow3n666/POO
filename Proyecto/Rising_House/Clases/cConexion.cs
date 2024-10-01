using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Rising_House.Clases
{
    internal class cConexion
    {
        //Se define la ruta de la basse de datos
        static private string CadenaConexion = @"Data Source=LAPTOP-SNJOLGBC\SQLEXPRESS;Initial Catalog=COMPRA_VENTA_;Integrated Security=True";

        //Definir una variable para cargar la base de datos
        private SqlConnection Conexion = new SqlConnection(CadenaConexion);


        //Metódo para abrir la base de datos
        public SqlConnection AbrirConexion()
        {
            if (Conexion.State == ConnectionState.Closed)
                Conexion.Open();
            return Conexion;
        }


        //Metódo para cerrar la base de datos
        public SqlConnection CerrarConexion()
        {
            if (Conexion.State == ConnectionState.Open)
                Conexion.Close();
            return Conexion;
        }
    }
}
