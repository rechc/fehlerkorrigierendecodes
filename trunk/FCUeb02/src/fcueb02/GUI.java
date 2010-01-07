/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUIDesginTest.java
 *
 * Created on 30.12.2009, 15:28:23
 */

package fcueb02;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;

/**
 *
 * @author tim
 */
public class GUI extends javax.swing.JFrame {

    BlockCode bc;
    private final static String ERROR_WRONGINPUT = "Falsche Eingabe";
    private final static String ERROR_TITLE = "error";

    /** Creates new form GUIDesginTest */
    public GUI() {
        initComponents();
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = FCUeb02App.getApplication().getMainFrame();
            aboutBox = new FCUeb02AboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        FCUeb02App.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        calcButton = new javax.swing.JButton();
        hamming = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        generatormatrix = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        kontrollmatrix = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tabPanel = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        einBitSyndrome = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        zweiBitSyndrome = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        codeWoerter = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        checkButton = new javax.swing.JButton();
        checkWordResult = new javax.swing.JLabel();
        checkListe = new javax.swing.JComboBox();
        rbErkennen = new javax.swing.JRadioButton();
        rbKorregieren = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(fcueb02.FCUeb02App.class).getContext().getResourceMap(GUI.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N

        calcButton.setText(resourceMap.getString("calcButton.text")); // NOI18N
        calcButton.setName("calcButton"); // NOI18N
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        hamming.setFont(resourceMap.getFont("hamming.font")); // NOI18N
        hamming.setText(resourceMap.getString("hamming.text")); // NOI18N
        hamming.setName("hamming"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        generatormatrix.setText(resourceMap.getString("generatormatrix.text")); // NOI18N
        generatormatrix.setName("generatormatrix"); // NOI18N
        jScrollPane1.setViewportView(generatormatrix);

        jScrollPane5.setName("jScrollPane5"); // NOI18N

        kontrollmatrix.setBackground(resourceMap.getColor("kontrollmatrix.background")); // NOI18N
        kontrollmatrix.setEditable(false);
        kontrollmatrix.setName("kontrollmatrix"); // NOI18N
        jScrollPane5.setViewportView(kontrollmatrix);

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hamming, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(calcButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                        .addContainerGap(85, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hamming, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPanel.setName("tabPanel"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        einBitSyndrome.setColumns(20);
        einBitSyndrome.setEditable(false);
        einBitSyndrome.setRows(5);
        einBitSyndrome.setName("einBitSyndrome"); // NOI18N
        jScrollPane3.setViewportView(einBitSyndrome);

        tabPanel.addTab(resourceMap.getString("jScrollPane3.TabConstraints.tabTitle"), jScrollPane3); // NOI18N

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        zweiBitSyndrome.setColumns(20);
        zweiBitSyndrome.setEditable(false);
        zweiBitSyndrome.setRows(5);
        zweiBitSyndrome.setName("zweiBitSyndrome"); // NOI18N
        jScrollPane4.setViewportView(zweiBitSyndrome);

        tabPanel.addTab(resourceMap.getString("jScrollPane4.TabConstraints.tabTitle"), jScrollPane4); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        codeWoerter.setColumns(20);
        codeWoerter.setEditable(false);
        codeWoerter.setRows(5);
        codeWoerter.setName("codeWoerter"); // NOI18N
        jScrollPane2.setViewportView(codeWoerter);

        tabPanel.addTab(resourceMap.getString("jScrollPane2.TabConstraints.tabTitle"), jScrollPane2); // NOI18N

        jPanel2.setName("jPanel2"); // NOI18N

        checkButton.setText(resourceMap.getString("checkButton.text")); // NOI18N
        checkButton.setEnabled(false);
        checkButton.setName("checkButton"); // NOI18N
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        checkWordResult.setFont(resourceMap.getFont("checkWordResult.font")); // NOI18N
        checkWordResult.setText(resourceMap.getString("checkWordResult.text")); // NOI18N
        checkWordResult.setName("checkWordResult"); // NOI18N

        checkListe.setEditable(true);
        checkListe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        checkListe.setName("checkListe"); // NOI18N

        buttonGroup1.add(rbErkennen);
        rbErkennen.setText(resourceMap.getString("rbErkennen.text")); // NOI18N
        rbErkennen.setName("rbErkennen"); // NOI18N

        buttonGroup1.add(rbKorregieren);
        rbKorregieren.setText(resourceMap.getString("rbKorregieren.text")); // NOI18N
        rbKorregieren.setName("rbKorregieren"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(checkListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbErkennen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbKorregieren)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkWordResult, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(checkButton)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(checkListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbErkennen)
                    .addComponent(rbKorregieren))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(checkWordResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        tabPanel.addTab(resourceMap.getString("jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(fcueb02.FCUeb02App.class).getContext().getActionMap(GUI.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * calcButton
     * @param evt
     */
    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        String gmat = this.generatormatrix.getText().trim();
        if(!gmat.matches("[01]{7}\n[01]{7}\n[01]{7}\n[01]{7}")){
            JOptionPane.showMessageDialog(this, ERROR_WRONGINPUT, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        }else{
            this.bc = new BlockCode(gmat);
            this.kontrollmatrix.setText(bc.getHMatAsString());
            this.einBitSyndrome.setText(bc.getSyndroms1BitAsString());
            this.zweiBitSyndrome.setText(bc.getSyndroms2BitAsString());
            this.codeWoerter.setText(bc.getCodewordsAsString());
            this.hamming.setText("min Hammingdistance: " + bc.getMinHemmingDist());
          
          this.checkListe.removeAllItems();
          this.checkListe.addItem("");
          String[] words = bc.getCodewordsAsString().split("\\n");
          for (int i = 0; i < words.length; i++){
              String text = words[i].replaceAll(",", "");
                this.checkListe.addItem(text);
                text = "";
          }

            this.checkButton.setEnabled(true);
        }
    }//GEN-LAST:event_calcButtonActionPerformed

    /**
     * checkButton
     * @param evt
     */
    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        String word = this.checkListe.getSelectedItem().toString().trim();

        if (!word.matches("[01]{7}")) {
            JOptionPane.showMessageDialog(this, ERROR_WRONGINPUT, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        } else {
            if (this.rbKorregieren.isSelected()) {
                String result = this.bc.correctWord(word);
                this.checkWordResult.setText("Korrigiert in: " + result.toString());
            } else {
                if (this.bc.isCorrectWord(word)){
                    this.checkListe.setForeground(Color.green);
                    this.checkWordResult.setText("Codewort ist richtig");
                }else{
                    this.checkListe.setForeground(Color.red);
                    this.checkWordResult.setText("Codeword ist falsch");
                }
            }
        }
    }//GEN-LAST:event_checkButtonActionPerformed


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JComboBox checkListe;
    private javax.swing.JLabel checkWordResult;
    private javax.swing.JTextArea codeWoerter;
    private javax.swing.JTextArea einBitSyndrome;
    private javax.swing.JTextPane generatormatrix;
    private javax.swing.JLabel hamming;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane kontrollmatrix;
    private javax.swing.JRadioButton rbErkennen;
    private javax.swing.JRadioButton rbKorregieren;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTextArea zweiBitSyndrome;
    // End of variables declaration//GEN-END:variables

    private JDialog aboutBox;
}
