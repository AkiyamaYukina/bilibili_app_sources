package com.bilibili.pegasus.page;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bilibili.pegasus.components.graduation.C5608i;
import com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisDialogFragment;
import com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisDialogType;
import com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisDismissAction;
import com.bilibili.pegasus.components.graduation.W;
import com.bilibili.pegasus.data.config.GraduationSeasonShareConfig;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$showGraduationSeasonAnalysisDialog$1.class */
public final class TimeMachinePegasusFragment$showGraduationSeasonAnalysisDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final GraduationSeasonAnalysisDialogType $dialogType;
    final GraduationSeasonShareConfig $shareConfig;
    int label;
    final TimeMachinePegasusFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeMachinePegasusFragment$showGraduationSeasonAnalysisDialog$1(GraduationSeasonShareConfig graduationSeasonShareConfig, TimeMachinePegasusFragment timeMachinePegasusFragment, GraduationSeasonAnalysisDialogType graduationSeasonAnalysisDialogType, Continuation<? super TimeMachinePegasusFragment$showGraduationSeasonAnalysisDialog$1> continuation) {
        super(2, continuation);
        this.$shareConfig = graduationSeasonShareConfig;
        this.this$0 = timeMachinePegasusFragment;
        this.$dialogType = graduationSeasonAnalysisDialogType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(TimeMachinePegasusFragment timeMachinePegasusFragment) {
        timeMachinePegasusFragment.uf();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(TimeMachinePegasusFragment timeMachinePegasusFragment, GraduationSeasonShareConfig graduationSeasonShareConfig, GraduationSeasonAnalysisDialogType graduationSeasonAnalysisDialogType) {
        C5721j c5721j = timeMachinePegasusFragment.f78341r;
        if (c5721j != null) {
            c5721j.f78408j = true;
            c5721j.b();
            c5721j.f78401b.setVisibility(8);
        }
        W w7 = W.f76097a;
        FragmentActivity fragmentActivityRequireActivity = timeMachinePegasusFragment.requireActivity();
        TimeMachinePegasusFragment$showGraduationSeasonShare$1 timeMachinePegasusFragment$showGraduationSeasonShare$1 = new TimeMachinePegasusFragment$showGraduationSeasonShare$1(timeMachinePegasusFragment);
        US0.y yVar = new US0.y(timeMachinePegasusFragment, 4);
        w7.getClass();
        W.c(fragmentActivityRequireActivity, graduationSeasonShareConfig, graduationSeasonAnalysisDialogType, timeMachinePegasusFragment$showGraduationSeasonShare$1, yVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(TimeMachinePegasusFragment timeMachinePegasusFragment, GraduationSeasonAnalysisDismissAction graduationSeasonAnalysisDismissAction) {
        C5721j c5721j;
        timeMachinePegasusFragment.f78320A = false;
        if (graduationSeasonAnalysisDismissAction == GraduationSeasonAnalysisDismissAction.CLOSE && (c5721j = timeMachinePegasusFragment.f78341r) != null) {
            c5721j.c();
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimeMachinePegasusFragment$showGraduationSeasonAnalysisDialog$1(this.$shareConfig, this.this$0, this.$dialogType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [com.bilibili.pegasus.page.H] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.bilibili.pegasus.page.I] */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            GraduationSeasonShareConfig graduationSeasonShareConfig = this.$shareConfig;
            this.label = 1;
            Object objA = C5608i.a(graduationSeasonShareConfig, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        final GraduationSeasonShareConfig graduationSeasonShareConfig2 = (GraduationSeasonShareConfig) obj;
        if (!this.this$0.isAdded() || this.this$0.getView() == null || graduationSeasonShareConfig2 == null) {
            TimeMachinePegasusFragment timeMachinePegasusFragment = this.this$0;
            timeMachinePegasusFragment.f78320A = false;
            C5721j c5721j = timeMachinePegasusFragment.f78341r;
            if (c5721j != null) {
                c5721j.c();
            }
            return Unit.INSTANCE;
        }
        GraduationSeasonAnalysisDialogFragment.a aVar = GraduationSeasonAnalysisDialogFragment.f76020i;
        final TimeMachinePegasusFragment timeMachinePegasusFragment2 = this.this$0;
        final GraduationSeasonAnalysisDialogType graduationSeasonAnalysisDialogType = this.$dialogType;
        ?? r02 = new Function0(timeMachinePegasusFragment2) { // from class: com.bilibili.pegasus.page.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TimeMachinePegasusFragment f78289a;

            {
                this.f78289a = timeMachinePegasusFragment2;
            }

            public final Object invoke() {
                return TimeMachinePegasusFragment$showGraduationSeasonAnalysisDialog$1.invokeSuspend$lambda$0(this.f78289a);
            }
        };
        ?? r03 = new Function0(timeMachinePegasusFragment2, graduationSeasonShareConfig2, graduationSeasonAnalysisDialogType) { // from class: com.bilibili.pegasus.page.I

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TimeMachinePegasusFragment f78300a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final GraduationSeasonShareConfig f78301b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final GraduationSeasonAnalysisDialogType f78302c;

            {
                this.f78300a = timeMachinePegasusFragment2;
                this.f78301b = graduationSeasonShareConfig2;
                this.f78302c = graduationSeasonAnalysisDialogType;
            }

            public final Object invoke() {
                return TimeMachinePegasusFragment$showGraduationSeasonAnalysisDialog$1.invokeSuspend$lambda$1(this.f78300a, this.f78301b, this.f78302c);
            }
        };
        J j7 = new J(timeMachinePegasusFragment2);
        aVar.getClass();
        FragmentManager childFragmentManager = timeMachinePegasusFragment2.getChildFragmentManager();
        if (!childFragmentManager.isDestroyed() && childFragmentManager.findFragmentByTag("GraduationSeasonAnalysisDialog") == null) {
            try {
                Result.Companion companion = Result.Companion;
                GraduationSeasonAnalysisDialogFragment graduationSeasonAnalysisDialogFragment = new GraduationSeasonAnalysisDialogFragment();
                graduationSeasonAnalysisDialogFragment.f76021b = graduationSeasonAnalysisDialogType;
                graduationSeasonAnalysisDialogFragment.f76022c = graduationSeasonShareConfig2;
                graduationSeasonAnalysisDialogFragment.f76023d = r02;
                graduationSeasonAnalysisDialogFragment.f76024e = r03;
                graduationSeasonAnalysisDialogFragment.f76025f = j7;
                graduationSeasonAnalysisDialogFragment.show(childFragmentManager, "GraduationSeasonAnalysisDialog");
                obj2 = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                R9.v.a("show failed: ", th2.getMessage(), "[GraduationSeason]AnalysisDialog");
            }
        }
        return Unit.INSTANCE;
    }
}
