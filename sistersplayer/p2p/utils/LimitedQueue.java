package com.bilibili.sistersplayer.p2p.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/LimitedQueue.class */
public final class LimitedQueue<T> {
    private final int _size;

    @NotNull
    private final List<T> elements = new ArrayList();

    public LimitedQueue(int i7) {
        this._size = i7;
    }

    public final void clear() {
        this.elements.clear();
    }

    public final boolean empty() {
        return size() == 0;
    }

    public final void forEach(@NotNull Function1<? super T, Unit> function1) {
        Iterator<T> it = this.elements.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    @Nullable
    public final T front() {
        return (T) (this.elements.size() > 0 ? CollectionsKt.first(this.elements) : null);
    }

    public final T pop() {
        T t7 = (T) CollectionsKt.first(this.elements);
        CollectionsKt.removeFirst(this.elements);
        return t7;
    }

    public final void push(T t7) {
        if (this.elements.size() == this._size) {
            pop();
        }
        this.elements.add(t7);
    }

    public final int size() {
        return this.elements.size();
    }
}
