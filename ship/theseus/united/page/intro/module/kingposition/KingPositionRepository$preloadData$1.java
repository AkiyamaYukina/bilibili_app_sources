package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.graphics.drawable.Drawable;
import androidx.activity.ComponentActivity;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.paycoin.C5578b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionRepository$preloadData$1.class */
final class KingPositionRepository$preloadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $id;
    private Object L$0;
    int label;
    final KingPositionRepository this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionRepository$preloadData$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionRepository$preloadData$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
        final K $la;
        int label;
        final KingPositionRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(K k7, KingPositionRepository kingPositionRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$la = k7;
            this.this$0 = kingPositionRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$la, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Drawable drawable;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                K k7 = this.$la;
                if (k7 == null || (str = k7.f100237a) == null) {
                    drawable = null;
                    return drawable;
                }
                ComponentActivity componentActivity = this.this$0.f100325b;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                BiliImageLoader.INSTANCE.acquire(componentActivity, componentActivity.getLifecycle()).useOrigin().asDrawable().url(str).submit().subscribe(new com.bilibili.playerbizcommon.utils.m(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            drawable = (Drawable) obj;
            return drawable;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionRepository$preloadData$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionRepository$preloadData$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
        final K $la;
        int label;
        final KingPositionRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(K k7, KingPositionRepository kingPositionRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$la = k7;
            this.this$0 = kingPositionRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$la, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Drawable drawable;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                K k7 = this.$la;
                if (k7 == null || (str = k7.f100238b) == null) {
                    drawable = null;
                    return drawable;
                }
                ComponentActivity componentActivity = this.this$0.f100325b;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                BiliImageLoader.INSTANCE.acquire(componentActivity, componentActivity.getLifecycle()).useOrigin().asDrawable().url(str).submit().subscribe(new com.bilibili.playerbizcommon.utils.m(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            drawable = (Drawable) obj;
            return drawable;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionRepository$preloadData$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionRepository$preloadData$1$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
        final K $la;
        int label;
        final KingPositionRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(K k7, KingPositionRepository kingPositionRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$la = k7;
            this.this$0 = kingPositionRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$la, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Drawable drawable;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                K k7 = this.$la;
                if (k7 == null || (str = k7.f100239c) == null) {
                    drawable = null;
                    return drawable;
                }
                ComponentActivity componentActivity = this.this$0.f100325b;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                BiliImageLoader.INSTANCE.acquire(componentActivity, componentActivity.getLifecycle()).useOrigin().asDrawable().url(str).submit().subscribe(new com.bilibili.playerbizcommon.utils.m(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            drawable = (Drawable) obj;
            return drawable;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionRepository$preloadData$1$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionRepository$preloadData$1$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6287a $extend;
        final String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C6287a c6287a, String str, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$extend = c6287a;
            this.$id = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$extend, this.$id, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$extend.f100451a;
            try {
                String str2 = C5578b.f74751a;
                C5578b.b(this.$id, str);
            } catch (CancellationException e7) {
                throw e7;
            } catch (Exception e8) {
                BLog.i("KingPositionRepository", "preloadCoinPicFiles: " + e8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionRepository$preloadData$1(KingPositionRepository kingPositionRepository, String str, Continuation<? super KingPositionRepository$preloadData$1> continuation) {
        super(2, continuation);
        this.this$0 = kingPositionRepository;
        this.$id = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KingPositionRepository$preloadData$1 kingPositionRepository$preloadData$1 = new KingPositionRepository$preloadData$1(this.this$0, this.$id, continuation);
        kingPositionRepository$preloadData$1.L$0 = obj;
        return kingPositionRepository$preloadData$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        C6289c c6289c;
        H h;
        C6289c c6289c2;
        C6287a c6287a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            p pVar = this.this$0.f100326c;
            K k7 = (pVar == null || (c6289c = (C6289c) ((LinkedHashMap) pVar.f100470a).get(KingPositionType.LIKE)) == null || (h = c6289c.f100463f) == null) ? null : h.f100224c;
            List listListOf = CollectionsKt.listOf(new Deferred[]{BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(k7, this.this$0, null), 3, (Object) null), BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(k7, this.this$0, null), 3, (Object) null), BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(k7, this.this$0, null), 3, (Object) null)});
            this.label = 1;
            Object objAwaitAll = AwaitKt.awaitAll(listListOf, this);
            obj = objAwaitAll;
            if (objAwaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        KingPositionRepository kingPositionRepository = this.this$0;
        int i8 = 0;
        for (Object obj2 : (Iterable) obj) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Drawable drawable = (Drawable) obj2;
            if (i8 == 0) {
                kingPositionRepository.f100327d = drawable;
            } else if (i8 == 1) {
                kingPositionRepository.f100328e = drawable;
            } else if (i8 == 2) {
                kingPositionRepository.f100329f = drawable;
            }
            i8++;
        }
        KingPositionRepository kingPositionRepository2 = this.this$0;
        CompletableDeferred<Boolean> completableDeferred = kingPositionRepository2.f100330g;
        boolean z6 = false;
        if (kingPositionRepository2.f100327d != null) {
            z6 = false;
            if (kingPositionRepository2.f100328e != null) {
                z6 = false;
                if (kingPositionRepository2.f100329f != null) {
                    z6 = true;
                }
            }
        }
        completableDeferred.complete(Boxing.boxBoolean(z6));
        p pVar2 = this.this$0.f100326c;
        if (pVar2 == null || (c6289c2 = (C6289c) ((LinkedHashMap) pVar2.f100470a).get(KingPositionType.COIN)) == null || (c6287a = c6289c2.f100464g) == null) {
            return Unit.INSTANCE;
        }
        com.bilibili.playerbizcommon.utils.n.d(this.this$0.f100325b, c6287a.f100452b);
        com.bilibili.playerbizcommon.utils.n.d(this.this$0.f100325b, c6287a.f100453c);
        com.bilibili.playerbizcommon.utils.n.d(this.this$0.f100325b, c6287a.f100454d);
        com.bilibili.playerbizcommon.utils.n.d(this.this$0.f100325b, c6287a.f100455e);
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(c6287a, this.$id, null);
        this.label = 2;
        if (BuildersKt.withContext(io2, anonymousClass5, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
