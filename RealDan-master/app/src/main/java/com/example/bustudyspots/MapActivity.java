package com.example.bustudyspots;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.location.Location;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/**
 * Shows the google map, places the markers
 * takes bool cafe, library, BUspaces, and All from SettingActivity
 *
 */


public class MapActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {

    private boolean cafe;
    private boolean libraries;
    private boolean BUspaces;
    private boolean all;
    private final String Description = "Tap for more info";

    /*
    The first method called
    takes the intent from SettingsActivity and sets up booleans
    then makes the map fragment and calls the location finding methods

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        locationTries =0;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            cafe = extras.getBoolean("Cafe");
            libraries = extras.getBoolean("libraries");
            BUspaces = extras.getBoolean("BUonly");
            all = extras.getBoolean("All");
            if (all) {
                cafe = true;
                libraries = true;
                BUspaces = true;
            }
        }

        setContentView(R.layout.map_activity);
        getLocationPermission();
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
 /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    */
    // All the locations
    private Marker ingalls;
    private Marker mugar;
    private Marker stuvi2;
    private Marker gsu;
    private Marker pho;
    private Marker sci;
    private Marker law;
    private Marker cas;
    private Marker yawkey;
    private Marker hojo;
    private Marker sed;
    private Marker scienglib;
    private Marker sth;
    private Marker sar;
    private Marker stuvi1;
    private Marker cfa;
    private Marker khc;
    private Marker com;
    private Marker warren;
    private Marker elie;
    private Marker clafin;
    private Marker sleeper;
    private Marker rich;
    private Marker towers;
    private Marker cgs;
    private Marker qst;
    private Marker buswellfoureight;
    private Marker elliot;
    private Marker commtennineteen;
    private Marker beach;
    private Marker hillel;
    private Marker south;
    private Marker fitrec;
    private Marker engl;
    private Marker barnes;
    private Marker psych;
    private Marker danielsen;

    private Marker pardee;
    private Marker astro;

    private Marker pavement;
    private Marker nero;
    private Marker swarren;
    private Marker swest;
    private Marker squest;
    private Marker skenmore;
    private Marker tatte;
    private Marker limered;
    private Marker buickst;
    private Marker tbaar;
    private Marker panera;
    private Marker bluestate;
    private Marker trident;

