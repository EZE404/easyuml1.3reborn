/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uml.visual.dialogs;

import java.util.List;
import javax.smartcardio.Card;
import javax.swing.JComboBox;
import org.netbeans.api.visual.widget.Widget;
import org.uml.model.CardinalityEnum;
import org.uml.visual.widgets.ClassWidget;
import org.uml.visual.widgets.ComponentWidgetBase;
import org.uml.visual.widgets.EnumWidget;

/**
 *
 * @author Uros
 */
public class ClassHasRelationPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClassHasRelationPanel
     */
    ClassWidget classWidget;
    
    public ClassHasRelationPanel(ClassWidget widget) {
        initComponents();
        this.classWidget=widget;
        fillCombo(classWidget);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxTarget = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboBoxCardTarget = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ClassHasRelationPanel.class, "ClassHasRelationPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(ClassHasRelationPanel.class, "ClassHasRelationPanel.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(ClassHasRelationPanel.class, "ClassHasRelationPanel.jLabel2.text")); // NOI18N

        textFieldName.setText(org.openide.util.NbBundle.getMessage(ClassHasRelationPanel.class, "ClassHasRelationPanel.textFieldName.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxCardTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxCardTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBoxCardTarget;
    private javax.swing.JComboBox comboBoxTarget;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textFieldName;
    // End of variables declaration//GEN-END:variables

    private void fillCombo(ClassWidget widget) {
        List<Widget> widgets =  widget.getClassDiagramScene().getMainLayer().getChildren();
        for (Widget w : widgets) {
            if ((w instanceof ClassWidget||w instanceof EnumWidget)&&!w.equals(classWidget)) {
                comboBoxTarget.addItem(w);
            }
        }
        comboBoxCardTarget.addItem(CardinalityEnum.One2Many);
        comboBoxCardTarget.addItem(CardinalityEnum.Zero2Many);
    }

    public JComboBox getComboBoxTarget() {
        return comboBoxTarget;
    }
    public JComboBox getComboBoxCardinalityTarget () {
        return comboBoxCardTarget;
    }
    public String getRelationName () {
        return textFieldName.getText();
    }
}
