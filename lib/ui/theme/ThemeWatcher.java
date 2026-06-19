package com.bilibili.lib.ui.theme;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/theme/ThemeWatcher.class */
public final class ThemeWatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThemeWatcher f64935c = new ThemeWatcher();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Observer> f64936a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f64937b = null;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/theme/ThemeWatcher$Observer.class */
    public interface Observer {
        void onThemeChanged();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/theme/ThemeWatcher$a.class */
    public interface a extends Observer {
    }

    public static ThemeWatcher getInstance() {
        return f64935c;
    }

    public void onChanged() {
        Observer[] observerArr;
        synchronized (this) {
            a aVar = this.f64937b;
            if (aVar != null) {
                aVar.onThemeChanged();
            }
            List<Observer> list = this.f64936a;
            observerArr = (Observer[]) ((ArrayList) list).toArray(new Observer[((ArrayList) list).size()]);
        }
        for (int length = observerArr.length - 1; length >= 0; length--) {
            observerArr[length].onThemeChanged();
        }
    }

    public void subscribe(Observer observer) {
        synchronized (this) {
            if (observer == null) {
                throw new NullPointerException();
            }
            if (!((ArrayList) this.f64936a).contains(observer)) {
                ((ArrayList) this.f64936a).add(observer);
            }
        }
    }

    public void subscribeMain(a aVar) {
        synchronized (this) {
            if (aVar == null) {
                throw new NullPointerException();
            }
            a aVar2 = this.f64937b;
            if (aVar2 != null) {
                BLog.efmt("ThemeWatcher", "Main theme observer %s has been replaced by %s", new Object[]{aVar2, aVar});
            }
            this.f64937b = aVar;
        }
    }

    public void unSubscribe(Observer observer) {
        synchronized (this) {
            ((ArrayList) this.f64936a).remove(observer);
        }
    }

    public void unSubscribeMain(a aVar) {
        synchronized (this) {
            a aVar2 = this.f64937b;
            if (aVar2 == aVar) {
                this.f64937b = null;
            } else {
                BLog.efmt("ThemeWatcher", "%s try to unsubscribe main observer but current is", new Object[]{aVar, aVar2});
            }
        }
    }
}
