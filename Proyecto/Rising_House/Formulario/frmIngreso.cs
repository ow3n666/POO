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
using Rising_House.Clases;

namespace Rising_House.Formulario
{
    public partial class frmIngreso : Form
    {
        cConexion cn;
        SqlDataAdapter da;
        SqlCommand cmd;
        DataTable dt;
        int contador = 0;
        public frmIngreso()
        {
            cn = new cConexion();
            InitializeComponent();
        }

    
        private void btnIniciar_Click(object sender, EventArgs e)
        {
            if (cmbRol.SelectedIndex == 0)
            {
                cmd = new SqlCommand("select Usuario,Contraseña,CedulaV from tblUsuarioVendedor where usuario = '" + txtUsuario.Text + "' and contraseña = '" + txtContraseña.Text + "'", cn.AbrirConexion());
                da = new SqlDataAdapter(cmd);
                dt = new DataTable();
                da.Fill(dt);
                if (dt.Rows.Count == 0) //Si esta vacio
                {
                    contador++;
                    MessageBox.Show("Usuario o contraseña incorrectos, llevas " + contador + " intentos");
                    txtContraseña.Clear();
                    txtUsuario.Clear();

                    if (contador == 3)
                    {
                        MessageBox.Show("No puedes ingresar!! Datos Incorrectos!!");
                        this.Close();
                    }

                }

                else
                {
                    frmMenuPrincipal frm = new frmMenuPrincipal();                    
                    frmRegistrarPropiedad frm1 = new frmRegistrarPropiedad();
                    Var.CedulaV = dt.Rows[0][2].ToString();
                    Var.rol = cmbRol.SelectedIndex;
                    frm.Show();
                    this.Hide();
                }
            }
            else
            {
                cmd = new SqlCommand("select Usuario,Contraseña,CedulaC from tblUsuarioComprador where usuario = '" + txtUsuario.Text + "' and contraseña = '" + txtContraseña.Text + "'", cn.AbrirConexion());
                da = new SqlDataAdapter(cmd);
                dt = new DataTable();
                da.Fill(dt);
                if (dt.Rows.Count == 0) //Si esta vacio
                {
                    contador++;
                    MessageBox.Show("Usuario o contraseña incorrectos, llevas " + contador + " intentos");
                    txtContraseña.Clear();
                    txtUsuario.Clear();

                    if (contador == 3)
                    {
                        MessageBox.Show("No puedes ingresar!! Datos Incorrectos!!");
                        this.Close();
                    }

                }

                else
                {
                    frmMenuPrincipal frm = new frmMenuPrincipal();
                    frmRecibo frm1= new frmRecibo();
                    Var.CedulaC = dt.Rows[0][2].ToString();
                    Var.rol = cmbRol.SelectedIndex;
                    frm.Show();
                    this.Hide();

                }
            }
            
        }


        private void btnRegistrar_Click(object sender, EventArgs e)
        {
            frmRegistroUsuario frm = new frmRegistroUsuario();
            frm.Show();
            this.Hide();
        }

        private void frmIngreso_Load(object sender, EventArgs e)
        {
          
        }

        private void button3_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
