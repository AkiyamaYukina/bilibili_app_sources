package com.bilibili.ship.theseus.united.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import hv0.C7510d;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService.class */
@StabilityInferred(parameters = 0)
public final class AutoPlayService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h f98787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f98789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7510d f98790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f98791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f98792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final i f98793g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f98794i;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.AutoPlayService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.AutoPlayService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$1$1.class */
        public static final class C09321 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            int label;

            public C09321(Continuation<? super C09321> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09321 c09321 = new C09321(continuation);
                c09321.Z$0 = ((Boolean) obj).booleanValue();
                return c09321;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AutoPlayService autoPlayService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = autoPlayService;
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
                MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f98787a.f91107a.f79284a;
                C09321 c09321 = new C09321(null);
                this.label = 1;
                if (FlowKt.first(mutableStateFlow, c09321, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.h = true;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f98795a;

        public a(boolean z6) {
            this.f98795a = z6;
        }
    }

    @Inject
    public AutoPlayService(@NotNull h hVar, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull C7510d c7510d, @NotNull ActivityColorRepository activityColorRepository, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull i iVar, @Nullable IPlayerContainer.SharedRecord sharedRecord, @NotNull a aVar) {
        this.f98787a = hVar;
        this.f98788b = coroutineScope;
        this.f98789c = cVar;
        this.f98790d = c7510d;
        this.f98791e = activityColorRepository;
        this.f98792f = theseusFloatLayerService;
        this.f98793g = iVar;
        this.f98794i = aVar.f98795a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        if (sharedRecord != null) {
            this.h = true;
        } else if (aVar.f98795a) {
            hVar.p();
        } else {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AutoPlayService$showCover$1(this, null), 3, (Object) null);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AutoPlayService$showFirstFrame$1(this, null), 3, (Object) null);
    }
}
