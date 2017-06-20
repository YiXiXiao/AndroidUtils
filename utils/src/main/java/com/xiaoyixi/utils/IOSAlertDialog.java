package com.xiaoyixi.utils;


import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class IOSAlertDialog {
    Context context;
    AlertDialog ad;
    TextView titleView;
    TextView messageView;
    LinearLayout buttonLayout;

    Button button1;
    View view;
    Button button2;
    public IOSAlertDialog(Context context) {
        this.context=context;
        ad=new AlertDialog.Builder(context).create();
        ad.show();

        ad.setCancelable(false);

        //关键在下面的两行,使用window.setContentView,替换整个对话框窗口的布局
        Window window = ad.getWindow();
        window.setContentView(R.layout.iso_dialog_layout);
        titleView=(TextView)window.findViewById(R.id.title);
        messageView=(TextView)window.findViewById(R.id.message);
        buttonLayout=(LinearLayout)window.findViewById(R.id.buttonLayout);
        
        button1 = (Button) window.findViewById(R.id.button1);
        button2 = (Button) window.findViewById(R.id.button2);
        view = window.findViewById(R.id.view);
        
    }

    /**
     * 设置标题
     * @param resId 资源
     */
    public void setTitle(int resId)
    {
        titleView.setText(resId);
    }

    /**
     * 设置标题
     * @param title 文字
     */
    public void setTitle(String title) {
        titleView.setText(title);
    }

    /**
     * 设置消息
     * @param resId 资源
     */
    public void setMessage(int resId) {
        messageView.setText(resId);
    }

    /**
     * 设置消息
     * @param message 文字
     */
    public void setMessage(CharSequence message)
    {
        messageView.setText(message);
    }

    /**
     * 设置按钮
     * @param text
     * @param listener
     */
	public void setPositiveButton(String text,
			final View.OnClickListener listener)
    {
        button1.setVisibility(View.VISIBLE);
        button1.setText(text);
        button1.setTextColor(Color.parseColor("#00A9F0"));
        button1.setTextSize(20);
        button1.setOnClickListener(listener);

    }  /**
     * 设置按钮
     * @param text
     * @param listener
     */
    public void setNegativeButton(String text, final View.OnClickListener listener)
    {
    	//确定取消都设置了
    	view.setVisibility(View.VISIBLE);
    	button2.setVisibility(View.VISIBLE);
        button2.setText(text);
        button2.setTextColor(Color.parseColor("#00A9F0"));
        button2.setTextSize(20);
        button2.setOnClickListener(listener);
    	
    }
    /**
     * 关闭对话框
     */
    public void dismiss() {
        ad.dismiss();
    } 
}