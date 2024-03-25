package Jframe;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import seat_reservation.*;

public class Birdland extends javax.swing.JFrame {
    reservation rs = new reservation(); //create obj from reservation

    public Birdland() {
        initComponents();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Seat_text = new javax.swing.JLabel();
        Seat1 = new javax.swing.JButton();
        Seat2 = new javax.swing.JButton();
        Seat3 = new javax.swing.JButton();
        Seat4 = new javax.swing.JButton();
        Seat7 = new javax.swing.JButton();
        Seat5 = new javax.swing.JButton();
        Seat8 = new javax.swing.JButton();
        Seat6 = new javax.swing.JButton();
        Seat9 = new javax.swing.JButton();
        Seat10 = new javax.swing.JButton();
        Seat11 = new javax.swing.JButton();
        Seat12 = new javax.swing.JButton();
        check = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Seat_text.setText("BIRDLAND");

        Seat1.setText("Seat");
        Seat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat1ActionPerformed(evt);
            }
        });

        Seat2.setText("Seat");
        Seat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat2ActionPerformed(evt);
            }
        });

        Seat3.setText("Seat");
        Seat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat3ActionPerformed(evt);
            }
        });

        Seat4.setText("Seat");
        Seat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat4ActionPerformed(evt);
            }
        });

        Seat7.setText("Seat");
        Seat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat7ActionPerformed(evt);
            }
        });

        Seat5.setText("Seat");
        Seat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat5ActionPerformed(evt);
            }
        });

        Seat8.setText("Seat");
        Seat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat8ActionPerformed(evt);
            }
        });

        Seat6.setText("Seat");
        Seat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat6ActionPerformed(evt);
            }
        });

        Seat9.setText("Seat");
        Seat9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat9ActionPerformed(evt);
            }
        });

        Seat10.setText("Seat");
        Seat10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat10ActionPerformed(evt);
            }
        });

        Seat11.setText("Seat");
        Seat11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat11ActionPerformed(evt);
            }
        });

        Seat12.setText("Seat");
        Seat12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seat12ActionPerformed(evt);
            }
        });

        check.setText("available");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        home.setText("home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Seat1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seat2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seat3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seat4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Seat5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seat6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seat7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seat8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Seat9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seat10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seat11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Seat12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(home)
                        .addGap(24, 24, 24)
                        .addComponent(Seat_text, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seat_text)
                    .addComponent(check)
                    .addComponent(home))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seat1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seat6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seat9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seat12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Seat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat1ActionPerformed
        rs.reserve(1,1,0); //pass value to reserve function that need 3 parameter row, colum, movie 
        disa(1,1); // pass value to function reserve that need 3 parameter row, colum
    }//GEN-LAST:event_Seat1ActionPerformed

    private void Seat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat2ActionPerformed
        rs.reserve(1,2,0);
        disa(1,2);
    }//GEN-LAST:event_Seat2ActionPerformed

    private void Seat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat3ActionPerformed
        rs.reserve(1,3,0);
        disa(1,3);
    }//GEN-LAST:event_Seat3ActionPerformed

    private void Seat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat4ActionPerformed
        rs.reserve(1,4,0);
        disa(1,4);
    }//GEN-LAST:event_Seat4ActionPerformed

    private void Seat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat5ActionPerformed
        rs.reserve(2,1,0);
        disa(2,1);
    }//GEN-LAST:event_Seat5ActionPerformed

    private void Seat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat6ActionPerformed
        rs.reserve(2,2,0);
        disa(2,2);
    }//GEN-LAST:event_Seat6ActionPerformed

    private void Seat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat7ActionPerformed
        rs.reserve(2,3,0);
        disa(2,3);
    }//GEN-LAST:event_Seat7ActionPerformed

    private void Seat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat8ActionPerformed
        rs.reserve(2,4,0);
        disa(2,4);
    }//GEN-LAST:event_Seat8ActionPerformed

    private void Seat9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat9ActionPerformed
        rs.reserve(3,1,0);
        disa(3,1);
    }//GEN-LAST:event_Seat9ActionPerformed

    private void Seat10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat10ActionPerformed
        rs.reserve(3,2,0);
        disa(3,2);
    }//GEN-LAST:event_Seat10ActionPerformed

    private void Seat11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat11ActionPerformed
        rs.reserve(3,3,0);
        disa(3,3);
    }//GEN-LAST:event_Seat11ActionPerformed

    private void Seat12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seat12ActionPerformed
        rs.reserve(3,4,0);
        disa(3,4);
    }//GEN-LAST:event_Seat12ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        home h = new home();
        h.show(); 
        dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
            try {
                read();
            } catch (IOException ex) {
                Logger.getLogger(Birdland.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_checkActionPerformed
        
        public void read() throws FileNotFoundException, IOException{
        reservation rs = new reservation();
        File fi = new File("C:\\Users\\TUF GAMING\\Documents\\NetBeansProjects\\Seat_reservation\\src\\txt\\Birdland_reservation.txt");
        FileReader fr = new FileReader(fi);
        BufferedReader br = new BufferedReader (fr);
        String s = "" ;
            while((s = br.readLine()) != null){
                String arr_s[] = s.split(","); // split when see "," 
                int r = Integer.parseInt(arr_s[0]); //make arr[0] to int and keep it in r
                int c = Integer.parseInt(arr_s[1]); //make arr[0] to int and keep it in c
                disa(r, c); // passing r and c to disa
        }
        br.close(); fr.close();
    }

        public void disa(int row, int colum){
           if(row == 1 && colum == 1) //if row and colum = position of seat 
                Seat1.setEnabled(false); //seat disable
            if(row == 1 && colum == 2)
                Seat2.setEnabled(false);
            if(row == 1 && colum == 3)            
                Seat3.setEnabled(false);            
            if(row == 1 && colum == 4)            
                Seat4.setEnabled(false);           
            if(row == 2 && colum == 1)            
                Seat5.setEnabled(false);            
            if(row == 2 && colum == 2)            
                Seat6.setEnabled(false);            
            if(row == 2 && colum == 3)            
                Seat7.setEnabled(false);            
            if(row == 2 && colum == 4)            
                Seat8.setEnabled(false);            
            if(row == 3 && colum == 1)            
                Seat9.setEnabled(false);            
            if(row == 3 && colum == 2)            
                Seat10.setEnabled(false);            
            if(row == 3 && colum == 3)            
                Seat11.setEnabled(false);            
            if(row == 3 && colum == 4)            
                Seat12.setEnabled(false);               
        }   
    
    public void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Birdland().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Seat1;
    private javax.swing.JButton Seat10;
    private javax.swing.JButton Seat11;
    private javax.swing.JButton Seat12;
    private javax.swing.JButton Seat2;
    private javax.swing.JButton Seat3;
    private javax.swing.JButton Seat4;
    private javax.swing.JButton Seat5;
    private javax.swing.JButton Seat6;
    private javax.swing.JButton Seat7;
    private javax.swing.JButton Seat8;
    private javax.swing.JButton Seat9;
    private javax.swing.JLabel Seat_text;
    private javax.swing.JButton check;
    private javax.swing.JButton home;
    // End of variables declaration//GEN-END:variables
}
