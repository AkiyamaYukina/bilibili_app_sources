package com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.search2.result.bangumi.G;
import dv0.C6857c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/c.class */
@StabilityInferred(parameters = 0)
public abstract class c<Binding extends ViewBinding> extends m<C6857c> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f99716k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Binding f99717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TranslateAnimation f99718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f99720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f99721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f99722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f99723g;

    @NotNull
    public final StateFlow<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BottomOrRightSheetBehavior f99724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f99725j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/c$a.class */
    public static final class a extends TranslateAnimation {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/c$b.class */
    public static final class b extends TranslateAnimation {
    }

    public c() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f99719c = MutableStateFlow;
        this.f99720d = MutableStateFlow;
        this.f99721e = StateFlowKt.MutableStateFlow(Float.valueOf(0.5625f));
        this.f99722f = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(3);
        this.f99723g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        this.f99725j = true;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new BottomOrRightSheetComponent$bind$2((C6857c) viewBinding, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C6857c c6857cInflate = C6857c.inflate(layoutInflater, viewGroup, false);
        if (g()) {
            c6857cInflate.f116916a.setOnClickListener(new Object());
        }
        FrameLayout frameLayout = c6857cInflate.f116917b;
        View view = c6857cInflate.f116919d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (!h() || ((Number) this.f99721e.getValue()).floatValue() == 0.0f) {
            layoutParams2.topToTop = 0;
            layoutParams2.topToBottom = -1;
        } else {
            layoutParams2.topToBottom = 2131313663;
            layoutParams2.topToTop = -1;
        }
        view.setLayoutParams(layoutParams2);
        CoordinatorLayout coordinatorLayout = c6857cInflate.f116921f;
        ViewGroup.LayoutParams layoutParams3 = coordinatorLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.matchConstraintMaxWidth = ((Number) this.f99722f.getValue()).intValue();
        coordinatorLayout.setLayoutParams(layoutParams4);
        Binding binding = (Binding) e(context, layoutInflater, c6857cInflate.f116917b);
        this.f99717a = binding;
        Binding binding2 = binding;
        if (binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentBinding");
            binding2 = null;
        }
        frameLayout.addView(binding2.getRoot());
        c6857cInflate.f116920e.setOnClickListener(new Object());
        ViewGroup.LayoutParams layoutParams5 = c6857cInflate.f116920e.getLayoutParams();
        if (!(layoutParams5 instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams5).getBehavior();
        if (!(behavior instanceof BottomOrRightSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomOrRightSheetBehavior");
        }
        this.f99724i = (BottomOrRightSheetBehavior) behavior;
        BottomOrRightSheetBehavior bottomOrRightSheetBehaviorF = f();
        MutableStateFlow<Boolean> mutableStateFlow = this.f99719c;
        bottomOrRightSheetBehaviorF.setBottomOrRight(((Boolean) mutableStateFlow.getValue()).booleanValue());
        f().setState(3);
        d dVar = new d(this, frameLayout, view);
        view.setAlpha(0.0f);
        view.setOnClickListener(new G(this, 1));
        f().addBottomSheetCallback(dVar);
        if (i()) {
            LinearLayout linearLayout = c6857cInflate.f116920e;
            ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
            if (layoutParams6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams6.height = -1;
            linearLayout.setLayoutParams(layoutParams6);
        }
        TranslateAnimation translateAnimation = ((Boolean) mutableStateFlow.getValue()).booleanValue() ? new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 1.0f, 1, 0.0f) : new TranslateAnimation(1, 1.0f, 1, 0.0f, 0, 0.0f, 0, 0.0f);
        this.f99718b = translateAnimation;
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        TranslateAnimation translateAnimation2 = this.f99718b;
        if (translateAnimation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sheetAnimation");
            translateAnimation2 = null;
        }
        translateAnimation2.setDuration(300L);
        return c6857cInflate;
    }

    public final boolean c() {
        if (this.f99724i == null) {
            return false;
        }
        if (f().getState() == 5) {
            BLog.w("BottomOrRightSheetComponent-backPressed", "[theseus-united-BottomOrRightSheetComponent-backPressed] behavior has been hidden", (Throwable) null);
            return false;
        }
        BLog.i("BottomOrRightSheetComponent-backPressed", "[theseus-united-BottomOrRightSheetComponent-backPressed] backPressed: hide bottom sheet");
        f().setState(5);
        return true;
    }

    @Nullable
    public abstract Object d(@NotNull Binding binding, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    public abstract Binding e(@NotNull Context context, @NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup);

    @NotNull
    public final BottomOrRightSheetBehavior f() {
        BottomOrRightSheetBehavior bottomOrRightSheetBehavior = this.f99724i;
        if (bottomOrRightSheetBehavior != null) {
            return bottomOrRightSheetBehavior;
        }
        Intrinsics.throwUninitializedPropertyAccessException("behavior");
        return null;
    }

    public boolean g() {
        return this.f99725j;
    }

    public boolean h() {
        return false;
    }

    public abstract boolean i();

    public final void j(boolean z6) {
        this.f99719c.setValue(Boolean.valueOf(z6));
        if (this.f99724i == null) {
            return;
        }
        f().setBottomOrRight(z6);
    }

    @NotNull
    public Drawable k(@NotNull Context context) {
        return ((Boolean) this.f99720d.getValue()).booleanValue() ? p.o(ContextCompat.getColor(context, R$color.f64616Wh0), 12) : new ColorDrawable(ContextCompat.getColor(context, R$color.f64616Wh0));
    }

    public final void l(float f7) {
        this.f99721e.setValue(Float.valueOf(f7));
    }
}
