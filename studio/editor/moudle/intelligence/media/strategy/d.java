package com.bilibili.studio.editor.moudle.intelligence.media.strategy;

import com.bilibili.studio.centerplus.util.i;
import com.bilibili.studio.editor.moudle.intelligence.trace.AlbumIntelligenceTrace;
import com.bilibili.upper.module.contribute.picker.v3.manager.intelligence.IgvActionRecordManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/d.class */
public final class d implements i.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f107410d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f107411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IgvActionRecordManager f107412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final AlbumIntelligenceTrace f107413c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/d$a.class */
    public static final class a {
    }

    public d(@NotNull b bVar, @NotNull IgvActionRecordManager igvActionRecordManager, @Nullable AlbumIntelligenceTrace albumIntelligenceTrace) {
        this.f107411a = bVar;
        this.f107412b = igvActionRecordManager;
        this.f107413c = albumIntelligenceTrace;
    }

    @Override // com.bilibili.studio.centerplus.util.i.a
    public final void release() {
        b bVar = this.f107411a;
        bVar.f107383a.clear();
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.a aVar = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.a) bVar.f107384b.getValue();
        if (aVar != null) {
            aVar.d();
        }
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.a aVar2 = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.a) bVar.f107385c.getValue();
        if (aVar2 != null) {
            aVar2.d();
        }
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.a aVar3 = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.a) bVar.f107386d.getValue();
        if (aVar3 != null) {
            aVar3.d();
        }
    }
}
