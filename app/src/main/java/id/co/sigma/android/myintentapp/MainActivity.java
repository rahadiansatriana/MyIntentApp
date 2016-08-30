package id.co.sigma.android.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnProfile;
    private Button btnProduct,btnGift,btnDial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProfile=(Button)findViewById(R.id.btn_profile);
        btnProfile.setOnClickListener(this);

        btnProduct=(Button)findViewById(R.id.btn_product);
        btnProduct.setOnClickListener(this);

        btnGift=(Button)findViewById(R.id.btn_gift);
        btnGift.setOnClickListener(this);

        btnDial=(Button)findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       Intent mIntent=null;
            switch (view.getId()){
                case R.id.btn_profile :
                    mIntent=new Intent(MainActivity.this,ProfileActivity.class);
                    break;
                case R.id.btn_product :
                    mIntent=new Intent(MainActivity.this,ProductActivity.class);
                    mIntent.putExtra(ProductActivity.EXTRA_TEXT,"Product Sepatu Adidas");
                    mIntent.putExtra(ProductActivity.EXTRA_QTY,100);
                    break;
                case R.id.btn_gift :
                    mIntent=new Intent(MainActivity.this,GiftActivity.class);
                    Gift gift=new Gift();
                    gift.setId("009");
                    gift.setName("Kompor Gas GrabGas");
                    gift.setUrl("https://grabgas.com");

                    mIntent.putExtra(GiftActivity.EXTRA_GIFT,gift);
                    break;

                case R.id.btn_dial :
                    mIntent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:085231332888"));
                    break;
            }
            startActivity(mIntent);

    }
}
