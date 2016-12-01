
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boyke
 */
public class Player {
    
    private String playerNaam;
    private ArrayList<Item> inventory;
    private Room currentRoom;
  
    public Player(){
        inventory = new ArrayList<Item>();
    }
    
    public void storeItem(Item item){
        
        inventory.add(item);
        
        System.out.println(inventory.size());
    
    }
    
    public void setRoom(Room room){
        
        currentRoom = room;
    }
    
    public Room getRoom(){
    
        return currentRoom;
    }

    public void takeItem(Command command) {
        if (currentRoom.hasItem()) {
            if (command.hasSecondWord()) {
                System.out.println("take what?");

            } else {
                storeItem(currentRoom.getItem());

            }

        } else {
            System.out.println("In deze kamer bevind zich geen item meer!");
        }
    }
    
     public void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);


        if (nextRoom == null) {
            System.out.println("There is no door!");
        } else {
            currentRoom = nextRoom;
            setRoom(currentRoom);

            System.out.println(currentRoom.getLongDescription() + currentRoom.getItemNaam());

        }
    }
}

