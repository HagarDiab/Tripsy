package com.example.tripsy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.tripsy.TripsAdapter.HistoryFragment;

public class HistoryActivity extends AppCompatActivity {

//    private RecyclerView mRecyclerView;
//    private RecyclerView.Adapter mRecyclerViewAdapter;
//    private  RecyclerView.LayoutManager mRecyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        getSupportActionBar().setTitle("Trips History");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        HistoryFragment historyFragment = new HistoryFragment();
        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.historyLayout, historyFragment);
        fragmentTransaction.commit();

//        ArrayList<TripsNames> tripsNames = new ArrayList<>();
//        tripsNames.add(new TripsNames(R.drawable.icon_1,R.drawable.white_arrow,"TRIP_1_NAME"));
//        tripsNames.add(new TripsNames(R.drawable.icon_2,R.drawable.white_arrow,"TRIP_2_NAME"));


//        mRecyclerView =findViewById(R.id.recyclerview);
//        //mRecyclerView.setHasFixedSize(true);
//
//        mRecyclerViewLayoutManager = new LinearLayoutManager(this);
//        //
//        mRecyclerView.setLayoutManager(mRecyclerViewLayoutManager);
//
//        mRecyclerViewAdapter = new TripsNamesAdapter(tripsNames);
//        mRecyclerView.setAdapter(mRecyclerViewAdapter);

    }
}
