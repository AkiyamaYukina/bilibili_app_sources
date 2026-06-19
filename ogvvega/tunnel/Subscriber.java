package com.bilibili.ogvvega.tunnel;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/Subscriber.class */
public abstract class Subscriber<T> {

    @NotNull
    private final Class<T> clazz;

    public Subscriber(@NotNull Class<T> cls) {
        this.clazz = cls;
    }

    @NotNull
    public final Class<T> getClazz() {
        return this.clazz;
    }

    public abstract void onDisconnected(@NotNull Cause cause, boolean z6);

    public abstract void onNext(T t7);

    public abstract void onSubscribed(boolean z6);
}
