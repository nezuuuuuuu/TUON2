import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Objects;

public class LogIn extends JFrame {
    private JTextField userName;
    private JPasswordField password;
    private JButton logInButton;
    private JButton registerButton;
    private JPanel Login;
    private String s;
    private int ctr =0;
    private FileReader fileReader;
    private BufferedReader reader;
    private BufferedReader passwordR;


    public LogIn(){

        this.setContentPane(this.Login);
        this.setSize(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


        logInButton.addActionListener(e -> {

            try {
                fileReader= new FileReader("C:\\Users\\janed\\Downloads\\java\\Sender\\src\\IDs.txt");
                 reader=new BufferedReader(fileReader);
                 passwordR=new BufferedReader(new FileReader("C:\\Users\\janed\\Downloads\\java\\Sender\\src\\IDs.txt"));

                while((s=reader.readLine())!=null){


                    String pass= reader.readLine();

                    if(Objects.equals(s, userName.getText())){

                        if(Objects.equals(pass, new String(password.getPassword()))){
                            ctr=1;
                            this.setVisible(false);
                            new Submit();
                            break;
                        }
                    }
                }
                if(ctr==0){
                    JOptionPane.showMessageDialog(this,"User not found");
                }
            }  catch (Exception k) {
                System.out.println("Asdasd");
            }
        });
    }


}
