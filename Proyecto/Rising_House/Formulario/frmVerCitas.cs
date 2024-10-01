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
    public partial class frmVerCitas : Form
    {
        cConexion cn;
        SqlDataAdapter da;
        SqlCommand cmd;
        DataTable dt;
        int contador = 0;
        DateTime hoy;
        public frmVerCitas()
        {
            cn = new cConexion();
            InitializeComponent();
        }

        void Llenar()
        {
            if ((Var.rol) == 1)
            {
                llenarC();
            }
            else
            {
                llenarV();
            }
        }
        void limpiar()
        {
            dtgCitas.Columns.Clear();
            DataGridViewColumn nuevaColumna = new DataGridViewCheckBoxColumn();
            nuevaColumna.Name = "Seleccione";
            nuevaColumna.HeaderText = "Seleccione";
            dtgCitas.Columns.Add(nuevaColumna);

        }
        void llenarC()
        {
            SqlCommand cmd = new SqlCommand("select * from tblCita where CedulaC = '" + txtCedula.Text + "'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            dtgCitas.DataSource = dt;
        }

        void llenarV()
        {
            SqlCommand cmd = new SqlCommand("select * from tblCita where CedulaV = '" + txtCedula.Text + "'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            dtgCitas.DataSource = dt;
        }

        private void btnCanCita_Click(object sender, EventArgs e)
        {
            foreach (DataGridViewRow row in dtgCitas.Rows)
            {
                bool seleccionado = Convert.ToBoolean(row.Cells["Seleccione"].Value);
                if (seleccionado)
                {
                    for (int Indice = 0; Indice <= dtgCitas.Rows.GetLastRow(DataGridViewElementStates.Displayed); Indice++)
                    {
                        if (dtgCitas.Rows[Indice].Cells[0].Value != null)
                        {
                            SqlCommand cmd3 = new SqlCommand("select Id_Cita from tblCita where Id_Cita = '" + dtgCitas.Rows[Indice].Cells[1].Value.ToString() + "'", cn.AbrirConexion());
                            SqlDataAdapter da3 = new SqlDataAdapter(cmd3);
                            DataTable dt3 = new DataTable();
                            da3.Fill(dt3);
                            if (MessageBox.Show("Desea cancelar la cita", "Alerta!!", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                            {
                                SqlCommand cmd4 = new SqlCommand("Eliminar_Cita", cn.AbrirConexion());
                                cmd4.CommandType = CommandType.StoredProcedure;
                                cmd4.Parameters.AddWithValue(@"id_Cita", Convert.ToInt32(dtgCitas.Rows[Indice].Cells[1].Value.ToString()));
                                cmd4.ExecuteNonQuery();
                                MessageBox.Show("Cita eliminada");
                            }
                        }
                    }

                }

            }
            limpiar();
            Llenar();           
        }

        private void frmVerCitas_Load(object sender, EventArgs e)
        {
            if ((Var.rol) == 1)
            {
                txtCedula.Text = Var.CedulaC.ToString();
                llenarC();
            }
            else
            {
                txtCedula.Text = Var.CedulaV.ToString();
                llenarV();
            }           
            
        }

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            frmMenuPrincipal frm = new frmMenuPrincipal();
            frm.Show();
            this.Close();
        }

        private void btnReprogramar_Click(object sender, EventArgs e)
        {
            foreach (DataGridViewRow row in dtgCitas.Rows)
            {
                bool seleccionado = Convert.ToBoolean(row.Cells["Seleccione"].Value);
                if (seleccionado)
                {
                    for (int Indice = 0; Indice <= dtgCitas.Rows.GetLastRow(DataGridViewElementStates.Displayed); Indice++)
                    {
                        if (dtgCitas.Rows[Indice].Cells[0].Value != null)
                        {
                            txtFecha.Text = dtpTiempo.Value.ToShortDateString();
                            SqlCommand cmd3 = new SqlCommand("select fecha_Cita from tblCita where id_Propiedad = '" + dtgCitas.Rows[Indice].Cells[1].Value.ToString() + "'and Fecha_Cita = '" + txtFecha.Text + "'", cn.AbrirConexion());
                            SqlDataAdapter da3 = new SqlDataAdapter(cmd3);
                            DataTable dt3 = new DataTable();
                            da3.Fill(dt3);
                            SqlCommand cmd4 = new SqlCommand("Actualizar_Cita", cn.AbrirConexion());
                            cmd4.CommandType = CommandType.StoredProcedure;
                            cmd4.Parameters.AddWithValue(@"Id_Cita", Convert.ToInt32(dtgCitas.Rows[Indice].Cells[1].Value.ToString()));
                            cmd4.Parameters.AddWithValue(@"Fecha", dtgCitas.Rows[Indice].Cells[5].Value = txtFecha.Text);
                            cmd4.ExecuteNonQuery();
                            MessageBox.Show("Se reprogramo la cita.");
                            cn.CerrarConexion();

                        }
                    }
                }
            }
            limpiar();
            Llenar();
        }

        private void dtpTiempo_ValueChanged(object sender, EventArgs e)
        {
            
            
        }
    }
}      

