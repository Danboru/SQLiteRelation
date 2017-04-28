package id.eightstudio.danboru.sqliterelation.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import id.eightstudio.danboru.sqliterelation.R;

/**
 * Created by danboru on 4/27/17.
 */

public class AdapterTag extends ArrayAdapter {

    Activity act;
    ArrayList list;

    public AdapterTag(Activity context, ArrayList resource) {
        super(context, R.layout.row_todo_layout ,resource);
        this.act = context;
        this.list = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null){

        }

        return convertView;
    }
}
