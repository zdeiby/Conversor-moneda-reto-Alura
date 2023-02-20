package visual;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Input extends JFrame implements ActionListener{
 
    private JTextField input;
    private JButton boton1;
    private JButton boton2;
    private JLabel label1;
   private static String textoInput;
    public Input(String texto){
        setLayout(null);

        label1= new JLabel(texto + " Ingrese en la cantidad a convertir");
        label1.setBounds(50,20,300,10);
        add(label1);


        input = new JTextField();
        input.setBounds(120,70,150,20);
        add(input);

        boton1= new JButton("Aceptar");
        boton1.setBounds(80,150, 90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2= new JButton("Regresar");
        boton2.setBounds(220,150, 90,30);
        add(boton2);
        boton2.addActionListener(this);
        this.textoInput= texto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            if(textoInput == "cop a dolar"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                    JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/4883)*100d)/100d) +" Dolares.");
                };
            
                
            }
            if(textoInput == "cop a euros"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                    JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/5221)*100d)/100d) +" Euros.");
                }
            }
            if(textoInput == "cop a libras esterlinas"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/5876)*100d)/100d) +" Libras esterlinas.");
                }
            }
            if(textoInput == "cop a yen japones"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/36.37)*100d)/100d) +" yenes japoneses.");
                }
            }
            if(textoInput == "cop a won sul-coreano"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/3.77)*100d)/100d) +" won sul coreanos.");
                }
            }
            if(textoInput == "dolar a cop"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*4883)*100d)/100d) +" Pesos COP.");
                }
            }
            if(textoInput == "euros a cop"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*5221)*100d)/100d) +" Pesos colombianos.");
                }
            }
            if(textoInput == "libras esterlinas a cop"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*5876)*100d)/100d) +" Pesos colombianos");
                }
            }
            if(textoInput == "yen japones a cop"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*36.37)*100d)/100d) +" Pesos colombianos.");
                }
            }
            if(textoInput == "won sul-coreano a cop"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*3.77)*100d)/100d) +" Pesos colombianos.");
                }
            }
            if(textoInput == "km/h a millas por hora"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE*0.62)*100d)/100d) +" Millas por hora.");
                }
            }
            if(textoInput == "millas por hora a km/h"){
                String textoGuardado=input.getText();
                double textoE=0;
                try{
                    double texto = Double.parseDouble(textoGuardado);
                    textoE=texto;
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Ingresa numeros, caracteres no validos");
                    //(Object)textoE).getClass().getSimpleName() == "Double"
                }
                if(textoE != 0){
                JOptionPane.showMessageDialog(null, "su resultado es: "+((double)Math.round((textoE/0.62)*100d)/100d) +" KM/H.");
                }
            }

            
        }
        if(e.getSource() == boton2){
            Select formulario1= new Select("conversion de cop a monedas","conversion de monedas a cop","millas por hora a km/h","km/h a millas por hora");
            formulario1.setBounds(0,0,350,200);
            formulario1.setVisible(true);
            formulario1.setResizable(false);
            formulario1.setLocationRelativeTo(null);
            this.setVisible(false); 
        }
        
    }

   
}



