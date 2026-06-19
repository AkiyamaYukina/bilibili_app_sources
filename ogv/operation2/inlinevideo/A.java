package com.bilibili.ogv.operation2.inlinevideo;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.Inline4GWarningWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineFullScreenWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekGuideWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.inline.panel.InlinePanel;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/A.class */
@StabilityInferred(parameters = 0)
public class A extends InlinePanel {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f70840E = 8;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f70841A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f70842B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    private final Handler f70843C = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    private final ICardPlaySateChangedCallback f70844D = new a(this);
    private InlineAvatarWidgetV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TintBadgeView f70845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InlineDanmakuWidgetV3 f70846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InlineMuteWidgetV3 f70847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InlineFullScreenWidgetV3 f70848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f70849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f70850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f70851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Inline4GWarningWidgetV3 f70852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private InlineGestureSeekWidget f70853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InlineGestureSeekGuideWidgetV3 f70854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f70855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f70856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private E f70857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<View> f70858v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<View> f70859w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private InlineAlphaAnim f70860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private InlineAlphaAnim f70861y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Runnable f70862z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/A$a.class */
    public static final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final A f70863a;

        public a(A a7) {
            this.f70863a = a7;
        }

        public void onCompleted(ICardPlayerContext iCardPlayerContext) {
            super.onCompleted(iCardPlayerContext);
            this.f70863a.showPreviewEnd();
        }

        public void onError(ICardPlayerContext iCardPlayerContext) {
            this.f70863a.hidePreviewEnd();
        }

        public void onPause(ICardPlayerContext iCardPlayerContext) {
            super.onPause(iCardPlayerContext);
            this.f70863a.hidePreviewEnd();
        }

        public void onResume(ICardPlayerContext iCardPlayerContext) {
            super.onResume(iCardPlayerContext);
            this.f70863a.hidePreviewEnd();
        }

