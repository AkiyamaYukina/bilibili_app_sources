package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$withAutoQualityPreference$2.class */
final class PCSFacadeImpl$withAutoQualityPreference$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super c.b>, Object> {
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final PCSFacadeImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$withAutoQualityPreference$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$withAutoQualityPreference$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PCSFacadeImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$withAutoQualityPreference$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$withAutoQualityPreference$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PCSFacadeImpl f79412a;

            public a(PCSFacadeImpl pCSFacadeImpl) {
                this.f79412a = pCSFacadeImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f79412a.f79396n.setValue((com.bilibili.player.tangram.basic.a) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PCSFacadeImpl pCSFacadeImpl = this.this$0;
                MutableStateFlow<com.bilibili.player.tangram.basic.a> mutableStateFlow = pCSFacadeImpl.f79395m;
                a aVar = new a(pCSFacadeImpl);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSFacadeImpl$withAutoQualityPreference$2(PCSFacadeImpl pCSFacadeImpl, Continuation<? super PCSFacadeImpl$withAutoQualityPreference$2> continuation) {
        super(2, continuation);
        this.this$0 = pCSFacadeImpl;
    }

    private static final Job invokeSuspend$runCore(CoroutineScope coroutineScope, PCSFacadeImpl pCSFacadeImpl) {
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PCSFacadeImpl$withAutoQualityPreference$2$runCore$1(pCSFacadeImpl, null), 3, (Object) null);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PCSFacadeImpl$withAutoQualityPreference$2 pCSFacadeImpl$withAutoQualityPreference$2 = new PCSFacadeImpl$withAutoQualityPreference$2(this.this$0, continuation);
        pCSFacadeImpl$withAutoQualityPreference$2.L$0 = obj;
        return pCSFacadeImpl$withAutoQualityPreference$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super c.b> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0201 -> B:70:0x0207). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x028c -> B:83:0x0266). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl$withAutoQualityPreference$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
