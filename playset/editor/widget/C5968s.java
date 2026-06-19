package com.bilibili.playset.editor.widget;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.playset.editor.widget.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/s.class */
public final class C5968s implements Function1<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f85045a;

    public C5968s(List list) {
        this.f85045a = list;
    }

    public final Object invoke(Object obj) {
        this.f85045a.get(((Number) obj).intValue());
        return null;
    }
}
