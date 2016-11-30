package com.example.crow.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    int var1 = 0;
    int var2 = 0;
    char op;
    boolean lastKeyIsOp = false;

    EditText calc_Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc_Text = (EditText) this.findViewById(R.id.edit_message);

    }

    public void One_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("1");
        lastKeyIsOp = false;
    }

    public void Two_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("2");
        lastKeyIsOp = false;
    }
    public void Three_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("3");
        lastKeyIsOp = false;
    }
    public void Four_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("4");
        lastKeyIsOp = false;
    }
    public void Five_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("5");
        lastKeyIsOp = false;
    }
    public void Six_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("6");
        lastKeyIsOp = false;
    }
    public void Seven_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("7");
        lastKeyIsOp = false;
    }
    public void Eight_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("8");
        lastKeyIsOp = false;
    }
    public void Nine_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("9");
        lastKeyIsOp = false;
    }
    public void Zero_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("");
        }
        calc_Text.append("0");
        lastKeyIsOp = false;
    }
    public void Add_button(View view)
    {
        if(var1 != 0){
            var2 = Integer.parseInt(calc_Text.getText().toString());
            var1 += var2;
            calc_Text.setText(Integer.toString(var1));
        }
        else {
            var1 = Integer.parseInt(calc_Text.getText().toString());
        }
        calc_Text.setText("");
        op = '+';
        lastKeyIsOp = true;
    }
    public void Subtract_button(View view)
    {
        if(var1 != 0){
            var2 = Integer.parseInt(calc_Text.getText().toString());
            var1 -= var2;
            calc_Text.setText(Integer.toString(var1));
        }
        else {
            var1 = Integer.parseInt(calc_Text.getText().toString());
        }
        calc_Text.setText("");
        op = '-';
        lastKeyIsOp = true;
    }
    public void Divide_button(View view)
    {
        if(var1 != 0){
            var2 = Integer.parseInt(calc_Text.getText().toString());
            var1 = var1 / var2;
            calc_Text.setText(Integer.toString(var1));
        }
        else {
            var1 = Integer.parseInt(calc_Text.getText().toString());
        }
        calc_Text.setText("");
        op = '/';
        lastKeyIsOp = true;
    }
    public void Multiply_button(View view)
    {
        if(var1 != 0){
            var2 = Integer.parseInt(calc_Text.getText().toString());
            var1 *= var2;
            calc_Text.setText(Integer.toString(var1));
        }
        else {
            var1 = Integer.parseInt(calc_Text.getText().toString());
            calc_Text.setText("");
        }
        op = '*';
        lastKeyIsOp = true;
    }
    public void Equal_button(View view)
    {
        var2 = Integer.parseInt(calc_Text.getText().toString());
        if(op == '+') {
            var2 = var1 + var2;
        }

        calc_Text.setText(Integer.toString(var2));
        lastKeyIsOp = true;
    }
    public void Cancel_button(View view)
    {
        var1 = 0;
        var2 = 0;
        op = "";
        calc_Text.setText("");

    }
}
