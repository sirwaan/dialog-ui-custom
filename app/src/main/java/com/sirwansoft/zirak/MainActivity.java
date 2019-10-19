package com.sirwansoft.zirak;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Dialog myAppAdsDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAppAdsDialog=new Dialog(this,android.R.style.Theme_Light_NoTitleBar_Fullscreen);
        showPopUp();

    }
        public void showPopUp() {

            myAppAdsDialog.setContentView(R.layout.pop_up);
            myAppAdsDialog.setCancelable(false);  //can close easily or not
            ImageView imageCancelDialogAdsApp = myAppAdsDialog.findViewById(R.id.imageView_close);
            Button btnToast = myAppAdsDialog.findViewById(R.id.btn_toast);

            imageCancelDialogAdsApp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myAppAdsDialog.dismiss();
                }
            });
            myAppAdsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            btnToast.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
            /*        String url = "https://play.google.com/store/apps/details?id=com.awat.soran";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);*/

                    Toast.makeText(MainActivity.this, "this is a dialog", Toast.LENGTH_SHORT).show();
                }
            });
            myAppAdsDialog.show();



        }
}





//todo ==>> 1) noActionBar style
//todo ==>> 2) add cardView Library
//todo ==>> 3) make new pop_up.xml to dialog model
//todo ==>> 4) code it and enjoy