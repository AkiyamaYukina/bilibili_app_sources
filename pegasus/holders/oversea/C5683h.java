package com.bilibili.pegasus.holders.oversea;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Barrier;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.GestureSeekFrameLayout;
import com.bilibili.app.comm.list.common.inline.widgetV3.Inline4GWarningWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineFullScreenWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekGuideWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.PegasusInlineMuteWidget;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.panel.InlinePanel;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.oversea.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/h.class */
@StabilityInferred(parameters = 0)
public final class C5683h extends InlinePanel {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f78023x = 0;
    public InlineAvatarWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TintBadgeView f78024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InlineDanmakuWidgetV3 f78025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VectorTextView f78026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VectorTextView f78027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InlineFullScreenWidgetV3 f78028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PegasusInlineMuteWidget f78029n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InlineGestureSeekWidgetV3 f78030o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f78031p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InlineGestureSeekGuideWidgetV3 f78032q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Inline4GWarningWidgetV3 f78033r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List<? extends View> f78034s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<? extends View> f78035t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InlineAlphaAnim f78036u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InlineAlphaAnim f78037v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RunnableC5682g f78038w;

    public final void onAttach() {
        super.onAttach();
        InlineAlphaAnim inlineAlphaAnim = this.f78036u;
        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
        if (inlineAlphaAnim == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
            inlineAlphaAnim2 = null;
        }
        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim2, false, (Function0) null, 2, (Object) null);
        InlineAlphaAnim inlineAlphaAnim3 = this.f78037v;
        InlineAlphaAnim inlineAlphaAnim4 = inlineAlphaAnim3;
        if (inlineAlphaAnim3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideAnimation");
            inlineAlphaAnim4 = null;
        }
        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim4, false, (Function0) null, 2, (Object) null);
        showWidgets();
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131503055, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f78038w);
        this.f78036u.releaseAnim();
        this.f78037v.releaseAnim();
    }

    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        this.h = view.findViewById(2131303659);
        view.findViewById(2131303686);
        this.f78024i = view.findViewById(2131303660);
        this.f78025j = view.findViewById(2131303667);
        this.f78026k = view.findViewById(2131299631);
        this.f78027l = view.findViewById(2131299632);
        this.f78028m = view.findViewById(2131303668);
        this.f78029n = view.findViewById(2131303678);
        this.f78030o = view.findViewById(2131302160);
        this.f78031p = view.findViewById(2131297930);
        this.f78032q = view.findViewById(2131303689);
        this.f78033r = view.findViewById(2131303658);
        InlineGestureSeekWidgetV3 inlineGestureSeekWidgetV3 = this.f78030o;
        if (inlineGestureSeekWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
            inlineGestureSeekWidgetV3 = null;
        }
        InlineGestureSeekGuideWidgetV3 inlineGestureSeekGuideWidgetV3 = this.f78032q;
        if (inlineGestureSeekGuideWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
            inlineGestureSeekGuideWidgetV3 = null;
        }
        inlineGestureSeekWidgetV3.setOnSeekStateChangeListener(inlineGestureSeekGuideWidgetV3.getSeekStateListener());
        ((Barrier) view.findViewById(2131297224)).setReferencedIds(new int[]{2131303667, 2131303678, 2131303668});
        View view2 = this.h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view2 = null;
        }
        View view3 = this.f78024i;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            view3 = null;
        }
        View view4 = this.f78026k;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            view4 = null;
        }
        View view5 = this.f78027l;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view5 = null;
        }
        View view6 = this.f78031p;
        View view7 = view6;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view7 = null;
        }
        this.f78034s = CollectionsKt.listOf(new View[]{view2, view3, view4, view5, view7});
        View view8 = this.f78029n;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            view8 = null;
        }
        View view9 = this.f78025j;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmaku");
            view9 = null;
        }
        View view10 = this.f78028m;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
            view10 = null;
        }
        this.f78035t = CollectionsKt.listOf(new View[]{view8, view9, view10});
        List<? extends View> list = this.f78034s;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgets");
            list = null;
        }
        this.f78036u = new InlineAlphaAnim(0.0f, 0.0f, list, 300L, false, 19, (DefaultConstructorMarker) null);
        List<? extends View> list2 = this.f78035t;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            list2 = null;
        }
        this.f78037v = new InlineAlphaAnim(1.0f, 0.5f, list2, 300L, false, 16, (DefaultConstructorMarker) null);
        this.f78038w = new RunnableC5682g(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void reset() {
        super.reset();
        List<? extends View> list = this.f78034s;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgets");
            list2 = null;
        }
        for (View view : list2) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
        }
        List<? extends View> list3 = this.f78035t;
        List<? extends View> list4 = list3;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            list4 = null;
        }
        for (View view2 : list4) {
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
        }
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = this.f78025j;
        if (inlineDanmakuWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmaku");
            inlineDanmakuWidgetV3 = null;
        }
        inlineDanmakuWidgetV3.reset();
        RelativeLayout relativeLayout = this.f78032q;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(8);
        LinearLayout linearLayout = this.f78033r;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        Inline4GWarningWidgetV3 inline4GWarningWidgetV3 = this.f78033r;
        if (inline4GWarningWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            inline4GWarningWidgetV3 = null;
        }
        inline4GWarningWidgetV3.setOnClickListener(new Object());
        setOnClickListener(null);
        setOnLongClickListener(null);
    }

    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        GestureSeekFrameLayout gestureSeekFrameLayout = this.f78030o;
        if (gestureSeekFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
            gestureSeekFrameLayout = null;
        }
        gestureSeekFrameLayout.setOnClickListener(onClickListener);
    }

    public final void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        FrameLayout frameLayout = this.f78030o;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
            frameLayout = null;
        }
        frameLayout.setOnLongClickListener(onLongClickListener);
    }

    public final void showWidgets() {
        this.f78036u.startShowAnim();
        this.f78037v.startShowAnim();
        HandlerThreads.remove(0, this.f78038w);
        HandlerThreads.postDelayed(0, this.f78038w, com.bilibili.ogv.operation2.inlinevideo.v.f70979a);
    }
}
