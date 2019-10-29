/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oskha
 */
public class LL1 extends javax.swing.JFrame {

    /**
     * Creates new form LL1
     */
    public LL1() {
        initComponents();
        tablaMLabel.setVisible(false);
        tablaMTable.setVisible(false);
        primeroTextArea.setVisible(false);
        prodsTextArea.setVisible(false);
        jLabel1.setVisible(false);
        siguienteTextArea.setVisible(false);
        validarButton.setVisible(false);
        validarLabel.setVisible(false);
        validarTextField.setVisible(false);
        validarTable.setVisible(false);
    }
    Set<String> noTerminales;
    Set<String> terminales;
    ArrayList<Character> ch;
    ArrayList<String> producciones;
    ArrayList<String> gammas;
    Map<String, String> primeros;
    Map<String, String> siguientes;
    Map<String, Integer> posNT;
    Map<String, Integer> posT;
    ArrayList<String> primerosOrigen;
    DefaultTableModel modelo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodsTextArea = new javax.swing.JTextArea();
        tablaMLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        primeroTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        siguienteTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        validarLabel = new javax.swing.JLabel();
        validarTextField = new javax.swing.JTextField();
        validarButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        validarTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Producciones sin vicios");

        prodsTextArea.setEditable(false);
        prodsTextArea.setColumns(20);
        prodsTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        prodsTextArea.setRows(5);
        jScrollPane1.setViewportView(prodsTextArea);

        tablaMLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tablaMLabel.setText("Tabla M");

