import javax.swing.*;

public class Login extends JDialog {


    private JLabel icon;
    private JTextField idField;
    private JPasswordField passwordField1;
    private JLabel passLabel;
    private JLabel idLabel;
    private JLabel registerlabel;
    private JButton registerButton;
    private JButton loginButton;
    private JPanel LoginPanel;

    public Login(JFrame parent) {
        super(parent);
        setTitle("Admin login");
        setContentPane(LoginPanel);
        setSize(400,500);
        setVisible(true);
        setResizable(false);


    }

    public static void main(String[] args) {
        Login log = new Login(null);
    }

}
