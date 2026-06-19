package com.bilibili.notification;

import E00.e;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.x;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.util.Calendar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/notification/NotificationManagerHelper.class */
public class NotificationManagerHelper {
    @Nullable
    public static NotificationManager getNotificationManager(Context context) {
        Object systemService = context.getSystemService("notification");
        if (systemService == null) {
            return null;
        }
        return (NotificationManager) systemService;
    }

    public static void notify(Context context, int i7, Notification notification) {
        NotificationManager notificationManager = getNotificationManager(context);
        if (notificationManager == null) {
            return;
        }
        notificationManager.notify(i7, notification);
    }

    public static void notify(Context context, Class<?> cls, String str, int i7, boolean z6, int i8, boolean z7, String str2, CharSequence charSequence, Intent intent) {
        PendingIntent activities;
        if (context == null || intent == null) {
            throw new IllegalArgumentException("Context or intent cannot be null!");
        }
        intent.addFlags(335609856);
        x xVar = new x(context.getApplicationContext());
        if (cls != null) {
            xVar.a(new ComponentName(xVar.f47188b, cls));
            xVar.f47187a.add(intent);
        } else {
            ComponentName component = intent.getComponent();
            ComponentName componentNameResolveActivity = component;
            if (component == null) {
                componentNameResolveActivity = intent.resolveActivity(xVar.f47188b.getPackageManager());
            }
            if (componentNameResolveActivity != null) {
                xVar.a(componentNameResolveActivity);
            }
            xVar.f47187a.add(intent);
        }
        if (xVar.f47187a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) xVar.f47187a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context2 = xVar.f47188b;
        for (Intent intent2 : intentArr) {
            e.a(intent2, BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT, context2);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                activities = PendingIntent.getActivities(context2, 0, intentArr, BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT, null);
            } catch (IllegalArgumentException e7) {
                activities = PendingIntent.getActivities(context2, 0, intentArr, 167772160, null);
            }
        } else {
            activities = PendingIntent.getActivities(context2, 0, intentArr, BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT, null);
        }
        notify(context, i7, new NotificationCompat.Builder(context.getApplicationContext(), str).setTicker(str2).setContentTitle(str2).setContentText(charSequence).setAutoCancel(z6).setContentIntent(activities).setOngoing(z7).setSmallIcon(i8).setWhen(Calendar.getInstance().getTimeInMillis()).build());
    }
}