        public void onStart(ICardPlayerContext iCardPlayerContext) {
            super.onStart(iCardPlayerContext);
            this.f70863a.hidePreviewEnd();
        }
    }

    private final void m() {
        Handler handler = this.f70843C;
        Runnable runnable = this.f70862z;
        Runnable runnable2 = runnable;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAnimationRunnable");
            runnable2 = null;
        }
        handler.removeCallbacks(runnable2);
        InlineAlphaAnim inlineAlphaAnim = this.f70860x;
        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
        if (inlineAlphaAnim == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
            inlineAlphaAnim2 = null;
        }
        inlineAlphaAnim2.releaseAnim();
        InlineAlphaAnim inlineAlphaAnim3 = this.f70861y;
        if (inlineAlphaAnim3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideAnimation");
            inlineAlphaAnim3 = null;
        }
        inlineAlphaAnim3.releaseAnim();
    }

    private final void t() {
        Handler handler = this.f70843C;
        Runnable runnable = this.f70862z;
        Runnable runnable2 = runnable;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAnimationRunnable");
            runnable2 = null;
        }
        handler.removeCallbacks(runnable2);
        Handler handler2 = this.f70843C;
        Runnable runnable3 = this.f70862z;
        if (runnable3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAnimationRunnable");
            runnable3 = null;
        }
        handler2.postDelayed(runnable3, v.f70979a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(A a7) {
        InlineAlphaAnim inlineAlphaAnim = a7.f70860x;
        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
        if (inlineAlphaAnim == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
            inlineAlphaAnim2 = null;
        }
        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim2, false, (Function0) null, 3, (Object) null);
        InlineAlphaAnim inlineAlphaAnim3 = a7.f70861y;
        InlineAlphaAnim inlineAlphaAnim4 = inlineAlphaAnim3;
        if (inlineAlphaAnim3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideAnimation");
            inlineAlphaAnim4 = null;
        }
        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim4, false, (Function0) null, 3, (Object) null);
    }

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
    public final TintBadgeView getBadge() {
        TintBadgeView tintBadgeView = this.f70845i;
        if (tintBadgeView != null) {
            return tintBadgeView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("badge");
        return null;
    }

    @NotNull
    public final InlineDanmakuWidgetV3 getDanmaku() {
        InlineDanmakuWidgetV3 inlineDanmakuWidgetV3 = this.f70846j;
        if (inlineDanmakuWidgetV3 != null) {
            return inlineDanmakuWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("danmaku");
        return null;
    }

    @NotNull
    public final Inline4GWarningWidgetV3 getInline4GWarningWidget() {
        Inline4GWarningWidgetV3 inline4GWarningWidgetV3 = this.f70852p;
        if (inline4GWarningWidgetV3 != null) {
            return inline4GWarningWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
        return null;
    }

    @NotNull
    public final View getOgvPreviewEndView() {
        View view = this.f70849m;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ogvPreviewEndView");
        return null;
    }

    @NotNull
    public final InlineGestureSeekGuideWidgetV3 getSeekGuideWidget() {
        InlineGestureSeekGuideWidgetV3 inlineGestureSeekGuideWidgetV3 = this.f70854r;
        if (inlineGestureSeekGuideWidgetV3 != null) {
            return inlineGestureSeekGuideWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
        return null;
    }

    public final void hidePreviewEnd() {
        getOgvPreviewEndView().setVisibility(8);
        q().setVisibility(0);
        this.f70841A = false;
    }

    @NotNull
    public final TextView n() {
        TextView textView = this.f70851o;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endViewGoDetail");
        return null;
    }

    @NotNull
    public final TextView o() {
        TextView textView = this.f70850n;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endViewText");
        return null;
    }

    public void onAttach() {
        super.onAttach();
        showWidgets();
    }

    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131499594, (ViewGroup) null);
    }

    public void onDetach() {
        super.onDetach();
        m();
    }

    public void onViewCreated(@NotNull View view) {
        List<View> listMutableListOf;
        super.onViewCreated(view);
        this.h = view.findViewById(2131303659);
        this.f70845i = view.findViewById(2131303660);
        this.f70846j = view.findViewById(2131303667);
        this.f70847k = view.findViewById(2131303678);
        this.f70848l = view.findViewById(2131303668);
        this.f70855s = view.findViewById(2131297930);
        x((LinearLayout) view.findViewById(2131305038));
        View viewFindViewById = view.findViewById(2131308199);
        this.f70850n = (TextView) viewFindViewById.findViewById(2131308733);
        this.f70851o = (TextView) viewFindViewById.findViewById(2131301051);
        this.f70849m = viewFindViewById;
        this.f70852p = view.findViewById(2131303658);
        this.f70853q = (InlineGestureSeekWidget) view.findViewById(2131302160);
        this.f70854r = view.findViewById(2131303681);
        q().setOnSeekStateChangeListener(getSeekGuideWidget().getSeekStateListener());
        if (u()) {
            View avatar = getAvatar();
            View badge = getBadge();
            View view2 = this.f70855s;
            View view3 = view2;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomShadow");
                view3 = null;
            }
            listMutableListOf = CollectionsKt.mutableListOf(new View[]{avatar, badge, view3});
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(new View[]{getAvatar(), getBadge()});
        }
        this.f70858v = listMutableListOf;
        this.f70859w = CollectionsKt.mutableListOf(new View[]{s(), getDanmaku(), p()});
        List<View> list = this.f70858v;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgets");
            list = null;
        }
        this.f70860x = new InlineAlphaAnim(0.0f, 0.0f, list, 300L, false, 19, (DefaultConstructorMarker) null);
        List<View> list2 = this.f70859w;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("halfHideWidgets");
            list2 = null;
        }
        this.f70861y = new InlineAlphaAnim(1.0f, 0.5f, list2, 300L, false, 16, (DefaultConstructorMarker) null);
        final int i7 = 0;
        this.f70862z = new Runnable(this, i7) { // from class: com.bilibili.ogv.operation2.inlinevideo.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f70993a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f70994b;

            {
                this.f70993a = i7;
                this.f70994b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f70993a) {
                    case 0:
                        A.v((A) this.f70994b);
                        break;
                    default:
                        ((com.bilibili.lib.bilipay.ui.recharge.v2.o) this.f70994b).invoke();
                        break;
                }
            }
        };
    }

    @NotNull
    public final InlineFullScreenWidgetV3 p() {
        InlineFullScreenWidgetV3 inlineFullScreenWidgetV3 = this.f70848l;
        if (inlineFullScreenWidgetV3 != null) {
            return inlineFullScreenWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
        return null;
    }

    @NotNull
    public final InlineGestureSeekWidget q() {
        InlineGestureSeekWidget inlineGestureSeekWidget = this.f70853q;
        if (inlineGestureSeekWidget != null) {
            return inlineGestureSeekWidget;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
        return null;
    }

    @NotNull
    public final LinearLayout r() {
        LinearLayout linearLayout = this.f70856t;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linActionWrapper");
        return null;
    }

    public void reset() {
        super.reset();
        hidePreviewEnd();
        List<View> list = this.f70858v;
        List<View> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completeHideWidgets");
            list2 = null;
        }
        for (View view : list2) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
        }
        List<View> list3 = this.f70859w;
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
        getInline4GWarningWidget().setVisibility(8);
        setOnClickListener(null);
        setOnLongClickListener(null);
        this.f70841A = false;
        TextView textViewO = o();
        textViewO.setText(textViewO.getContext().getString(2131821974));
        TextView textViewN = n();
        textViewN.setText(textViewN.getContext().getString(2131821973));
    }

    @NotNull
    public final InlineMuteWidgetV3 s() {
        InlineMuteWidgetV3 inlineMuteWidgetV3 = this.f70847k;
        if (inlineMuteWidgetV3 != null) {
            return inlineMuteWidgetV3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mute");
        return null;
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        q().setOnClickListener(onClickListener);
    }

    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        q().setOnLongClickListener(onLongClickListener);
    }

    public final void setSupportShowEndPage(boolean z6) {
        removeCardPlayStateChangedCallback(this.f70844D);
        if (z6) {
            addCardPlayStateChangedCallback(this.f70844D);
        }
    }

    public final void showPreviewEnd() {
        getOgvPreviewEndView().setVisibility(0);
        q().setVisibility(8);
        this.f70841A = true;
    }

    public final void showWidgets() {
        if (this.f70841A) {
            return;
        }
        InlineAlphaAnim inlineAlphaAnim = this.f70860x;
        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
        if (inlineAlphaAnim == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
            inlineAlphaAnim2 = null;
        }
        inlineAlphaAnim2.startShowAnim();
        InlineAlphaAnim inlineAlphaAnim3 = this.f70861y;
        if (inlineAlphaAnim3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideAnimation");
            inlineAlphaAnim3 = null;
        }
        inlineAlphaAnim3.startShowAnim();
        t();
        E e7 = this.f70857u;
        if (e7 == null) {
            this.f70842B = true;
            return;
        }
        this.f70842B = false;
        if (e7 != null) {
            e7.onWidgetShow();
        }
    }

    public boolean u() {
        return true;
    }

    public final void w(int i7) {
        q().setFakeStartProgress(i7);
    }

    public final void x(@NotNull LinearLayout linearLayout) {
        this.f70856t = linearLayout;
    }

    public final void y(@NotNull E e7) {
        this.f70857u = e7;
        if (this.f70842B) {
            e7.onWidgetShow();
            this.f70842B = false;
        }
    }

    public final void z(int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r().getLayoutParams();
        marginLayoutParams.bottomMargin = i7;
        r().setLayoutParams(marginLayoutParams);
    }
}
