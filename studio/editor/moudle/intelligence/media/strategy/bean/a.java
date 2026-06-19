package com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean;

import androidx.constraintlayout.widget.d;
import androidx.room.B;
import cf.e;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile List<? extends MediaStrategyItem> f107389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public MediaStrategyItem f107390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f107391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f107392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f107393e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f107394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f107395g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Igv f107396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f107397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f107398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f107399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public List<String> f107400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public List<String> f107401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f107402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f107403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f107404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f107405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f107406s;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a() {
        /*
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.f107393e = r1
            r0 = r6
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.Igv r0 = r0.f107396i
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L20
            r0 = r7
            java.lang.String r0 = r0.getStrategyNameX()
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L23
        L20:
            java.lang.String r0 = ""
            r7 = r0
        L23:
            r0 = r6
            r1 = r7
            r0.f107397j = r1
            r0 = r6
            ES0.i r1 = new ES0.i
            r2 = r1
            r3 = r6
            r4 = 5
            r2.<init>(r3, r4)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy(r1)
            r0.f107404q = r1
            r0 = r6
            java.lang.String r1 = ""
            r0.f107405r = r1
            r0 = r6
            ES0.j r1 = new ES0.j
            r2 = r1
            r3 = r6
            r4 = 4
            r2.<init>(r3, r4)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy(r1)
            r0.f107406s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a.<init>():void");
    }

    public final long a() {
        Igv igv = this.f107396i;
        return igv != null ? igv.getResourceIdX() : 0L;
    }

    public final long b() {
        Igv igv = this.f107396i;
        return igv != null ? igv.getStrategyIdX() : 0L;
    }

    public final boolean c() {
        return this.f107396i != null;
    }

    public final void d(@Nullable List<? extends MediaStrategyItem> list) {
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        this.f107389a = new CopyOnWriteArrayList(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> e() {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a.e():java.util.Map");
    }

    @NotNull
    public final String toString() {
        ImageItem source;
        boolean z6 = this.f107391c;
        int i7 = this.f107393e;
        MediaStrategyItem mediaStrategyItem = this.f107390b;
        String contentNameX = null;
        String str = (mediaStrategyItem == null || (source = mediaStrategyItem.getSource()) == null) ? null : source.path;
        String str2 = this.f107395g;
        String str3 = this.h;
        Igv igv = this.f107396i;
        if (igv != null) {
            contentNameX = igv.getContentNameX();
        }
        int i8 = this.f107403p;
        int i9 = this.f107402o;
        StringBuilder sbA = e.a(i7, "MediaStrategyResult(isDefault=", ", priority=", ", selectedItem=", z6);
        B.a(str, ", title=", str2, ",  subtitle=", sbA);
        sbA.append(str3);
        sbA.append(", strategyName =");
        B.a(this.f107397j, ", contentName =", contentNameX, ", imageCount=", sbA);
        return d.a(i8, i9, ", videoCount=", ",)", sbA);
    }
}
