namespace Rising_House.Formulario
{
    partial class frmCita
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmCita));
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.txtIdcita = new System.Windows.Forms.TextBox();
            this.txtNombreV = new System.Windows.Forms.TextBox();
            this.txtCedulaV = new System.Windows.Forms.TextBox();
            this.txtIdPropiedad = new System.Windows.Forms.TextBox();
            this.dtpFechaCita = new System.Windows.Forms.DateTimePicker();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.txtCedulaC = new System.Windows.Forms.TextBox();
            this.txtNombreC = new System.Windows.Forms.TextBox();
            this.btnAceptar = new System.Windows.Forms.Button();
            this.btnAtras = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Segoe UI", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(315, 21);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(148, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "Programar Cita";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(92, 167);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(37, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Id Cita";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(282, 167);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(89, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Cedula Vendedor";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(90, 221);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(39, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Interior";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(278, 221);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(93, 13);
            this.label5.TabIndex = 4;
            this.label5.Text = "Nombre Vendedor";
            // 
            // txtIdcita
            // 
            this.txtIdcita.Location = new System.Drawing.Point(144, 164);
            this.txtIdcita.Name = "txtIdcita";
            this.txtIdcita.Size = new System.Drawing.Size(100, 20);
            this.txtIdcita.TabIndex = 5;
            // 
            // txtNombreV
            // 
            this.txtNombreV.Location = new System.Drawing.Point(377, 218);
            this.txtNombreV.Name = "txtNombreV";
            this.txtNombreV.Size = new System.Drawing.Size(100, 20);
            this.txtNombreV.TabIndex = 6;
            // 
            // txtCedulaV
            // 
            this.txtCedulaV.Location = new System.Drawing.Point(377, 164);
            this.txtCedulaV.Name = "txtCedulaV";
            this.txtCedulaV.Size = new System.Drawing.Size(100, 20);
            this.txtCedulaV.TabIndex = 7;
            // 
            // txtIdPropiedad
            // 
            this.txtIdPropiedad.Location = new System.Drawing.Point(144, 218);
            this.txtIdPropiedad.Name = "txtIdPropiedad";
            this.txtIdPropiedad.Size = new System.Drawing.Size(100, 20);
            this.txtIdPropiedad.TabIndex = 8;
            this.txtIdPropiedad.Leave += new System.EventHandler(this.txtIdPropiedad_Leave);
            // 
            // dtpFechaCita
            // 
            this.dtpFechaCita.Location = new System.Drawing.Point(320, 104);
            this.dtpFechaCita.Name = "dtpFechaCita";
            this.dtpFechaCita.Size = new System.Drawing.Size(200, 20);
            this.dtpFechaCita.TabIndex = 9;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Segoe UI", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(211, 107);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(103, 17);
            this.label6.TabIndex = 10;
            this.label6.Text = "Fecha de la cita";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(514, 167);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(94, 13);
            this.label7.TabIndex = 11;
            this.label7.Text = "Cedula Comprador";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(510, 221);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(98, 13);
            this.label8.TabIndex = 12;
            this.label8.Text = "Nombre Comprador";
            // 
            // txtCedulaC
            // 
            this.txtCedulaC.Location = new System.Drawing.Point(614, 164);
            this.txtCedulaC.Name = "txtCedulaC";
            this.txtCedulaC.Size = new System.Drawing.Size(100, 20);
            this.txtCedulaC.TabIndex = 13;
            // 
            // txtNombreC
            // 
            this.txtNombreC.Location = new System.Drawing.Point(614, 218);
            this.txtNombreC.Name = "txtNombreC";
            this.txtNombreC.Size = new System.Drawing.Size(100, 20);
            this.txtNombreC.TabIndex = 14;
            // 
            // btnAceptar
            // 
            this.btnAceptar.Location = new System.Drawing.Point(353, 285);
            this.btnAceptar.Name = "btnAceptar";
            this.btnAceptar.Size = new System.Drawing.Size(75, 23);
            this.btnAceptar.TabIndex = 15;
            this.btnAceptar.Text = "Aceptar";
            this.btnAceptar.UseVisualStyleBackColor = true;
            this.btnAceptar.Click += new System.EventHandler(this.btnAceptar_Click);
            // 
            // btnAtras
            // 
            this.btnAtras.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("btnAtras.BackgroundImage")));
            this.btnAtras.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btnAtras.Location = new System.Drawing.Point(692, 5);
            this.btnAtras.Name = "btnAtras";
            this.btnAtras.Size = new System.Drawing.Size(56, 41);
            this.btnAtras.TabIndex = 16;
            this.btnAtras.UseVisualStyleBackColor = true;
            this.btnAtras.Click += new System.EventHandler(this.btnAtras_Click);
            // 
            // frmCita
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("$this.BackgroundImage")));
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(760, 385);
            this.Controls.Add(this.btnAtras);
            this.Controls.Add(this.btnAceptar);
            this.Controls.Add(this.txtNombreC);
            this.Controls.Add(this.txtCedulaC);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.dtpFechaCita);
            this.Controls.Add(this.txtIdPropiedad);
            this.Controls.Add(this.txtCedulaV);
            this.Controls.Add(this.txtNombreV);
            this.Controls.Add(this.txtIdcita);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.DoubleBuffered = true;
            this.Name = "frmCita";
            this.Text = "frmCita";
            this.Load += new System.EventHandler(this.frmCita_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtIdcita;
        private System.Windows.Forms.TextBox txtNombreV;
        private System.Windows.Forms.TextBox txtCedulaV;
        private System.Windows.Forms.DateTimePicker dtpFechaCita;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox txtCedulaC;
        private System.Windows.Forms.TextBox txtNombreC;
        private System.Windows.Forms.Button btnAceptar;
        private System.Windows.Forms.Button btnAtras;
        public System.Windows.Forms.TextBox txtIdPropiedad;
    }
}