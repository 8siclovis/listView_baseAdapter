package br.edu.fasam.telapessoa.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.edu.fasam.telapessoa.R;
import br.edu.fasam.telapessoa.model.Pessoa;

public class PessoaAdapter extends BaseAdapter {


    Context context;
    ArrayList<Pessoa> mContactList;
    LayoutInflater inflater;

    public PessoaAdapter(Context context, ArrayList<Pessoa> contactList) {

    this.context = context;
    this.mContactList = contactList;
    }

    @Override
    public int getCount() {
       int count = mContactList.size();
       return count;
    }

    @Override
    public Object getItem(int i) {
        return mContactList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       ViewHolder holder = null;

       LayoutInflater Inflater = (LayoutInflater)
       context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
       if(convertView == null){
           convertView = inflater.inflate(R.layout.item, null);
           holder = new ViewHolder();
           holder.txt_caracteristicas = (TextView) convertView.findViewById(R.id.txt_caracteristicas);
           holder.txt_descricao = (TextView) convertView.findViewById(R.id.txt_descricao);

           convertView.setTag(holder);
       }
       else {

           holder = (ViewHolder) convertView.getTag();

       }

       Pessoa pessoa = (Pessoa)getItem(position);
       holder.txt_caracteristicas.setText(pessoa.getCaracteristicas());
       holder.txt_descricao.setText(pessoa.getDescricao());
     ;

        return convertView;
    }

    private class ViewHolder {
      TextView txt_descricao;
        TextView txt_caracteristicas;


    }
}
