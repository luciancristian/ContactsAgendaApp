/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsAgenda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;

public class GUI extends javax.swing.JFrame {

    private static String filtru = "";
    private int selectedIndex;
    javax.swing.Timer t;
    private static int i = 1;
    private DefaultListModel model = new DefaultListModel();
    private DefaultComboBoxModel order = new DefaultComboBoxModel(OrderOptions.values());
    private DefaultComboBoxModel filter = new DefaultComboBoxModel(FilterOptions.values());
    private String Select = "Select...";
    
    //code used to unlock app .... reading from a file validation is still in progress (so now is just hardcoded)
    public static final String registerCodeValidation = "Register12345";

    public GUI() {
        initComponents();
        order.insertElementAt(Select, 0);
        filter.insertElementAt(Select, 0);
        order.setSelectedItem(Select);
        filter.setSelectedItem(Select);
        OrderDropBox.setModel(order);
        selectFilterDropDown.setModel(filter);

        try {
            //some mock data
            Agenda.Contacts.add(new Contact("Lucian", "Cristian", "21/12/1984", "0744443399"));
            Agenda.Contacts.add(new Contact("Andrei", "Vasile", "01/04/1985", "0744443300"));
            Agenda.Contacts.add(new Contact("Tudor", "George", "30/04/1990", "0744443311"));
            Agenda.Contacts.add(new Contact("Maria", "Mihai", "15/07/1980", "0744443311"));
            Agenda.Contacts.add(new Contact("Ioana", "Ion", "19/04/1990", "0344443311"));
            Agenda.Contacts.add(new Contact("Magdalena", "Bubu", "10/09/1990", "0244443311"));
            Agenda.Contacts.add(new Contact("Gigi", "Kent", "29/04/1990", "0244443311"));
        } catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Contact f : Agenda.Contacts) {
            model.addElement(f);
        }

