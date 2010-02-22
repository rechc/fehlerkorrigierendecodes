package fcueb02;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;

/**
 * GUI
 * 
 * @author Christian Rech, Tim Bartsch
 */
public class GUI extends javax.swing.JFrame {

    BlockCode bc;
    private final static String ERROR_WRONGINPUT = "Falsche Eingabe";
    private final static String ERROR_TITLE = "error";
    private final static String LABEL_TXT = "min Hammingdist.: ";
    private final static String LABEL_CHECK_TRUE = "Codewort ist richtig";
    private final static String LABEL_CHECK_FALSE ="Codewort ist falsch";
    private final static String LABEL_CHECK_CORRECT = "Korrigiert in: ";


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
        jbCalc = new javax.swing.JButton();
        jlMinHammingDist = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpGMat = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtpHMat = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tabPanel = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jta1BitSyndroms = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jta2BitSyndroms = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaCodewords = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jbCheck = new javax.swing.JButton();
        checkWordResult = new javax.swing.JLabel();
        jcbCheckList = new javax.swing.JComboBox();
        jrbDetect = new javax.swing.JRadioButton();
        jrbCorrect = new javax.swing.JRadioButton();
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

        jbCalc.setText(resourceMap.getString("jbCalc.text")); // NOI18N
        jbCalc.setName("jbCalc"); // NOI18N
        jbCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcActionPerformed(evt);
            }
        });

        jlMinHammingDist.setFont(resourceMap.getFont("jlMinHammingDist.font")); // NOI18N
        jlMinHammingDist.setText(resourceMap.getString("jlMinHammingDist.text")); // NOI18N
        jlMinHammingDist.setName("jlMinHammingDist"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jtpGMat.setText(resourceMap.getString("jtpGMat.text")); // NOI18N
        jtpGMat.setName("jtpGMat"); // NOI18N
        jScrollPane1.setViewportView(jtpGMat);

        jScrollPane5.setName("jScrollPane5"); // NOI18N

        jtpHMat.setBackground(resourceMap.getColor("jtpHMat.background")); // NOI18N
        jtpHMat.setEditable(false);
        jtpHMat.setName("jtpHMat"); // NOI18N
        jScrollPane5.setViewportView(jtpHMat);

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
                        .addContainerGap(107, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlMinHammingDist, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbCalc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(85, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlMinHammingDist, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPanel.setName("tabPanel"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        jta1BitSyndroms.setColumns(20);
        jta1BitSyndroms.setEditable(false);
        jta1BitSyndroms.setRows(5);
        jta1BitSyndroms.setName("jta1BitSyndroms"); // NOI18N
        jScrollPane3.setViewportView(jta1BitSyndroms);

        tabPanel.addTab(resourceMap.getString("jScrollPane3.TabConstraints.tabTitle"), jScrollPane3); // NOI18N

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        jta2BitSyndroms.setColumns(20);
        jta2BitSyndroms.setEditable(false);
        jta2BitSyndroms.setRows(5);
        jta2BitSyndroms.setName("jta2BitSyndroms"); // NOI18N
        jScrollPane4.setViewportView(jta2BitSyndroms);

        tabPanel.addTab(resourceMap.getString("jScrollPane4.TabConstraints.tabTitle"), jScrollPane4); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jtaCodewords.setColumns(20);
        jtaCodewords.setEditable(false);
        jtaCodewords.setRows(5);
        jtaCodewords.setName("jtaCodewords"); // NOI18N
        jScrollPane2.setViewportView(jtaCodewords);

        tabPanel.addTab(resourceMap.getString("jScrollPane2.TabConstraints.tabTitle"), jScrollPane2); // NOI18N

        jPanel2.setName("jPanel2"); // NOI18N

        jbCheck.setText(resourceMap.getString("jbCheck.text")); // NOI18N
        jbCheck.setEnabled(false);
        jbCheck.setName("jbCheck"); // NOI18N
        jbCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCheckActionPerformed(evt);
            }
        });

        checkWordResult.setFont(resourceMap.getFont("checkWordResult.font")); // NOI18N
        checkWordResult.setText(resourceMap.getString("checkWordResult.text")); // NOI18N
        checkWordResult.setName("checkWordResult"); // NOI18N

        jcbCheckList.setEditable(true);
        jcbCheckList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jcbCheckList.setName("jcbCheckList"); // NOI18N

        buttonGroup1.add(jrbDetect);
        jrbDetect.setSelected(true);
        jrbDetect.setText(resourceMap.getString("jrbDetect.text")); // NOI18N
        jrbDetect.setName("jrbDetect"); // NOI18N

        buttonGroup1.add(jrbCorrect);
        jrbCorrect.setText(resourceMap.getString("jrbCorrect.text")); // NOI18N
        jrbCorrect.setName("jrbCorrect"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jcbCheckList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbCheck)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(checkWordResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbDetect)
                        .addGap(18, 18, 18)
                        .addComponent(jrbCorrect)))
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jcbCheckList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbDetect)
                    .addComponent(jrbCorrect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCheck)
                .addGap(53, 53, 53)
                .addComponent(checkWordResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tabPanel.addTab(resourceMap.getString("jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(fcueb02.FCUeb02App.class).getContext().getActionMap(GUI.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setText(resourceMap.getString("exitMenuItem.text")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setText(resourceMap.getString("aboutMenuItem.text")); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private void jbCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcActionPerformed
        String gmat = this.jtpGMat.getText().trim();
        if(!gmat.matches("[01]{7}\n[01]{7}\n[01]{7}\n[01]{7}"))
            JOptionPane.showMessageDialog(this, ERROR_WRONGINPUT, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        
        this.bc = new BlockCode(gmat);
        this.jtpHMat.setText(bc.getHMatAsString());
        this.jta1BitSyndroms.setText(bc.getSyndroms1BitAsString());
        this.jta2BitSyndroms.setText(bc.getSyndroms2BitAsString());
        this.jtaCodewords.setText(bc.getCodewordsAsString());
        this.jlMinHammingDist.setText(LABEL_TXT + bc.getMinHemmingDist());
        this.jcbCheckList.removeAllItems();
        this.jcbCheckList.addItem("");
        String[] words = bc.getCodewordsAsString().split("\\n");
        String word;
        for (int i = 0; i < words.length; i++){
            word = words[i].replaceAll(",", "");
            this.jcbCheckList.addItem(word);
        }
        this.jbCheck.setEnabled(true);
    }//GEN-LAST:event_jbCalcActionPerformed

    /**
     * checkButton
     * @param evt
     */
    private void jbCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCheckActionPerformed
        String word = this.jcbCheckList.getSelectedItem().toString().trim();
        if (!word.matches("[01]{7}"))
            JOptionPane.showMessageDialog(this, ERROR_WRONGINPUT, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        
        if (this.jrbCorrect.isSelected()) {
            String correctedWord = this.bc.correctWord(word);
            this.checkWordResult.setForeground(Color.BLACK);
            this.checkWordResult.setText(LABEL_CHECK_CORRECT + correctedWord);
        } else {
            if (this.bc.isCorrectWord(word)){
                this.checkWordResult.setForeground(Color.green);
                this.checkWordResult.setText(LABEL_CHECK_TRUE);
            }else{
                this.checkWordResult.setForeground(Color.red);
                this.checkWordResult.setText(LABEL_CHECK_FALSE);
            }
        }
    }//GEN-LAST:event_jbCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel checkWordResult;
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
    private javax.swing.JButton jbCalc;
    private javax.swing.JButton jbCheck;
    private javax.swing.JComboBox jcbCheckList;
    private javax.swing.JLabel jlMinHammingDist;
    private javax.swing.JRadioButton jrbCorrect;
    private javax.swing.JRadioButton jrbDetect;
    private javax.swing.JTextArea jta1BitSyndroms;
    private javax.swing.JTextArea jta2BitSyndroms;
    private javax.swing.JTextArea jtaCodewords;
    private javax.swing.JTextPane jtpGMat;
    private javax.swing.JTextPane jtpHMat;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables

    private JDialog aboutBox;
}