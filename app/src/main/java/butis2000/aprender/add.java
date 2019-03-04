package butis2000.aprender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class add extends AppCompatActivity {

    private CheckBox Portion ,Grams ;

   private  EditText Food , Date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);



        Portion = (CheckBox) findViewById(R.id.checkBoxPortion);
        Grams = (CheckBox) findViewById(R.id.checkBoxGrams);
        Food = (EditText) findViewById(R.id.editTextFood);
        Date = (EditText) findViewById(R.id.editTextDate);

        Portion.setChecked(true);


        Portion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                boolean BOX_ESTATE = b;

                if(BOX_ESTATE){
                    Grams.setChecked(false);
                }else {
                    Grams.setChecked(true);
                }
            }
        });

        Grams.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                boolean BOX_ESTATE = b;

                if(BOX_ESTATE){
                    Portion.setChecked(false);
                }else {
                    Portion.setChecked(true);
                }
            }
        });




    }
}
