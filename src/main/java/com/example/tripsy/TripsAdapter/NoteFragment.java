package com.example.tripsy.TripsAdapter;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tripsy.Helper.RecyclerItemTouchHelper;
import com.example.tripsy.Helper.RecyclerItemTouchHelperListener;
import com.example.tripsy.Model.Notes;
import com.example.tripsy.Model.TripsNames;
import com.example.tripsy.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class NoteFragment extends Fragment {

//    private RecyclerView mRecyclerView;
//    private NotesAdapter notesAdapter;
//    private RecyclerView.LayoutManager mRecyclerViewLayoutManager;
//    private List<Notes> mNotesList;
//
//    public NoteFragment() {
//        // Required empty public constructor
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//
//
//        mNotesList.add(new Notes("Note_1"));
//        mNotesList.add(new Notes("Note_2"));
//
//        View v = inflater.inflate(R.layout.layout_floating_widget, container, false);
//        mRecyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
//
//        mRecyclerViewLayoutManager = new LinearLayoutManager(getActivity());
//        notesAdapter = new NotesAdapter(mNotesList);
//        mRecyclerView.setLayoutManager(mRecyclerViewLayoutManager);
//        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
//        mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
//        mRecyclerView.setAdapter(notesAdapter);
//
//        return v;
//    }

}
