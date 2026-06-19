package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.viewingduration.ViewingDurationService;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import yl0.InterfaceC9062a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvTFOpenMembershipService.class */
@StabilityInferred(parameters = 0)
public final class OgvTFOpenMembershipService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f91339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewingDurationService f91340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC9062a f91341d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvTFOpenMembershipService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvTFOpenMembershipService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvTFOpenMembershipService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvTFOpenMembershipService ogvTFOpenMembershipService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvTFOpenMembershipService;
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
                OgvTFOpenMembershipService ogvTFOpenMembershipService = this.this$0;
                int iIntValue = ogvTFOpenMembershipService.f91339b.f93559e.m9146getValue().intValue();
                long j7 = Duration.getInWholeSeconds-impl(this.this$0.f91340c.f94821c.a());
                ogvTFOpenMembershipService.getClass();
                BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new OgvTFOpenMembershipService$insertOgvDetailPlayEvent$1(ogvTFOpenMembershipService, iIntValue, j7, null), 2, (Object) null);
                throw th;
            }
        }
    }

    @Inject
    public OgvTFOpenMembershipService(@NotNull CoroutineScope coroutineScope, @NotNull OgvEpisode ogvEpisode, @NotNull ViewingDurationService viewingDurationService, @NotNull InterfaceC9062a interfaceC9062a) {
        this.f91338a = coroutineScope;
        this.f91339b = ogvEpisode;
        this.f91340c = viewingDurationService;
        this.f91341d = interfaceC9062a;
        interfaceC9062a.e();
        interfaceC9062a.c();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
