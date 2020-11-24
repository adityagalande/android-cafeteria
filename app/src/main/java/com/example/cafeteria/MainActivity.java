package com.example.cafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int quantity = 0;
    private int BurgerQuantity = 0;
    private int garlicQuantity = 0;
    private int nachosQuantity = 0;
    private int saladQuantity = 0;
    private int lemonteaQuantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String nameText() {
        EditText custName = (EditText) findViewById(R.id.customerName);
        return custName.getText().toString();
    }

    private String emailText() {
        EditText custEmail = (EditText) findViewById(R.id.customerEmail);
        return custEmail.getText().toString();
    }


    //This for Burger---------------------------------------------
    public void burgerPlus(View view) {
        BurgerQuantity++;
        burgerQTT(BurgerQuantity);
        selectItem("Name : " + nameText() + "\nE-main : " + emailText());
    }

    public void burgerMinus(View view) {
        BurgerQuantity--;
        if (BurgerQuantity < 0) {
            BurgerQuantity = 0;
            Toast.makeText(this, "Unable to select!", Toast.LENGTH_SHORT).show();
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        } else {
            burgerQTT(BurgerQuantity);
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        }
    }

    @SuppressLint("SetTextI18n")
    private void burgerQTT(int BurgerQuantity) {
        TextView burgerQtt = (TextView) findViewById(R.id.burgerQTT);
        burgerQtt.setText(" " + BurgerQuantity);
    }


    //This for Garlic Bread---------------------------------------------
    public void garlicPlus(View view) {
        garlicQuantity++;
        garlicQTT(garlicQuantity);
        selectItem("Name : " + nameText() + "\nE-main : " + emailText());
    }

    public void garlicMinus(View view) {
        garlicQuantity--;
        if (garlicQuantity < 0) {
            garlicQuantity = 0;
            Toast.makeText(this, "Unable to select!", Toast.LENGTH_SHORT).show();
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        } else {
            garlicQTT(garlicQuantity);
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        }
    }

    @SuppressLint("SetTextI18n")
    private void garlicQTT(int garlicQuantity) {
        TextView garlicQtt = (TextView) findViewById(R.id.garlicQTT);
        garlicQtt.setText(" " + garlicQuantity);
    }

    //This for Bean Nachos---------------------------------------------

    public void nachosPlus(View view) {
        nachosQuantity++;
        nachosQTT(nachosQuantity);
        selectItem("Name : " + nameText() + "\nE-main : " + emailText());
    }

    public void nachosMinus(View view) {
        nachosQuantity--;
        if (nachosQuantity < 0) {
            nachosQuantity = 0;
            Toast.makeText(this, "Unable to select!", Toast.LENGTH_SHORT).show();
            nachosQTT(nachosQuantity);
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        } else {
            nachosQTT(nachosQuantity);
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        }
    }

    @SuppressLint("SetTextI18n")
    private void nachosQTT(int nachosQuantity) {
        TextView nachosQtt = (TextView) findViewById(R.id.nachosQTT);
        nachosQtt.setText(" " + nachosQuantity);
    }

    //This for Greek Salad---------------------------------------------

    public void saladPlus(View view) {
        saladQuantity++;
        saladQTT(saladQuantity);
        selectItem("Name : " + nameText() + "\nE-main : " + emailText());
    }

    public void saladMinus(View view) {
        saladQuantity--;
        if (saladQuantity < 0) {
            saladQuantity = 0;
            Toast.makeText(this, "Unable to select!", Toast.LENGTH_SHORT).show();
            saladQTT(saladQuantity);
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        } else {
            saladQTT(saladQuantity);
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        }
    }

    @SuppressLint("SetTextI18n")
    private void saladQTT(int saladQuantity) {
        TextView saladQtt = (TextView) findViewById(R.id.saladQTT);
        saladQtt.setText(" " + saladQuantity);
    }

    //This for Lemon Tea-------------------------------------------------

    public void lemonteaPlus(View view) {
        lemonteaQuantity++;
        lemonteaQTT(lemonteaQuantity);
        selectItem("Name : " + nameText() + "\nE-main : " + emailText());
    }

    public void lemonteaMinus(View view) {
        lemonteaQuantity--;
        if (lemonteaQuantity < 0) {
            lemonteaQuantity = 0;
            Toast.makeText(this,"Unable to select!",Toast.LENGTH_SHORT).show();
            lemonteaQTT(lemonteaQuantity);
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        } else {
            lemonteaQTT(lemonteaQuantity);
            selectItem("Name : " + nameText() + "\nE-main : " + emailText());
        }
    }

    @SuppressLint("SetTextI18n")
    private void lemonteaQTT(int lemonteaQuantity) {
        TextView lemonteaQtt = (TextView) findViewById(R.id.lemonteaQTT);
        lemonteaQtt.setText(" " + lemonteaQuantity);

    }

    //This for Order Summary---------------------------------------------
    @SuppressLint("SetTextI18n")
    public void selectItem(String msg) {
        TextView selectitem = (TextView) findViewById(R.id.selectItem);
        selectitem.setText(msg);
    }

    public void Order(View view) {
        int totalPrice;
        int burgerPrice = BurgerQuantity * 120;
        int garlicPrice = garlicQuantity * 149;
        int nachosPrice = nachosQuantity * 249;
        int saladPrice = saladQuantity * 329;
        int lemonteaPrice = lemonteaQuantity * 25;
        totalPrice = burgerPrice + garlicPrice + nachosPrice + saladPrice + lemonteaPrice;

        quantity += BurgerQuantity;

        String msg = "Name : " + nameText() + "\nE-main : " + emailText() + "\nBurger : " + BurgerQuantity + "\nGarlic Bread : " + garlicQuantity + "\nBean Nachos : " + nachosQuantity + "\nGreek Salad : " + saladQuantity + "\nLemon Tea : " + lemonteaQuantity + "\nTotal : " + totalPrice;

        if (totalPrice <= 0) {
            msg = "Cart is Empty!!";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            selectItem(msg);
        } else {
            selectItem(msg);
        }
    }
}