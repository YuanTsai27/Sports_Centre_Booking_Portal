## Personal Project: Sports Centre Booking Portal (Currently in progress)

Currently working on this personal project to help me develop confidence in utilising OOP in a new language Java after C/C++ as my first language.For now it utilises command user interface (CUI), and in the future I will convert this CUI into the graphical form GUI.

# Background Context:
As an avid badminton player who regularly uses booking portals to book courts at badminton halls, I have decided to base this project on a booking portal of a virtual 6 courts sports center where courts can be booked for use of any sports the user wishes.

# Functionality:

To run the app, please run Sports_Centre_Booking_Portal.java in the  sports_centre_booking_portal source package.

On app start up, you will be able to login or register as a new user.
I have prepared a tester account in users.txt - Username testuser Password password123 
with $1000 of credit.

Then you can use the booking portal’s benefits - viewing bookings, viewing courts, topping up your account balance, and making a booking. All these utilises the command user interface in this assessment 1, as well as OOP and SOLID design principles.

I have utilized key classes with their exclusive responsibilities, not limited to but including:
- FileManager: Handles all file interaction operations - load data and save data.
- Page: Handles the key functions flow for a page (Login page, Homepage, or booking page).
- PageNavigator: Handles navigation between the page classes based on user input.
- CUI: Handles all user interaction, such as scanning inputs and printing lines.
- User, Court, and Booking classes for representing key entities in this system.

# Future vision:
In the near future, apart from transitioning from the command user interface into the graphical user interface, I will also add more functions, such as cancel/modify existing court bookings and additional perks of staff/admin users to make the whole app more interesting