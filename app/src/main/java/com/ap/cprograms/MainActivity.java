package com.ap.cprograms;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

import static com.ap.cprograms.Constants.*;

public class MainActivity extends AppCompatActivity {

    String TAG = "Ads";
    ListView mListView;
    ArrayList<ListItemPOJO> mListItemPOJOS;
    MyCustomAdapter adapter;

    public InterstitialAd mInterstitialAd;
    private AdView mAdView1;

    private static long back_pressed_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, getString(R.string.App_ID));
        mAdView1 = new AdView(this);
        mAdView1.setAdSize(AdSize.BANNER);
        mAdView1.setAdUnitId(getResources().getString(R.string.Banner1_adunit_ID));
        try {
            mAdView1.loadAd(new AdRequest.Builder()
                    .addTestDevice("2D1BA8A67F41AF7B21E2846EE0541B11")
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
        }catch (Exception e){
            e.printStackTrace();
        }

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getResources().getString(R.string.Interstitial1_adunit_ID));
        mInterstitialAd.loadAd(new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("2D1BA8A67F41AF7B21E2846EE0541B11")
                .build());

        initView();
//        mAdViews();

        addData();

        //final MyCustomAdapter adapter = new MyCustomAdapter(this, mListItemPOJOS);
        adapter = new MyCustomAdapter(this, mListItemPOJOS);
        /* Set Adapter */
        mListView.setAdapter(adapter);

        gotoProgramActivity();

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();

                Log.i(TAG, "onAdLoaded: ");
            }

            @Override
            public void onAdClosed() {
                super.onAdClosed();

                mInterstitialAd.loadAd(new AdRequest.Builder()
                        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                        .addTestDevice("2D1BA8A67F41AF7B21E2846EE0541B11")
                        .build());

                Log.i(TAG, "onAdClosed: ");

            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);

                mInterstitialAd.loadAd(new AdRequest.Builder()
                        .addTestDevice("2D1BA8A67F41AF7B21E2846EE0541B11")
                        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                        .build());

                Log.i(TAG, "onAdFailedToLoad: ");
            }
        });

    }

