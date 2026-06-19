package com.bilibili.ship.theseus.ugc.toolbar.actionview.listen;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/UGCListenClickService.class */
@StabilityInferred(parameters = 0)
public final class UGCListenClickService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f98538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ToolbarListenRepository f98539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f98540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f98541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f98542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f98543g;

    @NotNull
    public final IPlayerSettingService h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.UGCListenClickService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/UGCListenClickService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCListenClickService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.UGCListenClickService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/UGCListenClickService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCListenClickService f98544a;

            public a(UGCListenClickService uGCListenClickService) {
                this.f98544a = uGCListenClickService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                UGCListenClickService.a(this.f98544a, 3, "2");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCListenClickService uGCListenClickService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCListenClickService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UGCListenClickService uGCListenClickService = this.this$0;
                SharedFlow<Unit> sharedFlow = uGCListenClickService.f98539c.h;
                a aVar = new a(uGCListenClickService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.UGCListenClickService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/UGCListenClickService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCListenClickService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.UGCListenClickService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/actionview/listen/UGCListenClickService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCListenClickService f98545a;

            public a(UGCListenClickService uGCListenClickService) {
                this.f98545a = uGCListenClickService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                UGCListenClickService.a(this.f98545a, 1, "1");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UGCListenClickService uGCListenClickService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = uGCListenClickService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UGCListenClickService uGCListenClickService = this.this$0;
                SharedFlow<Unit> sharedFlow = uGCListenClickService.f98540d.f103403g;
                a aVar = new a(uGCListenClickService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public UGCListenClickService(@NotNull CoroutineScope coroutineScope, @NotNull Activity activity, @NotNull ToolbarListenRepository toolbarListenRepository, @NotNull j jVar, @NotNull C7893a c7893a, @NotNull C8043a c8043a, @NotNull h hVar, @NotNull IPlayerSettingService iPlayerSettingService) {
        this.f98537a = coroutineScope;
        this.f98538b = activity;
        this.f98539c = toolbarListenRepository;
        this.f98540d = jVar;
        this.f98541e = c7893a;
        this.f98542f = c8043a;
        this.f98543g = hVar;
        this.h = iPlayerSettingService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.UGCListenClickService r7, int r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.UGCListenClickService.a(com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.UGCListenClickService, int, java.lang.String):void");
    }
}
