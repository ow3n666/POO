using Rising_House.Clases;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Rising_House.Formulario
{
    public partial class frmActualizarPropiedad : Form
    {
        cConexion cn;
        SqlDataAdapter da;
        SqlCommand cmd;
        DataTable dt;
        int contador = 0;
        public frmActualizarPropiedad()
        {
            cn = new cConexion();
            InitializeComponent();
        }
        void limpiar()
        {
            dtgViviendas.Columns.Clear();
            DataGridViewColumn nuevaColumna = new DataGridViewCheckBoxColumn();
            nuevaColumna.Name = "Seleccion";
            nuevaColumna.HeaderText = "Seleccion";
            dtgViviendas.Columns.Add(nuevaColumna);

        }

        void llenarCasa()
        {
            SqlCommand cmd = new SqlCommand("select tblPropiedad.Id_Propiedad as 'Interior',tblPropiedad.Superficie,tblPropiedad.Precio,tblPropiedad.Nro_Habitacion as 'Nro Habitacion',tblPropiedad.Observaciones,tblPropiedad.Descripcion,tblPropiedad.Arriendo,tblPropiedad.Disponibilidad from tblPropiedad where CedulaV = '" + txtCedula.Text + "'", cn.AbrirConexion());
            SqlDataAdapter da = new SqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            da.Fill(dt);
            if (dt.Rows.Count != 0)
            {
                dtgViviendas.DataSource = dt;               
            }              
        }

        //Insertar tantas filas como seea el resultado de la consulta
        //int numero = dt.Rows.Count;
        //dtgViviendas.Rows.Add(numero);
        ////
        //for (int i = 0; i < numero; i++)

        //{
        //    dtgViviendas.Rows[i].Cells[1].Value = dt.Rows[i][0].ToString();
        //    dtgViviendas.Rows[i].Cells[2].Value = dt.Rows[i][1].ToString();
        //    dtgViviendas.Rows[i].Cells[3].Value = dt.Rows[i][2].ToString();
        //    dtgViviendas.Rows[i].Cells[4].Value = dt.Rows[i][3].ToString();
        //    dtgViviendas.Rows[i].Cells[5].Value = dt.Rows[i][4].ToString();
        //    dtgViviendas.Rows[i].Cells[6].Value = dt.Rows[i][5].ToString();
        //    dtgViviendas.Rows[i].Cells[7].Value = dt.Rows[i][6].ToString();
        //    dtgViviendas.Rows[i].Cells[8].Value = dt.Rows[i][7].ToString();
        //    dtgViviendas.Rows[i].Cells[9].Value = dt.Rows[i][8].ToString();

        //}

        private void btnSalir_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnRegresar_Click(object sender, EventArgs e)
        {
            frmMenuPrincipal frm = new frmMenuPrincipal();
            frm.Show();
            this.Hide();
        }

        private void btnSubirImg_Click(object sender, EventArgs e)
        {

        }

        private void btnActualizar_Click(object sender, EventArgs e)
        {
            foreach (DataGridViewRow row in dtgViviendas.Rows)
            {
                bool seleccionado = Convert.ToBoolean(row.Cells["Seleccione"].Value);
                if (seleccionado)
                {
                    for (int Indice = 0; Indice <= dtgViviendas.Rows.GetLastRow(DataGridViewElementStates.Displayed); Indice++)
                    {
                        if (dtgViviendas.Rows[Indice].Cells[0].Value != null)
                        {
                                SqlCommand cmd3 = new SqlCommand("select id_Propiedad from tblPropiedad where id_Propiedad = '" + dtgViviendas.Rows[Indice].Cells[1].Value.ToString() + "'", cn.AbrirConexion());
                                SqlDataAdapter da3 = new SqlDataAdapter(cmd3);
                                DataTable dt3 = new DataTable();
                                da3.Fill(dt3);
                                SqlCommand cmd4 = new SqlCommand("Actualizar_Propiedad", cn.AbrirConexion());
                                cmd4.CommandType = CommandType.StoredProcedure;
                                cmd4.Parameters.AddWithValue(@"ID", Convert.ToInt32(dtgViviendas.Rows[Indice].Cells[1].Value.ToString()));
                                cmd4.Parameters.AddWithValue("@superficie", Convert.ToDouble(dtgViviendas.Rows[Indice].Cells[2].Value.ToString()));
                                cmd4.Parameters.AddWithValue("@precio", Convert.ToInt32(dtgViviendas.Rows[Indice].Cells[3].Value.ToString()));
                                cmd4.Parameters.AddWithValue("@Nro_vivi", Convert.ToInt32(dtgViviendas.Rows[Indice].Cells[4].Value.ToString()));
                                cmd4.Parameters.AddWithValue("@Observaciones", dtgViviendas.Rows[Indice].Cells[5].Value.ToString());
                                cmd4.Parameters.AddWithValue("@descripcion", dtgViviendas.Rows[Indice].Cells[6].Value.ToString());
                                cmd4.Parameters.AddWithValue("@Arriendo", dtgViviendas.Rows[Indice].Cells[7].Value.ToString());
                                cmd4.Parameters.AddWithValue(@"Disponibilidad", dtgViviendas.Rows[Indice].Cells[8].Value.ToString());
                                cmd4.ExecuteNonQuery();
                                MessageBox.Show("Se Actualizo la propiedad.");
                                cn.CerrarConexion();
                            
                        }                        
                    }        
                }
            }
        }

        private void btnEliminar_Click(object sender, EventArgs e)
        {
            
            foreach (DataGridViewRow row in dtgViviendas.Rows)
            {
                bool seleccionado = Convert.ToBoolean(row.Cells["Seleccione"].Value);
                if (seleccionado)
                {
                    for (int Indice = 0; Indice <= dtgViviendas.Rows.GetLastRow(DataGridViewElementStates.Displayed); Indice++)
                    {
                        if (dtgViviendas.Rows[Indice].Cells[0].Value != null)
                        {
                            SqlCommand cmd3 = new SqlCommand("select Id_Propiedad from tblPropiedad where Id_Propiedad = '" + dtgViviendas.Rows[Indice].Cells[1].Value.ToString() + "'", cn.AbrirConexion());
                            SqlDataAdapter da3 = new SqlDataAdapter(cmd3);
                            DataTable dt3 = new DataTable();
                            da3.Fill(dt3);
                            if (MessageBox.Show("Desea eliminar la vivienda", "Alerta!!", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                            {
                                SqlCommand cmd4 = new SqlCommand("Eliminar_Propiedad", cn.AbrirConexion());
                                cmd4.CommandType = CommandType.StoredProcedure;
                                cmd4.Parameters.AddWithValue(@"id_Propiedad", Convert.ToInt32(dtgViviendas.Rows[Indice].Cells[1].Value.ToString()));
                                cmd4.ExecuteNonQuery();
                                MessageBox.Show("Vivienda Eliminada");
                            }                                                          
                        }
                    } 
                    
                }

            }
            limpiar();
            llenarCasa();
        }

        private void frmActualizarPropiedad_Load(object sender, EventArgs e)
        {
            txtCedula.Text = Var.CedulaV.ToString();
            llenarCasa();
        }

        private void cmbInterior_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void btnLimpiar_Click(object sender, EventArgs e)
        {

        }
    }
}
