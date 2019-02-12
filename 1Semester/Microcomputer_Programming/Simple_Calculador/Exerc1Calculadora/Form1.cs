using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Exerc1Calculadora
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double num1;
            double num2;
            double result = 0;
            int oper;

            num1 = (Convert.ToInt32(num1_textbox.Text));
            num2 = (Convert.ToInt32(num2_textbox.Text));

            oper = (Convert.ToInt32(cbxOper.SelectedIndex));

            if (oper == -1)
            {
                MessageBox.Show("Operação inválida", "Calculadora", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
            else
            if (oper == 0)
            {
                result = num1 + num2;                
            }
            else 
            if(oper == 1)
            {
                result = num1 - num2;                
            }
            else
            if (oper == 2)
            {
                result = num1 * num2;                
            }
            else
            if (oper == 3)
            {
                result = num1 / num2;                
            }
            else
            if (oper == 4)
            {
                result = Math.Pow(num1, num2);                
            }
            lblResult.Text = ("Resultado : " + result);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            num1_textbox.Text = "";
            num2_textbox.Text = "";
            lblResult.Text = "Resultado: ";
            cbxOper.SelectedIndex = -1;

            lblResult.Focus();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
