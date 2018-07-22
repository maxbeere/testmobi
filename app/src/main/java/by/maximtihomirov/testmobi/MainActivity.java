package by.maximtihomirov.testmobi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-7877502666969738~5333855413");
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void onClick(View v) {
        Intent intent;
        intent = new Intent(MainActivity.this, SecondActivity.class);
        switch (v.getId()) {
            case R.id.Button1:
                intent.putExtra("TYPE", getString(R.string.mammals));
                startActivity(intent);
                break;
            case R.id.Button2:
                intent.putExtra("TYPE", getString(R.string.reptiles));
                startActivity(intent);
                break;
            case R.id.Button3:
                intent.putExtra("TYPE", getString(R.string.fish));
                startActivity(intent);
                break;
            case R.id.Button4:
                intent.putExtra("TYPE", getString(R.string.freshwater));
                startActivity(intent);
                break;
            case R.id.Button5:
                intent.putExtra("TYPE", getString(R.string.birds));
                startActivity(intent);
                break;
            case R.id.Button6:
                intent.putExtra("TYPE", getString(R.string.insecticides));
                startActivity(intent);
                break;
        }

    }
}
