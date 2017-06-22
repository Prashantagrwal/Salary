package com.example.dell.salarycalculator.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.dell.salarycalculator.R;


public class FragmentView extends Fragment implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner spinner;
    Button refresh_one,refresh_two;
    EditText et_1,et_2,et_3,et_4;
    ArrayAdapter<CharSequence> adapter;
    TextView text_1,text_2,text_3,text_4,text_5,text_6,text_7,text_8,text_9,text_10,text_11,text_12,text_13;
    double st_1=0,st_2=0,st_3=0,st_4=0,st_9=0,st_5=0,st_6=0,st_7=0,st_8=0,st_10=0,st_11=0,st_12=0,st_13=0,getValue;
    String et_string_one,et_string_two,et_string_three,et_string_four;
    double value,getValueTwo,valueTwo,valueThree,valueFour;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_content,container,false);
        spinner= (Spinner) rootView.findViewById(R.id.spinner);
        ids(rootView);
        add_value();
        return rootView;
    }

    private void ids(View view)
    {
        refresh_one= (Button) view.findViewById(R.id.refresh_one);
        refresh_two= (Button) view.findViewById(R.id.refresh_two);

        text_1= (TextView) view.findViewById(R.id.text_1);
        text_2= (TextView) view.findViewById(R.id.text_2);
        text_3= (TextView) view.findViewById(R.id.text_3);
        text_4= (TextView) view.findViewById(R.id.text_4);
        text_5= (TextView) view.findViewById(R.id.text_5);
        text_6= (TextView) view.findViewById(R.id.text_6);
        text_7= (TextView) view.findViewById(R.id.text_7);
        text_8= (TextView) view.findViewById(R.id.text_8);
        text_9= (TextView) view.findViewById(R.id.text_9);
        text_10= (TextView) view.findViewById(R.id.text_10);
        text_11= (TextView) view.findViewById(R.id.text_11);
        text_12= (TextView) view.findViewById(R.id.text_12);
        text_13= (TextView) view.findViewById(R.id.text_13);

        et_1= (EditText) view.findViewById(R.id.editText_first);
        et_2= (EditText) view.findViewById(R.id.editText_two);
        et_3= (EditText) view.findViewById(R.id.editText_three);
        et_4= (EditText) view.findViewById(R.id.editText_four);

        refresh_one.setOnClickListener(this);
        refresh_two.setOnClickListener(this);

        et_1.addTextChangedListener(new MyTextWatcher(et_1));
        et_2.addTextChangedListener(new MyTextWatcher(et_2));
        et_3.addTextChangedListener(new MyTextWatcher(et_3));
        et_4.addTextChangedListener(new MyTextWatcher(et_4));

    }

    private void add_value()
    { spinner.setOnItemSelectedListener(this);
        adapter=ArrayAdapter.createFromResource(getActivity(),R.array.category_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        if(position==0)
        {
            PostionOne();
        }
        else if(position==1)
        {
            PostionTwo();
        }
        else if(position==2)
        {
            PostionThree();
        }
    }

    private void PostionOne()
    {
        emptyTwo();emptyOne();
        st_4=530;
        st_9=4300;
        st_10=132*(st_9/100);
        text_9.setText(String.valueOf(st_9));
        text_10.setText(String.valueOf(st_10));
        text_4.setText(String.valueOf(st_4));
        text_5.setText(String .valueOf(st_4));
        valueFour=st_9/10;
        text_12.setText(String.valueOf(valueFour));
    }

    private void PostionTwo()
    {
        emptyOne();emptyTwo();
        st_4=450;
        st_9=4200;
        st_10=132*(st_9/100);
        text_9.setText(String.valueOf(st_9));
        text_10.setText(String.valueOf(st_10));
        text_4.setText(String.valueOf(st_4));
        text_5.setText(String .valueOf(st_4));
        valueFour=st_9/10;
        text_12.setText(String.valueOf(valueFour));
    }

    private void PostionThree()
    { emptyTwo();emptyOne();
        emptyOne();emptyTwo();
        st_4=380;
        st_9=2400;
        st_10=132*(st_9/100);

        text_9.setText(String.valueOf(st_9));
        text_10.setText(String.valueOf(st_10));
        text_4.setText(String.valueOf(st_4));
        text_5.setText(String.valueOf(st_4));
        valueFour=st_9/10;
        text_12.setText(String.valueOf(valueFour));
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view)
    {int id=view.getId();
        switch (id)
        {
            case R.id.refresh_one :
             emptyOne();
                break;
            case R.id.refresh_two :
             emptyTwo();
                break;
        }



    }


    void emptyOne()
    {

        et_2.setEnabled(false);

        et_string_one=et_1.getText().toString();
        et_string_two=et_2.getText().toString();
        if(!et_string_one.matches(""))
        {et_1.setText("");}
        if(!et_string_two.matches(""))
        {
            et_2.setText("");
        }

        st_1=0;st_2=0;st_3=0;st_9=0;st_6=0;st_7=0;st_8=0;st_10=0;
        text_1.setText(String.valueOf(st_1));
        text_2.setText(String.valueOf(st_2));
        text_3.setText(String.valueOf(st_3));
        text_6.setText(String.valueOf(st_6));
        text_7.setText(String.valueOf(st_7));
        text_8.setText(String.valueOf(st_8));
    }


    private void emptyTwo()
    {
        et_4.setEnabled(false);
        et_string_three=et_3.getText().toString();
        et_string_four=et_4.getText().toString();
        if(!et_string_three.matches(""))
        {et_3.setText("");}
        if(!et_string_four.matches(""))
        {
            et_4.setText("");
        }
        st_11=0;st_13=0;
        text_11.setText(String.valueOf(st_11));
        text_13.setText(String.valueOf(st_13));
    }

    public class MyTextWatcher implements TextWatcher {

        View view;

        public MyTextWatcher(View view) {
            this.view = view;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable)
        {   switch (view.getId())

        {
            case R.id.editText_first :
                  EtOne();
                break;
            case R.id.editText_two :
             EtTwo();
                break;
            case R.id.editText_three :
                 EtThree();
                break;
            case R.id.editText_four :
                  EtFour();
                break;
        }

        }
    }

    private void EtThree()
    {  et_string_three=et_3.getText().toString();
        if(!et_string_three.matches(""))
        {
            et_4.setEnabled(true);
            getValueTwo=Double.valueOf(et_string_three);
           et_string_four=et_4.getText().toString();
            if(et_string_four.matches(""))
            {
                valueTwo=0;
            }
            valueThree=getValueTwo+valueTwo;
            text_11.setText(String.valueOf(Math.round(valueThree*100.0)/100.0));
            if(valueThree-valueFour<0)
            {
                text_13.setText(String.valueOf(0));
            }
            else
            {
                text_13.setText(String.valueOf(Math.round((valueThree-valueFour)*100.0)/100.0));
            }

        }
        else
        {
            emptyTwo();
        }
    }

    private void EtFour()
    { et_string_four=et_4.getText().toString();
        if(!et_string_four.matches(""))
        {
            valueTwo=Double.valueOf(et_string_four);
        }
          else
        {
            valueTwo=0;
        }
        valueThree=getValueTwo+valueTwo;
        text_11.setText(String.valueOf(Math.round(valueThree*100.0)/100.0));
        if(valueThree-valueFour<0)
        {
            text_13.setText(String.valueOf(0));
        }
        else
        {
            text_13.setText(String.valueOf(Math.round((valueThree-valueFour)*100.0)/100.0));
        }


    }

    private void EtTwo()
    {
        et_string_two =et_2.getText().toString();

        if(!et_string_two.matches(""))
        {
            st_5=Double.valueOf(et_string_two);

        }
        else
        {
            st_5=0;
        }
        st_6=st_3+value+(st_4*2)+st_5;
        st_7=getValue/10;
        st_8=st_6-st_7;
        text_1.setText(String.valueOf(Math.round(st_1*100.0)/100.0));
        text_2.setText(String.valueOf(Math.round(st_2*100.0)/100.0));
        text_3.setText(String.valueOf(Math.round(st_3*100.0)/100.0));
        text_6.setText(String.valueOf(Math.round(st_6*100.0)/100.0));
        text_7.setText(String.valueOf(Math.round(st_7*100.0)/100.0));
        text_8.setText(String.valueOf(Math.round(st_8*100.0)/100.0));   }


    private void EtOne()
    {
        et_string_one =et_1.getText().toString();
        if(!et_string_one.matches(""))
        {
            et_2.setEnabled(true);
            getValue=Double.valueOf(et_string_one);
            st_1=143*(getValue/100);
            st_2=(getValue/20);
            value=getValue+st_1+st_2;
            st_3=(15*(value)/100);

            et_string_two=et_2.getText().toString();
            if(et_string_two.matches(""))
            {
              st_5=0;
            }
            st_6=st_3+value+(st_4*2)+st_5;
            st_7=getValue/10;
            st_8=st_6-st_7;
            text_1.setText(String.valueOf(Math.round(st_1*100.0)/100.0));
            text_2.setText(String.valueOf(Math.round(st_2*100.0)/100.0));
            text_3.setText(String.valueOf(Math.round(st_3*100.0)/100.0));
            text_6.setText(String.valueOf(Math.round(st_6*100.0)/100.0));
            text_7.setText(String.valueOf(Math.round(st_7*100.0)/100.0));
            text_8.setText(String.valueOf(Math.round(st_8*100.0)/100.0));
    }
    else
        {
            emptyOne();
        }
    }

    }

