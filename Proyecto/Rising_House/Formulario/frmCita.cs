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

namespace Rising_House.Formulario
{
    public partial class frmCita : Form
    {
        cConexion cn;
        SqlDataAdapter da;
        SqlCommand cmd;
        DataTable dt;
        int contador = 0;
        public frmCita()
        {
            cn = new cConexion();
            InitializeComponent();
        }

        void Incremento_Id()
        {
            SqlCommand cmd = new SqlCommand("select max(Id_Cita) from tblCita", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            int contador = Convert.ToInt32(dt.Rows[0][0].ToString()) + 1;
            txtIdcita.Text = contador.ToString();
        }
        void llenarComprador()
        {
            SqlCommand cmd = new SqlCommand("select tblComprador.Nombre from tblComprador where CedulaC = '" + txtCedulaC.Text + "'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            for (int i = 0; i < dt.Rows.Count; i++)
            {
                txtNombreC.Text = dt.Rows[i][0].ToString();
            }
        }

        void llenarVendedor()
        {
            SqlCommand cmd = new SqlCommand("select tblVendedor.Nombre,tblVendedor.CedulaV from tblPropiedad join tblVendedor on tblVendedor.CedulaV = tblPropiedad.CedulaV where Id_Propiedad = '" + txtIdPropiedad.Text + "'",cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            for (int i = 0; i < dt.Rows.Count; i++)
            {
                txtNombreV.Text = dt.Rows[i][0].ToString();
                txtCedulaV.Text = dt.Rows[i][1].ToString();
            }            
        }
        private void txtIdPropiedad_Leave(object sender, EventArgs e)
        {
           

        }


        private void btnAceptar_Click(object sender, EventArgs e)
        {
            SqlCommand cmd = new SqlCommand("Insertar_Cita", cn.AbrirConexion());
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.AddWithValue(@"@Id_Cita", Convert.ToInt32(txtIdcita.Text));
            cmd.Parameters.AddWithValue(@"@CedulaV", Convert.ToInt32(txtCedulaV.Text));
            cmd.Parameters.AddWithValue(@"CedulaC", Convert.ToInt32(txtCedulaC.Text));
            cmd.Parameters.AddWithValue(@"Id_Propiedad", Convert.ToInt32(txtIdPropiedad.Text));
            cmd.Parameters.AddWithValue(@"Fecha", dtpFechaCita.Value.ToShortDateString());
            cmd.ExecuteNonQuery();
            MessageBox.Show("Se Asigno la cita");
            cn.CerrarConexion();
        }

        private void frmCita_Load(object sender, EventArgs e)
        {            
            txtCedulaC.Text = Var.CedulaC;
            llenarComprador();
            llenarVendedor();
            Incremento_Id();
        }

        private void btnAtras_Click(object sender, EventArgs e)
        {
            frmPropiedad frm = new frmPropiedad();
            frm.txtId_Casa.Text = txtIdPropiedad.Text;
            frm.Show();
            this.Hide();
        }
    }
}
