namespace Exerc8ExibirDivisPor7Entre100Ate1000
{
    partial class Form1
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
            this.results_RichBox = new System.Windows.Forms.RichTextBox();
            this.run_button = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // results_RichBox
            // 
            this.results_RichBox.Location = new System.Drawing.Point(25, 23);
            this.results_RichBox.Name = "results_RichBox";
            this.results_RichBox.Size = new System.Drawing.Size(174, 282);
            this.results_RichBox.TabIndex = 0;
            this.results_RichBox.Text = "";
            // 
            // run_button
            // 
            this.run_button.Location = new System.Drawing.Point(124, 333);
            this.run_button.Name = "run_button";
            this.run_button.Size = new System.Drawing.Size(75, 23);
            this.run_button.TabIndex = 1;
            this.run_button.Text = "Exercutar";
            this.run_button.UseVisualStyleBackColor = true;
            this.run_button.Click += new System.EventHandler(this.run_button_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(225, 393);
            this.Controls.Add(this.run_button);
            this.Controls.Add(this.results_RichBox);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.RichTextBox results_RichBox;
        private System.Windows.Forms.Button run_button;
    }
}

