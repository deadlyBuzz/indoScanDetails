/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package indoscandetails;

import java.util.*;

/**
 *
 * @author Alan Curley
 */
public class indoScanDetailsWindow extends javax.swing.JFrame {
    private Map<String, Integer> segmentTimes; 
    private ArrayList<scanPart> partArrayList;

    /**
     * Creates new form indoScanDetailsWindow
     */
    public indoScanDetailsWindow() {
        this.setTitle("Independent scan details");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taSegments = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taPath = new javax.swing.JTextArea();
        taSplittingString = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taResults = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taSegments.setColumns(20);
        taSegments.setRows(5);
        jScrollPane1.setViewportView(taSegments);

        jLabel1.setText("1 - Paste Segment Details Here");

        jLabel2.setText("2 - Paste the complete path here.");

        taPath.setColumns(20);
        taPath.setRows(5);
        jScrollPane2.setViewportView(taPath);

        taSplittingString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taSplittingStringActionPerformed(evt);
            }
        });

        jLabel3.setText("3 - Enter the splitting String here. (Regex - $1 will be the separated item - remember to include the brackets to assert the match)");

        taResults.setColumns(20);
        taResults.setRows(5);
        jScrollPane3.setViewportView(taResults);

        jButton1.setText("GO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Results will be displayed here. (Use Ctrl+C to copy)");

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addComponent(taSplittingString)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(106, 106, 106))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taSplittingString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taSplittingStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taSplittingStringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taSplittingStringActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           String[] tempArray;
           String regexp = "([\\W\\|])+";
           StringBuilder sb = new StringBuilder();
           partArrayList = new ArrayList<>();
           segmentTimes = new HashMap<>(); // initialis the HashMap           
           tempArray = this.taSegments.getText().split("(\\r|\\n)");
           try{
                    for(String s:tempArray){
//                        if(s.contains("|")){ // make sure it will divide up into components (also rules out headers)
//                            String[] n = s.split("\\|");
//                            if(!segmentTimes.containsKey(n[1]))
//                                segmentTimes.put(n[1],Integer.valueOf(n[2]));
//                        }                        
                        if(s.split(regexp).length>1){
                            String[] n = s.split(regexp);
                            if(!segmentTimes.containsKey(n[1]))
                                segmentTimes.put(n[1],Integer.valueOf(n[2]));                            
                        }
                    }
            }
            catch(NullPointerException npe){
                System.err.println("Error Generating Segment details");
                npe.printStackTrace(System.err);
            }           
           
           /*--------  At this point, the hashmap should be built already ----*/
           try{
           String tempString = taPath.getText().replaceAll(taSplittingString.getText(), ">>>>$1");
           tempArray = tempString.replaceAll("\\r|\\n", "").split(">>>>");
           }
           catch(IndexOutOfBoundsException IOOBE){
               System.err.println("Error parsing Path");
               IOOBE.printStackTrace(System.err);
           }
           
           for(String s:tempArray){
               if(s.length()>0){
                partArrayList.add(new scanPart(s,segmentTimes));               
                sb.append(partArrayList.get(partArrayList.size()-1));
               }
           }
           
           this.taResults.setText(sb.toString());         
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        taResults.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(indoScanDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(indoScanDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(indoScanDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(indoScanDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new indoScanDetailsWindow().setVisible(true);
            }
        });
    }
    
    private class scanPart{
        ArrayList<String> segmentList;
        ArrayList<Integer> times;
        Integer totalTime;
        public scanPart(String part, Map segments){
            totalTime = 0;
            segmentList = new ArrayList<>();            
            times = new ArrayList<>();
            segmentList.addAll(Arrays.asList(part.split(",")));
            try{
                for(String s:segmentList){
                    if(segments.containsKey(s)){
                        times.add((Integer)segments.get(s));
                        totalTime += (Integer)segments.get(s);
                    }
                    else
                        System.err.println("Error - Segment '"+s+"' - details not avaiable");
                }
            }
            catch(Exception e){
                System.err.println("Error processing Segment.");
                e.printStackTrace(System.err);
            }            
        }
        public String toString(){
            StringBuilder stringy = new StringBuilder();            
            try{
                for(int i=0; i<segmentList.size(); i++){
                    stringy.append(segmentList.get(i));
                    stringy.append(";");
                    stringy.append(String.valueOf(times.get(i)));
                    stringy.append(",");
                }
            }
            catch(NullPointerException npe){
                System.err.println("Error converting scanPart to string");
                npe.printStackTrace(System.err);
            }            
            stringy.append("|"+String.valueOf(totalTime)+"\r\n"); // append a carraige return at the end.
            return stringy.toString();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea taPath;
    private javax.swing.JTextArea taResults;
    private javax.swing.JTextArea taSegments;
    private javax.swing.JTextField taSplittingString;
    // End of variables declaration//GEN-END:variables
}
