package com.bilibili.pegasus.holders.oversea;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.Inline4GWarningWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.PegasusInlineMuteWidget;
import com.bilibili.app.comm.list.common.widget.ListLottieBadgeTagView;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.panel.InlinePanel;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/K.class */
@StabilityInferred(parameters = 0)
public final class K extends InlinePanel {
    public InlineAvatarWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InlineDanmakuWidgetV3 f77922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VectorTextView f77923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VectorTextView f77924k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PegasusInlineMuteWidget f77925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ListLottieBadgeTagView f77926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Inline4GWarningWidgetV3 f77927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f77928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ArrayList<View> f77929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<? extends View> f77930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InlineAlphaAnim f77931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InlineAlphaAnim f77932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.bilibili.lib.biliweb.p f77933t;

    @NotNull
    public final InlineDanmakuWidgetV3 getDanmaku() {
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = this.f77922i;
        if (inlineDanmakuWidgetV3 != null) {
            return inlineDanmakuWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmaku");
        return null;
    }

    public final void onAttach() {
        super.onAttach();
        showWidgets();
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131502207, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f77933t);
        this.f77931r.releaseAnim();
        this.f77932s.releaseAnim();
    }

    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        this.h = view.findViewById(2131303659);
        this.f77922i = view.findViewById(2131303667);
        this.f77923j = view.findViewById(2131299631);
        this.f77924k = view.findViewById(2131299632);
        this.f77925l = view.findViewById(2131303678);
        this.f77928o = view.findViewById(2131297930);
        this.f77926m = view.findViewById(2131318539);
        this.f77927n = view.findViewById(2131303658);
        View view2 = this.h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view2 = null;
        }
        View view3 = this.f77923j;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            view3 = null;
        }
        View view4 = this.f77924k;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view4 = null;
        }
        View view5 = this.f77928o;
        View view6 = view5;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view6 = null;
        }
        ArrayList<View> arrayListArrayListOf = CollectionsKt.arrayListOf(new View[]{view2, view3, view4, view6});
        this.f77931r = new InlineAlphaAnim(0.0f, 0.0f, arrayListArrayListOf, 300L, false, 19, (DefaultConstructorMarker) null);
        this.f77929p = arrayListArrayListOf;
        View danmaku = getDanmaku();
        View view7 = this.f77925l;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            view7 = null;
        }
        View view8 = this.f77926m;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveBadge");
            view8 = null;
        }
        List<? extends View> listListOf = CollectionsKt.listOf(new View[]{danmaku, view7, view8});
        this.f77930q = listListOf;
        if (listListOf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            listListOf = null;
        }
        this.f77932s = new InlineAlphaAnim(1.0f, 0.5f, listListOf, 300L, false, 16, (DefaultConstructorMarker) null);
        this.f77933t = new com.bilibili.lib.biliweb.p(this, 1);
    }

    public final void reset() {
        super.reset();
        ArrayList<View> arrayList = this.f77929p;
        if (arrayList != null) {
            for (View view : arrayList) {
                view.setVisibility(0);
                view.setAlpha(1.0f);
            }
        }
        List<? extends View> list = this.f77930q;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            list2 = null;
        }
        for (View view2 : list2) {
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
        }
        getDanmaku().reset();
        setOnClickListener((View.OnClickListener) null);
        setOnLongClickListener((View.OnLongClickListener) null);
        LinearLayout linearLayout = this.f77927n;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
    }

    public final void showWidgets() {
        this.f77931r.startShowAnim();
        this.f77932s.startShowAnim();
        HandlerThreads.remove(0, this.f77933t);
        HandlerThreads.postDelayed(0, this.f77933t, com.bilibili.ogv.operation2.inlinevideo.v.f70979a);
    }
}
