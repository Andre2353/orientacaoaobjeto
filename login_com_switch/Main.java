import javax.swing.*;


public static void main(String[] args) {

    JFrame janela = new JFrame("Exeplo swing");
    janela.setSize(1000, 1000);
    janela.setLayout(null);

    // Componentes
    JButton buttonenviar = new JButton("Entrar ");
    buttonenviar.setBounds(20, 200, 150, 40);

    JButton button1 = new JButton("resetar campos ");
    button1.setBounds(20, 250, 150, 40);

    JLabel label = new JLabel("Digite seu e-mail ");
    label.setBounds(20, 50, 150, 40);

    JTextField input = new JTextField();
    input.setBounds(20, 80, 150, 40);

    JLabel label1 = new JLabel("Digite sua senha ");
    label1.setBounds(20, 110, 150, 40);

    JTextField input1 = new JTextField();
    input1.setBounds(20, 140, 150, 40);


    buttonenviar.addActionListener(e -> {
        String email= input.getText();
        String senha= input1.getText();

        if ("admin@senai.com".equals(email) && "123456".equals(senha)) {
            JOptionPane.showConfirmDialog(null, "login realizado");
        }
        else if(input1.getText().equals("") && input.getText().equals("")) {
            JOptionPane.showConfirmDialog(null, "nenhum campo pode estar vazio");
        }

        else {
            JOptionPane.showConfirmDialog(null, "senha incorreta ");
        }

    });

    button1.addActionListener(e -> {
        button1.addActionListener(_ -> {
            input.setText("");
            input1.setText("");
        });
    });


    janela.add(label);
    janela.add(label1);
    janela.add(buttonenviar);
    janela.add(button1);
    janela.add(input);
    janela.add(input1);
    janela.setVisible(true);
}
