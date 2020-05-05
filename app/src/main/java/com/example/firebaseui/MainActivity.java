package com.example.firebaseui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    IDsAdapter iDsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerOptions<IDs> options=new FirebaseRecyclerOptions.Builder<IDs>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("Students"),IDs.class)
                .build();
        iDsAdapter=new IDsAdapter(options);
        recyclerView.setAdapter(iDsAdapter);


    }

    @Override
    protected void onStart() {
        super.onStart();
        iDsAdapter.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
        iDsAdapter.stopListening();
    }
}
