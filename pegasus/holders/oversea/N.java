package com.bilibili.pegasus.holders.oversea;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Barrier;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.Inline4GWarningWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekGuideWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.PegasusInlineMuteWidget;
import com.bilibili.app.comm.list.common.widget.ListLottieBadgeTagView;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.opd.app.bizcommon.hybridruntime.neul.NeulService;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/N.class */
@StabilityInferred(parameters = 0)
public final class N extends InlinePanel {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f77965C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f77966A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final a f77967B = new a(this);
    public InlineAvatarWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TintBadgeView f77968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InlineDanmakuWidgetV3 f77969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VectorTextView f77970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VectorTextView f77971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PegasusInlineMuteWidget f77972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InlineGestureSeekWidgetV3 f77973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f77974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TintTextView f77975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TintTextView f77976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ListLottieBadgeTagView f77977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Inline4GWarningWidgetV3 f77978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f77979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InlineGestureSeekGuideWidgetV3 f77980u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<View> f77981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<View> f77982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InlineAlphaAnim f77983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InlineAlphaAnim f77984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public M f77985z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/N$a.class */
    public static final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final N f77986a;

        public a(N n7) {
            this.f77986a = n7;
        }

        public final void onCompleted(ICardPlayerContext iCardPlayerContext) {
            super.onCompleted(iCardPlayerContext);
            N n7 = this.f77986a;
            n7.f77974o.setVisibility(0);
            n7.getGestureSeekWidget().setVisibility(8);
            n7.f77966A = true;
        }

        public final void onError(ICardPlayerContext iCardPlayerContext) {
            super.onError(iCardPlayerContext);
            this.f77986a.hidePreviewEnd();
        }

        public final void onPause(ICardPlayerContext iCardPlayerContext) {
            super.onPause(iCardPlayerContext);
            this.f77986a.hidePreviewEnd();
        }

        public final void onResume(ICardPlayerContext iCardPlayerContext) {
            super.onResume(iCardPlayerContext);
            this.f77986a.hidePreviewEnd();
        }

