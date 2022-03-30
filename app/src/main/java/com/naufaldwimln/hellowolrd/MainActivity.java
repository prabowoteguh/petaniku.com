package com.naufaldwimln.hellowolrd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private ImageView foto_saya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        foto_saya = findViewById(R.id.imageView);

        new DownloadImageTask((ImageView) findViewById(R.id.imageView))
                .execute("https://instagram.fcgk29-1.fna.fbcdn.net/v/t51.2885-15/270459434_880755392615391_7713930701135667396_n.jpg?stp=dst-jpg_e35&_nc_ht=instagram.fcgk29-1.fna.fbcdn.net&_nc_cat=103&_nc_ohc=lp1dfEXoahcAX9W4YgV&edm=ALQROFkBAAAA&ccb=7-4&ig_cache_key=Mjc0MTk0MDAxOTU1NTIyNjQxOA%3D%3D.2-ccb7-4&oh=00_AT9vxlqnuG-uQ3yMAP1qLX6ToR5REbPFGnuFXmvGCgi4Ww&oe=624B46C4&_nc_sid=30a2ef");

    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }



}