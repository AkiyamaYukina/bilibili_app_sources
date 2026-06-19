package com.bilibili.search2.panel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.app.NotificationCompat;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineFullScreenWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekGuideWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineProgressWidgetV3;
import com.bilibili.app.comm.list.common.widget.SearchInline4GWarningWidgetV3;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ogv.operation2.inlinevideo.v;
import com.bilibili.search2.api.SearchOgvClipInfo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/panel/i.class */
@StabilityInferred(parameters = 0)
public final class i extends InlinePanel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final a f87005A = new a(this);
    public InlineProgressWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InlineDanmakuWidgetV3 f87006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VectorTextView f87007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VectorTextView f87008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InlineFullScreenWidgetV3 f87009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InlineMuteWidgetV3 f87010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SearchOgvGestureSeekWidget f87011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f87012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InlineGestureSeekGuideWidgetV3 f87013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f87014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TintTextView f87015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TintTextView f87016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SearchInline4GWarningWidgetV3 f87017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TagSpanTextView f87018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<? extends View> f87019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<? extends View> f87020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InlineAlphaAnim f87021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InlineAlphaAnim f87022y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public KL.b f87023z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/panel/i$a.class */
    public static final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f87024a;

        public a(i iVar) {
            this.f87024a = iVar;
        }

        public final void onCompleted(ICardPlayerContext iCardPlayerContext) {
            super.onCompleted(iCardPlayerContext);
            i iVar = this.f87024a;
            iVar.f87014q.setVisibility(0);
            iVar.n().setVisibility(8);
        }

        public final void onError(ICardPlayerContext iCardPlayerContext) {
            this.f87024a.hidePreviewEnd();
        }

        public final void onPause(ICardPlayerContext iCardPlayerContext) {
            super.onPause(iCardPlayerContext);
            this.f87024a.hidePreviewEnd();
        }

        public final void onResume(ICardPlayerContext iCardPlayerContext) {
            super.onResume(iCardPlayerContext);
            this.f87024a.hidePreviewEnd();
        }

        public final void onStart(ICardPlayerContext iCardPlayerContext) {
            super.onStart(iCardPlayerContext);
            this.f87024a.hidePreviewEnd();
        }
    }

    @NotNull
    public final InlineDanmakuWidgetV3 getDanmaku() {
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = this.f87006i;
        if (inlineDanmakuWidgetV3 != null) {
            return inlineDanmakuWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmaku");
        return null;
    }

    @NotNull
    public final InlineGestureSeekGuideWidgetV3 getSeekGuideWidget() {
        InlineGestureSeekGuideWidgetV3 inlineGestureSeekGuideWidgetV3 = this.f87013p;
        if (inlineGestureSeekGuideWidgetV3 != null) {
            return inlineGestureSeekGuideWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
        return null;
    }

    public final void hidePreviewEnd() {
        this.f87014q.setVisibility(8);
        n().setVisibility(0);
    }

    public final void l(@Nullable SearchOgvClipInfo searchOgvClipInfo) {
        SearchOgvGestureSeekWidget searchOgvGestureSeekWidgetN = n();
        if (searchOgvClipInfo != null) {
            searchOgvGestureSeekWidgetN.getClass();
            if (!searchOgvClipInfo.isValid()) {
                BLog.e("SearchOgvGestureSeekWidget", "bindClipInfo invalid " + searchOgvClipInfo);
                searchOgvGestureSeekWidgetN.f86952D = null;
                return;
            }
        }
        searchOgvGestureSeekWidgetN.f86952D = searchOgvClipInfo;
    }

    @NotNull
    public final InlineFullScreenWidgetV3 m() {
        InlineFullScreenWidgetV3 inlineFullScreenWidgetV3 = this.f87009l;
        if (inlineFullScreenWidgetV3 != null) {
            return inlineFullScreenWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
        return null;
    }

    @NotNull
    public final SearchOgvGestureSeekWidget n() {
        SearchOgvGestureSeekWidget searchOgvGestureSeekWidget = this.f87011n;
        if (searchOgvGestureSeekWidget != null) {
            return searchOgvGestureSeekWidget;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
        return null;
    }

    @NotNull
    public final SearchInline4GWarningWidgetV3 o() {
        SearchInline4GWarningWidgetV3 searchInline4GWarningWidgetV3 = this.f87017t;
        if (searchInline4GWarningWidgetV3 != null) {
            return searchInline4GWarningWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
        return null;
    }

    public final void onAttach() {
        super.onAttach();
        showWidgets();
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131495567, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f87023z);
        this.f87021x.releaseAnim();
        this.f87022y.releaseAnim();
    }

    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        this.h = view.findViewById(2131303686);
        this.f87006i = view.findViewById(2131303667);
        this.f87007j = view.findViewById(2131299631);
        this.f87008k = view.findViewById(2131299632);
        this.f87009l = view.findViewById(2131303668);
        this.f87010m = view.findViewById(2131303678);
        this.f87011n = (SearchOgvGestureSeekWidget) view.findViewById(2131302160);
        this.f87012o = view.findViewById(2131297930);
        View viewFindViewById = view.findViewById(2131308199);
        this.f87015r = (TintTextView) viewFindViewById.findViewById(2131308733);
        this.f87016s = (TintTextView) viewFindViewById.findViewById(2131301051);
        this.f87014q = viewFindViewById;
        this.f87013p = view.findViewById(2131303689);
        getSeekGuideWidget().setSupportDisableGuidance(false);
        this.f87017t = view.findViewById(2131303658);
        o().setSupportDisableGuidance(false);
        this.f87018u = view.findViewById(2131303679);
        n().setOnSeekStateChangeListener(getSeekGuideWidget().getSeekStateListener());
        ((Barrier) view.findViewById(2131297224)).setReferencedIds(new int[]{2131303667, 2131303678, 2131303668});
        View view2 = this.f87007j;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            view2 = null;
        }
        View view3 = this.f87008k;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view3 = null;
        }
        View view4 = this.f87012o;
        View view5 = view4;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view5 = null;
        }
        View view6 = this.f87018u;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ogvBadge");
            view6 = null;
        }
        this.f87019v = CollectionsKt.listOf(new View[]{view2, view3, view5, view6});
        View view7 = this.f87010m;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            view7 = null;
        }
        this.f87020w = CollectionsKt.listOf(new View[]{view7, getDanmaku(), m()});
        List<? extends View> list = this.f87019v;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgetsV9");
            list = null;
        }
        this.f87021x = new InlineAlphaAnim(0.0f, 0.0f, list, 300L, false, 19, (DefaultConstructorMarker) null);
        List<? extends View> list2 = this.f87020w;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgetsV9");
            list2 = null;
        }
        this.f87022y = new InlineAlphaAnim(1.0f, 0.5f, list2, 300L, false, 16, (DefaultConstructorMarker) null);
        this.f87023z = new KL.b(this, 2);
    }

    public final void p() {
        n().setVisibility(0);
        m().setVisibility(0);
        InlineAlphaAnim inlineAlphaAnim = this.f87022y;
        List<? extends View> list = this.f87020w;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgetsV9");
            list2 = null;
        }
        inlineAlphaAnim.replaceViews(list2);
        InlineAlphaAnim inlineAlphaAnim2 = this.f87021x;
        List<? extends View> list3 = this.f87019v;
        List<? extends View> list4 = list3;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgetsV9");
            list4 = null;
        }
        inlineAlphaAnim2.replaceViews(list4);
        ProgressBar progressBar = this.h;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_PROGRESS);
            progressBar = null;
        }
        progressBar.setVisibility(8);
        TintTextView tintTextView = this.f87015r;
        if (tintTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endViewText");
            tintTextView = null;
        }
        tintTextView.setText(tintTextView.getContext().getString(2131821974));
        TintTextView tintTextView2 = this.f87016s;
        if (tintTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endViewGoDetail");
            tintTextView2 = null;
        }
        tintTextView2.setText(tintTextView2.getContext().getString(2131821973));
    }

    public final void reset() {
        super.reset();
        hidePreviewEnd();
        List<? extends View> list = this.f87019v;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgetsV9");
            list2 = null;
        }
        for (View view : list2) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
        }
        List<? extends View> list3 = this.f87020w;
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
        o().setVisibility(8);
        n().f86952D = null;
        setOnClickListener(null);
        setOnLongClickListener(null);
    }

    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        n().setOnClickListener(onClickListener);
    }

    public final void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        n().setOnLongClickListener(onLongClickListener);
    }

    public final void showWidgets() {
        this.f87021x.startShowAnim();
        this.f87022y.startShowAnim();
        HandlerThreads.remove(0, this.f87023z);
        HandlerThreads.postDelayed(0, this.f87023z, v.f70979a);
    }
}
