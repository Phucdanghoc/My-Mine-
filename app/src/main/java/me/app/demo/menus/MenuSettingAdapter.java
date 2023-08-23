package me.app.demo.menus;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.xmlpull.v1.XmlPullParser;
import java.util.List;

import me.app.demo.R;
import me.app.demo.models.UI.Item_setting;

public class MenuSettingAdapter extends ArrayAdapter<Item_setting> {
    private Context context;

    public MenuSettingAdapter(@NonNull Context context, List<Item_setting> data) {
        super(context, 0, data);
        this.context = context;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.menu_setting_item, parent, false);
        }

        Item_setting menuItem = getItem(position);

        TextView textView = convertView.findViewById(R.id.tv_setting_item);
        textView.setText(menuItem.name); // Thiết lập nội dung cho TextView
        return convertView;
    }
}
