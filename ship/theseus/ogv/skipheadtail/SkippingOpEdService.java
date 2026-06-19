package com.bilibili.ship.theseus.ogv.skipheadtail;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipType;
import com.bilibili.app.comm.list.common.utils.share.ListShareHelper;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ogv.playviewextra.ViewInfoClipInfo;
import com.bilibili.ship.theseus.ogv.skipheadtail.SkippingOpEdService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.DraggingProgressObserver;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.service.setting.PlayerSettingChangeObserver;
import tv.danmaku.biliplayerv2.service.z;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService.class */
@StabilityInferred(parameters = 0)
public final class SkippingOpEdService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f94515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f94516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IToastService f94517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f94518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f94519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f94520g;

    @NotNull
    public final z h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f94521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<ChronosThumbnailInfo.WatchPoint> f94522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f94523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ArrayList<WeakReference<PlayerToast>> f94524l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final a f94525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final a f94526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final d f94527o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final c f94528p;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.skipheadtail.SkippingOpEdService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SkippingOpEdService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.skipheadtail.SkippingOpEdService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$1$1.class */
        public static final class C07441 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C07441(Continuation<? super C07441> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07441 c07441 = new C07441(continuation);
                c07441.L$0 = obj;
                return c07441;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.READY);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SkippingOpEdService skippingOpEdService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = skippingOpEdService;
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
                    Flow<PlayerAvailability> flowD = this.this$0.f94515b.d();
                    C07441 c07441 = new C07441(null);
                    this.label = 1;
                    if (FlowKt.first(flowD, c07441, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SkippingOpEdService skippingOpEdService = this.this$0;
                skippingOpEdService.h.updateHeaderTailPoints(skippingOpEdService.f94522j);
                this.label = 2;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.h.updateHeaderTailPoints(CollectionsKt.emptyList());
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.skipheadtail.SkippingOpEdService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SkippingOpEdService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.skipheadtail.SkippingOpEdService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SkippingOpEdService f94529a;

            public a(SkippingOpEdService skippingOpEdService) {
                this.f94529a = skippingOpEdService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                long j7 = ((Duration) obj).unbox-impl();
                SkippingOpEdService skippingOpEdService = this.f94529a;
                boolean z6 = skippingOpEdService.f94518e.getBoolean("SkipTitlesAndEndings", true);
                boolean zC = CompoundPlayStateProviderKt.c(skippingOpEdService.f94516c);
                if (z6 && !skippingOpEdService.f94523k && zC) {
                    a aVar = skippingOpEdService.f94525m;
                    if (aVar != null) {
                        SkippingOpEdService.a(skippingOpEdService, aVar, j7);
                    }
                    a aVar2 = skippingOpEdService.f94526n;
                    if (aVar2 != null) {
                        SkippingOpEdService.a(skippingOpEdService, aVar2, j7);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SkippingOpEdService skippingOpEdService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = skippingOpEdService;
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
                Flow<Duration> flowJ = this.this$0.f94515b.J();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowJ.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.skipheadtail.SkippingOpEdService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SkippingOpEdService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SkippingOpEdService skippingOpEdService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = skippingOpEdService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SkippingOpEdService skippingOpEdService = this.this$0;
                    skippingOpEdService.h.registerDraggingProgress(skippingOpEdService.f94528p);
                    SkippingOpEdService skippingOpEdService2 = this.this$0;
                    skippingOpEdService2.f94518e.addPlayerSettingChangeObserver(skippingOpEdService2.f94527o, new String[]{"SkipTitlesAndEndings"});
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
                SkippingOpEdService skippingOpEdService3 = this.this$0;
                skippingOpEdService3.h.unregisterDraggingProgress(skippingOpEdService3.f94528p);
                SkippingOpEdService skippingOpEdService4 = this.this$0;
                skippingOpEdService4.f94518e.removePlayerSettingChangeObserver(skippingOpEdService4.f94527o);
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewInfoClipInfo f94530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f94531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f94532c;

        public a(@NotNull ViewInfoClipInfo viewInfoClipInfo) {
            this.f94530a = viewInfoClipInfo;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f94533a;

        static {
            int[] iArr = new int[ClipType.values().length];
            try {
                iArr[ClipType.CLIP_TYPE_OP.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ClipType.CLIP_TYPE_ED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f94533a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$c.class */
    public static final class c implements DraggingProgressObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SkippingOpEdService f94534a;

        public c(SkippingOpEdService skippingOpEdService) {
            this.f94534a = skippingOpEdService;
        }

        public final void onDraggingByUserChanged(boolean z6) {
            SkippingOpEdService skippingOpEdService = this.f94534a;
            if (!z6) {
                skippingOpEdService.f94523k = false;
            } else {
                skippingOpEdService.f94523k = true;
                SkippingOpEdService.b(skippingOpEdService);
            }
        }

        public final void onDraggingProgressChanged(int i7, int i8) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/SkippingOpEdService$d.class */
    public static final class d implements PlayerSettingChangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SkippingOpEdService f94535a;

        public d(SkippingOpEdService skippingOpEdService) {
            this.f94535a = skippingOpEdService;
        }

        public final void onChange(String str) {
            SkippingOpEdService skippingOpEdService = this.f94535a;
            if (!skippingOpEdService.f94518e.getBoolean("SkipTitlesAndEndings", true)) {
                SkippingOpEdService.b(skippingOpEdService);
            }
            a aVar = skippingOpEdService.f94525m;
            if (aVar != null) {
                aVar.f94531b = false;
                aVar.f94532c = false;
            }
            a aVar2 = skippingOpEdService.f94526n;
            if (aVar2 != null) {
                aVar2.f94531b = false;
                aVar2.f94532c = false;
            }
        }
    }

    @Inject
    public SkippingOpEdService(@NotNull CoroutineScope coroutineScope, @NotNull j jVar, @NotNull h hVar, @NotNull IToastService iToastService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull Context context, @NotNull PageReportService pageReportService, @NotNull z zVar, @Nullable ViewInfoClipInfo viewInfoClipInfo, @Nullable ViewInfoClipInfo viewInfoClipInfo2, boolean z6, @NotNull List<ChronosThumbnailInfo.WatchPoint> list) {
        this.f94514a = coroutineScope;
        this.f94515b = jVar;
        this.f94516c = hVar;
        this.f94517d = iToastService;
        this.f94518e = iPlayerSettingService;
        this.f94519f = context;
        this.f94520g = pageReportService;
        this.h = zVar;
        this.f94521i = z6;
        this.f94522j = list;
        this.f94525m = viewInfoClipInfo != null ? new a(viewInfoClipInfo) : null;
        this.f94526n = viewInfoClipInfo2 != null ? new a(viewInfoClipInfo2) : null;
        this.f94527o = new d(this);
        this.f94528p = new c(this);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    public static final void a(final SkippingOpEdService skippingOpEdService, final a aVar, long j7) {
        skippingOpEdService.getClass();
        if (aVar.f94531b) {
            return;
        }
        ViewInfoClipInfo viewInfoClipInfo = aVar.f94530a;
        long j8 = viewInfoClipInfo.f94378b;
        Duration.Companion companion = Duration.Companion;
        boolean z6 = Duration.equals-impl0(j8, companion.getZERO-UwyO8pc());
        PageReportService pageReportService = skippingOpEdService.f94520g;
        long j9 = viewInfoClipInfo.f94379c;
        IToastService iToastService = skippingOpEdService.f94517d;
        if (z6) {
            long j10 = companion.getZERO-UwyO8pc();
            if (Duration.box-impl(j7).compareTo(Duration.box-impl(DurationKt.toDuration(1, DurationUnit.SECONDS))) > 0 || Duration.box-impl(j7).compareTo(Duration.box-impl(j10)) < 0) {
                return;
            }
            if (skippingOpEdService.f94521i) {
                j jVarJ = skippingOpEdService.f94516c.j();
                if (Duration.compareTo-LRDsOJo(jVarJ != null ? jVarJ.F() : companion.getZERO-UwyO8pc(), j9) < 0) {
                    skippingOpEdService.d(skippingOpEdService.f94519f.getString(2131848938));
                    aVar.f94532c = true;
                    skippingOpEdService.c(aVar);
                    return;
                }
                return;
            }
            if (aVar.f94532c) {
                return;
            }
            PlayerToast playerToastBuild = new PlayerToast.Builder().level(2).location(32).toastItemType(18).setExtraString("extra_title", skippingOpEdService.f94519f.getString(2131847125)).setExtraString("extra_action_text", skippingOpEdService.f94519f.getString(2131845698)).setExtraBoolean("extra_need_close", false).duration(5000L).messageClickListener(new com.bilibili.ship.theseus.ogv.skipheadtail.c(skippingOpEdService, aVar)).build();
            skippingOpEdService.f94524l.add(new WeakReference<>(playerToastBuild));
            iToastService.showToast(playerToastBuild);
            PageReportService.i(pageReportService, "pgc.pgc-video-detail.firstskip-click.0.show", null, 6);
            aVar.f94532c = true;
            return;
        }
        long j11 = viewInfoClipInfo.f94378b;
        Duration duration = Duration.box-impl(j11);
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        boolean zContains = RangesKt.rangeTo(duration, Duration.box-impl(Duration.plus-LRDsOJo(j11, DurationKt.toDuration(1000, durationUnit)))).contains(Duration.box-impl(j7));
        boolean zContains2 = RangesKt.rangeTo(Duration.box-impl(Duration.minus-LRDsOJo(j11, DurationKt.toDuration(5500, durationUnit))), Duration.box-impl(Duration.minus-LRDsOJo(j11, DurationKt.toDuration(4500, durationUnit)))).contains(Duration.box-impl(j7));
        ClipType clipType = viewInfoClipInfo.f94380d;
        if (zContains2 && !aVar.f94532c) {
            Duration durationQ = skippingOpEdService.f94515b.q();
            int i7 = Duration.compareTo-LRDsOJo(j9, Duration.minus-LRDsOJo(durationQ != null ? durationQ.unbox-impl() : companion.getZERO-UwyO8pc(), DurationKt.toDuration(3, DurationUnit.SECONDS)));
            String str = viewInfoClipInfo.f94381e;
            if (i7 > 0) {
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                skippingOpEdService.d(str2);
            } else {
                String str3 = str;
                if (str == null) {
                    str3 = "";
                }
                final int i8 = 0;
                PlayerToast playerToastBuild2 = new PlayerToast.Builder().level(2).location(32).toastItemType(18).setExtraString("extra_title", str3).setExtraString("extra_action_text", skippingOpEdService.f94519f.getString(2131841472)).setExtraBoolean("extra_need_close", false).duration(5000L).messageClickListener(new com.bilibili.ship.theseus.ogv.skipheadtail.b(new Function0(i8, aVar, skippingOpEdService) { // from class: com.bilibili.ship.theseus.ogv.skipheadtail.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f94536a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f94537b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f94538c;

                    {
                        this.f94536a = i8;
                        this.f94537b = aVar;
                        this.f94538c = skippingOpEdService;
                    }

                    public final Object invoke() {
                        Object obj = this.f94538c;
                        Object obj2 = this.f94537b;
                        switch (this.f94536a) {
                            case 0:
                                SkippingOpEdService.a aVar2 = (SkippingOpEdService.a) obj2;
                                aVar2.f94531b = true;
                                SkippingOpEdService skippingOpEdService2 = (SkippingOpEdService) obj;
                                skippingOpEdService2.getClass();
                                int i9 = SkippingOpEdService.b.f94533a[aVar2.f94530a.f94380d.ordinal()];
                                PageReportService pageReportService2 = skippingOpEdService2.f94520g;
                                if (i9 == 1) {
                                    PageReportService.g(pageReportService2, "pgc.player.toast.op-skip.click", null, 6);
                                } else if (i9 == 2) {
                                    PageReportService.g(pageReportService2, "pgc.player.toast.ed-skip.click", null, 6);
                                }
                                return Unit.INSTANCE;
                            default:
                                ListShareHelper listShareHelper = ListShareHelper.INSTANCE;
                                return new kntr.common.share.common.handler.copy.b(kntr.common.share.domain.model.a.a((kntr.common.share.domain.model.a) obj2, (String) null, (String) obj, (String) null, 5).b);
                        }
                    }
                }, null)).build();
                skippingOpEdService.f94524l.add(new WeakReference<>(playerToastBuild2));
                iToastService.showToast(playerToastBuild2);
            }
            aVar.f94532c = true;
            int i9 = b.f94533a[clipType.ordinal()];
            if (i9 == 1) {
                PageReportService.i(pageReportService, "pgc.player.toast.op-skip.show", null, 6);
            } else if (i9 == 2) {
                PageReportService.i(pageReportService, "pgc.player.toast.ed-skip.show", null, 6);
            }
        }
        if (zContains) {
            int i10 = b.f94533a[clipType.ordinal()];
            String string = i10 != 1 ? i10 != 2 ? null : skippingOpEdService.f94519f.getString(2131848935) : skippingOpEdService.f94519f.getString(2131848938);
            if (string != null) {
                skippingOpEdService.d(string);
                aVar.f94532c = true;
            }
        }
        if (RangesKt.rangeTo(Duration.box-impl(j11), Duration.box-impl(j9)).contains(Duration.box-impl(j7)) && aVar.f94532c) {
            skippingOpEdService.c(aVar);
        }
    }

    public static final void b(SkippingOpEdService skippingOpEdService) {
        Iterator<WeakReference<PlayerToast>> it = skippingOpEdService.f94524l.iterator();
        while (it.hasNext()) {
            PlayerToast playerToast = it.next().get();
            if (playerToast != null) {
                skippingOpEdService.f94517d.dismissToast(playerToast);
            }
        }
        skippingOpEdService.f94524l.clear();
    }

    public final void c(a aVar) {
        long j7 = aVar.f94530a.f94379c;
        j jVarJ = this.f94516c.j();
        if (Duration.compareTo-LRDsOJo(jVarJ != null ? jVarJ.F() : Duration.Companion.getZERO-UwyO8pc(), j7) < 0) {
            BuildersKt.launch$default(this.f94514a, (CoroutineContext) null, (CoroutineStart) null, new SkippingOpEdService$seekToClipEnd$1(this, j7, null), 3, (Object) null);
            aVar.f94531b = true;
        }
    }

    public final void d(String str) {
        PlayerToast playerToastBuild = new PlayerToast.Builder().level(2).location(32).toastItemType(17).setExtraString("extra_title", str).duration(5000L).build();
        this.f94524l.add(new WeakReference<>(playerToastBuild));
        this.f94517d.showToast(playerToastBuild);
        PageReportService.i(this.f94520g, "pgc.player.toast.auto-skip-start.show", null, 6);
    }
}
