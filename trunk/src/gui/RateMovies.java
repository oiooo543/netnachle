package gui;

import domain.controller.Controller;
import java.util.Stack;
import javax.swing.JFrame;

public class RateMovies extends GeneralJFrame {
    
    private JFrame _parent;
    private Controller _controller;
    private String[][] _movies2rate;
    private Stack<Integer[][]>  _rateForward;
    private Stack<Integer[][]>  _rateBackword;
    /** Creates new form NewJFrame1 */
    public RateMovies(JFrame parent, Controller controller) {
        _rateBackword=new Stack<Integer[][]>();
        _rateForward=new Stack<Integer[][]>();
        this._parent = parent;
        this._controller = controller;
        setFrameAtCenter(getWidth(), getHeight());
	initComponents();
        this.setMoviesNdirectors2Select();
    }
    private void setMoviesNdirectors2Select(){
        _movies2rate = this._controller.getMoviesToRate();
        jLabelMovie1.setText(_movies2rate[0][0]);
        jLabelDirector1.setText(_movies2rate[0][1]);
         jLabelMovie2.setText(_movies2rate[1][0]);
        jLabelDirector2.setText(_movies2rate[1][1]);
        jLabelMovie3.setText(_movies2rate[2][0]);
        jLabelDirector3.setText(_movies2rate[2][1]);
        jLabelMovie4.setText(_movies2rate[3][0]);
         jLabelDirector4.setText(_movies2rate[3][1]);
        jLabelMovie5.setText(_movies2rate[4][0]);
        jLabelDirector5.setText(_movies2rate[4][1]);
         jLabelMovie6.setText(_movies2rate[5][0]);
        jLabelDirector6.setText(_movies2rate[5][1]);
         jLabelMovie7.setText(_movies2rate[6][0]);
        jLabelDirector7.setText(_movies2rate[6][1]);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelRateMoviesTitle = new javax.swing.JLabel();
        jLabelMovieName = new javax.swing.JLabel();
        jButtonNextStep = new javax.swing.JButton();
        jComboBoxRate1 = new javax.swing.JComboBox();
        jLabelMovieName1 = new javax.swing.JLabel();
        jLabelMovieName2 = new javax.swing.JLabel();
        jLabelMovie1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDirector1 = new javax.swing.JLabel();
        jLabelPicture1 = new javax.swing.JLabel();
        jLabelMovie2 = new javax.swing.JLabel();
        jLabelDirector2 = new javax.swing.JLabel();
        jComboBoxRate2 = new javax.swing.JComboBox();
        jLabelPicture2 = new javax.swing.JLabel();
        jLabelMovie3 = new javax.swing.JLabel();
        jLabelDirector3 = new javax.swing.JLabel();
        jComboBoxRate3 = new javax.swing.JComboBox();
        jLabelPicture3 = new javax.swing.JLabel();
        jLabelMovie4 = new javax.swing.JLabel();
        jLabelDirector4 = new javax.swing.JLabel();
        jComboBoxRate4 = new javax.swing.JComboBox();
        jLabelPicture4 = new javax.swing.JLabel();
        jLabelMovie5 = new javax.swing.JLabel();
        jLabelDirector5 = new javax.swing.JLabel();
        jComboBoxRate5 = new javax.swing.JComboBox();
        jLabelPicture5 = new javax.swing.JLabel();
        jLabelMovie6 = new javax.swing.JLabel();
        jLabelDirector6 = new javax.swing.JLabel();
        jComboBoxRate6 = new javax.swing.JComboBox();
        jLabelPicture6 = new javax.swing.JLabel();
        jLabelMovie7 = new javax.swing.JLabel();
        jLabelDirector7 = new javax.swing.JLabel();
        jComboBoxRate7 = new javax.swing.JComboBox();
        jLabelPicture7 = new javax.swing.JLabel();
        jButtonPreviousStep = new javax.swing.JButton();
        jButtonFinish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(gui.GeneralJFrame.backgroundColor);

        jPanel2.setBackground(backgroundColor);
        jPanel2.setForeground(new java.awt.Color(212, 208, 200));

        jPanel1.setBackground(backgroundColor);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(headersFontColor);

        jLabelRateMoviesTitle.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabelRateMoviesTitle.setForeground(headerColor);
        jLabelRateMoviesTitle.setText("Rate Movies");

        jLabelMovieName.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelMovieName.setForeground(headersFontColor);
        jLabelMovieName.setText("Movie's Name");

        jButtonNextStep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AT_next.gif"))); // NOI18N
        jButtonNextStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextStepActionPerformed(evt);
            }
        });

        jComboBoxRate1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "havn't seen", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabelMovieName1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelMovieName1.setForeground(headersFontColor);
        jLabelMovieName1.setText("Director's Name");

        jLabelMovieName2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelMovieName2.setForeground(headersFontColor);
        jLabelMovieName2.setText("Rate");

        jLabelMovie1.setForeground(regularFontColor);
        jLabelMovie1.setText("Shrek1");

        jLabelDirector1.setForeground(regularFontColor);
        jLabelDirector1.setText("Mel Gibson");

        jLabelPicture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NetNachleVerySmall.JPG"))); // NOI18N

        jLabelMovie2.setForeground(regularFontColor);
        jLabelMovie2.setText("Shrek1");

        jLabelDirector2.setForeground(regularFontColor);
        jLabelDirector2.setText("Mel Gibson");

        jComboBoxRate2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "havn't seen", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabelPicture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NetNachleVerySmall.JPG"))); // NOI18N

        jLabelMovie3.setForeground(regularFontColor);
        jLabelMovie3.setText("Shrek1");

        jLabelDirector3.setForeground(regularFontColor);
        jLabelDirector3.setText("Mel Gibson");

        jComboBoxRate3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "havn't seen", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabelPicture3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NetNachleVerySmall.JPG"))); // NOI18N

        jLabelMovie4.setForeground(regularFontColor);
        jLabelMovie4.setText("Shrek1");

        jLabelDirector4.setForeground(regularFontColor);
        jLabelDirector4.setText("Mel Gibson");

        jComboBoxRate4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "havn't seen", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabelPicture4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NetNachleVerySmall.JPG"))); // NOI18N

        jLabelMovie5.setForeground(regularFontColor);
        jLabelMovie5.setText("Shrek1");

        jLabelDirector5.setForeground(regularFontColor);
        jLabelDirector5.setText("Mel Gibson");

        jComboBoxRate5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "havn't seen", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabelPicture5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NetNachleVerySmall.JPG"))); // NOI18N

        jLabelMovie6.setForeground(regularFontColor);
        jLabelMovie6.setText("Shrek1");

        jLabelDirector6.setForeground(regularFontColor);
        jLabelDirector6.setText("Mel Gibson");

        jComboBoxRate6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "havn't seen", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabelPicture6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NetNachleVerySmall.JPG"))); // NOI18N

        jLabelMovie7.setForeground(regularFontColor);
        jLabelMovie7.setText("Shrek1");

        jLabelDirector7.setForeground(regularFontColor);
        jLabelDirector7.setText("Mel Gibson");

        jComboBoxRate7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "havn't seen", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jComboBoxRate7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRate7ActionPerformed(evt);
            }
        });

        jLabelPicture7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NetNachleVerySmall.JPG"))); // NOI18N

        jButtonPreviousStep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AT_back.gif"))); // NOI18N
        jButtonPreviousStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousStepActionPerformed(evt);
            }
        });

        jButtonFinish.setText("save & finish");
        jButtonFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinishActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jLabelRateMoviesTitle)
                .addContainerGap(420, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelMovieName)
                .add(68, 68, 68)
                .add(jLabelMovieName1)
                .add(80, 80, 80)
                .add(jLabelMovieName2)
                .add(68, 68, 68))
            .add(jPanel1Layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelMovie1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabelDirector1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelMovie2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabelDirector2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelMovie3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabelDirector3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelMovie4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabelDirector4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelMovie5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabelDirector5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelMovie6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabelDirector6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabelMovie7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabelDirector7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jComboBoxRate7, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(65, 65, 65)
                        .add(jLabelPicture7))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jComboBoxRate6, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(65, 65, 65)
                        .add(jLabelPicture6))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jComboBoxRate5, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(65, 65, 65)
                        .add(jLabelPicture5))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jComboBoxRate4, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(65, 65, 65)
                        .add(jLabelPicture4))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jComboBoxRate3, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(65, 65, 65)
                        .add(jLabelPicture3))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jComboBoxRate2, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(65, 65, 65)
                        .add(jLabelPicture2))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jComboBoxRate1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(65, 65, 65)
                        .add(jLabelPicture1)))
                .add(45, 45, 45))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButtonPreviousStep)
                .add(122, 122, 122)
                .add(jButtonFinish)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 114, Short.MAX_VALUE)
                .add(jButtonNextStep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelRateMoviesTitle)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelMovieName1)
                    .add(jLabelMovieName)
                    .add(jLabelMovieName2))
                .add(5, 5, 5)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(27, 27, 27)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jComboBoxRate1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabelMovie1)
                                    .add(jLabelDirector1)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabelPicture1)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jComboBoxRate2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabelMovie2)
                                    .add(jLabelDirector2)))
                            .add(jLabelPicture2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jComboBoxRate3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabelMovie3)
                                    .add(jLabelDirector3)))
                            .add(jLabelPicture3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jComboBoxRate4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabelMovie4)
                                    .add(jLabelDirector4)))
                            .add(jLabelPicture4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jComboBoxRate5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabelMovie5)
                                    .add(jLabelDirector5)))
                            .add(jLabelPicture5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jComboBoxRate6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabelMovie6)
                                    .add(jLabelDirector6)))
                            .add(jLabelPicture6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jComboBoxRate7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabelMovie7)
                                    .add(jLabelDirector7)))
                            .add(jLabelPicture7))
                        .add(45, 45, 45)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButtonNextStep)
                            .add(jButtonPreviousStep))
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jButtonFinish)
                        .add(42, 42, 42))))
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonNextStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextStepActionPerformed
        
}//GEN-LAST:event_jButtonNextStepActionPerformed

