package com.nikita.c0766552_ex1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnClick;
    private EditText edtPassword;
    private EditText edtEmail;
    private TextView txtView;
    private Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actBar =getSupportActionBar();
        actBar.setTitle("C0766552 Login");

        btnClick = findViewById(R.id.btnLogin);
        edtPassword = findViewById(R.id.edtPassword);
        edtEmail = findViewById(R.id.edtEmail);
        txtView = findViewById(R.id.txtView);
        switch1 = findViewById(R.id.switch1);

        btnClick.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (edtEmail.getText().toString().equals("admin@admin.com") && edtPassword.getText().toString().equals("s3cr3t")) {
            Intent mInt = new Intent(LoginActivity.this, SecondActivity.class);
            mInt.putExtra("user","Nikita Sandhu");
            startActivity(mInt);
           // txtView.setTextColor(getResources().getColor(R.color.correct));
           // txtView.setText("Success");
        } else {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setCancelable(false);
            alert.setTitle("Error");
            alert.setMessage("Invalid User ID and Password");
            alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog aDialog = alert.create();
            aDialog.show();
            // Toast.makeText(LoginActivity.this,"Invalid email and password", Toast.LENGTH_SHORT).show();
           // txtView.setTextColor(getResources().getColor(R.color.incorrect));
           // txtView.setText("Failed");
        }
    }
}
