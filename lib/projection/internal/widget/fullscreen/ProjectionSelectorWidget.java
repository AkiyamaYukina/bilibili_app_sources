package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.G;
import Me0.H;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.reporter.a;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionSelectorWidget.class */
public final class ProjectionSelectorWidget extends AppCompatTextView implements InterfaceC7755c, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Disposable f63969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC5317a f63971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f63972d;

    public ProjectionSelectorWidget(@NotNull Context context) {
        super(context);
        setSelected(true);
    }

    public ProjectionSelectorWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setSelected(true);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        this.f63970b = null;
        Disposable disposable = this.f63969a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63969a = null;
        this.f63972d = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        setVisibility(8);
        this.f63970b = interfaceC7845m2;
        this.f63969a = interfaceC7845m2.f().switchMap(new G(this)).subscribe(new H(interfaceC7845m2, this));
        setText("选集");
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        a reporter;
        InterfaceC5317a interfaceC5317a = this.f63971c;
        if (interfaceC5317a != null) {
            interfaceC5317a.showPanel("ProjectionSelectorPanel");
        }
        ProjectionDeviceInternal projectionDeviceInternal = this.f63972d;
        if (projectionDeviceInternal != null) {
            C7564c.f121634k.S(projectionDeviceInternal, null);
            InterfaceC7845m interfaceC7845m = this.f63970b;
            if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                return;
            }
            reporter.S(projectionDeviceInternal, null);
        }
    }

    @Override // ke0.InterfaceC7755c
    public void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
        this.f63971c = interfaceC5317a;
    }
}
