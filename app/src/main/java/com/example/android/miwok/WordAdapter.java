package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public int backGroundColour;

    public WordAdapter(Activity context, ArrayList<Word> wordList, int backGroundColour){
        super(context,0, wordList);
        this.backGroundColour = backGroundColour;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItem = convertView;
        if(listItem == null){
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView defaultText = (TextView)listItem.findViewById(R.id.defaut_text_view);
        TextView miwokText = (TextView)listItem.findViewById(R.id.miwok_text_view);
        ImageView image = (ImageView)listItem.findViewById(R.id.image_view);

        defaultText.setText(currentWord.getDefaultText());
        miwokText.setText(currentWord.getMiwokText());

        if(currentWord.hasImage()){
            image.setImageResource(currentWord.getImage());
        }else {
            image.setVisibility(View.GONE);
        }

        View textContainer = listItem.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), backGroundColour);
        textContainer.setBackgroundColor(color);

        return listItem;
    }
}
