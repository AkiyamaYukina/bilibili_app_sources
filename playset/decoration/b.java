package com.bilibili.playset.decoration;

import android.graphics.drawable.Drawable;
import com.bilibili.playset.decoration.FlexibleDividerDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/decoration/b.class */
public final class b implements FlexibleDividerDecoration.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f84246a;

    public b(Drawable drawable) {
        this.f84246a = drawable;
    }

    @Override // com.bilibili.playset.decoration.FlexibleDividerDecoration.c
    public final Drawable a() {
        return this.f84246a;
    }
}
