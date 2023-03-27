package aplicacao;

import entidades.PainelNumerico;
import entidades.PainelTexto;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
    public Calculadora() throws Exception {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 350);
        setLocation(400, 200);

        setLayout(new BorderLayout());

        PainelTexto painelTexto = new PainelTexto();
        add(BorderLayout.NORTH, painelTexto);

        JPanel painelDigital = new JPanel();
        painelDigital.setLayout(new BorderLayout());
        painelDigital.add(BorderLayout.CENTER, new PainelNumerico(painelTexto.getTelaNum()));

        add(BorderLayout.CENTER, painelDigital);


        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Calculadora();
    }
}
