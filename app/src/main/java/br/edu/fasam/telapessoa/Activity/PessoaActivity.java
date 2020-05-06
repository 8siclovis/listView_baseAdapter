package br.edu.fasam.telapessoa.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.edu.fasam.telapessoa.Adapter.PessoaAdapter;
import br.edu.fasam.telapessoa.R;
import br.edu.fasam.telapessoa.model.Pessoa;

public class PessoaActivity extends AppCompatActivity {

    String  caracteristicas[] =  new String[] {"Birth year","Eye Color","Gender","Hair Color"};
    String descricao[] =  new String[] {"17","black","masculino","black"};


    ArrayList<Pessoa> rowItens;
    ListView showList;
    PessoaAdapter pessoaAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pessoa);

    showList = (ListView)findViewById(R.id.listView);
    rowItens = new ArrayList<Pessoa>();

    for(int i = 0; i< caracteristicas.length;i++){
        Pessoa item = new Pessoa(caracteristicas[i],descricao[i]);
        rowItens.add(item);
    }
    pessoaAdapter = new PessoaAdapter(PessoaActivity.this,rowItens);
    showList.setAdapter(pessoaAdapter);

    }
}
