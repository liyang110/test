package com.example.huping;

import java.util.jar.Attributes.Name;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ListView;
import android.widget.TextView;

public class GalleryActivity extends Activity
{
	@SuppressWarnings("deprecation")
	ListView mListView;
	String[] names =
	{ "1adfe", "2slkuein", "3sdufwie", "4skiwwpo", "5jsdue89",
			"djfh", "deonap", "1adfe", "2slkuein", "3sdufwie",
			"4skiwwpo", "5jsdue89", "djfh", "deonap", "1adfe",
			"2slkuein", "3sdufwie", "4skiwwpo", "5jsdue89", "djfh",
			"deonap", "1adfe", "2slkuein", "3sdufwie", "4skiwwpo",
			"5jsdue89", "djfh", "deonap", "1adfe", "2slkuein",
			"3sdufwie", "4skiwwpo", "5jsdue89", "djfh", "deonap",
			"1adfe", "2slkuein", "3sdufwie", "4skiwwpo", "5jsdue89",
			"djfh", "deonap", "1adfe", "2slkuein", "3sdufwie",
			"4skiwwpo", "5jsdue89", "djfh", "deonap", "1adfe",
			"2slkuein", "3sdufwie", "4skiwwpo", "5jsdue89", "djfh",
			"deonap" };

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		this.setContentView(R.layout.activity_main);
		mListView = (ListView) this.findViewById(R.id.cus_gallery);
		mListView.setAdapter(new MyAdapter());
		super.onCreate(savedInstanceState);

	}

	private ListView setAdapter()
	{
		// TODO Auto-generated method stub
		return null;
	}

	class MyAdapter extends BaseAdapter
	{

		private ViewHolder holder;

		@Override
		public int getCount()
		{
			// TODO Auto-generated method stub
			return names.length;
		}

		@Override
		public Object getItem(int arg0)
		{
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0)
		{
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView,
				ViewGroup parent)
		{
			// TODO Auto-generated method stub
			Log.e("getView", "getView");
			if (convertView != null)
			{
				holder = (ViewHolder) convertView.getTag();

			} else
			{
				convertView = new TextView(GalleryActivity.this);
				convertView = LayoutInflater.from(
						GalleryActivity.this).inflate(
						R.layout.detail, null);
				holder = new ViewHolder();
				holder.name = ((TextView) convertView
						.findViewById(R.id.name));
				convertView.setTag(holder);
			}
			holder.name.setText(names[position]);
			holder.name.setOnClickListener(new OnClickListener()
			{
				
				@Override
				public void onClick(View v)
				{
					// TODO Auto-generated method stub
					Intent intent = new Intent(GalleryActivity.this,
							intentActivity.class);
					startActivity(intent);
					
				}
			});
			return convertView;
		}

	}

	class ViewHolder
	{
		TextView name;

	}

}
