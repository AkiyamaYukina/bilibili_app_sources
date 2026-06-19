package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.C2649e;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionDeviceNameWidget.class */
public final class ProjectionDeviceNameWidget extends AppCompatTextView implements InterfaceC7755c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Disposable f63919a;

    public ProjectionDeviceNameWidget(@NotNull Context context) {
        super(context);
    }

    public ProjectionDeviceNameWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        Disposable disposable = this.f63919a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63919a = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        this.f63919a = interfaceC7845m.f().subscribe(new C2649e(this));
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
