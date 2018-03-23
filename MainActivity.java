package com.example.iamma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAdd,btnSub,btnDiv,btnMul,btnPre;
    EditText edn1,edn2;
    float mValue;
    boolean mAdd,mSub,mDiv,mMul,mPre;
    TextView mt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edn1 = (EditText)findViewById(R.id.editTextOne);
        edn2 = (EditText)findViewById(R.id.editTextTwo);
        mt = (TextView)findViewById(R.id.textView1);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnPre = (Button)findViewById(R.id.btnPre);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edn1==null && edn2==null)
                {
                    edn1.setText("");
                    edn2.setText("");
                }
                else{
                    mValue = Float.parseFloat(edn1.getText().toString() +" + " + edn2.getText().toString());
                    
                    mAdd = true;
                    mt.setText( Float.toString(mValue));
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edn1==null && edn2==null)
                {
                    edn1.setText("");
                    edn2.setText("");
                }
                else{
                    mValue = Float.parseFloat(edn1.getText().toString()+" - " + edn2.getText().toString());
                    
                    mSub = true;
                    mt.setText( Float.toString(mValue));
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edn1==null && edn2==null)
                {
                    edn1.setText("");
                    edn2.setText("");
                }
                else{
                    mValue = Float.parseFloat(edn1.getText().toString() +" / " + edn2.getText().toString());
                    
                    mDiv = true;
                    mt.setText( Float.toString(mValue));
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edn1==null && edn2==null)
                {
                    edn1.setText("");
                    edn2.setText("");
                }
                else{
                    mValue = Float.parseFloat(edn1.getText().toString() +" * " + edn2.getText().toString());
                    
                    mMul = true;
                    mt.setText( Float.toString(mValue));
                }
            }
        });

        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edn1==null && edn2==null)
                {
                    edn1.setText("");
                    edn2.setText("");
                }
                else{
                    mValue = Float.parseFloat(edn1.getText().toString() +" % " + edn2.getText().toString());
                    
                    mMul = true;
                    mt.setText( Float.toString(mValue));
                }
            }
        });
    }
}
