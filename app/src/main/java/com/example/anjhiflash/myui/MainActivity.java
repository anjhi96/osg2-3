package com.example.anjhiflash.myui;

import android.app.ActionBar;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener {

    private Toolbar mToolbar;
    private TextView mTextTime;
//    public Toolbar toolbar;
    public TabLayout tabLayout;
    public ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        loadFragment(new Home());

        //toolbar atas
        mToolbar = (Toolbar) findViewById(R.id.myToolbar);
        mTextTime = (TextView) findViewById(R.id.txtTime);
        setSupportActionBar(mToolbar);

        //tanggal
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = df.format(c.getTime());
        mTextTime.setText(formatDate);

        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);

        // beri listener pada saat item/menu bottom navigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //toolbar navigation-drawer
        Toolbar toolbar = (Toolbar) findViewById(R.id.drawer_toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    panggil action menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

//  load fragment
//    private boolean loadFragment(Fragment fragment){
//        if (fragment != null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fl_container, fragment)
//                    .commit();
//            return true;
//        }
//        return false;
//    }
//  pindah fragment
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        Fragment fragment = null;
//
//        switch (menuItem.getItemId()) {
//            case R.id.navigation_home:
//                fragment = new Home();
//                break;
//            case R.id.navigation_account:
//                fragment = new Account();
//                break;
//            case R.id.navigation_cart:
//                fragment = new Cart();
//                break;
//        }
//        return loadFragment(fragment);
//
//    }


    //pindah menu navigation drawer
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
//        Fragment fragment = null;

        if (id == R.id.idItem1){
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.idItem2){
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.idItem3){
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.idItem4){
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.idItem5){
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.navigation_home){
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.navigation_account){
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.navigation_cart){
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
