import javax.swing.*; /*Es una biblioteca gráfica para Java. 
Incluye widgets para interfaz gráfica de usuario tales como cajas de texto, 
botones, listas desplegables y tablas. */

import java.awt.event.*; /*Librería que usaré para la creación de un botón*/

import java.awt.*; /*Librería que nos permitirá cambiar el color a nuestra interfaz*/

public class Ventana extends JFrame implements ActionListener{ /*JFrame es una biblioteca gráfica para Java. Incluye widgets 
para interfaz gráfica de usuario tales como cajas de texto, botones, listas desplegables y tablas. 
ActionListener nos ayuda a crear un botón*/
    
    private JLabel etiqueta, etiqueta2, etiqueta3, etiqueta4, etiqueta5,
    etiqueta6, etiqueta7; /*Declarar etiqueta */

    private JTextField texto, texto2, texto3, texto4, texto5, texto6,
    texto7; /*Declarar cajas de texto*/

    private JButton boton1; /*Declarar un botón*/


    public Ventana(){ /*Aquí se asignan las propiedades de nuestra etiqueta y nuestra ventana*/
        setTitle("Bienvenido");
        setLayout(null); /*Habilitar la ventana para editar*/
        getContentPane().setBackground(new Color(109, 205, 168 )); /*Elige el color de nuestra ventana*/

        etiqueta = new JLabel("NOMBRE"); /*Constructor etiqueta*/
        etiqueta.setBounds(40,20,100,35);
        add(etiqueta);

        etiqueta2 = new JLabel("EDAD"); /*Constructor etiqueta*/
        etiqueta2.setBounds(40,80,100,35);
        add(etiqueta2);

        etiqueta3 = new JLabel("OCUPACIÓN"); /*Constructor etiqueta*/
        etiqueta3.setBounds(40,140,100,35);
        add(etiqueta3);

        etiqueta4 = new JLabel("PAÍS DE ORIGEN"); /*Constructor etiqueta*/
        etiqueta4.setBounds(40,200,150,35);
        add(etiqueta4);

        etiqueta5 = new JLabel("E-MAIL"); /*Constructor etiqueta*/
        etiqueta5.setBounds(40,260,150,35);
        add(etiqueta5);

        etiqueta6 = new JLabel("HOBBY"); /*Constructor etiqueta*/
        etiqueta6.setBounds(40,320,150,35);
        add(etiqueta6);

        etiqueta7 = new JLabel("N° DE CELULAR"); /*Constructor etiqueta*/
        etiqueta7.setBounds(40,380,150,35);
        add(etiqueta7);


        
        texto = new JTextField(""); /*Constructor caja de texto */
        texto.setBounds(210,20,250,35);
        add(texto);

        texto2 = new JTextField(""); /*Constructor caja de texto */
        texto2.setBounds(210,80,250,35);
        add(texto2);

        texto3 = new JTextField(""); /*Constructor caja de texto */
        texto3.setBounds(210,140,250,35);
        add(texto3);

        texto4 = new JTextField(""); /*Constructor caja de texto */
        texto4.setBounds(210,200,250,35);
        add(texto4);

        texto5 = new JTextField(""); /*Constructor caja de texto */
        texto5.setBounds(210,260,250,35);
        add(texto5);

        texto6 = new JTextField(""); /*Constructor caja de texto */
        texto6.setBounds(210,320,250,35);
        add(texto6);

        texto7 = new JTextField(""); /*Constructor caja de texto */
        texto7.setBounds(210,380,250,35);
        add(texto7);



        boton1 = new JButton("Reset", null); /*Constructor botón*/
        boton1.setBounds(210,540,100,35);
        add(boton1);
        boton1.addActionListener(this); /*Agrega funcionalidad a nuestro botón*/
    }


    public void actionPerformed(ActionEvent e){ /*Activa la funcionalidad del botón*/
        if(e.getSource() == boton1){

            texto.setText("");    /*La funcionalidad será borrar todos los datos ingresados en cada caja*/
            texto2.setText("");
            texto3.setText("");
            texto4.setText("");
            texto5.setText("");
            texto6.setText("");
            texto7.setText("");
        }
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setBounds(0,0,500,700);/*Medidas de la ventana */
        ventana.setVisible(true);/*Hacerla visible */
        ventana.setLocationRelativeTo(null); /*Centrar ventana */        
    }
}