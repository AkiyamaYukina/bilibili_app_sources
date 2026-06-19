package com.bilibili.ship.theseus.united.player.oldway;

import android.content.res.Configuration;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.widget.setting.L;
import com.bilibili.playerbizcommonv2.widget.setting.P;
import com.bilibili.ship.theseus.united.page.playingarea.l;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/FullScreenThreePointEventRepository.class */
@StabilityInferred(parameters = 0)
public final class FullScreenThreePointEventRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f104636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Flow<Configuration> f104637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Flow<l> f104638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f104639g;

    @NotNull
    public final SharedFlow<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f104640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f104641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Function1<? super Function0<Unit>, L> f104642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final FullScreenThreePointEventRepository$delegate$1 f104643l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/FullScreenThreePointEventRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Er0.a $delegateStoreService;
        private Object L$0;
        int label;
        final FullScreenThreePointEventRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Er0.a aVar, FullScreenThreePointEventRepository fullScreenThreePointEventRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$delegateStoreService = aVar;
            this.this$0 = fullScreenThreePointEventRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delegateStoreService, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            this.$delegateStoreService.put(P.a.f83112a, this.this$0.f104643l);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new FullScreenThreePointEventRepository$1$invokeSuspend$$inlined$awaitCancel$1(null, this.$delegateStoreService), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$delegate$1] */
    @Inject
    public FullScreenThreePointEventRepository(@NotNull CoroutineScope coroutineScope, @NotNull Er0.a aVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull j jVar, @NotNull Flow<Configuration> flow, @NotNull Flow<l> flow2) {
        this.f104633a = coroutineScope;
        this.f104634b = cVar;
        this.f104635c = aVar2;
        this.f104636d = jVar;
        this.f104637e = flow;
        this.f104638f = flow2;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_LATEST;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f104639g = mutableSharedFlowMutableSharedFlow$default;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f104640i = mutableSharedFlowMutableSharedFlow$default2;
        this.f104641j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.f104643l = new P(this) { // from class: com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$delegate$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FullScreenThreePointEventRepository f104644a;

            {
                this.f104644a = this;
            }

            @Override // com.bilibili.playerbizcommonv2.widget.setting.P
            public final void a() {
                this.f104644a.f104636d.f103411p.tryEmit(Unit.INSTANCE);
            }

            @Override // com.bilibili.playerbizcommonv2.widget.setting.P
            public final void b() {
                FullScreenThreePointEventRepository fullScreenThreePointEventRepository = this.f104644a;
                BuildersKt.launch$default(fullScreenThreePointEventRepository.f104633a, (CoroutineContext) null, (CoroutineStart) null, new FullScreenThreePointEventRepository$delegate$1$onProjectionClicked$1(fullScreenThreePointEventRepository, null), 3, (Object) null);
            }

            @Override // com.bilibili.playerbizcommonv2.widget.setting.P
            public final Function1<Function0<Unit>, L> c() {
                return this.f104644a.f104642k;
            }

            @Override // com.bilibili.playerbizcommonv2.widget.setting.P
            public final void d() {
                this.f104644a.f104636d.f103413r.tryEmit(Unit.INSTANCE);
            }

            @Override // com.bilibili.playerbizcommonv2.widget.setting.P
            public final void e() {
                this.f104644a.f104640i.tryEmit(Unit.INSTANCE);
            }
        };
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(aVar, this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1 r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$keepFullScreenTranslationGetter$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$keepFullScreenTranslationGetter$1 r0 = (com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$keepFullScreenTranslationGetter$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$keepFullScreenTranslationGetter$1 r0 = new com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$keepFullScreenTranslationGetter$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L62
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5e
            goto L7d
        L5e:
            r6 = move-exception
            goto L87
        L62:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = r6
            r0.f104642k = r1     // Catch: java.lang.Throwable -> L5e
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L5e
            r0 = r7
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L5e
            r1 = r9
            if (r0 != r1) goto L7d
            r0 = r9
            return r0
        L7d:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L5e
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            r0 = r6
            throw r0     // Catch: java.lang.Throwable -> L5e
        L87:
            r0 = r5
            r1 = 0
            r0.f104642k = r1
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository.a(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
