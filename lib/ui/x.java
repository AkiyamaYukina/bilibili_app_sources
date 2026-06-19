package com.bilibili.lib.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/x.class */
public final class x extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextView f64997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextView f64998b;

    public x(@NotNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(2131494587, this);
        this.f64997a = (TextView) findViewById(2131301742);
        this.f64998b = (TextView) findViewById(2131301738);
    }
}
