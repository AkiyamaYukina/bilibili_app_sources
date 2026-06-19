package com.bilibili.ship.theseus.ugc.watchpoint;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService.class */
@StabilityInferred(parameters = 0)
public final class WatchPointLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f98577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f98578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f98579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f98580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final WatchPointLayerRepository f98581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.autofloat.a f98582g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f98583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f98584j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final WatchPointLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$1$1.class */
        public static final class C09271 extends SuspendLambda implements Function2<List<? extends ChronosThumbnailInfo.WatchPoint>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final WatchPointLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09271(WatchPointLayerService watchPointLayerService, Continuation<? super C09271> continuation) {
                super(2, continuation);
                this.this$0 = watchPointLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09271 c09271 = new C09271(this.this$0, continuation);
                c09271.L$0 = obj;
                return c09271;
            }

            public final Object invoke(List<ChronosThumbnailInfo.WatchPoint> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WatchPointLayerService.c(this.this$0, (List) this.L$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WatchPointLayerService watchPointLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = watchPointLayerService;
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
                WatchPointLayerService watchPointLayerService = this.this$0;
                SharedFlow<List<ChronosThumbnailInfo.WatchPoint>> sharedFlow = watchPointLayerService.f98581f.f98574c;
                C09271 c09271 = new C09271(watchPointLayerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c09271, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final WatchPointLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends ChronosThumbnailInfo.WatchPoint>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final WatchPointLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(WatchPointLayerService watchPointLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = watchPointLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(List<ChronosThumbnailInfo.WatchPoint> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WatchPointLayerService.c(this.this$0, (List) this.L$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WatchPointLayerService watchPointLayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = watchPointLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                WatchPointLayerService watchPointLayerService = this.this$0;
                SharedFlow<List<ChronosThumbnailInfo.WatchPoint>> sharedFlow = watchPointLayerService.f98582g.f98985j;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(watchPointLayerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final WatchPointLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WatchPointLayerService watchPointLayerService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = watchPointLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                Job job = this.this$0.f98584j;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.this$0.f98584j = null;
                throw th;
            }
        }
    }

    @Inject
    public WatchPointLayerService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull IInteractLayerService iInteractLayerService, @NotNull WatchPointLayerRepository watchPointLayerRepository, @NotNull com.bilibili.ship.theseus.united.page.autofloat.a aVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar3) {
        this.f98576a = coroutineScope;
        this.f98577b = hVar;
        this.f98578c = theseusFloatLayerService;
        this.f98579d = gVar;
        this.f98580e = iInteractLayerService;
        this.f98581f = watchPointLayerRepository;
        this.f98582g = aVar;
        this.h = aVar2;
        this.f98583i = aVar3;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [com.bilibili.ship.theseus.ugc.watchpoint.h, java.lang.Object] */
    public static final Object a(WatchPointLayerService watchPointLayerService, List list, Continuation continuation) {
        watchPointLayerService.getClass();
        ArrayList arrayList = new ArrayList(list);
        Oi1.d dVar = new Oi1.d();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Observer observer = new Observer(objectRef2) { // from class: com.bilibili.ship.theseus.ugc.watchpoint.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Ref.ObjectRef f98587a;

            {
                this.f98587a = objectRef2;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ((Boolean) obj).getClass();
                b bVar = (b) this.f98587a.element;
                if (bVar != null) {
                    bVar.b();
                }
            }
        };
        yq0.d dVar2 = new yq0.d(new f(intRef, objectRef, watchPointLayerService), ScreenModeType.THUMB.ordinal());
        com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.a aVar = new com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.a(new WatchPointLayerComponent(new g(objectRef2, watchPointLayerService, arrayList, dVar2, dVar, new Object())), new E50.e(watchPointLayerService, 5));
        objectRef.element = null;
        d(watchPointLayerService, intRef, objectRef, dVar2, objectRef2);
        ArrayList arrayList2 = new ArrayList();
        SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList2);
        selectKt$selectCancellingUnselected$scope$1.b(new WatchPointLayerService$showWatchPointLayer$2$1(watchPointLayerService, aVar, null));
        selectKt$selectCancellingUnselected$scope$1.b(new WatchPointLayerService$showWatchPointLayer$2$2(watchPointLayerService, intRef, objectRef, dVar2, objectRef2, null));
        selectKt$selectCancellingUnselected$scope$1.b(new WatchPointLayerService$showWatchPointLayer$2$3(watchPointLayerService, observer, null));
        Unit unit = Unit.INSTANCE;
        Object objFirst = FlowKt.first(FlowKt.merge(arrayList2), continuation);
        if (objFirst != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objFirst = Unit.INSTANCE;
        }
        return objFirst;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00da -> B:20:0x00e0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerService r6, kotlin.jvm.internal.Ref.IntRef r7, kotlin.jvm.internal.Ref.ObjectRef r8, yq0.d r9, kotlin.jvm.internal.Ref.ObjectRef r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerService.b(com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerService, kotlin.jvm.internal.Ref$IntRef, kotlin.jvm.internal.Ref$ObjectRef, yq0.d, kotlin.jvm.internal.Ref$ObjectRef, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void c(WatchPointLayerService watchPointLayerService, List list) {
        Job job = watchPointLayerService.f98584j;
        if (job == null || !job.isActive()) {
            watchPointLayerService.f98584j = BuildersKt.launch$default(watchPointLayerService.f98576a, (CoroutineContext) null, (CoroutineStart) null, new WatchPointLayerService$tryShowWatchPointLayer$1(watchPointLayerService, list, null), 3, (Object) null);
        }
    }

    public static final void d(WatchPointLayerService watchPointLayerService, Ref.IntRef intRef, Ref.ObjectRef<ChronosThumbnailInfo.WatchPoint> objectRef, yq0.d dVar, Ref.ObjectRef<b> objectRef2) {
        b bVar;
        Long lH;
        j jVarJ = watchPointLayerService.f98577b.j();
        long jLongValue = (jVarJ == null || (lH = jVarJ.h()) == null) ? 0L : lH.longValue();
        j jVarJ2 = watchPointLayerService.f98577b.j();
        long jL = jVarJ2 != null ? jVarJ2.L() : 0L;
        if (jL < 0 || jLongValue <= 0) {
            return;
        }
        if (jL <= jLongValue) {
            jLongValue = jL;
        }
        long j7 = jLongValue / ((long) 1000);
        if (j7 > intRef.element || j7 < r0 - 7) {
            int index = -1;
            intRef.element = -1;
            Object obj = objectRef.element;
            if (obj != null) {
                int from = ((ChronosThumbnailInfo.WatchPoint) obj).getFrom();
                if (j7 <= ((ChronosThumbnailInfo.WatchPoint) objectRef.element).getTo() && from <= j7) {
                    return;
                }
            }
            ChronosThumbnailInfo.WatchPoint watchPointFindWatchPointByPosition = watchPointLayerService.f98580e.findWatchPointByPosition((int) jLongValue);
            if (watchPointFindWatchPointByPosition != null) {
                index = watchPointFindWatchPointByPosition.getIndex();
            }
            dVar.f129808e = index;
            dVar.notifyDataSetChanged();
            if (index >= 0 && index < dVar.getItemCount() && (bVar = (b) objectRef2.element) != null) {
                bVar.a(index);
            }
            objectRef.element = watchPointFindWatchPointByPosition;
        }
    }
}
