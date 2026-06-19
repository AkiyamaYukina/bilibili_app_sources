package com.bilibili.lib.projection.internal.widget.dialog;

import Ke0.InterfaceC2437a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import ke0.AbstractC7759g;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogSwitchWidget.class */
public final class ProjectionDialogSwitchWidget extends AbstractC7759g implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f63902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC2437a f63903e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogSwitchWidget$a.class */
    public static final class a<T, R> implements Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T, R> f63904a = (a<T, R>) new Object();

        public final Object apply(Object obj) {
            return ((com.bilibili.lib.projection.internal.device.a) obj).getDevice().i();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogSwitchWidget$b.class */
    public static final class b<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionDialogSwitchWidget f63905a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogSwitchWidget$b$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f63906a;

            static {
                int[] iArr = new int[ProjectionDeviceInternal.DeviceState.values().length];
                try {
                    iArr[ProjectionDeviceInternal.DeviceState.INITIALIZED.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[ProjectionDeviceInternal.DeviceState.CONNECTING.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[ProjectionDeviceInternal.DeviceState.CONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[ProjectionDeviceInternal.DeviceState.DISCONNECTED.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                f63906a = iArr;
            }
        }

        public b(ProjectionDialogSwitchWidget projectionDialogSwitchWidget) {
            this.f63905a = projectionDialogSwitchWidget;
        }

        public final void accept(Object obj) {
            TextView textView;
            int i7 = a.f63906a[((ProjectionDeviceInternal.DeviceState) obj).ordinal()];
            ProjectionDialogSwitchWidget projectionDialogSwitchWidget = this.f63905a;
            if (i7 == 1) {
                TextView textView2 = projectionDialogSwitchWidget.f63902d;
                if (textView2 != null) {
                    textView2.setText(projectionDialogSwitchWidget.getContext().getString(2131845418));
                    return;
                }
                return;
            }
            if (i7 == 2) {
                TextView textView3 = projectionDialogSwitchWidget.f63902d;
                if (textView3 != null) {
                    textView3.setText(projectionDialogSwitchWidget.getContext().getString(2131845418));
                    return;
                }
                return;
            }
            if (i7 != 3) {
                if (i7 == 4 && (textView = projectionDialogSwitchWidget.f63902d) != null) {
                    textView.setText(projectionDialogSwitchWidget.getContext().getString(2131847162));
                    return;
                }
                return;
            }
            TextView textView4 = projectionDialogSwitchWidget.f63902d;
            if (textView4 != null) {
                textView4.setText(projectionDialogSwitchWidget.getContext().getString(2131847250));
            }
        }
    }

    public ProjectionDialogSwitchWidget(@NotNull Context context) {
        super(context, null, 6, 0);
        l(context);
    }

    public ProjectionDialogSwitchWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        l(context);
    }

    @Override // ke0.AbstractC7759g, ke0.InterfaceC7753a
    /* JADX INFO: renamed from: g */
    public final void i(@NotNull InterfaceC7845m interfaceC7845m) {
        this.f122755c = interfaceC7845m;
        interfaceC7845m.isGlobalLinkMode();
        getMDisposable().add(interfaceC7845m.f().switchMap(a.f63904a).subscribe(new b(this)));
    }

    public final void l(Context context) {
        setMRootView(LayoutInflater.from(context).inflate(2131496549, (ViewGroup) this, false));
        addView(getMRootView());
        View mRootView = getMRootView();
        this.f63902d = mRootView != null ? (TextView) mRootView.findViewById(2131300091) : null;
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        InterfaceC7845m mProjectionClient = getMProjectionClient();
        if (mProjectionClient != null) {
            InterfaceC7845m.h(mProjectionClient, getContext(), true, false, false, 8);
        }
        InterfaceC2437a interfaceC2437a = this.f63903e;
        if (interfaceC2437a != null) {
            interfaceC2437a.a();
        }
    }

    public final void setDeviceSwitchCallback(@NotNull InterfaceC2437a interfaceC2437a) {
        this.f63903e = interfaceC2437a;
    }
}
