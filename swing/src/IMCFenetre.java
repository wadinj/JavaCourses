import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMCFenetre extends JFrame {

    public IMCFenetre() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lb1 = new JLabel("Taille :");
        lb1.setBounds(20, 20, 100, 40);
        this.add(lb1); 

        JLabel lb2 = new JLabel("Poids :");
        lb2.setBounds(20, 60, 100, 40);
        this.add(lb2); 

        JLabel lbResult = new JLabel("Calculateur IMC");
        lbResult.setBounds(20, 90, 300, 40);
        this.add(lbResult); 

        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);
        this.add(txtHeight); 

        JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 60, 200, 40);
        this.add(txtWeight); 

        JButton btn = new JButton("Calculer l'IMC");
        btn.setBounds(20, 130, 300, 40);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Event
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double poids = Double.parseDouble(txtWeight.getText());
                double taille = Double.parseDouble(txtHeight.getText());

                double imc = poids / (Math.pow(taille, 2));

                if (imc < 18.5) {
                    lbResult.setText("Maigre - IMC : " + imc);
                } else if (imc < 25) {
                    lbResult.setText("normal - IMC : " + imc);
                } else if (imc < 30) {
                    lbResult.setText("Surcharge - IMC : " + imc);
                } else {
                    lbResult.setText("Obese - BMI : " + imc);
                }
            }
        });

        this.add(btn);

        this.setSize(400, 300);
        this.setLayout(null);
        this.setVisible(true);
    }
}
