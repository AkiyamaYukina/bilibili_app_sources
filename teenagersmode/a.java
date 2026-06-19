package com.bilibili.teenagersmode;

import Bs.o;
import com.bilibili.teenagersmode.TeenagersMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/a.class */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TeenagersMode f110555c;

    public a(TeenagersMode teenagersMode, boolean z6, boolean z7) {
        this.f110555c = teenagersMode;
        this.f110553a = z6;
        this.f110554b = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BLog.i("TeenagersMode", "Teenagers mode state change to: ".concat(this.f110553a ? "open" : "close"));
        Map<TeenagersMode.OnTeenagersModeChangeListener, String> map = this.f110555c.f110551b;
        if (map == null || ((ConcurrentHashMap) map).isEmpty()) {
            return;
        }
        for (TeenagersMode.OnTeenagersModeChangeListener onTeenagersModeChangeListener : ((ConcurrentHashMap) this.f110555c.f110551b).keySet()) {
            TeenagersMode teenagersMode = this.f110555c;
            boolean zIsBizStateOpen = teenagersMode.isBizStateOpen((String) ((ConcurrentHashMap) teenagersMode.f110551b).get(onTeenagersModeChangeListener));
            try {
                onTeenagersModeChangeListener.onStateChange(this.f110553a && zIsBizStateOpen, zIsBizStateOpen, this.f110554b);
            } catch (Exception e7) {
                o.a(e7, new StringBuilder("onTeenagerModeStateChange onStateChange "), "TeenagersMode");
            }
        }
    }
}
