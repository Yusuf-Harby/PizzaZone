package A_Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class J_EditMenu extends javax.swing.JFrame {

    String item;
    double NewPrice;

    public J_EditMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        item = "";
        NewPrice = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        NewPrice_txtfield = new javax.swing.JTextField();
        Save_button = new javax.swing.JButton();
        Menu = new javax.swing.JTabbedPane();
        Eastern_ScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        E_MincedMeat = new javax.swing.JToggleButton();
        E_Meat = new javax.swing.JToggleButton();
        E_KoftaPizza = new javax.swing.JToggleButton();
        E_GrilledChicken = new javax.swing.JToggleButton();
        E_Vegetables = new javax.swing.JToggleButton();
        E_Shrimp = new javax.swing.JToggleButton();
        E_LocalSausage = new javax.swing.JToggleButton();
        E_SmokedMeat = new javax.swing.JToggleButton();
        E_Salami = new javax.swing.JToggleButton();
        E_Cheese = new javax.swing.JToggleButton();
        E_OlivePizza = new javax.swing.JToggleButton();
        E_Tuna = new javax.swing.JToggleButton();
        E_BeefShawarma = new javax.swing.JToggleButton();
        E_Shawarma = new javax.swing.JToggleButton();
        E_LiverPizza = new javax.swing.JToggleButton();
        Italian_ScrollPane = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        I_Margherita = new javax.swing.JToggleButton();
        I_Pepperoni = new javax.swing.JToggleButton();
        I_Cheese = new javax.swing.JToggleButton();
        I_Veggie = new javax.swing.JToggleButton();
        I_Hawaiian = new javax.swing.JToggleButton();
        I_BBQChicken = new javax.swing.JToggleButton();
        I_Seafood = new javax.swing.JToggleButton();
        I_Meat = new javax.swing.JToggleButton();
        I_Mushroom = new javax.swing.JToggleButton();
        I_Caprese = new javax.swing.JToggleButton();
        I_Carbonara = new javax.swing.JToggleButton();
        I_Pesto = new javax.swing.JToggleButton();
        Drinks_ScrollPane = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        OrangeJuice = new javax.swing.JButton();
        Lemonade = new javax.swing.JButton();
        MangoJuice = new javax.swing.JButton();
        Fruit_Punch = new javax.swing.JButton();
        IcedTea = new javax.swing.JButton();
        Cola = new javax.swing.JButton();
        Espresso = new javax.swing.JButton();
        Sprite = new javax.swing.JButton();
        Fanta = new javax.swing.JButton();
        Cappuccino = new javax.swing.JButton();
        Latte = new javax.swing.JButton();
        HotChocolate = new javax.swing.JButton();
        MilkShake = new javax.swing.JButton();
        IcedCoffee = new javax.swing.JButton();
        EspressoAffogato = new javax.swing.JButton();
        Extras_ScrollPane = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        FrenchFries = new javax.swing.JToggleButton();
        FriedZucchini = new javax.swing.JToggleButton();
        OnionRings = new javax.swing.JToggleButton();
        MozzarellaSticks = new javax.swing.JToggleButton();
        HummusWithPita = new javax.swing.JToggleButton();
        GarlicBread = new javax.swing.JToggleButton();
        StuffedVineLeaves = new javax.swing.JToggleButton();
        ChickenWings = new javax.swing.JToggleButton();
        CaesarSalad = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(65, 66, 58));

        jButton16.setBackground(new java.awt.Color(65, 66, 58));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dsa/pngwing.com (2) (2).png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 226, 210));
        jLabel8.setText("New Price");

        NewPrice_txtfield.setBackground(new java.awt.Color(236, 226, 210));
        NewPrice_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPrice_txtfieldActionPerformed(evt);
            }
        });

        Save_button.setBackground(new java.awt.Color(217, 100, 30));
        Save_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Save_button.setForeground(new java.awt.Color(236, 226, 210));
        Save_button.setText("Save");
        Save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_buttonActionPerformed(evt);
            }
        });

        Eastern_ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Eastern_ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        E_MincedMeat.setBackground(new java.awt.Color(217, 100, 30));
        E_MincedMeat.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_MincedMeat.setForeground(new java.awt.Color(236, 226, 210));
        E_MincedMeat.setText(" Minced Meat");
        E_MincedMeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_MincedMeatActionPerformed(evt);
            }
        });

        E_Meat.setBackground(new java.awt.Color(217, 100, 30));
        E_Meat.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_Meat.setForeground(new java.awt.Color(236, 226, 210));
        E_Meat.setText("Meat");
        E_Meat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_MeatActionPerformed(evt);
            }
        });

        E_KoftaPizza.setBackground(new java.awt.Color(217, 100, 30));
        E_KoftaPizza.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_KoftaPizza.setForeground(new java.awt.Color(236, 226, 210));
        E_KoftaPizza.setText("Kofta Pizza");
        E_KoftaPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_KoftaPizzaActionPerformed(evt);
            }
        });

        E_GrilledChicken.setBackground(new java.awt.Color(217, 100, 30));
        E_GrilledChicken.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        E_GrilledChicken.setForeground(new java.awt.Color(236, 226, 210));
        E_GrilledChicken.setText("Grilled Chicken");
        E_GrilledChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_GrilledChickenActionPerformed(evt);
            }
        });

        E_Vegetables.setBackground(new java.awt.Color(217, 100, 30));
        E_Vegetables.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_Vegetables.setForeground(new java.awt.Color(236, 226, 210));
        E_Vegetables.setText("Vegetables");
        E_Vegetables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_VegetablesActionPerformed(evt);
            }
        });

        E_Shrimp.setBackground(new java.awt.Color(217, 100, 30));
        E_Shrimp.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_Shrimp.setForeground(new java.awt.Color(236, 226, 210));
        E_Shrimp.setText("Shrimp");
        E_Shrimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_ShrimpActionPerformed(evt);
            }
        });

        E_LocalSausage.setBackground(new java.awt.Color(217, 100, 30));
        E_LocalSausage.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_LocalSausage.setForeground(new java.awt.Color(236, 226, 210));
        E_LocalSausage.setText("Local Sausage");
        E_LocalSausage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_LocalSausageActionPerformed(evt);
            }
        });

        E_SmokedMeat.setBackground(new java.awt.Color(217, 100, 30));
        E_SmokedMeat.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_SmokedMeat.setForeground(new java.awt.Color(236, 226, 210));
        E_SmokedMeat.setText("Smoked Meat");
        E_SmokedMeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_SmokedMeatActionPerformed(evt);
            }
        });

        E_Salami.setBackground(new java.awt.Color(217, 100, 30));
        E_Salami.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_Salami.setForeground(new java.awt.Color(236, 226, 210));
        E_Salami.setText("Salami");
        E_Salami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_SalamiActionPerformed(evt);
            }
        });

        E_Cheese.setBackground(new java.awt.Color(217, 100, 30));
        E_Cheese.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_Cheese.setForeground(new java.awt.Color(236, 226, 210));
        E_Cheese.setText("Cheese");
        E_Cheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_CheeseActionPerformed(evt);
            }
        });

        E_OlivePizza.setBackground(new java.awt.Color(217, 100, 30));
        E_OlivePizza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_OlivePizza.setForeground(new java.awt.Color(236, 226, 210));
        E_OlivePizza.setText("Olive Pizza");
        E_OlivePizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_OlivePizzaActionPerformed(evt);
            }
        });

        E_Tuna.setBackground(new java.awt.Color(217, 100, 30));
        E_Tuna.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_Tuna.setForeground(new java.awt.Color(236, 226, 210));
        E_Tuna.setText("Tuna");
        E_Tuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_TunaActionPerformed(evt);
            }
        });

        E_BeefShawarma.setBackground(new java.awt.Color(217, 100, 30));
        E_BeefShawarma.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_BeefShawarma.setForeground(new java.awt.Color(236, 226, 210));
        E_BeefShawarma.setText("<html> &nbsp;&nbsp;&nbsp;&nbsp; Beef <br>Shawarma  </html> ");
        E_BeefShawarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_BeefShawarmaActionPerformed(evt);
            }
        });

        E_Shawarma.setBackground(new java.awt.Color(217, 100, 30));
        E_Shawarma.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_Shawarma.setForeground(new java.awt.Color(236, 226, 210));
        E_Shawarma.setText(" Shawarma");
        E_Shawarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_ShawarmaActionPerformed(evt);
            }
        });

        E_LiverPizza.setBackground(new java.awt.Color(217, 100, 30));
        E_LiverPizza.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        E_LiverPizza.setForeground(new java.awt.Color(236, 226, 210));
        E_LiverPizza.setText("Liver Pizza");
        E_LiverPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_LiverPizzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E_BeefShawarma, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_KoftaPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_Salami, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(E_Meat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(E_MincedMeat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(E_Shawarma, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E_LiverPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(E_Tuna, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E_OlivePizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(E_Shrimp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E_SmokedMeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(E_Vegetables, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E_Cheese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(E_GrilledChicken)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E_LocalSausage)))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E_MincedMeat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_GrilledChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_LocalSausage, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E_Meat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_Vegetables, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_Cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E_KoftaPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_Shrimp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_SmokedMeat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E_Salami, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_Tuna, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E_OlivePizza, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(E_Shawarma, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(E_LiverPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(E_BeefShawarma, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Eastern_ScrollPane.setViewportView(jPanel1);

        Menu.addTab("Eastern Pizza", Eastern_ScrollPane);

        Italian_ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Italian_ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        I_Margherita.setBackground(new java.awt.Color(217, 100, 30));
        I_Margherita.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Margherita.setForeground(new java.awt.Color(236, 226, 210));
        I_Margherita.setText("Margherita");
        I_Margherita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_MargheritaActionPerformed(evt);
            }
        });

        I_Pepperoni.setBackground(new java.awt.Color(217, 100, 30));
        I_Pepperoni.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Pepperoni.setForeground(new java.awt.Color(236, 226, 210));
        I_Pepperoni.setText("Pepperoni");
        I_Pepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_PepperoniActionPerformed(evt);
            }
        });

        I_Cheese.setBackground(new java.awt.Color(217, 100, 30));
        I_Cheese.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Cheese.setForeground(new java.awt.Color(236, 226, 210));
        I_Cheese.setText("Cheese");
        I_Cheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_CheeseActionPerformed(evt);
            }
        });

        I_Veggie.setBackground(new java.awt.Color(217, 100, 30));
        I_Veggie.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Veggie.setForeground(new java.awt.Color(236, 226, 210));
        I_Veggie.setText("Veggie");
        I_Veggie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_VeggieActionPerformed(evt);
            }
        });

        I_Hawaiian.setBackground(new java.awt.Color(217, 100, 30));
        I_Hawaiian.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Hawaiian.setForeground(new java.awt.Color(236, 226, 210));
        I_Hawaiian.setText("Hawaiian");
        I_Hawaiian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_HawaiianActionPerformed(evt);
            }
        });

        I_BBQChicken.setBackground(new java.awt.Color(217, 100, 30));
        I_BBQChicken.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_BBQChicken.setForeground(new java.awt.Color(236, 226, 210));
        I_BBQChicken.setText("BBQ Chicken");
        I_BBQChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_BBQChickenActionPerformed(evt);
            }
        });

        I_Seafood.setBackground(new java.awt.Color(217, 100, 30));
        I_Seafood.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Seafood.setForeground(new java.awt.Color(236, 226, 210));
        I_Seafood.setText("Seafood");
        I_Seafood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_SeafoodActionPerformed(evt);
            }
        });

        I_Meat.setBackground(new java.awt.Color(217, 100, 30));
        I_Meat.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Meat.setForeground(new java.awt.Color(236, 226, 210));
        I_Meat.setText("Meat");
        I_Meat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_MeatActionPerformed(evt);
            }
        });

        I_Mushroom.setBackground(new java.awt.Color(217, 100, 30));
        I_Mushroom.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Mushroom.setForeground(new java.awt.Color(236, 226, 210));
        I_Mushroom.setText("Mushroom");
        I_Mushroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_MushroomActionPerformed(evt);
            }
        });

        I_Caprese.setBackground(new java.awt.Color(217, 100, 30));
        I_Caprese.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Caprese.setForeground(new java.awt.Color(236, 226, 210));
        I_Caprese.setText("Caprese");
        I_Caprese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_CapreseActionPerformed(evt);
            }
        });

        I_Carbonara.setBackground(new java.awt.Color(217, 100, 30));
        I_Carbonara.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Carbonara.setForeground(new java.awt.Color(236, 226, 210));
        I_Carbonara.setText("Carbonara");
        I_Carbonara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_CarbonaraActionPerformed(evt);
            }
        });

        I_Pesto.setBackground(new java.awt.Color(217, 100, 30));
        I_Pesto.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        I_Pesto.setForeground(new java.awt.Color(236, 226, 210));
        I_Pesto.setText("Pesto");
        I_Pesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_PestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(I_Caprese, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I_Carbonara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I_Pesto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(I_Mushroom, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(I_Meat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(I_Veggie, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(I_Hawaiian, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(I_Margherita, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(I_Pepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I_BBQChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I_Seafood, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I_Cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(I_Margherita, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_Pepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_Cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(I_Veggie, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_Hawaiian, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_BBQChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(I_Mushroom, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_Meat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_Seafood, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(I_Caprese, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_Carbonara, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_Pesto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        Italian_ScrollPane.setViewportView(jPanel2);

        Menu.addTab("Italian Pizza", Italian_ScrollPane);

        Drinks_ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Drinks_ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        OrangeJuice.setBackground(new java.awt.Color(217, 100, 30));
        OrangeJuice.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        OrangeJuice.setForeground(new java.awt.Color(236, 226, 210));
        OrangeJuice.setText("Orange Juice");
        OrangeJuice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrangeJuiceActionPerformed(evt);
            }
        });

        Lemonade.setBackground(new java.awt.Color(217, 100, 30));
        Lemonade.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Lemonade.setForeground(new java.awt.Color(236, 226, 210));
        Lemonade.setText("Lemonade");
        Lemonade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LemonadeActionPerformed(evt);
            }
        });

        MangoJuice.setBackground(new java.awt.Color(217, 100, 30));
        MangoJuice.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MangoJuice.setForeground(new java.awt.Color(236, 226, 210));
        MangoJuice.setText("Mango Juice");
        MangoJuice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MangoJuiceActionPerformed(evt);
            }
        });

        Fruit_Punch.setBackground(new java.awt.Color(217, 100, 30));
        Fruit_Punch.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Fruit_Punch.setForeground(new java.awt.Color(236, 226, 210));
        Fruit_Punch.setText("Fruit Punch");
        Fruit_Punch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fruit_PunchActionPerformed(evt);
            }
        });

        IcedTea.setBackground(new java.awt.Color(217, 100, 30));
        IcedTea.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        IcedTea.setForeground(new java.awt.Color(236, 226, 210));
        IcedTea.setText("Iced Tea");
        IcedTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedTeaActionPerformed(evt);
            }
        });

        Cola.setBackground(new java.awt.Color(217, 100, 30));
        Cola.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Cola.setForeground(new java.awt.Color(236, 226, 210));
        Cola.setText("Cola");
        Cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColaActionPerformed(evt);
            }
        });

        Espresso.setBackground(new java.awt.Color(217, 100, 30));
        Espresso.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Espresso.setForeground(new java.awt.Color(236, 226, 210));
        Espresso.setText("Espresso");
        Espresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspressoActionPerformed(evt);
            }
        });

        Sprite.setBackground(new java.awt.Color(217, 100, 30));
        Sprite.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Sprite.setForeground(new java.awt.Color(236, 226, 210));
        Sprite.setText("Sprite");
        Sprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpriteActionPerformed(evt);
            }
        });

        Fanta.setBackground(new java.awt.Color(217, 100, 30));
        Fanta.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Fanta.setForeground(new java.awt.Color(236, 226, 210));
        Fanta.setText("Fanta");
        Fanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FantaActionPerformed(evt);
            }
        });

        Cappuccino.setBackground(new java.awt.Color(217, 100, 30));
        Cappuccino.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Cappuccino.setForeground(new java.awt.Color(236, 226, 210));
        Cappuccino.setText("Cappuccino");
        Cappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CappuccinoActionPerformed(evt);
            }
        });

        Latte.setBackground(new java.awt.Color(217, 100, 30));
        Latte.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Latte.setForeground(new java.awt.Color(236, 226, 210));
        Latte.setText("Latte");
        Latte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LatteActionPerformed(evt);
            }
        });

        HotChocolate.setBackground(new java.awt.Color(217, 100, 30));
        HotChocolate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        HotChocolate.setForeground(new java.awt.Color(236, 226, 210));
        HotChocolate.setText("<html> &nbsp;&nbsp;&nbsp;&nbsp;Hot <br>  Chocolate </html> ");
        HotChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotChocolateActionPerformed(evt);
            }
        });

        MilkShake.setBackground(new java.awt.Color(217, 100, 30));
        MilkShake.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MilkShake.setForeground(new java.awt.Color(236, 226, 210));
        MilkShake.setText("Milk shake");
        MilkShake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkShakeActionPerformed(evt);
            }
        });

        IcedCoffee.setBackground(new java.awt.Color(217, 100, 30));
        IcedCoffee.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        IcedCoffee.setForeground(new java.awt.Color(236, 226, 210));
        IcedCoffee.setText("Iced Coffee");
        IcedCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedCoffeeActionPerformed(evt);
            }
        });

        EspressoAffogato.setBackground(new java.awt.Color(217, 100, 30));
        EspressoAffogato.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        EspressoAffogato.setForeground(new java.awt.Color(236, 226, 210));
        EspressoAffogato.setText("<html> Espresso<br> Affogato </html>");
        EspressoAffogato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspressoAffogatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sprite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fruit_Punch, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(IcedTea, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cola, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Espresso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(OrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lemonade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MangoJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MilkShake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cappuccino, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Latte, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HotChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(IcedCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EspressoAffogato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrangeJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lemonade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MangoJuice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cola, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IcedTea, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fruit_Punch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Sprite, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fanta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Espresso, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HotChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Latte, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IcedCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EspressoAffogato, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        Drinks_ScrollPane.setViewportView(jPanel3);

        Menu.addTab("Drinks", Drinks_ScrollPane);

        Extras_ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Extras_ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        FrenchFries.setBackground(new java.awt.Color(217, 100, 30));
        FrenchFries.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        FrenchFries.setForeground(new java.awt.Color(236, 226, 210));
        FrenchFries.setText("French Fries");
        FrenchFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrenchFriesActionPerformed(evt);
            }
        });

        FriedZucchini.setBackground(new java.awt.Color(217, 100, 30));
        FriedZucchini.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        FriedZucchini.setForeground(new java.awt.Color(236, 226, 210));
        FriedZucchini.setText("Fried Zucchini");
        FriedZucchini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FriedZucchiniActionPerformed(evt);
            }
        });

        OnionRings.setBackground(new java.awt.Color(217, 100, 30));
        OnionRings.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        OnionRings.setForeground(new java.awt.Color(236, 226, 210));
        OnionRings.setText("Onion Rings");
        OnionRings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnionRingsActionPerformed(evt);
            }
        });

        MozzarellaSticks.setBackground(new java.awt.Color(217, 100, 30));
        MozzarellaSticks.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        MozzarellaSticks.setForeground(new java.awt.Color(236, 226, 210));
        MozzarellaSticks.setText("<html>\nMozzarella<br>&nbsp;&nbsp; Sticks\n</html>\n");
        MozzarellaSticks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MozzarellaSticksActionPerformed(evt);
            }
        });

        HummusWithPita.setBackground(new java.awt.Color(217, 100, 30));
        HummusWithPita.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        HummusWithPita.setForeground(new java.awt.Color(236, 226, 210));
        HummusWithPita.setText("<html>\n&nbsp;&nbsp; Hummus <br>&nbsp;&nbsp; with Pita \n</html>");
        HummusWithPita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HummusWithPitaActionPerformed(evt);
            }
        });

        GarlicBread.setBackground(new java.awt.Color(217, 100, 30));
        GarlicBread.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        GarlicBread.setForeground(new java.awt.Color(236, 226, 210));
        GarlicBread.setText("Garlic Bread");
        GarlicBread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GarlicBreadActionPerformed(evt);
            }
        });

        StuffedVineLeaves.setBackground(new java.awt.Color(217, 100, 30));
        StuffedVineLeaves.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        StuffedVineLeaves.setForeground(new java.awt.Color(236, 226, 210));
        StuffedVineLeaves.setText("<html>\n&nbsp; &nbsp;Stuffed Vine Leaves\n</html>");
        StuffedVineLeaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuffedVineLeavesActionPerformed(evt);
            }
        });

        ChickenWings.setBackground(new java.awt.Color(217, 100, 30));
        ChickenWings.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ChickenWings.setForeground(new java.awt.Color(236, 226, 210));
        ChickenWings.setText("<html>\nChicken<br>&nbsp; Wings\n</html>");
        ChickenWings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenWingsActionPerformed(evt);
            }
        });

        CaesarSalad.setBackground(new java.awt.Color(217, 100, 30));
        CaesarSalad.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        CaesarSalad.setForeground(new java.awt.Color(236, 226, 210));
        CaesarSalad.setText("<html> &nbsp;&nbsp;Caesar <br>&nbsp;&nbsp;Salad  </html> ");
        CaesarSalad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaesarSaladActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FriedZucchini, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CaesarSalad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(FrenchFries, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HummusWithPita, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MozzarellaSticks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StuffedVineLeaves, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChickenWings, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(OnionRings, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GarlicBread)))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FrenchFries, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OnionRings, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GarlicBread, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MozzarellaSticks, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChickenWings, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaesarSalad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FriedZucchini, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HummusWithPita, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StuffedVineLeaves, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        Extras_ScrollPane.setViewportView(jPanel6);

        Menu.addTab("Extras", Extras_ScrollPane);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(NewPrice_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)))
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(NewPrice_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Save_button))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        E_AdminFrame a = new E_AdminFrame();
        a.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void NewPrice_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPrice_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPrice_txtfieldActionPerformed

    private void Save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_buttonActionPerformed

        String newPriceText = NewPrice_txtfield.getText();

        // Validate that the fields are not empty
        if (item.isEmpty() || newPriceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Item name and price cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            NewPrice = Double.parseDouble(newPriceText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid price format! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String url = "jdbc:mysql://localhost:3306/PIZZA_ZONE"; // Adjust your database URL
        String username = "root"; // Replace with your database username
        String password = "132025"; // Replace with your database password

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String query = "UPDATE MENU SET price = ? WHERE item_name = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, NewPrice);
            stmt.setString(2, item);

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Price updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Item not found in the menu.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error updating price: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        item = "";
    }//GEN-LAST:event_Save_buttonActionPerformed

    private void E_MincedMeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_MincedMeatActionPerformed
        item = "Eastern Minced Meat Pizza";
    }//GEN-LAST:event_E_MincedMeatActionPerformed

    private void E_MeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_MeatActionPerformed
        item = "Eastern Meat Pizza";
    }//GEN-LAST:event_E_MeatActionPerformed

    private void E_KoftaPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_KoftaPizzaActionPerformed
        item = "Eastern Kofta Pizza";
    }//GEN-LAST:event_E_KoftaPizzaActionPerformed

    private void E_GrilledChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_GrilledChickenActionPerformed
        item = "Eastern Grilled Chicken Pizza";
    }//GEN-LAST:event_E_GrilledChickenActionPerformed

    private void E_VegetablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_VegetablesActionPerformed
        item = "Eastern Vegetables Pizza";
    }//GEN-LAST:event_E_VegetablesActionPerformed

    private void E_ShrimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_ShrimpActionPerformed
        item = "Eastern Shrimp Pizza";
    }//GEN-LAST:event_E_ShrimpActionPerformed

    private void E_LocalSausageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_LocalSausageActionPerformed
        item = "Eastern Local Sausage Pizza";
    }//GEN-LAST:event_E_LocalSausageActionPerformed

    private void E_SmokedMeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_SmokedMeatActionPerformed
        item = "Eastern Smoked Meat Pizza";
    }//GEN-LAST:event_E_SmokedMeatActionPerformed

    private void E_SalamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_SalamiActionPerformed
        item = "Eastern Salami Pizza";
    }//GEN-LAST:event_E_SalamiActionPerformed

    private void E_CheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_CheeseActionPerformed
        item = "Eastern Cheese Pizza";
    }//GEN-LAST:event_E_CheeseActionPerformed

    private void E_OlivePizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_OlivePizzaActionPerformed
        item = "Eastern Olive Pizza";
    }//GEN-LAST:event_E_OlivePizzaActionPerformed

    private void E_TunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_TunaActionPerformed
        item = "Eastern Tuna Pizza";
    }//GEN-LAST:event_E_TunaActionPerformed

    private void E_BeefShawarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_BeefShawarmaActionPerformed
        item = "Eastern Beef Shawarma Pizza";
    }//GEN-LAST:event_E_BeefShawarmaActionPerformed

    private void E_ShawarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_ShawarmaActionPerformed
        item = "Eastern Shawarma Pizza";
    }//GEN-LAST:event_E_ShawarmaActionPerformed

    private void E_LiverPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_LiverPizzaActionPerformed
        item = "Eastern Liver Pizza";
    }//GEN-LAST:event_E_LiverPizzaActionPerformed

    private void I_MargheritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_MargheritaActionPerformed
        item = "Italian Margherita Pizza";
    }//GEN-LAST:event_I_MargheritaActionPerformed

    private void I_PepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_PepperoniActionPerformed
        item = "Italian Pepperoni Pizza";
    }//GEN-LAST:event_I_PepperoniActionPerformed

    private void I_CheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_CheeseActionPerformed
        item = "Italian Cheese Pizza";
    }//GEN-LAST:event_I_CheeseActionPerformed

    private void I_VeggieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_VeggieActionPerformed
        item = "Italian Veggie Pizza";
    }//GEN-LAST:event_I_VeggieActionPerformed

    private void I_HawaiianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_HawaiianActionPerformed
        item = "Italian Hawaiian Pizza";
    }//GEN-LAST:event_I_HawaiianActionPerformed

    private void I_BBQChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_BBQChickenActionPerformed
        item = "Italian BBQ Chicken Pizza";
    }//GEN-LAST:event_I_BBQChickenActionPerformed

    private void I_SeafoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_SeafoodActionPerformed
        item = "Italian Seafood Pizza";
    }//GEN-LAST:event_I_SeafoodActionPerformed

    private void I_MeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_MeatActionPerformed
        item = "Italian Meat Pizza";
    }//GEN-LAST:event_I_MeatActionPerformed

    private void I_MushroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_MushroomActionPerformed
        item = "Italian Mushroom Pizza";
    }//GEN-LAST:event_I_MushroomActionPerformed

    private void I_CapreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_CapreseActionPerformed
        item = "Italian Caprese Pizza";
    }//GEN-LAST:event_I_CapreseActionPerformed

    private void I_CarbonaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_CarbonaraActionPerformed
        item = "Italian Carbonara Pizza";
    }//GEN-LAST:event_I_CarbonaraActionPerformed

    private void I_PestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_PestoActionPerformed
        item = "Italian Pesto Pizza";
    }//GEN-LAST:event_I_PestoActionPerformed

    private void OrangeJuiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrangeJuiceActionPerformed
        item = "Orange Juice";
    }//GEN-LAST:event_OrangeJuiceActionPerformed

    private void LemonadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LemonadeActionPerformed
        item = "Lemonade";
    }//GEN-LAST:event_LemonadeActionPerformed

    private void MangoJuiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MangoJuiceActionPerformed
        item = "Mango Juice";
    }//GEN-LAST:event_MangoJuiceActionPerformed

    private void Fruit_PunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fruit_PunchActionPerformed
        item = "Fruit Punch";
    }//GEN-LAST:event_Fruit_PunchActionPerformed

    private void IcedTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedTeaActionPerformed
        item = "Iced Tea";
    }//GEN-LAST:event_IcedTeaActionPerformed

    private void ColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColaActionPerformed
        item = "Cola";
    }//GEN-LAST:event_ColaActionPerformed

    private void EspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspressoActionPerformed
        item = "Espresso";
    }//GEN-LAST:event_EspressoActionPerformed

    private void SpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpriteActionPerformed
        item = "Sprite";
    }//GEN-LAST:event_SpriteActionPerformed

    private void FantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FantaActionPerformed
        item = "Fanta";
    }//GEN-LAST:event_FantaActionPerformed

    private void CappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CappuccinoActionPerformed
        item = "Cappuccino";
    }//GEN-LAST:event_CappuccinoActionPerformed

    private void LatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LatteActionPerformed
        item = "Latte";
    }//GEN-LAST:event_LatteActionPerformed

    private void HotChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotChocolateActionPerformed
        item = "Hot Chocolate";
    }//GEN-LAST:event_HotChocolateActionPerformed

    private void MilkShakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkShakeActionPerformed
        item = "Milk Shake";
    }//GEN-LAST:event_MilkShakeActionPerformed

    private void IcedCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedCoffeeActionPerformed
        item = "Iced Coffee";
    }//GEN-LAST:event_IcedCoffeeActionPerformed

    private void EspressoAffogatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspressoAffogatoActionPerformed
        item = "Espresso Affogato";
    }//GEN-LAST:event_EspressoAffogatoActionPerformed

    private void FrenchFriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrenchFriesActionPerformed
        item = "French Fries";
    }//GEN-LAST:event_FrenchFriesActionPerformed

    private void FriedZucchiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FriedZucchiniActionPerformed
        item = "Fried Zucchini";
    }//GEN-LAST:event_FriedZucchiniActionPerformed

    private void OnionRingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnionRingsActionPerformed
        item = "Onion Rings";
    }//GEN-LAST:event_OnionRingsActionPerformed

    private void MozzarellaSticksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MozzarellaSticksActionPerformed
        item = "Mozzarella Sticks";
    }//GEN-LAST:event_MozzarellaSticksActionPerformed

    private void HummusWithPitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HummusWithPitaActionPerformed
        item = "Hummus With Pita";
    }//GEN-LAST:event_HummusWithPitaActionPerformed

    private void GarlicBreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GarlicBreadActionPerformed
        item = "Garlic Bread";
    }//GEN-LAST:event_GarlicBreadActionPerformed

    private void StuffedVineLeavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuffedVineLeavesActionPerformed
        item = "Stuffed Vine Leaves";
    }//GEN-LAST:event_StuffedVineLeavesActionPerformed

    private void ChickenWingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenWingsActionPerformed
        item = "Chicken Wings";
    }//GEN-LAST:event_ChickenWingsActionPerformed

    private void CaesarSaladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaesarSaladActionPerformed
        item = "Caesar Salad";
    }//GEN-LAST:event_CaesarSaladActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new J_EditMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CaesarSalad;
    private javax.swing.JButton Cappuccino;
    private javax.swing.JToggleButton ChickenWings;
    private javax.swing.JButton Cola;
    private javax.swing.JScrollPane Drinks_ScrollPane;
    private javax.swing.JToggleButton E_BeefShawarma;
    private javax.swing.JToggleButton E_Cheese;
    private javax.swing.JToggleButton E_GrilledChicken;
    private javax.swing.JToggleButton E_KoftaPizza;
    private javax.swing.JToggleButton E_LiverPizza;
    private javax.swing.JToggleButton E_LocalSausage;
    private javax.swing.JToggleButton E_Meat;
    private javax.swing.JToggleButton E_MincedMeat;
    private javax.swing.JToggleButton E_OlivePizza;
    private javax.swing.JToggleButton E_Salami;
    private javax.swing.JToggleButton E_Shawarma;
    private javax.swing.JToggleButton E_Shrimp;
    private javax.swing.JToggleButton E_SmokedMeat;
    private javax.swing.JToggleButton E_Tuna;
    private javax.swing.JToggleButton E_Vegetables;
    private javax.swing.JScrollPane Eastern_ScrollPane;
    private javax.swing.JButton Espresso;
    private javax.swing.JButton EspressoAffogato;
    private javax.swing.JScrollPane Extras_ScrollPane;
    private javax.swing.JButton Fanta;
    private javax.swing.JToggleButton FrenchFries;
    private javax.swing.JToggleButton FriedZucchini;
    private javax.swing.JButton Fruit_Punch;
    private javax.swing.JToggleButton GarlicBread;
    private javax.swing.JButton HotChocolate;
    private javax.swing.JToggleButton HummusWithPita;
    private javax.swing.JToggleButton I_BBQChicken;
    private javax.swing.JToggleButton I_Caprese;
    private javax.swing.JToggleButton I_Carbonara;
    private javax.swing.JToggleButton I_Cheese;
    private javax.swing.JToggleButton I_Hawaiian;
    private javax.swing.JToggleButton I_Margherita;
    private javax.swing.JToggleButton I_Meat;
    private javax.swing.JToggleButton I_Mushroom;
    private javax.swing.JToggleButton I_Pepperoni;
    private javax.swing.JToggleButton I_Pesto;
    private javax.swing.JToggleButton I_Seafood;
    private javax.swing.JToggleButton I_Veggie;
    private javax.swing.JButton IcedCoffee;
    private javax.swing.JButton IcedTea;
    private javax.swing.JScrollPane Italian_ScrollPane;
    private javax.swing.JButton Latte;
    private javax.swing.JButton Lemonade;
    private javax.swing.JButton MangoJuice;
    private javax.swing.JTabbedPane Menu;
    private javax.swing.JButton MilkShake;
    private javax.swing.JToggleButton MozzarellaSticks;
    private javax.swing.JTextField NewPrice_txtfield;
    private javax.swing.JToggleButton OnionRings;
    private javax.swing.JButton OrangeJuice;
    private javax.swing.JButton Save_button;
    private javax.swing.JButton Sprite;
    private javax.swing.JToggleButton StuffedVineLeaves;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
