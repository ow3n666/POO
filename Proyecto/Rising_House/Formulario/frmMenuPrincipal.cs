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
    public partial class frmMenuPrincipal : Form
    {
        cConexion cn;
        SqlDataAdapter da;
        SqlCommand cmd;
        DataTable dt;
        int contador = 0;
        public frmMenuPrincipal()
        {
            cn = new cConexion();
            InitializeComponent();
        }
        void limpiar()
        {
            dtgCasas.Columns.Clear();
        }

        void habilitar()
        {
            if ((Var.rol) == 1)
            {
                btnAgregar.Visible = false;
                btnEditar.Visible = false;
            }
            else
            {
                btnAgregar.Visible = true;
                btnEditar.Visible = true;
            }
        }

        void llenarCombo()
        {
            SqlCommand cmd = new SqlCommand("select * from tblTipo_Propiedad", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            for (int i = 0; i < dt.Rows.Count; i++)
            {
                cmbTipoPropiedad.Items.Add(dt.Rows[i][1]);
            }         
        }

        void llenar2()
        {
            SqlCommand cmd = new SqlCommand("Select tblPropiedad.Id_Propiedad as 'Interior', tblTipo_Propiedad.Tipo_Propiedad as 'Tipo de Propiedad',tblPropiedad.Direccion,tblPropiedad.Ciudad,tblPropiedad.Codigo_Postal as 'Codigo Postal',tblPropiedad.Superficie,tblPropiedad.Arriendo,tblPropiedad.Nro_Habitacion as 'Nro Habitaciones',tblPropiedad.Precio from tblPropiedad join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where tblPropiedad.Disponibilidad = 'True'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            if (dt.Rows.Count != 0)
            {
                dtgCasas.DataSource = dt;
            }
        }
        void llenarXArriendo()
        {
            SqlCommand cmd = new SqlCommand("Select tblPropiedad.Id_Propiedad as 'Interior', tblTipo_Propiedad.Tipo_Propiedad as 'Tipo de Propiedad',tblPropiedad.Direccion,tblPropiedad.Ciudad,tblPropiedad.Codigo_Postal as 'Codigo Postal',tblPropiedad.Superficie,tblPropiedad.Arriendo,tblPropiedad.Nro_Habitacion as 'Nro Habitaciones',tblPropiedad.Precio from tblPropiedad join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where tblPropiedad.Arriendo = '" + chkArriendo.Checked + "' and tblPropiedad.Disponibilidad = 'True'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            if (dt.Rows.Count != 0)
            {
                dtgCasas.DataSource = dt;
            }
        }

        void llenarXTipoPropiedad()
        {
            SqlCommand cmd = new SqlCommand("Select tblPropiedad.Id_Propiedad as 'Interior', tblTipo_Propiedad.Tipo_Propiedad as 'Tipo de Propiedad',tblPropiedad.Direccion,tblPropiedad.Ciudad,tblPropiedad.Codigo_Postal as 'Codigo Postal',tblPropiedad.Superficie,tblPropiedad.Arriendo,tblPropiedad.Nro_Habitacion as 'Nro Habitaciones',tblPropiedad.Precio from tblPropiedad join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where tblTipo_Propiedad.Tipo_Propiedad = '" + cmbTipoPropiedad.Text + "' and tblPropiedad.Disponibilidad = 'True'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            if (dt.Rows.Count != 0)
            {
                dtgCasas.DataSource = dt;
            }
        }
        void llenarXSuperficie()
        {
            SqlCommand cmd = new SqlCommand("Select tblPropiedad.Id_Propiedad as 'Interior', tblTipo_Propiedad.Tipo_Propiedad as 'Tipo de Propiedad',tblPropiedad.Direccion,tblPropiedad.Ciudad,tblPropiedad.Codigo_Postal as 'Codigo Postal',tblPropiedad.Superficie,tblPropiedad.Arriendo,tblPropiedad.Nro_Habitacion as 'Nro Habitaciones',tblPropiedad.Precio from tblPropiedad join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where tblPropiedad.Superficie = '" + txtSuperficie.Text + "' and tblPropiedad.Disponibilidad = 'True'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();

            da.Fill(dt);
            if (dt.Rows.Count != 0)
            {
                dtgCasas.DataSource = dt;
            }
        }

        void llenarXHabitacion()
        {
            SqlCommand cmd = new SqlCommand("Select tblPropiedad.Id_Propiedad as 'Interior', tblTipo_Propiedad.Tipo_Propiedad as 'Tipo de Propiedad',tblPropiedad.Direccion,tblPropiedad.Ciudad,tblPropiedad.Codigo_Postal as 'Codigo Postal',tblPropiedad.Superficie,tblPropiedad.Arriendo,tblPropiedad.Nro_Habitacion as 'Nro Habitaciones',tblPropiedad.Precio from tblPropiedad join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where tblPropiedad.Nro_Habitacion = '" + txtNroHabi.Text + "' and tblPropiedad.Disponibilidad = 'True'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            if (dt.Rows.Count != 0)
            {
                dtgCasas.DataSource = dt;
            }
        }

        void llenarXPrecio()
        {
            SqlCommand cmd = new SqlCommand("Select tblPropiedad.Id_Propiedad as 'Interior', tblTipo_Propiedad.Tipo_Propiedad as 'Tipo de Propiedad',tblPropiedad.Direccion,tblPropiedad.Ciudad,tblPropiedad.Codigo_Postal as 'Codigo Postal',tblPropiedad.Superficie,tblPropiedad.Arriendo,tblPropiedad.Nro_Habitacion as 'Nro Habitaciones',tblPropiedad.Precio from tblPropiedad join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where tblPropiedad.Precio <= '" + txtPrecio.Text + "' and tblPropiedad.Disponibilidad = 'True'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            if (dt.Rows.Count != 0)
            {
                dtgCasas.DataSource = dt;
            }
        }
        void llenarXCiudad()
        {
            SqlCommand cmd = new SqlCommand("Select tblPropiedad.Id_Propiedad as 'Interior', tblTipo_Propiedad.Tipo_Propiedad as 'Tipo de Propiedad',tblPropiedad.Direccion,tblPropiedad.Ciudad,tblPropiedad.Codigo_Postal as 'Codigo Postal',tblPropiedad.Superficie,tblPropiedad.Arriendo,tblPropiedad.Nro_Habitacion as 'Nro Habitaciones',tblPropiedad.Precio from tblPropiedad join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where  tblPropiedad.Ciudad = '" + txtCiudad.Text + "' and tblPropiedad.Disponibilidad = 'True'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            if (dt.Rows.Count != 0)
            {
               dtgCasas.DataSource = dt;
            }
        }
        void llenar()
        {
            SqlCommand cmd = new SqlCommand("Select tblPropiedad.Id_Propiedad, tblTipo_Propiedad.Tipo_Propiedad,tblPropiedad.Direccion,tblPropiedad.Ciudad,tblPropiedad.Codigo_Postal,tblPropiedad.Superficie,tblPropiedad.Arriendo,tblPropiedad.Nro_Habitacion,tblPropiedad.Precio from tblPropiedad join tblTipo_Propiedad on tblTipo_Propiedad.IdTipo_Propiedad = tblPropiedad.IdTipo_Propiedad where tblPropiedad.Disponibilidad = 'True'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            if (dt.Rows.Count != 0)
            {
                //Insertar tantas filas como seea el resultado de la consulta
                int numero = dt.Rows.Count;
                dtgCasas.Rows.Add(numero);
                //
                for (int i = 0; i < numero; i++)
                {
                    dtgCasas.Rows[i].Cells[0].Value = dt.Rows[i][0].ToString();
                    dtgCasas.Rows[i].Cells[1].Value = dt.Rows[i][1].ToString();
                    dtgCasas.Rows[i].Cells[2].Value = dt.Rows[i][2].ToString();
                    dtgCasas.Rows[i].Cells[3].Value = dt.Rows[i][3].ToString();
                    dtgCasas.Rows[i].Cells[4].Value = dt.Rows[i][4].ToString();
                    dtgCasas.Rows[i].Cells[5].Value = dt.Rows[i][5].ToString();
                    dtgCasas.Rows[i].Cells[6].Value = dt.Rows[i][6].ToString();
                    dtgCasas.Rows[i].Cells[7].Value = dt.Rows[i][7].ToString();
                    dtgCasas.Rows[i].Cells[8].Value = dt.Rows[i][8].ToString();
                }
            }            
        }

        private void frmMenuPrincipal_Load(object sender, EventArgs e)
        {
            llenarCombo();
            habilitar();
            llenar();
        }

        private void chkArriendo_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            frmRegistrarPropiedad frm = new frmRegistrarPropiedad();
            frm.Show();
            this.Hide();
        }

        private void btnEditar_Click(object sender, EventArgs e)
        {
            frmActualizarPropiedad frm = new frmActualizarPropiedad();
            frm.Show();
            this.Hide();
        }
       
        private void dtgCasas_CellDoubleClick(object sender, DataGridViewCellEventArgs e)
        {
            frmPropiedad frm  = new frmPropiedad();
            frm.txtId_Casa.Text = dtgCasas.CurrentRow.Cells[0].Value.ToString();            
            frm.Show();
            this.Hide();
        }

        private void btnVerCitas_Click(object sender, EventArgs e)
        {
            frmVerCitas frm = new frmVerCitas();
            frm.Show();
            this.Hide();
        }

        private void btnBuscar_Click(object sender, EventArgs e)
        {
            if (!txtCiudad.Text.Equals(""))
            {
                limpiar();
                llenarXCiudad();
            }
            if (!txtPrecio.Text.Equals(""))
            {
                limpiar();
                llenarXPrecio();
            }
            if (!txtNroHabi.Text.Equals(""))
            {
                limpiar();
                llenarXHabitacion();
            }
            if (!txtSuperficie.Text.Equals(""))
            {
                limpiar();
                llenarXSuperficie();
            }
            if (!cmbTipoPropiedad.Text.Equals(""))
            {
                limpiar();
                llenarXTipoPropiedad();
            }
            if (!chkArriendo.Checked.Equals(false))
            {
                limpiar();
                llenarXArriendo();
            }
            //if (!chkArriendo.Checked.Equals(true))
            //{
            //    limpiar();
            //    llenarXArriendo();
            //}

        }

        private void btnSalir_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnTodos_Click(object sender, EventArgs e)
        {
            limpiar();
            llenar2();
        }
    }
}
