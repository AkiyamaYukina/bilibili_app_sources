package com.bilibili.lib.ui.garb;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/garb/GarbWatcher.class */
public final class GarbWatcher {

    @NotNull
    public static final GarbWatcher INSTANCE = new GarbWatcher();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArrayList<Observer> f64843a = new CopyOnWriteArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/garb/GarbWatcher$Observer.class */
    public interface Observer {
        void onSkinChange(@NotNull Garb garb);
    }

    public final void onChanged(@NotNull Garb garb) {
        Iterator<Observer> it = f64843a.iterator();
        while (it.hasNext()) {
            it.next().onSkinChange(garb);
        }
    }

    public final void subscribe(@NotNull Observer observer) {
        CopyOnWriteArrayList<Observer> copyOnWriteArrayList = f64843a;
        if (copyOnWriteArrayList.contains(observer)) {
            return;
        }
        copyOnWriteArrayList.add(observer);
    }

    public final void unSubscribe(@NotNull Observer observer) {
        f64843a.remove(observer);
    }
}
