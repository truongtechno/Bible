package bible.me.com.bible.slidemenu.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import bible.me.com.bible.R;
import bible.me.com.bible.slidemenu.entity.ItemNavigation;

public class SlideMenuAdapter extends BaseAdapter {
	protected ArrayList<ItemNavigation> mItems;
	protected Context mContext;

	public void setItems(ArrayList<ItemNavigation> items) {
		mItems = items;
	}

	public SlideMenuAdapter(ArrayList<ItemNavigation> mItems, Context mContext) {
		super();
		this.mItems = mItems;
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		return mItems.size();
	}

	@Override
	public Object getItem(int position) {
		return mItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = LayoutInflater.from(mContext);
		convertView = inflater.inflate(R.layout.core_phone_slide_menu_item,
				null, false);
		ImageView img_icon = (ImageView) convertView.findViewById(R.id.img_icon
		);
		TextView txt_name = (TextView) convertView.findViewById(R.id.tv_name
		);

		ItemNavigation item = (ItemNavigation) getItem(position);
		String name = item.getName();
		txt_name.setText(name);
		txt_name.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
		
		img_icon.setImageDrawable(item.getDrawble());
		return convertView;
	}
}
