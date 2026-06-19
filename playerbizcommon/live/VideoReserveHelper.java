package com.bilibili.playerbizcommon.live;

import G.p;
import android.app.Application;
import android.content.res.Resources;
import android.support.v4.media.a;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w8.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/live/VideoReserveHelper.class */
public final class VideoReserveHelper {

    @NotNull
    public static final VideoReserveHelper INSTANCE = new VideoReserveHelper();

    @JvmStatic
    @NotNull
    public static final String formatTime(long j7, @NotNull String str) {
        String strA;
        long j8 = ((long) 1000) * j7;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ServerClock.unreliableNow());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j8);
        String strA2 = (StringsKt.isBlank(formatWeek(j7)) || StringsKt.isBlank(str)) ? "" : a.a(" (", formatWeek(j8), ") ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String strA3 = B0.a.a(strA2, " ", simpleDateFormat.format(Long.valueOf(j8)));
        if (calendar.get(1) != calendar2.get(1)) {
            strA = p.a(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(j8)), strA3);
        } else if (calendar.get(6) == calendar2.get(6)) {
            Application application = BiliContext.application();
            String string = "";
            if (application != null) {
                Resources resources = application.getResources();
                string = "";
                if (resources != null) {
                    string = resources.getString(2131847131);
                    if (string == null) {
                        string = "";
                    }
                }
            }
            strA = B0.a.a(string, " ", simpleDateFormat.format(Long.valueOf(j8)));
        } else if (calendar.get(6) + 1 == calendar2.get(6)) {
            Application application2 = BiliContext.application();
            String string2 = "";
            if (application2 != null) {
                Resources resources2 = application2.getResources();
                string2 = "";
                if (resources2 != null) {
                    string2 = resources2.getString(2131846300);
                    if (string2 == null) {
                        string2 = "";
                    }
                }
            }
            strA = p.a(string2, strA3);
        } else {
            strA = p.a(new SimpleDateFormat("MM-dd", Locale.getDefault()).format(Long.valueOf(j8)), strA3);
        }
        return strA;
    }

    public static /* synthetic */ String formatTime$default(long j7, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = "";
        }
        return formatTime(j7, str);
    }

    @JvmStatic
    @NotNull
    public static final String formatTime2(long j7) {
        String strA;
        long j8 = j7 * ((long) 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ServerClock.unreliableNow());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j8);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String str = simpleDateFormat.format(Long.valueOf(j8));
        if (calendar.get(1) != calendar2.get(1)) {
            strA = B0.a.a(new SimpleDateFormat("yyyy年M月d日", Locale.getDefault()).format(Long.valueOf(j8)), " ", str);
        } else if (calendar.get(6) == calendar2.get(6)) {
            Application application = BiliContext.application();
            String string = "";
            if (application != null) {
                Resources resources = application.getResources();
                string = "";
                if (resources != null) {
                    string = resources.getString(2131847131);
                    if (string == null) {
                        string = "";
                    }
                }
            }
            strA = B0.a.a(string, " ", simpleDateFormat.format(Long.valueOf(j8)));
        } else if (calendar.get(6) + 1 == calendar2.get(6)) {
            Application application2 = BiliContext.application();
            String string2 = "";
            if (application2 != null) {
                Resources resources2 = application2.getResources();
                string2 = "";
                if (resources2 != null) {
                    string2 = resources2.getString(2131846300);
                    if (string2 == null) {
                        string2 = "";
                    }
                }
            }
            strA = B0.a.a(string2, " ", str);
        } else {
            strA = B0.a.a(new SimpleDateFormat("M月d日", Locale.getDefault()).format(Long.valueOf(j8)), " ", str);
        }
        return strA;
    }

    @JvmStatic
    @NotNull
    public static final String formatWeek(long j7) {
        int i7;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j7);
        switch (calendar.get(7)) {
            case 1:
                i7 = 2131845865;
                break;
            case 2:
                i7 = 2131846753;
                break;
            case 3:
                i7 = 2131846923;
                break;
            case 4:
                i7 = 2131845837;
                break;
            case 5:
                i7 = 2131846766;
                break;
            case 6:
                i7 = 2131846488;
                break;
            case 7:
                i7 = 2131845415;
                break;
            default:
                i7 = -1;
                break;
        }
        String string = "";
        if (i7 != -1) {
            Application application = BiliContext.application();
            string = "";
            if (application != null) {
                Resources resources = application.getResources();
                string = "";
                if (resources != null) {
                    string = resources.getString(i7);
                    if (string == null) {
                        string = "";
                    }
                }
            }
        }
        return string;
    }

    public static /* synthetic */ void requestCancelReserve$default(VideoReserveHelper videoReserveHelper, long j7, String str, String str2, BiliApiDataCallback biliApiDataCallback, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str2 = "";
        }
        videoReserveHelper.requestCancelReserve(j7, str, str2, biliApiDataCallback);
    }

    public static /* synthetic */ void requestReserve$default(VideoReserveHelper videoReserveHelper, long j7, String str, String str2, BiliApiDataCallback biliApiDataCallback, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str2 = "";
        }
        videoReserveHelper.requestReserve(j7, str, str2, biliApiDataCallback);
    }

    @JvmOverloads
    public final void requestCancelReserve(long j7, @NotNull String str, @Nullable BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        requestCancelReserve$default(this, j7, str, null, biliApiDataCallback, 4, null);
    }

    @JvmOverloads
    public final void requestCancelReserve(long j7, @NotNull String str, @NotNull String str2, @Nullable BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        ((VideoLiveApi) ServiceGenerator.createService(VideoLiveApi.class)).cancelReserve(y.a(), j7, str, str2).enqueue(biliApiDataCallback);
    }

    public final void requestCancelReserveBatch(@NotNull String str, @NotNull String str2, @Nullable BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        ((VideoLiveApi) ServiceGenerator.createService(VideoLiveApi.class)).cancelReserveBatch(y.a(), str, str2).enqueue(biliApiDataCallback);
    }

    public final void requestCloseReserve(long j7, @NotNull String str, @Nullable BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        ((VideoLiveApi) ServiceGenerator.createService(VideoLiveApi.class)).closeReserve(y.a(), j7, str, ConnectivityMonitor.getInstance().isWifiActive() ? "wifi" : ConnectivityMonitor.getInstance().isMobileActive() ? "mobile" : "none").enqueue(biliApiDataCallback);
    }

    @JvmOverloads
    public final void requestReserve(long j7, @NotNull String str, @Nullable BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        requestReserve$default(this, j7, str, null, biliApiDataCallback, 4, null);
    }

    @JvmOverloads
    public final void requestReserve(long j7, @NotNull String str, @NotNull String str2, @Nullable BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        ((VideoLiveApi) ServiceGenerator.createService(VideoLiveApi.class)).reserve(y.a(), j7, str, str2).enqueue(biliApiDataCallback);
    }

    public final void requestReserveBatch(@NotNull String str, @NotNull String str2, @Nullable BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        ((VideoLiveApi) ServiceGenerator.createService(VideoLiveApi.class)).reserveBatch(y.a(), str, str2).enqueue(biliApiDataCallback);
    }

    public final void requestReserveState(long j7, @Nullable BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        ((VideoLiveApi) ServiceGenerator.createService(VideoLiveApi.class)).getReserveState(y.a(), j7).enqueue(biliApiDataCallback);
    }

    public final void requestReserveStateBatch(@NotNull String str, @Nullable BiliApiDataCallback<JSONObject> biliApiDataCallback) {
        ((VideoLiveApi) ServiceGenerator.createService(VideoLiveApi.class)).getReserveStateBatch(y.a(), str).enqueue(biliApiDataCallback);
    }
}
