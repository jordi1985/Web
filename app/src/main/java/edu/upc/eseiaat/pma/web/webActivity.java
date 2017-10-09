package edu.upc.eseiaat.pma.web;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class webActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        editTextURL = (EditText) findViewById(R.id.editTextURL);
        textViewesult = (TextView) findViewById(R.id.btn);

    }


    public void connect(View view) {
        textViewResult.setText(WebReader.getUrl(editT))

    }
}
