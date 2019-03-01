package android.edu.aplicationtags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private LinearLayout l1;
    private int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.t1);
        k=0;
    }

    public void fTag(View view) {
        l1= (LinearLayout) view;
        Object tag=l1.getTag();
        if (tag==null)
            tv.setText("NO TENEMOS TAG");
        else
        {   String valor = (String) tag;
            k++;
            tv.setText("TAG= "+valor);
            valor = valor + k;
            l1.setTag(valor);
        }
    }
}