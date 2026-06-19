package com.bilibili.playerbizcommon.widget.control.seekbar;

import android.util.Pair;
import bolts.Task;
import com.airbnb.lottie.LottieComposition;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarLottieThumb$load$2.class */
public final class PlayerSeekbarLottieThumb$load$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final e $info;
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final PlayerSeekbarLottieThumb this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarLottieThumb$load$2$a.class */
    public static final class a<V> implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f80595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f80596b;

        public a(File file, File file2) {
            this.f80595a = file;
            this.f80596b = file2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return new Pair(LottieComposition.Factory.fromInputStreamSync(new FileInputStream(this.f80595a)), LottieComposition.Factory.fromInputStreamSync(new FileInputStream(this.f80596b)));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarLottieThumb$load$2$b.class */
    public static final class b<TTaskResult, TContinuationResult> implements bolts.Continuation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.BooleanRef f80597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CoroutineScope f80598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CancellableContinuationImpl f80599c;

        public b(Ref.BooleanRef booleanRef, CoroutineScope coroutineScope, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f80597a = booleanRef;
            this.f80598b = coroutineScope;
            this.f80599c = cancellableContinuationImpl;
        }

        @Override // bolts.Continuation
        public final Object then(Task task) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f80599c;
            Ref.BooleanRef booleanRef = this.f80597a;
            CoroutineScope coroutineScope = this.f80598b;
            if (task != null && task.isCompleted()) {
                Pair pair = (Pair) task.getResult();
                LottieComposition lottieComposition = null;
                if (pair != null) {
                    lottieComposition = (LottieComposition) pair.first;
                }
                if (lottieComposition != null && pair.second != null && !booleanRef.element && CoroutineScopeKt.isActive(coroutineScope)) {
                    booleanRef.element = true;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Result.constructor-impl(new d((LottieComposition) pair.first, (LottieComposition) pair.second)));
                }
            } else if (!booleanRef.element && CoroutineScopeKt.isActive(coroutineScope)) {
                booleanRef.element = true;
                cancellableContinuationImpl.resumeWith(Result.constructor-impl((Object) null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekbarLottieThumb$load$2(e eVar, PlayerSeekbarLottieThumb playerSeekbarLottieThumb, Continuation<? super PlayerSeekbarLottieThumb$load$2> continuation) {
        super(2, continuation);
        this.$info = eVar;
        this.this$0 = playerSeekbarLottieThumb;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerSeekbarLottieThumb$load$2 playerSeekbarLottieThumb$load$2 = new PlayerSeekbarLottieThumb$load$2(this.$info, this.this$0, continuation);
        playerSeekbarLottieThumb$load$2.L$0 = obj;
        return playerSeekbarLottieThumb$load$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d9 A[PHI: r8
  0x02d9: PHI (r8v12 okhttp3.Response) = (r8v11 okhttp3.Response), (r8v15 okhttp3.Response) binds: [B:113:0x0333, B:96:0x02d6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarLottieThumb$load$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
