package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step2;

import bo0.C5137g;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.editor.moudle.intelligence.trace.AlbumIntelligenceTrace;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step2/a.class */
public abstract class a implements com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final uz0.b f107521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f107522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f107523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f107524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f107525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final AlbumIntelligenceTrace f107526f;

    public a(@NotNull uz0.b bVar) {
        this.f107521a = bVar;
        this.f107522b = bVar.a;
        int i7 = bVar.b;
        this.f107523c = i7 != 1 ? i7 != 2 ? i7 != 3 ? MediaStrategyItem.SOURCE_FROM_OTHER : "视频" : "图片" : MediaStrategyItem.SOURCE_FROM_ALL;
        this.f107524d = LazyKt.lazy(new C5137g(this, 3));
        this.f107525e = new LinkedHashMap();
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.d dVar = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.d) com.bilibili.studio.centerplus.util.i.a();
        this.f107526f = dVar != null ? dVar.f107413c : null;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    public final void b(@NotNull String str) {
        AlbumIntelligenceTrace albumIntelligenceTrace = this.f107526f;
        if (albumIntelligenceTrace != null) {
            AlbumIntelligenceTrace.b(albumIntelligenceTrace, str, (String) this.f107524d.getValue(), this.f107525e, null, 8);
        }
    }

    public final void d(@NotNull String str) {
        BLog.e(this.f107522b, B0.a.a((String) this.f107524d.getValue(), " ", str));
    }

    public final void e(@Nullable Object obj, @NotNull String str) {
        this.f107525e.put(str, obj);
    }
}
