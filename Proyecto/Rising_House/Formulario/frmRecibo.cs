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
using Word = Microsoft.Office.Interop.Word;

namespace Rising_House.Formulario
{
    public partial class frmRecibo : Form
    {
        cConexion cn;
        SqlDataAdapter da;
        SqlCommand cmd;
        DataTable dt;
        int contador = 0;
        DateTime hoy;
        public frmRecibo()
        {
            cn = new cConexion();
            hoy = DateTime.Now;
            InitializeComponent();
        }

        void Incremento_Id()
        {
            SqlCommand cmd = new SqlCommand("select max(Id_Cita) from tblCita", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            int contador = Convert.ToInt32(dt.Rows[0][0].ToString()) + 1;
            txtCodigoResivo.Text = contador.ToString();
        }

        void eliminar_Propiedad()
        {
            SqlCommand cmd = new SqlCommand("Eliminar_Propiedad", cn.AbrirConexion());
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.Parameters.AddWithValue(@"id_Propiedad", txtInterior.Text);
            cmd.ExecuteNonQuery();
        }

        void cargaridCita()
        {
            SqlCommand cmd = new SqlCommand("select Id_Cita from tblCita where CedulaC = '" + txtCedulaC.Text + "'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            for (int i = 0; i < dt.Rows.Count; i++)
            {
                txtIdCita.Text = dt.Rows[i][0].ToString();
            }

        }
        
        void eliminarCita()
        {         
            SqlCommand cmd4 = new SqlCommand("Eliminar_Cita", cn.AbrirConexion());
            cmd4.CommandType = CommandType.StoredProcedure;
            cmd4.Parameters.AddWithValue(@"id_Cita", txtIdCita.Text);
            cmd4.ExecuteNonQuery();        
        }

        void llenarCombo()
        {
            SqlCommand cmd = new SqlCommand("select * from tblMetodo_Pago", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            for (int i = 0; i < dt.Rows.Count; i++)
            {
                cmbMetodoPago.Items.Add(dt.Rows[i][1]);
            }
        }
        void llenarComprador(String CedulaC)
        {
            SqlCommand cmd = new SqlCommand("select tblComprador.Nombre,tblComprador.Apellido,tblComprador.Correo,tblComprador.telefonoC,tblComprador.CelularC from tblComprador where tblComprador.CedulaC = '" + txtCedulaC.Text + "'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            for (int i = 0; i < dt.Rows.Count; i++)
            {
                txtNombreC.Text = dt.Rows[i][0].ToString();
                txtApellidoC.Text = dt.Rows[i][1].ToString();
                txtCorreoC.Text = dt.Rows[i][2].ToString();
                txtTelefonoC.Text = dt.Rows[i][3].ToString();
                txtCelularC.Text = dt.Rows[i][4].ToString();
            }
        }
        void llenarVendedor(String IdPropiedad)
        {
            SqlCommand cmd = new SqlCommand("select tblVendedor.CedulaV,tblVendedor.Nombre,tblVendedor.Apellido,tblVendedor.Correo,tblVendedor.telefonoV,tblVendedor.CelularV,tblPropiedad.Precio,tblPropiedad.Id_Propiedad,tblPropiedad.Direccion,tblPropiedad.Descripcion,tblTipo_Propiedad.Tipo_Propiedad from tblVendedor join tblPropiedad on tblVendedor.CedulaV = tblPropiedad.CedulaV join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where tblPropiedad.Id_Propiedad = '" + txtInterior.Text + "'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            for (int i = 0; i < dt.Rows.Count; i++)
            {
                txtCedulaV.Text = dt.Rows[i][0].ToString();
                txtNombreV.Text = dt.Rows[i][1].ToString();
                txtApellidoV.Text = dt.Rows[i][2].ToString();
                txtCorreoV.Text = dt.Rows[i][3].ToString();
                txtTelefonoV.Text = dt.Rows[i][4].ToString();
                txtCelularV.Text = dt.Rows[i][5].ToString();
                txtTotal.Text = dt.Rows[i][6].ToString();
                txtInterior.Text = dt.Rows[i][7].ToString();
                txtDireccion.Text = dt.Rows[i][8].ToString();
                txtDescripcion.Text = dt.Rows[i][9].ToString();
                txtTipoPropiedad.Text = dt.Rows[i][10].ToString();
            }
                
        }
        private void frmRecivo_Load(object sender, EventArgs e)
        {
            txtCedulaC.Text = Var.CedulaC;
            txtFechaPago.Text = dtpFechaPago.Value.ToShortDateString();
            llenarComprador(txtCedulaC.Text);
            llenarVendedor(txtInterior.Text);
            llenarCombo();
            Incremento_Id();
            cargaridCita();
        }


        private void btnPagar_Click(object sender, EventArgs e)
        {
            if (MessageBox.Show("¿Desea comprar la vivienda la vivienda?", "Alerta!!", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
            {
                Word.Application wordApp = new Word.Application();
                Word.Document wordDoc = wordApp.Documents.Open(@"C:\Users\owen\Desktop\colegio_universidad\trabajos owen\universidad\Semestre 5\POO\Proyecto_Owen_Holguin\Proyecto\Factura.docx");
                Microsoft.Office.Interop.Word.Table table = wordDoc.Tables[1];
                table.Cell(2, 2).Range.Text = txtCodigoResivo.Text;
                table.Cell(3, 2).Range.Text = txtFechaPago.Text;
                table.Cell(5, 2).Range.Text = txtCedulaC.Text;
                table.Cell(6, 2).Range.Text = txtNombreC.Text;
                table.Cell(7, 2).Range.Text = txtApellidoC.Text;
                table.Cell(8, 2).Range.Text = txtCorreoC.Text;
                table.Cell(9, 2).Range.Text = txtTelefonoC.Text;
                table.Cell(10, 2).Range.Text = txtCedulaC.Text;
                table.Cell(12, 2).Range.Text = txtCedulaV.Text;
                table.Cell(13, 2).Range.Text = txtNombreV.Text;
                table.Cell(14, 2).Range.Text = txtApellidoV.Text;
                table.Cell(15, 2).Range.Text = txtCorreoV.Text;
                table.Cell(16, 2).Range.Text = txtTelefonoV.Text;
                table.Cell(17, 2).Range.Text = txtCelularV.Text;

                Microsoft.Office.Interop.Word.Table table1 = wordDoc.Tables[2];
                table1.Cell(2, 2).Range.Text = txtInterior.Text;
                table1.Cell(3, 2).Range.Text = txtDireccion.Text;
                table1.Cell(4, 2).Range.Text = txtTipoPropiedad.Text;
                table1.Cell(5, 2).Range.Text = txtDescripcion.Text;

                Microsoft.Office.Interop.Word.Table table2 = wordDoc.Tables[3];
                table2.Cell(2, 2).Range.Text = cmbMetodoPago.Text;
                table2.Cell(3, 2).Range.Text = txtTotal.Text;
                eliminarCita();
                eliminar_Propiedad();                
            }
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            frmPropiedad frm = new frmPropiedad();
            frm.txtId_Casa.Text = txtInterior.Text;
            frm.Show();
            this.Close();
        }

        private void btnSalir_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
