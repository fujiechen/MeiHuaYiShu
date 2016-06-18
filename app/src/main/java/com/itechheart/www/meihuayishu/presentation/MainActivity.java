package com.itechheart.www.meihuayishu.presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.itechheart.www.meihuayishu.R;
import com.itechheart.www.meihuayishu.business.*;
import com.itechheart.www.meihuayishu.objects.*;
import com.itechheart.www.meihuayishu.application.*;

public class MainActivity extends AppCompatActivity {
    private CalculateTotal calculateTotal;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        Main.startUp();

        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Main.shutDown();
    }

    public void buttonCreateOnClick(View v) {
        calculateTotal = new CalculateTotal();

        final TextView textBenGuaTitle = (TextView)findViewById(R.id.textView8);
        textBenGuaTitle.setText(calculateTotal.getBenGuaTitle());

        final TextView textBianGuaTitle = (TextView)findViewById(R.id.textView9);
        textBianGuaTitle.setText(calculateTotal.getBianGuaTitle());

        final TextView textHuGuaTitle = (TextView)findViewById(R.id.textView10);
        textHuGuaTitle.setText(calculateTotal.getHuGuaTitle());

        //BenGua - top
        final ImageView benGuaTop = (ImageView)findViewById(R.id.imageView);
        String code = calculateTotal.getBenGua().getTop().getPicCode();
        int id = getResources().getIdentifier(code, "drawable", getPackageName());
        benGuaTop.setImageResource(id);

        //BenGua - bottom
        final ImageView benGuaBottom = (ImageView)findViewById(R.id.imageView2);
        code = calculateTotal.getBenGua().getBottom().getPicCode();
        id = getResources().getIdentifier(code, "drawable", getPackageName());
        benGuaBottom.setImageResource(id);

        //BianGua - top
        final ImageView bianGuaTop = (ImageView)findViewById(R.id.imageView3);
        code = calculateTotal.getBianGua().getTop().getPicCode();
        id = getResources().getIdentifier(code, "drawable", getPackageName());
        bianGuaTop.setImageResource(id);

        //BianGua - bottom
        final ImageView bianGuaBottom = (ImageView)findViewById(R.id.imageView4);
        code = calculateTotal.getBianGua().getBottom().getPicCode();
        id = getResources().getIdentifier(code, "drawable", getPackageName());
        bianGuaBottom.setImageResource(id);

        //HuGua - top
        final ImageView huGuaTop = (ImageView)findViewById(R.id.imageView5);
        code = calculateTotal.getHuGua().getTop().getPicCode();
        id = getResources().getIdentifier(code, "drawable", getPackageName());
        huGuaTop.setImageResource(id);

        //HuGua - bottom
        final ImageView huGuaBottom = (ImageView)findViewById(R.id.imageView6);
        code = calculateTotal.getHuGua().getBottom().getPicCode();
        id = getResources().getIdentifier(code, "drawable", getPackageName());
        huGuaBottom.setImageResource(id);

    }


    public void buttonDeleteAllOnClick(View v) {
        final TextView textBenGuaTitle = (TextView)findViewById(R.id.textView8);
        textBenGuaTitle.setText(" ");

        final TextView textBianGuaTitle = (TextView)findViewById(R.id.textView9);
        textBianGuaTitle.setText(" ");

        final TextView textHuGuaTitle = (TextView)findViewById(R.id.textView10);
        textHuGuaTitle.setText(" ");

        //BenGua - top
        final ImageView benGuaTop = (ImageView)findViewById(R.id.imageView);
        benGuaTop.setImageBitmap(null);

        //BenGua - bottom
        final ImageView benGuaBottom = (ImageView)findViewById(R.id.imageView2);
        benGuaBottom.setImageBitmap(null);

        //BianGua - top
        final ImageView bianGuaTop = (ImageView)findViewById(R.id.imageView3);
        bianGuaTop.setImageBitmap(null);

        //BianGua - bottom
        final ImageView bianGuaBottom = (ImageView)findViewById(R.id.imageView4);
        bianGuaBottom.setImageBitmap(null);

        //HuGua - top
        final ImageView huGuaTop = (ImageView)findViewById(R.id.imageView5);
        huGuaTop.setImageBitmap(null);

        //HuGua - bottom
        final ImageView huGuaBottom = (ImageView)findViewById(R.id.imageView6);
        huGuaBottom.setImageBitmap(null);
    }


}
