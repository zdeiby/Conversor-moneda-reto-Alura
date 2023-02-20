package visual;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.event.*;

public class Select  extends JFrame implements ActionListener, ItemListener {
    private JComboBox select;
    private JButton boton1;
    private JLabel label1;
    public static String texto="";

    public Select(String selectTexto1,String selectTexto2, String selectTexto3, String selectTexto4){    
        setLayout(null);  

        label1= new JLabel("Seleccione la conversion que desea");
        label1.setBounds(60,10,250,10);
        add(label1);

        select= new JComboBox();
        select.setBounds(75,50,180,20);
        add(select);
        select.addItem("Selecciona");
        select.addItem(selectTexto1);
        select.addItem(selectTexto2);
        select.addItem(selectTexto3);
        select.addItem(selectTexto4);
        select.addItemListener(this);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(120,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    

    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==select){
            texto = select.getSelectedItem().toString();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1 ){
            if(texto == "conversion de cop a monedas"){
                Select2 formulario3= new Select2("cop a dolar","cop a euros","cop a libras esterlinas","cop a yen japones", "cop a won sul-coreano","conversion de cop a monedas");
                formulario3.setBounds(0,0,350,200);
                formulario3.setVisible(true);
                formulario3.setResizable(false);
                formulario3.setLocationRelativeTo(null); 
                this.setVisible(false);
            }
            if(texto == "conversion de monedas a cop"){
                Select2 formulario2= new Select2("dolar a cop","euros a cop","libras esterlinas a cop","yen japones a cop","won sul-coreano a cop","conversion de monedas a cop");
                formulario2.setBounds(0,0,350,200);
                formulario2.setVisible(true);
                formulario2.setResizable(false);
                formulario2.setLocationRelativeTo(null);
                this.setVisible(false);
             }
           if(texto == "millas por hora a km/h"){
            Input formulario3 = new Input("millas por hora a km/h");
            formulario3.setBounds(0,0,400,300);
            formulario3.setVisible(true);
            formulario3.setResizable(false);
            formulario3.setLocationRelativeTo(null); 
            this.setVisible(false);
            }

            if(texto == "km/h a millas por hora"){
                Input formulario3 = new Input("km/h a millas por hora");
                formulario3.setBounds(0,0,400,300);
                formulario3.setVisible(true);
                formulario3.setResizable(false);
                formulario3.setLocationRelativeTo(null); 
                this.setVisible(false);
                }
        }
    }
    
   
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public static void main(String[] args) {
    
        Select formulario1= new Select("conversion de cop a monedas","conversion de monedas a cop","millas por hora a km/h","km/h a millas por hora");

        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null); 
     
      

       

    }
}
