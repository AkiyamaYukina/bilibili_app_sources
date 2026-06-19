package com.bilibili.search2.panel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Barrier;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/panel/e.class */
@StabilityInferred(parameters = 0)
public final class e extends InlinePanel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InlineAlphaAnim f86982A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Pr0.j f86983B;
    public InlineAvatarWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InlineProgressWidgetV3 f86984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TintBadgeView f86985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InlineDanmakuWidgetV3 f86986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VectorTextView f86987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VectorTextView f86988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InlineFullScreenWidgetV3 f86989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InlineMuteWidgetV3 f86990o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InlineGestureSeekWidgetV3 f86991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f86992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InlineGestureSeekGuideWidgetV3 f86993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SearchInline4GWarningWidgetV3 f86994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f86995t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f86996u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<? extends View> f86997v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<? extends View> f86998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<? extends View> f86999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List<? extends View> f87000y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InlineAlphaAnim f87001z;

    @NotNull
    public final InlineDanmakuWidgetV3 getDanmaku() {
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = this.f86986k;
        if (inlineDanmakuWidgetV3 != null) {
            return inlineDanmakuWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmaku");
        return null;
    }

    @NotNull
    public final InlineGestureSeekWidgetV3 getGestureSeekWidget() {
        InlineGestureSeekWidgetV3 inlineGestureSeekWidgetV3 = this.f86991p;
        if (inlineGestureSeekWidgetV3 != null) {
            return inlineGestureSeekWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
        return null;
    }

    @NotNull
    public final InlineFullScreenWidgetV3 l() {
        InlineFullScreenWidgetV3 inlineFullScreenWidgetV3 = this.f86989n;
        if (inlineFullScreenWidgetV3 != null) {
            return inlineFullScreenWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
        return null;
    }

    public final void onAttach() {
        super.onAttach();
        showWidgets();
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131495539, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f86983B);
        this.f87001z.releaseAnim();
        this.f86982A.releaseAnim();
    }

    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        this.h = view.findViewById(2131303659);
        this.f86984i = view.findViewById(2131303686);
        this.f86985j = view.findViewById(2131303660);
        this.f86986k = view.findViewById(2131303667);
        this.f86987l = view.findViewById(2131299631);
        this.f86988m = view.findViewById(2131299632);
        this.f86989n = view.findViewById(2131303668);
        this.f86990o = view.findViewById(2131303678);
        this.f86991p = view.findViewById(2131302160);
        this.f86992q = view.findViewById(2131297930);
        InlineGestureSeekGuideWidgetV3 inlineGestureSeekGuideWidgetV3FindViewById = view.findViewById(2131303689);
        this.f86993r = inlineGestureSeekGuideWidgetV3FindViewById;
        if (inlineGestureSeekGuideWidgetV3FindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
            inlineGestureSeekGuideWidgetV3FindViewById = null;
        }
        inlineGestureSeekGuideWidgetV3FindViewById.setSupportDisableGuidance(false);
        SearchInline4GWarningWidgetV3 searchInline4GWarningWidgetV3FindViewById = view.findViewById(2131303658);
        this.f86994s = searchInline4GWarningWidgetV3FindViewById;
        if (searchInline4GWarningWidgetV3FindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            searchInline4GWarningWidgetV3FindViewById = null;
        }
        searchInline4GWarningWidgetV3FindViewById.setSupportDisableGuidance(false);
        InlineGestureSeekWidgetV3 gestureSeekWidget = getGestureSeekWidget();
        InlineGestureSeekGuideWidgetV3 inlineGestureSeekGuideWidgetV3 = this.f86993r;
        if (inlineGestureSeekGuideWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
            inlineGestureSeekGuideWidgetV3 = null;
        }
        gestureSeekWidget.setOnSeekStateChangeListener(inlineGestureSeekGuideWidgetV3.getSeekStateListener());
        this.f86995t = (ImageView) view.findViewById(2131307585);
        this.f86996u = view.findViewById(2131307604);
        ((Barrier) view.findViewById(2131297224)).setReferencedIds(new int[]{2131303667, 2131303678, 2131303668});
        View view2 = this.h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view2 = null;
        }
        View view3 = this.f86985j;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            view3 = null;
        }
        View view4 = this.f86987l;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            view4 = null;
        }
        View view5 = this.f86988m;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view5 = null;
        }
        View view6 = this.f86992q;
        View view7 = view6;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view7 = null;
        }
        this.f86997v = CollectionsKt.listOf(new View[]{view2, view3, view4, view5, view7});
        View view8 = this.h;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view8 = null;
        }
        View view9 = this.f86985j;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            view9 = null;
        }
        View view10 = this.f86987l;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            view10 = null;
        }
        View view11 = this.f86988m;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view11 = null;
        }
        View view12 = this.f86992q;
        View view13 = view12;
        if (view12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view13 = null;
        }
        View view14 = this.f86990o;
        if (view14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            view14 = null;
        }
        this.f86998w = CollectionsKt.listOf(new View[]{view8, view9, view10, view11, view13, view14, getDanmaku()});
        View view15 = this.f86990o;
        if (view15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            view15 = null;
        }
        View danmaku = getDanmaku();
        View viewL = l();
        ImageView imageView = this.f86995t;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("more");
            imageView = null;
        }
        View view16 = this.f86996u;
        if (view16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreBackground");
            view16 = null;
        }
        this.f86999x = CollectionsKt.listOf(new View[]{view15, danmaku, viewL, imageView, view16});
        this.f87000y = CollectionsKt.emptyList();
        List<? extends View> list = this.f86997v;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgetsV9");
            list = null;
        }
        this.f87001z = new InlineAlphaAnim(0.0f, 0.0f, list, 300L, false, 19, (DefaultConstructorMarker) null);
        List<? extends View> list2 = this.f86999x;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgetsV9");
            list2 = null;
        }
        this.f86982A = new InlineAlphaAnim(1.0f, 0.5f, list2, 300L, false, 16, (DefaultConstructorMarker) null);
        this.f86983B = new Pr0.j(this, 1);
    }

    public final void reset() {
        super.reset();
        List<? extends View> list = this.f86997v;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgetsV9");
            list2 = null;
        }
        for (View view : list2) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
        }
        List<? extends View> list3 = this.f86999x;
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
        RelativeLayout relativeLayout = this.f86993r;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(8);
        LinearLayout linearLayout = this.f86994s;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        setOnClickListener(null);
        setOnLongClickListener(null);
        ImageView imageView = this.f86995t;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("more");
            imageView = null;
        }
        imageView.setOnClickListener(null);
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
        this.f87001z.startShowAnim();
        this.f86982A.startShowAnim();
        HandlerThreads.remove(0, this.f86983B);
        HandlerThreads.postDelayed(0, this.f86983B, v.f70979a);
    }
}
