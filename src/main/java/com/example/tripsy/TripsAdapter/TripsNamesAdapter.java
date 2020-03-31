package com.example.tripsy.TripsAdapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tripsy.Model.TripsNames;
import com.example.tripsy.R;

import java.util.ArrayList;

public class TripsNamesAdapter extends RecyclerView.Adapter<TripsNamesAdapter.TripsHolder> {

    private ArrayList<TripsNames> mTripsNames;


    public static class TripsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public RelativeLayout mDetailsView, mBackgroundView, mCardLayout;
        public CardView mTripCardView;
        //        private int shortAnimationDuration;
        private boolean showingFirst = true;

        public ImageView mIconImageView;
        public ImageView mArrowImageView;
        public TextView mTripNameTxtView;

        public TripsHolder(@NonNull View itemView) {
            super(itemView);

            mIconImageView = itemView.findViewById(R.id.iconImage);
            mArrowImageView = itemView.findViewById(R.id.arrowImage);
            mTripNameTxtView = itemView.findViewById(R.id.tripName);
            mBackgroundView = itemView.findViewById(R.id.view_background);
            mCardLayout = itemView.findViewById(R.id.cardRelativeLayout);
            mDetailsView = itemView.findViewById(R.id.view_details);
            mDetailsView.setVisibility(View.INVISIBLE);
            mTripCardView = itemView.findViewById(R.id.tripNameCard);
            mCardLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showingLayout();
                }
            });

            //itemView.setOnClickListener(this);
        }

        public void showingLayout(){
            if(showingFirst == true){
                mCardLayout.setVisibility(View.INVISIBLE);
                mDetailsView.setVisibility(View.VISIBLE);
                mBackgroundView.setVisibility(View.VISIBLE);
                showingFirst = false;
            }else{
                mDetailsView.setVisibility(View.INVISIBLE);
                mCardLayout.setVisibility(View.VISIBLE);
                mBackgroundView.setVisibility(View.VISIBLE);
                showingFirst = true;
            }

        }

        @Override
        public void onClick(View v) {

//            if(showingFirst == true){
//                mCardLayout.setVisibility(View.INVISIBLE);
//                mDetailsView.setVisibility(View.VISIBLE);
//                showingFirst = false;
//            }else{
//                mCardLayout.setVisibility(View.INVISIBLE);
//                mDetailsView.setVisibility(View.VISIBLE);
//                showingFirst = true;
//            }

        }
    }

    public TripsNamesAdapter(ArrayList<TripsNames> trips) {
        mTripsNames = trips;
    }

    @NonNull
    @Override
    public TripsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.trips, parent, false);
        TripsHolder tripsHolder = new TripsHolder(v);

        return tripsHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TripsHolder holder, int position) {

        TripsNames currentTripsNames = mTripsNames.get(position);
        holder.mIconImageView.setImageResource(currentTripsNames.getmIconImage());
        holder.mArrowImageView.setImageResource(currentTripsNames.getmArrowImage());
        holder.mTripNameTxtView.setText(currentTripsNames.getmTripName());

    }

    @Override
    public int getItemCount() {
        return mTripsNames.size();
    }

    public void removeTrip(int position) {
        mTripsNames.remove(position);
        notifyItemRemoved(position);
    }

    public void restoreTrip(int position, TripsNames tripsName) {
        mTripsNames.add(position, tripsName);
        notifyItemInserted(position);
    }


//            mTripCardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mCardLayout.setAlpha(0f);
//                    mCardLayout.setVisibility(View.VISIBLE);
//
//                    mCardLayout.animate()
//                            .alpha(1f)
//                            .setDuration(shortAnimationDuration)
//                            .setListener(null);
//
//                    mDetailsView.animate()
//                            .alpha(0f)
//                            .setDuration(shortAnimationDuration)
//                            .setListener(new AnimatorListenerAdapter() {
//                                @Override
//                                public void onAnimationEnd(Animator animation) {
//                                    mDetailsView.setVisibility(View.GONE);
//                                }
//                            });
//
//                }
//            });
}