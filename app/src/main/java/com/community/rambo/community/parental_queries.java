package com.community.rambo.community;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.*;
import static android.widget.Toast.makeText;

public class parental_queries extends Fragment {
    private static final String TAG="shopping_queries";

   /* private EditText query;
    private Button post;
    Firebase root;
    TextView mvalueview;
    Firebase mref;*/



   EditText editText;
   Button sendbtn;
    DatabaseReference Databasequestion;
    ListView listviewq;
List<Question> QuestionList;




   /* @Override
    public void onStart() {
        super.onStart();
        Databasequestion.addValueEventListener(new com.google.firebase.database.ValueEventListener() {
            @Override
            public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {

                QuestionList.clear();
                for (DataSnapshot:dataSnapshot.getChildren()){
                    Question qwerty=dataSnapshot.getValue(Question.class);
                QuestionList.add(qwerty);
                }


                QuestionList adapter=new QuestionList(parental_queries.this,QuestionList);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.parental_queries,container,false);
listviewq=(ListView)view.findViewById(R.id.listviewq);
        Databasequestion=FirebaseDatabase.getInstance().getReference("parent");

        sendbtn=(Button)view.findViewById(R.id.sendbutton);
        editText=(EditText)view.findViewById(R.id.editText);



QuestionList=new ArrayList<>();
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addQuestion();
                editText.setText("");
            }
        });





        return view;

    }

    private void addQuestion() {
        String question=editText.getText().toString().trim();

        if (!TextUtils.isEmpty(question)){
                String Id=Databasequestion.push().getKey();
                Question qwerty= new Question(Id, question);
            Databasequestion.child(Id).setValue(qwerty);

        }
        else {

        }
    }
}
