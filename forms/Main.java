import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    JFrame janela = new JFrame("Explo swing");
    janela.setSize(300,200);
    janela.setLayout(null);

    JButton button = new JButton("clique aqui");
    button.setBounds(20,20,150,40);

    JLabel label = new JLabel("texto");
    label.setBounds(20,50,150,40);

    JTextField input = new JTextField();
    input.setBounds(20,80,150,40);

    button.addActionListener(e -> {
        String texto = input.getText();
        JOptionPane.showConfirmDialog(null,"voce digitou " + texto);
    } );

    janela.setVisible(true);
    janela.add(label);
    janela.add(button);
    janela.add(input);
}
