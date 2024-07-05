/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package joguinhomuitoloco;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.util.Random;
import static joguinhomuitoloco.TelaInicial.InserirIcone;


/**
 *
 * @author gabri
 */
public class TelaJogo extends javax.swing.JFrame {
            boolean selecionado=false;
            boolean selecionado2=false;
            int btnVal=0;//variavel que recebe o valor do botao selecionado
            int x,y;//variaveis que vao ser usadas para encontrar o valor de cada botao de acordo com sua posicao na matriz
            int []ArmzBtn= new int[3];//armazena qual botao foi clicado
            int [][]ArmzPos=new int[2][2];//Armazena a posicao para comparar e saber se duas imagens iguais foram clicadas
            int pontos=0;//pontuação
            

             int [][] posicoes = new int[4][4];
 
    public TelaJogo() {
        initComponents();
        InserirIcone(this);
        
        
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
        jPanel1 = new javax.swing.JPanel();
        iml2 = new javax.swing.JLabel();
        iml4 = new javax.swing.JLabel();
        iml5 = new javax.swing.JLabel();
        iml7 = new javax.swing.JLabel();
        iml8 = new javax.swing.JLabel();
        iml6 = new javax.swing.JLabel();
        iml12 = new javax.swing.JLabel();
        iml16 = new javax.swing.JLabel();
        iml13 = new javax.swing.JLabel();
        iml15 = new javax.swing.JLabel();
        iml11 = new javax.swing.JLabel();
        iml10 = new javax.swing.JLabel();
        iml14 = new javax.swing.JLabel();
        iml9 = new javax.swing.JLabel();
        iml1 = new javax.swing.JLabel();
        iml3 = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Jogo em Memória dos Professores");
        jLabel1.setToolTipText("");

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        iml2.setText("2");
        iml2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml2MouseClicked(evt);
            }
        });

        iml4.setText("4");
        iml4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml4MouseClicked(evt);
            }
        });

        iml5.setText("5");
        iml5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml5MouseClicked(evt);
            }
        });

        iml7.setText("7");
        iml7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml7MouseClicked(evt);
            }
        });

        iml8.setText("8");
        iml8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml8MouseClicked(evt);
            }
        });

        iml6.setText("6");
        iml6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml6MouseClicked(evt);
            }
        });

        iml12.setText("12");
        iml12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml12MouseClicked(evt);
            }
        });

        iml16.setText("16");
        iml16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml16MouseClicked(evt);
            }
        });

        iml13.setText("13");
        iml13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml13MouseClicked(evt);
            }
        });

        iml15.setText("15");
        iml15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml15MouseClicked(evt);
            }
        });

        iml11.setText("11");
        iml11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml11MouseClicked(evt);
            }
        });

        iml10.setText("10");
        iml10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml10MouseClicked(evt);
            }
        });

        iml14.setText("14");
        iml14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml14MouseClicked(evt);
            }
        });

        iml9.setText("9");
        iml9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml9MouseClicked(evt);
            }
        });

        iml1.setText("1");
        iml1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml1MouseClicked(evt);
            }
        });

        iml3.setText("3");
        iml3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iml3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iml5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iml6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(iml7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iml1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iml2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iml3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iml4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iml8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(iml9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iml10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iml11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iml13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iml14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iml15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iml12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iml16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iml2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iml4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iml1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iml3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iml5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iml7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iml6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iml8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iml10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iml11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iml12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iml9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iml13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iml15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iml14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iml16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblPontos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        lblPontos.setText("Pontuação:0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblPontos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPontos)
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Jogo em Memória dos Professores");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iml13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml13MouseClicked
        btnVal=13;
        x=3;
        y=0;
    }//GEN-LAST:event_iml13MouseClicked

    private void iml14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml14MouseClicked
        btnVal=14;
        x=3;
        y=1;
    }//GEN-LAST:event_iml14MouseClicked

    private void iml15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml15MouseClicked
        btnVal=15;
        x=3;
        y=2;
    }//GEN-LAST:event_iml15MouseClicked

    private void iml16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml16MouseClicked
        btnVal=16;
        x=3;
        y=3;
    }//GEN-LAST:event_iml16MouseClicked

    private void iml12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml12MouseClicked
        btnVal=12;
        x=2;
        y=3;
    }//GEN-LAST:event_iml12MouseClicked

    private void iml11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml11MouseClicked
        btnVal=11;
        x=2;
        y=2;
    }//GEN-LAST:event_iml11MouseClicked

    private void iml10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml10MouseClicked
        btnVal=10;
        x=2;
        y=1;
    }//GEN-LAST:event_iml10MouseClicked

    private void iml9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml9MouseClicked
        btnVal=9;
        x=2;
        y=0;
    }//GEN-LAST:event_iml9MouseClicked

    private void iml5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml5MouseClicked
        btnVal=5;
        x=1;
        y=0;
    }//GEN-LAST:event_iml5MouseClicked

    private void iml6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml6MouseClicked
        btnVal=6;
        x=1;
        y=1;
    }//GEN-LAST:event_iml6MouseClicked

    private void iml7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml7MouseClicked
        btnVal=7;
        x=1;
        y=2;
    }//GEN-LAST:event_iml7MouseClicked

    private void iml8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml8MouseClicked
        btnVal=8;
        x=1;
        y=3;
    }//GEN-LAST:event_iml8MouseClicked

    private void iml4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml4MouseClicked
        btnVal=4;
        x=0;
        y=3;
    }//GEN-LAST:event_iml4MouseClicked

    private void iml2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml2MouseClicked
        btnVal=3;
        x=0;
        y=2;
    }//GEN-LAST:event_iml2MouseClicked

    private void iml1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iml1MouseClicked

    private void iml3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iml3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iml3MouseClicked

    
    public void AtribuiPosicao(){
/*
barreto-1
caio-2
ed-3
everton-4
floriano-5
mao-6
meira-7
wendel-8
*/
        Random gerador = new Random();       
            for (int p = 1; p <= 8; p++) {
                for (int pos = 0; pos < 2; pos++) {
                    int tempPosX, tempPosY;
                    do {
                        tempPosX = gerador.nextInt(4);
                        tempPosY = gerador.nextInt(4);
                    } while (posicoes[tempPosX][tempPosY] != 0);
                    posicoes[tempPosX][tempPosY] = p;
                }
        }
    }
    private void mostrarMatriz(){
    for(int x=0;x<=3;x++){
         for(int y=0;y<=3;y++){
             System.out.println(posicoes[x][y]);}
    }
    }
    public void atribuirImagem(){
        if (!selecionado) {
        selecionado = true;
        ArmzBtn[0] = btnVal;
        ArmzPos[0][0] = x;
        ArmzPos[0][1] = y;
    } else {
        selecionado2 = true;
        ArmzBtn[1] = btnVal;
        ArmzPos[1][0] = x;
        ArmzPos[1][1] = y;
    }

    if (selecionado2) {
        ComparaImg();
        selecionado = false;
        selecionado2 = false;
    } else {
        javax.swing.JLabel label = getLabelByBtn(btnVal);
        String imageName = getImageNameByPos(posicoes[x][y]);
        label.setIcon(resizeImage("/imagens/" + imageName, label));
    }
}

