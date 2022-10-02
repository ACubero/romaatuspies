package eu.alexcuar.romaatuspies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView web_view = findViewById(R.id.romaatuspies);
        web_view.requestFocus();
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        web_view.getSettings().setUseWideViewPort(true);
        web_view.getSettings().setDomStorageEnabled(true);
        web_view.loadUrl("https://romaatuspies.glideapp.io/");
    }
}