import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;



public class Submit extends JFrame{
    private JPanel Jpanel;
    private JButton button;
    private JButton Loc;
    private JTextField textField1;
    private JTextField textField2;
    private JButton submitButton;
    private File file;

    private File target;
    JFileChooser fileChooser;

    JFileChooser fileChooser2;


    public Submit(){
        this.setContentPane(this.Jpanel);
        this.setSize(500,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        textField2.setText("C:\\Users\\janed\\Documents\\UGENGGENG|| [COMMON]");

        button.addActionListener(e -> {

             fileChooser=new JFileChooser();

            if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){

                file=new File(fileChooser.getSelectedFile().getAbsolutePath());

            }
            textField1.setText(file.getAbsolutePath());



        });
        Loc.addActionListener(e -> {
            fileChooser2=new JFileChooser();
            fileChooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            if(fileChooser2.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
                fileChooser2.setCurrentDirectory(new java.io.File("."));


                target=new File(fileChooser2.getSelectedFile().getAbsolutePath());

            }
            else{

                target=new File("C:\\Users\\janed\\Documents\\UGENGGENG");
            }
            textField2.setText(target.getAbsolutePath());




        });

        submitButton.addActionListener(e ->{
            if(file==null){
                JOptionPane.showMessageDialog(this,"cannot");

            }
            else {
                try {

                    target = new File(target.getAbsolutePath() + "\\" + file.getName());


                    Files.copy(file.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    JOptionPane.showMessageDialog(this, "Succesful");

                } catch (IOException ex) {

                    throw new RuntimeException();

                }
            }


        });

    }




    public static void main(String[] args) {
        LogIn login=new LogIn();

    }
}
