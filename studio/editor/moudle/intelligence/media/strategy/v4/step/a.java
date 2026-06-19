package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.step;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.editor.moudle.intelligence.trace.AlbumIntelligenceTrace;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/step/a.class */
public abstract class a implements com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final uz0.b f107494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f107495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f107496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f107497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f107498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final AlbumIntelligenceTrace f107499f;

    public a(@NotNull uz0.b bVar) {
        this.f107494a = bVar;
        this.f107495b = bVar.a;
        int i7 = bVar.b;
        this.f107496c = i7 != 1 ? i7 != 2 ? i7 != 3 ? MediaStrategyItem.SOURCE_FROM_OTHER : "视频" : "图片" : MediaStrategyItem.SOURCE_FROM_ALL;
        this.f107497d = LazyKt.lazy(new AI.c(this, 2));
        this.f107498e = new LinkedHashMap();
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.d dVar = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.d) com.bilibili.studio.centerplus.util.i.a();
        this.f107499f = dVar != null ? dVar.f107413c : null;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.d
    public final void b(@NotNull String str) {
        AlbumIntelligenceTrace albumIntelligenceTrace = this.f107499f;
        if (albumIntelligenceTrace != null) {
            AlbumIntelligenceTrace.b(albumIntelligenceTrace, str, (String) this.f107497d.getValue(), this.f107498e, null, 8);
        }
    }

    public final void d(@NotNull String str) {
        BLog.e(this.f107495b, B0.a.a((String) this.f107497d.getValue(), " ", str));
    }

    public final void e(@Nullable Object obj, @NotNull String str) {
        this.f107498e.put(str, obj);
    }
}
