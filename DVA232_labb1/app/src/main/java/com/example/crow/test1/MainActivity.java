package com.example.crow.test1;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    Integer var1 = null;
    Integer var2 = null;
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
        if(var1 != null){
            MyEquals();
        }
        else {
            var1 = Integer.parseInt(calc_Text.getText().toString());
        }
        op = '+';
        lastKeyIsOp = true;
    }
    public void Subtract_button(View view)
    {
        if(var1 != null){
            MyEquals();
        }
        else {
            var1 = Integer.parseInt(calc_Text.getText().toString());
        }
        op = '-';
        lastKeyIsOp = true;
    }
    public void Divide_button(View view)
    {
        if(var1 != null){
            MyEquals();
        }
        else {
            var1 = Integer.parseInt(calc_Text.getText().toString());
        }
        op = '/';
        lastKeyIsOp = true;
    }
    public void Multiply_button(View view)
    {
        if(var1 != null){
            MyEquals();
        }
        else {
            var1 = Integer.parseInt(calc_Text.getText().toString());
        }
        op = '*';
        lastKeyIsOp = true;
    }
    public void Equal_button(View view)
    {
        MyEquals();
    }
    public void Cancel_button(View view)
    {
        var1 = null;
        var2 = null;
        calc_Text.setText("");

    }
    public void MyEquals()
    {
        var2 = Integer.parseInt(calc_Text.getText().toString());
        switch (op){
            case '+':
                var1 = var1 + var2;
                break;
            case '-':
                var1 = var1 - var2;
                break;
            case '*':
                var1 = var1 * var2;
                break;
            case'/':
                var1 = var1 / var2;
                break;
        }

        calc_Text.setText(Integer.toString(var1));
    }
}
