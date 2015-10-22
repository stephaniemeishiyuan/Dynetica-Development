/*
 * BasicSensitivityAnalysisEditor.java
 *
 * Created on November 12, 2001, 1:38 PM
 */

package dynetica.gui.algorithms;

import dynetica.algorithm.*;
import dynetica.entity.*;
import dynetica.objective.AbstractMetric;
import javax.swing.*;
import java.util.*;

/**
 * 
 * @author You
 */
public class SensitivityAnalysisEditor extends javax.swing.JPanel {

    final DefaultListModel metricListModel = new DefaultListModel();
    ArrayList<AbstractMetric> metrics = new ArrayList<AbstractMetric>();

    DefaultComboBoxModel variableBoxModel = new DefaultComboBoxModel();

    dynetica.algorithm.SensitivityAnalysis sa = null;
    dynetica.system.ReactiveSystem system = null;

    /** Creates new form BasicSensitivityAnalysisEditor */
    public SensitivityAnalysisEditor(SensitivityAnalysis sa) {
        this.sa = sa;
        system = sa.getSystem();
        setUpBox();
        initComponents();
    }

    //
    // set up the list of parameters and substances.
    //
    private void setUpBox() {
        List substanceList = system.getSubstances();
        List parameterList = system.getParameters();
        variableBoxModel.addElement("Choose Parameter");
        // Exclude simulationTimer
        for (Object o : parameterList) {
            if (!(o instanceof SimulationTimer))
                variableBoxModel.addElement(((Parameter) o).getName());
        }

        // Exclude expression variables
        for (Object o : substanceList) {
            if (!(o instanceof ExpressionVariable))
                variableBoxModel.addElement(((Substance) o).getName());
        }

    }

