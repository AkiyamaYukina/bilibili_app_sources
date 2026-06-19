package com.bilibili.live.streaming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/EventHandler.class */
public final class EventHandler<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicInteger idSequence = new AtomicInteger(1);

    @NotNull
    private final HashMap<Integer, T> callbacks = new HashMap<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/EventHandler$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AtomicInteger getIdSequence() {
            return EventHandler.idSequence;
        }
    }

    public final void Invoke(@NotNull Function1<? super T, Unit> function1) {
        synchronized (this.callbacks) {
            Iterator<Map.Entry<Integer, T>> it = this.callbacks.entrySet().iterator();
            while (it.hasNext()) {
                function1.invoke(it.next().getValue());
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final int register(T t7) {
        int andIncrement = idSequence.getAndIncrement();
        synchronized (this.callbacks) {
            this.callbacks.put(Integer.valueOf(andIncrement), t7);
        }
        return andIncrement;
    }

    public final boolean unregister(int i7) {
        boolean z6;
        synchronized (this.callbacks) {
            z6 = this.callbacks.remove(Integer.valueOf(i7)) != null;
        }
        return z6;
    }
}
