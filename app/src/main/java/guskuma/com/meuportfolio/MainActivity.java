package guskuma.com.meuportfolio;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){

        Button btn = (Button)view;

        if(view.getTag() == null || !view.getTag().getClass().equals(String.class))
            return;

        String tag = view.getTag().toString();

        if(tag.equals(getString(R.string.appFilmesPopulares))){



//        // Código preparado para quando fizer os outros aplicativos
//        } else if(tag.equals(getString(R.string.tagStockHawk))){
//
//        } else if(tag.equals(getString(R.string.tagFacaMaior))){
//
//        } else if(tag.equals(getString(R.string.tagFacaMaterial))){
//
//        } else if(tag.equals(getString(R.string.tagSejaOnipresente))){
//
//        } else if(tag.equals(getString(R.string.tagCapstone))){
//
        } else {
            if(mToast != null) {
                mToast.cancel();
            }

            String textToShow = getString(R.string.btnClickText) + " " + btn.getText();
            mToast =  Toast.makeText(this, textToShow, Toast.LENGTH_LONG);
            mToast.show();
        }
    }
}
