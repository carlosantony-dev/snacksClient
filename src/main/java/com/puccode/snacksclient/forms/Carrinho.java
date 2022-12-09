package com.puccode.snacksclient.forms;

import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import stubs.Order;

public class Carrinho extends javax.swing.JFrame {
    
    private Map<Integer, Order> myOrders = new HashMap<>();
    private int cont = 0;

    public Carrinho() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        panel_order_list = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Pedidos no carrinho");

        panel_order_list.setBackground(new java.awt.Color(255, 255, 255));
        panel_order_list.setLayout(new javax.swing.BoxLayout(panel_order_list, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(panel_order_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(panel_order_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(532, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }
    
    public void addOrderToCart(Order order) throws Exception {
        if (order == null) {
            throw new Exception("Pedido não pode ser nulo!");
        }
        myOrders.put(cont, order);
        cont++;
        launchOrderList();
    }
    
    //TODO: call this method later to remove item from cart
    public void removeOrderToCart(int key) throws Exception {
        if (key < 0) {
            throw new Exception("Chave não pode ser negativa!");
        }
        myOrders.remove(key);
        cont--;
        launchOrderList();
    }
    
    private void launchOrderList() {
        panel_order_list.removeAll();
        for(int i=0; i < myOrders.size(); i++) {
            if (myOrders.get(i) != null) {
                JPanel newJpanel = new JPanel();
                newJpanel.setSize(new Dimension(panel_order_list.getWidth(), 40));
                newJpanel.setBackground(Color.WHITE);
                newJpanel.add(new JLabel("Pedido: " + myOrders.get(i).getName()));
                newJpanel.add(new JLabel("Mesa: " + myOrders.get(i).getCustomerTable()));
                newJpanel.add(new JLabel("Obs: " + myOrders.get(i).getObservations()));
                panel_order_list.add(newJpanel);
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel_order_list;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