    /*
    sets up markers and checks if the location is permitted
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (mLocationPermissionsGranted) {
            getDeviceLocation();

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            mMap.setMyLocationEnabled(true);
            mMap.getUiSettings().setMyLocationButtonEnabled(false);

        }

        if (cafe) {
            //all the cafe markers
            //magenta cuz why not

            MarkerOptions cafes = new MarkerOptions().snippet(Description).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));

            LatLng pavementl = new LatLng(42.349802, -71.107192);
            pavement = mMap.addMarker(cafes.position(pavementl).title("Pavement"));
            pavement.setTag(ID.PAVEMENT);

            LatLng nerol = new LatLng(42.352234, -71.122626);
            nero = mMap.addMarker(cafes.position(nerol).title("Cafe Nero"));
            nero.setTag(ID.NERO);

            LatLng swarrenl = new LatLng(42.349350, -71.103092);
            swarren = mMap.addMarker(cafes.position(swarrenl).title("Central Campus Starbucks"));
            swarren.setTag(ID.SWARREN);

            LatLng swestl = new LatLng(42.350704, -71.114545);
            swest = mMap.addMarker(cafes.position(swestl).title("West Campus Starbucks"));
            swest.setTag(ID.SWEST);

            LatLng squestl = new LatLng(42.349629, -71.099548);
            squest = mMap.addMarker(cafes.position(squestl).title("Questrom Starbucks"));
            squest.setTag(ID.SQUEST);

            LatLng skenmorel = new LatLng(42.348501, -71.095930);
            skenmore = mMap.addMarker(cafes.position(skenmorel).title("East Campus Starbucks"));
            skenmore.setTag(ID.SKENMORE);

            LatLng tattel = new LatLng(42.345765, -71.106860);
            tatte = mMap.addMarker(cafes.position(tattel).title("Tatte Bakery"));
            tatte.setTag(ID.TATTE);

            LatLng limeredl = new LatLng(42.351968, -71.124107);
            limered = mMap.addMarker(cafes.position(limeredl).title("LimeRed Teahouse"));
            limered.setTag(ID.LIMERED);

            LatLng buickl = new LatLng(42.352402, -71.115933);
            buickst = mMap.addMarker(cafes.position(buickl).title("Buick St. Cafe"));
            buickst.setTag(ID.BUICKST);

            LatLng tbaarl = new LatLng(42.346223, -71.108655);
            tbaar = mMap.addMarker(cafes.position(tbaarl).title("T Baar"));
            tbaar.setTag(ID.TBAAR);

            LatLng paneral = new LatLng(42.344658, -71.101500);
            panera = mMap.addMarker(cafes.position(paneral).title("Panera Bread"));
            panera.setTag(ID.PANERA);

            LatLng bluestatel = new LatLng(42.351811, -71.118953);
            bluestate = mMap.addMarker(cafes.position(bluestatel).title("Blue State Coffee"));
            bluestate.setTag(ID.BLUESTATE);

            LatLng tridentl = new LatLng(42.348239, -71.086610);
            trident = mMap.addMarker(cafes.position(tridentl).title("Trident Cafe"));
            trident.setTag(ID.TRIDENT);
        }
        if (libraries) {
            //all the libraries
            // green marker
            MarkerOptions libraries = new MarkerOptions().snippet(Description).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));

            LatLng mugarl = new LatLng(42.350851, -71.108103);
            mugar = mMap.addMarker(libraries.position(mugarl).title("Mugar Library"));
            mugar.setTag(ID.MUGAR);

            LatLng astrol = new LatLng(42.350262, -71.105716);
            astro = mMap.addMarker(libraries.position(astrol).title("Astronomy Library"));
            astro.setTag(ID.ASTRO);

            LatLng pardeel = new LatLng(42.3497, -71.0995);
            pardee = mMap.addMarker(libraries.position(pardeel).title("Pardee Library"));
            pardee.setTag(ID.PARDEE);

        }
        if (BUspaces) {
            //all the Bu spaces
            // red marker

            MarkerOptions BUspaces = new MarkerOptions().snippet(Description).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

            LatLng photonics = new LatLng(42.349197, -71.106092);
            pho = mMap.addMarker(BUspaces.position(photonics).title("Photonics"));
            pho.setTag(ID.PHO);

            LatLng ingallsl = new LatLng(42.348520, -71.102873);
            ingalls = mMap.addMarker(BUspaces.position(ingallsl).title("Ingalls"));
            ingalls.setTag(ID.INGALLS);

            LatLng stuvi2l = new LatLng(42.353199, -71.117717);
            stuvi2 = mMap.addMarker(BUspaces.position(stuvi2l).title("Student Village Two"));
            stuvi2.setTag(ID.STUVI2);

            LatLng gsul = new LatLng(42.350920, -71.108950);
            gsu = mMap.addMarker(BUspaces.position(gsul).title("George Sherman Union"));
            gsu.setTag(ID.GSU);

            LatLng scil = new LatLng(42.348380, -71.100336);
            sci = mMap.addMarker(BUspaces.position(scil).title("Metcalf Science Center"));
            sci.setTag(ID.SCI);

            LatLng lawl = new LatLng(42.351060, -71.107174);
            law = mMap.addMarker(BUspaces.position(lawl).title("School of Law"));
            law.setTag(ID.LAW);

            LatLng casl = new LatLng(42.350260, -71.104891);
            cas = mMap.addMarker(BUspaces.position(casl).title("College of Arts and Sciences"));
            cas.setTag(ID.CAS);

            LatLng yawkeyl = new LatLng(42.349769, -71.097907);
            yawkey = mMap.addMarker(BUspaces.position(yawkeyl).title("Yawkey"));
            yawkey.setTag(ID.YAWKEY);

            LatLng hojol = new LatLng(42.349468, -71.098717);
            hojo = mMap.addMarker(BUspaces.position(hojol).title("Hojo"));
            hojo.setTag(ID.HOJO);

            LatLng sedl = new LatLng(42.349765, -71.100728	);
            sed = mMap.addMarker(BUspaces.position(sedl).title("School of Education"));
            sed.setTag(ID.SED);

            LatLng scienglibl = new LatLng(42.348475, -71.102257);
            scienglib = mMap.addMarker(BUspaces.position(scienglibl).title("Science and Engineering Library"));
            scienglib.setTag(ID.SCIENGLIB);

            LatLng sthl = new LatLng(42.350456, -71.107039);
            sth = mMap.addMarker(BUspaces.position(sthl).title("School of Theology"));
            sth.setTag(ID.STH);

            LatLng sargl = new LatLng(42.349768, -71.102200);
            sar = mMap.addMarker(BUspaces.position(sargl).title("Sargent College"));
            sar.setTag(ID.SAR);

            LatLng stuvi1l = new LatLng(42.352392, -71.115974);
            stuvi1 = mMap.addMarker(BUspaces.position(stuvi1l).title("Student Village One"));
            stuvi1.setTag(ID.STUVI1);

            LatLng cfal = new LatLng(42.351479, -71.113874);
            cfa = mMap.addMarker(BUspaces.position(cfal).title("College of Fine Arts"));
            cfa.setTag(ID.CFA);

            LatLng khcl = new LatLng(42.350312, -71.097017);
            khc = mMap.addMarker(BUspaces.position(khcl).title("Kilachand Honors College"));
            khc.setTag(ID.KHC);

            LatLng coml = new LatLng(42.348876, -71.102469);
            com = mMap.addMarker(BUspaces.position(coml).title("College of Communication"));
            com.setTag(ID.COM);

            LatLng warrenl = new LatLng(42.3495, -71.1048);
            warren = mMap.addMarker(BUspaces.position(warrenl).title("Warren Towers"));
            warren.setTag(ID.WARREN);

            LatLng eliel = new LatLng(42.3505 , -71.1000);
            elie = mMap.addMarker(BUspaces.position(eliel).title("Elie Wiesel Center for Jewish Studies"));
            elie.setTag(ID.ELIE);

            LatLng clafinl = new LatLng(42.3525, -71.1198);
            clafin = mMap.addMarker(BUspaces.position(clafinl).title("Claflin Hall"));
            clafin.setTag(ID.CLAFIN);

            LatLng sleeperl = new LatLng(42.352895, -71.120510);
            sleeper = mMap.addMarker(BUspaces.position(sleeperl).title("Sleeper Hall"));
            sleeper.setTag(ID.SLEEPER);

            LatLng richl = new LatLng(42.353513, -71.120632);
            rich = mMap.addMarker(BUspaces.position(richl).title("Rich Hall"));
            rich.setTag(ID.RICH);

            LatLng towersl = new LatLng(42.349988, -71.099799);
            towers = mMap.addMarker(BUspaces.position(towersl).title("The Towers"));
            towers.setTag(ID.TOWERS);

            LatLng cgsl = new LatLng(42.3515, -71.1146);
            cgs = mMap.addMarker(BUspaces.position(cgsl).title("College of General Studies"));
            cgs.setTag(ID.CGS);

            LatLng questroml = new LatLng(42.3496, -71.0995);
            qst = mMap.addMarker(BUspaces.position(questroml).title("Questrom School of Business"));
            qst.setTag(ID.QST);

            LatLng elliotl = new LatLng(42.354373, -71.121415);
            elliot = mMap.addMarker(BUspaces.position(elliotl).title("Elliot H. Cole Academic Support Center"));
            elliot.setTag(ID.ELLIOT);

            LatLng tenninel = new LatLng(42.352290, -71.121406);
            commtennineteen = mMap.addMarker(BUspaces.position(tenninel).title("1019 Comm Ave Student Residences"));
            commtennineteen.setTag(ID.COMMTENNINETEEN);

            LatLng beachl = new LatLng(42.351193, -71.106082);
            beach = mMap.addMarker(BUspaces.position(beachl).title("BU Beach"));
            beach.setTag(ID.BEACH);

            LatLng hillell = new LatLng(42.350810, -71.103113);
            hillel = mMap.addMarker(BUspaces.position(hillell).title("Hillel Dining Hall"));
            hillel.setTag(ID.HILLEL);

            LatLng southl = new LatLng(42.348015, -71.106186);
            south = mMap.addMarker(BUspaces.position(southl).title("South Campus"));
            south.setTag(ID.SOUTH);

            LatLng fitrecl = new LatLng(42.3519, -71.1165);
            fitrec = mMap.addMarker(BUspaces.position(fitrecl).title("FitRec"));
            fitrec.setTag(ID.FITREC);

            LatLng barnesl = new LatLng(42.349259, -71.096227);
            barnes = mMap.addMarker(BUspaces.position(barnesl).title("Barnes and Nobles"));
            barnes.setTag(ID.BARNES);

            LatLng psychl = new LatLng(42.348821, -71.104500);
            psych = mMap.addMarker(BUspaces.position(psychl).title("Psych Building"));
            psych.setTag(ID.PSYCH);

            LatLng danielsenl = new LatLng(42.350926, -71.090339);
            danielsen = mMap.addMarker(BUspaces.position(danielsenl).title("Danielsen"));
            danielsen.setTag(ID.DANIELSEN);

            LatLng engll = new LatLng(42.350580, -71.104164);
            engl = mMap.addMarker(BUspaces.position(engll).title("Department of English"));
            engl.setTag(ID.ENGL);

            LatLng buswelll = new LatLng(42.347011, -71.106543);
            buswellfoureight = mMap.addMarker(BUspaces.position(buswelll).title("48 Buswell St"));
            buswellfoureight.setTag(ID.BUSWELLFOUREIGHT);




        }

        mMap.setOnInfoWindowClickListener(this); // enables the user to tap the info window of the marker to take them to a different screen

    }
    private static final String TAG = "MapActivity";

    private static final String FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    private static final String COURSE_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1234;
    private static final float DEFAULT_ZOOM = 16f;

    //vars
    private Boolean mLocationPermissionsGranted = false;
    private GoogleMap mMap;
    private FusedLocationProviderClient mFusedLocationProviderClient;
    private int locationTries;

    /*
    finds location and zooms in there
    location is found in another Task
    if location cannot be found (user's location setting is off or they did not allow it)
    then it zooms in on Mugar

     */

