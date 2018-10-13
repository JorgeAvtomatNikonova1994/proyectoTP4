package bunker.com.ar.bunker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
class MainActivity_lista_urls : AppCompatActivity() {
    Button siguiente;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lista_urls)

        siguiente = (Button)findViewById(R.id.btn1);

        siguiente.setOnClickListener(){
            @Override
            public void onClick(View v){
                Intent siguiente = new Intent(MainActivity_lista_urls.this,MainActivity_mensaje_del_dia.class);
                startActivity(siguiente)
            }
        }
    }

}
