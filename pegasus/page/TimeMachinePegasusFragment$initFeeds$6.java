package com.bilibili.pegasus.page;

import android.content.SharedPreferences;
import android.widget.FrameLayout;
import aq0.C4849a;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.pegasus.components.graduation.t0;
import com.bilibili.pegasus.data.config.GraduationSeasonConfig;
import dp0.C6828a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$initFeeds$6.class */
final class TimeMachinePegasusFragment$initFeeds$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.pegasus.widget.h $loadMoreListener;
    int label;
    final TimeMachinePegasusFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.TimeMachinePegasusFragment$initFeeds$6$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$initFeeds$6$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
        final com.bilibili.pegasus.widget.h $loadMoreListener;
        Object L$0;
        int label;
        final TimeMachinePegasusFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TimeMachinePegasusFragment timeMachinePegasusFragment, com.bilibili.pegasus.widget.h hVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = timeMachinePegasusFragment;
            this.$loadMoreListener = hVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$loadMoreListener, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(C6828a c6828a, Continuation<? super Unit> continuation) {
            return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i7;
            FrameLayout frameLayout;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C6828a c6828a = (C6828a) this.L$0;
            C5728q c5728q = this.this$0.f78339p;
            if (c5728q != null) {
                c5728q.a(c6828a);
            }
            this.$loadMoreListener.f79151b = c6828a.E();
            this.this$0.f78346w = c6828a.s();
            TimeMachinePegasusFragment timeMachinePegasusFragment = this.this$0;
            GraduationSeasonConfig graduationSeasonConfigS = c6828a.s();
            if (graduationSeasonConfigS == null) {
                timeMachinePegasusFragment.getClass();
            } else if (!timeMachinePegasusFragment.f78322C) {
                timeMachinePegasusFragment.f78322C = true;
                if (graduationSeasonConfigS.getExp() == 1) {
                    SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
                    if (bLKVSharedPreference != null) {
                        i7 = bLKVSharedPreference.getInt(com.bilibili.adcommon.utils.a.a() + "_key_graduation_26_selected_year", 0);
                    } else {
                        i7 = 0;
                    }
                    int i8 = i7;
                    if (i7 != 0) {
                        i8 = t0.d(i7) ? i7 : 0;
                    }
                    if (t0.d(i8)) {
                        timeMachinePegasusFragment.f78321B = i8;
                        C5721j c5721j = timeMachinePegasusFragment.f78341r;
                        if (c5721j != null) {
                            c5721j.d(i8);
                        }
                        timeMachinePegasusFragment.kf(i8);
                    }
                }
            }
            TimeMachinePegasusFragment timeMachinePegasusFragment2 = this.this$0;
            if (!timeMachinePegasusFragment2.f78323D) {
                timeMachinePegasusFragment2.f78323D = true;
                C4849a c4849a = timeMachinePegasusFragment2.f78333j;
                if (c4849a != null) {
                    c4849a.h.setVisibility(0);
                }
            }
            TimeMachinePegasusFragment timeMachinePegasusFragment3 = this.this$0;
            C5721j c5721j2 = timeMachinePegasusFragment3.f78341r;
            if (c5721j2 != null) {
                GraduationSeasonConfig graduationSeasonConfig = timeMachinePegasusFragment3.f78346w;
                c5721j2.e(TimeMachinePegasusFragment.mf(graduationSeasonConfig != null ? graduationSeasonConfig.getShare() : null));
            }
            this.this$0.vf();
            TimeMachinePegasusFragment timeMachinePegasusFragment4 = this.this$0;
            GraduationSeasonConfig graduationSeasonConfig2 = timeMachinePegasusFragment4.f78346w;
            if (graduationSeasonConfig2 != null && !timeMachinePegasusFragment4.f78347x && !t0.d(timeMachinePegasusFragment4.f78321B) && graduationSeasonConfig2.getExp() == 1) {
                timeMachinePegasusFragment4.f78347x = true;
                C4849a c4849a2 = timeMachinePegasusFragment4.f78333j;
                if (c4849a2 != null && (frameLayout = c4849a2.f53974j) != null) {
                    frameLayout.post(new com.bilibili.lib.fasthybrid.uimodule.widget.playet.k(timeMachinePegasusFragment4, 1));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeMachinePegasusFragment$initFeeds$6(TimeMachinePegasusFragment timeMachinePegasusFragment, com.bilibili.pegasus.widget.h hVar, Continuation<? super TimeMachinePegasusFragment$initFeeds$6> continuation) {
        super(2, continuation);
        this.this$0 = timeMachinePegasusFragment;
        this.$loadMoreListener = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimeMachinePegasusFragment$initFeeds$6(this.this$0, this.$loadMoreListener, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.this$0.lf().f78366m));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$loadMoreListener, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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
