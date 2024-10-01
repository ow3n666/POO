namespace Rising_House.Formulario
{
    partial class frmVerCitas
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmVerCitas));
            this.dtgCitas = new System.Windows.Forms.DataGridView();
            this.Seleccione = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.label1 = new System.Windows.Forms.Label();
            this.btnCanCita = new System.Windows.Forms.Button();
            this.btnReprogramar = new System.Windows.Forms.Button();
            this.btnRegresar = new System.Windows.Forms.Button();
            this.txtCedula = new System.Windows.Forms.TextBox();
            this.dtpTiempo = new System.Windows.Forms.DateTimePicker();
            this.txtFecha = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.dtgCitas)).BeginInit();
            this.SuspendLayout();
            // 
            // dtgCitas
            // 
            this.dtgCitas.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dtgCitas.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Seleccione});
            this.dtgCitas.Location = new System.Drawing.Point(60, 130);
            this.dtgCitas.Name = "dtgCitas";
            this.dtgCitas.Size = new System.Drawing.Size(684, 236);
            this.dtgCitas.TabIndex = 0;
            // 
            // Seleccione
            // 
            this.Seleccione.HeaderText = "Seleccione";
            this.Seleccione.Name = "Seleccione";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.Transparent;
            this.label1.Font = new System.Drawing.Font("Segoe UI Symbol", 14.25F, System.Drawing.FontStyle.Bold);
            this.label1.ForeColor = System.Drawing.SystemColors.Control;
            this.label1.Location = new System.Drawing.Point(365, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(96, 25);
            this.label1.TabIndex = 1;
            this.label1.Text = "Ver Citas";
            // 
            // btnCanCita
            // 
            this.btnCanCita.Location = new System.Drawing.Point(60, 399);
            this.btnCanCita.Name = "btnCanCita";
            this.btnCanCita.Size = new System.Drawing.Size(108, 23);
            this.btnCanCita.TabIndex = 2;
            this.btnCanCita.Text = "Cancelar Cita";
            this.btnCanCita.UseVisualStyleBackColor = true;
            this.btnCanCita.Click += new System.EventHandler(this.btnCanCita_Click);
            // 
            // btnReprogramar
            // 
            this.btnReprogramar.Location = new System.Drawing.Point(174, 399);
            this.btnReprogramar.Name = "btnReprogramar";
            this.btnReprogramar.Size = new System.Drawing.Size(107, 23);
            this.btnReprogramar.TabIndex = 3;
            this.btnReprogramar.Text = "Reprogramar";
            this.btnReprogramar.UseVisualStyleBackColor = true;
            this.btnReprogramar.Click += new System.EventHandler(this.btnReprogramar_Click);
            // 
            // btnRegresar
            // 
            this.btnRegresar.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("btnRegresar.BackgroundImage")));
            this.btnRegresar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btnRegresar.Location = new System.Drawing.Point(738, 12);
            this.btnRegresar.Name = "btnRegresar";
            this.btnRegresar.Size = new System.Drawing.Size(50, 43);
            this.btnRegresar.TabIndex = 4;
            this.btnRegresar.UseVisualStyleBackColor = true;
            this.btnRegresar.Click += new System.EventHandler(this.btnRegresar_Click);
            // 
            // txtCedula
            // 
            this.txtCedula.Location = new System.Drawing.Point(12, 12);
            this.txtCedula.Name = "txtCedula";
            this.txtCedula.Size = new System.Drawing.Size(29, 20);
            this.txtCedula.TabIndex = 5;
            this.txtCedula.Visible = false;
            // 
            // dtpTiempo
            // 
            this.dtpTiempo.Location = new System.Drawing.Point(60, 73);
            this.dtpTiempo.Name = "dtpTiempo";
            this.dtpTiempo.Size = new System.Drawing.Size(200, 20);
            this.dtpTiempo.TabIndex = 6;
            this.dtpTiempo.ValueChanged += new System.EventHandler(this.dtpTiempo_ValueChanged);
            // 
            // txtFecha
            // 
            this.txtFecha.Enabled = false;
            this.txtFecha.Location = new System.Drawing.Point(287, 72);
            this.txtFecha.Name = "txtFecha";
            this.txtFecha.Size = new System.Drawing.Size(100, 20);
            this.txtFecha.TabIndex = 7;
            this.txtFecha.Visible = false;
            // 
            // frmVerCitas
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.txtFecha);
            this.Controls.Add(this.dtpTiempo);
            this.Controls.Add(this.txtCedula);
            this.Controls.Add(this.btnRegresar);
            this.Controls.Add(this.btnReprogramar);
            this.Controls.Add(this.btnCanCita);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.dtgCitas);
            this.Name = "frmVerCitas";
            this.Text = "frmVerCitas";
            this.Load += new System.EventHandler(this.frmVerCitas_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dtgCitas)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dtgCitas;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnCanCita;
        private System.Windows.Forms.Button btnReprogramar;
        private System.Windows.Forms.Button btnRegresar;
        private System.Windows.Forms.TextBox txtCedula;
        private System.Windows.Forms.DateTimePicker dtpTiempo;
        private System.Windows.Forms.DataGridViewCheckBoxColumn Seleccione;
        private System.Windows.Forms.TextBox txtFecha;
    }
}