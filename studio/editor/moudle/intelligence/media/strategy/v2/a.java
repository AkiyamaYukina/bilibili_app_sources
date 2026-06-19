package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2;

import H3.y0;
import X1.C3081k;
import androidx.paging.M;
import androidx.room.B;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaDateAttr;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v2/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f107414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final uz0.a f107415b = new uz0.a((Map) null, 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f107416c = LazyKt.lazy(new y0(9));

    public final void a(MediaStrategyItem mediaStrategyItem, String str) {
        ImageItem source = mediaStrategyItem.getSource();
        String str2 = source != null ? source.path : null;
        boolean zIsVideo = mediaStrategyItem.isVideo();
        int priority = mediaStrategyItem.getPriority();
        String label = mediaStrategyItem.getLabel();
        MediaDateAttr dateAttr = mediaStrategyItem.getDateAttr();
        String typeStr = null;
        if (dateAttr != null) {
            typeStr = dateAttr.getTypeStr();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f107414a;
        StringBuilder sbB = C3081k.b("[添加素材]：", str2, ", isVideo = ", "，优先级：", zIsVideo);
        M.a(priority, ", 标签：", label, ", 日期：", sbB);
        B.a(typeStr, ",", str, "，耗时：", sbB);
        Os.f.b(sbB, jCurrentTimeMillis - j7, "intelligence_rec_tag");
    }
}
