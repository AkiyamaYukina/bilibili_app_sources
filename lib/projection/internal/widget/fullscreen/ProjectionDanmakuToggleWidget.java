package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.C2646b;
import Me0.C2648d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bilibili.lib.projection.ProjectionTheme;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.device.a;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import he0.C7433b;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionDanmakuToggleWidget.class */
public final class ProjectionDanmakuToggleWidget extends AppCompatImageView implements InterfaceC7755c, View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f63916c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f63918b;

    public ProjectionDanmakuToggleWidget(@NotNull Context context) {
        super(context);
        this.f63918b = new CompositeDisposable();
    }

    public ProjectionDanmakuToggleWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63918b = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDanmakuShow(boolean z6) {
        if (z6) {
            setImageLevel(0);
        } else {
            setImageLevel(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTheme(ProjectionTheme projectionTheme) {
        if (projectionTheme == ProjectionTheme.GREEN) {
            setImageResource(2131232504);
        } else {
            setImageResource(2131232502);
        }
    }

    @Override // ke0.InterfaceC7753a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void i(@NotNull InterfaceC7845m interfaceC7845m) {
        a aVarS;
        this.f63917a = interfaceC7845m;
        setVisibility(8);
        InterfaceC7845m interfaceC7845m2 = this.f63917a;
        if (interfaceC7845m2 != null) {
            CompositeDisposable compositeDisposable = this.f63918b;
            if (compositeDisposable != null) {
                compositeDisposable.add(interfaceC7845m2.e().subscribe(new C2646b(this)));
            }
            CompositeDisposable compositeDisposable2 = this.f63918b;
            if (compositeDisposable2 != null) {
                compositeDisposable2.add(interfaceC7845m2.f().switchMap(new C2648d(this, interfaceC7845m2)).subscribe());
            }
        }
        InterfaceC7845m interfaceC7845m3 = this.f63917a;
        ProjectionDeviceInternal device = (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null) ? null : aVarS.getDevice();
        int i7 = 8;
        if (device != null) {
            i7 = 8;
            if (device.k()) {
                i7 = !z(device) ? 8 : 0;
            }
        }
        setVisibility(i7);
        setOnClickListener(this);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        this.f63917a = null;
        CompositeDisposable compositeDisposable = this.f63918b;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        this.f63918b = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        InterfaceC7845m interfaceC7845m = this.f63917a;
        if (interfaceC7845m != null) {
            boolean danmakuShow = interfaceC7845m.getDanmakuShow();
            com.bilibili.lib.projection.internal.reporter.a reporter = interfaceC7845m.getReporter();
            boolean z6 = !danmakuShow;
            reporter.u(interfaceC7845m.i().c(), z6);
            interfaceC7845m.danmakuToggle(z6, true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        invalidate();
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }

    public final boolean z(ProjectionDeviceInternal projectionDeviceInternal) {
        InterfaceC7845m interfaceC7845m;
        InterfaceC7845m interfaceC7845m2 = this.f63917a;
        return interfaceC7845m2 == null || interfaceC7845m2.getClientType() != 4 || (C7433b.d(projectionDeviceInternal) && (interfaceC7845m = this.f63917a) != null && interfaceC7845m.getClientType() == 4);
    }
}
