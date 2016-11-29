package com.example.crow.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    int var1 = 0;
    int var2 = 0;
    char op;

    EditText calc_Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc_Text = (EditText) this.findViewById(R.id.edit_message);

    }

    public void One_button(View view)
    {
        calc_Text.append("1");

    }

    public void Two_button(View view)
    {
        calc_Text.append("2");

    }
    public void Three_button(View view)
    {
        calc_Text.append("3");

    }
    public void Four_button(View view)
    {
        calc_Text.append("4");

    }
    public void Five_button(View view)
    {
        calc_Text.append("5");

    }
    public void Six_button(View view)
    {
        calc_Text.append("6");

    }
    public void Seven_button(View view)
    {
        calc_Text.append("7");

    }
    public void Eight_button(View view)
    {
        calc_Text.append("8");

    }
    public void Nine_button(View view)
    {
        calc_Text.append("9");

    }
    public void Zero_button(View view)
    {
        calc_Text.append("0");

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
            calc_Text.setText("");
        }
        op = '+';

    }
    public void Subtract_button(View view)
    {
        var1 = Integer.parseInt(calc_Text.getText().toString());
        calc_Text.setText("");
        op = '-';

    }
    public void Divide_button(View view)
    {
        var1 = Integer.parseInt(calc_Text.getText().toString());
        calc_Text.setText("");
        op = '/';

    }
    public void Multiply_button(View view)
    {
        var1 = Integer.parseInt(calc_Text.getText().toString());
        calc_Text.setText("");
        op = '*';

    }
    public void Equal_button(View view)
    {
        var2 = Integer.parseInt(calc_Text.getText().toString());
        if(op == '+') {
            var2 = var1 + var2;
        }

        calc_Text.setText(Integer.toString(var2));

    }
    public void Cancel_button(View view)
    {
        var1 = 0;
        var2 = 0;
        calc_Text.setText("");

    }
}
