package com.bilibili.studio.material;

import G.p;
import J3.C2340f1;
import J3.C2343g1;
import J3.C2346h1;
import J3.C2349i1;
import J3.C2352j1;
import com.bilibili.lib.biliid.utils.Md5Utils;
import com.bilibili.studio.material.internal.DefaultDownloadQueue;
import com.bilibili.studio.material.j;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask.class */
public class MaterialTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f108479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MaterialRequest f108480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.material.internal.b f108481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.material.internal.e f108482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f108483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final DefaultDownloadQueue f108484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<j> f108485g;

    @NotNull
    public final MutableStateFlow<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f108486i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Lazy f108487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Lazy f108488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Lazy f108489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Lazy f108490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public j f108491e;

        public a() {
            Lazy lazy = LazyKt.lazy(new C2343g1(7));
            this.f108487a = lazy;
            this.f108488b = LazyKt.lazy(new C2346h1(9));
            this.f108489c = LazyKt.lazy(new C2349i1(7));
            this.f108490d = LazyKt.lazy(new C2352j1(7));
            this.f108491e = (j.b) lazy.getValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$b.class */
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MaterialTask f108492a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, MaterialTask materialTask) {
            super(key);
            this.f108492a = materialTask;
        }

        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            MaterialTask materialTask = this.f108492a;
            BuildersKt.launch$default(materialTask.getCoroutineScope(), (CoroutineContext) null, (CoroutineStart) null, new MaterialTask$suspendStart$errorHandler$1$1(materialTask, th, null), 3, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.material.MaterialTask$start$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$start$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MaterialTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MaterialTask materialTask, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = materialTask;
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
            try {
            } catch (Exception e7) {
                if (!(e7 instanceof CancellationException)) {
                    MaterialTask materialTask = this.this$0;
                    this.label = 3;
                    if (MaterialTask.access$notifyFailed(materialTask, e7, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (MaterialTask.access$checkJob(this.this$0)) {
                    return Unit.INSTANCE;
                }
                MaterialTask materialTask2 = this.this$0;
                this.label = 1;
                if (MaterialTask.access$notifyStart(materialTask2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            DefaultDownloadQueue defaultDownloadQueue = this.this$0.f108484f;
            MaterialTask materialTask3 = this.this$0;
            this.label = 2;
            defaultDownloadQueue.f108536b.put(materialTask3.tag(), materialTask3);
            Object objSend = defaultDownloadQueue.f108535a.send(materialTask3, this);
            if (objSend != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objSend = Unit.INSTANCE;
            }
            if (objSend == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.material.MaterialTask$state$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$state$1.class */
    public static final class C65891 extends SuspendLambda implements Function3<j, i, Continuation<? super j>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C65891(Continuation<? super C65891> continuation) {
            super(3, continuation);
        }

        public final Object invoke(j jVar, i iVar, Continuation<? super j> continuation) {
            C65891 c65891 = new C65891(continuation);
            c65891.L$0 = jVar;
            c65891.L$1 = iVar;
            return c65891.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j jVar = (j) this.L$0;
            jVar.f108558a = (i) this.L$1;
            return jVar;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.material.MaterialTask$stop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$stop$1.class */
    public static final class C65901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MaterialTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65901(MaterialTask materialTask, Continuation<? super C65901> continuation) {
            super(2, continuation);
            this.this$0 = materialTask;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C65901(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r5
                int r0 = r0.label
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L2f
                r0 = r7
                r1 = 1
                if (r0 == r1) goto L28
                r0 = r7
                r1 = 2
                if (r0 != r1) goto L1e
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                goto L9a
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L28:
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                goto L66
            L2f:
                r0 = r6
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                com.bilibili.studio.material.MaterialTask r0 = r0.this$0
                boolean r0 = com.bilibili.studio.material.MaterialTask.access$isStarted(r0)
                if (r0 == 0) goto L9a
                r0 = r5
                com.bilibili.studio.material.MaterialTask r0 = r0.this$0
                com.bilibili.studio.material.internal.DefaultDownloadQueue r0 = com.bilibili.studio.material.MaterialTask.access$getTaskQueue$p(r0)
                r9 = r0
                r0 = r5
                com.bilibili.studio.material.MaterialTask r0 = r0.this$0
                r6 = r0
                r0 = r5
                r1 = 1
                r0.label = r1
                r0 = r9
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bilibili.studio.material.MaterialTask> r0 = r0.f108536b
                r1 = r6
                java.lang.String r1 = r1.tag()
                java.lang.Object r0 = r0.remove(r1)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r1 = r8
                if (r0 != r1) goto L66
                r0 = r8
                return r0
            L66:
                r0 = r5
                com.bilibili.studio.material.MaterialTask r0 = r0.this$0
                com.bilibili.studio.material.internal.b r0 = com.bilibili.studio.material.MaterialTask.access$getFetcherImpl$p(r0)
                r0.b()
                r0 = r5
                com.bilibili.studio.material.MaterialTask r0 = r0.this$0
                kotlinx.coroutines.Job r0 = com.bilibili.studio.material.MaterialTask.access$getDownloadJob$p(r0)
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L85
                r0 = r6
                r1 = 0
                r2 = 1
                r3 = 0
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(r0, r1, r2, r3)
            L85:
                r0 = r5
                com.bilibili.studio.material.MaterialTask r0 = r0.this$0
                r6 = r0
                r0 = r5
                r1 = 2
                r0.label = r1
                r0 = r6
                r1 = r5
                java.lang.Object r0 = com.bilibili.studio.material.MaterialTask.access$notifyStopped(r0, r1)
                r1 = r8
                if (r0 != r1) goto L9a
                r0 = r8
                return r0
            L9a:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.MaterialTask.C65901.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MaterialTask(@NotNull CoroutineScope coroutineScope, @NotNull MaterialRequest materialRequest, @NotNull com.bilibili.studio.material.internal.b bVar, @Nullable com.bilibili.studio.material.internal.e eVar) {
        this.f108479a = coroutineScope;
        this.f108480b = materialRequest;
        this.f108481c = bVar;
        this.f108482d = eVar;
        this.f108483e = LazyKt.lazy(new C2340f1(9));
        if (DefaultDownloadQueue.f108534d == null) {
            synchronized (DefaultDownloadQueue.f108533c) {
                if (DefaultDownloadQueue.f108534d == null) {
                    DefaultDownloadQueue.f108534d = new DefaultDownloadQueue(Integer.MAX_VALUE);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        this.f108484f = DefaultDownloadQueue.f108534d;
        this.f108485g = StateFlowKt.MutableStateFlow((j.b) a().f108487a.getValue());
        this.h = StateFlowKt.MutableStateFlow(0);
    }

    public /* synthetic */ MaterialTask(CoroutineScope coroutineScope, MaterialRequest materialRequest, com.bilibili.studio.material.internal.b bVar, com.bilibili.studio.material.internal.e eVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, materialRequest, bVar, (i7 & 8) != 0 ? null : eVar);
    }

    public static final boolean access$checkJob(MaterialTask materialTask) {
        Job job = materialTask.f108486i;
        boolean z6 = false;
        if (job != null) {
            z6 = false;
            if (job.isActive()) {
                z6 = true;
            }
        }
        return z6;
    }

    public static final boolean access$isStarted(MaterialTask materialTask) {
        j jVar = materialTask.a().f108491e;
        return (jVar instanceof j.d) || (jVar instanceof j.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$notifyFailed(com.bilibili.studio.material.MaterialTask r17, java.lang.Throwable r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.MaterialTask.access$notifyFailed(com.bilibili.studio.material.MaterialTask, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$notifyResult(com.bilibili.studio.material.MaterialTask r5, com.bilibili.studio.material.MaterialResult r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.MaterialTask.access$notifyResult(com.bilibili.studio.material.MaterialTask, com.bilibili.studio.material.MaterialResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$notifyStart(com.bilibili.studio.material.MaterialTask r5, kotlin.coroutines.Continuation r6) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.MaterialTask.access$notifyStart(com.bilibili.studio.material.MaterialTask, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$notifyStarted(com.bilibili.studio.material.MaterialTask r5, kotlin.coroutines.Continuation r6) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.MaterialTask.access$notifyStarted(com.bilibili.studio.material.MaterialTask, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$notifyStopped(com.bilibili.studio.material.MaterialTask r5, kotlin.coroutines.Continuation r6) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.MaterialTask.access$notifyStopped(com.bilibili.studio.material.MaterialTask, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Flow state$default(MaterialTask materialTask, long j7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: state");
        }
        if ((i7 & 1) != 0) {
            j7 = 200;
        }
        return materialTask.state(j7);
    }

    public final a a() {
        return (a) this.f108483e.getValue();
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.f108479a;
    }

    public final void resetState() {
        this.f108485g.setValue((j.b) a().f108487a.getValue());
    }

    public final void start() {
        BuildersKt.launch$default(this.f108479a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @NotNull
    public final Flow<j> state(long j7) {
        return FlowKt.flowCombine(this.f108485g, FlowKt.transformLatest(this.h, new MaterialTask$progress$$inlined$flatMapLatest$1(null, this, false, j7)), new C65891(null));
    }

    public final void stop() {
        BuildersKt.launch$default(this.f108479a, (CoroutineContext) null, (CoroutineStart) null, new C65901(this, null), 3, (Object) null);
    }

    @Nullable
    public final Object suspendStart$resourcecenter_release(@NotNull Continuation<? super Unit> continuation) {
        Object objJoin;
        Job job = this.f108486i;
        if (job != null && job.isActive()) {
            return Unit.INSTANCE;
        }
        Job job2 = this.f108486i;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job jobLaunch$default = BuildersKt.launch$default(this.f108479a, new b(CoroutineExceptionHandler.Key, this).plus(gA0.a.c), (CoroutineStart) null, new MaterialTask$suspendStart$2(this, null), 2, (Object) null);
        this.f108486i = jobLaunch$default;
        if (jobLaunch$default != null && (objJoin = jobLaunch$default.join(continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objJoin;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public String tag() {
        Iterator<T> it = this.f108480b.copy().getRequests().iterator();
        String strA = "";
        while (true) {
            String str = strA;
            if (!it.hasNext()) {
                return Md5Utils.encoderByMd5(str);
            }
            Request request = (Request) it.next();
            strA = p.a(str, p.a(request.getMaterialId(), request.getMaterialUrl()));
        }
    }
}
