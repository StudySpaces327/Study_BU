package com.example.bustudyspots;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

// This activity is for the location descriptions. 
// The MapActivity passes the ID for the marker, and here it is taken from the Intent

public class ScrollingActivity extends AppCompatActivity {

    private final String tapback = "\n\n\n\nTap your back button to go back to the map";
    private final String available = "there are tables, computers, and printers available";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); // used to customise the text on the toolbar
        TextView textView = (TextView) findViewById(R.id.long_info_id); // used to alter the text

        Bundle extras = getIntent().getExtras();

        int id = extras.getInt("ID");

        switch (id){

            case ID.INGALLS: {
                toolbar.setTitle("Ingalls");
                textView.setText("Open 24/7 \n\n Engineers only - others have to be swiped in. \n\nComputers, printers, and cubicles available. \n\n Group rooms also available." + tapback);
                break;
            }

            case ID.MUGAR:{
                toolbar.setTitle("Mugar");
                textView.setText("Open 7 am to 2 am Mon-Thur \n7 am to 11 pm Fri \n8am to 11pm Sat \n10am to 2 am Sun \n24/7 during finals \n\n In the basement and on floors 1 -6 " + available + "\n\n Also check out PALS lounge" + tapback);
                break;
            }

            case ID.STUVI2:{
                toolbar.setTitle("Student Village 2\n\"StuVi2\"");
                textView.setText("Open 24/7 \n\nTop floor has studying area with tables \n\n2nd Floor has lounge and scattered seats"+ tapback);
                break;
            }

            case  ID.GSU:{
                toolbar.setTitle("George Sherman Union\n\"GSU\"");
                textView.setText("Open 8am - 12am Mon-Fri \n 10am to 12 am Sat and Sun \n\n Basement: \n BU Central \n Howard Thurman Center - tables are available \nFirst Floor: \nFood Court\nLounge has tables and booths\n\nSecond Floor: \nZiskind Lounge - tables and chairs available\n\n Third Floor: \nDean's Lounge - small area with tables available" + tapback);
                break;
            }

            case ID.PHO:{
                toolbar.setTitle("Photonics");
                textView.setText("1st Floor \n Seats and tables by the central staircase \n\nFloors 3 - 9 have small spaces on the east-most and west-most sides\n Floor 7 has chairs"+tapback);
                break;
            }

            case ID.SCI:{
                toolbar.setTitle("Metcalf Science Building");
                textView.setText("Open most hours of the day\nAfter 6pm, enter through side entrance\n\nBasement\nTables and booths available\n\nEmpty classrooms are sometimes available "+tapback);
                break;
            }

            case ID.LAW:{
                toolbar.setTitle("School of Law");
                textView.setText("Open 7am to 8pm for all students, and 7am to 11pm for law students\n\n1st Floor\n Some chairs and cubicles\n\n2nd Floor\nCafe\n Open 8am to 5pm Mon to Thurs\n 8am - 2pm Fri\n\nCharles River Room\nTables and Chairs"+tapback);
                break;
            }

            case ID.CAS:{
                toolbar.setTitle("College of Arts and Sciences");
                textView.setText("Basement: \nEinstein's Bagels\n Open 7:30am to 8pm Mon to Thurs\n 7:30am to 2pm Fri\n\nFirst Floor: \n Think Tank study center, on west-most side of CAS\n\n4th Floor\n Stone Science Library, east-most side of CAS\n\n6th Floor: \nGeddes Language Center, usually quiet, only one elevator can access here" + tapback);
                break;
            }

            case ID.ASTRO:{
                toolbar.setTitle("Astronomy Library");
                textView.setText("Open 9am to 5pm Mon to Fri\nOn the 6th floor, east side\nGood for learning about planets (never forget Pluto)" + tapback);
                break;
            }

            case ID.PAVEMENT:{
                toolbar.setTitle("Pavement Coffeehouse");
                textView.setText("Open 7am to 9pm Mon to Thurs\n7am to 8pm Fri to Sun\nTables and seats, but usually quite packed"+tapback);
                break;
            }

            case ID.NERO:{
                toolbar.setTitle("Cafe Nero");
                textView.setText("Open 6:30am to 9pm Mon to Thurs\n7am to 8pm Fri to Sun\n Quite new in the area"+tapback);
                break;
            }

            case ID.SWEST:{
                toolbar.setTitle("West Campus Starbucks");
                textView.setText("Open 5:30am to 9pm Mon to Fri\n6:30am to 8pm Sat-Sun"+tapback);
                break;
            }

            case ID.SWARREN:{
                toolbar.setTitle("Central Campus Starbucks");
                textView.setText("Open 7am to 9pm Mon to Sun" + tapback);
                break;
            }

            case ID.SQUEST:{
                toolbar.setTitle("Questrom Starbucks");
                textView.setText("2nd Floor of Questrom\nOpen 7am to 9:30pm Mon-Thurs\n7am to 4pm Fri\n12am to 6pm Sat-Sun"+tapback);
                break;
            }

            case  ID.SKENMORE:{
                toolbar.setTitle("East Campus Starbucks");
                textView.setText("Open 7am to 9pm Mon to Sun" + tapback);
                break;
            }

            case ID.YAWKEY:{
                toolbar.setTitle("Yawkey");
                textView.setText("Open 9am to 7pm/9pm Mon-Fri\nBasement: \n Rize Cafe\n Open 7am to 2pm Mon to Fri\n\nFloors 3 to 6: \nTables and seating"+ tapback);
                break;
            }

            case ID.HOJO:{
                toolbar.setTitle("Hojo");
                textView.setText("Top floor open 24/7, has tables"+tapback);
                break;
            }

            case ID.SED:{
                toolbar.setTitle("School of Education");
                textView.setText("Library\n Open 8:30am to 9pm Mon to Thurs\n 8:30am to 5pm Fri\n 10am to 5pm Sat"+tapback);
                break;
            }

            case  ID.SCIENGLIB:{
                toolbar.setTitle("Science and Engineering Library");
                textView.setText("Open 8am to 12am Mon- Thurs\n8am to 7pm Fri\n12pm to 7:30pm Sat\n12pm to 12am Sun"+tapback);
                break;
            }

            case ID.STH:{
                toolbar.setTitle("School of Theology");
                textView.setText("Library\n Open 8am to 9pm Mon to Thurs\n 8am to 5pm Fri\n 10am to 6pm Sat"+tapback);
                break;
            }

            case ID.TATTE:{
                toolbar.setTitle("Tatte Bakery");
                textView.setText("Open 7am to 9pm Mon to Fri\n 8am to 9pm Sat\n 8am to 7pm Sun"+tapback);
                break;
            }

            case ID.SAR:{
                toolbar.setTitle("Sargent College");
                textView.setText("2nd Floor: \nLounge with tables"+tapback);
                break;
            }

            case  ID.STUVI1:{
                toolbar.setTitle("Student Village One");
                textView.setText("18th Floor: \nTables available to study at"+tapback);
                break;
            }

            case ID.CFA:{
                toolbar.setTitle("College of Fine Arts");
                textView.setText("2nd Floor: \nStudy lounge available with tables" + tapback);
                break;
            }

            case ID.KHC:{
                toolbar.setTitle("Kilachand Honors College");
                textView.setText("9th Floor: \n Study lounge open 24/7 with tables"+ tapback);
                break;
            }

            case ID.COM:{
                toolbar.setTitle("College of Communication");
                textView.setText("Lawn is nice...\n\n..\n ...sometimes\n\nLounge"+tapback);
                break;
            }

            case ID.LIMERED:{
                toolbar.setTitle("LimeRed Teahouse");
                textView.setText("Open 11am to 10pm Mon- Thurs\n 11am to 11pm Fri - Sat" + tapback);
                break;
            }

            case  ID.BUICKST:{
                toolbar.setTitle("Buick St. Cafe");
                textView.setText("Open 7am to 12pm Mon to Fri\n 8am to 12am Sat - Sun"+ tapback);
                break;
            }

            case  ID.WARREN: {
                toolbar.setTitle("Warren Towers");
                textView.setText("Like shawshank but freshman\n and no Morgan Freeman\n\n B tower study room, located past the security desk and vending machines\n C tower lounge is back in the laundry room"+tapback);
                break;
            }

            case ID.ELIE:{
                toolbar.setTitle("Elie Wiesel Center for Jewish Studies");
                textView.setText("A relatively quiet place to study" + tapback);
                break;
            }

            case ID.CLAFIN:{
                toolbar.setTitle("Clafin Hall");
                textView.setText("Basement: \n Open 24/7" + tapback);
                break;
            }

            case ID.SLEEPER:{
                toolbar.setTitle("Sleeper Hall");
                textView.setText("2nd Floor Lounge: \n Open 24/7, has tables and printer is on the first floor"+tapback);
                break;
            }

            case ID.RICH:{
                toolbar.setTitle("Rich Hall");
                textView.setText("Study room, not a designated quiet space, so good for group study"+tapback);
                break;
            }

            case ID.TBAAR:{
                toolbar.setTitle("T Baar");
                textView.setText("Open 9am to 9:30pm Mon to Sat"+ tapback);
                break;
            }

            case ID.TOWERS:{
                toolbar.setTitle("The Towers");
                textView.setText("Basement: \n Open 24/7, not particularly quiet\n\n1st Floor: \n Lounges by the entrance and to the left, computer room with printers to the right"+ tapback);
                break;
            }

            case ID.CGS:{
                toolbar.setTitle("College of General Studies");
                textView.setText("2nd Floor: \n Lounge with couches and tables\n\nKatzenberg Center Study Lounge, 3rd Floor\n Open 9am to 5pm Mon to Thurs\n 9am to 4pm Fri\n Has a printer\n\nWriting Center\n located at the back of Katzenberg\n Meeting by appointment only, 10am to 4pm Mon to Thurs, 10am to 1pm Fri"+ tapback);
                break;
            }

            case ID.QST:{
                toolbar.setTitle("Questrom School of Business");
                textView.setText("1st Floor: \n Lobby has couches and chairs" + tapback);
                break;
            }

            case  ID.BUSWELLFOUREIGHT:{
                toolbar.setTitle("48 Buswell St");
                textView.setText("Open only to nearby residents\nStudy lounge located across from the laundry room"+ tapback);
                break;
            }

            case ID.ELLIOT:{
                textView.setText("For student athletes\n Open 8am to 10pm Mon to Thurs\n 8am to 5pm Fri\n 11am to 10pm Sun\n Has computers, printers"+tapback);
                toolbar.setTitle("Elliot H. Cole Academic Support Center");
                break;
            }

            case  ID.PANERA:{
                toolbar.setTitle("Panera Bread");
                textView.setText("Open 6am to 10pm Mon to Sat\n 6:30am to 10pm Sun"+ tapback);
                break;
            }

            case ID.COMMTENNINETEEN:{
                toolbar.setTitle("1019 Comm Ave");
                textView.setText("Dorms, but has a study room open to all students"+tapback);
                break;
            }

            case ID.BEACH:{
                toolbar.setTitle("BU Beach");
                textView.setText("Has benches, nice in good weather (so like 2 months of the school year)"+ tapback);
                break;
            }

            case ID.HILLEL:{
                toolbar.setTitle("Hillel Dining Hall");
                textView.setText("Requires a meal swipe to enter\nOpen 9am to 9pm Mon to Thurs, Sat\n 9am to 11pm Fri\n Usually quieter than other dining halls"+tapback);
                break;
            }

            case ID.SOUTH:{
                toolbar.setTitle("South Campus");
                textView.setText("518 Park drive has a study lounge open to all BU students"+tapback);
                break;
            }

            case  ID.FITREC:{
                toolbar.setTitle("FitRec");
                textView.setText("\"It may be a bit noisy, but the first floor lounge can be a great place to study if you want to work out and get your blood flowing before a cram!\"\n - Actual BU student"+tapback);
                break;
            }

            case ID.ENGL:{
                toolbar.setTitle("Department of English");
                textView.setText("Lobby is usually pretty quiet and good for studying"+ tapback);
                break;
            }

            case ID.BARNES:{
                toolbar.setTitle("Barnes and Nobles");
                textView.setText("Open 9am to 9pm Mon to Fri\n 12pm to 5pm Sat, Sun"+tapback);
                break;
            }

            case ID.PARDEE:{
                toolbar.setTitle("Pardee Library");
                textView.setText("Located on the 3rd floor, not usually crowded"+ tapback);
                break;
            }

            case  ID.PSYCH:{
                toolbar.setTitle("Psych Building");
                textView.setText("2nd Floor has a library, usually quiet"+tapback);
                break;
            }

            case ID.TRIDENT:{
                toolbar.setTitle("Trident Cafe");
                textView.setText("Open 8am to 12am Mon to Sat"+ tapback);
                break;
            }

            case ID.DANIELSEN:{
                toolbar.setTitle("Danielsen");
                textView.setText("Basement: \n lounge is usually quiet"+ tapback);
                break;
            }

            case ID.BLUESTATE:{
                toolbar.setTitle("Blue State Coffee");
                textView.setText("Open 7am to 10pm Mon to Fri\n 8am to 11pm Sat-Sun");
                break;
            }
        }









    }
}
