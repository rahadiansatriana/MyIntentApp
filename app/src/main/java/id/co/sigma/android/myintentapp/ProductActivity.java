package id.co.sigma.android.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {
    private TextView tvText;
    public static String EXTRA_TEXT="exta_text" ;
    public static String EXTRA_QTY="extra qty";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        String text=getIntent().getStringExtra(EXTRA_TEXT);
        int qty=getIntent().getIntExtra(EXTRA_QTY,0);

        tvText=(TextView)findViewById(R.id.tv_text);

        tvText.setText(text+" Qty :"+qty);

    }
}
