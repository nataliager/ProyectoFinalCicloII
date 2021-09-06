/**
 * Clase Paneles.java
 *
 * @author Daniel Orlando Espinosa Recaman, Natalia Andrea Giraldo Erazo.
 * Explicacion: Interfaz grafica de RedFlix
 */
package gui;

//Paquetes
import controllers.MovieController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PeliculaModel;

public class Paneles extends javax.swing.JFrame {

    public Paneles() {
        initComponents();
        this.setLocationRelativeTo(null);

        //Etiquetas inicio
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaTheWalkingDead, "src/resourses/etiquetaTheWalkingDead.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaVikingos, "src/resourses/etiquetaVikingos.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaBlindspot, "src/resourses/etiquetaBlindspot.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaLaCasaDePapel, "src/resourses/etiquetaLaCasaDePapel.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaLos100, "src/resourses/etiquetaLos100.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaVengadores, "src/resourses/etiquetaAvengers.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaInterestelar, "src/resourses/etiquetaInterestelar.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaFrargmentado, "src/resourses/etiquetaFragmentado.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaBirdBox, "src/resourses/etiquetaBirdBox.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(etiquetaLaPurga, "src/resourses/lapurga.jpeg");
        rsscalelabel.RSScaleLabel.setScaleLabel(buscar, "src/resourses/etiquetaBuscar.jpg");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        panelSeries = new javax.swing.JPanel();
        etiquetaVikingos = new javax.swing.JLabel();
        etiquetaTheWalkingDead = new javax.swing.JLabel();
        etiquetaLaCasaDePapel = new javax.swing.JLabel();
        etiquetaMensajeSerie = new javax.swing.JLabel();
        etiquetaBlindspot = new javax.swing.JLabel();
        etiquetaLos100 = new javax.swing.JLabel();
        panelPeliculas = new javax.swing.JPanel();
        etiquetaMensajePelicula = new javax.swing.JLabel();
        etiquetaVengadores = new javax.swing.JLabel();
        etiquetaInterestelar = new javax.swing.JLabel();
        etiquetaFrargmentado = new javax.swing.JLabel();
        etiquetaBirdBox = new javax.swing.JLabel();
        etiquetaLaPurga = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaBuscar = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        buscar = new javax.swing.JLabel();
        panelContenidos = new javax.swing.JPanel();
        etiquetaContenidos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContenidos = new javax.swing.JTable();
        botonActualizar = new javax.swing.JButton();
        panelAgregar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        etiquetaAgregarPelicula = new javax.swing.JLabel();
        etiquetaAddTitulo = new javax.swing.JLabel();
        agregarTitulo = new javax.swing.JTextField();
        etiquetaAddDirector = new javax.swing.JLabel();
        agregarDirector = new javax.swing.JTextField();
        etiquetaAddAnio = new javax.swing.JLabel();
        agregarAño = new javax.swing.JTextField();
        etiquetaAddGenero = new javax.swing.JLabel();
        contenidoCategoria1 = new javax.swing.JComboBox<>();
        AgregarPelicula = new javax.swing.JButton();
        limpiarAgregarPelicula = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        etiquetaAddTitulo1 = new javax.swing.JLabel();
        etiquetaAddDirector1 = new javax.swing.JLabel();
        etiquetaAddAnio1 = new javax.swing.JLabel();
        etiquetaAddGenero1 = new javax.swing.JLabel();
        etiquetaAddTemporadas = new javax.swing.JLabel();
        etiquetaAddCapitulos = new javax.swing.JLabel();
        JtextTituloSerie = new javax.swing.JTextField();
        JtextDirectorSerie = new javax.swing.JTextField();
        JtextAnioSerie = new javax.swing.JTextField();
        JcomboCategoriaSerie = new javax.swing.JComboBox<>();
        JtextTemporadasSerie = new javax.swing.JTextField();
        JtextCapitulosSerie = new javax.swing.JTextField();
        agregarSerie = new javax.swing.JButton();
        limpiarAgregarSerie = new javax.swing.JButton();
        etiquetaAgregarContenido = new javax.swing.JLabel();
        panelActualizar = new javax.swing.JPanel();
        panelActualizarSerie = new javax.swing.JPanel();
        etiquetaActualizarSerie = new javax.swing.JLabel();
        etiquetaUpdateId1 = new javax.swing.JLabel();
        etiquetaActualizarTitulo1 = new javax.swing.JLabel();
        updateId = new javax.swing.JTextField();
        updateTitulo = new javax.swing.JTextField();
        etiquetaDatosActualizarS = new javax.swing.JLabel();
        etiquetaActualizarDirector1 = new javax.swing.JLabel();
        etiquetaActualizarTemp = new javax.swing.JLabel();
        etiquetaActualizarCap = new javax.swing.JLabel();
        updateDirector = new javax.swing.JTextField();
        updatetemporadas = new javax.swing.JTextField();
        updateCapitulos = new javax.swing.JTextField();
        ActualizarSerie = new javax.swing.JButton();
        limpiarDatosUpdateS = new javax.swing.JButton();
        cargarSerieUpdate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        etiquetaActualizarPelicula = new javax.swing.JLabel();
        etiquetaUpdateId = new javax.swing.JLabel();
        etiquetaActualizarTitulo = new javax.swing.JLabel();
        IdActualizar = new javax.swing.JTextField();
        tituloActualizar = new javax.swing.JTextField();
        etiquetaDatosActualizarP = new javax.swing.JLabel();
        etiquetaActualizarDirector = new javax.swing.JLabel();
        directorActualizar = new javax.swing.JTextField();
        ActualizarPelicula = new javax.swing.JButton();
        limpiarDatosUpdateP = new javax.swing.JButton();
        cargarPeliculaUpdate = new javax.swing.JButton();
        etiquetaActualizarContenido = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        etiquetaEliminar = new javax.swing.JLabel();
        etiquetaIdEliminar = new javax.swing.JLabel();
        etiquetaTituloEliminar = new javax.swing.JLabel();
        idBorrar = new javax.swing.JTextField();
        borrarTitulo = new javax.swing.JTextField();
        botonBorrar = new javax.swing.JButton();
        botonLimpiarBorrar = new javax.swing.JButton();
        cargarEliminar = new javax.swing.JButton();
        etiquetaEliminarContenido = new javax.swing.JLabel();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(119, 128, 144));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelTitulo.setForeground(new java.awt.Color(211, 211, 211));

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setNextFocusableComponent(panelTitulo);

