package whlandroid.intent_memo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_addMemo;
    TextView txvMemoContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_addMemo= (Button) findViewById(R.id.btn_edit);
        txvMemoContent = (TextView) findViewById(R.id.txv_memoContent);

    }
    public void onClickEdit(View v){
        Intent intent = new Intent();
        //intent.setClass(MainActivity.this,Main2Activity.class);
        intent.setClass(this,MemoAddActivity.class);
        //intent.setClass(this,)
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode ==RESULT_OK){
            //Intent intent3 = new Intent();
            String memoContent = data.getStringExtra("便签内容1");
            txvMemoContent.setText(memoContent);
            //Toast.makeText(this,memoContent.toString(),Toast.LENGTH_LONG).show();
        }



    }
}
