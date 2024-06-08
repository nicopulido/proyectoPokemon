/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.PC;
import Modelo.Objeto;
import Modelo.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author ElPul
 */
public class VentanaPC extends javax.swing.JFrame {

    private final PC pc;
    private int pokemonSeleccionadoCaja;
    private int pokemonSeleccionadoEquipo;
    private int cajaSeleccionada;
    private int cajaActual;
    private int indexObjetoSeleccionado;
    private boolean objetoSeleccionado;
    private boolean moverEquipoCaja;

    public VentanaPC(PC pc) {
        this.pc = pc;
        initComponents();
        this.moverEquipoCaja = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        panelPC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        botonCajaAnterior = new javax.swing.JButton();
        botonCajaPosterior = new javax.swing.JButton();
        textoCaja = new javax.swing.JLabel();
        botonQuitarItem = new javax.swing.JButton();
        botonCambiarPosicion = new javax.swing.JButton();
        botonMoverAEquipo = new javax.swing.JButton();
        botonLiberar = new javax.swing.JButton();
        botonMoverPC = new javax.swing.JButton();
        infoPokemonSeleccionado = new javax.swing.JLabel();
        panelEquipo = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListEquipoPokemon = new javax.swing.JList<>();
        botonCambiarPosicionEquipo = new javax.swing.JButton();
        botonMoverACaja = new javax.swing.JButton();
        botonQuitarItemEquipo = new javax.swing.JButton();
        botonLiberarEquipo = new javax.swing.JButton();
        infoPokemonSeleccionadoEquipo = new javax.swing.JLabel();
        botonMoverEquipo = new javax.swing.JButton();
        panelMochial = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListObjetos = new javax.swing.JList<>();
        botonDarEquipo = new javax.swing.JButton();
        botonDarCaja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabs.setMaximumSize(new java.awt.Dimension(30000, 30000));
        tabs.setPreferredSize(new java.awt.Dimension(500, 418));
        tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabsStateChanged(evt);
            }
        });

        panelPC.setForeground(new java.awt.Color(0, 0, 0));
        panelPC.setMaximumSize(new java.awt.Dimension(20000, 20000));
        panelPC.setPreferredSize(new java.awt.Dimension(500, 418));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        botonCajaAnterior.setText("Caja anterior");
        botonCajaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCajaAnteriorActionPerformed(evt);
            }
        });

        botonCajaPosterior.setText("Caja posterior");
        botonCajaPosterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCajaPosteriorActionPerformed(evt);
            }
        });

        botonQuitarItem.setText("Quitar item");
        botonQuitarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarItemActionPerformed(evt);
            }
        });

        botonCambiarPosicion.setText("Cambiar posicion");
        botonCambiarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPosicionActionPerformed(evt);
            }
        });

        botonMoverAEquipo.setText("Mover a equipo");
        botonMoverAEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverAEquipoActionPerformed(evt);
            }
        });

        botonLiberar.setText("Liberar");
        botonLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLiberarActionPerformed(evt);
            }
        });

        botonMoverPC.setText("Ok");
        botonMoverPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverPCActionPerformed(evt);
            }
        });

        infoPokemonSeleccionado.setForeground(new java.awt.Color(255, 0, 0));
        infoPokemonSeleccionado.setText("Pokemon seleccionado: Magikarp");

        javax.swing.GroupLayout panelPCLayout = new javax.swing.GroupLayout(panelPC);
        panelPC.setLayout(panelPCLayout);
        panelPCLayout.setHorizontalGroup(
            panelPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPCLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panelPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPCLayout.createSequentialGroup()
                        .addComponent(botonCajaAnterior)
                        .addGap(90, 90, 90)
                        .addComponent(textoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCajaPosterior))
                    .addComponent(jScrollPane1)
                    .addGroup(panelPCLayout.createSequentialGroup()
                        .addComponent(botonMoverAEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonLiberar)
                        .addGap(18, 18, 18)
                        .addComponent(botonCambiarPosicion)
                        .addGap(12, 12, 12)
                        .addComponent(botonQuitarItem))
                    .addGroup(panelPCLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(infoPokemonSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMoverPC)
                        .addGap(27, 27, 27)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelPCLayout.setVerticalGroup(
            panelPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonCajaAnterior)
                        .addComponent(botonCajaPosterior)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMoverAEquipo)
                    .addComponent(botonLiberar)
                    .addComponent(botonCambiarPosicion)
                    .addComponent(botonQuitarItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoPokemonSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMoverPC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("PC", panelPC);

        panelEquipo.setMaximumSize(new java.awt.Dimension(20000, 20000));
        panelEquipo.setName(""); // NOI18N

        jListEquipoPokemon.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListEquipoPokemon);

        botonCambiarPosicionEquipo.setText("Cambiar posición");
        botonCambiarPosicionEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPosicionEquipoActionPerformed(evt);
            }
        });

        botonMoverACaja.setText("Mover a caja");
        botonMoverACaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverACajaActionPerformed(evt);
            }
        });

        botonQuitarItemEquipo.setText("Quitar item");
        botonQuitarItemEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarItemEquipoActionPerformed(evt);
            }
        });

        botonLiberarEquipo.setText("Liberar");
        botonLiberarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLiberarEquipoActionPerformed(evt);
            }
        });

        infoPokemonSeleccionadoEquipo.setForeground(new java.awt.Color(255, 0, 0));
        infoPokemonSeleccionadoEquipo.setText("Pokemon seleccionado: Magikarp");

        botonMoverEquipo.setText("Ok");
        botonMoverEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEquipoLayout = new javax.swing.GroupLayout(panelEquipo);
        panelEquipo.setLayout(panelEquipoLayout);
        panelEquipoLayout.setHorizontalGroup(
            panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipoLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEquipoLayout.createSequentialGroup()
                        .addComponent(infoPokemonSeleccionadoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(botonMoverEquipo)
                        .addGap(46, 46, 46))
                    .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3)
                        .addGroup(panelEquipoLayout.createSequentialGroup()
                            .addComponent(botonCambiarPosicionEquipo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botonMoverACaja)
                            .addGap(10, 10, 10)
                            .addComponent(botonQuitarItemEquipo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botonLiberarEquipo))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelEquipoLayout.setVerticalGroup(
            panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCambiarPosicionEquipo)
                    .addComponent(botonMoverACaja)
                    .addComponent(botonQuitarItemEquipo)
                    .addComponent(botonLiberarEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoPokemonSeleccionadoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMoverEquipo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Equipo Pokemon", panelEquipo);

        panelMochial.setMaximumSize(new java.awt.Dimension(700, 700));

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setMaximumSize(new java.awt.Dimension(500, 700));

        jListObjetos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListObjetos);

        botonDarEquipo.setText("Dar a equipo");
        botonDarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDarEquipoActionPerformed(evt);
            }
        });

        botonDarCaja.setText("Dar a caja");
        botonDarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDarCajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMochialLayout = new javax.swing.GroupLayout(panelMochial);
        panelMochial.setLayout(panelMochialLayout);
        panelMochialLayout.setHorizontalGroup(
            panelMochialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMochialLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(panelMochialLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(botonDarEquipo)
                .addGap(95, 95, 95)
                .addComponent(botonDarCaja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMochialLayout.setVerticalGroup(
            panelMochialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMochialLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(panelMochialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDarEquipo)
                    .addComponent(botonDarCaja))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tabs.addTab("Mochila", panelMochial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabsStateChanged

    }//GEN-LAST:event_tabsStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.cajaActual = 0;
        actualizarListas();
        textoCaja.setText("Caja: " + (this.cajaActual + 1));
        botonMoverPC.setVisible(false);
        infoPokemonSeleccionado.setVisible(false);
        infoPokemonSeleccionadoEquipo.setVisible(false);
        botonMoverEquipo.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

    private void botonCajaPosteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCajaPosteriorActionPerformed
        if (this.cajaActual < this.pc.getCajas().size() - 1) {
            this.cajaActual++;
        }
        actualizarListas();
        textoCaja.setText("Caja: " + (this.cajaActual + 1));
    }//GEN-LAST:event_botonCajaPosteriorActionPerformed

    private void botonCajaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCajaAnteriorActionPerformed
        if (this.cajaActual > 0) {
            this.cajaActual--;
        }
        actualizarListas();
        textoCaja.setText("Caja: " + (this.cajaActual + 1));
    }//GEN-LAST:event_botonCajaAnteriorActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (!evt.getValueIsAdjusting()) {
            int index = jList1.getSelectedIndex();
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void botonCambiarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPosicionActionPerformed
        Pokemon pokemon = this.pc.obtenerPokemonEnPosicion(cajaActual, jList1.getSelectedIndex());
        this.pokemonSeleccionadoCaja = jList1.getSelectedIndex();
        this.cajaSeleccionada = this.cajaActual;
        infoPokemonSeleccionado.setText("Pokemon seleccionado: " + pokemon.getNombre());
        botonMoverPC.setVisible(true);
        infoPokemonSeleccionado.setVisible(true);
    }//GEN-LAST:event_botonCambiarPosicionActionPerformed

    private void botonMoverAEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverAEquipoActionPerformed
        Pokemon pokemon = this.pc.obtenerPokemonEnPosicion(cajaActual, jList1.getSelectedIndex());
        this.pokemonSeleccionadoCaja = jList1.getSelectedIndex();
        this.cajaSeleccionada = this.cajaActual;
        infoPokemonSeleccionadoEquipo.setText("Pokemon seleccionado: " + pokemon.getNombre());
        infoPokemonSeleccionadoEquipo.setVisible(true);
        botonMoverEquipo.setVisible(true);
        tabs.setSelectedIndex(tabs.indexOfComponent(panelEquipo));
        this.moverEquipoCaja = true;
    }//GEN-LAST:event_botonMoverAEquipoActionPerformed

    private void botonLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLiberarActionPerformed
        this.pc.soltarPokemon(this.cajaActual, jList1.getSelectedIndex());
        this.actualizarListas();
    }//GEN-LAST:event_botonLiberarActionPerformed

    private void botonQuitarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarItemActionPerformed
        this.pc.quitarObjetoPokemonCaja(this.cajaActual, jList1.getSelectedIndex());
        actualizarListas();
    }//GEN-LAST:event_botonQuitarItemActionPerformed

    private void botonMoverPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverPCActionPerformed
        if (this.moverEquipoCaja) {
            this.pc.moverCajaEquipo(this.cajaActual, jList1.getSelectedIndex(), this.pokemonSeleccionadoEquipo);
        } else if (this.objetoSeleccionado) {
            pc.darObjetoCaja(this.indexObjetoSeleccionado, jList1.getSelectedIndex(),this.cajaActual);
        } else {
            this.pc.cambiarPokemondeCaja(this.pokemonSeleccionadoCaja, jList1.getSelectedIndex(), this.cajaSeleccionada, this.cajaActual);
        }
        this.moverEquipoCaja = false;
        botonMoverPC.setVisible(false);
        infoPokemonSeleccionado.setVisible(false);
        actualizarListas();
    }//GEN-LAST:event_botonMoverPCActionPerformed

    private void botonCambiarPosicionEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPosicionEquipoActionPerformed
        Pokemon pokemon = this.pc.getEquipoPokemon().obtenerPokemonPosicion(jListEquipoPokemon.getSelectedIndex());
        this.pokemonSeleccionadoEquipo = jListEquipoPokemon.getSelectedIndex();
        infoPokemonSeleccionadoEquipo.setText("Pokemon seleccionado: " + pokemon.getNombre());
        infoPokemonSeleccionadoEquipo.setVisible(true);
        botonMoverEquipo.setVisible(true);
        this.moverEquipoCaja = false;
    }//GEN-LAST:event_botonCambiarPosicionEquipoActionPerformed

    private void botonMoverACajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverACajaActionPerformed
        Pokemon pokemon = this.pc.getEquipoPokemon().obtenerPokemonPosicion(jListEquipoPokemon.getSelectedIndex());
        this.pokemonSeleccionadoEquipo = jListEquipoPokemon.getSelectedIndex();
        infoPokemonSeleccionado.setText("Pokemon seleccionado: " + pokemon.getNombre());
        infoPokemonSeleccionado.setVisible(true);
        botonMoverPC.setVisible(true);
        tabs.setSelectedIndex(tabs.indexOfComponent(panelPC));
        this.moverEquipoCaja = true;
    }//GEN-LAST:event_botonMoverACajaActionPerformed

    private void botonQuitarItemEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarItemEquipoActionPerformed
        pc.quitarObjetoPokemonEquipo(jListEquipoPokemon.getSelectedIndex());
        this.actualizarListas();
    }//GEN-LAST:event_botonQuitarItemEquipoActionPerformed

    private void botonLiberarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLiberarEquipoActionPerformed
        this.pc.liberarPokemonEquipo(jListEquipoPokemon.getSelectedIndex());
        this.actualizarListas();
    }//GEN-LAST:event_botonLiberarEquipoActionPerformed

    private void botonMoverEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverEquipoActionPerformed
        if (this.moverEquipoCaja) {
            pc.moverCajaEquipo(this.cajaSeleccionada, this.pokemonSeleccionadoCaja, jListEquipoPokemon.getSelectedIndex());
        } else if (this.objetoSeleccionado) {
            pc.darObjetoEquipo(this.indexObjetoSeleccionado, jListEquipoPokemon.getSelectedIndex());
        } else {
            System.out.println("no se mueven");
            pc.moverPosicionEquipo(jListEquipoPokemon.getSelectedIndex(), this.pokemonSeleccionadoEquipo);
        }
        this.objetoSeleccionado = false;
        this.moverEquipoCaja = false;
        botonMoverEquipo.setVisible(false);
        infoPokemonSeleccionadoEquipo.setVisible(false);
        this.actualizarListas();
    }//GEN-LAST:event_botonMoverEquipoActionPerformed

    private void botonDarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDarEquipoActionPerformed
        if (!moverEquipoCaja) {
            this.indexObjetoSeleccionado = jListObjetos.getSelectedIndex();
            this.objetoSeleccionado = true;
        }
        tabs.setSelectedIndex(tabs.indexOfComponent(panelEquipo));
        this.botonMoverEquipo.setVisible(true);
    }//GEN-LAST:event_botonDarEquipoActionPerformed

    private void botonDarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDarCajaActionPerformed
        if (!moverEquipoCaja) {
            this.indexObjetoSeleccionado = jListObjetos.getSelectedIndex();
            this.objetoSeleccionado = true;
        }
        tabs.setSelectedIndex(tabs.indexOfComponent(panelPC));
        this.botonMoverPC.setVisible(true);
    }//GEN-LAST:event_botonDarCajaActionPerformed

    private void actualizarListas() {
        ArrayList<Pokemon> pokemones = pc.getCajas().get(this.cajaActual).getPokemones();
        String[] elementos = new String[30];

        for (int i = 0; i < 30; i++) {
            elementos[i] = (pokemones.get(i) != null) ? (i + 1) + ". " + pokemones.get(i).toString() : (i + 1) + ". " + "Espacio vacío";
        }
        jList1.setListData(elementos);
        ArrayList<Objeto> objetos = pc.getMochila().getObjetos();
        String[] objetosString = new String[objetos.size()];

        for (int i = 0; i < objetos.size(); i++) {
            objetosString[i] = (i + 1) + ". " + objetos.get(i).toString() + " | Descripción: " + objetos.get(i).getDescripcion();
        }

        jListObjetos.setListData(objetosString);
        ArrayList<Pokemon> equipoPokemon = pc.getEquipoPokemon().getPokemones();
        String[] equipoPokemonString = new String[equipoPokemon.size()];

        for (int i = 0; i < equipoPokemon.size(); i++) {
            equipoPokemonString[i] = (equipoPokemon.get(i) != null) ? (i + 1) + ". " + equipoPokemon.get(i).toString() : (i + 1) + ". " + "Espacio vacío";
        }
        jListEquipoPokemon.setListData(equipoPokemonString);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCajaAnterior;
    private javax.swing.JButton botonCajaPosterior;
    private javax.swing.JButton botonCambiarPosicion;
    private javax.swing.JButton botonCambiarPosicionEquipo;
    private javax.swing.JButton botonDarCaja;
    private javax.swing.JButton botonDarEquipo;
    private javax.swing.JButton botonLiberar;
    private javax.swing.JButton botonLiberarEquipo;
    private javax.swing.JButton botonMoverACaja;
    private javax.swing.JButton botonMoverAEquipo;
    private javax.swing.JButton botonMoverEquipo;
    private javax.swing.JButton botonMoverPC;
    private javax.swing.JButton botonQuitarItem;
    private javax.swing.JButton botonQuitarItemEquipo;
    private javax.swing.JLabel infoPokemonSeleccionado;
    private javax.swing.JLabel infoPokemonSeleccionadoEquipo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jListEquipoPokemon;
    private javax.swing.JList<String> jListObjetos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelEquipo;
    private javax.swing.JPanel panelMochial;
    private javax.swing.JPanel panelPC;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel textoCaja;
    // End of variables declaration//GEN-END:variables
}