        tablaMTable.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tablaMTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaMTable);

        primeroTextArea.setEditable(false);
        primeroTextArea.setColumns(20);
        primeroTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        primeroTextArea.setRows(5);
        jScrollPane3.setViewportView(primeroTextArea);

        siguienteTextArea.setEditable(false);
        siguienteTextArea.setColumns(20);
        siguienteTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        siguienteTextArea.setRows(5);
        jScrollPane4.setViewportView(siguienteTextArea);

        jLabel2.setText("Seleccione el archivo de entrada:");

        validarLabel.setText("Ingrese cadena a validar:");

        validarButton.setText("Validar");
        validarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarButtonActionPerformed(evt);
            }
        });

        validarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(validarTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tablaMLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(validarLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(validarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(validarButton)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(tablaMLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(validarLabel)
                        .addComponent(validarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(validarButton))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int responseCode = jFileChooser1.showOpenDialog(this);
        File selectedFile = null;
        if (responseCode == JFileChooser.APPROVE_OPTION) {
            selectedFile = jFileChooser1.getSelectedFile();
        }
        Scanner scan;
        String linea;
        try {
            File archivoIN = new File(selectedFile.getPath());
            scan = new Scanner(archivoIN);
            noTerminales = new LinkedHashSet<>();
            terminales = new LinkedHashSet<>();
            producciones = new ArrayList<>();
            primerosOrigen = new ArrayList<>();
            primeros = new LinkedHashMap<>();
            siguientes = new LinkedHashMap<>();
            gammas = new ArrayList();
            ch = new ArrayList<>();
            for (int i = 0; i < 25; i++) {
                ch.add((char) (i + 65));
            }
            tablaMLabel.setVisible(true);
            tablaMTable.setVisible(true);
            primeroTextArea.setVisible(true);
            siguienteTextArea.setVisible(true);
            prodsTextArea.setVisible(true);
            primeroTextArea.setText("");
            siguienteTextArea.setText("");
            jLabel1.setVisible(true);
            int i = 0;
            String[][] produ = new String[100][2];
            while (scan.hasNext()) {
                linea = scan.nextLine();
                String[] op = linea.split("->");
                produ[i][0] = op[0];
                produ[i][1] = op[1];
                if (i > 0 && op[0].equals(produ[i - 1][0])) {
                    produ[i - 1][1] += "%" + op[1];
                } else {
                    i++;
                }

            }

            String[][] newProd = new String[100][2];
            int k = 0;
            for (int j = 0; j < i; j++) {
                if (produ[j][1].substring(0, 1).equals(produ[j][0])) {
                    if (produ[j][1].contains("%")) {
                        String A = produ[j][0];
                        String[] alfa2 = produ[j][1].split("%");
                        String alfaV = "";
                        int sw = 0;
                        for (int t = 0; t < alfa2.length - 1; t++) {
                            if (alfa2[t].substring(0, 1).equals(produ[j][0])) {
                                sw++;
                            }
                        }

                        int contAlfa = 0;
                        int contB = 0;
                        String alfasD[] = new String[100];
                        String beta[] = new String[100];
                        if (sw > 1) {
                            alfaV = produ[j][0];
                            for (int t = 0; t < alfa2.length; t++) {
                                if (alfa2[t].contains(alfaV)) {
                                    alfasD[contAlfa] = alfa2[t].substring(1, alfa2[t].length());
                                    contAlfa++;
                                } else {
                                    beta[contB] = alfa2[t];
                                    contB++;
                                }
                            }
                        } else {
                            alfasD[0] = produ[j][1].substring(1, produ[j][1].indexOf("%"));
                            contAlfa = 1;
                            String beta2 = produ[j][1].substring(produ[j][1].indexOf("%") + 1, produ[j][1].length());
                            beta = beta2.split("%");
                            contB = beta.length;
                        }

                        for (int t = 0; t < contB; t++) {
                            newProd[k][0] = A;
                            newProd[k][1] = beta[t] + A + "'";
                            k++;
                        }
                        for (int t = 0; t < contAlfa; t++) {
                            newProd[k][0] = A + "'";
                            newProd[k][1] = alfasD[t] + A + "'";
                            k++;
                        }
                        newProd[k][0] = A + "'";
                        newProd[k][1] = "&";
                        k++;
                    }
                } else {
                    String[] beta = produ[j][1].split("%");
                    int sw = 0;
                    String alfa = "";
                    for (int t = 0; t < beta.length - 1; t++) {
                        String factT = verificarFactorizacion(beta[t], beta[t + 1]);
                        if (!"".equals(factT)) {
                            alfa = factT;
                            sw = 1;
                        }
                    }
                    if (sw == 1) {
                        for (int t = 0; t < beta.length; t++) {
                            if (!beta[t].contains(alfa)) {
                                gammas.add(beta[t]);
                            }
                        }
                        newProd[k][0] = produ[j][0];
                        newProd[k][1] = alfa + produ[j][0] + "'";
                        k++;
                        if (gammas.size() > 0) {
                            for (String g : gammas) {
                                newProd[k][0] = produ[j][0];
                                newProd[k][1] = g;
                                k++;
                            }
                        }
                        for (int t = 0; t < beta.length; t++) {
                            newProd[k][0] = produ[j][0] + "'";
                            String aux = beta[t].replace(alfa, "%");
                            String[] betaD = aux.split("%");
                            if (betaD.length == 0) {
                                newProd[k][1] = "&";
                                k++;
                            } else {
                                if (beta[t].contains(alfa)) {
                                    newProd[k][1] = betaD[1];
                                    k++;
                                }
                            }

                        }
                        sw = 0;
                    } else {
                        for (int t = 0; t < beta.length; t++) {
                            newProd[k][0] = produ[j][0];
                            newProd[k][1] = beta[t];
                            k++;
                        }
                    }

                }
            }
            String produsF = "";
            for (int j = 0; j < k; j++) {
                produsF = produsF + newProd[j][0] + "->" + newProd[j][1] + "\n";
                producciones.add(j, newProd[j][0] + "->" + newProd[j][1]);
                noTerminales.add(newProd[j][0]);
                for (int w = 0; w < newProd[j][1].length(); w++) {
                    if (!ch.contains(newProd[j][1].charAt(w)) && (int) newProd[j][1].charAt(w) != 39) {
                        terminales.add(String.valueOf(newProd[j][1].charAt(w)));
                    }
                }
            }

            prodsTextArea.setText(produsF);
            calcularPrimero(producciones);
            int pos = 0;
            for (String p : primeros.keySet()) {
                String verif[] = primeros.get(p).split("%");
                String primerosF = "";
                for (int t = 0; t < verif.length; t++) {
                    String aux = verif[t];
                    if (noTerminales.contains(aux)) {
                        while (noTerminales.contains(aux)) {
                            aux = primeros.get(aux);
                        }
                    }
                    String cuerpo = producciones.get(pos).split("->")[1];
                    String elemAux = "";
                    String primAux = "";
                    String reemplazo = "";
                    int j = 1;
                    int sw = 0;
                    if (aux.contains("&") && cuerpo.length() > 1) {
                        sw = 1;
                        elemAux = cuerpo.substring(j, j + 1);
                        if (terminales.contains(elemAux)) {
                            reemplazo = elemAux;
                        } else {
                            primAux = primeros.get(elemAux);
                            if (primAux.indexOf("%") == primAux.length() - 1) {
                                primAux = primAux.substring(0, primAux.length() - 1);
                            }
                            reemplazo = primAux;
                            while (true) {
                                if (primAux.contains("&")) {
                                    j++;
                                    try {
                                        elemAux = cuerpo.substring(j, j + 1);
                                        primAux = primeros.get(elemAux);
                                        System.out.println(primAux);
                                        if (primAux.indexOf("%") == primAux.length() - 1) {
                                            primAux = primAux.substring(0, primAux.length() - 1);
                                        }
                                        reemplazo = reemplazo.replace("&", primAux);
                                    } catch (Exception e) {
                                        break;
                                    }

                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    if (sw == 1) {
                        aux = aux.replace("&", reemplazo);
                    }
                    String vecP[] = aux.split("%");
                    for (String f : vecP) {
                        primerosOrigen.add(f + "%" + producciones.get(pos));
                    }
                    pos++;
                    if (aux.charAt(aux.length() - 1) == '%') {
                        primerosF += aux;
                    } else {
                        primerosF += aux + "%";
                    }

                }
                primeros.put(p, primerosF);

            }
            for (String p : primeros.keySet()) {
                String[] vec = primeros.get(p).split("%");
                String cadenaP = Arrays.toString(vec).substring(1, Arrays.toString(vec).length() - 1);
                primeroTextArea.append("Primero(" + p + ")= {" + cadenaP + "}" + "\n");

            }
            calcularSiguiente(producciones);
            while (true) {
                int swD = 0;
                for (String p : siguientes.keySet()) {
                    String[] verif = siguientes.get(p).split("%");
                    String siguienteF = "";
                    int sw = 0;
                    for (int t = 0; t < verif.length; t++) {
                        String aux = verif[t];
                        while (noTerminales.contains(aux)) {
                            aux = primeros.get(aux);
                        }

                        if (aux.contains("&") && sw == 0) {
                            sw = 1;
                            swD = 1;
                            String fini = "";
                            while (true) {
                                fini = siguientes.get(verif[t].substring(0, 1));
                                if (!fini.contains("&")) {
                                    break;
                                }
                            }
                            if (fini.lastIndexOf("%") == fini.length() - 1) {
                                aux = aux.replace("&", fini.substring(0, fini.length() - 1));
                            } else {
                                aux = aux.replace("&", fini);
                            }

                        }
                        if (aux.contains("#")) {
                            int sw2 = 0;
                            String cabezote = "";
                            for (String pr : producciones) {
                                String mirar[] = pr.split("->");
                                if (mirar[1].contains(p) && sw2 == 0) {
                                    sw2 = 1;
                                    swD = 1;
                                    cabezote = mirar[0];
                                }
                            }
                            cabezote = siguientes.get(cabezote);
                            if (cabezote.lastIndexOf("%") == cabezote.length() - 1) {
                                aux = aux.replace("#", cabezote.substring(0, cabezote.length() - 1));
                            } else {
                                aux = aux.replace("#", cabezote);
                            }
                        }
                        if (aux.lastIndexOf("%") == aux.length() - 1) {
                            aux = aux.substring(0, aux.length() - 1);
                        }
                        siguienteF += aux + "%";
                    }
                    if (!p.contains("'")) {
                        siguientes.put(p, siguienteF);
                    } else {
                        siguientes.put(p, siguientes.get(p.substring(0, 1)));
                    }
                }
                if (swD == 0) {
                    break;
                }
            }
            for (String p : siguientes.keySet()) {
                String[] vec = siguientes.get(p).split("%");
                String cadenaP = Arrays.toString(vec).substring(1, Arrays.toString(vec).length() - 1);
                siguienteTextArea.append("Siguiente(" + p + ")= {" + cadenaP + "}" + "\n");
            }
            posNT = new LinkedHashMap();
            posT = new LinkedHashMap();
            modelo = new DefaultTableModel();
            modelo.setRowCount(noTerminales.size());
            tablaMTable.setModel(modelo);
            int cont = 0;
            modelo.addColumn("NoT/T");
            for (String e : terminales) {
                if (!"&".equals(e)) {
                    modelo.addColumn(e);
                }
            }
            modelo.addColumn("$");
            for (String e : noTerminales) {
                modelo.setValueAt(e, cont, 0);
                posNT.put(e, cont);
                cont++;
            }
            for (int d = 0; d < modelo.getColumnCount(); d++) {
                posT.put(modelo.getColumnName(d), d);
            }
            String anterior = "";
            int id = 0;
            int contNT = 0;
            for (String s : primerosOrigen) {
                String vec[] = s.split("%");
                String auxi[] = vec[1].split("->");
                if (contNT > 0) {
                    if (!auxi[0].equals(anterior)) {
                        id++;
                    }
                }
                if (!"&".equals(vec[0])) {
                    for (String nt : terminales) {
                        if (nt.equals(vec[0])) {
                            modelo.setValueAt(vec[1], id, posT.get(nt));
                        }
                    }
                } else {
                    String casoEsp = siguientes.get(auxi[0]);
                    String siguientesEsp[] = casoEsp.split("%");
                    for (String h : siguientesEsp) {
                        modelo.setValueAt(vec[1], id, posT.get(h));
                    }
                }
                anterior = auxi[0];
                contNT++;
            }
            validarButton.setVisible(true);
            validarLabel.setVisible(true);
            validarTextField.setVisible(true);
            validarTable.setVisible(true);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un archivo de entrada valido");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void validarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarButtonActionPerformed
        String entrada = validarTextField.getText();

        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Pila");
        modelo2.addColumn("Entrada");
        modelo2.addColumn("Salida");
        int rowCount = 0;
        validarTable.setModel(modelo2);
        Stack<String> pila = new Stack();
        pila.push("$");
        pila.push(prodsTextArea.getText().substring(0, 1));
        entrada += "$";
        while (true) {
            rowCount++;
            modelo2.setRowCount(rowCount);
            validarTable.setModel(modelo2);
            String pilaT = "";
            for (String pila1 : pila) {
                pilaT += pila1;
            }
            modelo2.setValueAt(pilaT, rowCount - 1, 0);
            modelo2.setValueAt(entrada, rowCount - 1, 1);
            if (pila.lastElement().equals("$")) {
                if (entrada.charAt(0) == '$') {
                    modelo2.setValueAt("Aceptar", rowCount - 1, 2);
                } else {
                    modelo2.setValueAt("Error", rowCount - 1, 2);
                }
                break;
            }
            String buscar = "";
            if (pila.lastElement().equals("'")) {
                buscar = pila.get(pila.size() - 2) + "'";
            } else {
                buscar = pila.lastElement();
            }
            if (noTerminales.contains(buscar)) {
                try {
                    String salida = modelo.getValueAt(posNT.get(buscar),
                            posT.get(String.valueOf(entrada.charAt(0)))).toString();
                    modelo2.setValueAt(salida, rowCount - 1, 2);
                    String produccion = salida.split("->")[1];
                    pila.pop();
                    if (buscar.contains("'")) {
                        pila.pop();
                    }
                    llenarPila(pila, produccion);
                } catch (Exception e) {
                    modelo2.setValueAt("Error", rowCount - 1, 2);
                    break;
                }

            } else {
                if (pila.lastElement().equals(String.valueOf(entrada.charAt(0)))) {
                    entrada = entrada.substring(1);
                    pila.pop();
                } else {
                    modelo2.setValueAt("Error", rowCount - 1, 2);
                    break;
                }
            }

        }


    }//GEN-LAST:event_validarButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LL1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LL1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LL1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LL1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LL1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea primeroTextArea;
    private javax.swing.JTextArea prodsTextArea;
    private javax.swing.JTextArea siguienteTextArea;
    private javax.swing.JLabel tablaMLabel;
    private javax.swing.JTable tablaMTable;
    private javax.swing.JButton validarButton;
    private javax.swing.JLabel validarLabel;
    private javax.swing.JTable validarTable;
    private javax.swing.JTextField validarTextField;
    // End of variables declaration//GEN-END:variables

    private String verificarFactorizacion(String input, String input2) {
        String answer = "";
        String match = "";
        int dist;
        if (input.length() > input2.length()) {
            dist = input2.length();
        } else {
            dist = input.length();
        }
        for (int i = 0; i < dist; i++) {
            if (input.charAt(i) == input2.charAt(i)) {
                match += input2.charAt(i);

            }
            if (match.length() > answer.length()) {
                answer = match;
            }

        }
        return answer;
    }

    private void calcularPrimero(ArrayList<String> producciones) {
        String anterior = "";
        for (int i = 0; i < producciones.size(); i++) {
            String produ = producciones.get(i);
            String[] divid = produ.split("->");
            if (i > 0) {
                if (divid[0].equals(anterior)) {
                    primeros.put(divid[0], primeros.get(divid[0]) + "%" + divid[1].substring(0, 1));
                } else {
                    primeros.put(divid[0], divid[1].substring(0, 1));
                }
            } else {
                primeros.put(divid[0], divid[1].substring(0, 1));
            }
            anterior = divid[0];
        }

    }

    private void calcularSiguiente(ArrayList<String> producciones) {
        int cont = 0;
        for (String e : noTerminales) {
            String siguienteDef = "";
            int swP = 0;
            for (int i = 0; i < producciones.size(); i++) {
                String produ = producciones.get(i);
                String[] divid = produ.split("->");
                if (divid[1].contains(e)) {
                    int pos = divid[1].indexOf(e);
                    Character siguiente;
                    if (e.contains("'")) {
                        try {
                            siguiente = divid[1].charAt(pos + 2);
                        } catch (Exception ex) {
                            swP = 1;
                        }

                    } else {
                        try {
                            siguiente = divid[1].charAt(pos + 1);
                            if ((int) (siguiente) != 39) {
                                try {
                                    Character prima = divid[1].charAt(pos + 2);
                                    if ((int) (prima) == 39) {
                                        if (!siguienteDef.contains(String.valueOf(siguiente))) {
                                            siguienteDef += siguiente + "'" + "%";
                                        }
                                    } else {
                                        if (!siguienteDef.contains(String.valueOf(siguiente))) {
                                            siguienteDef += siguiente + "%";
                                        }
                                    }

                                } catch (Exception exx) {
                                    if (!siguienteDef.contains(String.valueOf(siguiente))) {
                                        siguienteDef += siguiente + "%";
                                    }
                                }

                            }
                        } catch (Exception ex) {
                            swP = 2;
                            if (!divid[0].contains("'")) {
                                siguienteDef += "#%";
                            }
                        }

                    }
                }

            }
            if (cont == 0 || swP > 1) {
                if (swP == 1) {
                    siguienteDef += "$";
                } else {
                    if (cont == 0) {
                        siguienteDef += "$";
                    } else {
                        if (siguienteDef.isEmpty()) {
                            siguienteDef += "#";
                        }
                    }

                }
            }

            if (!e.contains("'")) {
                siguientes.put(e, siguienteDef);
            } else {
                siguientes.put(e, siguientes.get(e.substring(0, 1)));
            }
            cont++;
        }
    }

    private void llenarPila(Stack<String> pilaEntrada, String w) {
        int sw = 0;
        for (int i = w.length() - 1; i >= 0; i--) {
            if ((int) w.charAt(i) == 39) {
                sw = 1;
            } else {
                if (!"&".equals(w)) {
                    pilaEntrada.push(String.valueOf(w.charAt(i)));
                    if (sw == 1) {
                        pilaEntrada.push("'");
                        sw = 0;
                    }
                }
            }
        }
    }
}
