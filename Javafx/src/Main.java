import javax.swing.*;

void main() {
    JFrame janela = new JFrame("login");
    janela.setSize(800,800);
    janela.setLayout(null);

    JLabel labelEmail = new JLabel("Email");
    labelEmail.setBounds(200,60,400,40);
    JTextField inputEmail = new JTextField();
    inputEmail.setBounds(200,90,400,40);

    JLabel labelSenha = new JLabel("senha");
    labelSenha.setBounds(200,130,150,40);
    JTextField inputSenha = new JTextField();
    inputSenha.setBounds(200,160,400,40);

    JButton buttonLogin = new JButton("Login");
    buttonLogin.setBounds(200,250,150,40);

    buttonLogin.addActionListener(e -> {
        if ("admin@senai.br".equals(inputEmail.getText()) &&
        "12345".equals(inputSenha.getText())) {
            JOptionPane.showMessageDialog(null, "Acesso liberado");
        }else{
            JOptionPane.showMessageDialog(null,"Acesso negado");
        }
    });

    JButton buttonlimpar = new JButton("Limpar");
    buttonlimpar.setBounds(400,250,150,40);

    buttonlimpar.addActionListener(e -> {
        inputEmail.setText("");
        inputSenha.setText("");
    });


    janela.add(labelEmail);
    janela.add(inputEmail);
    janela.add(labelSenha);
    janela.add(inputSenha);
    janela.add(buttonLogin);
    janela.add(buttonlimpar);
    janela.setVisible(true);
}