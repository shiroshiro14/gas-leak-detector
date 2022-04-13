package com.example.glds;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {
    /*public final String ref_speaker = "/-N-Wl45v3oVXQ_q0NdsA";
    public final String ref_gas = "-N-Wl47YbSfz-gp4uca4";
    public final String ref_relay = "-N-Wl49AQipsuIOPTjoh";

    FirebaseDatabase gldsDatabase = FirebaseDatabase.getInstance();
    DatabaseReference myRef = gldsDatabase.getReference(ref_speaker);*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView pipe_logo = findViewById(R.id.pipe_logo);
        TextView pipe_status = findViewById(R.id.pipe_status);
        EditText valve_status = findViewById(R.id.valve_status);
        EditText temp = findViewById(R.id.temp);
        EditText gas_level = findViewById(R.id.gas_level);

        temp.setText("N/A");
        /*myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                gas_level.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });*/
    }
}