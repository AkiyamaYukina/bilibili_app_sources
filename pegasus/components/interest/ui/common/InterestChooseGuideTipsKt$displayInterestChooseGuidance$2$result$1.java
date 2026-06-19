package com.bilibili.pegasus.components.interest.ui.common;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import aq0.C4855d;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bililive.infra.util.extention.BiliImagViewExtentionKt;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestTipsCloseType;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGuide;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1.class */
public final class InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    final InterestChooseGuide $guide;
    final Fragment $this_displayInterestChooseGuidance;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1$a.class */
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Fragment f76389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f76390b;

        public a(Fragment fragment, d dVar) {
            this.f76389a = fragment;
            this.f76390b = dVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(LifecycleOwner lifecycleOwner) {
            this.f76389a.getLifecycle().removeObserver(this);
            super.onStop(lifecycleOwner);
            BLog.i("[Interest]InterestChooseGuideTips", "onStop");
            this.f76390b.invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1(Fragment fragment, InterestChooseGuide interestChooseGuide, Continuation<? super InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1> continuation) {
        super(2, continuation);
        this.$this_displayInterestChooseGuidance = fragment;
        this.$guide = interestChooseGuide;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelResult invokeSuspend$lambda$0(ProducerScope producerScope, boolean z6) {
        return ChannelResult.box-impl(producerScope.trySend-JP2dKIU(Boolean.valueOf(z6)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(Function1 function1, View view) {
        BLog.i("[Interest]InterestChooseGuideTips", "click goto, show interest");
        com.bilibili.pegasus.components.interest.e.x(InterestTipsCloseType.BUTTON);
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5(Function1 function1, View view) {
        com.bilibili.pegasus.components.interest.e.x(InterestTipsCloseType.CANCEL);
        BLog.i("[Interest]InterestChooseGuideTips", "click close");
        function1.invoke(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(C4855d c4855d) {
        BLog.i("[Interest]InterestChooseGuideTips", "remove tips");
        ViewParent parent = c4855d.f54000a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(c4855d.f54000a);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1 interestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1 = new InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1(this.$this_displayInterestChooseGuidance, this.$guide, continuation);
        interestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1.L$0 = obj;
        return interestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1;
    }

    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnClickListener, java.lang.Object] */
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
    public final Object invokeSuspend(Object obj) {
        Window window;
        View viewFindViewById;
        Window window2;
        View decorView;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final C4855d c4855dInflate = C4855d.inflate(LayoutInflater.from(this.$this_displayInterestChooseGuidance.getContext()));
            Neurons.reportExposure$default(true, "main.interest-select.banner.0.show", (Map) null, (List) null, 12, (Object) null);
            final d dVar = new d(producerScope);
            FragmentActivity fragmentActivityM4405getActivity = this.$this_displayInterestChooseGuidance.p3();
            int bottom = (fragmentActivityM4405getActivity == null || (window2 = fragmentActivityM4405getActivity.getWindow()) == null || (decorView = window2.getDecorView()) == null) ? 0 : decorView.getBottom();
            FragmentActivity fragmentActivityM4405getActivity2 = this.$this_displayInterestChooseGuidance.p3();
            int bottom2 = (fragmentActivityM4405getActivity2 == null || (viewFindViewById = fragmentActivityM4405getActivity2.findViewById(R.id.content)) == null) ? 0 : viewFindViewById.getBottom();
            FragmentActivity fragmentActivityM4405getActivity3 = this.$this_displayInterestChooseGuidance.p3();
            FrameLayout frameLayout = null;
            View decorView2 = (fragmentActivityM4405getActivity3 == null || (window = fragmentActivityM4405getActivity3.getWindow()) == null) ? null : window.getDecorView();
            if (decorView2 instanceof FrameLayout) {
                frameLayout = (FrameLayout) decorView2;
            }
            if (frameLayout != null) {
                TintConstraintLayout tintConstraintLayout = c4855dInflate.f54000a;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = RangesKt.coerceAtLeast(bottom - bottom2, 0) + ListExtentionsKt.toPx(57);
                layoutParams.setMarginStart(ListExtentionsKt.toPx(12));
                layoutParams.setMarginEnd(ListExtentionsKt.toPx(12));
                Unit unit = Unit.INSTANCE;
                frameLayout.addView(tintConstraintLayout, layoutParams);
            }
            c4855dInflate.f54000a.setOnClickListener(new Object());
            View.OnClickListener onClickListener = new View.OnClickListener(dVar) { // from class: com.bilibili.pegasus.components.interest.ui.common.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f76394a;

                {
                    this.f76394a = dVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1.invokeSuspend$lambda$3(this.f76394a, view);
                }
            };
            TintTextView tintTextView = c4855dInflate.f54002c;
            tintTextView.setOnClickListener(onClickListener);
            String strB = this.$guide.b();
            if (strB != null) {
                BiliImagViewExtentionKt.displayImage$default(c4855dInflate.f54003d, c4855dInflate.f54000a.getContext(), strB, (ImageLoadingListener) null, 4, (Object) null);
            }
            c4855dInflate.f54005f.setText(this.$guide.getTitle());
            c4855dInflate.f54004e.setText(this.$guide.c());
            tintTextView.setText(this.$guide.a());
            c4855dInflate.f54001b.setOnClickListener(new View.OnClickListener(dVar) { // from class: com.bilibili.pegasus.components.interest.ui.common.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f76395a;

                {
                    this.f76395a = dVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1.invokeSuspend$lambda$5(this.f76395a, view);
                }
            });
            this.$this_displayInterestChooseGuidance.getLifecycle().addObserver(new a(this.$this_displayInterestChooseGuidance, dVar));
            Function0 function0 = new Function0(c4855dInflate) { // from class: com.bilibili.pegasus.components.interest.ui.common.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C4855d f76396a;

                {
                    this.f76396a = c4855dInflate;
                }

                public final Object invoke() {
                    return InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1.invokeSuspend$lambda$6(this.f76396a);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
