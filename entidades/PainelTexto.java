package entidades;

import javax.swing.*;
import java.awt.*;

public class PainelTexto extends JPanel {

    private JTextField telaNum;

    public PainelTexto(){
        setLayout(new FlowLayout());

        telaNum = new JTextField(30);
        telaNum.setHorizontalAlignment(JTextField.RIGHT);
        telaNum.setEnabled(false);
        add(telaNum);
    }

    public JTextField getTelaNum() {
        return telaNum;
    }
}
