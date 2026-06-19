package com.bilibili.ship.theseus.united.page.danmaku;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/UnitedScreenShotDetectService.class */
@StabilityInferred(parameters = 0)
public final class UnitedScreenShotDetectService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f99509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f99511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f99512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliScreenshotDetectionUtil f99513e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.UnitedScreenShotDetectService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/UnitedScreenShotDetectService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedScreenShotDetectService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.UnitedScreenShotDetectService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/UnitedScreenShotDetectService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnitedScreenShotDetectService f99514a;

            public a(UnitedScreenShotDetectService unitedScreenShotDetectService) {
                this.f99514a = unitedScreenShotDetectService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                final UnitedScreenShotDetectService unitedScreenShotDetectService = this.f99514a;
                PageReportService.g(unitedScreenShotDetectService.f99512d, "united.player-video-detail.screenshot.0.click", null, 6);
                IRemoteHandler remoteHandler = unitedScreenShotDetectService.f99509a.getRemoteHandler();
                if (remoteHandler != null) {
                    IRemoteHandler.requestRpcDanmakuList$default(remoteHandler, 0, new Function1(unitedScreenShotDetectService) { // from class: com.bilibili.ship.theseus.united.page.danmaku.E

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final UnitedScreenShotDetectService f99429a;

                        {
                            this.f99429a = unitedScreenShotDetectService;
                        }

                        public final Object invoke(Object obj2) {
                            UnitedScreenShotDetectService unitedScreenShotDetectService2 = this.f99429a;
                            BuildersKt.launch$default(unitedScreenShotDetectService2.f99510b, (CoroutineContext) null, (CoroutineStart) null, new UnitedScreenShotDetectService$1$1$1$1(unitedScreenShotDetectService2, (List) obj2, null), 3, (Object) null);
                            return Unit.INSTANCE;
                        }
                    }, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnitedScreenShotDetectService unitedScreenShotDetectService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unitedScreenShotDetectService;
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
                UnitedScreenShotDetectService unitedScreenShotDetectService = this.this$0;
                SharedFlow<Unit> sharedFlow = unitedScreenShotDetectService.f99513e.h;
                a aVar = new a(unitedScreenShotDetectService);
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
    public UnitedScreenShotDetectService(@NotNull IInteractLayerService iInteractLayerService, @NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull PageReportService pageReportService) {
        this.f99509a = iInteractLayerService;
        this.f99510b = coroutineScope;
        this.f99511c = fragmentActivity;
        this.f99512d = pageReportService;
        this.f99513e = new BiliScreenshotDetectionUtil(fragmentActivity);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.danmaku.UnitedScreenShotDetectService r7, java.util.List r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.UnitedScreenShotDetectService.a(com.bilibili.ship.theseus.united.page.danmaku.UnitedScreenShotDetectService, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
