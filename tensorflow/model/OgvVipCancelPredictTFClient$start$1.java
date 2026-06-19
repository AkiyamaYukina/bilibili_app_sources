package com.bilibili.tensorflow.model;

import androidx.paging.Y;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.accounts.BiliAccountInfoKt;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$start$1.class */
public final class OgvVipCancelPredictTFClient$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.bilibili.tensorflow.model.OgvVipCancelPredictTFClient$start$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$start$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AccountInfo, Continuation<? super Boolean>, Object> {
        final Ref.BooleanRef $isPredictTaskStarted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isPredictTaskStarted = booleanRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$isPredictTaskStarted, continuation);
        }

        public final Object invoke(AccountInfo accountInfo, Continuation<? super Boolean> continuation) {
            return create(accountInfo, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!this.$isPredictTaskStarted.element);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/OgvVipCancelPredictTFClient$start$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.BooleanRef f110767a;

        public a(Ref.BooleanRef booleanRef) {
            this.f110767a = booleanRef;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object emit(Object obj, Continuation continuation) throws KotlinNothingValueException {
            AccountInfo accountInfo;
            VipUserInfo vipInfo;
            VipUserInfo vipInfo2;
            Object objA;
            AccountInfo accountInfo2 = (AccountInfo) obj;
            AccountInfo accountInfo3 = OgvVipCancelPredictTFClient.f110758e;
            if (Intrinsics.areEqual(accountInfo3 != null ? Boxing.boxLong(accountInfo3.getMid()) : null, accountInfo2 != null ? Boxing.boxLong(accountInfo2.getMid()) : null)) {
                AccountInfo accountInfo4 = OgvVipCancelPredictTFClient.f110758e;
                Long lBoxLong = accountInfo4 != null ? Boxing.boxLong(accountInfo4.getMid()) : null;
                Long lBoxLong2 = null;
                if (accountInfo2 != null) {
                    lBoxLong2 = Boxing.boxLong(accountInfo2.getMid());
                }
                if (Intrinsics.areEqual(lBoxLong, lBoxLong2) && (accountInfo = OgvVipCancelPredictTFClient.f110758e) != null && (vipInfo = accountInfo.getVipInfo()) != null && !vipInfo.isEffectiveVip() && accountInfo2 != null && (vipInfo2 = accountInfo2.getVipInfo()) != null && vipInfo2.isEffectiveVip()) {
                    OgvVipCancelPredictTFClient.f110758e = accountInfo2;
                    this.f110767a.element = true;
                    objA = OgvVipCancelPredictTFClient.a(OgvVipCancelPredictTFClient.f110754a, continuation);
                    if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objA = Unit.INSTANCE;
                    }
                }
                return objA;
            }
            OgvVipCancelPredictTFClient.f110758e = accountInfo2;
            objA = Unit.INSTANCE;
            return objA;
        }
    }

    public OgvVipCancelPredictTFClient$start$1(Continuation<? super OgvVipCancelPredictTFClient$start$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVipCancelPredictTFClient$start$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.BooleanRef booleanRefA = Y.a(obj);
            Flow flowTakeWhile = FlowKt.takeWhile(BiliAccountInfoKt.a(com.bilibili.ogv.infra.account.a.f67852b), new AnonymousClass1(booleanRefA, null));
            a aVar = new a(booleanRefA);
            this.label = 1;
            if (flowTakeWhile.collect(aVar, this) == coroutine_suspended) {
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
