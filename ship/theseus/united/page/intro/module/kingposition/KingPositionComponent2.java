package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import OS0.D0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.databinding.ViewDataBinding;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.playerbizcommon.utils.BezierInterpolator;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.bilibili.playerbizcommon.view.TextSwitcherWithOptionAnimation;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.widget.DetailsShareAnimViewV2;
import com.bilibili.studio.module.tuwen.util.BcutVideoClipCropUtil;
import dv0.Q;
import dv0.S;
import dv0.T;
import dv0.U;
import dv0.V;
import dv0.W;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2.class */
@StabilityInferred(parameters = 0)
public final class KingPositionComponent2 implements UIComponent<UIComponent.b<LinearLayout>> {
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KingPositionService.d f100240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a.C1003a f100241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<KingPositionService.a> f100242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f100243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<UIComponent<?>, UIComponent.ViewEntry> f100244e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<c> f100245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow<c> f100246g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$CoinComponent.class */
    @StabilityInferred(parameters = 0)
    public static final class CoinComponent extends com.bilibili.app.gemini.ui.m<Q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final KingPositionService.d f100247a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$CoinComponent$a.class */
        public static final class a implements InterfaceC6294h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TintImageView f100248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextSwitcherWithOptionAnimation f100249b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CoinComponent f100250c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Context f100251d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final LinearLayout f100252e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final RingProgressBar f100253f;

