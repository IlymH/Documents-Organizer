package app;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
public class SearchResultFrame extends javax.swing.JInternalFrame implements ActionListener {
    Timer timer;
    int i;
    ArrayList<String> result;
    Documents docs;
    SecondSearchResultFrame frame;
    public SearchResultFrame() {
        result = new ArrayList<>();
        initComponents();
        setLocation(40, 70);
        timer = new Timer(35, this);
        for (MouseListener listener : ((BasicInternalFrameUI) this.getUI()).getNorthPane().getMouseListeners()) {
            ((BasicInternalFrameUI) this.getUI()).getNorthPane().removeMouseListener(listener);
        }
        setFrameIcon(null);
        jList2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = jList2.getSelectedIndex();
                if (index != -1 && !result.isEmpty()){
                index = Integer.parseInt(result.get(index));
                frame.index = index;
                frame.jButton1.setEnabled(true);
                frame.name.setText(docs.name.get(index));
                frame.category.setText(docs.categoryList.get(Integer.parseInt(docs.category.get(index))));
                frame.serialNumber1.setText(docs.serial.get(index));
                frame.date.setText(docs.date.get(index));
                frame.option.setEnabled(true);
                }
            }
        });
        setSize(300, 230);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();

        setTitle("Les Resultats de la recherche");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(300, 200));
        setVisible(false);

        jLabel2.setText("Search Results:");

        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 189, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    public javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent e) {
        i += 4;
        iterate();
    }
    private void iterate() {
        if (i <= 50) {
            setLocation(40, 70 + i);
        } else {
            timer.stop();
        }
    }
}
