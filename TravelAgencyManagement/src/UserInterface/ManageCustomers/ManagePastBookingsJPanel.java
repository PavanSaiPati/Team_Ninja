/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Airliner;
import Business.Customer;
import Business.Flight;
import Business.Seats;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavan
 */
public class ManagePastBookingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePastBookingsJPanel
     */
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    private Flight flight;
    private Seats seat;
    public ManagePastBookingsJPanel(JPanel cardSequenceJPanel,TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
        populatePastBookingsJTable();
    }
    
    private void populatePastBookingsJTable(){
        DefaultTableModel table = (DefaultTableModel) tblPastBookings.getModel();
        table.setRowCount(0);
        for(Customer customer : travelAgency.getCustomerDirectory().getCustomerDirectory()){
            Object row[] = new Object[5];
            row[0]=customer;
            row[1]=customer.getCustomerContact();
            row[2]=customer.getCustomerEmail();
            row[3]=customer.getFlightNumber();
            row[4]=customer.getSeatNumber();
            table.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPastBookings = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPastBookings = new javax.swing.JTable();
        btnDeleteBooking = new javax.swing.JButton();

        setBackground(new java.awt.Color(22, 72, 128));
        setPreferredSize(new java.awt.Dimension(1111, 765));

        lblPastBookings.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblPastBookings.setForeground(new java.awt.Color(255, 255, 255));
        lblPastBookings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastBookings.setText("Past Bookings");

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblPastBookings.setBackground(new java.awt.Color(0, 0, 0));
        tblPastBookings.setForeground(new java.awt.Color(255, 0, 0));
        tblPastBookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact", "Email", "Flight Number", "Seat Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPastBookings);
        if (tblPastBookings.getColumnModel().getColumnCount() > 0) {
            tblPastBookings.getColumnModel().getColumn(0).setResizable(false);
            tblPastBookings.getColumnModel().getColumn(1).setResizable(false);
            tblPastBookings.getColumnModel().getColumn(2).setResizable(false);
            tblPastBookings.getColumnModel().getColumn(3).setResizable(false);
            tblPastBookings.getColumnModel().getColumn(4).setResizable(false);
        }

        btnDeleteBooking.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteBooking.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDeleteBooking.setForeground(new java.awt.Color(255, 0, 0));
        btnDeleteBooking.setText("Cancel Booking");
        btnDeleteBooking.setMaximumSize(new java.awt.Dimension(155, 31));
        btnDeleteBooking.setMinimumSize(new java.awt.Dimension(155, 31));
        btnDeleteBooking.setPreferredSize(new java.awt.Dimension(155, 31));
        btnDeleteBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPastBookings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 356, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(263, 263, 263))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDeleteBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(15, 15, 15)
                .addComponent(lblPastBookings)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(btnDeleteBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBookingActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPastBookings.getSelectedRow();
        if(selectedRow  >= 0) {
           int dialogButton = JOptionPane.YES_NO_OPTION;
           int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to cancel the booking ?","Warning",dialogButton);
           if(dialogResult == JOptionPane.YES_OPTION) {
               Customer customer = (Customer)tblPastBookings.getValueAt(selectedRow,0);
               for(Airliner airliner:travelAgency.getAirlinerDirectory().getAirlinerList()) {
                for(Flight flight:airliner.getFlightList()) {
                    if(flight.getFlightNumber().equals(customer.getFlightNumber())){
                          for(Seats seat:flight.getSeatList()){
                            if(seat.getSeatNumber().equals(customer.getSeatNumber()))
                                seat.setSeatAvailability(true);
                            }
                          flight.setAvailableSeats(flight.getAvailableSeats()+1);
                    }
            
               
            }
        }
               
               
               travelAgency.getCustomerDirectory().deleteCustomer(customer);
               populatePastBookingsJTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteBookingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteBooking;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPastBookings;
    private javax.swing.JTable tblPastBookings;
    // End of variables declaration//GEN-END:variables
}
