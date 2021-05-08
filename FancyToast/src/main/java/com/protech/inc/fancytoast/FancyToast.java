package com.protech.inc.fancytoast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FancyToast {
   
  public static final int LENGTH_SHORT = 0;
  public static final int LENGTH_LONG = 1;

  public static final int SUCCESS = 1;
  public static final int WARNING = 2;
  public static final int ERROR = 3;
  public static final int INFO = 4;
  public static final int DEFAULT = 5;
  
  public static String defaultMessage;
  public static String defaultTitle;
  public static Typeface defaultTypeface = null;
  
  public static Builder builder = null;
  
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
    
    if (builder != null) {
      defaultTitle = builder.builderTitle;
      defaultTypeface = builder.builderTypeface;
    }
    
    toastView = LayoutInflater.from(context).inflate(R.layout.toast_view, null);
    toastBorder = toastView.findViewById(R.id.border);
    toastBorderContent = toastView.findViewById(R.id.border_content);
    toastLineContent = toastView.findViewById(R.id.line_content);
    toastTitle = toastView.findViewById(R.id.textview1);
    toastMessage = toastView.findViewById(R.id.textview2);
    toastImage = toastView.findViewById(R.id.imageview1);
    
    //Library Design by AnugDev
    //library Created by Protech Inc.
    //Library Modified by Hasrat Ali. https://t.me/hasratAli2880
    
    switch (type) {
      case SUCCESS:
        toastImage.setImageResource(R.drawable.success);
        RoundAndBorder(toastBorder, "#47D765", 0, "#00000000", 8);
        defaultTitle = !TextUtils.isEmpty(defaultTitle) ? defaultTitle : "Success";
        toastTitle.setTextColor(Color.parseColor("#47D765"));
        defaultMessage = "Example of Success Toast";
      break;
        
      case WARNING:
        toastImage.setImageResource(R.drawable.warn);
        RoundAndBorder(toastBorder, "#FFC122", 0, "#00000000", 8);
        defaultTitle = !TextUtils.isEmpty(defaultTitle) ? defaultTitle : "Warning";
        toastTitle.setTextColor(Color.parseColor("#FFC122"));
        defaultMessage = "Example of Warning Toast";
      break;
      
      case ERROR:
        toastImage.setImageResource(R.drawable.error);
        RoundAndBorder(toastBorder, "#F44236", 0, "#00000000", 8);
        defaultTitle = !TextUtils.isEmpty(defaultTitle) ? defaultTitle : "Error";
        toastTitle.setTextColor(Color.parseColor("#F44236"));
        defaultMessage = "Example of Error Toast";
      break;
      
      case INFO:
        toastImage.setImageResource(R.drawable.info);
        RoundAndBorder(toastBorder, "#2F87EB", 0, "#00000000", 8);
        defaultTitle = !TextUtils.isEmpty(defaultTitle) ? defaultTitle : "Info";
        toastTitle.setTextColor(Color.parseColor("#2F87EB"));
        defaultMessage = "Example of Info Toast";
      break;
      
      case DEFAULT:
        toastImage.setImageResource(R.drawable.info);
        RoundAndBorder(toastBorder, "#D8D8D8", 0, "#00000000", 8);
        defaultTitle = !TextUtils.isEmpty(defaultTitle) ? defaultTitle : "Default";
        toastTitle.setTextColor(Color.parseColor("#D8D8D8"));
        defaultMessage = "Example of Default Toast";
      break;
    }
    
    RoundAndBorder(toastBorderContent, "#FFFFFF", 0, "#00000000", 8);
    
    toastBorder.setElevation(4f);
    
    toastMessage.setText(!TextUtils.isEmpty(msg) ? msg : defaultMessage);
    toastTitle.setText(defaultTitle);
    
    toastMessage.setTypeface(defaultTypeface == null ? Typeface.SERIF : defaultTypeface);
    toastTitle.setTypeface(defaultTypeface == null ? Typeface.SERIF : defaultTypeface);
    
    toast.setView(toastView);
    toast.setDuration(length);
    return toast;
  }

  public static FancyToast bindBuilder(Builder builder) {
    FancyToast.builder = FancyToast.builder == null ? new Builder() : builder;
    return new FancyToast();
  }
  
  public static class Builder {
    
    private String builderTitle = "";
    private Typeface builderTypeface = null;
    
    public Builder setTitle(String title) {
      this.builderTitle = title;
      return new Builder();
    }
    
    public Builder setTypeface(Typeface font) {
      this.builderTypeface = font;
      return new Builder();
    }
  
  }

  private static void RoundAndBorder(View view, String color, int border, String strokeColor, float round) {
    GradientDrawable gd = new GradientDrawable();
    gd.setColor(Color.parseColor(color));
    gd.setCornerRadius(round);
    gd.setStroke(border, Color.parseColor(strokeColor));
    view.setBackground(gd);
  }
}
