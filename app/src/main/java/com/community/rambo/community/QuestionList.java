package com.community.rambo.community;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.List;



public class QuestionList extends ArrayAdapter<Question> {


    private Activity context;
    private List<Question> QuestionList;



public QuestionList(Activity context, List<Question> QuestionList){
    super(context,R.layout.pop,QuestionList);
    this.context=context;
            this.QuestionList=QuestionList;
}




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater  inflater=context.getLayoutInflater();
        View ListviewItem=inflater.inflate(R.layout.pop,null,true);

        TextView textViewname = (TextView)ListviewItem.findViewById(R.id.NameView);
        TextView textViewQuestion = (TextView)ListviewItem.findViewById(R.id.QuestionView);


        Question Question =QuestionList.get(position);
        //textViewname.setText(Question.getId());
        textViewQuestion.setText((Question.getQuestion()));
        return ListviewItem;
    }
}
