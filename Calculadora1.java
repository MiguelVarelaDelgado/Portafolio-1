import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import 
/**
 *Esta cal se realiza en un ambiente grafico 
 * Un algoritmo Voraz: consiste en el anailisis de varias condiciones
 * Se considera a la primera condicion (Primer elemento ) y se evalua una sola vez, si es parae de la solucion es seleccionada,
 * si no esta en 
 * @author (your name)
 * @version (a version number or a date)
 */


public class Calculadora1 extends JFrame implements ActionListener 
{   
    JRadioButton rdbtnSumar, rdbtnRestar,rdbtnMultiplicar, rdbtnDividir;
    ButtonGroup operaciones;
    JButton cmdEjecutar;
    JLabel lblNum1, lblNum2, lblResultado;
    JTextField txtNum1, txtNum2, txtResultado;
    
    public Calculadora1()
    {
    super("Calculadora Simple");
    this.setSize(300,150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.lblNum1=new JLabel ("Numero1");
        this.lblNum2=new JLabel ("Numero2");
            this.lblResultado=new JLabel ("Resultado");
            
      this.txtNum1=new JTextField();
        this.txtNum2=new JTextField();
            this.txtResultado=new JTextField();
    
    this.cmdEjecutar =new JButton("Aceptar");
        this.cmdEjecutar.addActionListener(this);
        
        this.rdbtnSumar =new JRadioButton("+", true);
            this.rdbtnRestar =new JRadioButton("-", false);
                    this.rdbtnMultiplicar =new JRadioButton("*", false);
                                this.rdbtnDividir =new JRadioButton("/", false);
    this.operaciones = new ButtonGroup();
    this.operaciones.add(this.rdbtnSumar);
        this.operaciones.add(this.rdbtnRestar);
                this.operaciones.add(this.rdbtnMultiplicar);
                        this.operaciones.add(this.rdbtnDividir);
    GridLayout ubicacion = new GridLayout(3,3,10,20);
    
    this.setLayout(ubicacion);
    
    this.add(this.lblNum1);
    this.add(this.txtNum1);
    this.add(this.lblNum2);
    this.add(this.txtNum2);
    
    this.add(this.rdbtnSumar);
    this.add(this.rdbtnRestar);
    this.add(this.rdbtnMultiplicar);
    this.add(this.rdbtnDividir);
        
    this.add(this.cmdEjecutar);
    
    this.add(this.lblResultado);
    this.add(this.txtResultado);
    
    
    
    }
    public void actionPerformed(ActionEvent evento )
    {
        float Num1, Num2, Resultado;
        
        try{
            Resultado = 0;
            Num1=Float.parseFloat(this.txtNum1.getText());
            Num2=Float.parseFloat(this.txtNum2.getText());
            if(this.rdbtnSumar.isSelected())
            {
            Resultado = Num1+Num2;
            }
             if(this.rdbtnRestar.isSelected())
            {
            Resultado = Num1-Num2;
            }
             if(this.rdbtnMultiplicar.isSelected())
            {
            Resultado = Num1*Num2;
            }
             if(this.rdbtnDividir.isSelected())
            {
            Resultado = Num1/Num2;
            }
            this.txtResultado.setText(String.valueOf(Resultado));
        }

        
        catch (Exception e)
       {
           this.txtResultado.setText("Error. Operacion incorrecta" + e);
           
        }
    } 
        
        public static void main()
        {
        Calculadora1 miCalculadora = new Calculadora1();
        miCalculadora.setResizable(false);
                miCalculadora.setVisible(true);
        }
    
    
}
