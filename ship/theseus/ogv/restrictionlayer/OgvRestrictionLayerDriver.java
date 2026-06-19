package com.bilibili.ship.theseus.ogv.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.community.follow.b;
import com.bilibili.community.follow.c;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.restrictionlayer.DeliveryOperationAction;
import com.bilibili.ship.theseus.united.page.restrictionlayer.G;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vv0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver.class */
@StabilityInferred(parameters = 0)
public final class OgvRestrictionLayerDriver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<ExtraInfo> f94425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final G f94426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f94427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvSeason f94428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f94429f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvRestrictionLayerDriver this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$1$1.class */
        public static final class C07431 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvRestrictionLayerDriver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07431(OgvRestrictionLayerDriver ogvRestrictionLayerDriver, Continuation<C07431> continuation) {
                super(2, continuation);
                this.this$0 = ogvRestrictionLayerDriver;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07431 c07431 = new C07431(this.this$0, continuation);
                c07431.L$0 = obj;
                return c07431;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                RestrictionLayerVo restrictionLayerVo;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ExtraInfo extraInfo = (ExtraInfo) this.L$0;
                    if (this.this$0.f94427d.f94430a && extraInfo != null && (restrictionLayerVo = (RestrictionLayerVo) d.f128457e.a(extraInfo)) != null) {
                        OgvRestrictionLayerDriver ogvRestrictionLayerDriver = this.this$0;
                        G g7 = ogvRestrictionLayerDriver.f94426c;
                        RestrictionLayerVo restrictionLayerVoA = OgvRestrictionLayerDriver.a(ogvRestrictionLayerDriver, restrictionLayerVo);
                        String str = ogvRestrictionLayerDriver.f94428e.f94465r;
                        this.label = 1;
                        if (G.c(g7, restrictionLayerVoA, true, false, str, false, null, this, 52) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvRestrictionLayerDriver ogvRestrictionLayerDriver, Continuation<AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvRestrictionLayerDriver;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvRestrictionLayerDriver ogvRestrictionLayerDriver = this.this$0;
                StateFlow<ExtraInfo> stateFlow = ogvRestrictionLayerDriver.f94425b;
                C07431 c07431 = new C07431(ogvRestrictionLayerDriver, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c07431, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/restrictionlayer/OgvRestrictionLayerDriver$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f94430a;

        public a() {
            this(false);
        }

        public a(boolean z6) {
            this.f94430a = z6;
        }
    }

    @Inject
    public OgvRestrictionLayerDriver(@NotNull CoroutineScope coroutineScope, @NotNull StateFlow<ExtraInfo> stateFlow, @NotNull G g7, @NotNull a aVar, @NotNull OgvSeason ogvSeason, @NotNull InterfaceC6388m interfaceC6388m) {
        this.f94424a = coroutineScope;
        this.f94425b = stateFlow;
        this.f94426c = g7;
        this.f94427d = aVar;
        this.f94428e = ogvSeason;
        this.f94429f = interfaceC6388m;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final RestrictionLayerVo a(OgvRestrictionLayerDriver ogvRestrictionLayerDriver, RestrictionLayerVo restrictionLayerVo) {
        RestrictionLayerVo restrictionLayerVoA;
        ogvRestrictionLayerDriver.getClass();
        String str = restrictionLayerVo.f102678m.get("follow");
        if (str == null) {
            restrictionLayerVoA = restrictionLayerVo;
        } else {
            long j7 = ogvRestrictionLayerDriver.f94428e.f94449a;
            c cVar = c.a;
            b bVar = (b) c.c.c(c.a(j7));
            b bVar2 = bVar;
            if (bVar == null) {
                bVar2 = new b(false, FollowSeasonStatus.UNKNOWN);
            }
            restrictionLayerVoA = restrictionLayerVo;
            if (!Intrinsics.areEqual(String.valueOf(bVar2.a), str)) {
                List<TextVo> list = restrictionLayerVo.f102672f;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!(((TextVo) obj).f102713j instanceof DeliveryOperationAction)) {
                        arrayList.add(obj);
                    }
                }
                restrictionLayerVoA = RestrictionLayerVo.a(restrictionLayerVo, null, arrayList, null, null, 0L, 30687);
            }
        }
        return restrictionLayerVoA;
    }

    @Nullable
    public final Object b(@NotNull SuspendLambda suspendLambda) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvRestrictionLayerDriver$handleVideoForbidden$2(this, null), suspendLambda);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
