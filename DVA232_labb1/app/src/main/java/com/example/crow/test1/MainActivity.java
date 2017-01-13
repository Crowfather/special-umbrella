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
    boolean LastPressedIsEqual = false;
    boolean LastPressedIsOp = false;

    EditText calc_Text;

    //int k = Integer.valueOf(String.valueOf(i) + String.valueOf(j));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc_Text = (EditText) this.findViewById(R.id.edit_message);

    }

    public void One_button(View view) {
        ButtonFunctions("1");
    }

    public void Two_button(View view)
    {
        ButtonFunctions("2");
    }
    public void Three_button(View view)
    {
        ButtonFunctions("3");
    }
    public void Four_button(View view)
    {
        ButtonFunctions("4");
    }
    public void Five_button(View view)
    {
        ButtonFunctions("5");
    }
    public void Six_button(View view)
    {
        ButtonFunctions("6");
    }
    public void Seven_button(View view)
    {
        ButtonFunctions("7");
    }
    public void Eight_button(View view)
    {
        ButtonFunctions("8");
    }
    public void Nine_button(View view)
    {
        ButtonFunctions("9");
    }
    public void Zero_button(View view)
    {
        ButtonFunctions("0");
    }
    public void Add_button(View view)
    {
        MyEquals();
        op = '+';
        if(LastPressedIsOp = true)
        {
            calc_Text.setText(Long.toString(var1)+op);
        }
        else
        calc_Text.append("+");
    }
    public void Subtract_button(View view)
    {
        MyEquals();
        op = '-';
        if(LastPressedIsOp = true)
        {
            calc_Text.setText(Long.toString(var1)+op);
        }
        else
        calc_Text.append("-");
    }
    public void Divide_button(View view)
    {
        MyEquals();
        op = '/';
        if(LastPressedIsOp = true)
        {
            calc_Text.setText(Long.toString(var1)+op);
        }
        else
        calc_Text.append("/");
    }
    public void Multiply_button(View view)
    {
        MyEquals();
        op = '*';
        if(LastPressedIsOp = true)
        {
            calc_Text.setText(Long.toString(var1)+op);
        }
        else
            calc_Text.append("*");
    }
    public void Equal_button(View view)
    {
        MyEquals();
        LastPressedIsEqual = true;
    }
    public void Cancel_button(View view)
    {
        Cancel();
    }
    private void Cancel(){
        var1 = null;
        var2 = null;
        temp = null;
        calc_Text.setText("");
    }
    private void MyEquals()
    {
        if(temp != null) {
            if (var1 != null) {
                var2 = Long.parseLong(temp);
                temp = null;

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
                        } else {
                            Cancel();
                            calc_Text.setText(getString(R.string.divideByZero));
                            return;
                        }

                        break;

                }

                calc_Text.setText(Long.toString(var1));
            } else {
                var1 = Long.parseLong(temp);
                temp = null;
            }

        }
    }
    private void ButtonFunctions(String s)
    {
        if(LastPressedIsEqual == true && LastPressedIsOp == false)
        {
            Cancel();

        }
        if(temp == null && var1 == null) {
            calc_Text.setText(s);
            temp = s;
        }
        else if(temp == null && var1 != null){
            temp = s;
            calc_Text.append(s);
        }
        else{
            temp += s;
            calc_Text.append(s);
        }
        LastPressedIsOp = false;
        LastPressedIsEqual = false;
    }
}
