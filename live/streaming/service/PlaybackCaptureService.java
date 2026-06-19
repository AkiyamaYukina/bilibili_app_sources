package com.bilibili.live.streaming.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.spy.generated.android_app_Service;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.live.streaming.helper.PermissionHelper;
import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/service/PlaybackCaptureService.class */
public final class PlaybackCaptureService extends android_app_Service {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String KEY_NOTIFICATION_DESC = "notification_desc";

    @NotNull
    public static final String KEY_NOTIFICATION_ICON = "notification_icon";

    @NotNull
    public static final String KEY_NOTIFICATION_TITLE = "notification_title";

    @NotNull
    public static final String KEY_RESULT_CODE = "result_code";

    @NotNull
    public static final String KEY_SCREEN_INTENT = "screen_intent";

    @NotNull
    private static final String Notification_Channel_ID = "Railgun_Notification_ID";

    @NotNull
    private static final String Notification_Channel_Name = "Railgun_Notification_Name";
    private static final int Notification_ID = 4096;

    @NotNull
    private static final String TAG = "PlaybackCaptureService";

    @NotNull
    private final ServiceBridge bridge = new ServiceBridge();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/service/PlaybackCaptureService$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/service/PlaybackCaptureService$ServiceBridge.class */
    public static final class ServiceBridge extends Binder {

        @Nullable
        private MediaProjection mediaProjection;

        @Nullable
        public final MediaProjection getMediaProject() {
            return this.mediaProjection;
        }

        public final void setMediaProjection$BiliLivePushStreaming_release(@NotNull MediaProjection mediaProjection) {
            this.mediaProjection = mediaProjection;
        }
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "startForeground", owner = {"android.app.Service", "com.bilibili.bililive.room.player.background.AbsLiveBackgroundPlayerService", "com.bilibili.app.comm.list.common.downloadapk.DownloadApkService", "com.bilibili.lib.fasthybrid.SmallAppService", "com.bilibili.lib.fasthybrid.SmallAppService$InnerService", "com.bilibili.lib.jsbridge.common.record.recorder.ScreenRecorderService", "com.bilibili.live.streaming.service.PlaybackCaptureService", "tv.danmaku.bili.ui.player.notification.AbsMusicService", "tv.danmaku.bili.update.internal.network.download.UpdateService2", "androidx.work.impl.foreground.SystemForegroundService"}, scope = {})
    private static void __Ghost$Insertion$com_bilibili_infra_base_aop_StartForegroundHook_startForeground(Object obj, int i7, Notification notification) {
        if (Build.VERSION.SDK_INT < 31) {
            ((PlaybackCaptureService) obj).startForeground(i7, notification);
            return;
        }
        try {
            ((PlaybackCaptureService) obj).startForeground(i7, notification);
        } catch (Exception e7) {
            BLog.w("StartForegroundHook", "startForeground fail", e7);
        }
    }

    private void _attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    private final Notification createNotification(int i7, String str, String str2) {
        return new NotificationCompat.Builder(this, getNotificationChannelID(str2)).setContentTitle(str).setContentText(str2).setSmallIcon(i7).setAutoCancel(false).build();
    }

    private final String getNotificationChannelID(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return Notification_Channel_ID;
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(Notification_Channel_ID, Notification_Channel_Name, 4);
        notificationChannel.setDescription(str);
        notificationManager.createNotificationChannel(notificationChannel);
        return Notification_Channel_ID;
    }

    private final boolean hasAudioPermission(Context context) {
        try {
            return PermissionHelper.Companion.checkSelfPermission(context, new String[]{"android.permission.RECORD_AUDIO"});
        } catch (Exception e7) {
            LivePusherLog.w(TAG, "hasAudioPermission error, message:" + e7.getMessage(), e7);
            return false;
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        _attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        LivePusherLog.i$default(TAG, "PlaybackCaptureService onBind", null, 4, null);
        return this.bridge;
    }

    @Override // com.bilibili.lib.spy.generated.android_app_Service, android.app.Service
    public void onCreate() {
        LivePusherLog.i$default(TAG, "PlaybackCaptureService onCreate", null, 4, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        LivePusherLog.i$default(TAG, "PlaybackCaptureService onDestroy", null, 4, null);
        super.onDestroy();
        ((NotificationManager) getSystemService("notification")).cancel(4096);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onStartCommand(@org.jetbrains.annotations.Nullable android.content.Intent r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.service.PlaybackCaptureService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        LivePusherLog.i$default(TAG, "PlaybackCaptureService onUnbind", null, 4, null);
        return super.onUnbind(intent);
    }
}
