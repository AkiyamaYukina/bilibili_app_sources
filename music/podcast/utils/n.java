package com.bilibili.music.podcast.utils;

import com.bilibili.music.podcast.utils.InterfaceC5423c;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/n.class */
public final class n<T extends InterfaceC5423c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MusicBottomPlayView.e f67017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, T> f67018b = new HashMap<>();

    public n(@NotNull MusicBottomPlayView.e eVar) {
        this.f67017a = eVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void a(@Nullable List<? extends T> list) {
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5423c interfaceC5423c = (InterfaceC5423c) it.next();
            if (this.f67017a.a(interfaceC5423c) && !interfaceC5423c.isMiniReported()) {
                this.f67018b.put(Integer.valueOf(interfaceC5423c.hashCode()), (T) interfaceC5423c);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        for (Map.Entry<Integer, T> entry : this.f67018b.entrySet()) {
            this.f67017a.b(entry.getValue());
            entry.getValue().setMiniReported(true);
        }
        this.f67018b.clear();
    }
}
