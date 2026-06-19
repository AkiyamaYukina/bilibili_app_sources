package com.bilibili.ship.theseus.united.page.videopiece;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.widget.seek.v3.d;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/PlayerSeekThumbnailDelegateService.class */
@StabilityInferred(parameters = 1)
public final class PlayerSeekThumbnailDelegateService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.PlayerSeekThumbnailDelegateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/PlayerSeekThumbnailDelegateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $delegate;
        final Er0.a $delegateStoreService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Er0.a aVar, a aVar2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$delegateStoreService = aVar;
            this.$delegate = aVar2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$delegateStoreService, this.$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            d.a aVar = d.a.f82960a;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$delegateStoreService.put(aVar, this.$delegate);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.$delegateStoreService.remove(aVar);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.PlayerSeekThumbnailDelegateService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/PlayerSeekThumbnailDelegateService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AbsFunctionWidgetService $functionWidgetService;
        final List<Hr0.b> $videoPieceList;
        final VideoPieceProgressRepository $videoPieceProgressRepository;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.PlayerSeekThumbnailDelegateService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/PlayerSeekThumbnailDelegateService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Hr0.c, Continuation<? super Unit>, Object> {
            final AbsFunctionWidgetService $functionWidgetService;
            final Hr0.b $lastPiece;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Hr0.b bVar, AbsFunctionWidgetService absFunctionWidgetService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$lastPiece = bVar;
                this.$functionWidgetService = absFunctionWidgetService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lastPiece, this.$functionWidgetService, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Hr0.c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r0 = r5
                    int r0 = r0.label
                    if (r0 != 0) goto L47
                    r0 = r6
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r5
                    java.lang.Object r0 = r0.L$0
                    Hr0.c r0 = (Hr0.c) r0
                    r6 = r0
                    r0 = r6
                    if (r0 == 0) goto L39
                    r0 = r5
                    Hr0.b r0 = r0.$lastPiece
                    long r0 = r0.f8747b
                    r7 = r0
                    r0 = r6
                    long r0 = r0.f8753a
                    r1 = r7
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 == 0) goto L39
                    r0 = r5
                    tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService r0 = r0.$functionWidgetService
                    r1 = 0
                    r0.setDismissWidgetWhenVideoCompleted(r1)
                    goto L43
                L39:
                    r0 = r5
                    tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService r0 = r0.$functionWidgetService
                    r1 = 1
                    r0.setDismissWidgetWhenVideoCompleted(r1)
                L43:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L47:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videopiece.PlayerSeekThumbnailDelegateService.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<Hr0.b> list, VideoPieceProgressRepository videoPieceProgressRepository, AbsFunctionWidgetService absFunctionWidgetService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$videoPieceList = list;
            this.$videoPieceProgressRepository = videoPieceProgressRepository;
            this.$functionWidgetService = absFunctionWidgetService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$videoPieceList, this.$videoPieceProgressRepository, this.$functionWidgetService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Hr0.b bVar = (Hr0.b) CollectionsKt.lastOrNull(this.$videoPieceList);
                if (bVar == null) {
                    return Unit.INSTANCE;
                }
                StateFlow<Hr0.c> stateFlow = this.$videoPieceProgressRepository.f103678c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, this.$functionWidgetService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.PlayerSeekThumbnailDelegateService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/PlayerSeekThumbnailDelegateService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AbsFunctionWidgetService $functionWidgetService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AbsFunctionWidgetService absFunctionWidgetService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$functionWidgetService = absFunctionWidgetService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$functionWidgetService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.$functionWidgetService.setDismissWidgetWhenVideoCompleted(true);
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/PlayerSeekThumbnailDelegateService$a.class */
    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Hr0.b> f103674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<Hr0.b> f103675b;

        public a(List<Hr0.b> list, Ref.ObjectRef<Hr0.b> objectRef) {
            this.f103674a = list;
            this.f103675b = objectRef;
        }

        @Override // com.bilibili.playerbizcommonv2.widget.seek.v3.d
        public final boolean a() {
            boolean z6 = true;
            if (this.f103674a.size() <= 1) {
                z6 = false;
            }
            return z6;
        }

        @Override // com.bilibili.playerbizcommonv2.widget.seek.v3.d
        public final Hr0.c b(int i7) {
            Object next;
            Ref.ObjectRef<Hr0.b> objectRef = this.f103675b;
            Hr0.b bVar = (Hr0.b) objectRef.element;
            if (bVar != null) {
                long j7 = i7;
                long j8 = bVar.f8748c;
                if (j7 >= j8 && j7 < bVar.f8749d + j8) {
                    return new Hr0.c(bVar.f8747b, j7 - j8);
                }
            }
            Iterator<T> it = this.f103674a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Hr0.b bVar2 = (Hr0.b) next;
                long j9 = i7;
                long j10 = bVar2.f8748c;
                if (j9 >= j10 && j9 < j10 + bVar2.f8749d) {
                    break;
                }
            }
            Hr0.b bVar3 = (Hr0.b) next;
            if (bVar3 == null) {
                return null;
            }
            objectRef.element = bVar3;
            return new Hr0.c(bVar3.f8747b, ((long) i7) - bVar3.f8748c);
        }
    }

    @Inject
    public PlayerSeekThumbnailDelegateService(@NotNull CoroutineScope coroutineScope, @NotNull List<Hr0.b> list, @NotNull VideoPieceProgressRepository videoPieceProgressRepository, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull Er0.a aVar) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(aVar, new a(list, new Ref.ObjectRef()), null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(list, videoPieceProgressRepository, absFunctionWidgetService, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(absFunctionWidgetService, null), 3, (Object) null);
    }
}
