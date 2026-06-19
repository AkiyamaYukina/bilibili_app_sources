package com.bilibili.ship.theseus.ugc.tags;

import Av0.a;
import G0.g;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.united.page.intro.module.tags.i;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/tags/UgcTagsService.class */
@StabilityInferred(parameters = 0)
public final class UgcTagsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i f98500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f98501c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.tags.UgcTagsService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/tags/UgcTagsService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcTagsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.tags.UgcTagsService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/tags/UgcTagsService$1$1.class */
        public static final class C09261<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Ref.ObjectRef<a> f98502a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UgcTagsService f98503b;

            public C09261(Ref.ObjectRef<a> objectRef, UgcTagsService ugcTagsService) {
                this.f98502a = objectRef;
                this.f98503b = ugcTagsService;
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(Av0.a r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    Method dump skipped, instruction units count: 365
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.tags.UgcTagsService.AnonymousClass1.C09261.emit(Av0.a, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcTagsService ugcTagsService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcTagsService;
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
                Ref.ObjectRef objectRefB = g.b(obj);
                UgcTagsService ugcTagsService = this.this$0;
                UGCPlaybackRepository$special$$inlined$map$1 uGCPlaybackRepository$special$$inlined$map$1 = ugcTagsService.f98501c.f98076u;
                C09261 c09261 = new C09261(objectRefB, ugcTagsService);
                this.label = 1;
                if (uGCPlaybackRepository$special$$inlined$map$1.collect(c09261, this) == coroutine_suspended) {
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

    @Inject
    public UgcTagsService(@NotNull CoroutineScope coroutineScope, @NotNull i iVar, @NotNull UGCPlaybackRepository uGCPlaybackRepository) {
        this.f98499a = coroutineScope;
        this.f98500b = iVar;
        this.f98501c = uGCPlaybackRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ugc.tags.UgcTagsService r7, long r8, long r10, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.tags.UgcTagsService.a(com.bilibili.ship.theseus.ugc.tags.UgcTagsService, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
