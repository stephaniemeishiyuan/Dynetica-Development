/*
 * GeneEditor.java
 *
 * Created on April 10, 2001, 11:36 AM
 */

package dynetica.gui.genetics;

/**
 *
 * @author  Lingchong You
 * @version 0.01
 */
public class GeneEditor extends javax.swing.JPanel {

    dynetica.entity.Gene gene;
    
    /** Creates new customizer GeneticgeneEditor */
    public GeneEditor(dynetica.entity.Gene gene) {
        this.gene = gene;
        initComponents ();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        startLabel = new javax.swing.JLabel();
        end = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        startField = new javax.swing.JTextField();
        endField = new javax.swing.JTextField();
        RNAPField = new javax.swing.JTextField();
        rnaField = new javax.swing.JTextField();
        proteinField = new javax.swing.JTextField();
        kTranscriptionField = new javax.swing.JTextField();
        kTranslationField = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("<html> <i> Gene </i> " + gene.getName());
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        add(jLabel1, java.awt.BorderLayout.NORTH);

        jSplitPane1.setDividerSize(1);

        jPanel3.setPreferredSize(new java.awt.Dimension(130, 112));
        jPanel3.setLayout(new java.awt.GridLayout(7, 1));

        startLabel.setText("Start");
        startLabel.setToolTipText("The starting position (in base-pairs) of the gene along its genome.");
        startLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        startLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(startLabel);

        end.setText("End");
        end.setToolTipText("The ending position of the gene along its parent genome.");
        end.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        end.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(end);

        jLabel2.setText("RNAP");
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(jLabel2);

        jLabel3.setText("RNA");
        jLabel3.setToolTipText("The name of the RNA transcribed from this gene");
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(jLabel3);

        jLabel4.setText("Protein");
        jLabel4.setToolTipText("The name of the protein translated from this gene.");
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setEnabled(gene.isTranslatable());
        jPanel3.add(jLabel4);

        jLabel5.setText("Transcription activity");
        jLabel5.setToolTipText("Relative transcriiption activity. Used for the distribution of RNAPs among different genes.");
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(jLabel5);

        jLabel6.setText("Translation activity");
        jLabel6.setToolTipText("The relative translation activity of the given gene.\nThis parameter is used for distributing ribosomes among\ndifferent mRNAs. The mRNAs whose corresponding genes have\nhigher translation activity will be allocated with more\nribsomes, with everything else being equal.");
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setEnabled(gene.isTranslatable());
        jPanel3.add(jLabel6);

        jSplitPane1.setLeftComponent(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(7, 1));

        startField.setText(String.valueOf(gene.getStart()));
        startField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startFieldActionPerformed(evt);
            }
        });
        startField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                startFieldFocusLost(evt);
            }
        });
        jPanel4.add(startField);

        endField.setText(String.valueOf(gene.getEnd()));
        endField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endFieldActionPerformed(evt);
            }
        });
        endField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                endFieldFocusLost(evt);
            }
        });
        jPanel4.add(endField);

        RNAPField.setText(getRNAP());
        RNAPField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNAPFieldActionPerformed(evt);
            }
        });
        RNAPField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RNAPFieldFocusLost(evt);
            }
        });
        jPanel4.add(RNAPField);

        rnaField.setText(gene.getRnaName());
        rnaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnaFieldActionPerformed(evt);
            }
        });
        rnaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rnaFieldFocusLost(evt);
            }
        });
        jPanel4.add(rnaField);

        proteinField.setText(gene.getProteinName());
        proteinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinFieldActionPerformed(evt);
            }
        });
        proteinField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                proteinFieldFocusLost(evt);
            }
        });
        jPanel4.add(proteinField);

        kTranscriptionField.setText(getKTranscription());
        kTranscriptionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kTranscriptionFieldActionPerformed(evt);
            }
        });
        kTranscriptionField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                kTranscriptionFieldFocusLost(evt);
            }
        });
        jPanel4.add(kTranscriptionField);

        kTranslationField.setText(getKTranslation());
        kTranslationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kTranslationFieldActionPerformed(evt);
            }
        });
        kTranslationField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                kTranslationFieldFocusLost(evt);
            }
        });
        jPanel4.add(kTranslationField);

        jSplitPane1.setRightComponent(jPanel4);

        jScrollPane1.setViewportView(jSplitPane1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

  private void RNAPFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNAPFieldActionPerformed
     setRNAP();
  }//GEN-LAST:event_RNAPFieldActionPerformed

  private void kTranslationFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kTranslationFieldFocusLost
     setKTranslation();
  }//GEN-LAST:event_kTranslationFieldFocusLost

  private void kTranslationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kTranslationFieldActionPerformed
     setKTranslation();
  }//GEN-LAST:event_kTranslationFieldActionPerformed

  private void kTranscriptionFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kTranscriptionFieldFocusLost
    setKTranscription();
  }//GEN-LAST:event_kTranscriptionFieldFocusLost

  private void kTranscriptionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kTranscriptionFieldActionPerformed
    setKTranscription();
  }//GEN-LAST:event_kTranscriptionFieldActionPerformed

  private void proteinFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proteinFieldFocusLost
    setProteinName();
  }//GEN-LAST:event_proteinFieldFocusLost

  private void proteinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinFieldActionPerformed
    setProteinName();
  }//GEN-LAST:event_proteinFieldActionPerformed

  private void rnaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rnaFieldFocusLost
    setRnaName();
  }//GEN-LAST:event_rnaFieldFocusLost

  private void rnaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnaFieldActionPerformed
   setRnaName();
  }//GEN-LAST:event_rnaFieldActionPerformed

  private void RNAPFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RNAPFieldFocusLost
    setRNAP();
  }//GEN-LAST:event_RNAPFieldFocusLost

  private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    setRNAP();
  }//GEN-LAST:event_jTextField1ActionPerformed

  private void endFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_endFieldFocusLost
    setEnd();
  }//GEN-LAST:event_endFieldFocusLost

  private void endFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endFieldActionPerformed
    setEnd();
  }//GEN-LAST:event_endFieldActionPerformed

  private void startFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startFieldFocusLost
    setStart();
  }//GEN-LAST:event_startFieldFocusLost

  private void startFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startFieldActionPerformed
    setStart();
  }//GEN-LAST:event_startFieldActionPerformed

    private void setProteinName() {
        String oldName = gene.getProteinName();
        String newName = proteinField.getText().trim();
        if (oldName.compareTo( newName ) != 0) {
            gene.setProteinName(newName);
        }
    }
  
    private void setRnaName() {
        String oldName = gene.getRnaName();
        String newName = rnaField.getText().trim();
        if (oldName.compareTo( newName ) != 0) {
            gene.setRnaName(newName);
        }
    }
    
   private void setStart() {
        int newValue = Integer.parseInt(startField.getText());
        gene.setStart(newValue);
    }
    
    private void setEnd() {
        int newValue = Integer.parseInt(endField.getText());
        gene.setEnd(newValue);
    }
    
    private String getRNAP() {
        if (gene.getRNAP() != null)
            return gene.getRNAP().getName();
        else
            return "";
    }
    
    private String getKTranscription() {
        if (gene.getKTranscription() != null)
            return gene.getKTranscription().toString();
        else
            return "";
    }
    
    private String getKTranslation() {
        if (gene.getKTranslation() != null)
            return gene.getKTranslation().toString();
        else
            return "";
    }
    
    private void setKTranslation() {
        String oldKstring = getKTranslation();
        String kstring = kTranslationField.getText().trim();
        if (oldKstring.compareTo(kstring) != 0 && kstring.length() > 0) {
            try {
                gene.setProperty("kTranslation", kstring);
            }
            catch (Exception e) {
                e.printStackTrace();
            } 
        }
    }
    
    private void setKTranscription() {
        String oldKstring = getKTranscription();
        String kstring = kTranscriptionField.getText().trim();
        if (oldKstring.compareTo(kstring) != 0 && kstring.length() > 0) {
            try {
                gene.setProperty("kTranscription", kstring);
            }
            catch (Exception e) {
                e.printStackTrace();
            }  
        }
    }
    
    private void setRNAP() {
        String newName = RNAPField.getText().trim();
        String oldName = getRNAP();
        if (oldName.compareTo( newName ) != 0) {
            try {
               gene.setProperty("RNAP", RNAPField.getText());
            }
            catch(Exception e) {
                System.out.println(e);
            }
            gene.getGeneticSystem().fireSystemStateChange();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RNAPField;
    private javax.swing.JLabel end;
    private javax.swing.JTextField endField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField kTranscriptionField;
    private javax.swing.JTextField kTranslationField;
    private javax.swing.JTextField proteinField;
    private javax.swing.JTextField rnaField;
    private javax.swing.JTextField startField;
    private javax.swing.JLabel startLabel;
    // End of variables declaration//GEN-END:variables

}