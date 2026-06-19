package com.bilibili.lib.projection.internal.widget.halfscreen;

import Qe0.C2819a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.InterfaceC7756d;
import kotlin.jvm.JvmOverloads;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionDeviceNameWidget.class */
public final class ProjectionDeviceNameWidget extends AppCompatTextView implements InterfaceC7756d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Disposable f64053a;

    @JvmOverloads
    public ProjectionDeviceNameWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public ProjectionDeviceNameWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ProjectionDeviceNameWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m.a aVar) {
        Disposable disposable = this.f64053a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f64053a = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m.a aVar) {
        this.f64053a = aVar.getContainer().getClient().f().subscribe(new C2819a(this));
    }
}
