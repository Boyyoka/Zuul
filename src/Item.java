/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boyke
 */
public class Item {

    private String itemOmsch;
    private String itemNaam;
    private int gewicht;

    public Item(int gewicht, String itemNaam, String itemOmsch) {
        this.gewicht = gewicht;
        this.itemOmsch = itemOmsch;
        this.itemNaam = itemNaam;
    }
   

    public String getNaam() {

        return itemNaam;
    }

    public int getGewicht() {

        return gewicht;
    }

    public String getItemOmsch() {

        return itemOmsch;
    }
}
