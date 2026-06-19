package com.bilibili.search2.panel;

import Pb1.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.view.InlineLiveBadgeWidget;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.widget.SearchInline4GWarningWidgetV3;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ogv.operation2.inlinevideo.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.auth.modify.BaseAuthModifyFragment;
import tv.danmaku.bili.auth.modify.BiliAuthNewNameFragment;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/panel/b.class */
@StabilityInferred(parameters = 0)
public final class b extends InlinePanel {
    public InlineAvatarWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TintBadgeView f86955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VectorTextView f86956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VectorTextView f86957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InlineMuteWidgetV3 f86958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InlineDanmakuWidgetV3 f86959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InlineLiveBadgeWidget f86960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SearchInline4GWarningWidgetV3 f86961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f86962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ArrayList<View> f86963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<? extends View> f86964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InlineAlphaAnim f86965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InlineAlphaAnim f86966t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f86967u;

    @NotNull
    public final InlineAvatarWidgetV3 getAvatar() {
        InlineAvatarWidgetV3 inlineAvatarWidgetV3 = this.h;
        if (inlineAvatarWidgetV3 != null) {
            return inlineAvatarWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("avatar");
        return null;
    }

    @NotNull
    public final VectorTextView getCoverLeftText1() {
        VectorTextView vectorTextView = this.f86956j;
        if (vectorTextView != null) {
            return vectorTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
        return null;
    }

    @NotNull
    public final InlineDanmakuWidgetV3 getDanmaku() {
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = this.f86959m;
        if (inlineDanmakuWidgetV3 != null) {
            return inlineDanmakuWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmaku");
        return null;
    }

    @NotNull
    public final SearchInline4GWarningWidgetV3 l() {
        SearchInline4GWarningWidgetV3 searchInline4GWarningWidgetV3 = this.f86961o;
        if (searchInline4GWarningWidgetV3 != null) {
            return searchInline4GWarningWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
        return null;
    }

    public final void m(@NotNull View view) {
        ArrayList<View> arrayList = this.f86963q;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<View> arrayList2 = this.f86963q;
        if (arrayList2 != null) {
            InlineAlphaAnim inlineAlphaAnim = this.f86965s;
            InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
            if (inlineAlphaAnim == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
                inlineAlphaAnim2 = null;
            }
            inlineAlphaAnim2.replaceViews(arrayList2);
        }
    }

    public final void onAttach() {
        super.onAttach();
        showWidgets();
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131495562, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f86967u);
        this.f86965s.releaseAnim();
        this.f86966t.releaseAnim();
    }

    /* JADX WARN: Type inference failed for: r1v39, types: [com.bilibili.search2.panel.a] */
    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        this.h = view.findViewById(2131303659);
        this.f86955i = view.findViewById(2131303660);
        this.f86956j = view.findViewById(2131299631);
        this.f86957k = view.findViewById(2131299632);
        this.f86958l = view.findViewById(2131303678);
        this.f86959m = view.findViewById(2131303667);
        this.f86962p = view.findViewById(2131297930);
        this.f86960n = view.findViewById(2131303674);
        this.f86961o = view.findViewById(2131303658);
        View avatar = getAvatar();
        View view2 = this.f86955i;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            view2 = null;
        }
        View coverLeftText1 = getCoverLeftText1();
        View view3 = this.f86957k;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view3 = null;
        }
        View view4 = this.f86962p;
        View view5 = view4;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view5 = null;
        }
        View view6 = this.f86960n;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveBadge");
            view6 = null;
        }
        ArrayList<View> arrayListArrayListOf = CollectionsKt.arrayListOf(new View[]{avatar, view2, coverLeftText1, view3, view5, view6});
        this.f86965s = new InlineAlphaAnim(0.0f, 0.0f, arrayListArrayListOf, 300L, false, 19, (DefaultConstructorMarker) null);
        this.f86963q = arrayListArrayListOf;
        View view7 = this.f86958l;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            view7 = null;
        }
        List<? extends View> listListOf = CollectionsKt.listOf(new View[]{view7, getDanmaku()});
        this.f86964r = listListOf;
        if (listListOf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            listListOf = null;
        }
        this.f86966t = new InlineAlphaAnim(1.0f, 0.5f, listListOf, 300L, false, 16, (DefaultConstructorMarker) null);
        final int i7 = 0;
        this.f86967u = new Runnable(this, i7) { // from class: com.bilibili.search2.panel.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f86953a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f86954b;

            {
                this.f86953a = i7;
                this.f86954b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f86953a) {
                    case 0:
                        b bVar = (b) this.f86954b;
                        InlineAlphaAnim inlineAlphaAnim = bVar.f86965s;
                        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
                        if (inlineAlphaAnim == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
                            inlineAlphaAnim2 = null;
                        }
                        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim2, false, (Function0) null, 3, (Object) null);
                        InlineAlphaAnim inlineAlphaAnim3 = bVar.f86966t;
                        InlineAlphaAnim inlineAlphaAnim4 = inlineAlphaAnim3;
                        if (inlineAlphaAnim3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideAnimation");
                            inlineAlphaAnim4 = null;
                        }
                        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim4, false, (Function0) null, 3, (Object) null);
                        break;
                    default:
                        BiliAuthNewNameFragment biliAuthNewNameFragment = (BiliAuthNewNameFragment) this.f86954b;
                        m mVar = biliAuthNewNameFragment.E;
                        if (mVar != null) {
                            mVar.b();
                        }
                        biliAuthNewNameFragment.pf(biliAuthNewNameFragment.getContext(), biliAuthNewNameFragment, new RouteRequest.Builder(((BaseAuthModifyFragment) biliAuthNewNameFragment).b).build(), "BiliAuthModifySuccessFragment");
                        break;
                }
            }
        };
    }

    public final void reset() {
        super.reset();
        ArrayList<View> arrayList = this.f86963q;
        if (arrayList != null) {
            for (View view : arrayList) {
                view.setVisibility(0);
                view.setAlpha(1.0f);
            }
        }
        List<? extends View> list = this.f86964r;
        List<? extends View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            list2 = null;
        }
        for (View view2 : list2) {
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
        }
        setOnClickListener((View.OnClickListener) null);
        setOnLongClickListener((View.OnLongClickListener) null);
        l().setVisibility(8);
        getDanmaku().reset();
    }

    public final void setNetAlertEnable(boolean z6) {
        ICardPlayerContext cardPlayerContext = getCardPlayerContext();
        if (cardPlayerContext != null) {
            cardPlayerContext.setNetworkAlertEnable(z6);
        }
    }

    public final void showWidgets() {
        this.f86965s.startShowAnim();
        this.f86966t.startShowAnim();
        HandlerThreads.remove(0, this.f86967u);
        HandlerThreads.postDelayed(0, this.f86967u, v.f70979a);
    }
}
