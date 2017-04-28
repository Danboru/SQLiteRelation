package id.eightstudio.danboru.sqliterelation.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import id.eightstudio.danboru.sqliterelation.Provider.Todo;
import id.eightstudio.danboru.sqliterelation.R;

/**
 * Created by danboru on 4/27/17.
 */
public class AdapterTodo extends ArrayAdapter {

    Activity act;
    ArrayList list;

    //Constructor utama untuk menjalankan adapter seperti parentnya
    public AdapterTodo(Activity context, ArrayList resource) {
        super(context, R.layout.row_todo_layout, resource);
        this.act = context;
        this.list = resource;
    }

    static class ViewHolder{
        //berisikan view yang akan di gunakan untuk menampilkan data
        TextView txt_note;
        TextView txt_status;
        TextView txt_created;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){

            LayoutInflater inflater = act.getLayoutInflater();
            view = inflater.inflate(R.layout.row_todo_layout, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.txt_note = (TextView) view.findViewById(R.id.txt_note);
            viewHolder.txt_status = (TextView) view.findViewById(R.id.txt_status);
            viewHolder.txt_created = (TextView) view.findViewById(R.id.txt_created);

            view.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder) view.getTag();
        Todo todo = (Todo) list.get(position);

        String status = String.valueOf(todo.getStatus());

        viewHolder.txt_note.setText(todo.getNote());
        viewHolder.txt_status.setText(status);
        viewHolder.txt_created.setText(todo.getCreated_at());

        //perhatikan yang di kemblikan bukan convertview tapi view yang sudah berisikan holder
        return view;
    }
}
