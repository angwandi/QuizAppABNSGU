package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Defining Views

    CheckBox Q1cb1;
    CheckBox Q1cb2;
    CheckBox Q1cb3;
    CheckBox Q1cb4;

    CheckBox Q2cb1;
    CheckBox Q2cb2;
    CheckBox Q2cb3;
    CheckBox Q2cb4;

    CheckBox Q3cb1;
    CheckBox Q3cb2;
    CheckBox Q3cb3;
    CheckBox Q3cb4;

    RadioGroup Q4rg;
    RadioButton Q4rb3;

    RadioGroup Q5rg;
    RadioButton Q5rb1;

    RadioGroup Q6rg;
    RadioButton Q6rb2;

    EditText nameField;

    EditText Q7edtxt;

    EditText Q8edtxt;

    EditText Q9edtxt;

    EditText Q10edtxt;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisation of Views to be used later anywhere within the program

        toolbar = findViewById(R.id.toolbar);

        Q1cb1 = findViewById(R.id.Q1_cb1);
        Q1cb2 = findViewById(R.id.Q1_cb2);
        Q1cb3 = findViewById(R.id.Q1_cb3);
        Q1cb4 = findViewById(R.id.Q1_cb4);

        Q2cb1 = findViewById(R.id.Q2_cb1);
        Q2cb2 = findViewById(R.id.Q2_cb2);
        Q2cb3 = findViewById(R.id.Q2_cb3);
        Q2cb4 = findViewById(R.id.Q2_cb4);

        Q3cb1 = findViewById(R.id.Q3_cb1);
        Q3cb2 = findViewById(R.id.Q3_cb2);
        Q3cb3 = findViewById(R.id.Q3_cb3);
        Q3cb4 = findViewById(R.id.Q3_cb4);

        Q5rg = findViewById(R.id.Q5_rg);
        Q5rb1 = findViewById(R.id.Q5_rb1);

        Q6rg = findViewById(R.id.Q6_rg);
        Q6rb2 = findViewById(R.id.Q6_rb2);

        Q4rg = findViewById(R.id.Q4_rg);
        Q4rb3 = findViewById(R.id.Q4_rb3);

        Q7edtxt = findViewById(R.id.Q7_edtxt);
        Q8edtxt = findViewById(R.id.Q8_edtxt);
        Q9edtxt = findViewById(R.id.Q9_edtxt);
        Q10edtxt = findViewById(R.id.Q10_edtxt);
        nameField = findViewById(R.id.enter_your_name_edtxt);

    }

    /**
     * Getting the result
     *
     * @return the total result
     */
    private int getTotalResult() {
        int result = 0;

        //answers question 1
        if (Q1cb1.isChecked() && Q1cb2.isChecked() && Q1cb3.isChecked() && !Q1cb4.isChecked()) {
            result = result + 1;
        } else {

        }

        //answers question 2
        if (Q2cb1.isChecked() && !Q2cb2.isChecked() && !Q2cb3.isChecked() && Q2cb4.isChecked()) {
            result = result + 1;
        } else {

        }

        //answers question 3
        if (Q3cb1.isChecked() && !Q3cb2.isChecked() && Q3cb3.isChecked() && Q3cb4.isChecked()) {
            result = result + 1;
        } else {

        }

        //answers question 4
        if (Q4rb3.isChecked()) {
            result = result + 1;
        } else {

        }

        //answers question
        if (Q5rb1.isChecked()) {
            result = result + 1;
        } else

            //answers question 6
            if (Q6rb2.isChecked()) {
                result = result + 1;
            }

        //answers question 7
        String Q7Answer = Q7edtxt.getText().toString();
        if (Q7Answer.equals("Hyper Text Markup Language")) {
            result = result + 1;
        }

        /**answers question 8
         * trim() to remove any whitespace entered by accident for the user.
         * equalsIgnoreCase() method better for comparing String so it doesn't
         * matter how the user enters his answer, upper or lower case
         */

        String Q8Answer = Q8edtxt.getText().toString().trim();
        if (Q8Answer.equalsIgnoreCase("DOCTYPE html")) {
            result = result + 1;
        }

        //answers question 9
        String Q9Answer = Q9edtxt.getText().toString().trim();
        if (Q9Answer.equalsIgnoreCase("XML")) {
            result = result + 1;
        }

        //answers question 10
        String Q10Answer = Q10edtxt.getText().toString().trim();
        if (Q10Answer.equalsIgnoreCase("strong")) {
            result = result + 1;
        }
        return result;
    }

    /*Method called when the Submit Button is clicked
     */
    public void SubmitButton(View view) {
        //initialising the user's name for EditText
        String name = nameField.getText().toString();
        String usersName = displayUsersName(name);

        //Toast message displayed when the button is clicked
        Toast.makeText(this, getString(R.string.Toast) + "\n" + usersName + "You scored " + getTotalResult() + "/10", Toast.LENGTH_LONG).show();

    }

    // Method called to display user's name
    private String displayUsersName(String name) {
        return " " + name;
    }
}

