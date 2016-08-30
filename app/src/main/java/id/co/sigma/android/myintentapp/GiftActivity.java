package id.co.sigma.android.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class GiftActivity extends AppCompatActivity {
    private TextView tvId,tvName,tvUrl;
    public static String EXTRA_GIFT="extra gift";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);
        tvId=(TextView)findViewById(R.id.tv_id);
        tvName=(TextView)findViewById(R.id.tv_name);
        tvUrl=(TextView)findViewById(R.id.tv_url);

        Gift gift=getIntent().getParcelableExtra(EXTRA_GIFT);
        tvId.setText(gift.getId());
        tvName.setText(gift.getName());
        tvUrl.setText(gift.getUrl());

        Linkify.addLinks(tvUrl,Linkify.WEB_URLS);
    }
}
