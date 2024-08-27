import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cuco {
    public static void main(String[] args) {
        // Crear el marco de la ventana
        JFrame frame = new JFrame("Ventana con Botón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Crear el botón
        JButton button = new JButton("Haz clic aquí");
        
        // Añadir un ActionListener al botón
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear el mensaje en color rojo
                JLabel label = new JLabel("¡WOLVES CAMPEÓN!");
                label.setForeground(Color.RED);
                
                // Mostrar el mensaje en un cuadro de diálogo
                JOptionPane.showMessageDialog(frame, label);
            }
        });
        
        // Añadir el botón al marco
        frame.getContentPane().add(button, BorderLayout.CENTER);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}

