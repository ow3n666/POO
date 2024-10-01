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

namespace Rising_House.Formulario
{
    public partial class frmPropiedad : Form
    {
        cConexion cn;
        SqlDataAdapter da;
        SqlCommand cmd;
        DataTable dt;
        int contador = 0, v;
        public frmPropiedad()
        {
            frmPropiedad frm;
            cn = new cConexion();
            InitializeComponent();
        }

        void llenar()
        {
            SqlCommand cmd = new SqlCommand("select tblPropiedad.Direccion,tblPropiedad.Ciudad,tblPropiedad.Codigo_Postal,tblPropiedad.Estrato,tblPropiedad.Superficie,tblTipo_Propiedad.Tipo_Propiedad,tblPropiedad.Nro_Habitacion,tblPropiedad.Precio,tblPropiedad.Fecha_publicacion,tblPropiedad.Descripcion,tblPropiedad.Observaciones,tblPropiedad.imgRuta,tblPropiedad.imgPropiedad from tblPropiedad join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where Id_Propiedad ='" + txtId_Casa.Text + "'",cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            for (int i = 0; i < dt.Rows.Count; i++)
            {
                txtDireccion.Text = dt.Rows[i][0].ToString();
                txtCiudad.Text = dt.Rows[i][1].ToString();
                txtCodigo_Pos.Text = dt.Rows[i][2].ToString();
                txtEstrato.Text  = dt.Rows[i][3].ToString();
                txtSuperficie.Text = dt.Rows[i][4].ToString();
                txtTipo_Propie.Text = dt.Rows[i][5].ToString();
                txtNroHabita.Text = dt.Rows[i][6].ToString();
                txtPrecio.Text = dt.Rows[i][7].ToString();
                txtFechaPubli.Text = dt.Rows[i][8].ToString();
                txtDescripcion.Text = dt.Rows[i][9].ToString();
                txtObservaciones.Text = dt.Rows[i][10].ToString();
                txtRuta.Text = dt.Rows[i][11].ToString();
                if (dt.Rows[i][12] != null && dt.Rows[i][12] != DBNull.Value && dt.Rows[i][12] is byte[])
                {
                    byte[] imgBytes = (byte[])dt.Rows[i][12];
                    MemoryStream ms = new MemoryStream(imgBytes);
                    Image img = Image.FromStream(ms);
                    pcbImagen.Image = img;
                }

            }
        }
     
        private void frmPropiedad_Load(object sender, EventArgs e)
        {
            llenar();
        }
       
        private void btnComprar_Click(object sender, EventArgs e)
        {
            frmRecibo frm = new frmRecibo();
            frm.txtInterior.Text = txtId_Casa.Text;
            frm.Show();
            this.Hide();
        }

        private void btnAgendarCita_Click(object sender, EventArgs e)
        {           
            frmCita frm = new frmCita();
            frm.txtIdPropiedad.Text = txtId_Casa.Text;
            frm.Show();
            this.Hide();
        }

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            frmMenuPrincipal frm = new frmMenuPrincipal();
            frm.Show();
            this.Hide();
        }

      
    }
}
