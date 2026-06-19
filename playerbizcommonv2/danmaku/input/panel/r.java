package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.provider.UtilKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.danmaku.command.InteractDanmakuListWidget;
import java.util.List;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import xr0.C9001a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/r.class */
@StabilityInferred(parameters = 0)
public final class r extends ComponentDialog {
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommonv2.danmaku.input.a f81162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<CommandsDanmaku> f81163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f81164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View f81166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public InteractDanmakuListWidget f81167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81168g;

    public r(@NotNull Context context, @NotNull com.bilibili.playerbizcommonv2.danmaku.input.a aVar, @Nullable List list, @NotNull String str, int i7) {
        super(context, 2131886241);
        this.f81162a = aVar;
        this.f81163b = list;
        this.f81164c = str;
        this.f81165d = i7;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.f81162a.e().s(this.f81168g);
        this.f81168g = false;
    }

    public final void j(WindowSizeClass windowSizeClass) {
        int iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
        View view = this.f81166e;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.matchConstraintMaxWidth = iDpToPx;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = iDpToPx == 0 ? -1 : 0;
            layoutParams2.matchConstraintMinHeight = C9001a.b(this.f81162a) ? 0 : Lh1.b.b(300.0f);
            int i7 = this.f81165d;
            if (i7 > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = i7;
            }
            view.setLayoutParams(layoutParams2);
        }
        bilibili.live.app.service.resolver.c.a(iDpToPx, "setContentMaxWidth: ", "InteractDanmakuListPanel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setCanceledOnTouchOutside(true);
        View view = null;
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131496600, (ViewGroup) null, false);
        setContentView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(2131306968);
        if (viewFindViewById != null) {
            view = viewFindViewById;
        }
        if (view != null) {
            view.setOnClickListener(new co0.f(this, 2));
        }
        this.f81166e = viewInflate.findViewById(2131321687);
        InteractDanmakuListWidget interactDanmakuListWidget = (InteractDanmakuListWidget) viewInflate.findViewById(2131303785);
        this.f81167f = interactDanmakuListWidget;
        if (interactDanmakuListWidget != 0) {
            interactDanmakuListWidget.setOnClickListener(new Object());
        }
        InteractDanmakuListWidget interactDanmakuListWidget2 = this.f81167f;
        if (interactDanmakuListWidget2 != null) {
            interactDanmakuListWidget2.setCommandDmOperationCallback(new p(this));
        }
        InteractDanmakuListWidget interactDanmakuListWidget3 = this.f81167f;
        if (interactDanmakuListWidget3 != null) {
            interactDanmakuListWidget3.setActionCallback(new q(this));
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(80);
            window.setDimAmount(0.0f);
        }
        InteractDanmakuListWidget interactDanmakuListWidget4 = this.f81167f;
        if (interactDanmakuListWidget4 != null) {
            interactDanmakuListWidget4.setTitle(this.f81164c);
        }
        InteractDanmakuListWidget interactDanmakuListWidget5 = this.f81167f;
        if (interactDanmakuListWidget5 != null) {
            interactDanmakuListWidget5.setData(this.f81163b);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = UtilKt.findFragmentActivityOrNull(getContext());
        if (fragmentActivityFindFragmentActivityOrNull == null) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(fragmentActivityFindFragmentActivityOrNull);
        objectRef.element = windowSizeClassWindowSize;
        j(windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new InteractDanmakuListPanel$collectContentWidth$1(fragmentActivityFindFragmentActivityOrNull, objectRef, this, null), 3, (Object) null);
    }
}
