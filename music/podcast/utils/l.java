package com.bilibili.music.podcast.utils;

import com.bilibili.music.podcast.utils.InterfaceC5425e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/l.class */
public final class l<T extends InterfaceC5425e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5426f<T> f67014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, T> f67015b = new HashMap<>();

    public l(@NotNull InterfaceC5426f<T> interfaceC5426f) {
        this.f67014a = interfaceC5426f;
    }

    public final void a(@Nullable List<? extends T> list) {
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5425e interfaceC5425e = (InterfaceC5425e) it.next();
            if (this.f67014a.a((T) interfaceC5425e) && !interfaceC5425e.isReported()) {
                this.f67015b.put(Integer.valueOf(interfaceC5425e.hashCode()), (T) interfaceC5425e);
            }
        }
    }

    public final void b() {
        for (Map.Entry<Integer, T> entry : this.f67015b.entrySet()) {
            this.f67014a.b(entry.getValue());
            entry.getValue().setReported(true);
        }
        this.f67015b.clear();
    }
}
