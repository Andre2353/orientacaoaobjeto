import javax.swing.*;
public static void main() {
    List <pessoa> pessoa = new ArrayList<>();

    JFrame janela = new JFrame("Exeplo swing");
    janela.setSize(1000,1000);
    janela.setLayout(null);

    JButton buttonenviar = new JButton("Enviar ");
    buttonenviar.setBounds(20,250,150,40);

    JButton button1 = new JButton("mostrar lista ");
    button1.setBounds(20,300,150,40);

    JLabel label = new JLabel("Digite seu nome ");
    label.setBounds(20,50,150,40);

    JTextField input = new JTextField();
    input.setBounds(20,80,150,40);


    JLabel label1 = new JLabel("Digite seu e-mail ");
    label1.setBounds(20,110,150,40);

    JTextField input1 = new JTextField();
    input1.setBounds(20,140,150,40);

    JLabel label2 = new JLabel("Digite seu telefone ");
    label2.setBounds(20,170,150,40);

    JTextField input2 = new JTextField();
    input2.setBounds(20,200,150,40);


    buttonenviar.addActionListener(e -> {
        pessoa p1 = new pessoa(input1.getText(),input1.getText(),input2.getText());

        String texto = input.getText();
        JOptionPane.showConfirmDialog(null,"dados salvoa com sucesso");
    } );
    button1.addActionListener(e -> {
        String texto = input.getText();
        JOptionPane.showConfirmDialog(null,"pessoas cadastradas"+ pessoa);
    } );



    janela.setVisible(true);
    janela.add(label);
    janela.add(label2);
    janela.add(label1);

    janela.add(buttonenviar);
    janela.add(button1);

    janela.add(input);
    janela.add(input1);
    janela.add(input2);

}