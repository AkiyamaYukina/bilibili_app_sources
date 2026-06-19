package com.bilibili.lib.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.push.PushNotification;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.bilibili.lib.push.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/d.class */
public final class C5336d {
    public static void a(PushNotification pushNotification) {
        int i7;
        BPushLog.d("BPushChannelCreator", "createChannels");
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        Object systemService = BPushFoundation.getApp().getSystemService("notification");
        NotificationManager notificationManager = systemService == null ? null : (NotificationManager) systemService;
        final ArrayList arrayList = new ArrayList();
        for (PushNotification.Channel channel : pushNotification.channels) {
            int i8 = channel.importance;
            if (Build.VERSION.SDK_INT < 26) {
                i7 = i8;
            } else {
                i7 = 1;
                if (i8 != 1) {
                    i7 = 2;
                    if (i8 != 2) {
                        i7 = 3;
                        if (i8 != 3) {
                            i7 = 4;
                            if (i8 != 4) {
                                i7 = 5;
                                if (i8 != 5) {
                                    i7 = -1000;
                                }
                            }
                        }
                    }
                }
            }
            NotificationChannel notificationChannel = new NotificationChannel(channel.id, channel.name, i7);
            notificationChannel.setDescription(channel.description);
            arrayList.add(notificationChannel);
            BPushLog.d("BPushChannelCreator", "createChannels add channel " + channel.uniqueKey);
        }
        if (arrayList.isEmpty()) {
            BPushLog.d("BPushChannelCreator", "createChannels isEmpty -> do nothing");
        } else {
            final NotificationManager notificationManager2 = notificationManager;
            HandlerThreads.runOn(0, new Runnable(notificationManager2, arrayList) { // from class: com.bilibili.lib.push.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NotificationManager f64238a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ArrayList f64239b;

                {
                    this.f64238a = notificationManager2;
                    this.f64239b = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    NotificationManager notificationManager3 = this.f64238a;
                    ArrayList arrayList2 = this.f64239b;
                    if (notificationManager3 != null) {
                        try {
                            notificationManager3.createNotificationChannels(arrayList2);
                        } catch (Exception e7) {
                            BPushLog.e("BPushChannelCreator", e7.getMessage());
                        }
                    }
                }
            });
        }
    }

    public static void b(NotificationManager notificationManager, String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        BPushLog.d("BPushChannelCreator", "createNotificationChannel delete channel id " + str);
        try {
            HandlerThreads.runOn(0, new TC.b(2, notificationManager, str));
        } catch (Exception e7) {
            BPushLog.e("BPushChannelCreator", e7.getMessage());
        }
    }
}
