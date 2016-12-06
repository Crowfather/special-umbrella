package com.example.crow.test1;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    String temp = null;
    Long var1 = null;
    Long var2 = null;
    char op;
    boolean lastKeyIsOp = true;

    EditText calc_Text;

    //int k = Integer.valueOf(String.valueOf(i) + String.valueOf(j));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc_Text = (EditText) this.findViewById(R.id.edit_message);

    }

    public void One_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("1");
            temp = "1";
        }
        else {
            temp += "1";
            calc_Text.append("1");
        }

        lastKeyIsOp = false;
    }

    public void Two_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("2");
            temp = "2";
        }
        else {
            temp += "2";
            calc_Text.append("2");
        }

        lastKeyIsOp = false;
    }
    public void Three_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("3");
            temp = "3";
        }
        else {
            temp += "3";
            calc_Text.append("3");
        }
        lastKeyIsOp = false;
    }
    public void Four_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("4");
            temp = "4";
        }
        else {
            temp += "4";
            calc_Text.append("4");
        }
        lastKeyIsOp = false;
    }
    public void Five_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("5");
            temp = "5";
        }
        else {
            temp += "5";
            calc_Text.append("5");
        }
        lastKeyIsOp = false;
    }
    public void Six_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("6");
            temp = "6";
        }
        else {
            temp += "6";
            calc_Text.append("6");
        }
        lastKeyIsOp = false;
    }
    public void Seven_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("7");
            temp = "7";
        }
        else {
            temp += "7";
            calc_Text.append("7");
        }
        lastKeyIsOp = false;
    }
    public void Eight_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("8");
            temp = "8";
        }
        else {
            temp += "8";
            calc_Text.append("8");
        }
        lastKeyIsOp = false;
    }
    public void Nine_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("9");
            temp = "9";
        }
        else {
            temp += "9";
            calc_Text.append("9");
        }
        lastKeyIsOp = false;
    }
    public void Zero_button(View view)
    {
        if(lastKeyIsOp == true) {
            calc_Text.setText("0");
            temp = "0";
        }
        else {
            temp += "0";
            calc_Text.append("0");
        }
        lastKeyIsOp = false;
    }
    public void Add_button(View view)
    {
        MyEquals();
        op = '+';
    }
    public void Subtract_button(View view)
    {
        MyEquals();
        op = '-';
    }
    public void Divide_button(View view)
    {
        MyEquals();
        op = '/';
    }
    public void Multiply_button(View view)
    {
        MyEquals();
        op = '*';
    }
    public void Equal_button(View view)
    {
        MyEquals();
    }
    public void Cancel_button(View view)
    {
        var1 = null;
        var2 = null;
        temp = null;
        calc_Text.setText("");

    }
    public void MyEquals()
    {
        if(temp != null) {
            if (var1 != null) {
                var2 = Long.parseLong(temp);

                switch (op) {
                    case '+':
                        var1 = var1 + var2;
                        break;
                    case '-':
                        var1 = var1 - var2;
                        break;
                    case '*':
                        var1 = var1 * var2;
                        break;
                    case '/':
                        if (var2 != 0) {
                            var1 = var1 / var2;
                        } else
                            calc_Text.setText(getString(R.string.divideByZero));

                        break;

                }

                calc_Text.setText(Long.toString(var1));
            } else {
                var1 = Long.parseLong(temp);
                temp = null;
            }
            lastKeyIsOp = true;
        }
    }
}
