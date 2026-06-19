package com.bilibili.pegasus.channelv3.feed.inline;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Barrier;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.GestureSeekFrameLayout;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekWidgetV3;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/inline/i.class */
@StabilityInferred(parameters = 0)
public final class i extends InlinePanel {
    public VectorTextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public VectorTextView f75333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ChannelMovieInlineMuteWidget f75334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InlineGestureSeekWidgetV3 f75335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f75336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List<? extends View> f75337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<? extends View> f75338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InlineAlphaAnim f75339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InlineAlphaAnim f75340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Xv.g f75341q;

    public final void onAttach() {
        super.onAttach();
        InlineAlphaAnim inlineAlphaAnim = this.f75339o;
        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
        if (inlineAlphaAnim == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
            inlineAlphaAnim2 = null;
        }
        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim2, false, (Function0) null, 2, (Object) null);
        InlineAlphaAnim inlineAlphaAnim3 = this.f75340p;
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
        return layoutInflater.inflate(2131495560, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f75341q);
        this.f75339o.releaseAnim();
        this.f75340p.releaseAnim();
    }

    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        view.findViewById(2131303686);
        this.h = view.findViewById(2131299631);
        this.f75333i = view.findViewById(2131299632);
        this.f75334j = (ChannelMovieInlineMuteWidget) view.findViewById(2131303678);
        this.f75335k = view.findViewById(2131302160);
        this.f75336l = view.findViewById(2131297930);
        ((Barrier) view.findViewById(2131297224)).setReferencedIds(new int[]{2131303667, 2131303678, 2131303668});
        View view2 = this.h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            view2 = null;
        }
        View view3 = this.f75333i;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view3 = null;
        }
        View view4 = this.f75336l;
        View view5 = view4;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view5 = null;
        }
        this.f75337m = CollectionsKt.listOf(new View[]{view2, view3, view5});
        ChannelMovieInlineMuteWidget channelMovieInlineMuteWidget = this.f75334j;
        if (channelMovieInlineMuteWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            channelMovieInlineMuteWidget = null;
        }
        this.f75338n = CollectionsKt.listOf(channelMovieInlineMuteWidget);
        List<? extends View> list = this.f75337m;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideWidgets");
            list = null;
        }
        this.f75339o = new InlineAlphaAnim(0.0f, 0.0f, list, 300L, false, 19, (DefaultConstructorMarker) null);
        List<? extends View> list2 = this.f75338n;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideWidgets");
            list2 = null;
        }
        this.f75340p = new InlineAlphaAnim(1.0f, 0.5f, list2, 300L, false, 16, (DefaultConstructorMarker) null);
        this.f75341q = new Xv.g(this, 1);
    }

    public final void reset() {
        super.reset();
        List<? extends View> list = this.f75337m;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideWidgets");
            list2 = null;
        }
        for (View view : list2) {
            ListExtentionsKt.visible(view);
            view.setAlpha(1.0f);
        }
        List<? extends View> list3 = this.f75338n;
        List<? extends View> list4 = list3;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideWidgets");
            list4 = null;
        }
        for (View view2 : list4) {
            ListExtentionsKt.visible(view2);
            view2.setAlpha(1.0f);
        }
        setOnClickListener(null);
        setOnLongClickListener(null);
    }

    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        GestureSeekFrameLayout gestureSeekFrameLayout = this.f75335k;
        if (gestureSeekFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
            gestureSeekFrameLayout = null;
        }
        gestureSeekFrameLayout.setOnClickListener(onClickListener);
    }

    public final void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        FrameLayout frameLayout = this.f75335k;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
            frameLayout = null;
        }
        frameLayout.setOnLongClickListener(onLongClickListener);
    }

    public final void showWidgets() {
        this.f75339o.startShowAnim();
        this.f75340p.startShowAnim();
        HandlerThreads.remove(0, this.f75341q);
        HandlerThreads.postDelayed(0, this.f75341q, v.f70979a);
    }
}