        public final void onStart(ICardPlayerContext iCardPlayerContext) {
            super.onStart(iCardPlayerContext);
            this.f77986a.hidePreviewEnd();
        }
    }

    @NotNull
    public final InlineDanmakuWidgetV3 getDanmaku() {
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = this.f77969j;
        if (inlineDanmakuWidgetV3 != null) {
            return inlineDanmakuWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmaku");
        return null;
    }

    @NotNull
    public final InlineGestureSeekWidgetV3 getGestureSeekWidget() {
        InlineGestureSeekWidgetV3 inlineGestureSeekWidgetV3 = this.f77973n;
        if (inlineGestureSeekWidgetV3 != null) {
            return inlineGestureSeekWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
        return null;
    }

    public final void hidePreviewEnd() {
        this.f77974o.setVisibility(8);
        getGestureSeekWidget().setVisibility(0);
        this.f77966A = false;
    }

    public final void onAttach() {
        super.onAttach();
        showWidgets();
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131502208, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f77985z);
        this.f77983x.releaseAnim();
        this.f77984y.releaseAnim();
    }

    /* JADX WARN: Type inference failed for: r1v54, types: [com.bilibili.pegasus.holders.oversea.M] */
    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        this.h = view.findViewById(2131303659);
        this.f77968i = view.findViewById(2131303660);
        this.f77969j = view.findViewById(2131303667);
        this.f77970k = view.findViewById(2131299631);
        this.f77971l = view.findViewById(2131299632);
        this.f77972m = view.findViewById(2131303678);
        this.f77973n = view.findViewById(2131302160);
        this.f77979t = view.findViewById(2131297930);
        this.f77977r = view.findViewById(2131318539);
        View viewFindViewById = view.findViewById(2131308199);
        this.f77975p = (TintTextView) viewFindViewById.findViewById(2131308733);
        this.f77976q = (TintTextView) viewFindViewById.findViewById(2131301051);
        this.f77974o = viewFindViewById;
        this.f77980u = view.findViewById(2131303681);
        this.f77978s = view.findViewById(2131303658);
        InlineGestureSeekWidgetV3 gestureSeekWidget = getGestureSeekWidget();
        InlineGestureSeekGuideWidgetV3 inlineGestureSeekGuideWidgetV3 = this.f77980u;
        if (inlineGestureSeekGuideWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
            inlineGestureSeekGuideWidgetV3 = null;
        }
        gestureSeekWidget.setOnSeekStateChangeListener(inlineGestureSeekGuideWidgetV3.getSeekStateListener());
        ((Barrier) view.findViewById(2131297224)).setReferencedIds(new int[]{2131303667, 2131303678});
        View view2 = this.h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view2 = null;
        }
        View view3 = this.f77968i;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            view3 = null;
        }
        View view4 = this.f77970k;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            view4 = null;
        }
        View view5 = this.f77971l;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view5 = null;
        }
        View view6 = this.f77979t;
        View view7 = view6;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view7 = null;
        }
        this.f77981v = CollectionsKt.mutableListOf(new View[]{view2, view3, view4, view5, view7});
        View view8 = this.f77972m;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            view8 = null;
        }
        View danmaku = getDanmaku();
        View view9 = this.f77977r;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ogvBadge");
            view9 = null;
        }
        this.f77982w = CollectionsKt.mutableListOf(new View[]{view8, danmaku, view9});
        List<View> list = this.f77981v;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgets");
            list = null;
        }
        this.f77983x = new InlineAlphaAnim(0.0f, 0.0f, list, 300L, false, 19, (DefaultConstructorMarker) null);
        List<View> list2 = this.f77982w;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            list2 = null;
        }
        this.f77984y = new InlineAlphaAnim(1.0f, 0.5f, list2, 300L, false, 16, (DefaultConstructorMarker) null);
        final int i7 = 0;
        this.f77985z = new Runnable(this, i7) { // from class: com.bilibili.pegasus.holders.oversea.M

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77963a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77964b;

            {
                this.f77963a = i7;
                this.f77964b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f77963a) {
                    case 0:
                        N n7 = (N) this.f77964b;
                        InlineAlphaAnim inlineAlphaAnim = n7.f77983x;
                        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
                        if (inlineAlphaAnim == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
                            inlineAlphaAnim2 = null;
                        }
                        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim2, false, (Function0) null, 3, (Object) null);
                        InlineAlphaAnim inlineAlphaAnim3 = n7.f77984y;
                        InlineAlphaAnim inlineAlphaAnim4 = inlineAlphaAnim3;
                        if (inlineAlphaAnim3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideAnimation");
                            inlineAlphaAnim4 = null;
                        }
                        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim4, false, (Function0) null, 3, (Object) null);
                        break;
                    default:
                        Context context = (Context) this.f77964b;
                        Intent intent = new Intent(context, (Class<?>) NeulService.class);
                        intent.putExtra("action", 3);
                        if (context != null) {
                            try {
                                context.startService(intent);
                            } catch (Exception e7) {
                                return;
                            }
                        }
                        break;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void reset() {
        super.reset();
        hidePreviewEnd();
        List<View> list = this.f77981v;
        List<View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgets");
            list2 = null;
        }
        for (View view : list2) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
        }
        List<View> list3 = this.f77982w;
        List<View> list4 = list3;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            list4 = null;
        }
        for (View view2 : list4) {
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
        }
        getDanmaku().reset();
        RelativeLayout relativeLayout = this.f77980u;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(8);
        LinearLayout linearLayout = this.f77978s;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        ViewGroup viewGroup = this.f77977r;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ogvBadge");
            viewGroup = null;
        }
        viewGroup.setVisibility(8);
        Inline4GWarningWidgetV3 inline4GWarningWidgetV3 = this.f77978s;
        if (inline4GWarningWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            inline4GWarningWidgetV3 = null;
        }
        inline4GWarningWidgetV3.setOnClickListener(new Object());
        setOnClickListener(null);
        setOnLongClickListener(null);
        this.f77966A = false;
        TintTextView tintTextView = this.f77975p;
        if (tintTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endViewText");
            tintTextView = null;
        }
        tintTextView.setText(tintTextView.getContext().getString(2131845080));
        TintTextView tintTextView2 = this.f77976q;
        if (tintTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endViewGoDetail");
            tintTextView2 = null;
        }
        tintTextView2.setText(tintTextView2.getContext().getString(2131845206));
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
        if (this.f77966A) {
            return;
        }
        this.f77983x.startShowAnim();
        this.f77984y.startShowAnim();
        HandlerThreads.remove(0, this.f77985z);
        HandlerThreads.postDelayed(0, this.f77985z, com.bilibili.ogv.operation2.inlinevideo.v.f70979a);
    }
}
