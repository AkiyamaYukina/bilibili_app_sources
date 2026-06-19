package com.bilibili.ship.theseus.ugc.intro.kingposition;

import com.bilibili.app.comm.bh.x5.b;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionRepository;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$handleShareStrategy$isFirstShare$1.class */
final class UgcKingPositionService$handleShareStrategy$isFirstShare$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$handleShareStrategy$isFirstShare$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$handleShareStrategy$isFirstShare$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                KingPositionRepository.a aVar = (KingPositionRepository.a) ServiceGenerator.createService(KingPositionRepository.a.class);
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.label = 1;
                Object objIsFirstShare = aVar.isFirstShare(boolBoxBoolean, this);
                obj = objIsFirstShare;
                if (objIsFirstShare == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
            if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
                BLog.e("UgcKingPositionService$handleShareStrategy$isFirstShare$1$1-invokeSuspend", "[theseus-ugc-UgcKingPositionService$handleShareStrategy$isFirstShare$1$1-invokeSuspend] onBusinessFailure, isFirstShare is false", (Throwable) null);
                return Boxing.boxBoolean(false);
            }
            if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
                ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
                BLog.e("UgcKingPositionService$handleShareStrategy$isFirstShare$1$1-invokeSuspend", "[theseus-ugc-UgcKingPositionService$handleShareStrategy$isFirstShare$1$1-invokeSuspend] onServiceUnavailable, isFirstShare is false", (Throwable) null);
                return Boxing.boxBoolean(false);
            }
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            KingPositionRepository.FirstSharedData firstSharedData = (KingPositionRepository.FirstSharedData) ((BiliApiResponse.Success) biliApiResponse).getData();
            defpackage.a.b("[theseus-ugc-UgcKingPositionService$handleShareStrategy$isFirstShare$1$1-invokeSuspend] ", b.a("onSuccess, isFirstShare is ", firstSharedData != null ? firstSharedData.a() : false), "UgcKingPositionService$handleShareStrategy$isFirstShare$1$1-invokeSuspend");
            boolean zA = false;
            if (firstSharedData != null) {
                zA = firstSharedData.a();
            }
            return Boxing.boxBoolean(zA);
        }
    }

    public UgcKingPositionService$handleShareStrategy$isFirstShare$1(Continuation<? super UgcKingPositionService$handleShareStrategy$isFirstShare$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcKingPositionService$handleShareStrategy$isFirstShare$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                Object objWithTimeout = TimeoutKt.withTimeout(5000L, anonymousClass1, this);
                obj = objWithTimeout;
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(((Boolean) obj).booleanValue());
        } catch (Exception e7) {
            BLog.e("UgcKingPositionService$handleShareStrategy$isFirstShare$1-invokeSuspend", "[theseus-ugc-UgcKingPositionService$handleShareStrategy$isFirstShare$1-invokeSuspend] " + N4.a.a("onServiceUnavailable, ", e7), (Throwable) null);
            return Boxing.boxBoolean(false);
        }
    }
}
