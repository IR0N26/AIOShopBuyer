package AIOShopBuyer.Utils;

import AIOShopBuyer.Data.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class Gui extends JFrame {

    public Gui() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        switch ((String) Objects.requireNonNull(comboBox1.getSelectedItem())){
            case "Bob":
               Data.BANK_ID = 21301;
               Data.SHOP_ID = 519;
                break;
            /*case "Jatix":
                Data.BANK_ID = 21301;
                Data.SHOP_ID = 587;
                break;*/
            case "Pikkupstix":
                Data.BANK_ID = 26972;
                Data.SHOP_ID = 6970;
                break;

            }
            switch ((String) Objects.requireNonNull(comboBox2.getSelectedItem())) {

               /* case "Eye of newt":
                    Data.ITEM_ID_TO_BUY = 221;
                    break;
                case "Unicorn horn dust":
                    Data.ITEM_ID_TO_BUY = 235;
                    break;
                case "Limpwurt root":
                    Data.ITEM_ID_TO_BUY = 225;
                    break;
                case "Red spider's eggs":
                    Data.ITEM_ID_TO_BUY = 223;
                    break;
                case "Goat horn dust":
                    Data.ITEM_ID_TO_BUY = 9736;
                    break;
                case "Snape grass":
                    Data.ITEM_ID_TO_BUY = 231;
                    break;
                case "Dragon scale dust":
                    Data.ITEM_ID_TO_BUY = 241;
                    break;
                case "Wine of zamorak":
                    Data.ITEM_ID_TO_BUY = 245;
                    break;
                case "Potato cactus":
                    Data.ITEM_ID_TO_BUY = 3138;
                    break;
                case "JangerBerries":
                    Data.ITEM_ID_TO_BUY = 247;
                    break;
                case "Crushed nest":
                    Data.ITEM_ID_TO_BUY = 6693;
                    break;
                case "Mort myre fungus":
                    Data.ITEM_ID_TO_BUY = 2970;
                    break;*/
                case "Sapphire":
                    Data.ITEM_ID_TO_BUY = 1623;
                    break;
                case "Emerald":
                    Data.ITEM_ID_TO_BUY = 1621;
                    break;
                case "Ruby":
                    Data.ITEM_ID_TO_BUY = 1619;
                    break;
                case "Diamond":
                    Data.ITEM_ID_TO_BUY = 1617;
                    break;
                case "Leather":
                    Data.ITEM_ID_TO_BUY = 1741;
                    break;
                case "Green D'hide":
                    Data.ITEM_ID_TO_BUY = 1745;
                    break;
                case "Blue D'hide":
                    Data.ITEM_ID_TO_BUY = 2505;
                    break;
                case "Red D'hide":
                    Data.ITEM_ID_TO_BUY = 2507;
                    break;
                case "Wolf bones":
                    Data.ITEM_ID_TO_BUY = 2859;
                    break;
                case "Raw chicken":
                    Data.ITEM_ID_TO_BUY = 2138;
                    break;
                case "Spider carcass":
                    Data.ITEM_ID_TO_BUY = 6291;
                    break;
                case "Thin snail":
                    Data.ITEM_ID_TO_BUY = 3363;
                    break;
                case "Honeycomb":
                    Data.ITEM_ID_TO_BUY = 12156;
                    break;
                case "Cockatrice egg":
                    Data.ITEM_ID_TO_BUY = 12109;
                    break;
                case "Pengatrice egg":
                    Data.ITEM_ID_TO_BUY = 12117;
                    break;
                case "Coraxatrice egg":
                    Data.ITEM_ID_TO_BUY = 12119;
                    break;
                case "Vulatrice egg":
                    Data.ITEM_ID_TO_BUY = 12121;
                    break;
                case "Gold ring":
                    Data.ITEM_ID_TO_BUY = 1635;
                    break;
                case "Raw bird meat":
                    Data.ITEM_ID_TO_BUY = 9978;
                    break;
                case "Jug of water":
                    Data.ITEM_ID_TO_BUY = 1937;
                    break;
                case "Larupia fur":
                    Data.ITEM_ID_TO_BUY = 10095;
                    break;
                case "Kyatt fur":
                    Data.ITEM_ID_TO_BUY = 10103;
                    break;
                case "Graahk fur":
                    Data.ITEM_ID_TO_BUY = 10099;
                    break;
                case "Swamp toad":
                    Data.ITEM_ID_TO_BUY = 2150;
                    break;
                case "Tortoise shell":
                    Data.ITEM_ID_TO_BUY = 7939;
                    break;
                case "Raw rabbit":
                    Data.ITEM_ID_TO_BUY = 3226;
                    break;
                case "Iron dagger":
                    Data.ITEM_ID_TO_BUY = 1203;
                    break;
                case "Granite (500g)":
                    Data.ITEM_ID_TO_BUY = 6979;
                    break;
                case "Iron bar":
                    Data.ITEM_ID_TO_BUY = 2351;
                    break;
                case "Iron ore":
                    Data.ITEM_ID_TO_BUY = 440;
                    break;
                case "Willow logs":
                    Data.ITEM_ID_TO_BUY = 1519;
                    break;
                case "Clean guam":
                    Data.ITEM_ID_TO_BUY = 249;
                    break;
                case "Harpoon":
                    Data.ITEM_ID_TO_BUY = 311;
                    break;
                case "Banana":
                    Data.ITEM_ID_TO_BUY = 1963;
                    break;

                case "Water orb":
                    Data.ITEM_ID_TO_BUY = 571;
                    break;
                case "Raw beef":
                    Data.ITEM_ID_TO_BUY = 2132;
                    break;
        }
        // TODO add your code here
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables

        JLabel label1 = new JLabel();
        comboBox1 = new JComboBox<>();
        JLabel label2 = new JLabel();
        comboBox2 = new JComboBox<>();
        JButton button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Shop to buy from :");

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "...",
                "Bob",
               // "Jatix",
                "Pikkupstix"
        }));

        //---- label2 ----
        label2.setText("Item to buy :");

        //---- comboBox2 ----
        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "... ",
                "... Bob ...",
                "Sapphire",
                "Emerald",
                "Ruby",
                "Diamond",
                "Leather",
                "Green D'hide",
                "Blue D'hide",
                "Red D'hide",
              /*  "... Jatix ...",
                "Eye of newt - 221",
                "Unicorn horn dust - 235",
                "Limpwurt root - 225",
                "Red spider's eggs - 223",
                "Goat horn dust - 9736",
                "Snape grass - 231",
                "Dragon scale dust - 241",
                "Wine of zamorak - 245",
                "Potato cactus - 3138",
                "Jangerberries - 247",
                "Crushed nest - 6693",
                "Mort myre fungus - 2970",*/
                "... Pikkupstix ...",
                "Wolf bones",
                "Raw chicken",
                "Spider carcass",
                "Thin snail",
                "Honeycomb",
                "Cockatrice egg",
                "Pengatrice egg",
                "Coraxatrice egg",
                "Vulatrice egg",
                "Gold ring",
                "Raw bird meat",
                "Jug of water",
                "Larupia fur",
                "Kyatt fur",
                "Graahk fur",
                "Swamp toad",
                "Tortoise shell",
                "Raw rabbit",
                "Iron dagger",
                "Granite (500g)",
                "Iron bar",
                "Iron ore",
                "Willow logs",
                "Clean guam",
                "Harpoon",
                "Banana",
                "Water orb",
                "Raw beef",
                "..."
        }));

        //---- button1 ----
        button1.setText("Start");
        button1.addActionListener(e -> button1ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label1)
                                        .addComponent(label2))
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboBox2)
                                        .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                                .addContainerGap(43, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap(213, Short.MAX_VALUE)
                                .addComponent(button1)
                                .addGap(57, 57, 57))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label1)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(button1)
                                .addGap(17, 17, 17))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}