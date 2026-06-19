package com.bilibili.lib.projection.internal.widget.halfscreen;

import Qe0.C2821c;
import Qe0.C2822d;
import Qe0.InterfaceC2820b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import ke0.AbstractC7761i;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionDeviceSwitchWidget.class */
public final class ProjectionDeviceSwitchWidget extends AbstractC7761i implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f64054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC2820b f64056e;

    public ProjectionDeviceSwitchWidget(@NotNull Context context) {
        super(context, null, 6);
        k(context);
    }

    public ProjectionDeviceSwitchWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 4);
        k(context);
    }

    @Override // ke0.AbstractC7761i, ke0.InterfaceC7753a
    /* JADX INFO: renamed from: g */
    public final void b(@NotNull InterfaceC7845m.a aVar) {
        super.b(aVar);
        this.f64055d = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m.a aVar) {
        InterfaceC7845m.a aVar2 = aVar;
        this.f64055d = aVar2.getContainer().getClient();
        aVar2.getContainer().getClient().isGlobalLinkMode();
        setMDisposable(new CompositeDisposable());
        CompositeDisposable mDisposable = getMDisposable();
        if (mDisposable != null) {
            mDisposable.add(aVar2.getContainer().getClient().f().switchMap(C2821c.f19890a).subscribe(new C2822d(this)));
        }
    }

    public final void k(Context context) {
        setMRootView(LayoutInflater.from(context).inflate(2131496549, (ViewGroup) this, false));
        addView(getMRootView());
        View mRootView = getMRootView();
        this.f64054c = mRootView != null ? (TextView) mRootView.findViewById(2131300091) : null;
        setOnClickListener(this);
    }

    public final void l() {
        InterfaceC7845m interfaceC7845m = this.f64055d;
        if (interfaceC7845m != null) {
            interfaceC7845m.b(getContext(), true, false, false);
        }
        InterfaceC2820b interfaceC2820b = this.f64056e;
        if (interfaceC2820b != null) {
            interfaceC2820b.a();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        l();
    }

    public final void setDeviceSwitchCallback(@NotNull InterfaceC2820b interfaceC2820b) {
        this.f64056e = interfaceC2820b;
    }
}
