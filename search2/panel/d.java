package com.bilibili.search2.panel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.view.InlineLiveBadgeWidget;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.widget.SearchInline4GWarningWidgetV3;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.ogv.operation2.inlinevideo.v;
import java.util.ArrayList;
import java.util.List;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.auth.modify.BiliAuthNewNameFragment;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/panel/d.class */
@StabilityInferred(parameters = 0)
public final class d extends InlinePanel {
    public InlineAvatarWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TintBadgeView f86970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VectorTextView f86971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VectorTextView f86972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InlineMuteWidgetV3 f86973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InlineLiveBadgeWidget f86974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SearchInline4GWarningWidgetV3 f86975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f86976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ArrayList<View> f86977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<? extends View> f86978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InlineAlphaAnim f86979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InlineAlphaAnim f86980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f86981t;

    public final void onAttach() {
        super.onAttach();
        showWidgets();
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131495538, (ViewGroup) null);
    }

    public final void onDetach() {
        super.onDetach();
        HandlerThreads.remove(0, this.f86981t);
        this.f86979r.releaseAnim();
        this.f86980s.releaseAnim();
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [com.bilibili.search2.panel.c] */
    public final void onViewCreated(@NotNull View view) {
        super.onViewCreated(view);
        this.h = view.findViewById(2131303659);
        this.f86970i = view.findViewById(2131303660);
        this.f86971j = view.findViewById(2131299631);
        this.f86972k = view.findViewById(2131299632);
        this.f86973l = view.findViewById(2131303678);
        this.f86976o = view.findViewById(2131297930);
        this.f86974m = view.findViewById(2131303674);
        this.f86975n = view.findViewById(2131303658);
        View view2 = this.h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            view2 = null;
        }
        View view3 = this.f86970i;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            view3 = null;
        }
        View view4 = this.f86971j;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            view4 = null;
        }
        View view5 = this.f86972k;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            view5 = null;
        }
        View view6 = this.f86976o;
        View view7 = view6;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
            view7 = null;
        }
        View view8 = this.f86974m;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveBadge");
            view8 = null;
        }
        ArrayList<View> arrayListArrayListOf = CollectionsKt.arrayListOf(new View[]{view2, view3, view4, view5, view7, view8});
        this.f86979r = new InlineAlphaAnim(0.0f, 0.0f, arrayListArrayListOf, 300L, false, 19, (DefaultConstructorMarker) null);
        this.f86977p = arrayListArrayListOf;
        InlineMuteWidgetV3 inlineMuteWidgetV3 = this.f86973l;
        if (inlineMuteWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV3 = null;
        }
        List<? extends View> listListOf = CollectionsKt.listOf(inlineMuteWidgetV3);
        this.f86978q = listListOf;
        if (listListOf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            listListOf = null;
        }
        this.f86980s = new InlineAlphaAnim(1.0f, 0.5f, listListOf, 300L, false, 16, (DefaultConstructorMarker) null);
        final int i7 = 0;
        this.f86981t = new Runnable(this, i7) { // from class: com.bilibili.search2.panel.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f86968a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f86969b;

            {
                this.f86968a = i7;
                this.f86969b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f86968a) {
                    case 0:
                        d dVar = (d) this.f86969b;
                        InlineAlphaAnim inlineAlphaAnim = dVar.f86979r;
                        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
                        if (inlineAlphaAnim == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
                            inlineAlphaAnim2 = null;
                        }
                        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim2, false, (Function0) null, 3, (Object) null);
                        InlineAlphaAnim inlineAlphaAnim3 = dVar.f86980s;
                        InlineAlphaAnim inlineAlphaAnim4 = inlineAlphaAnim3;
                        if (inlineAlphaAnim3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideAnimation");
                            inlineAlphaAnim4 = null;
                        }
                        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim4, false, (Function0) null, 3, (Object) null);
                        break;
                    case 1:
                        View view9 = ((com.bilibili.chatroom.widget.a) this.f86969b).d;
                        View view10 = view9;
                        if (view9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                            view10 = null;
                        }
                        view10.getHeight();
                        break;
                    case 2:
                        BiliAuthNewNameFragment biliAuthNewNameFragment = (BiliAuthNewNameFragment) this.f86969b;
                        EditText editText = biliAuthNewNameFragment.u;
                        if (editText != null && !editText.isFocused()) {
                            InputMethodManagerHelper.hideSoftInput(biliAuthNewNameFragment.m4405getActivity(), biliAuthNewNameFragment.getView(), 0);
                            Button button = biliAuthNewNameFragment.w;
                            if (button != null) {
                                button.setEnabled(biliAuthNewNameFragment.tf());
                            }
                            break;
                        }
                        break;
                    default:
                        ((Function0) this.f86969b).invoke();
                        break;
                }
            }
        };
    }

    public final void reset() {
        super.reset();
        ArrayList<View> arrayList = this.f86977p;
        if (arrayList != null) {
            for (View view : arrayList) {
                view.setVisibility(0);
                view.setAlpha(1.0f);
            }
        }
        List<? extends View> list = this.f86978q;
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
        LinearLayout linearLayout = this.f86975n;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
    }

    public final void showWidgets() {
        this.f86979r.startShowAnim();
        this.f86980s.startShowAnim();
        HandlerThreads.remove(0, this.f86981t);
        HandlerThreads.postDelayed(0, this.f86981t, v.f70979a);
    }
}
