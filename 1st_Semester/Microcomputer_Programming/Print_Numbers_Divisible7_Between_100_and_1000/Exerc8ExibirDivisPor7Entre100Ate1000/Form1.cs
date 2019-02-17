using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Exerc8ExibirDivisPor7Entre100Ate1000
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void run_button_Click(object sender, EventArgs e)
        {
            for (int i = 100; i <= 1000; i++)
            {
                if (i % 7 == 0)
                {
                    results_RichBox.AppendText(i.ToString() + Environment.NewLine);
                    
                }
                
            }
        }
    }
}
