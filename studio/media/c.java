package com.bilibili.studio.media;

import com.bilibili.live.streaming.source.TextSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/c.class */
public abstract class c {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/c$a.class */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f108596a = new c();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/c$b.class */
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f108597a = new c();
    }

    /* JADX INFO: renamed from: com.bilibili.studio.media.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/c$c.class */
    public static final class C1202c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1202c f108598a = new c();
    }

    @NotNull
    public final String toString() {
        return this instanceof C1202c ? "Video" : this instanceof a ? "Image" : TextSource.STR_SCROLL_NONE;
    }
}
