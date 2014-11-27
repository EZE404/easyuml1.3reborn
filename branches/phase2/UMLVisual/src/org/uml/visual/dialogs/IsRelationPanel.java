/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uml.visual.dialogs;

import java.util.List;
import javax.swing.JComboBox;
import org.netbeans.api.visual.widget.Widget;
import org.uml.visual.widgets.components.ClassWidget;
import org.uml.visual.widgets.components.ComponentWidgetBase;
import org.uml.visual.widgets.components.InterfaceWidget;

/**
 *
 * @author Uros
 */
public class IsRelationPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClassIsRelationPanel
     */
    ComponentWidgetBase componentWidget;

    public IsRelationPanel(ComponentWidgetBase widget) {
        initComponents();
        this.componentWidget = widget;
        lblRelationType.setText("Extends");
        fillCombo(componentWidget);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSource = new javax.swing.JLabel();
        lblSourceClass = new javax.swing.JLabel();
        cbxTarget = new javax.swing.JComboBox<Widget>();
        lblTarget = new javax.swing.JLabel();
        lblRelation = new javax.swing.JLabel();
        lblRelationType = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(lblSource, org.openide.util.NbBundle.getMessage(IsRelationPanel.class, "IsRelationPanel.lblSource.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblSourceClass, org.openide.util.NbBundle.getMessage(IsRelationPanel.class, "IsRelationPanel.lblSourceClass.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblTarget, org.openide.util.NbBundle.getMessage(IsRelationPanel.class, "IsRelationPanel.lblTarget.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblRelation, org.openide.util.NbBundle.getMessage(IsRelationPanel.class, "IsRelationPanel.lblRelation.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lblRelationType, org.openide.util.NbBundle.getMessage(IsRelationPanel.class, "IsRelationPanel.lblRelationType.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTarget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSource, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTarget, 0, 150, Short.MAX_VALUE)
                            .addComponent(lblSourceClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRelation, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRelationType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRelationType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRelation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSourceClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSource))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTarget)
                    .addComponent(cbxTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Widget> cbxTarget;
    private javax.swing.JLabel lblRelation;
    private javax.swing.JLabel lblRelationType;
    private javax.swing.JLabel lblSource;
    private javax.swing.JLabel lblSourceClass;
    private javax.swing.JLabel lblTarget;
    // End of variables declaration//GEN-END:variables

    private void fillCombo(ComponentWidgetBase componentWidget) {
        List<Widget> widgets = componentWidget.getClassDiagramScene().getMainLayer().getChildren();
        if (componentWidget instanceof ClassWidget) {
            for (Widget w : widgets) {
                if (w instanceof ClassWidget && !w.equals(componentWidget)) {
                    cbxTarget.addItem(w);
                }
            }
        } else if (componentWidget instanceof InterfaceWidget) {
            for (Widget w : widgets) {
                if (w instanceof InterfaceWidget && !w.equals(componentWidget)) {
                    cbxTarget.addItem(w);
                }
            }
        }
        lblSourceClass.setText(componentWidget.getName());
    }

    public JComboBox<Widget> getComboBoxTarget() {
        return cbxTarget;
    }
}
