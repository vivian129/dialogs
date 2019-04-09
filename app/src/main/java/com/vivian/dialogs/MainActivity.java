package com.vivian.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonA(View view) {

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
builder.setTitle("Do you really want to delete");
builder.setMessage("Deleting this item will be irrecoverable");
builder.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        Toast.makeText(MainActivity.this, "Deleted", Toast.LENGTH_SHORT).show();
    }
});
builder.setNegativeButton("cancel",null);

builder.create().show();
    }

    public void buttonB(View view) {

        final Dialog d =new Dialog(this);
        d.setContentView(R.layout.dialog_layout);
        final EditText InputEmail=d.findViewById(R.id.InputEmail);
        final EditText InputPassword=d.findViewById(R.id.InputPassword);
        Button ButtonSubmit=d.findViewById(R.id.ButtonSubmit);
        ButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=InputEmail.getText().toString().trim();
                String password=InputPassword.getText().toString().trim();
                Toast.makeText(MainActivity.this, email+":"+password, Toast.LENGTH_SHORT).show();
d.dismiss();
            }
        });



        d.show();
    }

    public void buttonC(View view) {
        final Dialog d =new Dialog(this);
        d.setContentView(R.layout.list_dialog);
        d.show();

    }
}