private String getImageNameByPos(int pos) {
    switch (pos) {
        case 1: return "barreto.jpeg";
        case 2: return "caio.jpeg";
        case 3: return "edivaldo.jpeg";
        case 4: return "everton.jpeg";
        case 5: return "florianoPeixoto.jpg";
        case 6: return "maoTse.jpeg";
        case 7: return "meira.jpeg";
        case 8: return "wendel.jpg";
        default: return "";
    }
            }
        
    
    public void ComparaImg(){
    if (ArmzPos[0][0] == ArmzPos[1][0] && ArmzPos[0][1] == ArmzPos[1][1]) {
        getLabelByBtn(ArmzBtn[0]).setIcon(new javax.swing.ImageIcon());
        getLabelByBtn(ArmzBtn[1]).setIcon(new javax.swing.ImageIcon());
    } else if (posicoes[ArmzPos[0][0]][ArmzPos[0][1]] == posicoes[ArmzPos[1][0]][ArmzPos[1][1]]) {
        pontos++;
        lblPontos.setText("Pontuação:" + pontos);
        for (int vtmnc = 0; vtmnc < 2; vtmnc++) {
            getLabelByBtn(ArmzBtn[vtmnc]).setVisible(false);
        }
    } else {
        for (int vsfd = 0; vsfd < 2; vsfd++) {
            getLabelByBtn(ArmzBtn[vsfd]).setIcon(new javax.swing.ImageIcon());
        }
    }
    selecionado = false;
    selecionado2 = false;
}
private javax.swing.JLabel getLabelByBtn(int btnVal) {
    switch (btnVal) {
        case 1: return iml1;
        case 2: return iml2;
        case 3: return iml3;
        case 4: return iml4;
        case 5: return iml5;
        case 6: return iml6;
        case 7: return iml7;
        case 8: return iml8;
        case 9: return iml9;
        case 10: return iml10;
        case 11: return iml11;
        case 12: return iml12;
        case 13: return iml13;
        case 14: return iml14;
        case 15: return iml15;
        case 16: return iml16;
        default: return null;
    }}

    public ImageIcon resizeImage(String imagePath, javax.swing.JLabel label) {
    ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
    Image img = icon.getImage();
    Image resizedImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
    return new ImageIcon(resizedImg);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iml1;
    private javax.swing.JLabel iml10;
    private javax.swing.JLabel iml11;
    private javax.swing.JLabel iml12;
    private javax.swing.JLabel iml13;
    private javax.swing.JLabel iml14;
    private javax.swing.JLabel iml15;
    private javax.swing.JLabel iml16;
    private javax.swing.JLabel iml2;
    private javax.swing.JLabel iml3;
    private javax.swing.JLabel iml4;
    private javax.swing.JLabel iml5;
    private javax.swing.JLabel iml6;
    private javax.swing.JLabel iml7;
    private javax.swing.JLabel iml8;
    private javax.swing.JLabel iml9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPontos;
    // End of variables declaration//GEN-END:variables
}