            public a(TintImageView tintImageView, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, CoinComponent coinComponent, Context context, LinearLayout linearLayout, RingProgressBar ringProgressBar) {
                this.f100248a = tintImageView;
                this.f100249b = textSwitcherWithOptionAnimation;
                this.f100250c = coinComponent;
                this.f100251d = context;
                this.f100252e = linearLayout;
                this.f100253f = ringProgressBar;
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6294h
            public final void a() {
                CoinComponent.d(this.f100248a, this.f100249b, this.f100250c, this.f100251d, this.f100252e);
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6294h
            public final void b() {
                TintImageView tintImageView = this.f100248a;
                if (tintImageView == null) {
                    return;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tintImageView, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 1.0f, 1.2f, 0.9f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tintImageView, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 1.0f, 1.2f, 0.9f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(500L);
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet.start();
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6294h
            public final void c() {
                this.f100253f.c();
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6294h
            public final void d() {
                this.f100253f.b();
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6294h
            public final void e() {
                this.f100253f.a();
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6294h
            public final boolean f() {
                return this.f100253f.f80366m.isRunning();
            }
        }

        public CoinComponent(@NotNull KingPositionService.d dVar) {
            this.f100247a = dVar;
        }

        public static final void d(TintImageView tintImageView, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, CoinComponent coinComponent, Context context, LinearLayout linearLayout) {
            int i7 = KingPositionComponent2.h;
            boolean zA = coinComponent.f100247a.a();
            KingPositionService.d dVar = coinComponent.f100247a;
            b.d(tintImageView, textSwitcherWithOptionAnimation, 2131236755, zA, dVar.e(), coinComponent.f100247a);
            textSwitcherWithOptionAnimation.setTextWithoutAnimation(NumberFormat_androidKt.format$default(Long.valueOf(dVar.d()), context.getString(2131846964), 0, 2, (Object) null));
            b.c(linearLayout, dVar.d(), context.getString(2131846964), dVar.a());
        }

        public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            Q qInflate = Q.inflate(layoutInflater, viewGroup, false);
            int i7 = KingPositionComponent2.h;
            qInflate.f116842c.setFactory(new C6292f(context));
            TranslateAnimation translateAnimationA = b.a();
            TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation = qInflate.f116842c;
            textSwitcherWithOptionAnimation.setOptionInAnimation(translateAnimationA);
            textSwitcherWithOptionAnimation.setOptionOutAnimation(b.b());
            return qInflate;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.Q r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.CoinComponent.a(dv0.Q, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$CommandDanmakuComponent.class */
    @StabilityInferred(parameters = 0)
    public static final class CommandDanmakuComponent extends com.bilibili.app.gemini.ui.m<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final KingPositionService.d f100254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f100255b = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new HT0.e(this, 1));

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$CommandDanmakuComponent$a.class */
        public static final class a implements InterfaceC6295i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextView f100256a;

            public a(TextView textView) {
                this.f100256a = textView;
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6295i
            public final void a(String str) {
                if (StringsKt.isBlank(str)) {
                    return;
                }
                this.f100256a.setText(str);
            }
        }

        public CommandDanmakuComponent(@NotNull KingPositionService.d dVar) {
            this.f100254a = dVar;
        }

        public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return S.inflate(layoutInflater, viewGroup, false);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.S r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                Method dump skipped, instruction units count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.CommandDanmakuComponent.a(dv0.S, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$DisLikeComponent.class */
    @StabilityInferred(parameters = 0)
    public static final class DisLikeComponent extends com.bilibili.app.gemini.ui.m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final KingPositionService.d f100257a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$DisLikeComponent$a.class */
        public static final class a implements InterfaceC6296j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TintImageView f100258a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextView f100259b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final DisLikeComponent f100260c;

            public a(TintImageView tintImageView, TextView textView, DisLikeComponent disLikeComponent) {
                this.f100258a = tintImageView;
                this.f100259b = textView;
                this.f100260c = disLikeComponent;
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6296j
            public final void a() {
                TextView textView = this.f100259b;
                TintImageView tintImageView = this.f100258a;
                int i7 = KingPositionComponent2.h;
                DisLikeComponent disLikeComponent = this.f100260c;
                b.d(tintImageView, textView, 2131236756, disLikeComponent.f100257a.h.h.h(), disLikeComponent.f100257a.f(), disLikeComponent.f100257a);
            }
        }

        public DisLikeComponent(@NotNull KingPositionService.d dVar) {
            this.f100257a = dVar;
        }

        public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return T.inflate(layoutInflater, viewGroup, false);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.DisLikeComponent.a(dv0.T, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$FavoriteComponent.class */
    @StabilityInferred(parameters = 0)
    public static final class FavoriteComponent extends com.bilibili.app.gemini.ui.m<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final KingPositionService.d f100261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableSharedFlow<c> f100262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<KingPositionService.a> f100263c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$FavoriteComponent$a.class */
        public static final class a implements InterfaceC6297k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TintImageView f100264a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextSwitcherWithOptionAnimation f100265b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final FavoriteComponent f100266c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Context f100267d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final LinearLayout f100268e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final RingProgressBar f100269f;

            public a(TintImageView tintImageView, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, FavoriteComponent favoriteComponent, Context context, LinearLayout linearLayout, RingProgressBar ringProgressBar) {
                this.f100264a = tintImageView;
                this.f100265b = textSwitcherWithOptionAnimation;
                this.f100266c = favoriteComponent;
                this.f100267d = context;
                this.f100268e = linearLayout;
                this.f100269f = ringProgressBar;
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6297k
            public final void a() {
                FavoriteComponent.d(this.f100264a, this.f100265b, this.f100266c, this.f100267d, this.f100268e);
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6297k
            public final void b() {
                TintImageView tintImageView = this.f100264a;
                if (tintImageView == null) {
                    return;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tintImageView, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 1.0f, 1.2f, 0.9f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tintImageView, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 1.0f, 1.2f, 0.9f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(500L);
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet.start();
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6297k
            public final void c() {
                this.f100269f.c();
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6297k
            public final void d() {
                this.f100269f.b();
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6297k
            public final void e() {
                this.f100269f.a();
            }
        }

        public FavoriteComponent(@NotNull KingPositionService.d dVar, @NotNull MutableSharedFlow mutableSharedFlow, @NotNull StateFlow stateFlow) {
            this.f100261a = dVar;
            this.f100262b = mutableSharedFlow;
            this.f100263c = stateFlow;
        }

        public static final void d(TintImageView tintImageView, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, FavoriteComponent favoriteComponent, Context context, LinearLayout linearLayout) {
            int i7 = KingPositionComponent2.h;
            boolean zB = favoriteComponent.f100261a.b();
            KingPositionService.d dVar = favoriteComponent.f100261a;
            C6289c c6289c = (C6289c) ((LinkedHashMap) dVar.f100413a.f100470a).get(KingPositionType.FAVORITE);
            b.d(tintImageView, textSwitcherWithOptionAnimation, 2131236759, zB, c6289c != null ? c6289c.f100459b : false, favoriteComponent.f100261a);
            textSwitcherWithOptionAnimation.setTextWithoutAnimation(NumberFormat_androidKt.format$default(Long.valueOf(dVar.i()), context.getString(2131846948), 0, 2, (Object) null));
            b.c(linearLayout, dVar.i(), context.getString(2131846948), dVar.b());
        }

        public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            U uInflate = U.inflate(LayoutInflater.from(context), viewGroup, false);
            int i7 = KingPositionComponent2.h;
            uInflate.f116854c.setFactory(new C6292f(context));
            TranslateAnimation translateAnimationA = b.a();
            TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation = uInflate.f116854c;
            textSwitcherWithOptionAnimation.setOptionInAnimation(translateAnimationA);
            textSwitcherWithOptionAnimation.setOptionOutAnimation(b.b());
            return uInflate;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.U r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws kotlin.KotlinNothingValueException {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.FavoriteComponent.a(dv0.U, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$LikeComponent.class */
    @StabilityInferred(parameters = 0)
    public static final class LikeComponent extends com.bilibili.app.gemini.ui.m<V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f100272g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final KingPositionService.d f100273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableSharedFlow<c> f100274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<KingPositionService.a> f100275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public xh1.a f100276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public wh1.f f100277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final D0 f100278f = new D0(this, 1);

        public LikeComponent(@NotNull KingPositionService.d dVar, @NotNull MutableSharedFlow mutableSharedFlow, @NotNull StateFlow stateFlow) {
            this.f100273a = dVar;
            this.f100274b = mutableSharedFlow;
            this.f100275c = stateFlow;
        }

        public static final void c(LikeComponent likeComponent, TintImageView tintImageView, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, Context context, LinearLayout linearLayout) {
            Drawable drawableJ = likeComponent.f100273a.j();
            KingPositionService.d dVar = likeComponent.f100273a;
            if (drawableJ != null) {
                int i7 = KingPositionComponent2.h;
                b.e(tintImageView, textSwitcherWithOptionAnimation, drawableJ, dVar.c(), dVar.g(), likeComponent.f100273a);
            } else {
                int i8 = KingPositionComponent2.h;
                b.d(tintImageView, textSwitcherWithOptionAnimation, 2131236760, dVar.c(), dVar.g(), likeComponent.f100273a);
            }
            textSwitcherWithOptionAnimation.setTextWithoutAnimation(NumberFormat_androidKt.format$default(Long.valueOf(dVar.k()), context.getString(2131841358), 0, 2, (Object) null));
            b.c(linearLayout, dVar.k(), context.getString(2131841358), dVar.c());
        }

        public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            V vInflate = V.inflate(LayoutInflater.from(context), viewGroup, false);
            int i7 = KingPositionComponent2.h;
            vInflate.f116860d.setFactory(new C6292f(context));
            TranslateAnimation translateAnimationA = b.a();
            TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation = vInflate.f116860d;
            textSwitcherWithOptionAnimation.setOptionInAnimation(translateAnimationA);
            textSwitcherWithOptionAnimation.setOptionOutAnimation(b.b());
            return vInflate;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.V r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws kotlin.KotlinNothingValueException {
            /*
                r11 = this;
                r0 = r13
                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$1
                if (r0 == 0) goto L29
                r0 = r13
                com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$1 r0 = (com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$1) r0
                r15 = r0
                r0 = r15
                int r0 = r0.label
                r14 = r0
                r0 = r14
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L29
                r0 = r15
                r1 = r14
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r15
                r13 = r0
                goto L33
            L29:
                com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$1 r0 = new com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$1
                r1 = r0
                r2 = r11
                r3 = r13
                r1.<init>(r2, r3)
                r13 = r0
            L33:
                r0 = r13
                java.lang.Object r0 = r0.result
                r16 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r15 = r0
                r0 = r13
                int r0 = r0.label
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L5e
                r0 = r14
                r1 = 1
                if (r0 == r1) goto L56
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L56:
                r0 = r16
                kotlin.ResultKt.throwOnFailure(r0)
                goto L9d
            L5e:
                r0 = r16
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r12
                android.widget.LinearLayout r0 = r0.f116857a
                r17 = r0
                r0 = r17
                android.content.Context r0 = r0.getContext()
                r16 = r0
                com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$2 r0 = new com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$LikeComponent$bind$2
                r1 = r0
                r2 = r12
                android.widget.LinearLayout r2 = r2.f116858b
                r3 = r11
                r4 = r12
                r5 = r12
                com.bilibili.magicasakura.widgets.TintImageView r5 = r5.f116859c
                r6 = r12
                com.bilibili.playerbizcommon.view.TextSwitcherWithOptionAnimation r6 = r6.f116860d
                r7 = r16
                r8 = r17
                r9 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                r12 = r0
                r0 = r13
                r1 = 1
                r0.label = r1
                r0 = r12
                r1 = r13
                java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
                r1 = r15
                if (r0 != r1) goto L9d
                r0 = r15
                return r0
            L9d:
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r1 = r0
                r1.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.LikeComponent.a(dv0.V, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final void e() {
            wh1.f fVar;
            wh1.f fVar2 = this.f100277e;
            if (fVar2 != null && fVar2.isShowing() && (fVar = this.f100277e) != null) {
                fVar.dismiss();
            }
            this.f100277e = null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$ShareComponent.class */
    @StabilityInferred(parameters = 0)
    public static final class ShareComponent extends com.bilibili.app.gemini.ui.m<W> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final KingPositionService.d f100287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableSharedFlow<c> f100288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<KingPositionService.a> f100289c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$ShareComponent$a.class */
        public static final class a implements InterfaceC6299m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailsShareAnimViewV2 f100290a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextSwitcherWithOptionAnimation f100291b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ShareComponent f100292c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Context f100293d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final LinearLayout f100294e;

            public a(Context context, LinearLayout linearLayout, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, ShareComponent shareComponent, DetailsShareAnimViewV2 detailsShareAnimViewV2) {
                this.f100290a = detailsShareAnimViewV2;
                this.f100291b = textSwitcherWithOptionAnimation;
                this.f100292c = shareComponent;
                this.f100293d = context;
                this.f100294e = linearLayout;
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6299m
            public final void a() {
                ShareComponent.d(this.f100293d, this.f100294e, this.f100291b, this.f100292c, this.f100290a);
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.InterfaceC6299m
            public final void b() {
                DetailsShareAnimViewV2.a aVar = this.f100290a.h;
                if (aVar != null) {
                    aVar.b();
                }
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$ShareComponent$b.class */
        public static final class b implements DetailsShareAnimViewV2.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ShareComponent f100295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DetailsShareAnimViewV2 f100296b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextSwitcherWithOptionAnimation f100297c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Context f100298d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final LinearLayout f100299e;

            public b(Context context, LinearLayout linearLayout, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, ShareComponent shareComponent, DetailsShareAnimViewV2 detailsShareAnimViewV2) {
                this.f100295a = shareComponent;
                this.f100296b = detailsShareAnimViewV2;
                this.f100297c = textSwitcherWithOptionAnimation;
                this.f100298d = context;
                this.f100299e = linearLayout;
            }

            @Override // com.bilibili.ship.theseus.united.widget.DetailsShareAnimViewV2.a
            public final void a() {
                KingPositionService.d dVar = this.f100295a.f100287a;
                C6289c c6289c = (C6289c) ((LinkedHashMap) dVar.f100413a.f100470a).get(KingPositionType.SHARE);
                if (c6289c == null) {
                    return;
                }
                if (!dVar.h()) {
                    KingPositionService kingPositionService = dVar.h;
                    kingPositionService.f100381l.f126351b.tryEmit(Unit.INSTANCE);
                    PageReportService.g(kingPositionService.f100389t, "united.player-video-detail.user-action.share.click", null, 6);
                } else {
                    String str = c6289c.f100460c;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    com.bilibili.ship.theseus.united.utils.q.c(str2);
                }
            }

            @Override // com.bilibili.ship.theseus.united.widget.DetailsShareAnimViewV2.a
            public final void b() {
                ShareComponent.d(this.f100298d, this.f100299e, this.f100297c, this.f100295a, this.f100296b);
            }
        }

        public ShareComponent(@NotNull KingPositionService.d dVar, @NotNull MutableSharedFlow mutableSharedFlow, @NotNull StateFlow stateFlow) {
            this.f100287a = dVar;
            this.f100288b = mutableSharedFlow;
            this.f100289c = stateFlow;
        }

        public static final void d(Context context, LinearLayout linearLayout, TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation, ShareComponent shareComponent, DetailsShareAnimViewV2 detailsShareAnimViewV2) {
            int i7 = KingPositionComponent2.h;
            b.d(detailsShareAnimViewV2, textSwitcherWithOptionAnimation, 2131236761, false, shareComponent.f100287a.h(), shareComponent.f100287a);
            KingPositionService.d dVar = shareComponent.f100287a;
            textSwitcherWithOptionAnimation.setTextWithoutAnimation(NumberFormat_androidKt.format$default(Long.valueOf(dVar.l()), context.getString(2131841574), 0, 2, (Object) null));
            b.c(linearLayout, dVar.l(), context.getString(2131841574), false);
        }

        public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            W wInflate = W.inflate(LayoutInflater.from(context), viewGroup, false);
            int i7 = KingPositionComponent2.h;
            wInflate.f116864d.setFactory(new C6292f(context));
            TranslateAnimation translateAnimationA = b.a();
            TextSwitcherWithOptionAnimation textSwitcherWithOptionAnimation = wInflate.f116864d;
            textSwitcherWithOptionAnimation.setOptionInAnimation(translateAnimationA);
            textSwitcherWithOptionAnimation.setOptionOutAnimation(b.b());
            return wInflate;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.W r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws kotlin.KotlinNothingValueException {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.ShareComponent.a(dv0.W, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends DataBindingComponent<dv0.O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C1003a f100300a;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C1003a extends androidx.databinding.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Se.a f100301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f100302b = true;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f100303c = true;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f100304d = true;

            public C1003a(@NotNull Se.a aVar) {
                this.f100301a = aVar;
            }
        }

        public a(@NotNull C1003a c1003a) {
            this.f100300a = c1003a;
        }

        public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
            dv0.O o7 = (dv0.O) viewDataBinding;
            o7.q(this.f100300a);
            o7.executePendingBindings();
            return Unit.INSTANCE;
        }

        public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return dv0.O.inflate(layoutInflater, viewGroup, false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$b.class */
    public static final class b {
        public static final TranslateAnimation a() {
            int i7 = KingPositionComponent2.h;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setInterpolator(new BezierInterpolator(0.33f, 0.0f, 0.0f, 1.0f));
            translateAnimation.setDuration(800L);
            return translateAnimation;
        }

        public static final TranslateAnimation b() {
            int i7 = KingPositionComponent2.h;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            translateAnimation.setInterpolator(new BezierInterpolator(0.33f, 0.0f, 0.0f, 1.0f));
            translateAnimation.setDuration(800L);
            return translateAnimation;
        }

        public static final void c(View view, long j7, String str, boolean z6) {
            int i7 = KingPositionComponent2.h;
            ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat());
            if (j7 > 0) {
                if (z6) {
                    str = C8770a.a(com.bilibili.playerbizcommon.features.background.b.a(j7, "已", str, "，"), "个", str);
                } else {
                    StringBuilder sbA = G8.b.a(j7, str, "，", "个");
                    sbA.append(str);
                    str = sbA.toString();
                }
            }
            view.setContentDescription(str);
        }

        public static final void d(TintImageView tintImageView, View view, int i7, boolean z6, boolean z7, KingPositionService.d dVar) {
            int i8 = KingPositionComponent2.h;
            e(tintImageView, view, AppCompatResources.getDrawable(tintImageView.getContext(), i7), z6, z7, dVar);
        }

        public static void e(TintImageView tintImageView, View view, Drawable drawable, boolean z6, boolean z7, KingPositionService.d dVar) {
            int iIntValue;
            Context context = tintImageView.getContext();
            if (z7) {
                tintImageView.setAlpha(0.4f);
                view.setAlpha(0.4f);
                Integer numH = dVar.h.f100388s.h();
                iIntValue = numH != null ? numH.intValue() : ContextCompat.getColor(context, R$color.Ga7);
            } else if (z6) {
                Integer numC = dVar.h.f100388s.c();
                iIntValue = numC != null ? numC.intValue() : ContextCompat.getColor(context, R$color.Pi5);
            } else {
                Integer numH2 = dVar.h.f100388s.h();
                iIntValue = numH2 != null ? numH2.intValue() : ContextCompat.getColor(context, R$color.Ga7);
            }
            ImageViewCompat.setImageTintList(tintImageView, ColorStateList.valueOf(iIntValue));
            tintImageView.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        Object result;
        final KingPositionComponent2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KingPositionComponent2 kingPositionComponent2, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = kingPositionComponent2;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        final LinearLayout $container;
        private Object L$0;
        int label;
        final KingPositionComponent2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(KingPositionComponent2 kingPositionComponent2, LinearLayout linearLayout, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = kingPositionComponent2;
            this.$container = linearLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$container, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    KingPositionComponent2 kingPositionComponent2 = this.this$0;
                    Map<UIComponent<?>, UIComponent.ViewEntry> map = kingPositionComponent2.f100244e;
                    LinearLayout linearLayout = this.$container;
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        UIComponent.ViewEntry viewEntry = (UIComponent.ViewEntry) entry.getValue();
                        UIComponent.ViewEntry viewEntryCreateViewEntry = viewEntry;
                        if (viewEntry == null) {
                            if (Intrinsics.areEqual(entry.getKey().getClass(), d.class)) {
                                viewEntryCreateViewEntry = ((UIComponent) entry.getKey()).createViewEntry(linearLayout.getContext(), linearLayout);
                            } else {
                                viewEntryCreateViewEntry = ((UIComponent) entry.getKey()).createViewEntry(linearLayout.getContext(), linearLayout);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                                layoutParams.weight = 1.0f;
                                viewEntryCreateViewEntry.getRoot().setLayoutParams(layoutParams);
                            }
                        }
                        kingPositionComponent2.f100244e.put((UIComponent<?>) entry.getKey(), viewEntryCreateViewEntry);
                        if (viewEntryCreateViewEntry.getRoot().getParent() != null) {
                            ViewParent parent = viewEntryCreateViewEntry.getRoot().getParent();
                            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeAllViews();
                            }
                        }
                        linearLayout.addView(viewEntryCreateViewEntry.getRoot());
                        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new KingPositionComponent2$bindToView$2$1$1(kingPositionComponent2, linearLayout, null), 3, (Object) null);
                        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new KingPositionComponent2$bindToView$2$1$2(entry, viewEntryCreateViewEntry, null), 3, (Object) null);
                    }
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.$container.removeAllViews();
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$c.class */
    @StabilityInferred(parameters = 1)
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f100305a = "KingPositionComponentEvent: ".concat(getClass().getSimpleName());

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$c$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final a f100306b = new c();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$c$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f100307b = new c();
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$c$c.class */
        @StabilityInferred(parameters = 0)
        public static final class C1004c extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final View f100308b;

            public C1004c(@NotNull View view) {
                this.f100308b = view;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1004c) && Intrinsics.areEqual(this.f100308b, ((C1004c) obj).f100308b);
            }

            public final int hashCode() {
                return this.f100308b.hashCode();
            }

            @NotNull
            public final String toString() {
                return cf.b.b(this.f100308b, "LikeClicked(view=", ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$c$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final View f100309b;

            public d(@NotNull View view) {
                this.f100309b = view;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f100309b, ((d) obj).f100309b);
            }

            public final int hashCode() {
                return this.f100309b.hashCode();
            }

            @NotNull
            public final String toString() {
                return cf.b.b(this.f100309b, "OnDeepBlueTripleGuideShow(anchor=", ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$c$e.class */
        @StabilityInferred(parameters = 0)
        public static final class e extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final View f100310b;

            public e(@NotNull View view) {
                this.f100310b = view;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.f100310b, ((e) obj).f100310b);
            }

            public final int hashCode() {
                return this.f100310b.hashCode();
            }

            @NotNull
            public final String toString() {
                return cf.b.b(this.f100310b, "OnFavGuideShow(anchor=", ")");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$c$f.class */
        @StabilityInferred(parameters = 0)
        public static final class f extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final View f100311b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final String f100312c;

            public f(@NotNull View view, @Nullable String str) {
                this.f100311b = view;
                this.f100312c = str;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f100311b, fVar.f100311b) && Intrinsics.areEqual(this.f100312c, fVar.f100312c);
            }

            public final int hashCode() {
                int iHashCode = this.f100311b.hashCode();
                String str = this.f100312c;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public final String toString() {
                return "OnShareGuideShow(anchor=" + this.f100311b + ", tips=" + this.f100312c + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$c$g.class */
        @StabilityInferred(parameters = 0)
        public static final class g extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final View f100313b;

            public g(@NotNull View view) {
                this.f100313b = view;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.areEqual(this.f100313b, ((g) obj).f100313b);
            }

            public final int hashCode() {
                return this.f100313b.hashCode();
            }

            @NotNull
            public final String toString() {
                return cf.b.b(this.f100313b, "OnTripleGuideShow(anchor=", ")");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements UIComponent<UIComponent.b<View>> {
        public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
            return Unit.INSTANCE;
        }

        public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
            View view = new View(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Uj0.c.b(1.0f, context), Uj0.c.b(25.0f, context));
            layoutParams.bottomMargin = (int) Uj0.c.a(6.0f, context);
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(ContextCompat.getColor(context, R$color.Ga2));
            return new UIComponent.b(view);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$e.class */
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f100314a;

        static {
            int[] iArr = new int[KingPositionType.values().length];
            try {
                iArr[KingPositionType.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[KingPositionType.DISLIKE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[KingPositionType.COIN.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[KingPositionType.FAVORITE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[KingPositionType.SHARE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[KingPositionType.CACHE.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[KingPositionType.DANMAKU.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[KingPositionType.SPLIT.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            f100314a = iArr;
        }
    }

    static {
        new Rect();
    }

    public KingPositionComponent2(@NotNull KingPositionService.d dVar, @NotNull a.C1003a c1003a, @NotNull StateFlow stateFlow, @NotNull MutableStateFlow mutableStateFlow) {
        this.f100240a = dVar;
        this.f100241b = c1003a;
        this.f100242c = stateFlow;
        this.f100243d = mutableStateFlow;
        MutableSharedFlow<c> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f100245f = mutableSharedFlowMutableSharedFlow$default;
        this.f100246g = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        Iterator it = ((LinkedHashMap) dVar.f100413a.f100470a).entrySet().iterator();
        while (it.hasNext()) {
            switch (e.f100314a[((KingPositionType) ((Map.Entry) it.next()).getKey()).ordinal()]) {
                case 1:
                    this.f100244e.put(new LikeComponent(this.f100240a, this.f100245f, this.f100242c), null);
                    break;
                case 2:
                    this.f100244e.put(new DisLikeComponent(this.f100240a), null);
                    break;
                case 3:
                    this.f100244e.put(new CoinComponent(this.f100240a), null);
                    break;
                case 4:
                    this.f100244e.put(new FavoriteComponent(this.f100240a, this.f100245f, this.f100242c), null);
                    break;
                case 5:
                    this.f100244e.put(new ShareComponent(this.f100240a, this.f100245f, this.f100242c), null);
                    break;
                case 6:
                    this.f100244e.put(new a(this.f100241b), null);
                    break;
                case 7:
                    this.f100244e.put(new CommandDanmakuComponent(this.f100240a), null);
                    break;
                case 8:
                    this.f100244e.put(new d(), null);
                    break;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.UIComponent.b<android.widget.LinearLayout> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws kotlin.KotlinNothingValueException {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.AnonymousClass1
            if (r0 == 0) goto L2b
            r0 = r8
            com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$bindToView$1 r0 = (com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.AnonymousClass1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L35
        L2b:
            com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$bindToView$1 r0 = new com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$bindToView$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L35:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L61
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L59
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L59:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8f
        L61:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            android.view.View r0 = r0.a
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7 = r0
            r0 = r7
            r0.removeAllViews()
            com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$bindToView$2 r0 = new com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$bindToView$2
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = 0
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r8
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r10
            if (r0 != r1) goto L8f
            r0 = r10
            return r0
        L8f:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2.bindToView(com.bilibili.app.gemini.ui.UIComponent$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, Uj0.c.b(58.0f, context)));
        int iB = Uj0.c.b(12.0f, context);
        linearLayout.setPadding(iB, 0, iB, 0);
        return new UIComponent.b(linearLayout);
    }
}
