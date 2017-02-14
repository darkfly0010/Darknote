package darkfly0010.darknote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Screen1 extends AppCompatActivity {
    TextView tv1;
    EditText et1,et2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
    et1=(EditText)findViewById(R.id.et1);
    et2=(EditText)findViewById(R.id.et2);
    tv1=(TextView)findViewById(R.id.tv1);
    b1=(Button)findViewById(R.id.b1);
    }
}