    public void addMetric(AbstractMetric am) {
        metricListModel.addElement(am.toString());
        metrics.add(am);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed"
    // desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        runButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        plotButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        metricJList = new javax.swing.JList();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        systemName = new javax.swing.JLabel();
        selectionBox = new javax.swing.JComboBox();
        minField = new javax.swing.JTextField();
        maxField = new javax.swing.JTextField();
        cyclesField = new javax.swing.JTextField();
        logScaleBox = new javax.swing.JCheckBox();
        timeField = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setLayout(new java.awt.BorderLayout());

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });
        jPanel5.add(runButton);

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });
        jPanel5.add(stopButton);

        plotButton.setText("Plot");
        plotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plotButtonActionPerformed(evt);
            }
        });
        jPanel5.add(plotButton);

        jPanel2.add(jPanel5, java.awt.BorderLayout.SOUTH);

        addButton.setText("Add Metric");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel6.add(addButton);

        deleteButton.setText("Delete Metric");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel6.add(deleteButton);

        jPanel2.add(jPanel6, java.awt.BorderLayout.NORTH);

        metricJList.setModel(metricListModel);
        jScrollPane1.setViewportView(metricJList);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        splitPane.setRightComponent(jPanel2);

        jSplitPane4.setDividerSize(1);

        jPanel3.setLayout(new java.awt.GridLayout(7, 1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("System");
        jPanel3.add(jLabel1);

        jLabel2.setText("Variable");
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(jLabel2);

        jLabel3.setText("Minimum Value");
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(jLabel3);

        jLabel4.setText("Maximum Value");
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(jLabel4);

        jLabel5.setText("Number of Points");
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(jLabel5);

        jLabel6.setText("Log Scale");
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(jLabel6);

        jLabel7.setText("Time");
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(jLabel7);

        jSplitPane4.setLeftComponent(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(7, 1));

        systemName.setText(system.getName());
        systemName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        systemName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel4.add(systemName);

        selectionBox.setModel(variableBoxModel);
        selectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBoxActionPerformed(evt);
            }
        });
        jPanel4.add(selectionBox);

        minField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        minField.setText(String.valueOf(sa.getMin()));
        minField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minFieldActionPerformed(evt);
            }
        });
        minField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                minFieldFocusLost(evt);
            }
        });
        jPanel4.add(minField);

        maxField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        maxField.setText(String.valueOf(sa.getMax()));
        maxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxFieldActionPerformed(evt);
            }
        });
        maxField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                maxFieldFocusLost(evt);
            }
        });
        jPanel4.add(maxField);

        cyclesField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        cyclesField.setText(String.valueOf(sa.getNumSimulations()));
        cyclesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyclesFieldActionPerformed(evt);
            }
        });
        cyclesField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cyclesFieldFocusLost(evt);
            }
        });
        jPanel4.add(cyclesField);

        logScaleBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        logScaleBox.setText(String.valueOf(sa.isLogScale()));
        logScaleBox.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        logScaleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logScaleBoxActionPerformed(evt);
            }
        });
        jPanel4.add(logScaleBox);

        timeField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        timeField.setText(String.valueOf(sa.getTime()));
        timeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFieldActionPerformed(evt);
            }
        });
        timeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                timeFieldFocusLost(evt);
            }
        });
        jPanel4.add(timeField);

        jSplitPane4.setRightComponent(jPanel4);

        splitPane.setLeftComponent(jSplitPane4);

        add(splitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_stopButtonActionPerformed
        sa.pause();
    }// GEN-LAST:event_stopButtonActionPerformed

    private void timeFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_timeFieldFocusLost
        sa.setTime(Double.parseDouble(timeField.getText()));
    }// GEN-LAST:event_timeFieldFocusLost

    private void cyclesFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_cyclesFieldFocusLost
        sa.setNumSimulations(Integer.parseInt(cyclesField.getText()));
    }// GEN-LAST:event_cyclesFieldFocusLost

    private void maxFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_maxFieldFocusLost
        sa.setMax(Double.parseDouble(maxField.getText()));
    }// GEN-LAST:event_maxFieldFocusLost

    private void minFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_minFieldFocusLost
        sa.setMin(Double.parseDouble(minField.getText()));
    }// GEN-LAST:event_minFieldFocusLost

    private void plotButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_plotButtonActionPerformed
        new dynetica.gui.plotting.SensitivityPlaneWindow(sa).show();
    }// GEN-LAST:event_plotButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteButtonActionPerformed
        Object[] selectedNames = metricJList.getSelectedValues();
        for (int i = 0; i < selectedNames.length; i++) {
            String name = (String) selectedNames[i];
            metricListModel.removeElement(name);
            for (int j = 0; j < metrics.size(); j++) {
                if (name.equalsIgnoreCase(metrics.get(j).toString())) {
                    metrics.remove(j);
                    break;
                }
            }
        }
    }// GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
        JFrame jf = new JFrame("New Metric");
        jf.getContentPane().add(new MetricEditor(jf, this));
        jf.pack();
        jf.show();
    }// GEN-LAST:event_addButtonActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_runButtonActionPerformed
        sa.setMetrics(metrics);
        sa.setPlotOnComplete(false);
        sa.start();
    }// GEN-LAST:event_runButtonActionPerformed

    private void timeFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_timeFieldActionPerformed
        sa.setTime(Double.parseDouble(timeField.getText()));
    }// GEN-LAST:event_timeFieldActionPerformed

    private void cyclesFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cyclesFieldActionPerformed
        sa.setNumSimulations(Integer.parseInt(cyclesField.getText()));
    }// GEN-LAST:event_cyclesFieldActionPerformed

    private void maxFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_maxFieldActionPerformed
        sa.setMax(Double.parseDouble(maxField.getText()));
    }// GEN-LAST:event_maxFieldActionPerformed

    private void minFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_minFieldActionPerformed
        sa.setMin(Double.parseDouble(minField.getText()));
    }// GEN-LAST:event_minFieldActionPerformed

    private void logScaleBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logScaleBoxActionPerformed
        sa.setLogScale(logScaleBox.isSelected());
        logScaleBox.setText(String.valueOf(logScaleBox.isSelected()));
    }// GEN-LAST:event_logScaleBoxActionPerformed

    private void selectionBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_selectionBoxActionPerformed
        String name = (String) (selectionBox.getSelectedItem());
        if (name.equals("Choose Parameter")) {
            JOptionPane.showMessageDialog(this, "Please choose a parameter",
                        "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            EntityVariable ev = (EntityVariable) (system.getEntity(name));
            double baseValue;
            if (ev instanceof Parameter) {
                baseValue = ev.getValue();
            } else {
                baseValue = ((Substance) ev).getInitialValue();
            }
            
            double min = 0.1 * baseValue;
            double max = 10 * baseValue;
            
            if (baseValue <= Double.MIN_VALUE) {
                min = 0.0;
                max = 1.0;
            }
            
            maxField.setText(dynetica.util.Numerics.displayFormattedValue(max));
            minField.setText(dynetica.util.Numerics.displayFormattedValue(min));
            
            sa.setMax(max);
            sa.setMin(min);
            sa.setVariable(ev);
        }
    }// GEN-LAST:event_selectionBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField cyclesField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JCheckBox logScaleBox;
    private javax.swing.JTextField maxField;
    private javax.swing.JList metricJList;
    private javax.swing.JTextField minField;
    private javax.swing.JButton plotButton;
    private javax.swing.JButton runButton;
    private javax.swing.JComboBox selectionBox;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel systemName;
    private javax.swing.JTextField timeField;
    // End of variables declaration//GEN-END:variables

}
