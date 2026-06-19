package com.bilibili.upper.module.uppercenter.openscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import eJ0.C6931i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/openscreen/CountDownView.class */
@StabilityInferred(parameters = 0)
public final class CountDownView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextView f114123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.uppercenter.openscreen.a f114124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f114125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f114126d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/openscreen/CountDownView$a.class */
    public interface a {
        void onFinish();
    }

    public CountDownView(@NotNull Context context) {
        this(context, null);
    }

    public CountDownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context).inflate(2131493953, (ViewGroup) this, true);
        this.f114123a = (TextView) findViewById(2131310598);
        int iA = C6931i.a(context, 12.0f);
        setPadding(iA, 0, iA, 0);
    }

    @Nullable
    public final a getCountDownListener() {
        return this.f114125c;
    }

    @NotNull
    public final TextView getTimeText() {
        return this.f114123a;
    }

    public final void setCountDownListener(@Nullable a aVar) {
        this.f114125c = aVar;
    }

    public final void setStarted(boolean z6) {
        this.f114126d = z6;
    }
}
