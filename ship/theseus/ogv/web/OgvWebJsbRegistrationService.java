package com.bilibili.ship.theseus.ogv.web;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.infra.jsb.f;
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
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvWebJsbRegistrationService.class */
@StabilityInferred(parameters = 0)
public final class OgvWebJsbRegistrationService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f94911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f94913c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvWebJsbRegistrationService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvWebJsbRegistrationService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvWebJsbRegistrationService ogvWebJsbRegistrationService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvWebJsbRegistrationService;
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
                OgvWebJsbRegistrationService ogvWebJsbRegistrationService = this.this$0;
                WebFloatLayerService webFloatLayerService = ogvWebJsbRegistrationService.f94911a;
                OgvJsBridge ogvJsBridge = new OgvJsBridge(ogvWebJsbRegistrationService);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/OgvWebJsbRegistrationService$OgvJsBridge.class */
    public final class OgvJsBridge implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvWebJsbRegistrationService f94914a;

        public OgvJsBridge(OgvWebJsbRegistrationService ogvWebJsbRegistrationService) {
            this.f94914a = ogvWebJsbRegistrationService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object getState(@javax.inject.Named("state_name") @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.google.gson.JsonElement> r8) throws kotlin.KotlinNothingValueException {
            /*
                r6 = this;
                r0 = r8
                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$getState$1
                if (r0 == 0) goto L29
                r0 = r8
                com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$getState$1 r0 = (com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$getState$1) r0
                r10 = r0
                r0 = r10
                int r0 = r0.label
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L29
                r0 = r10
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r10
                r8 = r0
                goto L33
            L29:
                com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$getState$1 r0 = new com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$getState$1
                r1 = r0
                r2 = r6
                r3 = r8
                r1.<init>(r2, r3)
                r8 = r0
            L33:
                r0 = r8
                java.lang.Object r0 = r0.result
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r11 = r0
                r0 = r8
                int r0 = r0.label
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L5e
                r0 = r9
                r1 = 1
                if (r0 == r1) goto L56
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L56:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L9d
            L5e:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r7
                java.lang.String r1 = "judges_toggle"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L8c
                com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
                r1 = r0
                r1.<init>()
                r7 = r0
                r0 = r7
                java.lang.String r1 = "state_value"
                r2 = r6
                com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService r2 = r2.f94914a
                tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r2 = r2.f94913c
                java.lang.String r3 = "bangumi_detail_judges_toggle"
                java.lang.String r4 = "1"
                java.lang.String r2 = r2.getString(r3, r4)
                r0.addProperty(r1, r2)
                r0 = r7
                return r0
            L8c:
                r0 = r8
                r1 = 1
                r0.label = r1
                r0 = r8
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)
                r1 = r11
                if (r0 != r1) goto L9d
                r0 = r11
                return r0
            L9d:
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r1 = r0
                r1.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService.OgvJsBridge.getState(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object setState(@javax.inject.Named("state_name") @org.jetbrains.annotations.NotNull java.lang.String r6, @javax.inject.Named("state_value") @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.google.gson.JsonElement> r8) throws kotlin.KotlinNothingValueException {
            /*
                r5 = this;
                r0 = r8
                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$setState$1
                if (r0 == 0) goto L2c
                r0 = r8
                com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$setState$1 r0 = (com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$setState$1) r0
                r10 = r0
                r0 = r10
                int r0 = r0.label
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L2c
                r0 = r10
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r10
                r8 = r0
                goto L36
            L2c:
                com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$setState$1 r0 = new com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService$OgvJsBridge$setState$1
                r1 = r0
                r2 = r5
                r3 = r8
                r1.<init>(r2, r3)
                r8 = r0
            L36:
                r0 = r8
                java.lang.Object r0 = r0.result
                r11 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r8
                int r0 = r0.label
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L64
                r0 = r9
                r1 = 1
                if (r0 == r1) goto L5c
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L5c:
                r0 = r11
                kotlin.ResultKt.throwOnFailure(r0)
                goto La3
            L64:
                r0 = r11
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r6
                java.lang.String r1 = "judges_toggle"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L92
                r0 = r5
                com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService r0 = r0.f94914a
                tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.f94913c
                java.lang.String r1 = "bangumi_detail_judges_toggle"
                r2 = r7
                r0.putString(r1, r2)
                com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
                r1 = r0
                r1.<init>()
                r6 = r0
                r0 = r6
                java.lang.String r1 = "state_value"
                r2 = r7
                r0.addProperty(r1, r2)
                r0 = r6
                return r0
            L92:
                r0 = r8
                r1 = 1
                r0.label = r1
                r0 = r8
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)
                r1 = r10
                if (r0 != r1) goto La3
                r0 = r10
                return r0
            La3:
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r1 = r0
                r1.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.web.OgvWebJsbRegistrationService.OgvJsBridge.setState(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Inject
    public OgvWebJsbRegistrationService(@NotNull WebFloatLayerService webFloatLayerService, @NotNull CoroutineScope coroutineScope, @NotNull IPlayerSettingService iPlayerSettingService) {
        this.f94911a = webFloatLayerService;
        this.f94912b = coroutineScope;
        this.f94913c = iPlayerSettingService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
