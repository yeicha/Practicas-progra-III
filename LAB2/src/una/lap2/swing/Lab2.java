package una.lap2.swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Jason
 */
public class Lab2 extends JFrame
{

    String[] gender =
    {
        "Masculino", "Femenino", "Otro"
    };
    JComboBox genderBox = new JComboBox(gender);
    JTextField name = new JTextField(20);
    JTextField phone = new JTextField(20);
    JTextArea result = new JTextArea(4, 15); // info del usuario
    JButton ok = new JButton("OK");
    JButton clean = new JButton("Clean");

    public Lab2()
    {
        super(" FORMULARIO ");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        JPanel pane = new JPanel();
        JLabel genderLabel = new JLabel("genero:");
        JLabel nameLabel = new JLabel("Nombre: ");
        JLabel phoneLabel = new JLabel("telefono: ");
        JLabel resultLabel = new JLabel("informacion del usuario: ");

        nameLabel.setName("lblName");
        phoneLabel.setName("lblPhone");
        resultLabel.setName("lblResult");

        name.setName("name");
        phone.setName("phone");
        result.setName("result");
        ok.setName("ok");
        clean.setName("clean");

        result.setLineWrap(true);
        result.setWrapStyleWord(true);

        pane.add(nameLabel);
        pane.add(name);
        pane.add(phoneLabel);
        pane.add(phone);
        pane.add(resultLabel);
        pane.add(result);
        pane.add(ok);
        pane.add(clean);
        pane.add(genderLabel);
        pane.add(genderBox);
        add(pane);
        setVisible(true);
    }

    private static void setLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc)
        {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] args)
    {
        Lab2.setLookAndFeel();
        Lab2 lab = new Lab2();
    }

}
