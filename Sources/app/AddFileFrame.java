package app;

import com.alee.utils.FileUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import javax.swing.Icon;
import javax.swing.JDesktopPane;
import javax.swing.Timer;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.tree.DefaultMutableTreeNode;
import org.jbundle.thin.base.screen.jcalendarbutton.JCalendarButton;

public class AddFileFrame extends javax.swing.JInternalFrame implements ActionListener {

    Documents docs;
    JDesktopPane desk;
    SimpleDateFormat formater;
    AddedSuccessfullDialog frame;
    AddFileFrame parent;
    Timer timer;
    int i;
    File src;
    Date date = new Date();
    MainApp app;
    boolean error;
    boolean modify = false;
    int index;
    String serial = "";

    public AddFileFrame() {
        initConfiguration();
        initActionListeners();
        setSize(516, 262);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        serialNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        fileName = new javax.swing.JLabel();
        viewIcon = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        displayDate = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        modifyB = new JCalendarButton();

        setTitle("Search result");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(500, 270));
        setVisible(false);

        jLabel1.setText("Name:");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel2.setText("Serial number:");

        jLabel3.setText("Category:");

        category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Category 1", "Category 2", "Category 3", "add a new category" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fileName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(viewIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileName, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Save changes");
        jButton1.setEnabled(false);

        jButton2.setText("Cancel");

        jLabel6.setText("Date:");

        modifyB.setText("Modify");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(category, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(serialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(displayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modifyB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(category)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(serialNumber)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox category;
    public javax.swing.JLabel displayDate;
    public javax.swing.JLabel fileName;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton modifyB;
    public javax.swing.JTextField name;
    public javax.swing.JTextField serialNumber;
    public javax.swing.JLabel viewIcon;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent e) {
        i += 4;
        iterate();
    }

    private void iterate() {
        if (i <= 50) {
            setLocation(140, i);
        } else {
            timer.stop();
        }

    }

    public void filePreview(File file) {
        src = file;
        Icon icon = FileSystemView.getFileSystemView().getSystemIcon(file);
        viewIcon.setIcon(icon);
        fileName.setText(file.getName());
    }

    public void refreshDate() {

    }

    private void initConfiguration() {

        parent = this;
        initComponents();
        setLocation(140, 0);
        formater = new SimpleDateFormat("dd/MM/yyyy");
        timer = new Timer(35, this);
        refreshDate();
        for (MouseListener listener : ((BasicInternalFrameUI) this.getUI()).getNorthPane().getMouseListeners()) {
            ((BasicInternalFrameUI) this.getUI()).getNorthPane().removeMouseListener(listener);
        }
        modifyB.setIcon(null);
        setFrameIcon(null);
        ((JCalendarButton) modifyB).setTargetDate(date);
        setSize(500, 270);
    }

    private void initActionListeners() {
        jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
                    saveChanges();
               

                parent.setVisible(false);

                frame.setVisible(true);
            }
        });
        jButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                parent.setVisible(false);
            }
        });
        modifyB.addPropertyChangeListener(new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getNewValue() instanceof Date) {
                    displayDate.setText(formater.format((Date) evt.getNewValue()));
                }
            }
        });
        category.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (((String) category.getSelectedItem()).equals("add a new category")) {
                    CategoryChooserDialog dialog = new CategoryChooserDialog();
                    String data = dialog.data;
                    dialog.frame = parent;
                    dialog.docs = docs;
                    dialog.data = "The file has been added successfully.";
                    parent.setVisible(false);
                    dialog.setVisible(true);
                    desk.add(dialog);
                }
            }
        });
        name.addCaretListener(new CaretListener() {

            @Override
            public void caretUpdate(CaretEvent e) {
                if ((!name.getText().equals("") && !serialNumber.getText().equals(""))) {
                    jButton1.setEnabled(true);
                } else {
                    jButton1.setEnabled(false);
                }
            }
        });
        serialNumber.addCaretListener(new CaretListener() {

            @Override
            public void caretUpdate(CaretEvent e) {
                if ((!name.getText().equals("") && !serialNumber.getText().equals(""))) {
                    jButton1.setEnabled(true);
                } else {
                    jButton1.setEnabled(false);
                }
            }
        });
    }

    private void saveChanges() {

        if (modify) {

            docs.name.set(index, name.getText());
            docs.date.set(index, displayDate.getText());
            docs.serial.set(index, serialNumber.getText());
            docs.category.set(index, "" + category.getSelectedIndex());
            app.initTreeList();
            refactorFile(new File(System.getProperty("user.dir") + "/dataBase/Hash/fileList.txt"));

        } else {
            String dir = (String) category.getSelectedItem();
            File dst = new File(System.getProperty("user.dir") + "/dataBase/Files/" + dir + "/" + docs.name.size() + src.getName());
            FileUtils.copyFile(src, dst);

            try (PrintWriter out = new PrintWriter(
                    new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/dataBase/Hash/fileList.txt", true)))) {
                out.printf(
                        "%s\n%s\n%s\n%s\n%d\n",
                        name.getText(),
                        displayDate.getText(),
                        serialNumber.getText(),
                        dst.getAbsolutePath(),
                        (category.getSelectedIndex())
                );
            } catch (IOException e) {

            }
            docs.name.add(name.getText());
            docs.date.add(displayDate.getText());
            docs.serial.add(serialNumber.getText());
            docs.path.add(dst.getAbsolutePath());
            docs.category.add(category.getSelectedIndex() + "");
            app.addToTable(category.getSelectedIndex() + "", new DefaultMutableTreeNode(new ListObject(docs.name.get(docs.name.size() - 1), docs.serial.get(docs.name.size() - 1), docs.name.size() - 1)));
        }

    }

    public void refactorFile(File file) {

        Formatter out = null;
        try {
            out = new Formatter(file);
        } catch (FileNotFoundException ex) {
            System.out.println("exception");
        }
        if (out != null) {
            for (int j = 0; j < docs.name.size(); j++) {
                out.format(
                        "%s\n%s\n%s\n%s\n%s\n",
                        docs.name.get(j),
                        docs.date.get(j),
                        docs.serial.get(j),
                        docs.path.get(j),
                        docs.category.get(j)
                );

            }
            out.flush();
        }

    }

}
