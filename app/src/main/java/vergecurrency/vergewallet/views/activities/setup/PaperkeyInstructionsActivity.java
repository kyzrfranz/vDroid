package vergecurrency.vergewallet.views.activities.setup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import vergecurrency.vergewallet.R;

public class PaperkeyInstructionsActivity extends AppCompatActivity {


    //The dumbest class you'll find here... jump to the next one
    Button nextButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_paperkey_instructions);


        nextButton = findViewById(R.id.paperkey_next_button);
        nextButton.setOnClickListener(nextButtonListener());
    }

    private Button.OnClickListener nextButtonListener() {
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), PaperkeySeedActivity.class));

            }
        };
    }
}
