package bunker.com.ar.bunker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
import bunker.com.ar.bunker.R.styleable.View

Button siguiente;
class MainActivity_hola_mundo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hola_mundo)




    siguiente = (Button)findViewById(R.id.btn1);
    siguiente.setOnClickListener(){
        @Override
        public void onClick(View v){
            Intent siguiente = new Intent(MainActivity_hola_mundo.this,MainActivity_mensaje_del_dia.class);
            startActivity(siguiente)
        }}
    }

}
