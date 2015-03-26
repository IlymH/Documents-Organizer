package app;

import com.alee.laf.WebLookAndFeel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPopupMenu;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class MainApp extends javax.swing.JFrame {

    ArrayList<String> result;
    Documents docs;
    SearchResultFrame frame1;
    SecondSearchResultFrame frame2;
    AddFileFrame frame3;
    AddedSuccessfullDialog frame4;
    DefaultMutableTreeNode root;
    DefaultMutableTreeNode category[];
    JPopupMenu menu;
    String selecteditem;
    JPopupMenu popupMenu;
    int index;
    MainApp app;
    String categoryValue = "";

    public MainApp() {
        setLocationRelativeTo(null);
        setSize(800, 400);
        // initialisation
        result = new ArrayList<>();
        root = new DefaultMutableTreeNode("Documents");
        app = this;
        initComponents();
        initFrames();
        initDataBase();
        initTreeList();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        categoryChanger = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        popup = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jDesktopPane1 = new javax.swing.JDesktopPane()

        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/resources/test.jpg"));
            Image image = icon.getImage();

            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this);
            }
        }

        ;
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        jSeparator2 = new javax.swing.JSeparator();
        searchButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        importDoc = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton1.setText("Subject");

        jRadioButton2.setText("Date");

        jRadioButton3.setText("Serial number");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        categoryChanger.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton4.setText("Rename");

        jRadioButton5.setText("delete");

        javax.swing.GroupLayout categoryChangerLayout = new javax.swing.GroupLayout(categoryChanger);
        categoryChanger.setLayout(categoryChangerLayout);
        categoryChangerLayout.setHorizontalGroup(
            categoryChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryChangerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(categoryChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        categoryChangerLayout.setVerticalGroup(
            categoryChangerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryChangerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        popup.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton6.setText("delete");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setText("modify");

        javax.swing.GroupLayout popupLayout = new javax.swing.GroupLayout(popup);
        popup.setLayout(popupLayout);
        popupLayout.setHorizontalGroup(
            popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        popupLayout.setVerticalGroup(
            popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Documents-Organizer");
        setLocationByPlatform(true);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tree.setModel(new javax.swing.tree.DefaultTreeModel(root));
        jScrollPane2.setViewportView(tree);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/1405636796_685082-Search.png"))); // NOI18N
        searchButton.setEnabled(false);

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(searchField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchField)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Fichier");

        importDoc.setText("Add a document");
        jMenu1.add(importDoc);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("?");

        jMenuItem1.setText("à propos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AboutI dialog = new AboutI();
        jDesktopPane1.add(dialog);
        dialog.setLocation(155, 91);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

    }//GEN-LAST:event_searchFieldActionPerformed

    public static void main(String args[]) {
        WebLookAndFeel.install();
        new MainApp().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel categoryChanger;
    private javax.swing.JMenuItem importDoc;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel popup;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables

    private void initActionListeners() {
        searchField.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
            }
        });
        importDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option;
                do {
                    option = fileChooser.showOpenDialog(null);
                } while (fileChooser.getSelectedFile() != null && fileChooser.getSelectedFile().isDirectory());
                if (option == JFileChooser.APPROVE_OPTION) {
                    initImportDialog(fileChooser.getSelectedFile());
                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu = new JPopupMenu();
                menu.add(jPanel1);
                menu.show(searchButton, 0, 0);
            }
        });
        jRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.setVisible(false);
                doSearch(searchField.getText(), 0);
                unselectButtons();
            }
        });
        jRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.setVisible(false);
                doSearch(searchField.getText(), 1);
                unselectButtons();
            }
        });
        jRadioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.setVisible(false);
                doSearch(searchField.getText(), 2);
                unselectButtons();
            }
        });
        searchField.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                if (searchField.getText().equals("")) {
                    searchButton.setEnabled(false);
                } else {
                    searchButton.setEnabled(true);
                }
            }
        });
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                if (node == null) //Nothing is selected.  
                {
                    return;
                }
                Object nodeInfo = node.getUserObject();
                if (node.isLeaf() && nodeInfo instanceof ListObject) {

                    selecteditem = ((ListObject) nodeInfo).toString();
                    ListObject parsed = (ListObject) nodeInfo;
                    frame1.setVisible(false);
                    frame3.setVisible(false);
                    frame4.setVisible(false);
                    frame2.index = parsed.index;
                    index = parsed.index;
                    frame2.name.setText(parsed.name);
                    frame2.serialNumber1.setText(parsed.serial);
                    frame2.category.setText(docs.categoryList.get(Integer.parseInt(docs.category.get(parsed.index))));
                    frame2.date.setText(docs.date.get(parsed.index));
                    frame2.setVisible(true);
                    frame2.setLocation(200, 120);
                    frame2.jButton1.setEnabled(true);
                    frame2.option.setEnabled(true);
                } else if (!node.toString().equals("Documents")) {
                    categoryValue = node.toString();
                    selecteditem = "";
                }
            }
        });
        tree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TreePath path = tree.getPathForLocation(e.getX(), e.getY());
                if (path != null
                        && e.getButton() == MouseEvent.BUTTON3
                        && !path.toString().equals("[Documents]")
                        && tree.getSelectionPath() != null
                        && tree.getSelectionPath().equals(path)
                        && tree.getSelectionPath().getParentPath().toString().equals("[Documents]")) {

                    popupMenu = new JPopupMenu();
                    popupMenu.add(categoryChanger);
                    popupMenu.show(tree, e.getX(), e.getY());
                } else if (path != null
                        && e.getButton() == MouseEvent.BUTTON3
                        && !path.toString().equals("[Documents]")
                        && tree.getSelectionPath() != null
                        && tree.getSelectionPath().equals(path)
                        && !selecteditem.equals("")) {
                    popupMenu = new JPopupMenu();
                    popupMenu.add(popup);
                    popupMenu.show(tree, e.getX(), e.getY());
                }
            }
        });
        jRadioButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popupMenu.setVisible(false);
                unselectButtons();
                SecondCategoryChooserDialog dialog = new SecondCategoryChooserDialog();
                dialog.index = docs.categoryList.lastIndexOf(categoryValue);
                System.out.println(dialog.index);
                dialog.app = app;
                dialog.docs = docs;
                jDesktopPane1.add(dialog);
                dialog.setVisible(true);
            }
        });
        jRadioButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popupMenu.setVisible(false);
                unselectButtons();
                File file;

                int ind = docs.categoryList.lastIndexOf(categoryValue);
                int size = docs.name.size();
                for (int j = 0; j < size; j++) {
                    if (docs.category.get(j).equals(String.valueOf(ind))) {

                        docs.name.remove(j);
                        docs.date.remove(j);
                        docs.category.remove(j);
                        try {
                            file = new File(docs.path.get(j));
                            file.delete();
                        } catch (Exception ex) {
                        }
                        docs.path.remove(j);
                        docs.serial.remove(j);
                        j = -1;
                        size--;

                    }
                }
                docs.categoryList.remove(ind);
                for (int i = 0; i < docs.category.size(); i++) {
                    if (Integer.parseInt(docs.category.get(i)) > ind) {
                        docs.category.set(i, (Integer.parseInt(docs.category.get(i)) - 1) + "");
                    }
                }
                refactorFile(new File(System.getProperty("user.dir") + "/dataBase/Hash/fileList.txt"));
                refactorCategory(new File(System.getProperty("user.dir") + "/dataBase/Hash/categoryList.txt"));

                initTreeList();

            }

        });
        jRadioButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File(docs.path.get(index));
                    file.delete();
                } catch (Exception r) {
                }
                popupMenu.setVisible(false);
                unselectButtons();
                docs.name.remove(index);
                docs.date.remove(index);
                docs.category.remove(index);
                docs.path.remove(index);
                docs.serial.remove(index);
                refactorFile(new File(System.getProperty("user.dir") + "/dataBase/Hash/fileList.txt"));
                initTreeList();
                frame1.setVisible(false);
                frame2.setVisible(false);
                frame2.setVisible(false);
                frame2.setVisible(false);
            }
        });
        jRadioButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unselectButtons();
                popupMenu.setVisible(false);
                File file = new File(docs.path.get(index));
                frame1.setVisible(false);
                frame2.setVisible(false);
                frame4.setVisible(false);
                frame3.modify = true;
                frame3.name.setText(docs.name.get(index));
                frame3.serialNumber.setText(docs.serial.get(index));
                frame3.displayDate.setText(docs.date.get(index));
                frame3.category.setModel(new DefaultComboBoxModel(docs.categoryList.toArray()));
                frame3.category.setSelectedItem(docs.categoryList.get(Integer.parseInt(docs.category.get(index))));
                frame3.index = index;
                frame3.docs = docs;
                frame3.app = app;
                frame3.frame = frame4;
                frame3.filePreview(file);
                frame3.serialNumber.setEnabled(false);
                frame3.i = 0;
                frame3.timer.start();
                frame3.setVisible(true);
            }
        });
    }

    public void initImportDialog(File selectedFile) {
        frame1.setVisible(false);
        frame2.setVisible(false);
        frame4.setVisible(false);
        frame3.name.setText("");
        frame3.serialNumber.setText("");
        frame3.jButton1.setEnabled(false);
        SimpleDateFormat formater;
        formater = new SimpleDateFormat("dd/MM/yyyy");
        frame3.displayDate.setText(formater.format(new Date()));
        frame3.docs = docs;
        frame3.app = this;
        frame3.filePreview(selectedFile);
        frame3.frame = frame4;
        frame3.modify = false;
        frame3.setVisible(true);
        frame3.i = 0;
        frame3.setLocation(140, 0);
        frame3.timer.start();
        frame3.serialNumber.setEnabled(true);
        frame3.category.setModel(new DefaultComboBoxModel(docs.categoryList.toArray()));
        frame3.category.addItem("add a new category");
    }

    private void initDataBase() {
        File file = new File(System.getProperty("user.dir") + "/dataBase/Hash/fileList.txt");
        Scanner in = null;
        docs = new Documents();
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException ex) {
        }
        while (in != null && in.hasNext()) {
            docs.name.add(in.nextLine());
            docs.date.add(in.nextLine());
            docs.serial.add(in.nextLine());
            docs.path.add(in.nextLine());
            docs.category.add(in.nextLine());
        }
        File file2 = new File(System.getProperty("user.dir") + "/dataBase/Hash/categoryList.txt");
        Scanner in2 = null;
        try {
            in2 = new Scanner(file2);
        } catch (FileNotFoundException ex) {
        }
        while (in2 != null && in2.hasNext()) {
            docs.categoryList.add(in2.nextLine());
        }
    }

    private void initFrames() {
        frame1 = new SearchResultFrame();
        jDesktopPane1.add(frame1);
        frame2 = new SecondSearchResultFrame();
        jDesktopPane1.add(frame2);
        frame3 = new AddFileFrame();
        jDesktopPane1.add(frame3);
        frame3.desk = jDesktopPane1;
        frame4 = new AddedSuccessfullDialog();
        jDesktopPane1.add(frame4);
        frame2.app = this;
        initActionListeners();
    }

    public void initTreeList() {
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        root = new DefaultMutableTreeNode("Documents");
        category = new DefaultMutableTreeNode[docs.categoryList.size()];
        for (int i = 0; i < category.length; i++) {
            category[i] = new DefaultMutableTreeNode(docs.categoryList.get(i));
            root.add(category[i]);
        }
        for (int i = 0; i < docs.name.size(); i++) {
            category[Integer.parseInt(docs.category.get(i))].add(new DefaultMutableTreeNode(new ListObject(docs.name.get(i), docs.serial.get(i), i)));
        }
        for (int i = 0; i < category.length; i++) {
            if (category[i].isLeaf()) {
                category[i].add(new DefaultMutableTreeNode("Empty"));
            }
        }
        refreshTable();
    }

    public void addToTable(String cat, DefaultMutableTreeNode node) {
        category[Integer.parseInt(cat)].add(node);
        initTreeList();
    }

    public void refreshTable() {
        root.removeAllChildren();
        for (DefaultMutableTreeNode category1 : category) {
            root.add(category1);
        }
        ((DefaultTreeModel) tree.getModel()).setRoot(root);
        ((DefaultTreeModel) tree.getModel()).reload();
    }

    public void doSearch(String key, int type) {
        result.clear();
        if (type == 0) {
            for (int i = 0; i < docs.name.size(); i++) {
                if (docs.name.get(i).toLowerCase().contains(key.toLowerCase())) {
                    result.add(i + "");
                }
            }
        } else if (type == 1) {
            for (int i = 0; i < docs.date.size(); i++) {
                if (docs.date.get(i).contains(key)) {
                    result.add(i + "");
                }
            }
        } else {
            for (int i = 0; i < docs.serial.size(); i++) {
                if (docs.serial.get(i).toLowerCase().contains(key.toLowerCase())) {
                    result.add(i + "");
                }
            }
        }
        showResults();
    }

    public void showResults() {
        final String results[];
        if (result.isEmpty()) {
            results = new String[1];
            results[0] = "no element was found";
        } else {
            results = new String[result.size()];
            for (int i = 0; i < result.size(); i++) {
                results[i] = docs.name.get(Integer.parseInt(result.get(i)));
            }
        }
        frame3.setVisible(false);
        frame4.setVisible(false);
        frame1.jList2.setModel(new javax.swing.AbstractListModel() {
            public int getSize() {
                return results.length;
            }

            public Object getElementAt(int i) {
                return results[i];
            }
        });
        frame1.result = result;
        frame1.docs = docs;
        frame1.frame = frame2;
        frame1.i = 0;
        frame1.setVisible(true);
        frame1.timer.start();
        frame2.loc = 350;
        frame2.setLocation(350, 70);
        frame2.i = 0;
        frame2.setVisible(true);
        frame2.timer.start();
    }

    public void unselectButtons() {
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(false);
        jRadioButton7.setSelected(false);
    }

    public void refactorCategory(File file) {
        Formatter out = null;
        try {
            out = new Formatter(file);
        } catch (FileNotFoundException ex) {
            System.out.println("exception");
        }
        if (out != null) {
            for (int j = 0; j < docs.categoryList.size(); j++) {
                out.format("%s\n", docs.categoryList.get(j)
                );
            }
            out.flush();
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
