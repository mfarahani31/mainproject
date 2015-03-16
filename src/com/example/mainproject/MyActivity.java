package com.example.mainproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Toast;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.view.ViewPager;


public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
   /* Button help;
    Button home;
    Button about;
    Button rss;
    Button search;
    ImageView imageView;
    EditText editText;
    TextView textView;
*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.vpage);
        myPager.setAdapter(customPagerAdapter);
        myPager.setCurrentItem(0);

/*
        search = (Button) findViewById(R.id.search);
        help = (Button) findViewById(R.id.help);
        home = (Button) findViewById(R.id.home);
        about = (Button) findViewById(R.id.about);
        rss = (Button) findViewById(R.id.rss);
        imageView = (ImageView) findViewById(R.id.imageView);
        editText = (EditText) findViewById(R.id.editTextDialogUserInput);
        textView = (TextView) findViewById(R.id.textView1);

//help button
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this, Help.class);
                startActivity(intent);
            }
        });
        //image
        imageView.setImageResource(R.drawable.tehran);
        imageView.setFocusableInTouchMode(true);


        //search button
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                NoteDialogWin shareWin = new NoteDialogWin(MyActivity.this);

                shareWin.setCanceledOnTouchOutside(false);
                shareWin.show();


                //Searchbox searchbox = new Searchbox();
            }
        });
//about button
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent2 = new Intent(MyActivity.this,Dialogbox.class);
                startActivity(intent2);

        }});
        rss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this,News.class);
                startActivity(intent);
            }
        });
 */   }

}




