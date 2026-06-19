package com.bilibili.upper.module.cover.editor;

import android.graphics.PointF;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/editor/b.class */
public final class b {
    @NotNull
    public static PointF a(@NotNull List<PointF> list) {
        PointF pointF = new PointF();
        pointF.x = (list.get(0).x + list.get(2).x) / 2.0f;
        pointF.y = (list.get(0).y + list.get(2).y) / 2.0f;
        return pointF;
    }
}
