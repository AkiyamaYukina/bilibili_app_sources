package com.bilibili.playset.playlist.ui;

import X50.k0;
import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.lib.image2.view.BiliImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/DayNightDraweeView.class */
public class DayNightDraweeView extends BiliImageView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f85484m = 0;

    public DayNightDraweeView(Context context) {
        this(context, null);
    }

    public DayNightDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setTintableCallback(new k0(this));
        tint();
    }
}
