package com.example.cafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int quantity = 0;
    private int BurgerQuantity = 0;
    private int garlicQuantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String nameText(){
        EditText custName = (EditText) findViewById(R.id.customerName);
        return custName.getText().toString();
    }

    private String emailText(){
        EditText custEmail = (EditText) findViewById(R.id.customerEmail);
        return custEmail.getText().toString();
    }

    public void burgerPlus(View view) {
        BurgerQuantity++;
        quantity += BurgerQuantity;
        burgerQTT(BurgerQuantity);
        selectItem(nameText(), emailText(), quantity);
    }

    public void burgerMinus(View view) {
        BurgerQuantity--;
        if(BurgerQuantity < 0){
            BurgerQuantity = 0;
            selectItem(nameText(), emailText(), quantity);
        }else {
            quantity -= BurgerQuantity;
            burgerQTT(BurgerQuantity);
            selectItem(nameText(), emailText(), quantity);
        }
    }

    @SuppressLint("SetTextI18n")
    private void burgerQTT(int BurgerQuantity){
        TextView burgerQtt = (TextView) findViewById(R.id.burgerQTT);
        burgerQtt.setText(" "+BurgerQuantity);
    }

    @SuppressLint("SetTextI18n")
    public void selectItem(String name, String email, int quantity){
        TextView selectitem = (TextView) findViewById(R.id.selectItem);
        selectitem.setText("Customer Name : "+name+"\nCustomer E-mail : "+email+"\nItem : "+quantity);
    }

    public void garlicPlus(View view) {
        garlicQuantity++;
        quantity += garlicQuantity;
        garlicQTT(garlicQuantity);
        selectItem(nameText(), emailText(), quantity);
        garlicQuantity = 0;
    }

    public void garlicMinus(View view) {
        garlicQuantity--;
        if(garlicQuantity < 0){
            garlicQuantity = 0;
            selectItem(nameText(), emailText(), quantity);
        }else {
            quantity -= garlicQuantity;
            garlicQTT(garlicQuantity);
            selectItem(nameText(), emailText(), quantity);
        }
    }

    @SuppressLint("SetTextI18n")
    private void garlicQTT(int garlicQuantity){
        TextView garlicQtt = (TextView) findViewById(R.id.garlicQTT);
        garlicQtt.setText(" "+garlicQuantity);
    }
}