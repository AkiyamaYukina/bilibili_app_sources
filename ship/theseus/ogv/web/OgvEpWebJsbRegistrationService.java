package com.bilibili.ship.theseus.ogv.web;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.infra.jsb.f;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import javax.inject.Inject;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvEpWebJsbRegistrationService.class */
@StabilityInferred(parameters = 0)
public final class OgvEpWebJsbRegistrationService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f94907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f94908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94909c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.web.OgvEpWebJsbRegistrationService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvEpWebJsbRegistrationService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvEpWebJsbRegistrationService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvEpWebJsbRegistrationService ogvEpWebJsbRegistrationService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvEpWebJsbRegistrationService;
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
                OgvEpWebJsbRegistrationService ogvEpWebJsbRegistrationService = this.this$0;
                WebFloatLayerService webFloatLayerService = ogvEpWebJsbRegistrationService.f94908b;
                OgvJsBridge ogvJsBridge = new OgvJsBridge(ogvEpWebJsbRegistrationService);
                this.label = 1;
                if (webFloatLayerService.c("ogv", ogvJsBridge, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvEpWebJsbRegistrationService$OgvJsBridge.class */
    public final class OgvJsBridge implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvEpWebJsbRegistrationService f94910a;

        public OgvJsBridge(OgvEpWebJsbRegistrationService ogvEpWebJsbRegistrationService) {
            this.f94910a = ogvEpWebJsbRegistrationService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object seek(@javax.inject.Named(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS) long r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws kotlin.KotlinNothingValueException {
            /*
                r6 = this;
                r0 = r9
                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.web.OgvEpWebJsbRegistrationService$OgvJsBridge$seek$1
                if (r0 == 0) goto L2c
                r0 = r9
                com.bilibili.ship.theseus.ogv.web.OgvEpWebJsbRegistrationService$OgvJsBridge$seek$1 r0 = (com.bilibili.ship.theseus.ogv.web.OgvEpWebJsbRegistrationService$OgvJsBridge$seek$1) r0
                r13 = r0
                r0 = r13
                int r0 = r0.label
                r10 = r0
                r0 = r10
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L2c
                r0 = r13
                r1 = r10
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r13
                r9 = r0
                goto L36
            L2c:
                com.bilibili.ship.theseus.ogv.web.OgvEpWebJsbRegistrationService$OgvJsBridge$seek$1 r0 = new com.bilibili.ship.theseus.ogv.web.OgvEpWebJsbRegistrationService$OgvJsBridge$seek$1
                r1 = r0
                r2 = r6
                r3 = r9
                r1.<init>(r2, r3)
                r9 = r0
            L36:
                r0 = r9
                java.lang.Object r0 = r0.result
                r14 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r13 = r0
                r0 = r9
                int r0 = r0.label
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L72
                r0 = r10
                r1 = 1
                if (r0 == r1) goto L6a
                r0 = r10
                r1 = 2
                if (r0 == r1) goto L62
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L62:
                r0 = r14
                kotlin.ResultKt.throwOnFailure(r0)
                goto Lb1
            L6a:
                r0 = r14
                kotlin.ResultKt.throwOnFailure(r0)
                goto La0
            L72:
                r0 = r14
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r6
                com.bilibili.ship.theseus.ogv.web.OgvEpWebJsbRegistrationService r0 = r0.f94910a
                com.bilibili.ship.theseus.keel.player.j r0 = r0.f94907a
                r14 = r0
                r0 = 1000(0x3e8, float:1.401E-42)
                long r0 = (long) r0
                r11 = r0
                r0 = r9
                r1 = 1
                r0.label = r1
                r0 = r14
                r1 = r7
                r2 = r11
                long r1 = r1 * r2
                r2 = 0
                r3 = r9
                java.lang.Object r0 = r0.y(r1, r2, r3)
                r1 = r13
                if (r0 != r1) goto La0
                r0 = r13
                return r0
            La0:
                r0 = r9
                r1 = 2
                r0.label = r1
                r0 = r9
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)
                r1 = r13
                if (r0 != r1) goto Lb1
                r0 = r13
                return r0
            Lb1:
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r1 = r0
                r1.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.web.OgvEpWebJsbRegistrationService.OgvJsBridge.seek(long, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Inject
    public OgvEpWebJsbRegistrationService(@NotNull j jVar, @NotNull WebFloatLayerService webFloatLayerService, @NotNull CoroutineScope coroutineScope) {
        this.f94907a = jVar;
        this.f94908b = webFloatLayerService;
        this.f94909c = coroutineScope;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
