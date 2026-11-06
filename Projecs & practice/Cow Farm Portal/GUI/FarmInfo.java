package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entity.*;
import File.*;

public class FarmInfo extends JFrame implements ActionListener {

    Font font15 = new Font("Arial", Font.BOLD, 15);

    JLabel idLabel, ageLabel, colorLabel, weightLabel, priceLabel;
    JTextField idTF, ageTF, colorTF, weightTF, priceTF, searchTF;
    JTextArea screen;

    JButton insertBtn, updateBtn, deleteBtn, clearBtn, searchBtn, saveBtn;

    Cow[] cows = new Cow[200];
    JPanel panel;

    // Radio buttons
    JRadioButton r1, r2, r3, r4;
    ButtonGroup bGroup;

    // ComboBox
    JComboBox<String> typeBox;

    // Checkboxes
    JCheckBox a1, a2, a3, a4;

    // Background
    JLabel bgLabel;

    public FarmInfo() {

        setTitle("Farm Information Portal");
        setSize(800, 600);
        setLocation(200, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        // Panel
        panel = new JPanel();
        panel.setBounds(0, 0, 800, 600);
        panel.setLayout(null);
        setContentPane(panel);

        // Load cows
        FileIO.loadFromFile(cows);

        // Background Image
        ImageIcon bg = new ImageIcon("farm.png");
        bgLabel = new JLabel(bg);
        bgLabel.setBounds(0, 0, 800,600);
        panel.add(bgLabel);

        // Title
        JLabel title = new JLabel("Dhaka Central Cow Farm");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(new Color(255, 215, 0));
        title.setBounds(275, 40, 400, 40);
        bgLabel.add(title);

        // Labels & TextFields
        idLabel = label(80, 100, "Code");
		idLabel.setForeground(Color.WHITE);
        ageLabel = label(80, 150, "Age");
		ageLabel.setForeground(Color.WHITE);
        colorLabel = label(80, 200, "Color");
		colorLabel.setForeground(Color.WHITE);
        weightLabel = label(80, 250, "Weight");
		weightLabel.setForeground(Color.WHITE);
        priceLabel = label(80, 300, "Price");
		priceLabel.setForeground(Color.WHITE);

        idTF = field(200, 100);
        ageTF = field(200, 150);
        colorTF = field(200, 200);
        weightTF = field(200, 250);
        priceTF = field(200, 300);

        // Buttons
        insertBtn = button(100, 350, "Insert");
        updateBtn = button(220, 350, "Update");
        deleteBtn = button(340, 350, "Delete");
        clearBtn = button(460, 350, "Clear");
        saveBtn = button(580, 350, "Save");

        // Search
        searchTF = field(500, 100);
        searchBtn = button(660, 100, "Get");

        // Radio buttons
        r1 = new JRadioButton("Holstein Friesian");
        r2 = new JRadioButton("Jersey");
        r3 = new JRadioButton("Shahiwal");
        r4 = new JRadioButton("Brahman");
        bGroup = new ButtonGroup();
        bGroup.add(r1);
        bGroup.add(r2);
        bGroup.add(r3);
        bGroup.add(r4);

        int y = 130;
        for (JRadioButton r : new JRadioButton[]{r1, r2, r3, r4}) {
            r.setBounds(510, y, 150, 25);
            r.setForeground(Color.WHITE);
            r.setOpaque(false);
            bgLabel.add(r);
            y += 25;
        }

        // ComboBox
        String[] types = {"Cow", "Heifer", "Bull", "Steer", "Calf"};
        typeBox = new JComboBox<>(types);
        typeBox.setBounds(80, 400, 120, 30);
        typeBox.setOpaque(false);
        bgLabel.add(typeBox);

        // Checkboxes
        a1 = new JCheckBox("healthy");
        a2 = new JCheckBox("mastitis");
        a3 = new JCheckBox("FMD");
        a4 = new JCheckBox("infected");
        y = 130;
        for (JCheckBox c : new JCheckBox[]{a1, a2, a3, a4}) {
            c.setBounds(650, y, 130, 25);
            c.setForeground(Color.WHITE);
            c.setOpaque(false);
            bgLabel.add(c);
            y += 25;
        }

        // Screen
        screen = new JTextArea();
        screen.setFont(font15);
        JScrollPane sp = new JScrollPane(screen);
        sp.setBounds(50, 450, 700, 100);
        bgLabel.add(sp);

        // Mouse hover effect for buttons
        JButton[] buttons = {insertBtn, updateBtn, deleteBtn, clearBtn, saveBtn, searchBtn};
        for (JButton b : buttons) {
            b.setBackground(Color.WHITE);
            b.setOpaque(true);
            b.setBorderPainted(false);
            b.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    b.setBackground(new Color(145,200,145));
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    b.setBackground(Color.LIGHT_GRAY);
                }
            });
        }

        updateScreen();
        setVisible(true);
    }

    // Helper methods
    JLabel label(int x, int y, String text) {
        JLabel l = new JLabel(text);
        l.setBounds(x, y, 100, 30);
        l.setFont(font15);
        bgLabel.add(l);
        return l;
    }

    JTextField field(int x, int y) {
        JTextField tf = new JTextField();
        tf.setBounds(x, y, 150, 30);
        tf.setFont(font15);
        bgLabel.add(tf);
        return tf;
    }

    JButton button(int x, int y, String text) {
        JButton b = new JButton(text);
        b.setBounds(x, y, 100, 30);
        b.addActionListener(this);
        bgLabel.add(b);
        return b;
    }

    void updateScreen() {
        String s = "";
        for (Cow c : cows)
            if (c != null)
                s += c.getInfo() + "\n";
        screen.setText(s);
    }

    void clearFields() {
        idTF.setText("");
        ageTF.setText("");
        colorTF.setText("");
        weightTF.setText("");
        priceTF.setText("");
        searchTF.setText("");
		screen.setText("");
        bGroup.clearSelection();
        typeBox.setSelectedIndex(0);
        a1.setSelected(false);
        a2.setSelected(false);
        a3.setSelected(false);
        a4.setSelected(false);
    }

    
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == insertBtn) {
                int idx = getEmptyIndex();
                if (idx != -1) {
                    cows[idx] = new Cow(
                            idTF.getText(),
                            ageTF.getText(),
                            colorTF.getText(),
                            Double.parseDouble(weightTF.getText()),
                            Double.parseDouble(priceTF.getText())
                    );
                    updateScreen();
                }
            } else if (e.getSource() == updateBtn) {
                int idx = getIndexById(idTF.getText());
                if (idx != -1) {
                    cows[idx].setAge(ageTF.getText());
                    cows[idx].setColor(colorTF.getText());
                    cows[idx].setWeight(Double.parseDouble(weightTF.getText()));
                    cows[idx].setPrice(Double.parseDouble(priceTF.getText()));
                    updateScreen();
                }
            } else if (e.getSource() == deleteBtn) {
                int idx = getIndexById(idTF.getText());
                if (idx != -1) {
                    cows[idx] = null;
                    clearFields();
                    updateScreen();
                } 
            } else if (e.getSource() == clearBtn) {
                clearFields();
            } else if (e.getSource() == searchBtn) {
                int idx = getIndexById(searchTF.getText());
                if (idx != -1) {
                    Cow c = cows[idx];
                    idTF.setText(c.getId());
                    ageTF.setText(c.getAge());
                    colorTF.setText(c.getColor());
                    weightTF.setText("" + c.getWeight());
                    priceTF.setText("" + c.getPrice());
                } else {
                    JOptionPane.showMessageDialog(this, "Cow not found!");
                }
            } else if (e.getSource() == saveBtn) {
                FileIO.saveChangesInFile(cows);
                JOptionPane.showMessageDialog(this, "Saved Successfully");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error! Check input values.");
        }
    }

    int getEmptyIndex() {
        for (int i = 0; i < cows.length; i++)
            if (cows[i] == null) return i;
        return -1;
    }

    int getIndexById(String id) {
        for (int i = 0; i < cows.length; i++)
            if (cows[i] != null && cows[i].getId().equals(id)) return i;
        return -1;
    }
}
