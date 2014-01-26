package sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JTextField;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();

        //build textfield list
        fields.add(txt1);
        fields.add(txt2);
        fields.add(txt3);
        fields.add(txt4);
        fields.add(txt5);
        fields.add(txt6);
        fields.add(txt7);
        fields.add(txt8);
        fields.add(txt9);
        fields.add(txt10);
        fields.add(txt11);
        fields.add(txt12);
        fields.add(txt13);
        fields.add(txt14);
        fields.add(txt15);
        fields.add(txt16);
        fields.add(txt17);
        fields.add(txt18);
        fields.add(txt19);
        fields.add(txt20);
        fields.add(txt21);
        fields.add(txt22);
        fields.add(txt23);
        fields.add(txt24);
        fields.add(txt25);
        fields.add(txt26);
        fields.add(txt27);
        fields.add(txt28);
        fields.add(txt29);
        fields.add(txt30);
        fields.add(txt31);
        fields.add(txt32);
        fields.add(txt33);
        fields.add(txt34);
        fields.add(txt35);
        fields.add(txt36);
        fields.add(txt37);
        fields.add(txt38);
        fields.add(txt39);
        fields.add(txt40);
        fields.add(txt41);
        fields.add(txt42);
        fields.add(txt43);
        fields.add(txt44);
        fields.add(txt45);
        fields.add(txt46);
        fields.add(txt47);
        fields.add(txt48);
        fields.add(txt49);
        fields.add(txt50);
        fields.add(txt51);
        fields.add(txt52);
        fields.add(txt53);
        fields.add(txt54);
        fields.add(txt55);
        fields.add(txt56);
        fields.add(txt57);
        fields.add(txt58);
        fields.add(txt59);
        fields.add(txt60);
        fields.add(txt61);
        fields.add(txt62);
        fields.add(txt63);
        fields.add(txt64);
        fields.add(txt65);
        fields.add(txt66);
        fields.add(txt67);
        fields.add(txt68);
        fields.add(txt69);
        fields.add(txt70);
        fields.add(txt71);
        fields.add(txt72);
        fields.add(txt73);
        fields.add(txt74);
        fields.add(txt75);
        fields.add(txt76);
        fields.add(txt77);
        fields.add(txt78);
        fields.add(txt79);
        fields.add(txt80);
        fields.add(txt81);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPuzzle = new javax.swing.JPanel();
        pnlNW = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        pnlN = new javax.swing.JPanel();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        txt24 = new javax.swing.JTextField();
        pnlNE = new javax.swing.JPanel();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt26 = new javax.swing.JTextField();
        txt27 = new javax.swing.JTextField();
        pnlW = new javax.swing.JPanel();
        txt28 = new javax.swing.JTextField();
        txt29 = new javax.swing.JTextField();
        txt30 = new javax.swing.JTextField();
        txt37 = new javax.swing.JTextField();
        txt38 = new javax.swing.JTextField();
        txt39 = new javax.swing.JTextField();
        txt46 = new javax.swing.JTextField();
        txt47 = new javax.swing.JTextField();
        txt48 = new javax.swing.JTextField();
        pnlC = new javax.swing.JPanel();
        txt31 = new javax.swing.JTextField();
        txt32 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt40 = new javax.swing.JTextField();
        txt41 = new javax.swing.JTextField();
        txt42 = new javax.swing.JTextField();
        txt49 = new javax.swing.JTextField();
        txt50 = new javax.swing.JTextField();
        txt51 = new javax.swing.JTextField();
        pnlE = new javax.swing.JPanel();
        txt34 = new javax.swing.JTextField();
        txt35 = new javax.swing.JTextField();
        txt36 = new javax.swing.JTextField();
        txt43 = new javax.swing.JTextField();
        txt44 = new javax.swing.JTextField();
        txt45 = new javax.swing.JTextField();
        txt52 = new javax.swing.JTextField();
        txt53 = new javax.swing.JTextField();
        txt54 = new javax.swing.JTextField();
        pnlSW = new javax.swing.JPanel();
        txt55 = new javax.swing.JTextField();
        txt56 = new javax.swing.JTextField();
        txt57 = new javax.swing.JTextField();
        txt64 = new javax.swing.JTextField();
        txt65 = new javax.swing.JTextField();
        txt66 = new javax.swing.JTextField();
        txt73 = new javax.swing.JTextField();
        txt74 = new javax.swing.JTextField();
        txt75 = new javax.swing.JTextField();
        pnlS = new javax.swing.JPanel();
        txt58 = new javax.swing.JTextField();
        txt59 = new javax.swing.JTextField();
        txt60 = new javax.swing.JTextField();
        txt67 = new javax.swing.JTextField();
        txt68 = new javax.swing.JTextField();
        txt69 = new javax.swing.JTextField();
        txt76 = new javax.swing.JTextField();
        txt77 = new javax.swing.JTextField();
        txt78 = new javax.swing.JTextField();
        pnlSE = new javax.swing.JPanel();
        txt61 = new javax.swing.JTextField();
        txt62 = new javax.swing.JTextField();
        txt63 = new javax.swing.JTextField();
        txt70 = new javax.swing.JTextField();
        txt71 = new javax.swing.JTextField();
        txt72 = new javax.swing.JTextField();
        txt79 = new javax.swing.JTextField();
        txt80 = new javax.swing.JTextField();
        txt81 = new javax.swing.JTextField();
        pnlButtons = new javax.swing.JPanel();
        btnGenerate = new javax.swing.JButton();
        btnSolve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku Solver");
        setResizable(false);

        pnlPuzzle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPuzzle.setLayout(new java.awt.GridLayout(3, 3));

        pnlNW.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlNW.setLayout(new java.awt.GridLayout(3, 3));

        txt1.setToolTipText("");
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt1.setFocusable(false);
        pnlNW.add(txt1);

        txt2.setToolTipText("");
        txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt2.setFocusable(false);
        pnlNW.add(txt2);

        txt3.setToolTipText("");
        txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt3.setFocusable(false);
        pnlNW.add(txt3);

        txt10.setToolTipText("");
        txt10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt10.setFocusable(false);
        pnlNW.add(txt10);

        txt11.setToolTipText("");
        txt11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt11.setFocusable(false);
        pnlNW.add(txt11);

        txt12.setToolTipText("");
        txt12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt12.setFocusable(false);
        pnlNW.add(txt12);

        txt19.setToolTipText("");
        txt19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt19.setFocusable(false);
        pnlNW.add(txt19);

        txt20.setToolTipText("");
        txt20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt20.setFocusable(false);
        pnlNW.add(txt20);

        txt21.setToolTipText("");
        txt21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt21.setFocusable(false);
        pnlNW.add(txt21);

        pnlPuzzle.add(pnlNW);

        pnlN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlN.setLayout(new java.awt.GridLayout(3, 3));

        txt4.setToolTipText("");
        txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt4.setFocusable(false);
        pnlN.add(txt4);

        txt5.setToolTipText("");
        txt5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt5.setFocusable(false);
        pnlN.add(txt5);

        txt6.setToolTipText("");
        txt6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt6.setFocusable(false);
        pnlN.add(txt6);

        txt13.setToolTipText("");
        txt13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt13.setFocusable(false);
        pnlN.add(txt13);

        txt14.setToolTipText("");
        txt14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt14.setFocusable(false);
        pnlN.add(txt14);

        txt15.setToolTipText("");
        txt15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt15.setFocusable(false);
        pnlN.add(txt15);

        txt22.setToolTipText("");
        txt22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt22.setFocusable(false);
        pnlN.add(txt22);

        txt23.setToolTipText("");
        txt23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt23.setFocusable(false);
        pnlN.add(txt23);

        txt24.setToolTipText("");
        txt24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt24.setFocusable(false);
        pnlN.add(txt24);

        pnlPuzzle.add(pnlN);

        pnlNE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlNE.setLayout(new java.awt.GridLayout(3, 3));

        txt7.setToolTipText("");
        txt7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt7.setFocusable(false);
        pnlNE.add(txt7);

        txt8.setToolTipText("");
        txt8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt8.setFocusable(false);
        pnlNE.add(txt8);

        txt9.setToolTipText("");
        txt9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt9.setFocusable(false);
        pnlNE.add(txt9);

        txt16.setToolTipText("");
        txt16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt16.setFocusable(false);
        pnlNE.add(txt16);

        txt17.setToolTipText("");
        txt17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt17.setFocusable(false);
        pnlNE.add(txt17);

        txt18.setToolTipText("");
        txt18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt18.setFocusable(false);
        pnlNE.add(txt18);

        txt25.setToolTipText("");
        txt25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt25.setFocusable(false);
        pnlNE.add(txt25);

        txt26.setToolTipText("");
        txt26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt26.setFocusable(false);
        pnlNE.add(txt26);

        txt27.setToolTipText("");
        txt27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt27.setFocusable(false);
        pnlNE.add(txt27);

        pnlPuzzle.add(pnlNE);

        pnlW.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlW.setLayout(new java.awt.GridLayout(3, 3));

        txt28.setToolTipText("");
        txt28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt28.setFocusable(false);
        pnlW.add(txt28);

        txt29.setToolTipText("");
        txt29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt29.setFocusable(false);
        pnlW.add(txt29);

        txt30.setToolTipText("");
        txt30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt30.setFocusable(false);
        pnlW.add(txt30);

        txt37.setToolTipText("");
        txt37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt37.setFocusable(false);
        pnlW.add(txt37);

        txt38.setToolTipText("");
        txt38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt38.setFocusable(false);
        pnlW.add(txt38);

        txt39.setToolTipText("");
        txt39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt39.setFocusable(false);
        pnlW.add(txt39);

        txt46.setToolTipText("");
        txt46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt46.setFocusable(false);
        pnlW.add(txt46);

        txt47.setToolTipText("");
        txt47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt47.setFocusable(false);
        pnlW.add(txt47);

        txt48.setToolTipText("");
        txt48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt48.setFocusable(false);
        pnlW.add(txt48);

        pnlPuzzle.add(pnlW);

        pnlC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlC.setLayout(new java.awt.GridLayout(3, 3));

        txt31.setToolTipText("");
        txt31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt31.setFocusable(false);
        pnlC.add(txt31);

        txt32.setToolTipText("");
        txt32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt32.setFocusable(false);
        pnlC.add(txt32);

        txt33.setToolTipText("");
        txt33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt33.setFocusable(false);
        pnlC.add(txt33);

        txt40.setToolTipText("");
        txt40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt40.setFocusable(false);
        pnlC.add(txt40);

        txt41.setToolTipText("");
        txt41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt41.setFocusable(false);
        txt41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt41ActionPerformed(evt);
            }
        });
        pnlC.add(txt41);

        txt42.setToolTipText("");
        txt42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt42.setFocusable(false);
        pnlC.add(txt42);

        txt49.setToolTipText("");
        txt49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt49.setFocusable(false);
        pnlC.add(txt49);

        txt50.setToolTipText("");
        txt50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt50.setFocusable(false);
        pnlC.add(txt50);

        txt51.setToolTipText("");
        txt51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt51.setFocusable(false);
        pnlC.add(txt51);

        pnlPuzzle.add(pnlC);

        pnlE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlE.setLayout(new java.awt.GridLayout(3, 3));

        txt34.setToolTipText("");
        txt34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt34.setFocusable(false);
        pnlE.add(txt34);

        txt35.setToolTipText("");
        txt35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt35.setFocusable(false);
        pnlE.add(txt35);

        txt36.setToolTipText("");
        txt36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt36.setFocusable(false);
        pnlE.add(txt36);

        txt43.setToolTipText("");
        txt43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt43.setFocusable(false);
        pnlE.add(txt43);

        txt44.setToolTipText("");
        txt44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt44.setFocusable(false);
        pnlE.add(txt44);

        txt45.setToolTipText("");
        txt45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt45.setFocusable(false);
        pnlE.add(txt45);

        txt52.setToolTipText("");
        txt52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt52.setFocusable(false);
        pnlE.add(txt52);

        txt53.setToolTipText("");
        txt53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt53.setFocusable(false);
        pnlE.add(txt53);

        txt54.setToolTipText("");
        txt54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt54.setFocusable(false);
        pnlE.add(txt54);

        pnlPuzzle.add(pnlE);

        pnlSW.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlSW.setLayout(new java.awt.GridLayout(3, 3));

        txt55.setToolTipText("");
        txt55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt55.setFocusable(false);
        pnlSW.add(txt55);

        txt56.setToolTipText("");
        txt56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt56.setFocusable(false);
        pnlSW.add(txt56);

        txt57.setToolTipText("");
        txt57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt57.setFocusable(false);
        pnlSW.add(txt57);

        txt64.setToolTipText("");
        txt64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt64.setFocusable(false);
        pnlSW.add(txt64);

        txt65.setToolTipText("");
        txt65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt65.setFocusable(false);
        pnlSW.add(txt65);

        txt66.setToolTipText("");
        txt66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt66.setFocusable(false);
        pnlSW.add(txt66);

        txt73.setToolTipText("");
        txt73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt73.setFocusable(false);
        pnlSW.add(txt73);

        txt74.setToolTipText("");
        txt74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt74.setFocusable(false);
        pnlSW.add(txt74);

        txt75.setToolTipText("");
        txt75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt75.setFocusable(false);
        pnlSW.add(txt75);

        pnlPuzzle.add(pnlSW);

        pnlS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlS.setLayout(new java.awt.GridLayout(3, 3));

        txt58.setToolTipText("");
        txt58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt58.setFocusable(false);
        pnlS.add(txt58);

        txt59.setToolTipText("");
        txt59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt59.setFocusable(false);
        pnlS.add(txt59);

        txt60.setToolTipText("");
        txt60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt60.setFocusable(false);
        pnlS.add(txt60);

        txt67.setToolTipText("");
        txt67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt67.setFocusable(false);
        pnlS.add(txt67);

        txt68.setToolTipText("");
        txt68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt68.setFocusable(false);
        pnlS.add(txt68);

        txt69.setToolTipText("");
        txt69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt69.setFocusable(false);
        pnlS.add(txt69);

        txt76.setToolTipText("");
        txt76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt76.setFocusable(false);
        pnlS.add(txt76);

        txt77.setToolTipText("");
        txt77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt77.setFocusable(false);
        pnlS.add(txt77);

        txt78.setToolTipText("");
        txt78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt78.setFocusable(false);
        pnlS.add(txt78);

        pnlPuzzle.add(pnlS);

        pnlSE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlSE.setLayout(new java.awt.GridLayout(3, 3));

        txt61.setToolTipText("");
        txt61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt61.setFocusable(false);
        pnlSE.add(txt61);

        txt62.setToolTipText("");
        txt62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt62.setFocusable(false);
        pnlSE.add(txt62);

        txt63.setToolTipText("");
        txt63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt63.setFocusable(false);
        pnlSE.add(txt63);

        txt70.setToolTipText("");
        txt70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt70.setFocusable(false);
        pnlSE.add(txt70);

        txt71.setToolTipText("");
        txt71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt71.setFocusable(false);
        pnlSE.add(txt71);

        txt72.setToolTipText("");
        txt72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt72.setFocusable(false);
        pnlSE.add(txt72);

        txt79.setToolTipText("");
        txt79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt79.setFocusable(false);
        pnlSE.add(txt79);

        txt80.setToolTipText("");
        txt80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt80.setFocusable(false);
        pnlSE.add(txt80);

        txt81.setToolTipText("");
        txt81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt81.setFocusable(false);
        pnlSE.add(txt81);

        pnlPuzzle.add(pnlSE);

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });
        pnlButtons.add(btnGenerate);

        btnSolve.setText("   Solve   ");
        btnSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolveActionPerformed(evt);
            }
        });
        pnlButtons.add(btnSolve);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(pnlPuzzle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPuzzle, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed

        //clear out previous solution
        Arrays.fill(solution, null);
        
        // generate puzzle solution
        Puzzle puzzle = new Puzzle();
        solution = puzzle.generate();

        // fill board with unsolved puzzle
        fillBoard(solution, false);

    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolveActionPerformed

        // fill board with solved puzzle
        fillBoard(solution, true);

    }//GEN-LAST:event_btnSolveActionPerformed

    private void txt41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt41ActionPerformed

    private void fillBoard(int[][] puzzle, boolean isSolution) {

        // fill board with puzzle solution
        int x = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                fields.get(x).setText(String.valueOf(puzzle[i][j]));
                x++;
            }
        }

        //if not a solution, remove 40 random squares
        if (isSolution == false) {
            Random gen = new Random();
            int rand = 0;
            for (int i = 0; i < 40; i++) {
                rand = gen.nextInt(81);
                fields.get(rand).setText("");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnSolve;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlC;
    private javax.swing.JPanel pnlE;
    private javax.swing.JPanel pnlN;
    private javax.swing.JPanel pnlNE;
    private javax.swing.JPanel pnlNW;
    private javax.swing.JPanel pnlPuzzle;
    private javax.swing.JPanel pnlS;
    private javax.swing.JPanel pnlSE;
    private javax.swing.JPanel pnlSW;
    private javax.swing.JPanel pnlW;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt35;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt37;
    private javax.swing.JTextField txt38;
    private javax.swing.JTextField txt39;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt40;
    private javax.swing.JTextField txt41;
    private javax.swing.JTextField txt42;
    private javax.swing.JTextField txt43;
    private javax.swing.JTextField txt44;
    private javax.swing.JTextField txt45;
    private javax.swing.JTextField txt46;
    private javax.swing.JTextField txt47;
    private javax.swing.JTextField txt48;
    private javax.swing.JTextField txt49;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt50;
    private javax.swing.JTextField txt51;
    private javax.swing.JTextField txt52;
    private javax.swing.JTextField txt53;
    private javax.swing.JTextField txt54;
    private javax.swing.JTextField txt55;
    private javax.swing.JTextField txt56;
    private javax.swing.JTextField txt57;
    private javax.swing.JTextField txt58;
    private javax.swing.JTextField txt59;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt60;
    private javax.swing.JTextField txt61;
    private javax.swing.JTextField txt62;
    private javax.swing.JTextField txt63;
    private javax.swing.JTextField txt64;
    private javax.swing.JTextField txt65;
    private javax.swing.JTextField txt66;
    private javax.swing.JTextField txt67;
    private javax.swing.JTextField txt68;
    private javax.swing.JTextField txt69;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt70;
    private javax.swing.JTextField txt71;
    private javax.swing.JTextField txt72;
    private javax.swing.JTextField txt73;
    private javax.swing.JTextField txt74;
    private javax.swing.JTextField txt75;
    private javax.swing.JTextField txt76;
    private javax.swing.JTextField txt77;
    private javax.swing.JTextField txt78;
    private javax.swing.JTextField txt79;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt80;
    private javax.swing.JTextField txt81;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
    private int[][] solution = new int[9][9];
    private List<JTextField> fields = new ArrayList<JTextField>();

}
