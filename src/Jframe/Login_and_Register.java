package Jframe;
import java.util.*;
import javax.swing.JOptionPane;
public class Login_and_Register extends javax.swing.JFrame {
    private HashMap<String, String> User = new HashMap<String, String>();
    private String Password;
    private String Username;
    public Login_and_Register() {
        initComponents();
    }
    
    public void pop(){
        JOptionPane.showMessageDialog(jPanel1, "invalid username or password","WARNING", JOptionPane.WARNING_MESSAGE); //pop up message
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Password_textfield = new javax.swing.JTextField();
        Login_button = new javax.swing.JButton();
        Register_button1 = new javax.swing.JButton();
        Username_label = new javax.swing.JLabel();
        User_textfield = new javax.swing.JTextField();
        Password_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Password_textfield1 = new javax.swing.JTextField();
        Register_button2 = new javax.swing.JButton();
        Username_label1 = new javax.swing.JLabel();
        User_textfield1 = new javax.swing.JTextField();
        Password_label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_button.setText("Login");
        Login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_buttonActionPerformed(evt);
            }
        });

        Register_button1.setText("Register");
        Register_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_button1ActionPerformed(evt);
            }
        });

        Username_label.setText("Username : ");

        Password_label.setText("Password : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Username_label)
                            .addComponent(Password_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Password_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(User_textfield, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Login_button))
                            .addComponent(Register_button1))
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_label)
                    .addComponent(User_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Register_button1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login_button)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTab.addTab("tab1", jPanel1);

        Register_button2.setText("Register");
        Register_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_button2ActionPerformed(evt);
            }
        });

        Username_label1.setText("Username : ");

        Password_label1.setText("Password : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Username_label1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Password_label1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Password_textfield1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(User_textfield1))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(Register_button2)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_label1)
                    .addComponent(User_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_textfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Register_button2)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTab.addTab("tab2", jPanel2);

        getContentPane().add(jTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -36, 270, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_buttonActionPerformed
        Username = User_textfield.getText();
        Password = Password_textfield.getText();
        if(User.containsKey(Username) && User.containsValue(Password)){ // check username and password in textbox are exist or not
            home h = new home(); //if username and password are correct show home
            h.show(); 
            dispose(); //close current tab
        }
        else pop();
        User_textfield.setText("");
        Password_textfield.setText("");
    }//GEN-LAST:event_Login_buttonActionPerformed

    private void Register_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_button1ActionPerformed
        jTab.setSelectedIndex(1);
    }//GEN-LAST:event_Register_button1ActionPerformed

    private void Register_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_button2ActionPerformed
        Username = User_textfield1.getText();
        if(User_textfield1.getText().isEmpty()|| Password_textfield1.getText().isEmpty()) { //check it's empty or not
            pop();
            }
        else if(User.containsKey(Username)){
            pop();
        }
        else {
            User.put(User_textfield1.getText(), Password_textfield1.getText()); // put username and password to dic
            User_textfield1.setText("");
            Password_textfield1.setText("");
            jTab.setSelectedIndex(0);
        }
    }//GEN-LAST:event_Register_button2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_and_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_button;
    private javax.swing.JLabel Password_label;
    private javax.swing.JLabel Password_label1;
    private javax.swing.JTextField Password_textfield;
    private javax.swing.JTextField Password_textfield1;
    private javax.swing.JButton Register_button1;
    private javax.swing.JButton Register_button2;
    private javax.swing.JTextField User_textfield;
    private javax.swing.JTextField User_textfield1;
    private javax.swing.JLabel Username_label;
    private javax.swing.JLabel Username_label1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTab;
    // End of variables declaration//GEN-END:variables
}
