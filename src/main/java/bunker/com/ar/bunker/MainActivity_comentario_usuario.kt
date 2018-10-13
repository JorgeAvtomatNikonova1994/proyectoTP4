package bunker.com.ar.bunker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
Button siguiente;
class MainActivity_comentario_usuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_comentario_usuario)




    siguiente = (Button)findViewById(R.id.btn1);
    siguiente.setOnClickListener(){
        @Override
        public void onClick(View v){
            Intent siguiente = new Intent(MainActivity_comentario_usuario.this,MainActivity_mensaje_del_dia.class);
            startActivity(siguiente)
        }}
    }

}
}
