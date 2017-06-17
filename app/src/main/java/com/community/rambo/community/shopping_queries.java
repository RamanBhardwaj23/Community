package com.community.rambo.community;

/**
 * Created by M bhardwaj on 16-Jun-17.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class shopping_queries extends Fragment {
    private static final String TAG="shopping_queries";

    private EditText query;
    private Button post;
    Firebase root;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.shopping_queries,container,false);
        root = new Firebase("https://funcandi-community-e41a7.firebaseio.com/Shopping/");
        post = (Button)view.findViewById(R.id.buttonp);
        query = (EditText)view.findViewById(R.id.query);


        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Value = query.getText().toString();
                root.push().setValue(Value);
                query.setText("");


            }
        });


        return view;

    }
}
