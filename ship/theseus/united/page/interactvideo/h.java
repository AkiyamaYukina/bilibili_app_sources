package com.bilibili.ship.theseus.united.page.interactvideo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.bplus.followingpublish.fragments.V;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/h.class */
@StabilityInferred(parameters = 0)
public final class h extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusInteractVideoService f99972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f99973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f99974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f99975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f99976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f99977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f99978g;

    public h(@NotNull Context context, @NotNull TheseusInteractVideoService theseusInteractVideoService, @NotNull BackActionRepository backActionRepository, boolean z6) {
        super(context);
        this.f99972a = theseusInteractVideoService;
        this.f99973b = backActionRepository;
        this.f99974c = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View createContentView(@NotNull Context context) {
        int i7 = 0;
        View viewInflate = LayoutInflater.from(getMContext()).inflate(2131495190, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f99976e = viewInflate.findViewById(2131299437);
        this.f99977f = viewInflate.findViewById(2131296853);
        View viewFindViewById = viewInflate.findViewById(2131310129);
        this.f99975d = viewFindViewById;
        View view = viewFindViewById;
        if (viewFindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReplay");
            view = null;
        }
        if (!this.f99974c) {
            i7 = 8;
        }
        view.setVisibility(i7);
        this.f99978g = viewInflate.findViewById(2131313664);
        View view2 = this.f99977f;
        View view3 = view2;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBack");
            view3 = null;
        }
        view3.setOnClickListener(new g(0, (LifecycleOwner) this));
        View view4 = this.f99975d;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReplay");
            view4 = null;
        }
        view4.setOnClickListener(new V(this, 1));
        return viewInflate;
    }

    @Nullable
    public final tv.danmaku.biliplayerv2.service.f getFunctionInsetConfig() {
        return new tv.danmaku.biliplayerv2.service.f(0, 30);
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        return new FunctionWidgetConfig.Builder().persistent(true).launchType(2).build();
    }

    public final void onRelease() {
    }
}