        panelInicio.setBackground(new java.awt.Color(0, 0, 0));

        panelSeries.setBackground(new java.awt.Color(0, 0, 0));
        panelSeries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelSeries.setForeground(new java.awt.Color(255, 250, 240));

        etiquetaVikingos.setText("VIKINGOS");
        etiquetaVikingos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaVikingos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaVikingosMouseEntered(evt);
            }
        });

        etiquetaTheWalkingDead.setText("The Walking Dead");
        etiquetaTheWalkingDead.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaTheWalkingDead.setMaximumSize(new java.awt.Dimension(59, 20));
        etiquetaTheWalkingDead.setMinimumSize(new java.awt.Dimension(59, 20));
        etiquetaTheWalkingDead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaTheWalkingDeadMouseEntered(evt);
            }
        });

        etiquetaLaCasaDePapel.setText("La casa de papel");
        etiquetaLaCasaDePapel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaLaCasaDePapel.setMaximumSize(new java.awt.Dimension(59, 20));
        etiquetaLaCasaDePapel.setMinimumSize(new java.awt.Dimension(59, 20));
        etiquetaLaCasaDePapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaLaCasaDePapelMouseEntered(evt);
            }
        });

        etiquetaMensajeSerie.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        etiquetaMensajeSerie.setForeground(new java.awt.Color(255, 250, 240));
        etiquetaMensajeSerie.setText("Series que quizas hayas visto.....");

        etiquetaBlindspot.setText("Blindspot");
        etiquetaBlindspot.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaBlindspot.setMaximumSize(new java.awt.Dimension(59, 20));
        etiquetaBlindspot.setMinimumSize(new java.awt.Dimension(59, 20));
        etiquetaBlindspot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaBlindspotMouseEntered(evt);
            }
        });

        etiquetaLos100.setText("Los 100");
        etiquetaLos100.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaLos100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaLos100MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelSeriesLayout = new javax.swing.GroupLayout(panelSeries);
        panelSeries.setLayout(panelSeriesLayout);
        panelSeriesLayout.setHorizontalGroup(
            panelSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeriesLayout.createSequentialGroup()
                .addGroup(panelSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSeriesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(etiquetaMensajeSerie))
                    .addGroup(panelSeriesLayout.createSequentialGroup()
                        .addComponent(etiquetaVikingos, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaTheWalkingDead, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaBlindspot, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLaCasaDePapel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLos100, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSeriesLayout.setVerticalGroup(
            panelSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeriesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etiquetaMensajeSerie)
                .addGap(20, 20, 20)
                .addGroup(panelSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelSeriesLayout.createSequentialGroup()
                            .addComponent(etiquetaLos100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(2, 2, 2))
                        .addGroup(panelSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaBlindspot, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSeriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etiquetaVikingos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etiquetaTheWalkingDead, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(etiquetaLaCasaDePapel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panelPeliculas.setBackground(new java.awt.Color(0, 0, 0));

        etiquetaMensajePelicula.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        etiquetaMensajePelicula.setForeground(new java.awt.Color(255, 250, 240));
        etiquetaMensajePelicula.setText("Peliculas que quizas hayas visto....");

        etiquetaVengadores.setText("Los vengadores");
        etiquetaVengadores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaVengadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaVengadoresMouseEntered(evt);
            }
        });

        etiquetaInterestelar.setText("Interestelar");
        etiquetaInterestelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaInterestelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaInterestelarMouseEntered(evt);
            }
        });

        etiquetaFrargmentado.setText("Fragmentado");
        etiquetaFrargmentado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaFrargmentado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaFrargmentadoMouseEntered(evt);
            }
        });

        etiquetaBirdBox.setText("Bird Box");
        etiquetaBirdBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaBirdBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaBirdBoxMouseEntered(evt);
            }
        });

        etiquetaLaPurga.setText("La purga");
        etiquetaLaPurga.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        etiquetaLaPurga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiquetaLaPurgaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelPeliculasLayout = new javax.swing.GroupLayout(panelPeliculas);
        panelPeliculas.setLayout(panelPeliculasLayout);
        panelPeliculasLayout.setHorizontalGroup(
            panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeliculasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPeliculasLayout.createSequentialGroup()
                        .addComponent(etiquetaMensajePelicula)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPeliculasLayout.createSequentialGroup()
                        .addComponent(etiquetaVengadores, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaInterestelar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaFrargmentado, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaBirdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaLaPurga, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        panelPeliculasLayout.setVerticalGroup(
            panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeliculasLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(etiquetaMensajePelicula)
                .addGap(18, 18, 18)
                .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaInterestelar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPeliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaFrargmentado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etiquetaBirdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etiquetaLaPurga, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaVengadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelMenu.setBackground(new java.awt.Color(0, 0, 0));

        etiquetaTitulo.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaTitulo.setText("RedFlix");

        etiquetaBuscar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        etiquetaBuscar.setForeground(new java.awt.Color(255, 250, 250));
        etiquetaBuscar.setText("Buscar");

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        buscar.setText("jLabel6");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(etiquetaTitulo))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBuscar)
                            .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSeries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jTabbedPane1.addTab("Inicio", panelInicio);

        panelContenidos.setBackground(new java.awt.Color(0, 0, 0));

        etiquetaContenidos.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        etiquetaContenidos.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaContenidos.setText("Todos los contenidos de Redflix");

        tablaContenidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        tablaContenidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Director", "Año", "Categoria", "Temporadas", "Capitulos"
            }
        ));
        jScrollPane1.setViewportView(tablaContenidos);

        botonActualizar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenidosLayout = new javax.swing.GroupLayout(panelContenidos);
        panelContenidos.setLayout(panelContenidosLayout);
        panelContenidosLayout.setHorizontalGroup(
            panelContenidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidosLayout.createSequentialGroup()
                .addGroup(panelContenidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidosLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(etiquetaContenidos))
                    .addGroup(panelContenidosLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenidosLayout.createSequentialGroup()
                        .addGap(587, 587, 587)
                        .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        panelContenidosLayout.setVerticalGroup(
            panelContenidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(etiquetaContenidos)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(botonActualizar)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contenidos", panelContenidos);

        panelAgregar.setBackground(new java.awt.Color(0, 0, 0));
        panelAgregar.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), java.awt.Color.red, java.awt.Color.red));

        etiquetaAgregarPelicula.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        etiquetaAgregarPelicula.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaAgregarPelicula.setText("Agregar Pelicula");

        etiquetaAddTitulo.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddTitulo.setText("Titulo");

        agregarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTituloActionPerformed(evt);
            }
        });

        etiquetaAddDirector.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddDirector.setText("Director");

        etiquetaAddAnio.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddAnio.setText("Año");

        etiquetaAddGenero.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddGenero.setText("Género");

        contenidoCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Ciencia Ficción", "Terror", "Comedia", "Drama", "Acción" }));

        AgregarPelicula.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        AgregarPelicula.setText("Agregar");
        AgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPeliculaActionPerformed(evt);
            }
        });

        limpiarAgregarPelicula.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        limpiarAgregarPelicula.setText("Cancelar");
        limpiarAgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarAgregarPeliculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(AgregarPelicula)
                        .addGap(49, 49, 49)
                        .addComponent(limpiarAgregarPelicula)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaAddTitulo)
                            .addComponent(etiquetaAddDirector)
                            .addComponent(etiquetaAddAnio)
                            .addComponent(etiquetaAddGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarAño, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contenidoCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(89, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(etiquetaAgregarPelicula)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAddTitulo)
                    .addComponent(agregarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAddDirector))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaAddAnio)
                    .addComponent(agregarAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaAddGenero)
                    .addComponent(contenidoCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarPelicula)
                    .addComponent(limpiarAgregarPelicula))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(128, 0, 0));
        jLabel6.setText("Agregar Serie");

        etiquetaAddTitulo1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddTitulo1.setText("Titulo");

        etiquetaAddDirector1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddDirector1.setText("Director");

        etiquetaAddAnio1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddAnio1.setText("Año");

        etiquetaAddGenero1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddGenero1.setText("Género");

        etiquetaAddTemporadas.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddTemporadas.setText("Temporadas");

        etiquetaAddCapitulos.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaAddCapitulos.setText("Capitulos");

        JcomboCategoriaSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Ciencia Ficción", "Terror", "Comedia", "Drama", "Acción" }));

        agregarSerie.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        agregarSerie.setText("Agregar");
        agregarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarSerieActionPerformed(evt);
            }
        });

        limpiarAgregarSerie.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        limpiarAgregarSerie.setText("Cancelar");
        limpiarAgregarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarAgregarSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaAddDirector1)
                    .addComponent(etiquetaAddCapitulos)
                    .addComponent(etiquetaAddAnio1)
                    .addComponent(etiquetaAddGenero1)
                    .addComponent(etiquetaAddTemporadas)
                    .addComponent(etiquetaAddTitulo1))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JcomboCategoriaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtextTituloSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(JtextDirectorSerie)
                    .addComponent(JtextAnioSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JtextCapitulosSerie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                        .addComponent(JtextTemporadasSerie, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(agregarSerie)
                        .addGap(60, 60, 60)
                        .addComponent(limpiarAgregarSerie)))
                .addGap(146, 187, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtextTituloSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAddTitulo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtextDirectorSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAddDirector1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAddAnio1)
                    .addComponent(JtextAnioSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAddGenero1)
                    .addComponent(JcomboCategoriaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAddTemporadas)
                    .addComponent(JtextTemporadasSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaAddCapitulos)
                    .addComponent(JtextCapitulosSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarSerie)
                    .addComponent(limpiarAgregarSerie))
                .addGap(35, 35, 35))
        );

        etiquetaAgregarContenido.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        etiquetaAgregarContenido.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaAgregarContenido.setText("Agregar contenido RedFlix");

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(etiquetaAgregarContenido)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(etiquetaAgregarContenido)
                .addGap(80, 80, 80)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", panelAgregar);

        panelActualizar.setBackground(new java.awt.Color(0, 0, 0));

        panelActualizarSerie.setBackground(new java.awt.Color(255, 255, 255));
        panelActualizarSerie.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));

        etiquetaActualizarSerie.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        etiquetaActualizarSerie.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaActualizarSerie.setText("Actualizar Serie");

        etiquetaUpdateId1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaUpdateId1.setText("ID");

        etiquetaActualizarTitulo1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaActualizarTitulo1.setText("Titulo");

        updateId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateIdActionPerformed(evt);
            }
        });

        etiquetaDatosActualizarS.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        etiquetaDatosActualizarS.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaDatosActualizarS.setText("Datos para actualizar");

        etiquetaActualizarDirector1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaActualizarDirector1.setText("Director");

        etiquetaActualizarTemp.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaActualizarTemp.setText("Temporadas");

        etiquetaActualizarCap.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaActualizarCap.setText("Capitulos");

        ActualizarSerie.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        ActualizarSerie.setText("Actualizar");
        ActualizarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarSerieActionPerformed(evt);
            }
        });

        limpiarDatosUpdateS.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        limpiarDatosUpdateS.setText("Cancelar");
        limpiarDatosUpdateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarDatosUpdateSActionPerformed(evt);
            }
        });

        cargarSerieUpdate.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        cargarSerieUpdate.setText("Cargar");
        cargarSerieUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarSerieUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActualizarSerieLayout = new javax.swing.GroupLayout(panelActualizarSerie);
        panelActualizarSerie.setLayout(panelActualizarSerieLayout);
        panelActualizarSerieLayout.setHorizontalGroup(
            panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarSerieLayout.createSequentialGroup()
                .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelActualizarSerieLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ActualizarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limpiarDatosUpdateS, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelActualizarSerieLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaActualizarDirector1)
                            .addComponent(etiquetaActualizarTemp)
                            .addComponent(etiquetaActualizarCap)
                            .addComponent(etiquetaActualizarTitulo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(updateCapitulos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(updatetemporadas, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(updateTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
            .addGroup(panelActualizarSerieLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(etiquetaUpdateId1)
                .addGap(74, 74, 74)
                .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaDatosActualizarS)
                    .addGroup(panelActualizarSerieLayout.createSequentialGroup()
                        .addComponent(updateId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(cargarSerieUpdate))
                    .addComponent(etiquetaActualizarSerie))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelActualizarSerieLayout.setVerticalGroup(
            panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarSerieLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etiquetaActualizarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaUpdateId1)
                    .addComponent(updateId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargarSerieUpdate))
                .addGap(37, 37, 37)
                .addComponent(etiquetaDatosActualizarS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaActualizarTitulo1)
                    .addComponent(updateTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaActualizarDirector1)
                    .addComponent(updateDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaActualizarTemp)
                    .addComponent(updatetemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaActualizarCap)
                    .addComponent(updateCapitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelActualizarSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarSerie)
                    .addComponent(limpiarDatosUpdateS))
                .addGap(29, 29, 29))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));

        etiquetaActualizarPelicula.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        etiquetaActualizarPelicula.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaActualizarPelicula.setText("Actualizar Pelicula");

        etiquetaUpdateId.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaUpdateId.setText("ID");

        etiquetaActualizarTitulo.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaActualizarTitulo.setText("Titulo");

        tituloActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActualizarActionPerformed(evt);
            }
        });

        etiquetaDatosActualizarP.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        etiquetaDatosActualizarP.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaDatosActualizarP.setText("Datos para Actualizar");

        etiquetaActualizarDirector.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaActualizarDirector.setText("Director");

        ActualizarPelicula.setText("Actualizar");
        ActualizarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarPeliculaActionPerformed(evt);
            }
        });

        limpiarDatosUpdateP.setText("Cancelar");
        limpiarDatosUpdateP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarDatosUpdatePActionPerformed(evt);
            }
        });

        cargarPeliculaUpdate.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        cargarPeliculaUpdate.setText("Cargar");
        cargarPeliculaUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPeliculaUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(etiquetaUpdateId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(IdActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(cargarPeliculaUpdate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(etiquetaActualizarDirector)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ActualizarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(limpiarDatosUpdateP, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(directorActualizar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(etiquetaActualizarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tituloActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaDatosActualizarP)
                    .addComponent(etiquetaActualizarPelicula))
                .addGap(109, 109, 109))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(etiquetaActualizarPelicula)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaUpdateId)
                    .addComponent(IdActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargarPeliculaUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(etiquetaDatosActualizarP)
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaActualizarTitulo))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaActualizarDirector))
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarPelicula)
                    .addComponent(limpiarDatosUpdateP))
                .addGap(36, 36, 36))
        );

        etiquetaActualizarContenido.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        etiquetaActualizarContenido.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaActualizarContenido.setText("Actualizar contenidos RedFlix");

        javax.swing.GroupLayout panelActualizarLayout = new javax.swing.GroupLayout(panelActualizar);
        panelActualizar.setLayout(panelActualizarLayout);
        panelActualizarLayout.setHorizontalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaActualizarContenido)
                .addGap(374, 374, 374))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(panelActualizarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        panelActualizarLayout.setVerticalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(etiquetaActualizarContenido)
                .addGap(62, 62, 62)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelActualizarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actualizar", panelActualizar);

        PanelEliminar.setBackground(new java.awt.Color(0, 0, 0));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));

        etiquetaEliminar.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        etiquetaEliminar.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaEliminar.setText("Eliminar Contenido");

        etiquetaIdEliminar.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaIdEliminar.setText("ID");

        etiquetaTituloEliminar.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        etiquetaTituloEliminar.setText("Titulo");

        borrarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarTituloActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonLimpiarBorrar.setText("Cancelar");
        botonLimpiarBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarBorrarActionPerformed(evt);
            }
        });

        cargarEliminar.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        cargarEliminar.setText("Cargar");
        cargarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(etiquetaEliminar))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTituloEliminar)
                            .addComponent(etiquetaIdEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(borrarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(idBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cargarEliminar)
                                .addGap(19, 19, 19)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonBorrar)
                .addGap(18, 18, 18)
                .addComponent(botonLimpiarBorrar)
                .addGap(49, 49, 49))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaEliminar)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaIdEliminar)
                        .addComponent(idBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cargarEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTituloEliminar)
                    .addComponent(borrarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrar)
                    .addComponent(botonLimpiarBorrar))
                .addGap(40, 40, 40))
        );

        etiquetaEliminarContenido.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        etiquetaEliminarContenido.setForeground(new java.awt.Color(128, 0, 0));
        etiquetaEliminarContenido.setText("Eliminar contenido RedFlix");

        javax.swing.GroupLayout PanelEliminarLayout = new javax.swing.GroupLayout(PanelEliminar);
        PanelEliminar.setLayout(PanelEliminarLayout);
        PanelEliminarLayout.setHorizontalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarLayout.createSequentialGroup()
                .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(etiquetaEliminarContenido)))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        PanelEliminarLayout.setVerticalGroup(
            PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEliminarLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(etiquetaEliminarContenido)
                .addGap(87, 87, 87)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", PanelEliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Agregar, Actualizar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento boton limpiar contenido agregar pelicula
    private void limpiarAgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarAgregarPeliculaActionPerformed

        agregarTitulo.setText("");
        agregarDirector.setText("");
        agregarAño.setText("");
    }//GEN-LAST:event_limpiarAgregarPeliculaActionPerformed

    //Evento boton agregar pelicula a la BD
    private void AgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPeliculaActionPerformed

        MovieController controlador = new MovieController();

        String titulo = agregarTitulo.getText();
        String director = agregarDirector.getText();
        int anio = Integer.parseInt(agregarAño.getText());
        String categoria = contenidoCategoria1.getSelectedItem().toString();

        PeliculaModel pelicula = new PeliculaModel(titulo, director, anio, categoria);
        controlador.saveContenido(pelicula);
        JOptionPane.showMessageDialog(jMenu2, "La pelicula " + titulo + " se agregó correctamente");
    }//GEN-LAST:event_AgregarPeliculaActionPerformed

    private void agregarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarTituloActionPerformed

    //Evento boton limpiar contenido actualizar pelicula
    private void limpiarDatosUpdateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarDatosUpdateSActionPerformed
        updateId.setText("");
        updateTitulo.setText("");
        updateDirector.setText("");
        updatetemporadas.setText("");
        updateCapitulos.setText("");
    }//GEN-LAST:event_limpiarDatosUpdateSActionPerformed

    //Evento boton actualizar datos serie de la BD
    private void ActualizarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarSerieActionPerformed
        MovieController controlador = new MovieController();

        int id = Integer.parseInt(updateId.getText());
        String titulo = updateTitulo.getText();
        String director = updateDirector.getText();
        int temporadas = Integer.parseInt(updatetemporadas.getText());
        int capitulos = Integer.parseInt(updateCapitulos.getText());
        
        PeliculaModel pelicula = new PeliculaModel(id, titulo, director, temporadas, capitulos);
        controlador.updateContenidoSerie(pelicula);
    }//GEN-LAST:event_ActualizarSerieActionPerformed

    private void updateIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateIdActionPerformed

    //Evento boton agregar serie a la BD
    private void agregarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarSerieActionPerformed

        MovieController controlador = new MovieController();

        String titulo = JtextTituloSerie.getText();
        String director = JtextDirectorSerie.getText();
        int anio = Integer.parseInt(JtextAnioSerie.getText());
        String categoria = JcomboCategoriaSerie.getSelectedItem().toString();
        int temporadas = Integer.parseInt(JtextTemporadasSerie.getText());
        int capitulos = Integer.parseInt(JtextCapitulosSerie.getText());

        PeliculaModel serie = new PeliculaModel(titulo, director, anio, categoria, temporadas, capitulos);
        controlador.saveContenido(serie);
        JOptionPane.showMessageDialog(jMenu2, "La serie " + titulo + " se agregó correctamente");
    }//GEN-LAST:event_agregarSerieActionPerformed

    //Evento boton actualizar datos pelicula de la BD
    private void ActualizarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarPeliculaActionPerformed
        MovieController controlador = new MovieController();

        int id = Integer.parseInt(IdActualizar.getText());
        String titulo = tituloActualizar.getText();
        String director = directorActualizar.getText();

        PeliculaModel pelicula = new PeliculaModel(id, titulo, director);
        controlador.updateContenidoPelicula(pelicula);
    }//GEN-LAST:event_ActualizarPeliculaActionPerformed

    //Evento boton borrar datos contenido de la BD
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // TODO add your handling code here:
        MovieController controlador = new MovieController();
        int id = Integer.parseInt(idBorrar.getText());
        String titulo = borrarTitulo.getText();

        controlador.deleteContenido(id);

    }//GEN-LAST:event_botonBorrarActionPerformed

    private void tituloActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActualizarActionPerformed

    //Evento boton limpiar contenido actualizar pelicula
    private void limpiarDatosUpdatePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarDatosUpdatePActionPerformed
        IdActualizar.setText("");
        tituloActualizar.setText("");
        directorActualizar.setText("");
    }//GEN-LAST:event_limpiarDatosUpdatePActionPerformed

    //Evento para actualizar contenidos
    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed

        MovieController controlador = new MovieController();
        ArrayList<PeliculaModel> contenidos = controlador.getContenido();

        DefaultTableModel m = (DefaultTableModel) tablaContenidos.getModel();

        int totalFilas = m.getRowCount();
        //borrar de atras hacia adelante
        for (int i = totalFilas - 1; i >= 0; i--) {
            m.removeRow(i);
        }

        for (PeliculaModel p : contenidos) {
            m.addRow(new Object[]{p.getContenidoId(), p.getContenidoTitulo(), p.getContenidoDirector(),
                 p.getContenidoAnio(), p.getContenidoCategoria(), p.getContenidoTemporadas(), p.getContenidoCapitulo()});
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    //Evento boton limpiar contenido borrar 
    private void botonLimpiarBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarBorrarActionPerformed
        // TODO add your handling code here:
        idBorrar.setText("");
        borrarTitulo.setText("");

    }//GEN-LAST:event_botonLimpiarBorrarActionPerformed

    //Evento etiqueta buscar contenido por titulo
    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked

        MovieController controlador = new MovieController();
        String titulo = busqueda.getText();

        PeliculaModel p = controlador.getContenidoTitulo(titulo);
        DefaultTableModel m = (DefaultTableModel) tablaContenidos.getModel();

        int totalFilas = m.getRowCount();
        for (int i = totalFilas - 1; i >= 0; i--) {
            m.removeRow(i);
        }
        if (totalFilas < 1) {
            jTabbedPane1.setSelectedIndex(0);
        } else {
            jTabbedPane1.setSelectedIndex(1);
        }

        m.addRow(new Object[]{p.getContenidoId(), p.getContenidoTitulo(), p.getContenidoDirector(),
             p.getContenidoAnio(), p.getContenidoCategoria(), p.getContenidoTemporadas(), p.getContenidoCapitulo()});
    }//GEN-LAST:event_buscarMouseClicked

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaActionPerformed

    private void etiquetaVengadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaVengadoresMouseEntered
        // TODO add your handling code here:
        etiquetaVengadores.setToolTipText("Los vengadores");
    }//GEN-LAST:event_etiquetaVengadoresMouseEntered

    private void etiquetaInterestelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaInterestelarMouseEntered
        // TODO add your handling code here:
        etiquetaInterestelar.setToolTipText("Interestelar");
    }//GEN-LAST:event_etiquetaInterestelarMouseEntered

    private void etiquetaFrargmentadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaFrargmentadoMouseEntered
        // TODO add your handling code here:
        etiquetaFrargmentado.setToolTipText("Fragmentado");

    }//GEN-LAST:event_etiquetaFrargmentadoMouseEntered

    private void etiquetaBirdBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaBirdBoxMouseEntered
        // TODO add your handling code here:
        etiquetaBirdBox.setToolTipText("Bridbox");
    }//GEN-LAST:event_etiquetaBirdBoxMouseEntered

    private void etiquetaLaPurgaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaLaPurgaMouseEntered
        // TODO add your handling code here:
        etiquetaLaPurga.setToolTipText("The purge");

    }//GEN-LAST:event_etiquetaLaPurgaMouseEntered

    private void etiquetaVikingosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaVikingosMouseEntered
        // TODO add your handling code here:
        etiquetaVikingos.setToolTipText("Vikingos");
    }//GEN-LAST:event_etiquetaVikingosMouseEntered

    private void etiquetaTheWalkingDeadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaTheWalkingDeadMouseEntered
        // TODO add your handling code here:
        etiquetaTheWalkingDead.setToolTipText("The walking dead");
    }//GEN-LAST:event_etiquetaTheWalkingDeadMouseEntered

    private void etiquetaBlindspotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaBlindspotMouseEntered
        // TODO add your handling code here:
        etiquetaBlindspot.setToolTipText("Blindspot");
    }//GEN-LAST:event_etiquetaBlindspotMouseEntered

    private void etiquetaLaCasaDePapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaLaCasaDePapelMouseEntered
        // TODO add your handling code here:
        etiquetaLaCasaDePapel.setToolTipText("La casa de papel");
    }//GEN-LAST:event_etiquetaLaCasaDePapelMouseEntered

    private void etiquetaLos100MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaLos100MouseEntered
        // TODO add your handling code here:
        etiquetaLos100.setToolTipText("Los 100");

    }//GEN-LAST:event_etiquetaLos100MouseEntered

    //Evento boton limpiar contenido agregar serie
    private void limpiarAgregarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarAgregarSerieActionPerformed
        JtextTituloSerie.setText("");
        JtextDirectorSerie.setText("");
        JtextAnioSerie.setText("");
        directorActualizar.setText("");
        JtextTemporadasSerie.setText("");
        JtextCapitulosSerie.setText("");
    }//GEN-LAST:event_limpiarAgregarSerieActionPerformed

    //Evento boton cargar datos by ID para actualizar serie
    private void cargarSerieUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarSerieUpdateActionPerformed
        MovieController controlador = new MovieController();
        
        String idString = updateId.getText();
        int id = Integer.parseInt(idString);

        PeliculaModel p = controlador.getContenidoId(id);

        updateTitulo.setText(p.getContenidoTitulo());
        updateDirector.setText(p.getContenidoDirector());
        int temporada = p.getContenidoTemporadas();
        String temp = temporada + "";
        updatetemporadas.setText(temp);
        int capitulo = p.getContenidoCapitulo();
        String cap = capitulo + "";
        updateCapitulos.setText(cap);
    }//GEN-LAST:event_cargarSerieUpdateActionPerformed

    //Evento boton cargar datos by ID para actualizar pelicula
    private void cargarPeliculaUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPeliculaUpdateActionPerformed
        MovieController controlador = new MovieController();

        String idString = IdActualizar.getText();
        int id = Integer.parseInt(idString);

        PeliculaModel p = controlador.getContenidoId(id);

        tituloActualizar.setText(p.getContenidoTitulo());
        directorActualizar.setText(p.getContenidoDirector());

    }//GEN-LAST:event_cargarPeliculaUpdateActionPerformed

    //Evento boton cargar datos by ID para borrar contenido
    private void cargarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarEliminarActionPerformed
        // TODO add your handling code here:
        MovieController controlador = new MovieController();
        
        String idString = idBorrar.getText();
        int id = Integer.parseInt(idString);

        PeliculaModel p = controlador.getContenidoId(id);
        
        borrarTitulo.setText(p.getContenidoTitulo());
    }//GEN-LAST:event_cargarEliminarActionPerformed

    private void borrarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrarTituloActionPerformed

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
            java.util.logging.Logger.getLogger(Paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paneles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarPelicula;
    private javax.swing.JButton ActualizarSerie;
    private javax.swing.JButton AgregarPelicula;
    private javax.swing.JTextField IdActualizar;
    private javax.swing.JComboBox<String> JcomboCategoriaSerie;
    private javax.swing.JTextField JtextAnioSerie;
    private javax.swing.JTextField JtextCapitulosSerie;
    private javax.swing.JTextField JtextDirectorSerie;
    private javax.swing.JTextField JtextTemporadasSerie;
    private javax.swing.JTextField JtextTituloSerie;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JTextField agregarAño;
    private javax.swing.JTextField agregarDirector;
    private javax.swing.JButton agregarSerie;
    private javax.swing.JTextField agregarTitulo;
    private javax.swing.JTextField borrarTitulo;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonLimpiarBorrar;
    private javax.swing.JLabel buscar;
    private javax.swing.JTextField busqueda;
    private javax.swing.JButton cargarEliminar;
    private javax.swing.JButton cargarPeliculaUpdate;
    private javax.swing.JButton cargarSerieUpdate;
    private javax.swing.JComboBox<String> contenidoCategoria1;
    private javax.swing.JTextField directorActualizar;
    private javax.swing.JLabel etiquetaActualizarCap;
    private javax.swing.JLabel etiquetaActualizarContenido;
    private javax.swing.JLabel etiquetaActualizarDirector;
    private javax.swing.JLabel etiquetaActualizarDirector1;
    private javax.swing.JLabel etiquetaActualizarPelicula;
    private javax.swing.JLabel etiquetaActualizarSerie;
    private javax.swing.JLabel etiquetaActualizarTemp;
    private javax.swing.JLabel etiquetaActualizarTitulo;
    private javax.swing.JLabel etiquetaActualizarTitulo1;
    private javax.swing.JLabel etiquetaAddAnio;
    private javax.swing.JLabel etiquetaAddAnio1;
    private javax.swing.JLabel etiquetaAddCapitulos;
    private javax.swing.JLabel etiquetaAddDirector;
    private javax.swing.JLabel etiquetaAddDirector1;
    private javax.swing.JLabel etiquetaAddGenero;
    private javax.swing.JLabel etiquetaAddGenero1;
    private javax.swing.JLabel etiquetaAddTemporadas;
    private javax.swing.JLabel etiquetaAddTitulo;
    private javax.swing.JLabel etiquetaAddTitulo1;
    private javax.swing.JLabel etiquetaAgregarContenido;
    private javax.swing.JLabel etiquetaAgregarPelicula;
    private javax.swing.JLabel etiquetaBirdBox;
    private javax.swing.JLabel etiquetaBlindspot;
    private javax.swing.JLabel etiquetaBuscar;
    private javax.swing.JLabel etiquetaContenidos;
    private javax.swing.JLabel etiquetaDatosActualizarP;
    private javax.swing.JLabel etiquetaDatosActualizarS;
    private javax.swing.JLabel etiquetaEliminar;
    private javax.swing.JLabel etiquetaEliminarContenido;
    private javax.swing.JLabel etiquetaFrargmentado;
    private javax.swing.JLabel etiquetaIdEliminar;
    private javax.swing.JLabel etiquetaInterestelar;
    private javax.swing.JLabel etiquetaLaCasaDePapel;
    private javax.swing.JLabel etiquetaLaPurga;
    private javax.swing.JLabel etiquetaLos100;
    private javax.swing.JLabel etiquetaMensajePelicula;
    private javax.swing.JLabel etiquetaMensajeSerie;
    private javax.swing.JLabel etiquetaTheWalkingDead;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTituloEliminar;
    private javax.swing.JLabel etiquetaUpdateId;
    private javax.swing.JLabel etiquetaUpdateId1;
    private javax.swing.JLabel etiquetaVengadores;
    private javax.swing.JLabel etiquetaVikingos;
    private javax.swing.JTextField idBorrar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiarAgregarPelicula;
    private javax.swing.JButton limpiarAgregarSerie;
    private javax.swing.JButton limpiarDatosUpdateP;
    private javax.swing.JButton limpiarDatosUpdateS;
    private javax.swing.JPanel panelActualizar;
    private javax.swing.JPanel panelActualizarSerie;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelContenidos;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPeliculas;
    private javax.swing.JPanel panelSeries;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaContenidos;
    private javax.swing.JTextField tituloActualizar;
    private javax.swing.JTextField updateCapitulos;
    private javax.swing.JTextField updateDirector;
    private javax.swing.JTextField updateId;
    private javax.swing.JTextField updateTitulo;
    private javax.swing.JTextField updatetemporadas;
    // End of variables declaration//GEN-END:variables
}
