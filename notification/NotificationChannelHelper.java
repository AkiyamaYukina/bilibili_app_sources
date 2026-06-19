package com.bilibili.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/notification/NotificationChannelHelper.class */
public class NotificationChannelHelper {
    public static void a(Context context, String str) {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = NotificationManagerHelper.getNotificationManager(context)) != null) {
            int identifier = context.getResources().getIdentifier(str.concat("_name"), "string", context.getPackageName());
            int i7 = identifier;
            if (identifier == 0) {
                i7 = TextUtils.equals(context.getPackageName(), "tv.danmaku.bilibilihd") ? 2131822471 : 2131822274;
            }
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i7), 3);
            int identifier2 = context.getResources().getIdentifier(str.concat("_description"), "string", context.getPackageName());
            int i8 = identifier2;
            if (identifier2 == 0) {
                i8 = TextUtils.equals(context.getPackageName(), "tv.danmaku.bilibilihd") ? 2131822470 : 2131822273;
            }
            notificationChannel.setDescription(context.getString(i8));
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static String getBangumiChannelId(Context context) {
        String str = TextUtils.equals(context.getPackageName(), "tv.danmaku.bilibilihd") ? "bili_hd_channel_bangumi" : "bili_channel_bangumi";
        a(context, str);
        return str;
    }

    public static String getDefaultChannelId(Context context) {
        String str = TextUtils.equals(context.getPackageName(), "tv.danmaku.bilibilihd") ? "bili_hd_channel_default" : "bili_channel_default";
        a(context, str);
        return str;
    }

    public static String getLiveChannelId(Context context) {
        a(context, "bili_channel_live");
        return "bili_channel_live";
    }
}
