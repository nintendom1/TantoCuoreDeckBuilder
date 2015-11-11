package adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.joshualiong.tantocuaredeckbuilder.FilterListActivity;
import com.joshualiong.tantocuaredeckbuilder.MainActivity;
import com.joshualiong.tantocuaredeckbuilder.R;

import junit.framework.Assert;

import java.util.List;

import tantocuarecardinfo.Card;



/**
 * Created by NintendoM1 on 11/10/2015.
 */
public class CardArrayAdapter extends ArrayAdapter<Card> {

    private List<Card> cardList;
    private Context context;

    public CardArrayAdapter(List<Card> cardList, Context context) {
        super(context, R.layout.single_listview_item, cardList);
        this.cardList = cardList;
        this.context = context;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CardHolder holder = new CardHolder();

        if(convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_filter, null);

            holder.cardName = (TextView) convertView.findViewById(R.id.name);
            holder.checkBox = (CheckBox) convertView.findViewById(R.id.chk_box);
        }
        else {
            holder = (CardHolder) convertView.getTag();
        }

        Card c = cardList.get(position);
        Assert.assertNotNull(holder);
        Assert.assertNotNull(holder.cardName);
        Assert.assertNotNull(c);
        holder.cardName.setText(c.name);
        holder.checkBox.setChecked(c.isEnable());
        holder.checkBox.setTag(c);

        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Clicking logic goes here but use v somehow...
                }
            }
        );

        return convertView;
    }



    private static class CardHolder {
        public TextView cardName;
        public CheckBox checkBox;
    }
}
