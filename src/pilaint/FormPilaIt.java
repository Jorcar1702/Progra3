package pilaint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPilaIt {
    private JPanel Ventana;
    private JTextField textDato;
    private JButton agregarButton;
    private JButton eliminarButton;
    private JButton cimaButton;
    private JTextField textBuscar;
    private JButton buscarButton;
    private JTextArea textArea1;

    public PilaInt pila = new PilaInt();

    public FormPilaIt(){

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer i= Integer.parseInt(textDato.getText());
                pila.push(i);
                textArea1.setText(pila.sacarPila());
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer i= pila.pop();
                    JOptionPane.showMessageDialog(null,i);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
                textArea1.setText(pila.sacarPila());

            }
        });
        cimaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer i=pila.peek();
                    JOptionPane.showMessageDialog(null,"Elemento de la cima:"+i);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer i = Integer.parseInt(textBuscar.getText());
                    int posicion= pila.search(i);
                    JOptionPane.showMessageDialog(null,"El dato "+i+"se encuenta"+"en la posicion"+
                            posicion);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormPilaIt");
        frame.setContentPane(new FormPilaIt().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
