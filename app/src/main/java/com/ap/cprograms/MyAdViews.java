package com.ap.cprograms;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MyAdViews {
    private InterstitialAd interstitialAd;
    private AdView adView;
    //    String adUnitId, AppId;
    Context myContext;

    public MyAdViews() {
    }

    public MyAdViews(Context myContext) {
        this.myContext = myContext;
    }

    public void initInterstitialAdView(String interstitialAdUnitId, String testDeviceId){
        interstitialAd = new InterstitialAd(myContext);
        interstitialAd.setAdUnitId(interstitialAdUnitId);
        interstitialAd.loadAd(new AdRequest
                .Builder()
                .addTestDevice(testDeviceId)
                .build()
        );

    }

    public void initBannerAdView(int bannerAdUnitId, int testDeviceId) {
        adView = new AdView(myContext);
        adView.setAdUnitId(String.valueOf(bannerAdUnitId));
        interstitialAd.loadAd(new AdRequest
                .Builder()
                .addTestDevice(String.valueOf(testDeviceId))
                .build()
        );
    }

//    public void initAdView() {
//
//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId(getString(R.string.Interstitial1_adunit_ID));
//        mInterstitialAd.loadAd(new AdRequest
//                .Builder()
//                .addTestDevice(getString(R.string.TestDevice_ID))
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .build());
//
//        AdView adView = new AdView(this);
//        adView.setAdSize(AdSize.BANNER);
//        adView.setAdUnitId(getString(R.string.Banner1_adunit_ID));
//
//        mAdView1.loadAd(new AdRequest
//                .Builder()
//                .addTestDevice(getString(R.string.TestDevice_ID))
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .build()
//        );
//
//        mInterstitialAd.setAdListener(new AdListener(){
//
//            @Override
//            public void onAdClosed() {
//                mInterstitialAd.loadAd(new AdRequest
//                        .Builder()
//                        .addTestDevice(getString(R.string.TestDevice_ID))
//                        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                        .build());
//                super.onAdClosed();
//            }
//        });
//
//    }
}
