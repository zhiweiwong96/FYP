package com.example.zw.fyp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesViewHolders>{

    private List<MatchesObject> matchesList;
    private Context context;

    public MatchesAdapter(List<MatchesObject> matchesList, Context context){
        this.matchesList = matchesList;
        this.context = context;
    }


    @NonNull
    @Override
    public MatchesViewHolders onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_matches, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);
        MatchesViewHolders rcv = new MatchesViewHolders(layoutView);

        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesViewHolders matchesViewHolders, int i) {
        matchesViewHolders.mMatchId.setText(matchesList.get(i).getUserId());
        matchesViewHolders.mMatchName.setText(matchesList.get(i).getName());
       if (!matchesList.get(i).getProfileImageUrl().equals("default")){
           Glide.with(context).load(matchesList.get(i).getProfileImageUrl()).into(matchesViewHolders.mMatchImage);
       }
    }

    @Override
    public int getItemCount() {
        return this.matchesList.size();
    }
}
