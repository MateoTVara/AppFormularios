package pe.edu.idat.appfomsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import pe.edu.idat.appfomsandroid.databinding.ActivityListaBinding;
import pe.edu.idat.appfomsandroid.databinding.ActivityRegistroBinding;

public class ListaActivity extends AppCompatActivity {

    private ActivityListaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<String> listaPersonas = (ArrayList<String>)
                getIntent().getSerializableExtra("listapersonas");
        ArrayAdapter arrayAdapter= new ArrayAdapter(
                this, android.R.layout.simple_list_item_1,
                listaPersonas
        );
        binding.lvpersonas.setAdapter(arrayAdapter);
    }
}