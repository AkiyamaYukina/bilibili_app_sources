package com.bilibili.ship.theseus.ogv;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.Q;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
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
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvSeasonAutoActionService.class */
@StabilityInferred(parameters = 0)
public final class OgvSeasonAutoActionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final x f91323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.web.b f91324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Q f91325d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvSeasonAutoActionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvSeasonAutoActionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvSeasonAutoActionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvSeasonAutoActionService ogvSeasonAutoActionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvSeasonAutoActionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvSeasonAutoActionService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvSeasonAutoActionService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvSeasonAutoActionService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvSeasonAutoActionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OgvSeasonAutoActionService ogvSeasonAutoActionService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ogvSeasonAutoActionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvSeasonAutoActionService ogvSeasonAutoActionService = this.this$0;
                x xVar = ogvSeasonAutoActionService.f91323b;
                if (xVar != null && (str = xVar.f94923a) != null && Iu0.a.a(str)) {
                    Q q7 = ogvSeasonAutoActionService.f91325d;
                    String strA = q7.a(str);
                    this.label = 1;
                    if (q7.c(strA, this) == coroutine_suspended) {
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

    @Inject
    public OgvSeasonAutoActionService(@NotNull CoroutineScope coroutineScope, @Nullable x xVar, @NotNull com.bilibili.ship.theseus.ogv.web.b bVar, @NotNull com.bilibili.ship.theseus.ogv.intro.floatlayer.service.i iVar, @NotNull Q q7) {
        String str;
        this.f91322a = coroutineScope;
        this.f91323b = xVar;
        this.f91324c = bVar;
        this.f91325d = q7;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        if (xVar != null && (str = xVar.f94923a) != null && !Hj0.b.b() && a(str)) {
            com.bilibili.ship.theseus.ogv.intro.floatlayer.service.i.a(iVar);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    public static boolean a(String str) {
        Uri uri = Uri.parse(str);
        return Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/detail/info");
    }
}
