package com.bilibili.playerbizcommon.widget.control.seekbar;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.OnCompositionLoadedListener;
import com.bilibili.base.BiliContext;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarLocalThumb$load$2.class */
public final class PlayerSeekbarLocalThumb$load$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final PlayerSeekbarLocalThumb this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarLocalThumb$load$2$a.class */
    public static final class a implements OnCompositionLoadedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.BooleanRef f80587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CoroutineScope f80588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CancellableContinuationImpl f80589c;

        public a(Ref.BooleanRef booleanRef, CoroutineScope coroutineScope, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f80587a = booleanRef;
            this.f80588b = coroutineScope;
            this.f80589c = cancellableContinuationImpl;
        }

        @Override // com.airbnb.lottie.OnCompositionLoadedListener
        public final void onCompositionLoaded(LottieComposition lottieComposition) {
            Ref.BooleanRef booleanRef = this.f80587a;
            if (booleanRef.element || !CoroutineScopeKt.isActive(this.f80588b)) {
                return;
            }
            booleanRef.element = true;
            this.f80589c.resumeWith(Result.constructor-impl(lottieComposition));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarLocalThumb$load$2$b.class */
    public static final class b implements OnCompositionLoadedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.BooleanRef f80590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CoroutineScope f80591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CancellableContinuationImpl f80592c;

        public b(Ref.BooleanRef booleanRef, CoroutineScope coroutineScope, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f80590a = booleanRef;
            this.f80591b = coroutineScope;
            this.f80592c = cancellableContinuationImpl;
        }

        @Override // com.airbnb.lottie.OnCompositionLoadedListener
        public final void onCompositionLoaded(LottieComposition lottieComposition) {
            Ref.BooleanRef booleanRef = this.f80590a;
            if (booleanRef.element || !CoroutineScopeKt.isActive(this.f80591b)) {
                return;
            }
            booleanRef.element = true;
            this.f80592c.resumeWith(Result.constructor-impl(lottieComposition));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekbarLocalThumb$load$2(PlayerSeekbarLocalThumb playerSeekbarLocalThumb, Continuation<? super PlayerSeekbarLocalThumb$load$2> continuation) {
        super(2, continuation);
        this.this$0 = playerSeekbarLocalThumb;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerSeekbarLocalThumb$load$2 playerSeekbarLocalThumb$load$2 = new PlayerSeekbarLocalThumb$load$2(this.this$0, continuation);
        playerSeekbarLocalThumb$load$2.L$0 = obj;
        return playerSeekbarLocalThumb$load$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object result;
        LottieComposition lottieComposition;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new a(new Ref.BooleanRef(), coroutineScope, cancellableContinuationImpl));
            Object result2 = cancellableContinuationImpl.getResult();
            if (result2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result2;
            if (result2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lottieComposition = (LottieComposition) this.L$1;
                ResultKt.throwOnFailure(obj);
                result = obj;
                LottieComposition lottieComposition2 = (LottieComposition) result;
                if (lottieComposition != null || lottieComposition2 == null) {
                    return Boxing.boxBoolean(false);
                }
                this.this$0.f80585a = new d(lottieComposition, lottieComposition2);
                BLog.i("SeekbarThumb-Local", "load success");
                return Boxing.boxBoolean(true);
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        LottieComposition lottieComposition3 = (LottieComposition) obj;
        this.L$0 = coroutineScope;
        this.L$1 = lottieComposition3;
        this.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
        cancellableContinuationImpl2.initCancellability();
        LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_2.json", new b(new Ref.BooleanRef(), coroutineScope, cancellableContinuationImpl2));
        result = cancellableContinuationImpl2.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (result == coroutine_suspended) {
            return coroutine_suspended;
        }
        lottieComposition = lottieComposition3;
        LottieComposition lottieComposition22 = (LottieComposition) result;
        if (lottieComposition != null) {
        }
        return Boxing.boxBoolean(false);
    }
}
