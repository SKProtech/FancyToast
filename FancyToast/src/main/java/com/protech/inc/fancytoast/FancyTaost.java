package com.protech.inc.fancytoast;
import android.widget.Toast;
import android.content.Context;
import android.view.View;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.Typeface;
import android.content.res.AssetManager;

public class FancyTaost {
   
    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;

    public static final int SUCCESS = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;
    public static final int INFO = 4;
	
	public static Toast makeText(Context context, String msg, int length, int type) {

        Toast toast = new Toast(context);
		
		
		//Library Design by AnugDev
		//library Created by Protech Inc.


        switch (type) {
			case 1:
				
				View SuccessView = LayoutInflater.from(context).inflate(R.layout.toast_view, null);
				LinearLayout SuccessBorder = SuccessView.findViewById(R.id.border);
				LinearLayout SuccessBorder_Content = SuccessView.findViewById(R.id.border_content);
				LinearLayout SuccessLine_Content = SuccessView.findViewById (R.id.line_content);
				TextView SuccessTitle = SuccessView.findViewById(R.id.textview1);
				TextView SuccessMessage = SuccessView.findViewById(R.id.textview2);
				ImageView SuccessImageView = SuccessView.findViewById(R.id.imageview1);
				SuccessImageView.setImageResource(R.drawable.success);
				SuccessBorder.setElevation(4f);
				RoundAndBorder(SuccessBorder, "#47D765", 0, "#00000000", 8);
				RoundAndBorder(SuccessBorder_Content, "#FFFFFF", 0, "#00000000", 8);
				SuccessTitle.setText("Success");
				SuccessTitle.setTextColor(Color.parseColor("#47D765"));
				SuccessMessage.setText(msg);
				toast.setView(SuccessView);
				
		   break;
			
			case 2:
				
				View WarningView = LayoutInflater.from(context).inflate(R.layout.toast_view, null);
				LinearLayout WarningBorder = WarningView.findViewById(R.id.border);
				LinearLayout WarningBorder_Content = WarningView.findViewById(R.id.border_content);
				LinearLayout WarningLine_Content = WarningView.findViewById (R.id.line_content);
				TextView WarningTitle = WarningView.findViewById(R.id.textview1);
				TextView WarningMessage = WarningView.findViewById(R.id.textview2);
				ImageView WarningImageView = WarningView.findViewById(R.id.imageview1);
				WarningImageView.setImageResource(R.drawable.warn);
				WarningBorder.setElevation(4f);
				RoundAndBorder(WarningBorder, "#FFC122", 0, "#00000000", 8);
				RoundAndBorder(WarningBorder_Content, "#FFFFFF", 0, "#00000000", 8);
				WarningTitle.setText("Warning");
				WarningTitle.setTextColor(Color.parseColor("#FFC122"));
				WarningMessage.setText(msg);
				toast.setView(WarningView);
				
				break;
				
		  case 3:
				
				View ErrorView = LayoutInflater.from(context).inflate(R.layout.toast_view, null);
				LinearLayout ErrorBorder = ErrorView.findViewById(R.id.border);
				LinearLayout ErrorBorder_Content = ErrorView.findViewById(R.id.border_content);
				LinearLayout ErrorLine_Content = ErrorView.findViewById (R.id.line_content);
				TextView ErrorTitle = ErrorView.findViewById(R.id.textview1);
				TextView ErrorMessage = ErrorView.findViewById(R.id.textview2);
				ImageView ErrorImageView = ErrorView.findViewById(R.id.imageview1);
				ErrorImageView.setImageResource(R.drawable.error);
				ErrorBorder.setElevation(4f);
				RoundAndBorder(ErrorBorder, "#F44236", 0, "#00000000", 8);
				RoundAndBorder(ErrorBorder_Content, "#FFFFFF", 0, "#00000000", 8);
				ErrorTitle.setText("Error");
				ErrorTitle.setTextColor(Color.parseColor("#F44236"));
				ErrorMessage.setText(msg);
				toast.setView(ErrorView);
				
			  break;
			  
			  
		case 4:
			
				View InfoView = LayoutInflater.from(context).inflate(R.layout.toast_view, null,false);
				LinearLayout InfoBorder = InfoView.findViewById(R.id.border);
				LinearLayout InfoBorder_Content = InfoView.findViewById(R.id.border_content);
				LinearLayout InfoLine_Content = InfoView.findViewById (R.id.line_content);
				TextView InfoTitle = InfoView.findViewById(R.id.textview1);
				TextView InfoMessage = InfoView.findViewById(R.id.textview2);
				ImageView InfoImageView = InfoView.findViewById(R.id.imageview1);
				InfoImageView.setImageResource(R.drawable.info);
				InfoBorder.setElevation(4f);
				RoundAndBorder(InfoBorder, "#2F87EB", 0, "#00000000", 8);
				RoundAndBorder(InfoBorder_Content, "#FFFFFF", 0, "#00000000", 8);
				InfoTitle.setText("Info");
				InfoTitle.setTextColor(Color.parseColor("#2F87EB"));
				InfoMessage.setText(msg);
				toast.setView(InfoView);
				
			
			break;
			
			
			}
			
		toast.setDuration(length);
        toast.show();
        return toast;
	}


	private static void RoundAndBorder (final View v, final String c, final double border, final String c2, final double round) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(c));
		gd.setCornerRadius((int) round);
		gd.setStroke((int) border, Color.parseColor(c2));
		v.setBackground(gd);
	}
}