        JListContacts.setModel(model);
        //picture threading implementation
        t = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                AdvertLabel.setIcon(new ImageIcon(getClass().getResource("pictures/" + String.valueOf(i) + ".jpg")));
                AdvertLabel.removeAll();
                i = i + 1;
                if (i == 9) {
                    i = 1;
                }
            }
            //i=1+i;
        });
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddEditDialog = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        HomeNumberButton = new javax.swing.JRadioButton();
        MobileNumberButton = new javax.swing.JRadioButton();
        FirstNameText = new javax.swing.JTextField();
        LastNameText = new javax.swing.JTextField();
        BirthDateText = new javax.swing.JTextField();
        PhoneNumberText = new javax.swing.JTextField();
        jFileChooserOpen = new javax.swing.JFileChooser();
        jFileChooserSave = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectFilterDropDown = new javax.swing.JComboBox<>();
        SelectFilter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FilterButton = new javax.swing.JButton();
        OrderDropBox = new javax.swing.JComboBox<>();
        OrderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListContacts = new javax.swing.JList<>();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        AdvertLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Register = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();

        jLabel4.setText("FirstName:");

        jLabel5.setText("LastName:");

        jLabel6.setText("BirthDate:");

        jLabel7.setText("PhoneNumber:");

        HomeNumberButton.setText("HomeNumber");

        MobileNumberButton.setText("MobileNumber");

        BirthDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthDateTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddEditDialogLayout = new javax.swing.GroupLayout(AddEditDialog.getContentPane());
        AddEditDialog.getContentPane().setLayout(AddEditDialogLayout);
        AddEditDialogLayout.setHorizontalGroup(
            AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEditDialogLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddEditDialogLayout.createSequentialGroup()
                        .addGroup(AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddEditDialogLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(AddEditDialogLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MobileNumberButton)
                                    .addComponent(HomeNumberButton))))
                        .addContainerGap())
                    .addGroup(AddEditDialogLayout.createSequentialGroup()
                        .addGroup(AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BirthDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(AddEditDialogLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LastNameText))
                                .addGroup(AddEditDialogLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        AddEditDialogLayout.setVerticalGroup(
            AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEditDialogLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BirthDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEditDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEditDialogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HomeNumberButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MobileNumberButton))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(10, 10));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Filter:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 50, 50));

        jLabel2.setText("Order:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 66, 40, 50));

        selectFilterDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(selectFilterDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 208, 30));

        SelectFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectFilterActionPerformed(evt);
            }
        });
        getContentPane().add(SelectFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 162, 30));

        jLabel3.setText("Filter:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 36, 29));

        FilterButton.setText("Filter");
        FilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FilterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 116, 40));

        OrderDropBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(OrderDropBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 210, 30));

        OrderButton.setText("Order");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 116, 40));

        jScrollPane1.setViewportView(JListContacts);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 533, 200));

        Add.setText("Add Contact");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 130, 50));

        Delete.setText("Delete Contact");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 130, 50));

        Edit.setText("Edit Contact");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        getContentPane().add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 130, 50));

        jTextField1.setText("FirstName, LastName, BirthDate, Phone");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 533, 28));
        getContentPane().add(AdvertLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 530, 260));

        jMenu1.setText("File");
        jMenu1.setContentAreaFilled(false);
        jMenu1.setInheritsPopupMenu(true);
        jMenu1.setName("Exit"); // NOI18N
        jMenu1.setVerifyInputWhenFocusTarget(false);

        Open.setText("Open");
        Open.setEnabled(false);
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        Save.setText("Save");
        Save.setEnabled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jMenu1.add(Save);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.setInheritsPopupMenu(true);

        Register.setLabel("Register");
        Register.setOpaque(true);
        Register.setVerifyInputWhenFocusTarget(false);
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jMenu2.add(Register);

        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu2.add(About);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        System.out.print("Open");
        if (jFileChooserOpen.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooserOpen.getSelectedFile();
            if (file.isDirectory()) {
                JOptionPane.showMessageDialog(this, "Please choose a file!");
            } else if (!file.canRead() || !file.canExecute()) {
                JOptionPane.showMessageDialog(this, "No permission on that file!");
            } else {
                System.out.println(file.getPath());
                try {
                    file.setReadable(true);
                    file.setWritable(true);
                    Agenda.open(file.getPath());
                    refreshModel();
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        int result = JOptionPane.showOptionDialog(null, null, "Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        JOptionPane.showMessageDialog(this, "Hello! Thanks for using! App made by Lucian Cristian on April 2019");
    }//GEN-LAST:event_AboutActionPerformed

    private void SelectFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectFilterActionPerformed
        FilterButtonActionPerformed(evt);
    }//GEN-LAST:event_SelectFilterActionPerformed

    private void FilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterButtonActionPerformed
        if (selectFilterDropDown.getSelectedIndex() > 0) {
            FilterOptions filterOption = (FilterOptions) selectFilterDropDown.getSelectedItem();
            if (null != filterOption) {
                switch (filterOption) {
                    //filter after mobile
                    case MOBILE:
                        break;
                    //filter after home
                    case HOME:
                        break;
                    //filter current month
                    case CURRENT_BIRTHMONTH:
                        break;
                    //filter current day
                    case CURRENT_BIRTHDAY:
                        break;
                    case CUSTOM:
                        filtru = SelectFilter.getText();
                        break;
                    default:
                        break;
                }
            }

            refreshWithFilterModel(filterOption.toString());
        } else {
            JOptionPane.showMessageDialog(this, "Please select filter option!");
        }
    }//GEN-LAST:event_FilterButtonActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        JTextField firstName = new JTextField();
        JTextField lastName = new JTextField();
        JTextField birthDate = new JTextField();
        JTextField phoneNumber = new JTextField();
        JRadioButton Mobile = new JRadioButton();
        JRadioButton Home = new JRadioButton();
        ButtonGroup group = new ButtonGroup();
        group.add(Mobile);
        group.add(Home);
        Object[] fields = {"FirstName", firstName, "LastName", lastName, "BirthDate", birthDate, "PhoneNumber", phoneNumber, "Mobile", Mobile, "Home", Home};
        int input = JOptionPane.showConfirmDialog(null, fields, "Add Contact Dialog ", JOptionPane.OK_CANCEL_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            String firstNameText = firstName.getText();
            String lastNameText = lastName.getText();
            String birthDateText = birthDate.getText();
            String phoneNumberText = phoneNumber.getText();
            try {
                Contact contactAdd = new Contact(firstNameText, lastNameText, birthDateText, phoneNumberText);
                Boolean toAdd = true;
                for (int i = 0; i < Agenda.Contacts.size(); i++) {
                    if (contactAdd.equals(Agenda.Contacts.get(i))) {
                        toAdd = false;
                        break;
                    }
                }
                //add and find if the person has birthday today
                if (toAdd) {
                    Agenda.Contacts.add(contactAdd);
                    refreshModel();
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                    simpleDateFormat.applyPattern("dd");
                    String day = simpleDateFormat.format(date);
                    simpleDateFormat.applyPattern("MM");
                    String month = simpleDateFormat.format(date);
                    if (contactAdd.date.startsWith(day + "/" + month + "/")) {
                        JOptionPane.showMessageDialog(AddEditDialog, "Happy Birthday!");
                    }
                }
                if (!toAdd) {
                    JOptionPane.showMessageDialog(AddEditDialog, "Contact already exists!");
                }
            } catch (Exception ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(AddEditDialog, ex);
            }
            System.out.println(Agenda.Contacts.get(0));
        }

    }//GEN-LAST:event_AddActionPerformed

    private void BirthDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthDateTextActionPerformed

    }//GEN-LAST:event_BirthDateTextActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        selectedIndex = JListContacts.getSelectedIndex();
        if (selectedIndex != -1) {
            Agenda.Contacts.remove(selectedIndex);
            refreshModel();
        } else {
            JOptionPane.showMessageDialog(AddEditDialog, "Select contact to be deleted!");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        selectedIndex = JListContacts.getSelectedIndex();
        if (selectedIndex > 0) {
            Agenda.Contacts.get(selectedIndex);
            JTextField firstName = new JTextField();
            firstName.setText(Agenda.Contacts.get(selectedIndex).firstName);
            JTextField lastName = new JTextField();
            lastName.setText(Agenda.Contacts.get(selectedIndex).lastName);
            JTextField birthDate = new JTextField();
            birthDate.setText(Agenda.Contacts.get(selectedIndex).date);
            JTextField phoneNumber = new JTextField();
            phoneNumber.setText(Agenda.Contacts.get(selectedIndex).phoneNumberObj.phoneNumber);
            JRadioButton Mobile = new JRadioButton();
            JRadioButton Home = new JRadioButton();
            ButtonGroup group = new ButtonGroup();
            group.add(Mobile);
            group.add(Home);
            Object[] fields = {"FirstName", firstName, "LastName", lastName, "BirthDate", birthDate, "PhoneNumber", phoneNumber, "Mobile", Mobile, "Home", Home};
            int input = JOptionPane.showConfirmDialog(null, fields, "Add Contact Dialog ", JOptionPane.OK_CANCEL_OPTION);
            if (input == JOptionPane.OK_OPTION) {
                Agenda.Contacts.remove(selectedIndex);
                String firstNameText = firstName.getText();
                String lastNameText = lastName.getText();
                String birthDateText = birthDate.getText();
                String phoneNumberText = phoneNumber.getText();
                try {
                    Agenda.Contacts.add(new Contact(firstNameText, lastNameText, birthDateText, phoneNumberText));
                    refreshModel();
                } catch (Exception ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(AddEditDialog, ex);
                }
                System.out.println(Agenda.Contacts.get(0));
            }
        } else {
            JOptionPane.showMessageDialog(AddEditDialog, "Select contact to be edited!");
        }
    }//GEN-LAST:event_EditActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if (jFileChooserSave.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            boolean isFile = false;
            File file = jFileChooserSave.getSelectedFile();
            if (file.isDirectory()) {
                JOptionPane.showMessageDialog(this, "Please choose a file!");
            } //           else if (!file.exists()) {
            //                 try {
            //                     isFile = file.createNewFile();
            //                 } catch (IOException ex) {
            //                     Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            //                 }
            //            }
            else if (!file.canRead() || !file.canExecute()) {
                JOptionPane.showMessageDialog(this, "No permission on that file!");
            } else {
                file.setReadable(true);
                file.setWritable(true);
                System.out.println(file.getPath());
                try {
                    Agenda.save(file.getPath());
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        JTextField registerCode = new JTextField();
        Object[] fields = {"registerCode", registerCode};
        int input = JOptionPane.showConfirmDialog(null, fields, "Add Register Code ", JOptionPane.OK_CANCEL_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            String registerInputCode = registerCode.getText();
            System.out.println("You've entered: " + registerInputCode);
            //System.out.println (registerCodeValidation.hashCode());
            if (registerCodeValidation.hashCode() == registerInputCode.hashCode()) {
                System.out.println("Congrats you are registered now!");
                //stop thread of advert images
                t.stop();
                AdvertLabel.setIcon(null);
                getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 130, 50));
                getContentPane().add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 130, 50));
                getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 130, 50));
                getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 533, 350));
                Open.setEnabled(true);
                Save.setEnabled(true);
                try {
                    //call Agenda constructor and start save to file thread!
                    Agenda startSave = new Agenda();
                } catch (Exception ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("Try one more time!");
            }
        }
    }//GEN-LAST:event_RegisterActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed

        if (OrderDropBox.getSelectedIndex() > 0) {
            OrderOptions orderOption = (OrderOptions) OrderDropBox.getSelectedItem();
            if (orderOption == OrderOptions.LASTNAME) {
                Comparator<Contact> c = Contact.afterLastName;
                Collections.sort(Agenda.Contacts, c);
            } else if (orderOption == OrderOptions.FIRSTNAME) {
                Comparator<Contact> c = Contact.afterFirstName;
                Collections.sort(Agenda.Contacts, c);
            } else if (orderOption == OrderOptions.BIRTHDATE) {
                Comparator<Contact> c = Contact.afterBirthDate;
                Collections.sort(Agenda.Contacts, c);
            } else if (orderOption == OrderOptions.NUMBER) {
                Comparator<Contact> c = Contact.afterNumber;
                Collections.sort(Agenda.Contacts, c);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select order filter!");
        }
        refreshModel();
    }//GEN-LAST:event_OrderButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    private void refreshModel() {
        model.clear();
        for (Contact c : Agenda.Contacts) {
            model.addElement(c);
        }
    }

    private void refreshWithFilterModel(String filterOption) {
        model.clear();
        if ("CUSTOM".equals(filterOption)) {
            Agenda.Contacts.stream().filter(c -> c.getFirstName().contains(filtru)
                    || c.getLastName().contains(filtru)
                    || c.getPhoneNumber().contains(filtru)
                    || c.date.contains(filtru)).forEach(model::addElement);
        }
        if ("MOBILE".equals(filterOption)) {
            Agenda.Contacts.stream().filter(c -> c.getPhoneNumber().startsWith("07")).forEach(model::addElement);
        }
        if ("HOME".equals(filterOption)) {
            Agenda.Contacts.stream().filter(c -> c.getPhoneNumber().startsWith("02")
                    || c.getPhoneNumber().startsWith("03")).forEach(model::addElement);
        }
        if ("CURRENT_BIRTHDAY".equals(filterOption)) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("dd");
            String day = simpleDateFormat.format(date);
            simpleDateFormat.applyPattern("MM");
            String month = simpleDateFormat.format(date);
            Agenda.Contacts.stream().filter(c -> c.date.startsWith(day + "/" + month + "/")).forEach(model::addElement);
        }
        if ("CURRENT_BIRTHMONTH".equals(filterOption)) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("dd");
            String day = simpleDateFormat.format(date);
            simpleDateFormat.applyPattern("MM");
            String month = simpleDateFormat.format(date);
            Agenda.Contacts.stream().filter(c -> c.date.matches("\\d\\d\\/" + month + "\\/\\d\\d\\d\\d")
                    && Integer.valueOf(c.date.substring(0, 2)) > Integer.valueOf(day)).forEach(model::addElement);
        }

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JButton Add;
    private javax.swing.JDialog AddEditDialog;
    private javax.swing.JLabel AdvertLabel;
    private javax.swing.JTextField BirthDateText;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JButton FilterButton;
    private javax.swing.JTextField FirstNameText;
    private javax.swing.JRadioButton HomeNumberButton;
    public javax.swing.JList<String> JListContacts;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JRadioButton MobileNumberButton;
    private javax.swing.JMenuItem Open;
    private javax.swing.JButton OrderButton;
    private javax.swing.JComboBox<String> OrderDropBox;
    private javax.swing.JTextField PhoneNumberText;
    private javax.swing.JMenuItem Register;
    private javax.swing.JMenuItem Save;
    private javax.swing.JTextField SelectFilter;
    private javax.swing.JFileChooser jFileChooserOpen;
    private javax.swing.JFileChooser jFileChooserSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> selectFilterDropDown;
    // End of variables declaration//GEN-END:variables
}
