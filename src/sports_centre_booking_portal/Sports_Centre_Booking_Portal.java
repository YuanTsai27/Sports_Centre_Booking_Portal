/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sports_centre_booking_portal;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author yuant
 */
public class Sports_Centre_Booking_Portal {

    private FileManager fileManager;
    private PageNavigator pageNavigator;    
    
    private ArrayList<User> usersList; // using arraylist for its ordered characteristic
    private ArrayList<Court> courtsList;
    private ArrayList<Booking> bookingsList;
    
    private boolean exit;
    
    public Sports_Centre_Booking_Portal() {
        this.fileManager = new FileManager();
        this.pageNavigator = new PageNavigator();
        
        this.usersList = new ArrayList<>();
        this.courtsList = new ArrayList<>();
        this.bookingsList = new ArrayList<>();
        
        exit = false;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Sports_Centre_Booking_Portal app = new Sports_Centre_Booking_Portal();
        app.start();
    }
    
    public void start() throws IOException {
        // load all saved users, booked courts and bookings into the app
        fileManager.loadUsers(usersList);
        fileManager.loadCourts(courtsList);
        fileManager.loadBookings(bookingsList, courtsList, usersList);
        
        // set static instances for Page class.
        Page.setArrayLists(usersList, courtsList, bookingsList);
        Page.setFileManager(fileManager);

        // start the app's page navigator.
        pageNavigator.start();
        
        // save users, booked courts, and bookings before exiting app.
        fileManager.saveBookings(bookingsList);
        fileManager.saveCourts(courtsList);
        fileManager.saveUsers(usersList);
        
 
    }
    
}
