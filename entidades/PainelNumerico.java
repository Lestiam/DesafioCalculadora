package entidades;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelNumerico extends JPanel implements ActionListener {
    private JTextField texto;
    private char op;
    private double value1;
    private double value2;
    private JButton btAdi;
    private JButton btSub;
    private JButton btMult;
    private JButton btDiv;
    private JButton btIgual;

    public PainelNumerico(JTextField texto){
        this.texto = texto;

        setLayout(new GridLayout(4,4));

        JButton bt7 = new JButton("7");
        bt7.addActionListener(this);
        add(bt7);

        JButton bt8 = new JButton("8");
        bt8.addActionListener(this);
        add(bt8);

        JButton bt9 = new JButton("9");
        bt9.addActionListener(this);
        add(bt9);

        //divisão
        btDiv = new JButton("/");
        btDiv.addActionListener(this);
        add(btDiv);

        JButton bt4 = new JButton("4");
        bt4.addActionListener(this);
        add(bt4);

        JButton bt5 = new JButton("5");
        bt5.addActionListener(this);
        add(bt5);

        JButton bt6 = new JButton("6");
        bt6.addActionListener(this);
        add(bt6);

        //multiplicação
        btMult = new JButton("*");
        btMult.addActionListener(this);
        add(btMult);

        JButton bt1 = new JButton("1");
        bt1.addActionListener(this);
        add(bt1);

        JButton bt2 = new JButton("2");
        bt2.addActionListener(this);
        add(bt2);

        JButton bt3 = new JButton("3");
        bt3.addActionListener(this);
        add(bt3);

        //subtração
        btSub = new JButton("-");
        btSub.addActionListener(this);
        add(btSub);

        JButton bt0 = new JButton("0");
        bt0.addActionListener(this);
        add(bt0);

        JButton btDot = new JButton(".");
        btDot.addActionListener(this);
        add(btDot);


        //igual
        btIgual = new JButton("=");
        btIgual.addActionListener(this);
        add(btIgual);

        //adição
        btAdi = new JButton("+");
        btAdi.addActionListener(this);
        add(btAdi);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        JButton bt = (JButton) e.getSource();



        if ((bt == btIgual || bt == btAdi || bt== btSub || bt == btMult || bt == btDiv)) {
            if (texto.getText().isEmpty()) {
                return;
            }
            if (bt == btIgual) {
                value2 = Double.parseDouble(texto.getText());

                double result = 0.0;

                if (op == '+') {
                    result = value1 + value2;
                } else if (op == '-') {
                    result = value1 - value2;
                } else if (op == '*') {
                    result = value1 * value2;
                } else if (op == '/') {
                    result = value1 / value2;
                }

                texto.setText(String.valueOf(result));
                op = '\u0000';
                value1 = result;
                value2 = 0;

            } else {
                op = bt.getText().charAt(0);
                value1 = Double.parseDouble(texto.getText());
                texto.setText("");
            }
        } else {
            String numero = bt.getText();
            texto.setText(texto.getText() + numero);
        }

    }
}
