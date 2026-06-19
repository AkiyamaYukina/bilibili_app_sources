package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.C2651g;
import Me0.C2652h;
import Me0.InterfaceC2650f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.InterfaceC7755c;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionDeviceSwitchFullScreenWidget.class */
public final class ProjectionDeviceSwitchFullScreenWidget extends FrameLayout implements InterfaceC7755c, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LottieAnimationView f63920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f63921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f63922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Disposable f63924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public InterfaceC2650f f63925f;

    public ProjectionDeviceSwitchFullScreenWidget(@NotNull Context context) {
        super(context);
        j(context);
    }

    public ProjectionDeviceSwitchFullScreenWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        j(context);
    }

    public static final void g(ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget) {
        ImageView imageView = projectionDeviceSwitchFullScreenWidget.f63921b;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceConnectFailedView");
            imageView2 = null;
        }
        imageView2.setVisibility(8);
        LottieAnimationView lottieAnimationView = projectionDeviceSwitchFullScreenWidget.f63920a;
        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceSwitchAnimationView");
            lottieAnimationView2 = null;
        }
        lottieAnimationView2.setVisibility(0);
        LottieAnimationView lottieAnimationView3 = projectionDeviceSwitchFullScreenWidget.f63920a;
        LottieAnimationView lottieAnimationView4 = lottieAnimationView3;
        if (lottieAnimationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceSwitchAnimationView");
            lottieAnimationView4 = null;
        }
        lottieAnimationView4.setAnimation("ic_player_remote_link_check.json");
        LottieAnimationView lottieAnimationView5 = projectionDeviceSwitchFullScreenWidget.f63920a;
        LottieAnimationView lottieAnimationView6 = lottieAnimationView5;
        if (lottieAnimationView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceSwitchAnimationView");
            lottieAnimationView6 = null;
        }
        lottieAnimationView6.setRepeatCount(-1);
        LottieAnimationView lottieAnimationView7 = projectionDeviceSwitchFullScreenWidget.f63920a;
        LottieAnimationView lottieAnimationView8 = lottieAnimationView7;
        if (lottieAnimationView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceSwitchAnimationView");
            lottieAnimationView8 = null;
        }
        lottieAnimationView8.playAnimation();
        TextView textView = projectionDeviceSwitchFullScreenWidget.f63922c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceSwitchTextView");
            textView = null;
        }
        textView.setText("正在连接...");
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        Disposable disposable = this.f63924e;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63924e = null;
        this.f63923d = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        InterfaceC7845m interfaceC7845m2;
        InterfaceC7845m interfaceC7845m3 = interfaceC7845m;
        this.f63923d = interfaceC7845m3;
        CommonDialogUtilsKt.setVisibility(this, !interfaceC7845m3.isGlobalLinkMode() || ((interfaceC7845m2 = this.f63923d) != null && interfaceC7845m2.getClientType() == 4));
        this.f63924e = interfaceC7845m3.f().switchMap(C2651g.f16136a).subscribe(new C2652h(this));
    }

    public final void j(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131496548, (ViewGroup) this, false);
        addView(viewInflate);
        this.f63920a = (LottieAnimationView) viewInflate.findViewById(2131300090);
        this.f63921b = (ImageView) viewInflate.findViewById(2131300087);
        this.f63922c = (TextView) viewInflate.findViewById(2131300091);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        if (getContext().getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            InterfaceC7845m interfaceC7845m = this.f63923d;
            if (interfaceC7845m != null) {
                InterfaceC7845m.h(interfaceC7845m, getContext(), true, false, false, 8);
            }
        } else {
            InterfaceC7845m interfaceC7845m2 = this.f63923d;
            if (interfaceC7845m2 != null) {
                InterfaceC7845m.h(interfaceC7845m2, getContext(), false, true, false, 10);
            }
        }
        InterfaceC2650f interfaceC2650f = this.f63925f;
        if (interfaceC2650f != null) {
            interfaceC2650f.a();
        }
    }

    public final void setDeviceSwitchFullScreenCallback(@NotNull InterfaceC2650f interfaceC2650f) {
        this.f63925f = interfaceC2650f;
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
