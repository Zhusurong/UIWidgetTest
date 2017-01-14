package com.example.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;

    private ImageView imageview;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle saveInstanceState){
         super.onCreate(saveInstanceState);
         setContentView(R.layout.activity_main);
         Button button = (Button) findViewById(R.id.button);
         editText = (EditText) findViewById(R.id.edit_text);
         imageview = (ImageView) findViewById(R.id.image_view);
         progressBar = (ProgressBar) findViewById(R.id.progress_bar);
         button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                ProgressDialog progressDialog = new ProgressDialog
                        (MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            default:
                break;
        }
    }

}
