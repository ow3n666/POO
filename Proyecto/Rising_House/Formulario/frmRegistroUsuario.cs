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
    public partial class frmRegistroUsuario : Form
    {
        cConexion cn;
        SqlDataAdapter da;
        SqlCommand cmd;
        DataTable dt;
        public frmRegistroUsuario()
        {
            cn = new cConexion();
            InitializeComponent();
        }


        
        private void btnRegresar_Click(object sender, EventArgs e)
        {
            frmIngreso frm = new frmIngreso();
            frm.Show();
            this.Hide();
        }

        void Limpiar()
        {
            txtNombre.Clear();
            txtApellido.Clear();
            txtCedula.Clear();
            txtTelefono.Clear();
            txtCelular.Clear();
            txtCorreo.Clear();
            txtUsuario.Clear();
            txtContraseña.Clear();
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            Limpiar();
        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            if (cmbTipoUsuario.SelectedIndex == 0)
            {
                SqlCommand cmd = new SqlCommand("insert into tblVendedor values('" + Convert.ToInt32(txtCedula.Text) + "','" + txtNombre.Text + "','" + txtApellido.Text + "','" + txtCorreo.Text + "','" + txtTelefono.Text + "','" + txtCelular.Text + "')", cn.AbrirConexion());
                SqlCommand cmd2 = new SqlCommand("insert into tblUsuarioVendedor values('" + Convert.ToInt32(txtCedula.Text) + "', '" + txtUsuario.Text + "', '" + txtContraseña.Text +  "')", cn.AbrirConexion());
                cmd.ExecuteNonQuery();
                cmd2.ExecuteNonQuery();
                MessageBox.Show("Vendedor creado");
                Limpiar();
            }
            else
            {
                SqlCommand cmd = new SqlCommand("insert into tblComprador values('" + Convert.ToInt32(txtCedula.Text) + "','" + txtNombre.Text + "','" + txtApellido.Text + "','" + txtCorreo.Text + "','" + txtTelefono.Text + "','" + txtCelular.Text + "')", cn.AbrirConexion());

                SqlCommand cmd2 = new SqlCommand("insert into tblUsuarioComprador values('" + Convert.ToInt32(txtCedula.Text) + "', '" + txtUsuario.Text + "', '" + txtContraseña.Text + "')", cn.AbrirConexion());
                cmd.ExecuteNonQuery();
                cmd2.ExecuteNonQuery();
                MessageBox.Show("Comprador creado");
                Limpiar();
            }
           
        }
    }
}
