package com.utilities.multiplescreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private Button send;
    public static final String EXTRA_NAME="com.utilities.multiplescreenapp.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextTextPersonName);
        send=findViewById(R.id.button);


    }



    public void openSecondActivity(View view){
        Toast.makeText(this, "Send Button CLicked", Toast.LENGTH_SHORT).show();

        String getname=name.getText().toString();


        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra(EXTRA_NAME,getname);
        startActivity(intent);
    }
}