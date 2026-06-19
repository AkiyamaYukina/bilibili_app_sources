package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import Gm0.RunnableC1989L;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Barrier;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineFullScreenWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekWidgetV3;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.ogv.operation2.inlinevideo.v;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/k.class */
@StabilityInferred(parameters = 0)
public final class k extends InlinePanel {
    public InlineDanmakuWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public VectorTextView f75162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VectorTextView f75163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InlineFullScreenWidgetV3 f75164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ChannelBaikeInlineMuteWidget f75165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InlineGestureSeekWidgetV3 f75166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f75167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<? extends View> f75168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<? extends View> f75169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InlineAlphaAnim f75170q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InlineAlphaAnim f75171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RunnableC1989L f75172s;

    @NotNull
    public final InlineDanmakuWidgetV3 getDanmaku() {
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = this.h;
        if (inlineDanmakuWidgetV3 != null) {
            return inlineDanmakuWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmaku");
        return null;
    }

    @NotNull
    public final InlineGestureSeekWidgetV3 getGestureSeekWidget() {
        InlineGestureSeekWidgetV3 inlineGestureSeekWidgetV3 = this.f75166m;
        if (inlineGestureSeekWidgetV3 != null) {
            return inlineGestureSeekWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
        return null;
    }

    public final void onAttach() {
        super.onAttach();
        InlineAlphaAnim inlineAlphaAnim = this.f75170q;
        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
        if (inlineAlphaAnim == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
            inlineAlphaAnim2 = null;
        }
        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim2, false, (Function0) null, 2, (Object) null);
        InlineAlphaAnim inlineAlphaAnim3 = this.f75171r;
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
        return layoutInflater.inflate(2131495559, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f75172s);
        this.f75170q.releaseAnim();
        this.f75171r.releaseAnim();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        view.findViewById(2131303686);
        this.h = view.findViewById(2131303667);
        this.f75162i = view.findViewById(2131299631);
        this.f75163j = view.findViewById(2131299632);
        this.f75164k = view.findViewById(2131303668);
        this.f75165l = (ChannelBaikeInlineMuteWidget) view.findViewById(2131303678);
        this.f75166m = view.findViewById(2131302160);
        this.f75167n = view.findViewById(2131297930);
        ((Barrier) view.findViewById(2131297224)).setReferencedIds(new int[]{2131303667, 2131303678, 2131303668});
        View view2 = this.f75162i;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            view2 = null;
        }
        View view3 = this.f75163j;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view3 = null;
        }
        View view4 = this.f75167n;
        View view5 = view4;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view5 = null;
        }
        this.f75168o = CollectionsKt.listOf(new View[]{view2, view3, view5});
        ChannelBaikeInlineMuteWidget channelBaikeInlineMuteWidget = this.f75165l;
        if (channelBaikeInlineMuteWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            channelBaikeInlineMuteWidget = null;
        }
        InlineDanmakuWidgetV3 danmaku = getDanmaku();
        InlineFullScreenWidgetV3 inlineFullScreenWidgetV3 = this.f75164k;
        if (inlineFullScreenWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
            inlineFullScreenWidgetV3 = null;
        }
        this.f75169p = CollectionsKt.listOf(new View[]{channelBaikeInlineMuteWidget, danmaku, inlineFullScreenWidgetV3});
        List<? extends View> list = this.f75168o;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideWidgets");
            list = null;
        }
        this.f75170q = new InlineAlphaAnim(0.0f, 0.0f, list, 300L, false, 19, (DefaultConstructorMarker) null);
        List<? extends View> list2 = this.f75169p;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideWidgets");
            list2 = null;
        }
        this.f75171r = new InlineAlphaAnim(1.0f, 0.5f, list2, 300L, false, 16, (DefaultConstructorMarker) null);
        this.f75172s = new RunnableC1989L(this, 3);
    }

    public final void reset() {
        super.reset();
        List<? extends View> list = this.f75168o;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideWidgets");
            list2 = null;
        }
        for (View view : list2) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
        }
        List<? extends View> list3 = this.f75169p;
        List<? extends View> list4 = list3;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideWidgets");
            list4 = null;
        }
        for (View view2 : list4) {
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
        }
        getDanmaku().reset();
        setOnClickListener(null);
        setOnLongClickListener(null);
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
        this.f75170q.startShowAnim();
        this.f75171r.startShowAnim();
        HandlerThreads.remove(0, this.f75172s);
        HandlerThreads.postDelayed(0, this.f75172s, v.f70979a);
    }
}
