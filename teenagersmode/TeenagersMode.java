package com.bilibili.teenagersmode;

import WI0.I0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bilibili.app.comm.restrict.utils.TeenagersModeKt;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.teenagersmode.b;
import com.bilibili.teenagersmode.c;
import com.bilibili.teenagersmode.ui.TeenagersModeActivity;
import com.bilibili.xpref.Xpref;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/TeenagersMode.class */
public class TeenagersMode {
    public static final int STATE_HIDE = 0;
    public static final int STATE_INTERCEPT = 1;
    public static final int STATE_NOT_INTERCEPT = 0;
    public static final int STATE_SHOW = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f110549c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<OnTeenagersModeChangeListener, String> f110551b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f110550a = isEnable();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/TeenagersMode$OnTeenagersModeChangeListener.class */
    public interface OnTeenagersModeChangeListener {
        void onStateChange(boolean z6, boolean z7);

        default void onStateChange(boolean z6, boolean z7, boolean z8) {
            onStateChange(z6, z7);
        }

        void onTeenagerModePageShow(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/TeenagersMode$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TeenagersMode f110552a = new TeenagersMode();
    }

    static {
        ArrayList arrayList = new ArrayList();
        f110549c = arrayList;
        arrayList.add("upper");
        arrayList.add("dynamic_publish");
        arrayList.add("share");
        arrayList.add("search");
        arrayList.add("im");
        arrayList.add("player");
        arrayList.add("dynamic");
    }

    public static TeenagersMode getInstance() {
        return a.f110552a;
    }

    public Intent createLoginInterceptIntent(Activity activity) {
        return TeenagersModeActivity.Q6(activity, 4, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public RouteRequest createLogoutInterceptRequest() {
        return new RouteRequest.Builder("bilibili://main/teenagersmode").extras((Function1) new Object()).build();
    }

    public int getEntranceState(String str) {
        return isEnable(str) ? 0 : 1;
    }

    public int getInterceptState(String str) {
        return isEnable(str) ? 1 : 0;
    }

    public void init(Context context) {
        c cVar = c.C1213c.f110575a;
        Context applicationContext = context.getApplicationContext();
        cVar.getClass();
        cVar.f110557b = c.h(applicationContext);
        cVar.f110560e = b.g();
        BLog.i("TeenagersMode", "Teenagers mode init.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public void intentToInteceptPage(Context context) {
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://main/teenagersmode").extras((Function1) new Object()).build(), context);
    }

    public void intentToLoginInterceptPage(Context context, int i7) {
        Activity wrapperActivity = ThemeUtils.getWrapperActivity(context);
        if (wrapperActivity == null) {
            return;
        }
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://main/teenagersmode").extras(new I0(2)).requestCode(i7).build(), wrapperActivity);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public void intentToLogoutInterceptPage(Context context, int i7) {
        Activity wrapperActivity = ThemeUtils.getWrapperActivity(context);
        if (wrapperActivity == null) {
            return;
        }
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://main/teenagersmode").extras((Function1) new Object()).requestCode(i7).build(), wrapperActivity);
    }

    public boolean isAppTeenagerModeEnable() {
        Application application = BiliContext.application();
        if (application == null) {
            return false;
        }
        return b.f(application);
    }

    public boolean isBizStateOpen(String str) {
        return ("home_live".equalsIgnoreCase(str) || "home_bangumi".equalsIgnoreCase(str)) ? b.a.a(str, true) : ((ArrayList) f110549c).contains(str) ? b.a.a(str, false) : b.a.a("common", true);
    }

    public boolean isEnable() {
        return isAppTeenagerModeEnable() || TeenagersModeKt.d();
    }

    public boolean isEnable(String str) {
        if (BiliContext.application() == null) {
            return false;
        }
        boolean z6 = false;
        if (isEnable()) {
            z6 = false;
            if (isBizStateOpen(str)) {
                z6 = true;
            }
        }
        return z6;
    }

    public boolean isForce() {
        Application application = BiliContext.application();
        if (application == null) {
            return false;
        }
        return Xpref.getSharedPreferences(application, "bili_teenagers_mode_preferences0").getBoolean("teenagers_mode_server_force", false);
    }

    public boolean isOverseasTeenModeEnabled() {
        Application application = BiliContext.application();
        if (application == null) {
            return false;
        }
        return b.e(application);
    }

    public void registerListener(OnTeenagersModeChangeListener onTeenagersModeChangeListener) {
        registerListener(onTeenagersModeChangeListener, "");
    }

    public void registerListener(OnTeenagersModeChangeListener onTeenagersModeChangeListener, String str) {
        if (((ConcurrentHashMap) this.f110551b).containsKey(onTeenagersModeChangeListener)) {
            return;
        }
        ((ConcurrentHashMap) this.f110551b).put(onTeenagersModeChangeListener, str);
    }

    public boolean shouldAddParam() {
        return this.f110550a;
    }

    public boolean shouldInterceptUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ((str.startsWith("http://www.bilibili.com") || str.startsWith("https://www.bilibili.com")) && str.contains("/blackboard/live")) {
            return isEnable("common");
        }
        return false;
    }

    public void showDialogIfNeed(Activity activity) {
        c cVar = c.C1213c.f110575a;
        cVar.getClass();
        if (c.h(activity) || !cVar.r(activity)) {
            return;
        }
        cVar.t(activity, true);
    }

    public void unregisterListener(OnTeenagersModeChangeListener onTeenagersModeChangeListener) {
        ((ConcurrentHashMap) this.f110551b).remove(onTeenagersModeChangeListener);
    }
}
