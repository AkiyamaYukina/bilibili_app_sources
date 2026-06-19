package com.bilibili.ship.theseus.ogv.media;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusQualityResources;
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
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/AIEnhancedQualityReminderToastService.class */
@StabilityInferred(parameters = 0)
public final class AIEnhancedQualityReminderToastService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f93974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<ExtraInfo> f93975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f93976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IToastService f93977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f93978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TheseusPlayerQualityService f93979g;

    @NotNull
    public final TheseusQualityResources h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.AIEnhancedQualityReminderToastService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/AIEnhancedQualityReminderToastService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AIEnhancedQualityReminderToastService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AIEnhancedQualityReminderToastService aIEnhancedQualityReminderToastService, Continuation<AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aIEnhancedQualityReminderToastService;
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
                AIEnhancedQualityReminderToastService aIEnhancedQualityReminderToastService = this.this$0;
                this.label = 1;
                if (AIEnhancedQualityReminderToastService.a(aIEnhancedQualityReminderToastService, this) == coroutine_suspended) {
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
    public AIEnhancedQualityReminderToastService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull Flow<ExtraInfo> flow, @NotNull PageReportService pageReportService, @NotNull IToastService iToastService, @NotNull Context context, @NotNull TheseusPlayerQualityService theseusPlayerQualityService, @NotNull TheseusQualityResources theseusQualityResources) {
        this.f93973a = coroutineScope;
        this.f93974b = jVar;
        this.f93975c = flow;
        this.f93976d = pageReportService;
        this.f93977e = iToastService;
        this.f93978f = context;
        this.f93979g = theseusPlayerQualityService;
        this.h = theseusQualityResources;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124 A[PHI: r7
  0x0124: PHI (r7v7 com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo) = 
  (r7v6 com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo)
  (r7v9 com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo)
 binds: [B:31:0x011b, B:21:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.media.AIEnhancedQualityReminderToastService r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.media.AIEnhancedQualityReminderToastService.a(com.bilibili.ship.theseus.ogv.media.AIEnhancedQualityReminderToastService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
