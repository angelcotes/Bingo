/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo_virtual;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class View_Bingo extends javax.swing.JFrame {

    public ArrayList<Letter> arrayLetters = new ArrayList<>();
    public ArrayList<String> LetterB = new ArrayList<>();
    public ArrayList<String> LetterI = new ArrayList<>();
    public ArrayList<String> LetterN = new ArrayList<>();
    public ArrayList<String> LetterG = new ArrayList<>();
    public ArrayList<String> LetterO = new ArrayList<>();
    public Random  num = new Random();
    public int randomNum;
    public View_Bingo() {
        Generate_List_Bingo(1, 75);
        initComponents();
        RestartColors();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_text_letter = new javax.swing.JLabel();
        lbl_view_letter = new javax.swing.JLabel();
        lbl_text_num = new javax.swing.JLabel();
        lbl_view_num = new javax.swing.JLabel();
        btn_generate_num_random = new javax.swing.JButton();
        btn_restart_game = new javax.swing.JButton();
        lbl_view_num1 = new javax.swing.JLabel();
        lbl_view_num2 = new javax.swing.JLabel();
        lbl_view_num3 = new javax.swing.JLabel();
        lbl_view_num4 = new javax.swing.JLabel();
        lbl_view_num5 = new javax.swing.JLabel();
        lbl_view_num6 = new javax.swing.JLabel();
        lbl_view_num7 = new javax.swing.JLabel();
        lbl_view_num8 = new javax.swing.JLabel();
        lbl_view_num9 = new javax.swing.JLabel();
        lbl_view_num10 = new javax.swing.JLabel();
        lbl_view_num11 = new javax.swing.JLabel();
        lbl_view_num12 = new javax.swing.JLabel();
        lbl_view_num13 = new javax.swing.JLabel();
        lbl_view_num14 = new javax.swing.JLabel();
        lbl_view_num15 = new javax.swing.JLabel();
        lbl_view_num16 = new javax.swing.JLabel();
        lbl_view_num17 = new javax.swing.JLabel();
        lbl_view_num18 = new javax.swing.JLabel();
        lbl_view_num19 = new javax.swing.JLabel();
        lbl_view_num20 = new javax.swing.JLabel();
        lbl_view_num21 = new javax.swing.JLabel();
        lbl_view_num22 = new javax.swing.JLabel();
        lbl_view_num23 = new javax.swing.JLabel();
        lbl_view_num24 = new javax.swing.JLabel();
        lbl_view_num25 = new javax.swing.JLabel();
        lbl_view_num26 = new javax.swing.JLabel();
        lbl_view_num27 = new javax.swing.JLabel();
        lbl_view_num28 = new javax.swing.JLabel();
        lbl_view_num29 = new javax.swing.JLabel();
        lbl_view_num30 = new javax.swing.JLabel();
        lbl_view_num31 = new javax.swing.JLabel();
        lbl_view_num32 = new javax.swing.JLabel();
        lbl_view_num33 = new javax.swing.JLabel();
        lbl_view_num34 = new javax.swing.JLabel();
        lbl_view_num35 = new javax.swing.JLabel();
        lbl_view_num36 = new javax.swing.JLabel();
        lbl_view_num37 = new javax.swing.JLabel();
        lbl_view_num38 = new javax.swing.JLabel();
        lbl_view_num39 = new javax.swing.JLabel();
        lbl_view_num40 = new javax.swing.JLabel();
        lbl_view_num41 = new javax.swing.JLabel();
        lbl_view_num42 = new javax.swing.JLabel();
        lbl_view_num43 = new javax.swing.JLabel();
        lbl_view_num44 = new javax.swing.JLabel();
        lbl_view_num45 = new javax.swing.JLabel();
        lbl_view_num46 = new javax.swing.JLabel();
        lbl_view_num47 = new javax.swing.JLabel();
        lbl_view_num48 = new javax.swing.JLabel();
        lbl_view_num49 = new javax.swing.JLabel();
        lbl_view_num50 = new javax.swing.JLabel();
        lbl_view_num51 = new javax.swing.JLabel();
        lbl_view_num52 = new javax.swing.JLabel();
        lbl_view_num53 = new javax.swing.JLabel();
        lbl_view_num54 = new javax.swing.JLabel();
        lbl_view_num55 = new javax.swing.JLabel();
        lbl_view_num56 = new javax.swing.JLabel();
        lbl_view_num57 = new javax.swing.JLabel();
        lbl_view_num58 = new javax.swing.JLabel();
        lbl_view_num59 = new javax.swing.JLabel();
        lbl_view_num60 = new javax.swing.JLabel();
        lbl_view_num67 = new javax.swing.JLabel();
        lbl_view_num71 = new javax.swing.JLabel();
        lbl_view_num69 = new javax.swing.JLabel();
        lbl_view_num77 = new javax.swing.JLabel();
        lbl_view_num68 = new javax.swing.JLabel();
        lbl_view_num72 = new javax.swing.JLabel();
        lbl_view_num70 = new javax.swing.JLabel();
        lbl_view_num81 = new javax.swing.JLabel();
        lbl_view_num75 = new javax.swing.JLabel();
        lbl_view_num73 = new javax.swing.JLabel();
        lbl_view_num74 = new javax.swing.JLabel();
        lbl_view_num63 = new javax.swing.JLabel();
        lbl_view_num61 = new javax.swing.JLabel();
        lbl_view_num62 = new javax.swing.JLabel();
        lbl_view_num66 = new javax.swing.JLabel();
        lbl_view_num64 = new javax.swing.JLabel();
        lbl_view_num65 = new javax.swing.JLabel();
        lbl_view_num91 = new javax.swing.JLabel();
        lbl_view_num92 = new javax.swing.JLabel();
        lbl_view_num93 = new javax.swing.JLabel();
        lbl_view_num94 = new javax.swing.JLabel();
        lbl_view_num95 = new javax.swing.JLabel();
        lbl_view_num96 = new javax.swing.JLabel();
        lbl_view_num97 = new javax.swing.JLabel();
        lbl_view_num98 = new javax.swing.JLabel();
        lbl_view_num99 = new javax.swing.JLabel();
        lbl_view_num100 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_text_letter.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_text_letter.setText("Letra:");

        lbl_view_letter.setFont(new java.awt.Font("Tahoma", 0, 58)); // NOI18N

        lbl_text_num.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_text_num.setText("Número:");

        lbl_view_num.setFont(new java.awt.Font("Tahoma", 0, 58)); // NOI18N

        btn_generate_num_random.setText("Nuevo Número");
        btn_generate_num_random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generate_num_randomActionPerformed(evt);
            }
        });

        btn_restart_game.setText("Reiniciar Juego");
        btn_restart_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restart_gameActionPerformed(evt);
            }
        });

        lbl_view_num1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num1.setText("1");
        lbl_view_num1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num1.setOpaque(true);

        lbl_view_num2.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num2.setText("2");
        lbl_view_num2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num2.setOpaque(true);

        lbl_view_num3.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num3.setText("3");
        lbl_view_num3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num3.setOpaque(true);

        lbl_view_num4.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num4.setText("4");
        lbl_view_num4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num4.setOpaque(true);

        lbl_view_num5.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num5.setText("5");
        lbl_view_num5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num5.setOpaque(true);

        lbl_view_num6.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num6.setText("6");
        lbl_view_num6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num6.setOpaque(true);

        lbl_view_num7.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num7.setText("7");
        lbl_view_num7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num7.setOpaque(true);

        lbl_view_num8.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num8.setText("8");
        lbl_view_num8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num8.setOpaque(true);

        lbl_view_num9.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num9.setText("9");
        lbl_view_num9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num9.setOpaque(true);

        lbl_view_num10.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num10.setText("10");
        lbl_view_num10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num10.setOpaque(true);

        lbl_view_num11.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num11.setText("11");
        lbl_view_num11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num11.setOpaque(true);

        lbl_view_num12.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num12.setText("12");
        lbl_view_num12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num12.setOpaque(true);

        lbl_view_num13.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num13.setText("13");
        lbl_view_num13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num13.setOpaque(true);

        lbl_view_num14.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num14.setText("14");
        lbl_view_num14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num14.setOpaque(true);

        lbl_view_num15.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num15.setText("15");
        lbl_view_num15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num15.setOpaque(true);

        lbl_view_num16.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num16.setText("16");
        lbl_view_num16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num16.setOpaque(true);

        lbl_view_num17.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num17.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num17.setText("17");
        lbl_view_num17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num17.setOpaque(true);

        lbl_view_num18.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num18.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num18.setText("18");
        lbl_view_num18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num18.setOpaque(true);

        lbl_view_num19.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num19.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num19.setText("19");
        lbl_view_num19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num19.setOpaque(true);

        lbl_view_num20.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num20.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num20.setText("20");
        lbl_view_num20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num20.setOpaque(true);

        lbl_view_num21.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num21.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num21.setText("21");
        lbl_view_num21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num21.setOpaque(true);

        lbl_view_num22.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num22.setText("22");
        lbl_view_num22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num22.setOpaque(true);

        lbl_view_num23.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num23.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num23.setText("23");
        lbl_view_num23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num23.setOpaque(true);

        lbl_view_num24.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num24.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num24.setText("24");
        lbl_view_num24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num24.setOpaque(true);

        lbl_view_num25.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num25.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num25.setText("25");
        lbl_view_num25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num25.setOpaque(true);

        lbl_view_num26.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num26.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num26.setText("26");
        lbl_view_num26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num26.setOpaque(true);

        lbl_view_num27.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num27.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num27.setText("27");
        lbl_view_num27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num27.setOpaque(true);

        lbl_view_num28.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num28.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num28.setText("28");
        lbl_view_num28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num28.setOpaque(true);

        lbl_view_num29.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num29.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num29.setText("29");
        lbl_view_num29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num29.setOpaque(true);

        lbl_view_num30.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num30.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num30.setText("30");
        lbl_view_num30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num30.setOpaque(true);

        lbl_view_num31.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num31.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num31.setText("31");
        lbl_view_num31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num31.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num31.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num31.setOpaque(true);

        lbl_view_num32.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num32.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num32.setText("32");
        lbl_view_num32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num32.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num32.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num32.setOpaque(true);

        lbl_view_num33.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num33.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num33.setText("33");
        lbl_view_num33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num33.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num33.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num33.setOpaque(true);

        lbl_view_num34.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num34.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num34.setText("34");
        lbl_view_num34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num34.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num34.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num34.setOpaque(true);

        lbl_view_num35.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num35.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num35.setText("35");
        lbl_view_num35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num35.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num35.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num35.setOpaque(true);

        lbl_view_num36.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num36.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num36.setText("36");
        lbl_view_num36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num36.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num36.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num36.setOpaque(true);

        lbl_view_num37.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num37.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num37.setText("37");
        lbl_view_num37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num37.setOpaque(true);

        lbl_view_num38.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num38.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num38.setText("38");
        lbl_view_num38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num38.setOpaque(true);

        lbl_view_num39.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num39.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num39.setText("39");
        lbl_view_num39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num39.setOpaque(true);

        lbl_view_num40.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num40.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num40.setText("40");
        lbl_view_num40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num40.setOpaque(true);

        lbl_view_num41.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num41.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num41.setText("41");
        lbl_view_num41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num41.setOpaque(true);

        lbl_view_num42.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num42.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num42.setText("42");
        lbl_view_num42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num42.setOpaque(true);

        lbl_view_num43.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num43.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num43.setText("43");
        lbl_view_num43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num43.setOpaque(true);

        lbl_view_num44.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num44.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num44.setText("44");
        lbl_view_num44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num44.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num44.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num44.setOpaque(true);

        lbl_view_num45.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num45.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num45.setText("45");
        lbl_view_num45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num45.setOpaque(true);

        lbl_view_num46.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num46.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num46.setText("46");
        lbl_view_num46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num46.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num46.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num46.setOpaque(true);
        lbl_view_num46.setPreferredSize(new java.awt.Dimension(58, 58));

        lbl_view_num47.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num47.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num47.setText("47");
        lbl_view_num47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num47.setOpaque(true);

        lbl_view_num48.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num48.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num48.setText("48");
        lbl_view_num48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num48.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num48.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num48.setOpaque(true);

        lbl_view_num49.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num49.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num49.setText("49");
        lbl_view_num49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num49.setOpaque(true);

        lbl_view_num50.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num50.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num50.setText("50");
        lbl_view_num50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num50.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num50.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num50.setOpaque(true);

        lbl_view_num51.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num51.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num51.setText("51");
        lbl_view_num51.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num51.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num51.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num51.setOpaque(true);

        lbl_view_num52.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num52.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num52.setText("52");
        lbl_view_num52.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num52.setOpaque(true);

        lbl_view_num53.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num53.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num53.setText("53");
        lbl_view_num53.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num53.setOpaque(true);

        lbl_view_num54.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num54.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num54.setText("54");
        lbl_view_num54.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num54.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num54.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num54.setOpaque(true);

        lbl_view_num55.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num55.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num55.setText("55");
        lbl_view_num55.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num55.setOpaque(true);

        lbl_view_num56.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num56.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num56.setText("56");
        lbl_view_num56.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num56.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num56.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num56.setOpaque(true);

        lbl_view_num57.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num57.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num57.setText("57");
        lbl_view_num57.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num57.setOpaque(true);

        lbl_view_num58.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num58.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num58.setText("58");
        lbl_view_num58.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num58.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num58.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num58.setOpaque(true);

        lbl_view_num59.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num59.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num59.setText("59");
        lbl_view_num59.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num59.setOpaque(true);

        lbl_view_num60.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num60.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num60.setText("60");
        lbl_view_num60.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num60.setMaximumSize(new java.awt.Dimension(58, 58));
        lbl_view_num60.setMinimumSize(new java.awt.Dimension(58, 58));
        lbl_view_num60.setOpaque(true);

        lbl_view_num67.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        lbl_view_num71.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        lbl_view_num69.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num69.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num69.setText("69");
        lbl_view_num69.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num69.setOpaque(true);

        lbl_view_num77.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num77.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num77.setText("67");
        lbl_view_num77.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num77.setOpaque(true);

        lbl_view_num68.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num68.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num68.setText("68");
        lbl_view_num68.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num68.setOpaque(true);

        lbl_view_num72.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num72.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num72.setText("72");
        lbl_view_num72.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num72.setOpaque(true);

        lbl_view_num70.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num70.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num70.setText("70");
        lbl_view_num70.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num70.setOpaque(true);

        lbl_view_num81.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num81.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num81.setText("71");
        lbl_view_num81.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num81.setOpaque(true);

        lbl_view_num75.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num75.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num75.setText("75");
        lbl_view_num75.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num75.setOpaque(true);

        lbl_view_num73.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num73.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num73.setText("73");
        lbl_view_num73.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num73.setOpaque(true);

        lbl_view_num74.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num74.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num74.setText("74");
        lbl_view_num74.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num74.setOpaque(true);

        lbl_view_num63.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num63.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num63.setText("63");
        lbl_view_num63.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num63.setOpaque(true);

        lbl_view_num61.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num61.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num61.setText("61");
        lbl_view_num61.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num61.setOpaque(true);

        lbl_view_num62.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num62.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num62.setText("62");
        lbl_view_num62.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num62.setOpaque(true);

        lbl_view_num66.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num66.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num66.setText("66");
        lbl_view_num66.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num66.setOpaque(true);

        lbl_view_num64.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num64.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num64.setText("64");
        lbl_view_num64.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num64.setOpaque(true);

        lbl_view_num65.setBackground(new java.awt.Color(0, 0, 0));
        lbl_view_num65.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num65.setText("65");
        lbl_view_num65.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lbl_view_num65.setOpaque(true);

        lbl_view_num91.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num91.setText("B");

        lbl_view_num92.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num92.setText("O");

        lbl_view_num93.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num93.setText("I");

        lbl_view_num94.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num94.setText("N");

        lbl_view_num95.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num95.setText("G");

        lbl_view_num96.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num96.setText("B");

        lbl_view_num97.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num97.setText("I");

        lbl_view_num98.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num98.setText("O");

        lbl_view_num99.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num99.setText("G");

        lbl_view_num100.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_view_num100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_view_num100.setText("N");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(btn_restart_game)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_generate_num_random)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_view_num97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_view_num96, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_view_num99)
                                            .addComponent(lbl_view_num98))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_view_num46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num47))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_view_num61)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num62)))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_view_num63)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num64)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num65)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num66)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num77)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num68)
                                                .addGap(64, 64, 64))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_view_num48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num49)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num52)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num53)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num55)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num57)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num59)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl_view_num60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_view_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_view_num16, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_view_num17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lbl_view_num24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num25))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lbl_view_num69)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num70)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lbl_view_num81)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num72)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num73)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num74)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num75))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lbl_view_num26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num28)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num29)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbl_view_num30))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_view_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_view_num3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lbl_view_num4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbl_view_num14)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbl_view_num15))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lbl_text_letter)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lbl_view_letter, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(64, 64, 64)
                                                        .addComponent(lbl_text_num)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lbl_view_num, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_view_num94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_view_num31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_view_num45)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_view_num92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(lbl_view_num71, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_view_num93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_view_num100, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_view_num95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_view_num91, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(lbl_view_num67, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_text_letter)
                    .addComponent(lbl_view_letter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_text_num)
                    .addComponent(lbl_view_num, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_view_num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num91)
                    .addComponent(lbl_view_num96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num1)
                    .addComponent(lbl_view_num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num5)
                    .addComponent(lbl_view_num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num7)
                    .addComponent(lbl_view_num10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_view_num13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(lbl_view_num18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_view_num17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_view_num25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_view_num26)
                            .addComponent(lbl_view_num22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_view_num24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_view_num23)
                            .addComponent(lbl_view_num97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_view_num20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_view_num21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_view_num19)
                            .addComponent(lbl_view_num16))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_view_num93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_view_num27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_view_num28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_view_num29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_view_num30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_view_num94, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num36, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num34, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num35, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num33, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num32, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num44, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num100, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num42, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num41, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num45, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num43, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num40, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num38, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_view_num39, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_view_num71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_view_num67))
                        .addGap(119, 119, 119))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_view_num52, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num49, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num57, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num59, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num55, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num47, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num53, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num95, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num50, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num58, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num51, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num54, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num48, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num60, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_view_num56, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_view_num99, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_view_num75, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num74, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num73, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num72, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num81, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num70, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num69, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num68, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num77, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num66, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num65, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num64, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num63, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num62, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num61, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num92, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_view_num98, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generate_num_random)
                    .addComponent(btn_restart_game))
                .addGap(130, 130, 130))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbl_text_letter, lbl_text_num, lbl_view_letter, lbl_view_num});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generate_num_randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generate_num_randomActionPerformed
        try {
            if (arrayLetters.size() >= 1) {
                randomNum = num.nextInt(arrayLetters.size()); 
                Letter objLetter;
                objLetter = find(randomNum, 0);
                ViewNum(Integer.parseInt(objLetter.getNumber()));
                Thread.sleep(500);
                lbl_view_num.setText(objLetter.getNumber());
                lbl_view_letter.setText(objLetter.getLetter());
            }
            else{
                JOptionPane.showMessageDialog(null, "No hay mas número para generar. Debe reiniciar el juego","Alerta", JOptionPane.ERROR_MESSAGE);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(View_Bingo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_generate_num_randomActionPerformed

    private void btn_restart_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restart_gameActionPerformed
        arrayLetters.clear();
        Generate_List_Bingo(1, 75);
        RestartColors();
    }//GEN-LAST:event_btn_restart_gameActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(View_Bingo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Bingo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Bingo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Bingo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Bingo().setVisible(true);
            }
        });
    }

    public void Generate_List_Bingo(int start, int end){
        for (int i = start; i <= end; i++) {
            if (i <= 15) {
                arrayLetters.add(new Letter("B",String.valueOf(i)));
            }
            else if (i <= 30) {
                arrayLetters.add(new Letter("I",String.valueOf(i)));
            }
            else if (i <= 45) {
                arrayLetters.add(new Letter("N",String.valueOf(i)));
            }
            else if (i <= 60) {
                arrayLetters.add(new Letter("G",String.valueOf(i)));
            }
            else
            {
              arrayLetters.add(new Letter("O",String.valueOf(i)));  
            }
        }
    }
    public Letter find(int numToFind, int start){
        int i = 0;
        Letter objLetter = null;
        if (i == arrayLetters.size()) {
            JOptionPane.showMessageDialog(null, "No hay mas número para generar. Debe reiniciar el juego","Alerta", JOptionPane.ERROR_MESSAGE);
        }
        else{
            while(i < arrayLetters.size())
            {
                 if (i == numToFind) {
                    objLetter = new Letter(arrayLetters.get(i).getLetter(),arrayLetters.get(i).getNumber());
                    arrayLetters.remove(i);
                    break;
                }
                i = i + 1;
            }
        }
        return objLetter;
    }
    public void RestartColors(){
        
    lbl_view_num1.setBackground(Color.BLACK);
    lbl_view_num10.setBackground(Color.BLACK);
    lbl_view_num11.setBackground(Color.BLACK);
    lbl_view_num12.setBackground(Color.BLACK);
    lbl_view_num13.setBackground(Color.BLACK);
    lbl_view_num14.setBackground(Color.BLACK);
    lbl_view_num15.setBackground(Color.BLACK);
    lbl_view_num16.setBackground(Color.BLACK);
    lbl_view_num17.setBackground(Color.BLACK);
    lbl_view_num18.setBackground(Color.BLACK);
    lbl_view_num19.setBackground(Color.BLACK);
    lbl_view_num2.setBackground(Color.BLACK);
    lbl_view_num20.setBackground(Color.BLACK);
    lbl_view_num21.setBackground(Color.BLACK);
    lbl_view_num22.setBackground(Color.BLACK);
    lbl_view_num23.setBackground(Color.BLACK);
    lbl_view_num24.setBackground(Color.BLACK);
    lbl_view_num25.setBackground(Color.BLACK);
    lbl_view_num26.setBackground(Color.BLACK);
    lbl_view_num27.setBackground(Color.BLACK);
    lbl_view_num28.setBackground(Color.BLACK);
    lbl_view_num29.setBackground(Color.BLACK);
    lbl_view_num3.setBackground(Color.BLACK);
    lbl_view_num30.setBackground(Color.BLACK);
    lbl_view_num31.setBackground(Color.BLACK);
    lbl_view_num32.setBackground(Color.BLACK);
    lbl_view_num33.setBackground(Color.BLACK);
    lbl_view_num34.setBackground(Color.BLACK);
    lbl_view_num35.setBackground(Color.BLACK);
    lbl_view_num36.setBackground(Color.BLACK);
    lbl_view_num37.setBackground(Color.BLACK);
    lbl_view_num38.setBackground(Color.BLACK);
    lbl_view_num39.setBackground(Color.BLACK);
    lbl_view_num4.setBackground(Color.BLACK);
    lbl_view_num40.setBackground(Color.BLACK);
    lbl_view_num41.setBackground(Color.BLACK);
    lbl_view_num42.setBackground(Color.BLACK);
    lbl_view_num43.setBackground(Color.BLACK);
    lbl_view_num44.setBackground(Color.BLACK);
    lbl_view_num45.setBackground(Color.BLACK);
    lbl_view_num46.setBackground(Color.BLACK);
    lbl_view_num47.setBackground(Color.BLACK);
    lbl_view_num48.setBackground(Color.BLACK);
    lbl_view_num49.setBackground(Color.BLACK);
    lbl_view_num5.setBackground(Color.BLACK);
    lbl_view_num50.setBackground(Color.BLACK);
    lbl_view_num51.setBackground(Color.BLACK);
    lbl_view_num52.setBackground(Color.BLACK);
    lbl_view_num53.setBackground(Color.BLACK);
    lbl_view_num54.setBackground(Color.BLACK);
    lbl_view_num55.setBackground(Color.BLACK);
    lbl_view_num56.setBackground(Color.BLACK);
    lbl_view_num57.setBackground(Color.BLACK);
    lbl_view_num58.setBackground(Color.BLACK);
    lbl_view_num59.setBackground(Color.BLACK);
    lbl_view_num6.setBackground(Color.BLACK);
    lbl_view_num60.setBackground(Color.BLACK);
    lbl_view_num61.setBackground(Color.BLACK);
    lbl_view_num62.setBackground(Color.BLACK);
    lbl_view_num63.setBackground(Color.BLACK);
    lbl_view_num64.setBackground(Color.BLACK);
    lbl_view_num65.setBackground(Color.BLACK);
    lbl_view_num66.setBackground(Color.BLACK);
    lbl_view_num77.setBackground(Color.BLACK);
    lbl_view_num68.setBackground(Color.BLACK);
    lbl_view_num69.setBackground(Color.BLACK);
    lbl_view_num7.setBackground(Color.BLACK);
    lbl_view_num70.setBackground(Color.BLACK);
    lbl_view_num81.setBackground(Color.BLACK);
    lbl_view_num72.setBackground(Color.BLACK);
    lbl_view_num73.setBackground(Color.BLACK);
    lbl_view_num74.setBackground(Color.BLACK);
    lbl_view_num75.setBackground(Color.BLACK);
    lbl_view_num8.setBackground(Color.BLACK);
    lbl_view_num9.setBackground(Color.BLACK);
    }
    
    public void ViewNum(int num){
        if(num == 1){
            lbl_view_num1.setBackground(Color.WHITE);
        }
        else if(num == 2){
            lbl_view_num2.setBackground(Color.WHITE);
        }
        else if(num == 3){
            lbl_view_num3.setBackground(Color.WHITE);
        }
        else if(num == 4){
            lbl_view_num4.setBackground(Color.WHITE);
        }
        else if(num == 5){
            lbl_view_num5.setBackground(Color.WHITE);
        }
        else if(num == 6){
            lbl_view_num6.setBackground(Color.WHITE);
        }
        else if(num == 7){
            lbl_view_num7.setBackground(Color.WHITE);
        }
        else if(num == 8){
            lbl_view_num8.setBackground(Color.WHITE);
        }
        else if(num == 9){
            lbl_view_num9.setBackground(Color.WHITE);
        }
        else if(num == 10){
            lbl_view_num10.setBackground(Color.WHITE);
        }
        else if(num == 11){
            lbl_view_num11.setBackground(Color.WHITE);
        }
        else if(num == 12){
            lbl_view_num12.setBackground(Color.WHITE);
        }
        else if(num == 13){
            lbl_view_num13.setBackground(Color.WHITE);
        }
        else if(num == 14){
            lbl_view_num14.setBackground(Color.WHITE);
        }
        else if(num == 15){
            lbl_view_num15.setBackground(Color.WHITE);
        }
        else if(num == 16){
            lbl_view_num16.setBackground(Color.WHITE);
        }
        else if(num == 17){
            lbl_view_num17.setBackground(Color.WHITE);
        }
        else if(num == 18){
            lbl_view_num18.setBackground(Color.WHITE);
        }
        else if(num == 19){
            lbl_view_num19.setBackground(Color.WHITE);
        }
        else if(num == 20){
            lbl_view_num20.setBackground(Color.WHITE);
        }
        else if(num == 21){
            lbl_view_num21.setBackground(Color.WHITE);
        }
        else if(num == 22){
            lbl_view_num22.setBackground(Color.WHITE);
        }
        else if(num == 23){
            lbl_view_num23.setBackground(Color.WHITE);
        }
        else if(num == 24){
            lbl_view_num24.setBackground(Color.WHITE);
        }
        else if(num == 25){
            lbl_view_num25.setBackground(Color.WHITE);
        }
        else if(num == 26){
            lbl_view_num26.setBackground(Color.WHITE);
        }
        else if(num == 27){
            lbl_view_num27.setBackground(Color.WHITE);
        }
        else if(num == 28){
            lbl_view_num28.setBackground(Color.WHITE);
        }
        else if(num == 29){
            lbl_view_num29.setBackground(Color.WHITE);
        }
        else if(num == 30){
            lbl_view_num30.setBackground(Color.WHITE);
        }
        else if(num == 31){
            lbl_view_num31.setBackground(Color.WHITE);
        }
        else if(num == 32){
            lbl_view_num32.setBackground(Color.WHITE);
        }
        else if(num == 33){
            lbl_view_num33.setBackground(Color.WHITE);
        }
        else if(num == 34){
            lbl_view_num34.setBackground(Color.WHITE);
        }
        else if(num == 35){
            lbl_view_num35.setBackground(Color.WHITE);
        }
        else if(num == 36){
            lbl_view_num36.setBackground(Color.WHITE);
        }
        else if(num == 37){
            lbl_view_num37.setBackground(Color.WHITE);
        }
        else if(num == 38){
            lbl_view_num38.setBackground(Color.WHITE);
        }
        else if(num == 39){
            lbl_view_num39.setBackground(Color.WHITE);
        }
        else if(num == 40){
            lbl_view_num40.setBackground(Color.WHITE);
        }
        else if(num == 41){
            lbl_view_num41.setBackground(Color.WHITE);
        }
        else if(num == 42){
            lbl_view_num42.setBackground(Color.WHITE);
        }
        else if(num == 43){
            lbl_view_num43.setBackground(Color.WHITE);
        }
        else if(num == 44){
            lbl_view_num44.setBackground(Color.WHITE);
        }
        else if(num == 45){
            lbl_view_num45.setBackground(Color.WHITE);
        }
        else if(num == 46){
            lbl_view_num46.setBackground(Color.WHITE);
        }
        else if(num == 47){
            lbl_view_num47.setBackground(Color.WHITE);
        }
        else if(num == 48){
            lbl_view_num48.setBackground(Color.WHITE);
        }
        else if(num == 49){
            lbl_view_num49.setBackground(Color.WHITE);
        }
        else if(num == 50){
            lbl_view_num50.setBackground(Color.WHITE);
        }
        else if(num == 51){
            lbl_view_num51.setBackground(Color.WHITE);
        }
        else if(num == 52){
            lbl_view_num52.setBackground(Color.WHITE);
        }
        else if(num == 53){
            lbl_view_num53.setBackground(Color.WHITE);
        }
        else if(num == 54){
            lbl_view_num54.setBackground(Color.WHITE);
        }
        else if(num == 55){
            lbl_view_num55.setBackground(Color.WHITE);
        }
        else if(num == 56){
            lbl_view_num56.setBackground(Color.WHITE);
        }
        else if(num == 57){
            lbl_view_num57.setBackground(Color.WHITE);
        }
        else if(num == 58){
            lbl_view_num58.setBackground(Color.WHITE);
        }
        else if(num == 59){
            lbl_view_num59.setBackground(Color.WHITE);
        }
        else if(num == 60){
            lbl_view_num60.setBackground(Color.WHITE);
        }
        else if(num == 61){
            lbl_view_num61.setBackground(Color.WHITE);
        }
        else if(num == 62){
            lbl_view_num62.setBackground(Color.WHITE);
        }
        else if(num == 63){
            lbl_view_num63.setBackground(Color.WHITE);
        }
        else if(num == 64){
            lbl_view_num64.setBackground(Color.WHITE);
        }
        else if(num == 65){
            lbl_view_num65.setBackground(Color.WHITE);
        }
        else if(num == 66){
            lbl_view_num66.setBackground(Color.WHITE);
        }
        else if(num == 67){
            lbl_view_num77.setBackground(Color.WHITE);
        }
        else if(num == 68){
            lbl_view_num68.setBackground(Color.WHITE);
        }
        else if(num == 69){
            lbl_view_num69.setBackground(Color.WHITE);
        }
        else if(num == 70){
            lbl_view_num70.setBackground(Color.WHITE);
        }
        else if(num == 71){
            lbl_view_num81.setBackground(Color.WHITE);
        }
        else if(num == 72){
            lbl_view_num72.setBackground(Color.WHITE);
        }
        else if(num == 73){
            lbl_view_num73.setBackground(Color.WHITE);
        }
        else if(num == 74){
            lbl_view_num74.setBackground(Color.WHITE);
        }
        else if(num == 75){
            lbl_view_num75.setBackground(Color.WHITE);
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generate_num_random;
    private javax.swing.JButton btn_restart_game;
    private javax.swing.JLabel lbl_text_letter;
    private javax.swing.JLabel lbl_text_num;
    private javax.swing.JLabel lbl_view_letter;
    private javax.swing.JLabel lbl_view_num;
    private javax.swing.JLabel lbl_view_num1;
    private javax.swing.JLabel lbl_view_num10;
    private javax.swing.JLabel lbl_view_num100;
    private javax.swing.JLabel lbl_view_num11;
    private javax.swing.JLabel lbl_view_num12;
    private javax.swing.JLabel lbl_view_num13;
    private javax.swing.JLabel lbl_view_num14;
    private javax.swing.JLabel lbl_view_num15;
    private javax.swing.JLabel lbl_view_num16;
    private javax.swing.JLabel lbl_view_num17;
    private javax.swing.JLabel lbl_view_num18;
    private javax.swing.JLabel lbl_view_num19;
    private javax.swing.JLabel lbl_view_num2;
    private javax.swing.JLabel lbl_view_num20;
    private javax.swing.JLabel lbl_view_num21;
    private javax.swing.JLabel lbl_view_num22;
    private javax.swing.JLabel lbl_view_num23;
    private javax.swing.JLabel lbl_view_num24;
    private javax.swing.JLabel lbl_view_num25;
    private javax.swing.JLabel lbl_view_num26;
    private javax.swing.JLabel lbl_view_num27;
    private javax.swing.JLabel lbl_view_num28;
    private javax.swing.JLabel lbl_view_num29;
    private javax.swing.JLabel lbl_view_num3;
    private javax.swing.JLabel lbl_view_num30;
    private javax.swing.JLabel lbl_view_num31;
    private javax.swing.JLabel lbl_view_num32;
    private javax.swing.JLabel lbl_view_num33;
    private javax.swing.JLabel lbl_view_num34;
    private javax.swing.JLabel lbl_view_num35;
    private javax.swing.JLabel lbl_view_num36;
    private javax.swing.JLabel lbl_view_num37;
    private javax.swing.JLabel lbl_view_num38;
    private javax.swing.JLabel lbl_view_num39;
    private javax.swing.JLabel lbl_view_num4;
    private javax.swing.JLabel lbl_view_num40;
    private javax.swing.JLabel lbl_view_num41;
    private javax.swing.JLabel lbl_view_num42;
    private javax.swing.JLabel lbl_view_num43;
    private javax.swing.JLabel lbl_view_num44;
    private javax.swing.JLabel lbl_view_num45;
    private javax.swing.JLabel lbl_view_num46;
    private javax.swing.JLabel lbl_view_num47;
    private javax.swing.JLabel lbl_view_num48;
    private javax.swing.JLabel lbl_view_num49;
    private javax.swing.JLabel lbl_view_num5;
    private javax.swing.JLabel lbl_view_num50;
    private javax.swing.JLabel lbl_view_num51;
    private javax.swing.JLabel lbl_view_num52;
    private javax.swing.JLabel lbl_view_num53;
    private javax.swing.JLabel lbl_view_num54;
    private javax.swing.JLabel lbl_view_num55;
    private javax.swing.JLabel lbl_view_num56;
    private javax.swing.JLabel lbl_view_num57;
    private javax.swing.JLabel lbl_view_num58;
    private javax.swing.JLabel lbl_view_num59;
    private javax.swing.JLabel lbl_view_num6;
    private javax.swing.JLabel lbl_view_num60;
    private javax.swing.JLabel lbl_view_num61;
    private javax.swing.JLabel lbl_view_num62;
    private javax.swing.JLabel lbl_view_num63;
    private javax.swing.JLabel lbl_view_num64;
    private javax.swing.JLabel lbl_view_num65;
    private javax.swing.JLabel lbl_view_num66;
    private javax.swing.JLabel lbl_view_num67;
    private javax.swing.JLabel lbl_view_num68;
    private javax.swing.JLabel lbl_view_num69;
    private javax.swing.JLabel lbl_view_num7;
    private javax.swing.JLabel lbl_view_num70;
    private javax.swing.JLabel lbl_view_num71;
    private javax.swing.JLabel lbl_view_num72;
    private javax.swing.JLabel lbl_view_num73;
    private javax.swing.JLabel lbl_view_num74;
    private javax.swing.JLabel lbl_view_num75;
    private javax.swing.JLabel lbl_view_num77;
    private javax.swing.JLabel lbl_view_num8;
    private javax.swing.JLabel lbl_view_num81;
    private javax.swing.JLabel lbl_view_num9;
    private javax.swing.JLabel lbl_view_num91;
    private javax.swing.JLabel lbl_view_num92;
    private javax.swing.JLabel lbl_view_num93;
    private javax.swing.JLabel lbl_view_num94;
    private javax.swing.JLabel lbl_view_num95;
    private javax.swing.JLabel lbl_view_num96;
    private javax.swing.JLabel lbl_view_num97;
    private javax.swing.JLabel lbl_view_num98;
    private javax.swing.JLabel lbl_view_num99;
    // End of variables declaration//GEN-END:variables
}
