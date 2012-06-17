package com.liupeinye.listviews;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.liupeinye.basicviews.Image;
import com.liupeinye.tools.InternetTool;
import com.liupeinye.tools.StreamTool;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

public class ListImage extends Image{

	public ListImage(Context context, InputStream is) {
		super(context, is);
		// TODO Auto-generated constructor stub
		this.setLayoutParams(new LayoutParams(80, 80));
		this.setScaleType(ScaleType.CENTER_INSIDE);
	}
	public ListImage(Context context, URL url) {
		super(context, url);
		// TODO Auto-generated constructor stub
		this.setLayoutParams(new LayoutParams(80, 80));
		this.setScaleType(ScaleType.CENTER_INSIDE);
	}	
}
