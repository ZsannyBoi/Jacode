package expenseManage;


import java.awt.Color;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User-PC
 */
public final class Expenses extends javax.swing.JFrame {

    Color expensecolor = new Color(255,131,131);
    Color incomecolor = new Color(131, 255, 158);
        
    public Expenses() {
        initComponents();
        AddExpenseButton.setVisible(false);
        AddIncomeButton.setVisible(false);
        AddPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarButtons = new javax.swing.ButtonGroup();
        ExpenseButton = new javax.swing.JToggleButton();
        AddPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        TimeField = new javax.swing.JTextField();
        AmountLabel = new javax.swing.JLabel();
        AmountField = new javax.swing.JTextField();
        Menu = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        UpBackground = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        BalanceName = new javax.swing.JLabel();
        BalanceQuantity = new javax.swing.JLabel();
        BalanceBar = new javax.swing.JProgressBar();
        BalanceBarLabel = new javax.swing.JLabel();
        BalanceBarComment = new javax.swing.JLabel();
        BalanceBarSpent = new javax.swing.JLabel();
        Month = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        Day = new javax.swing.JTextField();
        DownBackground = new javax.swing.JPanel();
        ExpenseLabel = new javax.swing.JLabel();
        Seperator = new javax.swing.JSeparator();
        AddExpenseButton = new javax.swing.JButton();
        AddIncomeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        List = new javax.swing.JPanel();
        HomeButton = new javax.swing.JToggleButton();
        ListButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(422, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExpenseButton.setBackground(new java.awt.Color(0, 0, 0));
        ExpenseButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ExpenseButton.setForeground(new java.awt.Color(255, 255, 255));
        ExpenseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add 1.png"))); // NOI18N
        ExpenseButton.setBorderPainted(false);
        ExpenseButton.setFocusPainted(false);
        ExpenseButton.setFocusable(false);
        ExpenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpenseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExpenseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 680, 120, 60));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel1.setText("Name of Expense");

        TimeLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        TimeLabel.setText("Time");

        TimeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TimeField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        AmountLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        AmountLabel.setText("Amount");

