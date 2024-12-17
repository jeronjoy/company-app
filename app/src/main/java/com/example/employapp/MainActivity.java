package com.example.employapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button b1;
EditText et1;
EditText et2;
String GetName,GetPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       b1=(Button) findViewById(R.id.login);
       et1=(EditText)findViewById(R.id.uname);
       et2=(EditText)findViewById(R.id.pass);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               GetName=et1.getText().toString();
               GetPass=et2.getText().toString();
               if(GetName.equals("ADMIN") && GetPass.equals("1234"))
               {
                   Intent i=new Intent(getApplicationContext(), headActivity.class);
                   startActivity(i);
               }
               else {
                   Toast.makeText(getApplicationContext(),"INVALID",Toast.LENGTH_LONG).show();
               }

           }
       });
    }
}