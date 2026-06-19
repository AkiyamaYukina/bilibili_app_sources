package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.C2655k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.magicasakura.widgets.TintImageView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.a;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionFlipVideoWidget.class */
public final class ProjectionFlipVideoWidget extends TintImageView implements InterfaceC7755c, View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Disposable f63930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f63931g;

    public ProjectionFlipVideoWidget(@NotNull Context context) {
        super(context);
    }

    public ProjectionFlipVideoWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        this.f63929e = null;
        Disposable disposable = this.f63930f;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63930f = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        a aVarF;
        Observable observableSwitchMap;
        this.f63929e = interfaceC7845m;
        setOnClickListener(this);
        setVisibility(8);
        InterfaceC7845m interfaceC7845m2 = this.f63929e;
        this.f63930f = (interfaceC7845m2 == null || (aVarF = interfaceC7845m2.f()) == null || (observableSwitchMap = aVarF.switchMap(new C2655k(this))) == null) ? null : observableSwitchMap.subscribe();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
