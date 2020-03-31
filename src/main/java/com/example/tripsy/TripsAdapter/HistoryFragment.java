package com.example.tripsy.TripsAdapter;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tripsy.Helper.RecyclerItemTouchHelper;
import com.example.tripsy.Helper.RecyclerItemTouchHelperListener;
import com.example.tripsy.Model.TripsNames;
import com.example.tripsy.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment implements RecyclerItemTouchHelperListener {

    private RecyclerView mRecyclerView;
    private TripsNamesAdapter mRecyclerViewAdapter;
    private RecyclerView.LayoutManager mRecyclerViewLayoutManager;
    private ArrayList<TripsNames> tripsNames = new ArrayList<>();

    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        tripsNames.add(new TripsNames(R.drawable.icon_1, R.drawable.white_arrow, "TRIP_1_NAME"));
        tripsNames.add(new TripsNames(R.drawable.icon_2, R.drawable.white_arrow, "TRIP_2_NAME"));

        View v = inflater.inflate(R.layout.fragment_recycler, container, false);
        mRecyclerView = v.findViewById(R.id.recyclerview);

        mRecyclerViewLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerViewAdapter = new TripsNamesAdapter(tripsNames);
        mRecyclerView.setLayoutManager(mRecyclerViewLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        mRecyclerView.setAdapter(mRecyclerViewAdapter);

        ItemTouchHelper.SimpleCallback itemTouchHelperCallBack= new RecyclerItemTouchHelper(0,ItemTouchHelper.LEFT,this);
        new ItemTouchHelper(itemTouchHelperCallBack).attachToRecyclerView(mRecyclerView);
        return v;
    }

    @Override
    public void onSwipe(RecyclerView.ViewHolder viewHolder, int direction, int position) {

        if (viewHolder instanceof TripsNamesAdapter.TripsHolder){
            String name = tripsNames.get(viewHolder.getAdapterPosition()).getmTripName();
            final TripsNames deletedTrip = tripsNames.get(viewHolder.getAdapterPosition());
            final int deletedIndex = viewHolder.getAdapterPosition();

            mRecyclerViewAdapter.removeTrip(deletedIndex);
            Snackbar snackbar = Snackbar.make(mRecyclerView,name+" removed", Snackbar.LENGTH_LONG);
            snackbar.setAction("UNDO", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mRecyclerViewAdapter.restoreTrip(deletedIndex,deletedTrip);

                }
            });

            snackbar.setActionTextColor(Color.GREEN);
            snackbar.show();
        }

    }
}
