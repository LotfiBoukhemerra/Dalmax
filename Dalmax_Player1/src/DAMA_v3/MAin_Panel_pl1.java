
package DAMA_v3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author BOUKHEMERRA LOTFI
 */
public class MAin_Panel_pl1 extends javax.swing.JFrame {
    
    private final ImageIcon X = new ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2_min.png"));
    private final ImageIcon O = new ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1_min.png"));
    private final ImageIcon TURN_LIGHT = new ImageIcon(getClass().getResource("/DAMA_v3/turnLight.png"));
    private final ImageIcon TURN_OFF = new ImageIcon(getClass().getResource("/DAMA_v3/turnOff.png"));
    static ServerSocket svr;
    static Socket con;
    static DataInputStream input;
    static DataOutputStream output;
    static JButton move,button_old,button_hide;
    Point case_new,case_old;
    static int cpt;
    static int cpt_move = 0;
    int cpt_start=1;
    static int e,f,g,h,i,j,t1,t2;
    static String player, player2;
    static String [][] Matrix ={{"","o","","o","","o","","o"},
                         {"o","","o","","o","","o",""},
                         {"","o","","o","","o","","o"},
                         {"","","","","","","",""},
                         {"","","","","","","",""},
                         {"x","","x","","x","","x",""},
                         {"","x","","x","","x","","x"},
                         {"x","","x","","x","","x",""} };
    
 
    public MAin_Panel_pl1() {
        initComponents();
        player2 = "";
        selected.setVisible(false);
        cpt = new Random().nextInt(200);
        if (cpt % 2 == 0) {
            jLabel4.setIcon(O);
            player = "o";
            jLabelTurn.setIcon(TURN_OFF);
        } else {
            jLabel4.setIcon(X);
            player = "x";
            jLabelTurn.setIcon(TURN_LIGHT);
        }
//        new Thread() {
//            @Override
//            public void run() {
//                //try {
//                while (true) {
//                    //player2 = input.readUTF();
//                    if (player2.equals("on2")) {
//                        //player2 = input.readUTF();
//                        System.out.println(player2);
//                        e = Integer.parseInt(player2.substring(0, 1));
//                        f = Integer.parseInt(player2.substring(1, 2));
//                        g = Integer.parseInt(player2.substring(2, 3));
//                        h = Integer.parseInt(player2.substring(3, 4));
//                        hide_btn(g, h).setIcon(hide_btn(e, f).getIcon());// new case
//                        button_hide.setIcon(null);// old case
//                        Matrix[g][h] = "O";
//                        Matrix[e][f] = "";
//                        turn_of();
//                    }
//                }
//                //} catch (IOException ex) {
//                //   Logger.getLogger(MAin_Panel_pl1.class.getName()).log(Level.SEVERE, null, ex);
//                //}            
//            }
//        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (cpt % 2 == 0) {
                        jLabel4.setIcon(O);
                        jLabelTurn.setIcon(TURN_OFF);
                        player = "o";
                    } else {
                        jLabel4.setIcon(X);
                        jLabelTurn.setIcon(TURN_LIGHT);
                        player = "x";
                    }

                }
            }
        }.start();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        selected = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelTurn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("player 1");
        setMinimumSize(new java.awt.Dimension(563, 590));
        setResizable(false);
        setSize(new java.awt.Dimension(562, 740));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(560, 560));
        jPanel1.setMinimumSize(new java.awt.Dimension(560, 560));
        jPanel1.setPreferredSize(new java.awt.Dimension(562, 700));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 0, 70, 70);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 0, 70, 70);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(350, 0, 70, 70);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(490, 0, 70, 70);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(0, 70, 70, 70);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(140, 70, 70, 70);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(280, 70, 70, 70);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(420, 70, 70, 70);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(70, 140, 70, 70);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(210, 140, 70, 70);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(350, 140, 70, 70);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_1.png"))); // NOI18N
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(490, 140, 70, 70);

        jButton13.setContentAreaFilled(false);
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(0, 210, 70, 70);

        jButton14.setContentAreaFilled(false);
        jButton14.setFocusable(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(140, 210, 70, 70);

        jButton15.setContentAreaFilled(false);
        jButton15.setFocusable(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(280, 210, 70, 70);

        jButton16.setContentAreaFilled(false);
        jButton16.setFocusable(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(420, 210, 70, 70);

        jButton17.setContentAreaFilled(false);
        jButton17.setFocusable(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(70, 280, 70, 70);

        jButton18.setContentAreaFilled(false);
        jButton18.setFocusable(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(210, 280, 70, 70);

        jButton19.setContentAreaFilled(false);
        jButton19.setFocusable(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(350, 280, 70, 70);

        jButton20.setContentAreaFilled(false);
        jButton20.setFocusable(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(490, 280, 70, 70);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton21.setContentAreaFilled(false);
        jButton21.setFocusable(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(0, 350, 70, 70);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton22.setContentAreaFilled(false);
        jButton22.setFocusable(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);
        jButton22.setBounds(140, 350, 70, 70);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton23.setContentAreaFilled(false);
        jButton23.setFocusable(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);
        jButton23.setBounds(280, 350, 70, 70);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton24.setContentAreaFilled(false);
        jButton24.setFocusable(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);
        jButton24.setBounds(420, 350, 70, 70);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton25.setContentAreaFilled(false);
        jButton25.setFocusable(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25);
        jButton25.setBounds(70, 420, 70, 70);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton26.setContentAreaFilled(false);
        jButton26.setFocusable(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);
        jButton26.setBounds(210, 420, 70, 70);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton27.setContentAreaFilled(false);
        jButton27.setFocusable(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27);
        jButton27.setBounds(350, 420, 70, 70);

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton28.setContentAreaFilled(false);
        jButton28.setFocusable(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28);
        jButton28.setBounds(490, 420, 70, 70);

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton29.setContentAreaFilled(false);
        jButton29.setFocusable(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton29);
        jButton29.setBounds(0, 490, 70, 70);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton30.setContentAreaFilled(false);
        jButton30.setFocusable(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30);
        jButton30.setBounds(140, 490, 70, 70);

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton31.setContentAreaFilled(false);
        jButton31.setFocusable(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31);
        jButton31.setBounds(280, 490, 70, 70);

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_2.png"))); // NOI18N
        jButton32.setContentAreaFilled(false);
        jButton32.setFocusable(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32);
        jButton32.setBounds(420, 490, 70, 70);

        selected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/Gamer_5.png"))); // NOI18N
        selected.setText("jLabel2");
        jPanel1.add(selected);
        selected.setBounds(0, 350, 70, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/B_G.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 560);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/line.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 590, 530, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 650, 40, 40);

        jLabelTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTurn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAMA_v3/turnOff.png"))); // NOI18N
        jPanel1.add(jLabelTurn);
        jLabelTurn.setBounds(30, 650, 90, 40);

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        move=jButton1;
        selecte();
        save_cases(0, 1);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        move=jButton2;
        selecte();
        save_cases(0, 3);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        move=jButton3;
        selecte();
        save_cases(0, 5);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        move=jButton4;
        selecte();
        save_cases(0, 7);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
        move=jButton5;
        selecte();
        save_cases(1, 0);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        move=jButton6;
        selecte();
        save_cases(1, 2);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        move=jButton7;
        selecte();
        save_cases(1, 4);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      
        move=jButton8;
        selecte();
        save_cases(1, 6);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
        move=jButton9;
        selecte();
        save_cases(2, 1);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       
        move=jButton10;
        selecte();
        save_cases(2, 3);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       
        move=jButton11;
        selecte();
        save_cases(2, 5);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       
        move=jButton12;
        selecte();
        save_cases(2, 7);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        move=jButton13;
        selecte();
        save_cases(3, 0);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        
        move=jButton14;
        selecte();
        save_cases(3, 2);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        move=jButton15;
        selecte();
        save_cases(3, 4);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        
        move=jButton16;
        selecte();
        save_cases(3, 6);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       
        move=jButton17;
        selecte();
        save_cases(4, 1);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       
        move=jButton18;
        selecte();
        save_cases(4, 3);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
        move=jButton19;
        selecte();
        save_cases(4, 5);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        
        move=jButton20;
        selecte();
        save_cases(4, 7);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        
        move=jButton21;
        selecte();
        save_cases(5, 0);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        
        move=jButton22;
        selecte();
        save_cases(5, 2);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       
        move=jButton23;
        selecte();
        save_cases(5, 4);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        
        move=jButton24;
        selecte();
        save_cases(5, 6);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
       
        move=jButton25;
        selecte();
        save_cases(6, 1);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
       
        move=jButton26;
        selecte();
        save_cases(6, 3);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        move=jButton27;
        selecte();
        save_cases(6, 5);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        move=jButton28;
        selecte();
        save_cases(6, 7);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        move=jButton29;
        selecte();
        save_cases(7, 0);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        move=jButton30;
        selecte();
        save_cases(7, 2);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        move=jButton31;
        selecte();
        save_cases(7, 4);
        if (cpt_move==2) {
            play_max();            
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        move=jButton32;
        selecte();
        save_cases(7, 6);
        if (cpt_move==2) {
            play_max();            
        }
        
    }//GEN-LAST:event_jButton32ActionPerformed
/********************methods******************************************/
  public void selecte(){
   selected.setLocation(move.getLocation());
        selected.setVisible(true);   
  }
/**************************************************************/
  public void can_not_move_this_case(String s){
   Toast.makeText(this, s, null, Toast.Style.NORMAL).display();  
   cpt_move=0;
   selected.setVisible(false);
  }
  /**
     * @param s************************************************************/
    public void draw_in_your_panel(String s) {
        try {
            output.writeUTF("on");
            output.writeUTF(s);
        } catch (IOException ex) {
            Logger.getLogger(MAin_Panel_pl1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**************************************************************/
  public static JButton hide_btn(int x, int y){
   
  if(x==0 && y==1){ button_hide = jButton1;}
  if(x==0 && y==3){ button_hide = jButton2;}
  if(x==0 && y==5){ button_hide = jButton3;}
  if(x==0 && y==7){ button_hide = jButton4;}
  /*********************************************/
  if(x==1 && y==0){ button_hide = jButton5;}
  if(x==1 && y==2){ button_hide = jButton6;}
  if(x==1 && y==4){ button_hide = jButton7;}
  if(x==1 && y==6){ button_hide = jButton8;}
  /*********************************************/
  if(x==2 && y==1){ button_hide = jButton9;}
  if(x==2 && y==3){ button_hide = jButton10;}
  if(x==2 && y==5){ button_hide = jButton11;}
  if(x==2 && y==7){ button_hide = jButton12;}
  /*********************************************/
  if(x==3 && y==0){ button_hide = jButton13;}
  if(x==3 && y==2){ button_hide = jButton14;}
  if(x==3 && y==4){ button_hide = jButton15;}
  if(x==3 && y==6){ button_hide = jButton16;}
  /*********************************************/
  if(x==4 && y==1){ button_hide = jButton17;}
  if(x==4 && y==3){ button_hide = jButton18;}
  if(x==4 && y==5){ button_hide = jButton19;}
  if(x==4 && y==7){ button_hide = jButton20;}
  /*********************************************/
  if(x==5 && y==0){ button_hide = jButton21;}
  if(x==5 && y==2){ button_hide = jButton22;}
  if(x==5 && y==4){ button_hide = jButton23;}
  if(x==5 && y==6){ button_hide = jButton24;}
  /*********************************************/
  if(x==6 && y==1){ button_hide = jButton25;}
  if(x==6 && y==3){ button_hide = jButton26;}
  if(x==6 && y==5){ button_hide = jButton27;}
  if(x==6 && y==7){ button_hide = jButton28;}
  /*********************************************/
  if(x==7 && y==0){ button_hide = jButton29;}
  if(x==7 && y==2){ button_hide = jButton30;}
  if(x==7 && y==4){ button_hide = jButton31;}
  if(x==7 && y==6){ button_hide = jButton32;}
  /*********************************************/
  return button_hide;
  }  
  
/**************************************************************/
    public void save_cases(int x, int y) {

        if (player.equals("x")) {
            if (cpt_move == 0) {
                if (!(Matrix[x][y].equals(""))) {
                    case_old = new Point(x, y);
                    cpt_move++;
                    button_old = move;
                }
            } else {
                if (cpt_move == 1) {
                    case_new = new Point(x, y);
                    cpt_move++;
                } else {
                    cpt_move = 0;
                }
            }
        }
    }
/**************************************************************/
  public void play_max(){      
      if (player.equals("x") && Matrix[case_old.x][case_old.y].equals("x")) {         
          if (case_old.y == 0) {
              if (case_new.x == case_old.x - 1 && case_new.y == case_old.y + 1 && Matrix[case_new.x][case_new.y].equals("")) {
                  move.setIcon(button_old.getIcon());
                  Matrix[case_new.x][case_new.y] = "x";
                  button_old.setIcon(null);
                  Matrix[case_old.x][case_old.y] = "";
                  selected.setVisible(false);
                  draw_in_your_panel(String.valueOf(case_old.x)+String.valueOf(case_old.y)+String.valueOf(case_new.x)+String.valueOf(case_new.y));
                  //show_Matrix_Consol();
                  turn_of();
              }
              /*******************eating******************************************/
              if (case_new.x == case_old.x - 2 && case_new.y == case_old.y + 2 && Matrix[case_old.x - 1][case_old.y + 1].equals("o") && Matrix[case_old.x][case_old.y].equals("x")) {
                  move.setIcon(button_old.getIcon());
                  Matrix[case_new.x][case_new.y] = "x";
                  button_old.setIcon(null);
                  Matrix[case_old.x][case_old.y] = "";
                  Matrix[case_old.x - 1][case_old.y + 1] = "";
                  hide_btn(case_old.x - 1, case_old.y + 1).setIcon(null);
                  selected.setVisible(false);
                  draw_in_your_panel(String.valueOf(case_old.x)+String.valueOf(case_old.y)+String.valueOf(case_new.x)+String.valueOf(case_new.y)+String.valueOf(case_old.x - 1)+String.valueOf(case_old.y + 1));
                  //show_Matrix_Consol();
                  turn_of();
                  // يأكل من على يمينه
              }
          } else {
              if (case_old.y == 7) {
                  if (case_new.x == case_old.x - 1 && case_new.y == case_old.y - 1 && Matrix[case_new.x][case_new.y].equals("")) {

                      move.setIcon(button_old.getIcon());
                      Matrix[case_new.x][case_new.y] = "x";
                      button_old.setIcon(null);
                      Matrix[case_old.x][case_old.y] = "";
                      selected.setVisible(false);
                      draw_in_your_panel(String.valueOf(case_old.x)+String.valueOf(case_old.y)+String.valueOf(case_new.x)+String.valueOf(case_new.y));
                      //show_Matrix_Consol();
                      turn_of();
                  }
                   /*******************eating******************************/
                  if (case_new.x == case_old.x - 2 && case_new.y == case_old.y - 2 && Matrix[case_old.x - 1][case_old.y - 1].equals("o") && Matrix[case_old.x][case_old.y].equals("x")) {
                      move.setIcon(button_old.getIcon());
                      Matrix[case_new.x][case_new.y] = "x";
                      button_old.setIcon(null);
                      Matrix[case_old.x][case_old.y] = "";
                      Matrix[case_old.x - 1][case_old.y - 1] = "";
                      hide_btn(case_old.x - 1, case_old.y - 1).setIcon(null);
                      selected.setVisible(false);
                      draw_in_your_panel(String.valueOf(case_old.x)+String.valueOf(case_old.y)+String.valueOf(case_new.x)+String.valueOf(case_new.y)+String.valueOf(case_old.x - 1)+String.valueOf(case_old.y - 1));
                      //show_Matrix_Consol();
                      turn_of();
                      // يأكل من على يساره
                  }
              }else {
                  if (case_new.x == case_old.x - 1 && case_new.y == case_old.y + 1 && Matrix[case_new.x][case_new.y].equals("") &&  Matrix[case_old.x][case_old.y].equals("x") ) {
                      move.setIcon(button_old.getIcon());
                      Matrix[case_new.x][case_new.y] = "x";
                      button_old.setIcon(null);
                      Matrix[case_old.x][case_old.y] = "";
                      selected.setVisible(false);
                      draw_in_your_panel(String.valueOf(case_old.x)+String.valueOf(case_old.y)+String.valueOf(case_new.x)+String.valueOf(case_new.y));
                      //show_Matrix_Consol();
                      turn_of();
                  }
                  if (case_new.x == case_old.x - 1 && case_new.y == case_old.y - 1 && Matrix[case_new.x][case_new.y].equals("") &&  Matrix[case_old.x][case_old.y].equals("x")) {
                      move.setIcon(button_old.getIcon());
                      Matrix[case_new.x][case_new.y] = "x";
                      button_old.setIcon(null);
                      Matrix[case_old.x][case_old.y] = "";
                      selected.setVisible(false);
                      draw_in_your_panel(String.valueOf(case_old.x)+String.valueOf(case_old.y)+String.valueOf(case_new.x)+String.valueOf(case_new.y));
                      //show_Matrix_Consol();
                      turn_of();
                  }
                  /*******************eating******************************/
                  if (case_new.x == case_old.x - 2 && case_new.y == case_old.y - 2 && Matrix[case_old.x - 1][case_old.y - 1].equals("o") && Matrix[case_old.x][case_old.y].equals("x")) {
                      move.setIcon(button_old.getIcon());
                      Matrix[case_new.x][case_new.y] = "x";
                      button_old.setIcon(null);
                      Matrix[case_old.x][case_old.y] = "";
                      Matrix[case_old.x - 1][case_old.y - 1] = "";
                      hide_btn(case_old.x - 1, case_old.y - 1).setIcon(null);
                      selected.setVisible(false);
                      draw_in_your_panel(String.valueOf(case_old.x)+String.valueOf(case_old.y)+String.valueOf(case_new.x)+String.valueOf(case_new.y)+String.valueOf(case_old.x - 1)+String.valueOf(case_old.y - 1));
                      //show_Matrix_Consol();
                      turn_of();
                      // يأكل من على يساره
                  }
                  if (case_new.x == case_old.x - 2 && case_new.y == case_old.y + 2 && Matrix[case_old.x - 1][case_old.y + 1].equals("o") && Matrix[case_old.x][case_old.y].equals("x")) {
                      move.setIcon(button_old.getIcon());
                      Matrix[case_new.x][case_new.y] = "x";
                      button_old.setIcon(null);
                      Matrix[case_old.x][case_old.y] = "";
                      Matrix[case_old.x - 1][case_old.y + 1] = "";
                      hide_btn(case_old.x - 1, case_old.y + 1).setIcon(null);
                      selected.setVisible(false);
                      draw_in_your_panel(String.valueOf(case_old.x)+String.valueOf(case_old.y)+String.valueOf(case_new.x)+String.valueOf(case_new.y)+String.valueOf(case_old.x - 1)+String.valueOf(case_old.y + 1));
                      //show_Matrix_Consol();
                      turn_of();
                      // يأكل من على يمينه
                  }    
              }     
          }          
          cpt_move = 0;      
      }
/*********************************** prat of player O *********************************************//*********************************** prat of player O *********************************************/
/**************************************************************************************************/      
      
//      if (player.equals("O")) {
//          if(case_old.y==0){
//              
//              if(case_new.X == case_old.X+1 && case_new.y == case_old.y+1 && Matrix[case_new.X][case_new.y].equals("")){      
//                  move.setIcon(button_old.getIcon());
//                  Matrix[case_new.X][case_new.y]="O";
//                  button_old.setIcon(null);
//                  Matrix[case_old.X][case_old.y]="";
//                  selected.setVisible(false);
//                  show_Matrix_Consol();                  
//                  turn_of();
//              }
//              /*******************eating******************************/
//               if (case_new.X == case_old.X + 2 && case_new.y == case_old.y + 2 && Matrix[case_old.X + 1][case_old.y + 1].equals("X") && Matrix[case_old.X][case_old.y].equals("O")) {
//                  move.setIcon(button_old.getIcon());
//                  Matrix[case_new.X][case_new.y] = "O";
//                  button_old.setIcon(null);
//                  Matrix[case_old.X][case_old.y] = "";
//                  Matrix[case_old.X + 1][case_old.y + 1] = "";
//                  hide_btn(case_old.X + 1, case_old.y + 1).setIcon(null);
//                  selected.setVisible(false);
//                  show_Matrix_Consol();
//                  turn_of();
//                  // يأكل من على يمينه
//              }
//          } else {
//              if (case_old.y == 7) {
//                  if (case_new.X == case_old.X + 1 && case_new.y == case_old.y - 1 && Matrix[case_new.X][case_new.y].equals("")) {
//
//                      move.setIcon(button_old.getIcon());
//                      Matrix[case_new.X][case_new.y] = "O";
//                      button_old.setIcon(null);
//                      Matrix[case_old.X][case_old.y] = "";
//                      selected.setVisible(false);
//                      show_Matrix_Consol();
//                      turn_of();
//                  }
//                  /*******************eating******************************/
//                  if (case_new.X == case_old.X + 2 && case_new.y == case_old.y - 2 && Matrix[case_old.X + 1][case_old.y - 1].equals("X") && Matrix[case_old.X][case_old.y].equals("O")) {
//                      move.setIcon(button_old.getIcon());
//                      Matrix[case_new.X][case_new.y] = "O";
//                      button_old.setIcon(null);
//                      Matrix[case_old.X][case_old.y] = "";
//                      Matrix[case_old.X + 1][case_old.y - 1] = "";
//                      hide_btn(case_old.X + 1, case_old.y - 1).setIcon(null);
//                      selected.setVisible(false);
//                      show_Matrix_Consol();
//                      turn_of();
//                      // يأكل من على يساره
//                  }
//              }else{
//                  if ( case_new.X == case_old.X + 1 && case_new.y == case_old.y + 1 && Matrix[case_new.X][case_new.y].equals("") &&  Matrix[case_old.X][case_old.y].equals("O")) {
//                      move.setIcon(button_old.getIcon());
//                      Matrix[case_new.X][case_new.y] = "O";
//                      button_old.setIcon(null);
//                      Matrix[case_old.X][case_old.y] = "";
//                      selected.setVisible(false);
//                      show_Matrix_Consol();
//                      turn_of();                     
//                  }
//                  if (case_new.X == case_old.X + 1 && case_new.y == case_old.y - 1 && Matrix[case_new.X][case_new.y].equals("") &&  Matrix[case_old.X][case_old.y].equals("O")) {
//                      move.setIcon(button_old.getIcon());
//                      Matrix[case_new.X][case_new.y] = "O";
//                      button_old.setIcon(null);
//                      Matrix[case_old.X][case_old.y] = "";
//                      selected.setVisible(false);
//                      show_Matrix_Consol();
//                      turn_of();                     
//                  }
//                  /*******************eating******************************/
//                  if (case_new.X == case_old.X + 2 && case_new.y == case_old.y - 2 && Matrix[case_old.X + 1][case_old.y - 1].equals("X") && Matrix[case_old.X][case_old.y].equals("O")) {
//                      move.setIcon(button_old.getIcon());
//                      Matrix[case_new.X][case_new.y] = "O";
//                      button_old.setIcon(null);
//                      Matrix[case_old.X][case_old.y] = "";
//                      Matrix[case_old.X + 1][case_old.y - 1] = "";
//                      hide_btn(case_old.X + 1, case_old.y - 1).setIcon(null);
//                      selected.setVisible(false);
//                      show_Matrix_Consol();
//                      turn_of();
//                      // يأكل من على يساره
//                  }
//                  if (case_new.X == case_old.X + 2 && case_new.y == case_old.y + 2 && Matrix[case_old.X + 1][case_old.y + 1].equals("X") && Matrix[case_old.X][case_old.y].equals("O")) {
//                      move.setIcon(button_old.getIcon());
//                      Matrix[case_new.X][case_new.y] = "O";
//                      button_old.setIcon(null);
//                      Matrix[case_old.X][case_old.y] = "";
//                      Matrix[case_old.X + 1][case_old.y + 1] = "";
//                      hide_btn(case_old.X + 1, case_old.y + 1).setIcon(null);
//                      selected.setVisible(false);
//                      show_Matrix_Consol();
//                      turn_of();
//                      // يأكل من على يمينه
//                  }    
//             }
//          }        
//          cpt_move=0;
//      }
   
  }/**end play max*/  
 /**************************************************************/ 
    public void turn_of() {

        if (++cpt % 2 == 0) {
            jLabel4.setIcon(O);
            jLabelTurn.setIcon(TURN_OFF);
            player = "o";
        } else {
            jLabel4.setIcon(X);
            jLabelTurn.setIcon(TURN_LIGHT);
            player = "x";
        }
    } 
/********** Display *****************************************************/ 	  	  
    void show_Matrix_Consol() {
        // هذه المسثود تقوم بإظهار رقعة اللعب في شاشة الدوس
        // this Method is Showing the GamePanel in The Console.
        System.out.printf("%3d %1d %1d %1d %1d %1d %1d %1d\n", 0, 1, 2, 3, 4, 5, 6, 7);
        System.out.printf(" +-+-+-+-+-+-+-+-+\n");
        for (int i = 0; i < Matrix.length; i++) {
            System.out.printf("%d|%1s|%1s|%1s|%1s|%1s|%1s|%1s|%1s| \n", i, Matrix[i][0], Matrix[i][1], Matrix[i][2],Matrix[i][3],Matrix[i][4],Matrix[i][5],Matrix[i][6],Matrix[i][7]);
            System.out.printf(" +-+-+-+-+-+-+-+-+\n");
        }
    }// end show_Matrix_Consol.
    
/*****************************main******************************/
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAin_Panel_pl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAin_Panel_pl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAin_Panel_pl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAin_Panel_pl1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAin_Panel_pl1().setVisible(true);
            }
        });        
        try {
            svr = new ServerSocket(5000);
            con = svr.accept();
            input = new DataInputStream(con.getInputStream());
            output = new DataOutputStream(con.getOutputStream());
            output.writeInt(cpt);
            while (true) {
                player2 = input.readUTF();
                if (player2.equals("on2")) {
                    player2 = input.readUTF();
                    cpt = input.readInt();
                    e = Integer.parseInt(player2.substring(0, 1));
                    f = Integer.parseInt(player2.substring(1, 2));
                    g = Integer.parseInt(player2.substring(2, 3));
                    h = Integer.parseInt(player2.substring(3, 4));                   
                    hide_btn(g, h).setIcon(hide_btn(e, f).getIcon());// new case
                    button_hide.setIcon(null);// old case
                    Matrix[g][h] = "o";
                    Matrix[e][f] = "";
                    if (player2.length() == 6) {
                        i = Integer.parseInt(player2.substring(4, 5));
                        j = Integer.parseInt(player2.substring(5, 6));
                        hide_btn(i, j).setIcon(null);// case which eating
                        Matrix[i][j] = "";
                    }/** end if 2*/
                }/** end if 1*/
            }
        } catch (IOException ex) {
            Logger.getLogger(MAin_Panel_pl1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton10;
    private static javax.swing.JButton jButton11;
    private static javax.swing.JButton jButton12;
    private static javax.swing.JButton jButton13;
    private static javax.swing.JButton jButton14;
    private static javax.swing.JButton jButton15;
    private static javax.swing.JButton jButton16;
    private static javax.swing.JButton jButton17;
    private static javax.swing.JButton jButton18;
    private static javax.swing.JButton jButton19;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton20;
    private static javax.swing.JButton jButton21;
    private static javax.swing.JButton jButton22;
    private static javax.swing.JButton jButton23;
    private static javax.swing.JButton jButton24;
    private static javax.swing.JButton jButton25;
    private static javax.swing.JButton jButton26;
    private static javax.swing.JButton jButton27;
    private static javax.swing.JButton jButton28;
    private static javax.swing.JButton jButton29;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton30;
    private static javax.swing.JButton jButton31;
    private static javax.swing.JButton jButton32;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton6;
    private static javax.swing.JButton jButton7;
    private static javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTurn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel selected;
    // End of variables declaration//GEN-END:variables
}
