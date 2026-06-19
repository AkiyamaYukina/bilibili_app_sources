package com.bilibili.search2.panel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.app.NotificationCompat;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineFullScreenWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekGuideWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineProgressWidgetV3;
import com.bilibili.app.comm.list.common.widget.SearchInline4GWarningWidgetV3;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.ogv.operation2.inlinevideo.v;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/panel/j.class */
@StabilityInferred(parameters = 0)
public final class j extends InlinePanel {
    public InlineAvatarWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InlineProgressWidgetV3 f87025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TintBadgeView f87026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InlineDanmakuWidgetV3 f87027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VectorTextView f87028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VectorTextView f87029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InlineFullScreenWidgetV3 f87030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InlineMuteWidgetV3 f87031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InlineGestureSeekWidgetV3 f87032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f87033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InlineGestureSeekGuideWidgetV3 f87034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SearchInline4GWarningWidgetV3 f87035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<? extends View> f87036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List<? extends View> f87037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<? extends View> f87038v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<? extends View> f87039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InlineAlphaAnim f87040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InlineAlphaAnim f87041y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.bilibili.comm.bbc.service.c f87042z;

    @NotNull
    public final VectorTextView getCoverLeftText1() {
        VectorTextView vectorTextView = this.f87028l;
        if (vectorTextView != null) {
            return vectorTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
        return null;
    }

    @NotNull
    public final VectorTextView getCoverLeftText2() {
        VectorTextView vectorTextView = this.f87029m;
        if (vectorTextView != null) {
            return vectorTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
        return null;
    }

    @NotNull
    public final InlineDanmakuWidgetV3 getDanmaku() {
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = this.f87027k;
        if (inlineDanmakuWidgetV3 != null) {
            return inlineDanmakuWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmaku");
        return null;
    }

    @NotNull
    public final InlineGestureSeekWidgetV3 getGestureSeekWidget() {
        InlineGestureSeekWidgetV3 inlineGestureSeekWidgetV3 = this.f87032p;
        if (inlineGestureSeekWidgetV3 != null) {
            return inlineGestureSeekWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
        return null;
    }

    @NotNull
    public final InlineGestureSeekGuideWidgetV3 getSeekGuideWidget() {
        InlineGestureSeekGuideWidgetV3 inlineGestureSeekGuideWidgetV3 = this.f87034r;
        if (inlineGestureSeekGuideWidgetV3 != null) {
            return inlineGestureSeekGuideWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
        return null;
    }

    @NotNull
    public final InlineFullScreenWidgetV3 l() {
        InlineFullScreenWidgetV3 inlineFullScreenWidgetV3 = this.f87030n;
        if (inlineFullScreenWidgetV3 != null) {
            return inlineFullScreenWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
        return null;
    }

    @NotNull
    public final SearchInline4GWarningWidgetV3 m() {
        SearchInline4GWarningWidgetV3 searchInline4GWarningWidgetV3 = this.f87035s;
        if (searchInline4GWarningWidgetV3 != null) {
            return searchInline4GWarningWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
        return null;
    }

    @NotNull
    public final InlineMuteWidgetV3 n() {
        InlineMuteWidgetV3 inlineMuteWidgetV3 = this.f87031o;
        if (inlineMuteWidgetV3 != null) {
            return inlineMuteWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mute");
        return null;
    }

    public final void o() {
        getGestureSeekWidget().setVisibility(0);
        l().setVisibility(0);
        InlineAlphaAnim inlineAlphaAnim = this.f87041y;
        List<? extends View> list = this.f87038v;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgetsV9");
            list2 = null;
        }
        inlineAlphaAnim.replaceViews(list2);
        InlineAlphaAnim inlineAlphaAnim2 = this.f87040x;
        List<? extends View> list3 = this.f87036t;
        List<? extends View> list4 = list3;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgetsV9");
            list4 = null;
        }
        inlineAlphaAnim2.replaceViews(list4);
        ProgressBar progressBar = this.f87025i;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_PROGRESS);
            progressBar = null;
        }
        progressBar.setVisibility(8);
    }

    public final void onAttach() {
        super.onAttach();
        showWidgets();
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131495568, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f87042z);
        this.f87040x.releaseAnim();
        this.f87041y.releaseAnim();
    }

    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        this.h = view.findViewById(2131303659);
        this.f87025i = view.findViewById(2131303686);
        this.f87026j = view.findViewById(2131303660);
        this.f87027k = view.findViewById(2131303667);
        this.f87028l = view.findViewById(2131299631);
        this.f87029m = view.findViewById(2131299632);
        this.f87030n = view.findViewById(2131303668);
        this.f87031o = view.findViewById(2131303678);
        this.f87032p = view.findViewById(2131302160);
        this.f87033q = view.findViewById(2131297930);
        this.f87034r = view.findViewById(2131303689);
        getSeekGuideWidget().setSupportDisableGuidance(false);
        this.f87035s = view.findViewById(2131303658);
        m().setSupportDisableGuidance(false);
        getGestureSeekWidget().setOnSeekStateChangeListener(getSeekGuideWidget().getSeekStateListener());
        ((Barrier) view.findViewById(2131297224)).setReferencedIds(new int[]{2131303667, 2131303678, 2131303668});
        View view2 = this.h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view2 = null;
        }
        View view3 = this.f87026j;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            view3 = null;
        }
        View coverLeftText1 = getCoverLeftText1();
        View coverLeftText2 = getCoverLeftText2();
        View view4 = this.f87033q;
        View view5 = view4;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view5 = null;
        }
        this.f87036t = CollectionsKt.listOf(new View[]{view2, view3, coverLeftText1, coverLeftText2, view5});
        View view6 = this.h;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view6 = null;
        }
        View view7 = this.f87026j;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            view7 = null;
        }
        View coverLeftText12 = getCoverLeftText1();
        View coverLeftText22 = getCoverLeftText2();
        View view8 = this.f87033q;
        View view9 = view8;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view9 = null;
        }
        this.f87037u = CollectionsKt.listOf(new View[]{view6, view7, coverLeftText12, coverLeftText22, view9, n(), getDanmaku()});
        this.f87038v = CollectionsKt.listOf(new View[]{n(), getDanmaku(), l()});
        this.f87039w = CollectionsKt.emptyList();
        List<? extends View> list = this.f87036t;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgetsV9");
            list = null;
        }
        this.f87040x = new InlineAlphaAnim(0.0f, 0.0f, list, 300L, false, 19, (DefaultConstructorMarker) null);
        List<? extends View> list2 = this.f87038v;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgetsV9");
            list2 = null;
        }
        this.f87041y = new InlineAlphaAnim(1.0f, 0.5f, list2, 300L, false, 16, (DefaultConstructorMarker) null);
        this.f87042z = new com.bilibili.comm.bbc.service.c(this, 1);
    }

    public final void reset() {
        super.reset();
        List<? extends View> list = this.f87036t;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgetsV9");
            list2 = null;
        }
        for (View view : list2) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
        }
        List<? extends View> list3 = this.f87038v;
        List<? extends View> list4 = list3;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgetsV9");
            list4 = null;
        }
        for (View view2 : list4) {
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
        }
        getDanmaku().reset();
        getSeekGuideWidget().setVisibility(8);
        m().setVisibility(8);
        setOnClickListener(null);
        setOnLongClickListener(null);
    }

    public final void setNetAlertEnable(boolean z6) {
        ICardPlayerContext cardPlayerContext = getCardPlayerContext();
        if (cardPlayerContext != null) {
            cardPlayerContext.setNetworkAlertEnable(z6);
        }
    }

    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        getGestureSeekWidget().setOnClickListener(onClickListener);
    }

    public final void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        getGestureSeekWidget().setOnLongClickListener(onLongClickListener);
    }

    public final void showWidgets() {
        this.f87040x.startShowAnim();
        this.f87041y.startShowAnim();
        HandlerThreads.remove(0, this.f87042z);
        HandlerThreads.postDelayed(0, this.f87042z, v.f70979a);
    }
}
