package com.bilibili.ship.theseus.cheese.biz.drm;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.drm.DrmType;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/drm/CheeseDrmService.class */
@StabilityInferred(parameters = 0)
public final class CheeseDrmService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f89257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IToastService f89258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f89260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final j f89261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f89262f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.drm.CheeseDrmService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/drm/CheeseDrmService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseDrmService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseDrmService cheeseDrmService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseDrmService;
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
                CheeseDrmService cheeseDrmService = this.this$0;
                this.label = 1;
                cheeseDrmService.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseDrmService$downgradeDrmIfNeeded$2(cheeseDrmService, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
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
    public CheeseDrmService(@NotNull Context context, @NotNull DrmType drmType, @NotNull IToastService iToastService, @NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull j jVar, @NotNull PageReportService pageReportService) {
        this.f89257a = context;
        this.f89258b = iToastService;
        this.f89259c = coroutineScope;
        this.f89260d = hVar;
        this.f89261e = jVar;
        this.f89262f = pageReportService;
        if (drmType.isDrm()) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
    }
}