//    public void mAdViews() {
//
//        mAdView1.setAdUnitId(getString(R.string.Sample_Banner_Adunit));
//        mAdView1.loadAd(new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .build());
//
//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId(getString(R.string.Sample_Interstitial_Adunit_ID));
//        mInterstitialAd.loadAd(new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .build());
//
//        mInterstitialAd.setAdListener(new AdListener(){
//            @Override
//            public void onAdClosed() {
//                super.onAdClosed();
//
//                mInterstitialAd.loadAd(new AdRequest.Builder()
//                        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                        .build());
//            }
//
//            @Override
//            public void onAdFailedToLoad(int i) {
//                super.onAdFailedToLoad(i);
//
//                mInterstitialAd.loadAd(new AdRequest.Builder()
//                        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                        .build());
//            }
//        });
//
//    }

    private void initView() {

        mListView = findViewById(R.id.customListView);
        mAdView1 = findViewById(R.id.adView1);

    }

    private void gotoProgramActivity() {

        final String code = "code";
        final String heading = "heading";

        /* when Click on List item show a snackbar saying item was Clicked */
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                ListItemPOJO listItemPOJO = (ListItemPOJO) adapter.getItem(position);
//                Snackbar.make(view, listItemPOJO.getTitle().toString()+" was Clicked",Snackbar.LENGTH_LONG).show();
//                /*mListItemPOJOS androidPOJO = (mListItemPOJOS) adapter.getItem(position);
//                Snackbar.make(view, androidPOJO.getName().toString() +" was Clicked",Snackbar.LENGTH_LONG).show();*/
                Log.d(TAG, "Position :" + position + " Id :" + id + " "+mInterstitialAd.isLoaded());

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();

                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                Intent intent = new Intent(MainActivity.this, ProgrammsActivity.class);

                switch (position) {
                    case 0:
//                        Toast.makeText(MainActivity.this, "Hello World Program", Toast.LENGTH_SHORT).show();
                        //Intent intent = new Intent(MainActivity.this, ProgrammsActivity.class);
                        intent.putExtra(code, HelloWorld);
                        intent.putExtra(heading,"Hello World :");
                        startActivity(intent);
//                        startActivity(new Intent(MainActivity.this, ProgrammsActivity.class));
                        break;
                    case 1:
//                        Toast.makeText(MainActivity.this, "Addition item", Toast.LENGTH_SHORT).show();
                        //Intent intent2 = new Intent(MainActivity.this, ProgrammsActivity.class);
                        intent.putExtra(code, Addition_1);
                        intent.putExtra(heading,"Addition - 1 :");
                        startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra(code, Addition_UserInput);
                        intent.putExtra(heading,"Addition UserInput :");
                        startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra(code, Addition_Floating_Integer_UI);
                        intent.putExtra(heading,"Addition Floating Integer UI :");
                        startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra(code, Subtraction_1);
                        intent.putExtra(heading,"Subtraction - 1 :");
                        startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra(code, Subtraction_UI);
                        intent.putExtra(heading,"Subtraction UI :");
                        startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra(code, Area_Of_Circle);
                        intent.putExtra(heading,"Area Of Circle :");
                        startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra(code, Odd_Even);
                        intent.putExtra(heading,"Odd Even :");
                        startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra(code, Add_S_M_Divide);
                        intent.putExtra(heading,"Add Subtract Multiply Divide :");
                        startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra(code, Simple_Calculator);
                        intent.putExtra(heading,"Simple Calculator :");
                        startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra(code, Odd_Even_Range);
                        intent.putExtra(heading,"Odd Even Range :");
                        startActivity(intent);
                        break;
                    case 11:
                        intent.putExtra(code, Sum_Range);
                        intent.putExtra(heading,"Sum in Range :");
                        startActivity(intent);
                        break;
                    case 12:
                        intent.putExtra(code, Greatest_Using_Ternary);
                        intent.putExtra(heading,"Greatest Using Ternary Operator :");
                        startActivity(intent);
                        break;
                    case 13:
                        intent.putExtra(code, Greatest_A_3);
                        intent.putExtra(heading,"Greatest Among 3 :");
                        startActivity(intent);
                        break;
                    case 14:
                        intent.putExtra(code, Swap_Two_Number);
                        intent.putExtra(heading,"Swap Two Number :");
                        startActivity(intent);
                        break;
                    case 15:
                        intent.putExtra(code, Print_ASCII);
                        intent.putExtra(heading,"Print ASCII :");
                        startActivity(intent);
                        break;
                    case 16:
                        intent.putExtra(code, Grade_Of_Marks);
                        intent.putExtra(heading,"Grade Of Marks :");
                        startActivity(intent);
                        break;
                    case 17:
                        intent.putExtra(code, Percent_Of_Marks);
                        intent.putExtra(heading,"Percent Of Marks :");
                        startActivity(intent);
                        break;
                    case 18:
                        intent.putExtra(code, Quotient_Remainder);
                        intent.putExtra(heading,"Quotient Remainder :");
                        startActivity(intent);
                        break;
                    case 19:
                        intent.putExtra(code, Vowel_Consonant);
                        intent.putExtra(heading,"Vowel Consonant :");
                        startActivity(intent);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Programs Under Construction", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void addData() {
        mListItemPOJOS = new ArrayList<>();

        mListItemPOJOS.add(new ListItemPOJO("1.Hello World Program"));
        mListItemPOJOS.add(new ListItemPOJO("2.Addion of two integers"));
        mListItemPOJOS.add(new ListItemPOJO("3.Addition of Integers with Userinput"));
        mListItemPOJOS.add(new ListItemPOJO("4.Addition of Floating point number with Userinput"));
        mListItemPOJOS.add(new ListItemPOJO("5.Subtraction of two Integers"));
        mListItemPOJOS.add(new ListItemPOJO("6.Subtraction of Floating point number with Userinput"));
        mListItemPOJOS.add(new ListItemPOJO("7.Area of Circle"));
        mListItemPOJOS.add(new ListItemPOJO("8.Odd and Even"));
        mListItemPOJOS.add(new ListItemPOJO("9.Add,Sub,Multiply,Divide"));
        mListItemPOJOS.add(new ListItemPOJO("10.Simple Calculator"));
        mListItemPOJOS.add(new ListItemPOJO("11.Odd Even in a Range"));
        mListItemPOJOS.add(new ListItemPOJO("12.Sum in Range"));
        mListItemPOJOS.add(new ListItemPOJO("13.Greatest in two numbers using Ternary Operator"));
        mListItemPOJOS.add(new ListItemPOJO("14.Greatest among 3 Numbers"));
        mListItemPOJOS.add(new ListItemPOJO("15.Swap two number"));
        mListItemPOJOS.add(new ListItemPOJO("16.ASCII Value of Character"));
        mListItemPOJOS.add(new ListItemPOJO("17.Grade of Marks"));
        mListItemPOJOS.add(new ListItemPOJO("18.Percentage of Marks"));
        mListItemPOJOS.add(new ListItemPOJO("19.Quotient and Remainder"));
        mListItemPOJOS.add(new ListItemPOJO("20.Vowel or Consonant"));


    }

    @Override
    public void onBackPressed() {
        long PERIOD = 2000;
        if (back_pressed_time + PERIOD > System.currentTimeMillis()) {
            if (mInterstitialAd.isLoaded()){
                mInterstitialAd.show();
            }
            super.onBackPressed();
        }
        else Toast.makeText(getBaseContext(), "Press once again to exit!", Toast.LENGTH_SHORT).show();
        back_pressed_time = System.currentTimeMillis();
    }

}




