    private void getDeviceLocation(){
        Log.d(TAG, "getDeviceLocation: getting the devices current location");

        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        try{
            if(mLocationPermissionsGranted){

                final Task location = mFusedLocationProviderClient.getLastLocation();
                location.addOnCompleteListener(new OnCompleteListener() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                        if(task.isSuccessful()){
                            Log.d(TAG, "onComplete: found location!");
                            Location currentLocation = (Location) task.getResult();

                                try {
                                    moveCamera(new LatLng(currentLocation.getLatitude(), currentLocation.getLongitude()),
                                            DEFAULT_ZOOM);
                                }
                                catch (NullPointerException e){
                                    Log.e(TAG, "getDeviceLocation: Could not find Device Location");
                                    moveCamera(new LatLng(42.350851, -71.108103),DEFAULT_ZOOM);
                                }
                        }else{
                            Log.d(TAG, "onComplete: current location is null");
                            Toast.makeText(MapActivity.this, "unable to get current location", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }catch (SecurityException e){
            Log.e(TAG, "getDeviceLocation: SecurityException: " + e.getMessage() );
            moveCamera(mugar.getPosition(),DEFAULT_ZOOM);
        }

    }

    /*
    moves the user's view
     */

    private void moveCamera(LatLng latLng, float zoom){
        Log.d(TAG, "moveCamera: moving the camera to: lat: " + latLng.latitude + ", lng: " + latLng.longitude );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom));
    }
    /*
    sets up the map fragment
     */

    private void initMap(){
        Log.d(TAG, "initMap: initializing map");
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

        mapFragment.getMapAsync(MapActivity.this);
    }
    /*
    Access to location is a 'Dangerous Permission' so there has to be a pop-up prompting the user
    to confirm/deny access
     */

    private void getLocationPermission(){
        Log.d(TAG, "getLocationPermission: getting location permissions");
        String[] permissions = {Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION};

        if(ContextCompat.checkSelfPermission(this.getApplicationContext(),
                FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            if(ContextCompat.checkSelfPermission(this.getApplicationContext(),
                    COURSE_LOCATION) == PackageManager.PERMISSION_GRANTED){
                mLocationPermissionsGranted = true;
                initMap();
            }else{
                ActivityCompat.requestPermissions(this,
                        permissions,
                        LOCATION_PERMISSION_REQUEST_CODE);
            }
        }else{
            ActivityCompat.requestPermissions(this,
                    permissions,
                    LOCATION_PERMISSION_REQUEST_CODE);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        Log.d(TAG, "onRequestPermissionsResult: called.");
        mLocationPermissionsGranted = false;

        switch(requestCode){
            case LOCATION_PERMISSION_REQUEST_CODE:{
                if(grantResults.length > 0){
                    for(int i = 0; i < grantResults.length; i++){
                        if(grantResults[i] != PackageManager.PERMISSION_GRANTED){
                            mLocationPermissionsGranted = false;
                            Log.d(TAG, "onRequestPermissionsResult: permission failed");
                            return;
                        }
                    }
                    Log.d(TAG, "onRequestPermissionsResult: permission granted");
                    mLocationPermissionsGranted = true;
                    //initialize our map
                    initMap();
                }
            }
        }
    }

    /*
    takes the user to the ScrollActivity, which is the info screen for each marker
     */

    @Override
    public void onInfoWindowClick(Marker marker) {
       // Toast.makeText(this, "what does this look like", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "Info window clicked");
        Log.d(TAG, "Marker number: " + marker.getTag());
        Log.d(TAG, "Marker name: " + marker.getTitle());
        Intent showMoreInfo = new Intent(this, ScrollingActivity.class);
        showMoreInfo.putExtra("ID", (Integer) marker.getTag());
        startActivity(showMoreInfo);
    }
}
