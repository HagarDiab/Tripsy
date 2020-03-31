package com.example.tripsy.TripsAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tripsy.Model.Notes;
import com.example.tripsy.R;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesHolder> {

    private List<Notes> mNotesList;
    private final boolean[] mCheckedStateA;


    public class NotesHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public CheckBox checkBox1;

        public NotesHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            checkBox1 = view.findViewById(R.id.checkBox1);
        }
    }

    public NotesAdapter(List<Notes> notesList) {
        mNotesList = notesList;
        mCheckedStateA = new boolean[mNotesList.size()];
    }

    @Override
    public NotesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_note_row_widget, parent, false);

        return new NotesHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NotesHolder holder, final int position) {
        Notes movie = mNotesList.get(position);
        holder.title.setText(movie.getTitle());


        holder.checkBox1.setChecked(false);

        if (mCheckedStateA[position]) {
            holder.checkBox1.setChecked(true);

        } else {
            holder.checkBox1.setChecked(false);

        }

        holder.checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mCheckedStateA[position] = !isChecked;
            }
        });
    }

    @Override
    public int getItemCount() {
        return mNotesList.size();
    }
}
