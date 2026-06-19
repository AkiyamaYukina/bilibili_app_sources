package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bapis.bilibili.app.viewunite.v1.KPauseBar;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$showPauseBarCountdownToast$3.class */
final class PausedPageService$showPauseBarCountdownToast$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final KPauseBar $pauseBar;
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final PausedPageService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$showPauseBarCountdownToast$3$a.class */
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PausedPageService f102192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<PlayerToast> f102193b;

        public a(PausedPageService pausedPageService, Ref.ObjectRef<PlayerToast> objectRef) {
            this.f102192a = pausedPageService;
            this.f102193b = objectRef;
        }

        public final Object invoke(Object obj) {
            PlayerToast playerToast;
            PlayerToast playerToast2;
            PausedPageService pausedPageService = this.f102192a;
            PlayerToast playerToast3 = pausedPageService.f102169x;
            Ref.ObjectRef<PlayerToast> objectRef = this.f102193b;
            Object obj2 = objectRef.element;
            if (obj2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toast");
                playerToast = null;
            } else {
                playerToast = (PlayerToast) obj2;
            }
            if (playerToast3 == playerToast) {
                Object obj3 = objectRef.element;
                if (obj3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toast");
                    playerToast2 = null;
                } else {
                    playerToast2 = (PlayerToast) obj3;
                }
                pausedPageService.f102164s.dismissToast(playerToast2);
                pausedPageService.f102169x = null;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$showPauseBarCountdownToast$3$b.class */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PausedPageService f102194a;

        public b(PausedPageService pausedPageService) {
            this.f102194a = pausedPageService;
        }

        public final Object invoke() {
            this.f102194a.r(AdPausedPageTriggerReason.CLICK_CANCEL_BUTTON);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$showPauseBarCountdownToast$3$c.class */
    public static final class c implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f102195a;

        public c(d dVar) {
            this.f102195a = dVar;
        }

        public final Object invoke() {
            this.f102195a.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$showPauseBarCountdownToast$3$d.class */
    public static final class d implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.BooleanRef f102196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PausedPageService f102197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.ObjectRef<PlayerToast> f102198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CancellableContinuationImpl f102199d;

        public d(Ref.BooleanRef booleanRef, PausedPageService pausedPageService, Ref.ObjectRef objectRef, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f102196a = booleanRef;
            this.f102197b = pausedPageService;
            this.f102198c = objectRef;
            this.f102199d = cancellableContinuationImpl;
        }

        public final Object invoke() {
            PlayerToast playerToast;
            PlayerToast playerToast2;
            Ref.BooleanRef booleanRef = this.f102196a;
            if (!booleanRef.element) {
                booleanRef.element = true;
                PausedPageService pausedPageService = this.f102197b;
                IToastService iToastService = pausedPageService.f102164s;
                Ref.ObjectRef<PlayerToast> objectRef = this.f102198c;
                Object obj = objectRef.element;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toast");
                    playerToast = null;
                } else {
                    playerToast = (PlayerToast) obj;
                }
                iToastService.dismissToast(playerToast);
                PlayerToast playerToast3 = pausedPageService.f102169x;
                Object obj2 = objectRef.element;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("toast");
                    playerToast2 = null;
                } else {
                    playerToast2 = (PlayerToast) obj2;
                }
                if (playerToast3 == playerToast2) {
                    pausedPageService.f102169x = null;
                }
                CancellableContinuationImpl cancellableContinuationImpl = this.f102199d;
                if (cancellableContinuationImpl.isActive()) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausedPageService$showPauseBarCountdownToast$3(PausedPageService pausedPageService, KPauseBar kPauseBar, Continuation<? super PausedPageService$showPauseBarCountdownToast$3> continuation) {
        super(2, continuation);
        this.this$0 = pausedPageService;
        this.$pauseBar = kPauseBar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PausedPageService$showPauseBarCountdownToast$3 pausedPageService$showPauseBarCountdownToast$3 = new PausedPageService$showPauseBarCountdownToast$3(this.this$0, this.$pauseBar, continuation);
        pausedPageService$showPauseBarCountdownToast$3.L$0 = obj;
        return pausedPageService$showPauseBarCountdownToast$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Job jobLaunch$default;
        PlayerToast playerToast;
        Job job;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (Job) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                jobLaunch$default = job;
                th = th;
                Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        jobLaunch$default = BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new PausedPageService$showPauseBarCountdownToast$3$backActionJob$1(this.this$0, null), 3, (Object) null);
        try {
            PausedPageService pausedPageService = this.this$0;
            KPauseBar kPauseBar = this.$pauseBar;
            this.L$0 = jobLaunch$default;
            this.L$1 = pausedPageService;
            this.L$2 = kPauseBar;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            PlayerToast playerToastBuild = new PlayerToast.Builder().location(32).level(2).toastItemType(19).duration(10000L).setCustomView(GAdBizKt.getGAdVideoDetail().getPausedPage().getCountDownView(pausedPageService.f102148b, kPauseBar, new b(pausedPageService), new c(new d(new Ref.BooleanRef(), pausedPageService, objectRef, cancellableContinuationImpl)))).build();
            objectRef.element = playerToastBuild;
            PlayerToast playerToast2 = playerToastBuild;
            if (playerToastBuild == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toast");
                playerToast2 = null;
            }
            pausedPageService.f102169x = playerToast2;
            IToastService iToastService = pausedPageService.f102164s;
            Object obj2 = objectRef.element;
            if (obj2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toast");
                playerToast = null;
            } else {
                playerToast = (PlayerToast) obj2;
            }
            iToastService.showToast(playerToast);
            cancellableContinuationImpl.invokeOnCancellation(new a(pausedPageService, objectRef));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            job = jobLaunch$default;
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }
}
