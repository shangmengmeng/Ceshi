package app.huangtong.ceshi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.socks.library.KLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KLog.e("和恶化");
    }
}
