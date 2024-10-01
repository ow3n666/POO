using Rising_House.Clases;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Xml.Serialization;

namespace Rising_House.Formulario
{
    public partial class frmRegistrarPropiedad : Form
    {
        cConexion cn;
        SqlDataAdapter da;
        SqlCommand cmd;
        DataTable dt;
        int contador = 0, i;
        DateTime hoy;
        public frmRegistrarPropiedad()
        {
            dt = new DataTable();
            cn = new cConexion();
            hoy = DateTime.Now;
            i = 0;
            InitializeComponent();
        }

        

        void Limpiar()
        {
            txtInterior.Clear();
            txtDireccion.Clear();
            txtCiudad.Clear();
            txtSuperficie.Clear();
            txtCodPostal.Clear();
            txtEstrato.Clear();
            txtNroHabitaciones.Clear();
            txtPrecio.Clear();
            txtObservaciones.Clear();
            txtDescripcion.Clear();
            ptbImagen.Load(@"C:\Users\owen\Desktop\colegio_universidad\trabajos owen\universidad\Semestre 5\POO\Proyecto_Owen_Holguin\Proyecto\Rising_House\Images\imagen-no-disponible.jpg");
            cmbTipPropiedad.Text = string.Empty;
        }
        void llenarCombo()
        {

            SqlCommand cmd = new SqlCommand("select * from tblTipo_Propiedad", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            for (int i = 0; i < dt.Rows.Count; i++)
            {
                cmbTipPropiedad.Items.Add(dt.Rows[i][1]);
            }
        }
        private void frmRegistrarPropiedad_Load(object sender, EventArgs e)
        {
            txtCedula.Text = Var.CedulaV;
            ptbImagen.Load(@"C:\Users\owen\Desktop\colegio_universidad\trabajos owen\universidad\Semestre 5\POO\Proyecto_Owen_Holguin\Proyecto\Rising_House\Images\imagen-no-disponible.jpg");
            llenarCombo();
        }


        private void btnSubirImg_Click(object sender, EventArgs e)
        {
            DialogResult r = dlgProducto.ShowDialog();
            if (r == DialogResult.OK)
            {
                txtRuta.Text = dlgProducto.FileName;
                ptbImagen.Load(txtRuta.Text);
            }
        }

        private void btnLimpriar_Click(object sender, EventArgs e)
        {
            Limpiar();
        }

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            frmMenuPrincipal frm = new frmMenuPrincipal();
            frm.Show();
            this.Hide();
        }

        private void btnSalir_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnRegistrar_Click(object sender, EventArgs e)
        {
            byte[] img = System.IO.File.ReadAllBytes(txtRuta.Text);
            byte arriendo = 0;
            if (rdbSi.Checked == true)
            {
                arriendo = 1;
            }

          
            SqlCommand cmd2 = new SqlCommand("select IdTipo_Propiedad from tblTipo_Propiedad where Tipo_Propiedad = '" + cmbTipPropiedad.Text + "'", cn.AbrirConexion());
            da = new SqlDataAdapter(cmd2);
            dt = new DataTable();
            da.Fill(dt);
            int idtipo = Convert.ToInt32(dt.Rows[0][0].ToString());

            SqlCommand cmd = new SqlCommand("Insertar_Propiedad", cn.AbrirConexion());
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.AddWithValue("@id_Propiedad", Convert.ToInt32(txtInterior.Text));
            cmd.Parameters.AddWithValue("@Cedula", Convert.ToInt32(txtCedula.Text));
            cmd.Parameters.AddWithValue("@IdTip_Propiedad", idtipo);
            cmd.Parameters.AddWithValue("@Direccion", txtDescripcion.Text);
            cmd.Parameters.AddWithValue("@Ciudad", txtCiudad.Text);
            cmd.Parameters.AddWithValue("@Codigo_Postal", txtCodPostal.Text);
            cmd.Parameters.AddWithValue("@Superficie", Convert.ToDouble(txtSuperficie.Text));
            cmd.Parameters.AddWithValue("@Precio", Convert.ToInt32(txtPrecio.Text));
            cmd.Parameters.AddWithValue("@Fecha_publi", hoy);
            cmd.Parameters.AddWithValue("@Observaciones", txtObservaciones.Text);
            cmd.Parameters.AddWithValue("@Descripcion", txtDescripcion.Text);
            cmd.Parameters.AddWithValue("@Disponibilidad", true);
            cmd.Parameters.AddWithValue("@Estrato", Convert.ToInt32(txtEstrato.Text));
            cmd.Parameters.AddWithValue("@Nro_Habitaciones", Convert.ToInt32(txtNroHabitaciones.Text));
            cmd.Parameters.AddWithValue("@Arriendo", arriendo);
            cmd.Parameters.AddWithValue("@imgRuta", txtRuta.Text);
            cmd.Parameters.AddWithValue("@imgPropiedad", img);
            cmd.ExecuteNonQuery();
            MessageBox.Show("Se registro la propiedad.");
            cn.CerrarConexion();
            Limpiar();
        }
    }

       
}

