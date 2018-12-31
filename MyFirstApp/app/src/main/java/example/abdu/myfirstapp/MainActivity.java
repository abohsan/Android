package example.abdu.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText fnumText1 = (EditText) findViewById(R.id.numText1);
                EditText snumText2 = (EditText) findViewById(R.id.numText2);
                TextView mytextView = (TextView) findViewById(R.id.sumView);

                int num1 = Integer.parseInt(fnumText1.getText().toString());
                int num2 = Integer.parseInt(snumText2.getText().toString());

                int result =  num1 + num2 ;

                mytextView.setText(String.valueOf(result));


            }
        });

    }
}
