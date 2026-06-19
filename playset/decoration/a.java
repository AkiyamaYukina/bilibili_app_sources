package com.bilibili.playset.decoration;

import android.graphics.drawable.Drawable;
import com.bilibili.playset.decoration.FlexibleDividerDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/a.class */
public final class a implements FlexibleDividerDecoration.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f84245a;

    public a(Drawable drawable) {
        this.f84245a = drawable;
    }

    @Override // com.bilibili.playset.decoration.FlexibleDividerDecoration.c
    public final Drawable a() {
        return this.f84245a;
    }
}
