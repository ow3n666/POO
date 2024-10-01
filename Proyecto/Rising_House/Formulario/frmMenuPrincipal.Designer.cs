namespace Rising_House.Formulario
{
    partial class frmMenuPrincipal
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmMenuPrincipal));
            this.dtgCasas = new System.Windows.Forms.DataGridView();
            this.Interior = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.TipoPropieda = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Direccion = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Ciudad = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.CodigoPostal = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Superficie = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Arriendo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.NroHabitaciones = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Precio = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.btnAgregar = new System.Windows.Forms.Button();
            this.btnEditar = new System.Windows.Forms.Button();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.btnSalir = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.txtCiudad = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtSuperficie = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txtNroHabi = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.cmbTipoPropiedad = new System.Windows.Forms.ComboBox();
            this.label5 = new System.Windows.Forms.Label();
            this.txtPrecio = new System.Windows.Forms.TextBox();
            this.chkArriendo = new System.Windows.Forms.CheckBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.btnTodos = new System.Windows.Forms.Button();
            this.label6 = new System.Windows.Forms.Label();
            this.btnVerCitas = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dtgCasas)).BeginInit();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // dtgCasas
            // 
            this.dtgCasas.AllowUserToAddRows = false;
            this.dtgCasas.AllowUserToDeleteRows = false;
            this.dtgCasas.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dtgCasas.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Interior,
            this.TipoPropieda,
            this.Direccion,
            this.Ciudad,
            this.CodigoPostal,
            this.Superficie,
            this.Arriendo,
            this.NroHabitaciones,
            this.Precio});
            this.dtgCasas.Location = new System.Drawing.Point(15, 275);
            this.dtgCasas.Name = "dtgCasas";
            this.dtgCasas.ReadOnly = true;
            this.dtgCasas.RowHeadersVisible = false;
            this.dtgCasas.Size = new System.Drawing.Size(768, 214);
            this.dtgCasas.TabIndex = 0;
            this.dtgCasas.CellDoubleClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dtgCasas_CellDoubleClick);
            // 
            // Interior
            // 
            this.Interior.HeaderText = "interior";
            this.Interior.Name = "Interior";
            this.Interior.ReadOnly = true;
            // 
            // TipoPropieda
            // 
            this.TipoPropieda.HeaderText = "Tipo Propiedad ";
            this.TipoPropieda.Name = "TipoPropieda";
            this.TipoPropieda.ReadOnly = true;
            // 
            // Direccion
            // 
            this.Direccion.HeaderText = "Direccion";
            this.Direccion.Name = "Direccion";
            this.Direccion.ReadOnly = true;
            // 
            // Ciudad
            // 
            this.Ciudad.HeaderText = "Ciuadad";
            this.Ciudad.Name = "Ciudad";
            this.Ciudad.ReadOnly = true;
            // 
            // CodigoPostal
            // 
            this.CodigoPostal.HeaderText = "Codigo Postal";
            this.CodigoPostal.Name = "CodigoPostal";
            this.CodigoPostal.ReadOnly = true;
            // 
            // Superficie
            // 
            this.Superficie.HeaderText = "Superficie";
            this.Superficie.Name = "Superficie";
            this.Superficie.ReadOnly = true;
            // 
            // Arriendo
            // 
            this.Arriendo.HeaderText = "Arriendo";
            this.Arriendo.Name = "Arriendo";
            this.Arriendo.ReadOnly = true;
            // 
            // NroHabitaciones
            // 
            this.NroHabitaciones.HeaderText = "Nro Habitaciones";
            this.NroHabitaciones.Name = "NroHabitaciones";
            this.NroHabitaciones.ReadOnly = true;
            // 
            // Precio
            // 
            this.Precio.HeaderText = "Precio";
            this.Precio.Name = "Precio";
            this.Precio.ReadOnly = true;
            // 
            // btnAgregar
            // 
            this.btnAgregar.Location = new System.Drawing.Point(55, 508);
            this.btnAgregar.Name = "btnAgregar";
            this.btnAgregar.Size = new System.Drawing.Size(75, 23);
            this.btnAgregar.TabIndex = 1;
            this.btnAgregar.Text = "Agregar";
            this.btnAgregar.UseVisualStyleBackColor = true;
            this.btnAgregar.Click += new System.EventHandler(this.btnAgregar_Click);
            // 
            // btnEditar
            // 
            this.btnEditar.Location = new System.Drawing.Point(147, 508);
            this.btnEditar.Name = "btnEditar";
            this.btnEditar.Size = new System.Drawing.Size(75, 23);
            this.btnEditar.TabIndex = 2;
            this.btnEditar.Text = "Editar";
            this.btnEditar.UseVisualStyleBackColor = true;
            this.btnEditar.Click += new System.EventHandler(this.btnEditar_Click);
            // 
            // btnBuscar
            // 
            this.btnBuscar.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("btnBuscar.BackgroundImage")));
            this.btnBuscar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btnBuscar.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.btnBuscar.Location = new System.Drawing.Point(591, 84);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(50, 40);
            this.btnBuscar.TabIndex = 3;
            this.btnBuscar.UseVisualStyleBackColor = true;
            this.btnBuscar.Click += new System.EventHandler(this.btnBuscar_Click);
            // 
            // btnSalir
            // 
            this.btnSalir.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("btnSalir.BackgroundImage")));
            this.btnSalir.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btnSalir.Location = new System.Drawing.Point(731, 19);
            this.btnSalir.Name = "btnSalir";
            this.btnSalir.Size = new System.Drawing.Size(52, 39);
            this.btnSalir.TabIndex = 4;
            this.btnSalir.UseVisualStyleBackColor = true;
            this.btnSalir.Click += new System.EventHandler(this.btnSalir_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(21, 98);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(40, 13);
            this.label1.TabIndex = 5;
            this.label1.Text = "Ciudad";
            // 
            // txtCiudad
            // 
            this.txtCiudad.Location = new System.Drawing.Point(67, 95);
            this.txtCiudad.Name = "txtCiudad";
            this.txtCiudad.Size = new System.Drawing.Size(100, 20);
            this.txtCiudad.TabIndex = 6;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(193, 98);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(54, 13);
            this.label2.TabIndex = 7;
            this.label2.Text = "Superficie";
            // 
            // txtSuperficie
            // 
            this.txtSuperficie.Location = new System.Drawing.Point(250, 95);
            this.txtSuperficie.Name = "txtSuperficie";
            this.txtSuperficie.Size = new System.Drawing.Size(100, 20);
            this.txtSuperficie.TabIndex = 8;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(193, 41);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(89, 13);
            this.label3.TabIndex = 9;
            this.label3.Text = "Nro Habitaciones";
            // 
            // txtNroHabi
            // 
            this.txtNroHabi.Location = new System.Drawing.Point(288, 38);
            this.txtNroHabi.Name = "txtNroHabi";
            this.txtNroHabi.Size = new System.Drawing.Size(100, 20);
            this.txtNroHabi.TabIndex = 10;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(365, 98);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(79, 13);
            this.label4.TabIndex = 11;
            this.label4.Text = "Tipo Propiedad";
            // 
            // cmbTipoPropiedad
            // 
            this.cmbTipoPropiedad.FormattingEnabled = true;
            this.cmbTipoPropiedad.Location = new System.Drawing.Point(450, 94);
            this.cmbTipoPropiedad.Name = "cmbTipoPropiedad";
            this.cmbTipoPropiedad.Size = new System.Drawing.Size(100, 21);
            this.cmbTipoPropiedad.TabIndex = 12;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(21, 41);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(37, 13);
            this.label5.TabIndex = 13;
            this.label5.Text = "Precio";
            // 
            // txtPrecio
            // 
            this.txtPrecio.Location = new System.Drawing.Point(67, 38);
            this.txtPrecio.Name = "txtPrecio";
            this.txtPrecio.Size = new System.Drawing.Size(100, 20);
            this.txtPrecio.TabIndex = 14;
            // 
            // chkArriendo
            // 
            this.chkArriendo.AutoSize = true;
            this.chkArriendo.Location = new System.Drawing.Point(431, 41);
            this.chkArriendo.Name = "chkArriendo";
            this.chkArriendo.Size = new System.Drawing.Size(65, 17);
            this.chkArriendo.TabIndex = 16;
            this.chkArriendo.Text = "Arriendo";
            this.chkArriendo.UseVisualStyleBackColor = true;
            this.chkArriendo.CheckedChanged += new System.EventHandler(this.chkArriendo_CheckedChanged);
            // 
            // groupBox1
            // 
            this.groupBox1.BackColor = System.Drawing.Color.Transparent;
            this.groupBox1.Controls.Add(this.btnTodos);
            this.groupBox1.Controls.Add(this.label5);
            this.groupBox1.Controls.Add(this.chkArriendo);
            this.groupBox1.Controls.Add(this.btnBuscar);
            this.groupBox1.Controls.Add(this.txtPrecio);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.txtCiudad);
            this.groupBox1.Controls.Add(this.cmbTipoPropiedad);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.txtSuperficie);
            this.groupBox1.Controls.Add(this.txtNroHabi);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.ForeColor = System.Drawing.SystemColors.Control;
            this.groupBox1.Location = new System.Drawing.Point(66, 110);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(666, 139);
            this.groupBox1.TabIndex = 17;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Busqueda";
            // 
            // btnTodos
            // 
            this.btnTodos.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.btnTodos.Location = new System.Drawing.Point(577, 38);
            this.btnTodos.Name = "btnTodos";
            this.btnTodos.Size = new System.Drawing.Size(75, 23);
            this.btnTodos.TabIndex = 17;
            this.btnTodos.Text = "Todos";
            this.btnTodos.UseVisualStyleBackColor = true;
            this.btnTodos.Click += new System.EventHandler(this.btnTodos_Click);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(329, 23);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(147, 25);
            this.label6.TabIndex = 18;
            this.label6.Text = "Menu Principal";
            // 
            // btnVerCitas
            // 
            this.btnVerCitas.Location = new System.Drawing.Point(354, 508);
            this.btnVerCitas.Name = "btnVerCitas";
            this.btnVerCitas.Size = new System.Drawing.Size(75, 23);
            this.btnVerCitas.TabIndex = 19;
            this.btnVerCitas.Text = "Ver Citas";
            this.btnVerCitas.UseVisualStyleBackColor = true;
            this.btnVerCitas.Click += new System.EventHandler(this.btnVerCitas_Click);
            // 
            // frmMenuPrincipal
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(807, 559);
            this.Controls.Add(this.btnVerCitas);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.btnSalir);
            this.Controls.Add(this.btnEditar);
            this.Controls.Add(this.btnAgregar);
            this.Controls.Add(this.dtgCasas);
            this.Name = "frmMenuPrincipal";
            this.Text = "MenuPrincipal";
            this.Load += new System.EventHandler(this.frmMenuPrincipal_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dtgCasas)).EndInit();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dtgCasas;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.Button btnSalir;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtCiudad;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtSuperficie;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtNroHabi;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.ComboBox cmbTipoPropiedad;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtPrecio;
        private System.Windows.Forms.CheckBox chkArriendo;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.DataGridViewTextBoxColumn Interior;
        private System.Windows.Forms.DataGridViewTextBoxColumn TipoPropieda;
        private System.Windows.Forms.DataGridViewTextBoxColumn Direccion;
        private System.Windows.Forms.DataGridViewTextBoxColumn Ciudad;
        private System.Windows.Forms.DataGridViewTextBoxColumn CodigoPostal;
        private System.Windows.Forms.DataGridViewTextBoxColumn Superficie;
        private System.Windows.Forms.DataGridViewTextBoxColumn Arriendo;
        private System.Windows.Forms.DataGridViewTextBoxColumn NroHabitaciones;
        private System.Windows.Forms.DataGridViewTextBoxColumn Precio;
        public System.Windows.Forms.Button btnAgregar;
        public System.Windows.Forms.Button btnEditar;
        private System.Windows.Forms.Button btnVerCitas;
        private System.Windows.Forms.Button btnTodos;
    }
}