private void jButtonPreviousStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousStepActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButtonPreviousStepActionPerformed

private void jButtonFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinishActionPerformed
    Integer[]  moviesId=new Integer[7];
    Integer[] rates = new Integer[7]; 
    moviesId[0] = new Integer(_movies2rate[0][2]);
    rates[0] = jComboBoxRate1.getSelectedIndex();
    moviesId[1] = new Integer(_movies2rate[1][2]);
    rates[1] = jComboBoxRate2.getSelectedIndex();
    moviesId[2] = new Integer(_movies2rate[2][2]);
    rates[2] = jComboBoxRate3.getSelectedIndex();
    moviesId[3] = new Integer(_movies2rate[3][2]);
    rates[3] = jComboBoxRate4.getSelectedIndex();
    moviesId[4] = new Integer(_movies2rate[4][2]);
    rates[4] = jComboBoxRate5.getSelectedIndex();
    moviesId[5] = new Integer(_movies2rate[5][2]);
    rates[5] = jComboBoxRate6.getSelectedIndex();
    moviesId[6] = new Integer(_movies2rate[6][2]);
    rates[6] = jComboBoxRate7.getSelectedIndex();
   
    Integer[][]  movie_reates=new Integer[2][];
    movie_reates[0] = moviesId;
    movie_reates[1] =rates;
    _rateForward.push(movie_reates);
    while(!_rateForward.isEmpty()){
        _rateBackword.push(_rateForward.pop());
    }
  
    Stack<Integer> movIdStk=new Stack<Integer>();
    Stack<Integer>  rateStk=new Stack<Integer>();
     
    while (!_rateBackword.isEmpty()){
        movie_reates=_rateBackword.pop();
        moviesId=movie_reates[0];
        rates=movie_reates[1];
        for (int i=0;i<7;i++){
         if (!(rates[i].equals(new Integer(0)))) {
                movIdStk.push(moviesId[i]);
                rateStk.push(rates[i]);
                System.out.println(moviesId[i]+ "-sasasasasa-" + rates[i]);
            } //if
        }//for
    }//while
    int[] movId=new int[movIdStk.size()];
    int[] rate=new int[rateStk.size()];
    for (int i=0;i<movId.length;i++){
        movId[i]=movIdStk.pop().intValue();
        rate[i]=rateStk.pop().intValue();
    }
    _controller.setRatesByUser(movId, rate, _controller.getCurrentUser().getId());
    System.out.println("here");
    this.setVisible(false);
    _parent.setEnabled(true);
    _parent.setVisible(true);
}//GEN-LAST:event_jButtonFinishActionPerformed

