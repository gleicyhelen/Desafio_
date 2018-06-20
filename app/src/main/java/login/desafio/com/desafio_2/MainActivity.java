package login.desafio.com.desafio_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

Switch switch1 = (Switch) findViewById(R.id.switch1);

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textViewLogin;
    private EditText editTextLogin;
    private TextView textViewSenha;
    private EditText editTextSenha;
    private SharedPreferences.Editor editor;

    public class Config {
        public static final String LOGIN = "login";
        public static final String SENHA = "senha";
        public static final String SHARED_PREF_NAME = "Desafio_2";
        public static final String LOGIN_SHARED_PREF = "login";
        public static final String LOGGEDIN_SHARED_PREF = "logado";
    }

    public MainActivity() {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = MainActivity.this.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextSenha = (EditText) findViewById(R.id.editTextSenha);

        button = (AppCompatButton) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                login();
            }
        }
    }
    }

    private class SHARED_PREF_NAME {
    }
