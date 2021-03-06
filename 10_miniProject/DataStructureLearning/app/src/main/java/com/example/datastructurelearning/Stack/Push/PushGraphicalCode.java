package com.example.datastructurelearning.Stack.Push;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.datastructurelearning.GraphicalText;
import com.example.datastructurelearning.GraphicsLine;
import com.example.datastructurelearning.R;
import com.example.datastructurelearning.GraphicsRectangle;

public class PushGraphicalCode extends Fragment {

    RelativeLayout pushGraphicLayout;
    Button animationButton,codeButton;
    TextView operationTextView;
    ScrollView scrollView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_push_graphical_code, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pushGraphicLayout = view.findViewById(R.id.pushGraphicalLayout);
        animationButton = view.findViewById(R.id.animationButton);
        codeButton = view.findViewById(R.id.codeButton);
        operationTextView = view.findViewById(R.id.operationTextView);
        scrollView = view.findViewById(R.id.codeScrollView);

        pushGraphicLayout.addView(new GraphicsRectangle(getActivity(),350,350,550,450,Color.BLACK)); // Value part of node
        pushGraphicLayout.addView(new GraphicsRectangle(getActivity(),350,500,550,600,Color.BLACK));

        pushGraphicLayout.addView(new GraphicsRectangle(getActivity(),550,350,650,450,Color.BLACK)); // Link part of node
        pushGraphicLayout.addView(new GraphicsRectangle(getActivity(),550,500,650,600,Color.BLACK));

        pushGraphicLayout.addView(new GraphicalText(getActivity(),375,425,"Data 2",Color.BLACK));//Inserting data
        pushGraphicLayout.addView(new GraphicalText(getActivity(),375,575,"Data 1",Color.BLACK));


        pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,435,750,435, Color.BLACK)); // Linking the Node
        pushGraphicLayout.addView(new GraphicsLine(getActivity(),750,435,750,515,Color.BLACK));
        pushGraphicLayout.addView(new GraphicsLine(getActivity(),750,515,650,515,Color.BLACK));

        pushGraphicLayout.addView(new GraphicalText(getActivity(),750,400,"Top Node",Color.BLACK));//Initial Top Node
        pushGraphicLayout.addView(new GraphicsLine(getActivity(),750,400,650,400,Color.BLACK));//line
        pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,400,675,410,Color.BLACK));//Arrow
        pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,400,675,390,Color.BLACK));//

        pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,515,675,505,Color.BLACK)); // Arrow Head
        pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,515,675,525,Color.BLACK));

        codeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.setVisibility(View.VISIBLE);
            }
        });

        animationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAnimations();
            }
        });

    }

    private void showAnimations() {

        pushGraphicLayout.addView(new GraphicsRectangle(getActivity(),550,200,650,300,Color.BLACK)); // New node creation
        pushGraphicLayout.addView(new GraphicsRectangle(getActivity(),350,200,550,300,Color.BLACK));
        operationTextView.setText("The new node to be added is created");

        new CountDownTimer(2000,1000){

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

                pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,285,750,285,Color.BLACK)); // Linking the Node
                pushGraphicLayout.addView(new GraphicsLine(getActivity(),750,285,750,365,Color.BLACK));
                pushGraphicLayout.addView(new GraphicsLine(getActivity(),750,365,650,365,Color.BLACK));

                pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,365,675,355,Color.BLACK)); // Arrow Head
                pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,365,675,375,Color.BLACK));

                pushGraphicLayout.addView(new GraphicalText(getActivity(),750,400,"Top Node",Color.WHITE));//Initial Arrow
                pushGraphicLayout.addView(new GraphicsLine(getActivity(),750,400,650,400,Color.WHITE));//line
                pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,400,675,410,Color.WHITE));//Arrow
                pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,400,675,390,Color.WHITE));//

                pushGraphicLayout.addView(new GraphicalText(getActivity(),750,250,"Top Node",Color.BLACK));//Final Text
                pushGraphicLayout.addView(new GraphicsLine(getActivity(),750,250,650,250,Color.BLACK));//line
                pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,250,675,260,Color.BLACK));//Arrow
                pushGraphicLayout.addView(new GraphicsLine(getActivity(),650,250,675,240,Color.BLACK));//*/

                pushGraphicLayout.addView(new GraphicalText(getActivity(),375,275,"Data 3",Color.BLACK));//data In new node

                operationTextView.setText("The link is created");


            }
        }.start();


    }


}
