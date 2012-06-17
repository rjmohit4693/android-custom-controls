package com.liupeinye.basicviews;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.liupeinye.tools.InternetTool;
import com.liupeinye.tools.StreamTool;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

public class Image extends ImageView{
	
	private URL url = null;

	public Image(Context context , URL url) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		this.url = url;
		if(!thread.isAlive())
		{
			thread.start();
		}
	}
	
	public Image(Context context , InputStream is) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		try {
			iSToImage(is);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Handler handler = new Handler()
	{

		@Override
		public void handleMessage(Message msg) {
			// TODO Auto-generated method stub
			super.handleMessage(msg);
			try {
				iSToImage((InputStream) msg.obj);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	};
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Message msg = handler.obtainMessage();
			try {
				msg.obj = InternetTool.getInputStream(url);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				handler.sendMessage(msg);
			}
		}
	};
	Thread thread = new Thread(runnable);
	
	public void iSToImage(InputStream is) throws Exception
	{
		byte[] data = StreamTool.readInputStream(is);
		Bitmap bm = BitmapFactory.decodeByteArray(data, 0, data.length);
		this.setImageBitmap(bm);
	}
}
