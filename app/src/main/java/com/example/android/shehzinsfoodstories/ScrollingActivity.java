package com.example.android.shehzinsfoodstories;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {

    Button e;
    TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        e=(Button)findViewById(R.id.contact);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"shehzincs@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"From your mobile Application");
                intent.setPackage("com.google.android.gm");
                startActivity(Intent.createChooser(intent,"Send EMail"));
            }
        });

        t1=(TextView)findViewById(R.id.loca);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
        t2=(TextView)findViewById(R.id.locb);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        t3=(TextView)findViewById(R.id.locc);
        t3.setMovementMethod(LinkMovementMethod.getInstance());
        t4=(TextView)findViewById(R.id.locicetea);
        t4.setMovementMethod(LinkMovementMethod.getInstance());
        t5=(TextView)findViewById(R.id.locbinnamas);
        t5.setMovementMethod(LinkMovementMethod.getInstance());

    }
    public void gotourli (View view) {
        String url = "https://www.instagram.com/shehzin_cs/";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void gotourlfb (View view) {
        String url = "https://www.facebook.com/shehzincs";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void gotourlt (View view) {
        String url = "https://twitter.com/shehzincs?s=08";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void gotourll (View view) {
        String url = "https://www.linkedin.com/in/shehzin-s-6a477086";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}