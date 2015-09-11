package com.example.nx.alarmbattery;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import java.util.HashMap;

/**
 * Created by Nx on 8/25/2015.
 */
public class BatteryWidgetMoniter  extends AppWidgetProvider{

    private static final String CONFIGURE_BATTERY ="CONFIGURE_BATTERY";
    private static final String STATUS_ALARM = "STATUS_ALARM";
    private static final String ALARM_TYPE = "ALARM_TYPE";
    private static final String BATTERY_LEVEL ="BATTERY_LEVEL";


    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);




    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
    }

    @Override
    public void onEnabled(Context context) {

        super.onEnabled(context);

    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
    }

    @Override
    public void onRestored(Context context, int[] oldWidgetIds, int[] newWidgetIds) {
        super.onRestored(context, oldWidgetIds, newWidgetIds);
    }

    private HashMap getConfigureValue(Context context){

        HashMap<String,String> hashMap = new HashMap<String,String>();

        SharedPreferences sp = context.getSharedPreferences(CONFIGURE_BATTERY,Context.MODE_PRIVATE);



        return hashMap;
    }

    private void updateView(Context context){





    }

}
