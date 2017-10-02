package whlandroid.intent_memo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MemoAddActivity extends AppCompatActivity {
    Button btnMemoOK;
    EditText edtMemo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_add);
        btnMemoOK = (Button) findViewById(R.id.btn_memoOK);
        edtMemo = (EditText) findViewById(R.id.edt_memoContent);
    }
    public void memoAddOK(View v){
        String memoCont = edtMemo.getText().toString();
        Intent intent2 = new Intent();
        intent2.putExtra("便签内容1",memoCont);
        setResult(RESULT_OK,intent2);
        finish();
    }
}