        AmountField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AmountField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout AddPanelLayout = new javax.swing.GroupLayout(AddPanel);
        AddPanel.setLayout(AddPanelLayout);
        AddPanelLayout.setHorizontalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddPanelLayout.createSequentialGroup()
                                .addComponent(TimeLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TimeField))
                        .addGap(18, 18, 18)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmountLabel)))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        AddPanelLayout.setVerticalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeLabel)
                            .addComponent(AmountLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(AddPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 420, 200));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setToolTipText("");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setFocusable(false);

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setFocusable(false);

        UpBackground.setBackground(new java.awt.Color(226, 255, 223));

        UserLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        UserLabel.setText("Hi, User1234");

        BalanceName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BalanceName.setText("Balance");

        BalanceQuantity.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        BalanceQuantity.setText("P251.99");

        BalanceBar.setToolTipText("");
        BalanceBar.setValue(100);
        BalanceBar.setOpaque(true);

        BalanceBarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BalanceBarLabel.setText("25%");

        BalanceBarComment.setText("You're in the low!");

        BalanceBarSpent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BalanceBarSpent.setText("P749.99");

        Month.setEditable(false);
        Month.setBackground(new java.awt.Color(87, 184, 91));
        Month.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        Month.setForeground(new java.awt.Color(255, 255, 255));
        Month.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Month.setText("January");
        Month.setFocusable(false);
        Month.setMaximumSize(new java.awt.Dimension(104, 37));
        Month.setMinimumSize(new java.awt.Dimension(104, 37));
        Month.setPreferredSize(new java.awt.Dimension(104, 37));
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });

        Date.setEditable(false);
        Date.setBackground(new java.awt.Color(174, 253, 163));
        Date.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        Date.setForeground(new java.awt.Color(28, 108, 30));
        Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Date.setText("01");
        Date.setFocusable(false);
        Date.setMaximumSize(new java.awt.Dimension(104, 79));
        Date.setMinimumSize(new java.awt.Dimension(104, 79));
        Date.setPreferredSize(new java.awt.Dimension(104, 79));
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        Day.setEditable(false);
        Day.setBackground(new java.awt.Color(0, 102, 0));
        Day.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        Day.setForeground(new java.awt.Color(255, 255, 255));
        Day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Day.setText("Tuesday");
        Day.setFocusable(false);
        Day.setMinimumSize(new java.awt.Dimension(104, 37));
        Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpBackgroundLayout = new javax.swing.GroupLayout(UpBackground);
        UpBackground.setLayout(UpBackgroundLayout);
        UpBackgroundLayout.setHorizontalGroup(
            UpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpBackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(UpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserLabel)
                    .addComponent(BalanceName)
                    .addComponent(BalanceQuantity)
                    .addGroup(UpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BalanceBarSpent)
                        .addGroup(UpBackgroundLayout.createSequentialGroup()
                            .addComponent(BalanceBarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(UpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BalanceBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(UpBackgroundLayout.createSequentialGroup()
                                    .addComponent(BalanceBarComment, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                    .addGroup(UpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Month, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Day, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        UpBackgroundLayout.setVerticalGroup(
            UpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpBackgroundLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(UpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UpBackgroundLayout.createSequentialGroup()
                        .addGroup(UpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(UpBackgroundLayout.createSequentialGroup()
                                .addComponent(UserLabel)
                                .addGap(26, 26, 26)
                                .addComponent(BalanceName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BalanceQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(BalanceBarComment)
                                .addGap(1, 1, 1))
                            .addGroup(UpBackgroundLayout.createSequentialGroup()
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(BalanceBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BalanceBarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BalanceBarSpent)
                .addGap(17, 17, 17))
        );

        DownBackground.setBackground(new java.awt.Color(255, 255, 255));
        DownBackground.setLayout(null);

        ExpenseLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 20)); // NOI18N
        ExpenseLabel.setText("Today's Expenses");
        DownBackground.add(ExpenseLabel);
        ExpenseLabel.setBounds(18, 6, 146, 24);
        DownBackground.add(Seperator);
        Seperator.setBounds(6, 36, 395, 3);

        AddExpenseButton.setBackground(new java.awt.Color(248, 149, 149));
        AddExpenseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image 1.png"))); // NOI18N
        AddExpenseButton.setFocusPainted(false);
        AddExpenseButton.setFocusable(false);
        AddExpenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddExpenseButtonActionPerformed(evt);
            }
        });
        DownBackground.add(AddExpenseButton);
        AddExpenseButton.setBounds(306, 343, 80, 43);

        AddIncomeButton.setBackground(new java.awt.Color(106, 217, 106));
        AddIncomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image.png"))); // NOI18N
        AddIncomeButton.setFocusPainted(false);
        AddIncomeButton.setFocusable(false);
        AddIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddIncomeButtonActionPerformed(evt);
            }
        });
        DownBackground.add(AddIncomeButton);
        AddIncomeButton.setBounds(342, 286, 44, 45);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(jPanel1);

        DownBackground.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 380, 330);

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DownBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(UpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DownBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
        );

        Menu.addTab("tab1", Home);

        javax.swing.GroupLayout ListLayout = new javax.swing.GroupLayout(List);
        List.setLayout(ListLayout);
        ListLayout.setHorizontalGroup(
            ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        ListLayout.setVerticalGroup(
            ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        Menu.addTab("tab2", List);

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -40, 440, 710));

        HomeButton.setBackground(new java.awt.Color(185, 185, 185));
        BarButtons.add(HomeButton);
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image 2.png"))); // NOI18N
        HomeButton.setSelected(true);
        HomeButton.setBorderPainted(false);
        HomeButton.setFocusPainted(false);
        HomeButton.setFocusable(false);
        HomeButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image 6.png"))); // NOI18N
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 40, 40));

        ListButton.setBackground(new java.awt.Color(185, 185, 185));
        BarButtons.add(ListButton);
        ListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image 3.png"))); // NOI18N
        ListButton.setBorderPainted(false);
        ListButton.setFocusPainted(false);
        ListButton.setFocusable(false);
        ListButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image 7.png"))); // NOI18N
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ListButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, 40, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MonthActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DayActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        Menu.setSelectedIndex(0);
        
        ListButton.setSelected(false);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListButtonActionPerformed
        Menu.setSelectedIndex(1);
        
        HomeButton.setSelected(false);
    }//GEN-LAST:event_ListButtonActionPerformed

    private void ExpenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpenseButtonActionPerformed
        if (ExpenseButton.isSelected() == true){
            AddExpenseButton.setVisible(true);
            AddIncomeButton.setVisible(true);
            AddExpenseButton.setEnabled(true);
            AddIncomeButton.setEnabled(true);
        }
        else {
            AddExpenseButton.setVisible(false);
            AddIncomeButton.setVisible(false);
            AddPanel.setVisible(false);
        }
    }//GEN-LAST:event_ExpenseButtonActionPerformed

    private void AddExpenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddExpenseButtonActionPerformed
        AddPanel.setVisible(true);
        AddPanel.setBackground(expensecolor);  
        AddExpenseButton.setEnabled(false);
        AddIncomeButton.setEnabled(false);
    }//GEN-LAST:event_AddExpenseButtonActionPerformed

    private void AddIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddIncomeButtonActionPerformed
        AddPanel.setVisible(true);
        AddPanel.setBackground(incomecolor);
        AddExpenseButton.setEnabled(false);
        AddIncomeButton.setEnabled(false);  
    }//GEN-LAST:event_AddIncomeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       
        com.formdev.flatlaf.FlatLightLaf.setup();
        
            
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expenses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddExpenseButton;
    private javax.swing.JButton AddIncomeButton;
    private javax.swing.JPanel AddPanel;
    private javax.swing.JTextField AmountField;
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JProgressBar BalanceBar;
    private javax.swing.JLabel BalanceBarComment;
    private javax.swing.JLabel BalanceBarLabel;
    private javax.swing.JLabel BalanceBarSpent;
    private javax.swing.JLabel BalanceName;
    private javax.swing.JLabel BalanceQuantity;
    private javax.swing.ButtonGroup BarButtons;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Day;
    private javax.swing.JPanel DownBackground;
    private javax.swing.JToggleButton ExpenseButton;
    private javax.swing.JLabel ExpenseLabel;
    private javax.swing.JPanel Home;
    private javax.swing.JToggleButton HomeButton;
    private javax.swing.JPanel List;
    private javax.swing.JToggleButton ListButton;
    private javax.swing.JTabbedPane Menu;
    private javax.swing.JTextField Month;
    private javax.swing.JSeparator Seperator;
    private javax.swing.JTextField TimeField;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JPanel UpBackground;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
