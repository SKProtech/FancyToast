package com.protech.inc.fancytoast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FancyTaost {
   
  public static final int LENGTH_SHORT = 0;
  public static final int LENGTH_LONG = 1;

  public static final int SUCCESS = 1;
  public static final int WARNING = 2;
  public static final int ERROR = 3;
  public static final int INFO = 4;
  public static final int DEFAULT = 5;
  
  public static String defaultMessage;
  
  private static LinearLayout toastBorder;
  private static LinearLayout toastBorderContent;
  private static LinearLayout toastLineContent;
  private static TextView toastTitle;
  private static TextView toastMessage;
  private static ImageView toastImage;
  private static View toastView;
  private static Toast toast;

  public static Toast makeText(Context context, String msg, int length, int type) {
  
    toast = new Toast(context);
    
    toastView = LayoutInflater.from(context).inflate(R.layout.toast_view, null);
    toastBorder = toastView.findViewById(R.id.border);
    toastBorderContent = toastView.findViewById(R.id.border_content);
    toastLineContent = toastView.findViewById(R.id.line_content);
    toastTitle = toastView.findViewById(R.id.textview1);
    toastMessage = toastView.findViewById(R.id.textview2);
    toastImage = toastView.findViewById(R.id.imageview1);
    
    //Library Design by AnugDev
    //library Created by Protech Inc.
    //Library Modified by Hasrat Ali
    
    switch (type) {
      case SUCCESS:
        toastImage.setImageResource(R.drawable.success);
        RoundAndBorder(toastBorder, "#47D765", 0, "#00000000", 8);
        toastTitle.setText("Success");
        toastTitle.setTextColor(Color.parseColor("#47D765"));
        defaultMessage = "Example of Success Toast";
      break;
        
      case WARNING:
        toastImage.setImageResource(R.drawable.warn);
        RoundAndBorder(toastBorder, "#FFC122", 0, "#00000000", 8);
        toastTitle.setText("Warning");
        toastTitle.setTextColor(Color.parseColor("#FFC122"));
        defaultMessage = "Example of Warning Toast";
      break;
      
      case ERROR:
        toastImage.setImageResource(R.drawable.error);
        RoundAndBorder(toastBorder, "#F44236", 0, "#00000000", 8);
        toastTitle.setText("Error");
        toastTitle.setTextColor(Color.parseColor("#F44236"));
        defaultMessage = "Example of Error Toast";
      break;
      
      case INFO:
        toastImage.setImageResource(R.drawable.info);
        RoundAndBorder(toastBorder, "#2F87EB", 0, "#00000000", 8);
        toastTitle.setText("Info");
        toastTitle.setTextColor(Color.parseColor("#2F87EB"));
        defaultMessage = "Example of Info Toast";
      break;
      
      case DEFAULT:
        toastImage.setImageResource(R.drawable.info);
        RoundAndBorder(toastBorder, "#D8D8D8", 0, "#00000000", 8);
        toastTitle.setText("Default");
        toastTitle.setTextColor(Color.parseColor("#D8D8D8"));
        defaultMessage = "Example of Default Toast";
      break;
    }
    
    RoundAndBorder(toastBorderContent, "#FFFFFF", 0, "#00000000", 8);
    
    toastBorder.setElevation(4f);
    toastMessage.setText(!TextUtils.isEmpty(msg) ? msg : defaultMessage);
    
    toast.setView(toastView);
    toast.setDuration(length);
    return toast;
  }


  private static void RoundAndBorder(View view, String color, int border, String strokeColor, float round) {
    GradientDrawable gd = new GradientDrawable();
    gd.setColor(Color.parseColor(color));
    gd.setCornerRadius(round);
    gd.setStroke(border, Color.parseColor(strokeColor));
    view.setBackground(gd);
  }
}