private void jComboBoxRate7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRate7ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jComboBoxRate7ActionPerformed
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinish;
    private javax.swing.JButton jButtonNextStep;
    private javax.swing.JButton jButtonPreviousStep;
    private javax.swing.JComboBox jComboBoxRate1;
    private javax.swing.JComboBox jComboBoxRate2;
    private javax.swing.JComboBox jComboBoxRate3;
    private javax.swing.JComboBox jComboBoxRate4;
    private javax.swing.JComboBox jComboBoxRate5;
    private javax.swing.JComboBox jComboBoxRate6;
    private javax.swing.JComboBox jComboBoxRate7;
    private javax.swing.JLabel jLabelDirector1;
    private javax.swing.JLabel jLabelDirector2;
    private javax.swing.JLabel jLabelDirector3;
    private javax.swing.JLabel jLabelDirector4;
    private javax.swing.JLabel jLabelDirector5;
    private javax.swing.JLabel jLabelDirector6;
    private javax.swing.JLabel jLabelDirector7;
    private javax.swing.JLabel jLabelMovie1;
    private javax.swing.JLabel jLabelMovie2;
    private javax.swing.JLabel jLabelMovie3;
    private javax.swing.JLabel jLabelMovie4;
    private javax.swing.JLabel jLabelMovie5;
    private javax.swing.JLabel jLabelMovie6;
    private javax.swing.JLabel jLabelMovie7;
    private javax.swing.JLabel jLabelMovieName;
    private javax.swing.JLabel jLabelMovieName1;
    private javax.swing.JLabel jLabelMovieName2;
    private javax.swing.JLabel jLabelPicture1;
    private javax.swing.JLabel jLabelPicture2;
    private javax.swing.JLabel jLabelPicture3;
    private javax.swing.JLabel jLabelPicture4;
    private javax.swing.JLabel jLabelPicture5;
    private javax.swing.JLabel jLabelPicture6;
    private javax.swing.JLabel jLabelPicture7;
    private javax.swing.JLabel jLabelRateMoviesTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
}
