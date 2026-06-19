package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.cheese.player.playselect.CheeseEpisodeListRepository;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ugc.offline.download.NormalVideoDownloadDelegateV3;
import com.bilibili.video.story.action.f0;
import com.mall.ui.page.feeds.MallStoryFeedsFragment;
import eu0.C6985d;
import eu0.C6987f;
import javax.inject.Inject;
import kntr.common.share.core.model.ShareMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService.class */
@StabilityInferred(parameters = 0)
public final class CheeseStudyCompletedLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f90169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f90171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IToastService f90172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f90173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f90174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f90175g;

    @NotNull
    public final C6987f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C6985d f90176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f90177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.player.playselect.b f90178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final y f90179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final B f90180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final PageReportService f90181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f90182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f90183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final CheeseEpisodeListRepository f90184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.i f90185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90186s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f90188u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final CheeseStudyCompletedComponent.a f90190w;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Qi1.a f90187t = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f90189v = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseStudyCompletedLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$1$1.class */
        public static final class C06431 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseStudyCompletedLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06431(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super C06431> continuation) {
                super(2, continuation);
                this.this$0 = cheeseStudyCompletedLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06431 c06431 = new C06431(this.this$0, continuation);
                c06431.L$0 = obj;
                return c06431;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f90190w.f90152m.setValue((c.a) this.L$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStudyCompletedLayerService;
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
                StateFlow stateFlowC = this.this$0.f90174f.c();
                C06431 c06431 = new C06431(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowC, c06431, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseStudyCompletedLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStudyCompletedLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowD = CompoundPlayStateProviderKt.d(this.this$0.f90171c);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (FlowKt.first(flowD, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.f90188u = System.currentTimeMillis();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseStudyCompletedLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheeseStudyCompletedLayerService f90191a;

            public a(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService) {
                this.f90191a = cheeseStudyCompletedLayerService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f90191a.f90187t.b(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStudyCompletedLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowD = CompoundPlayStateProviderKt.d(this.this$0.f90171c);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowD.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r0v22, types: [com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.j] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.k] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.l] */
    /* JADX WARN: Type inference failed for: r1v19, types: [Qi1.a, java.lang.Object] */
    @Inject
    public CheeseStudyCompletedLayerService(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IToastService iToastService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull C6987f c6987f, @NotNull C6985d c6985d, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.cheese.player.playselect.b bVar, @NotNull y yVar, @NotNull B b7, @NotNull PageReportService pageReportService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IControlContainerService iControlContainerService, @NotNull CheeseEpisodeListRepository cheeseEpisodeListRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.i iVar, @NotNull CheesePlayRepository cheesePlayRepository) {
        this.f90169a = context;
        this.f90170b = coroutineScope;
        this.f90171c = hVar;
        this.f90172d = iToastService;
        this.f90173e = gVar;
        this.f90174f = cVar;
        this.f90175g = iPlayerSettingService;
        this.h = c6987f;
        this.f90176i = c6985d;
        this.f90177j = backActionRepository;
        this.f90178k = bVar;
        this.f90179l = yVar;
        this.f90180m = b7;
        this.f90181n = pageReportService;
        this.f90182o = absFunctionWidgetService;
        this.f90183p = iControlContainerService;
        this.f90184q = cheeseEpisodeListRepository;
        this.f90185r = iVar;
        this.f90186s = cheesePlayRepository;
        final int i7 = 0;
        this.f90190w = new CheeseStudyCompletedComponent.a(new Function0(this, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f90252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f90253b;

            {
                this.f90252a = i7;
                this.f90253b = this;
            }

            public final Object invoke() {
                switch (this.f90252a) {
                    case 0:
                        ((CheeseStudyCompletedLayerService) this.f90253b).f90177j.c(true);
                        return Unit.INSTANCE;
                    case 1:
                        ((NormalVideoDownloadDelegateV3) this.f90253b).g();
                        return Unit.INSTANCE;
                    case 2:
                        com.bilibili.video.story.action.j jVar = ((f0) this.f90253b).k;
                        return Float.valueOf(jVar != null ? jVar.getPlaySpeed() : 1.0f);
                    case 3:
                        ((MallStoryFeedsFragment) this.f90253b).startPageBySchema(com.mall.logic.support.router.y.c("cart"));
                        return Unit.INSTANCE;
                    default:
                        return v71.c.d((kntr.common.share.domain.model.a) this.f90253b, (ShareMode) null, 6);
                }
            }
        }, new MZ.c(this, 2), new Function0(this) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheeseStudyCompletedLayerService f90254a;

            {
                this.f90254a = this;
            }

            public final Object invoke() {
                CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService = this.f90254a;
                PageReportService.g(cheeseStudyCompletedLayerService.f90181n, "pugv.detail.player.study-share.click", null, 6);
                cheeseStudyCompletedLayerService.f90189v.setValue(Boolean.TRUE);
                long j7 = cheeseStudyCompletedLayerService.f90176i.f117521q;
                long j8 = Duration.getInWholeSeconds-impl(((Duration) cheeseStudyCompletedLayerService.f90190w.f90149j.getValue()).unbox-impl());
                androidx.compose.foundation.text.input.internal.selection.k kVar = new androidx.compose.foundation.text.input.internal.selection.k(cheeseStudyCompletedLayerService, 4);
                B b8 = cheeseStudyCompletedLayerService.f90180m;
                b8.getClass();
                BuildersKt.launch$default(b8.f90134a, (CoroutineContext) null, (CoroutineStart) null, new CheeseStudyRecordShareService$share$1(b8, j7, kVar, j8, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }, new Function0(this) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheeseStudyCompletedLayerService f90255a;

            {
                this.f90255a = this;
            }

            public final Object invoke() {
                CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService = this.f90255a;
                BuildersKt.launch$default(cheeseStudyCompletedLayerService.f90170b, (CoroutineContext) null, (CoroutineStart) null, new CheeseStudyCompletedLayerService$studyCompletedState$4$1(cheeseStudyCompletedLayerService, null), 3, (Object) null);
                PageReportService.g(cheeseStudyCompletedLayerService.f90181n, "pugv.detail.player.study-next.click", null, 6);
                return Unit.INSTANCE;
            }
        }, c6987f.f117535e, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new com.bilibili.bplus.followinglist.module.item.author.m(this, 2)));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    @Nullable
    public final Object a(@NotNull hu0.e eVar, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseStudyCompletedLayerService$keepLayerShowing$2(this, eVar, this.f90187t.a(), null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x014c -> B:30:0x0152). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, int r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService.b(java.lang.String, int, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
