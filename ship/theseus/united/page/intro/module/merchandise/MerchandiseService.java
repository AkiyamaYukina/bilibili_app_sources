package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandiseBridge;
import com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandiseKt;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.united.page.ad.AdRepository;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseService.class */
@StabilityInferred(parameters = 0)
public final class MerchandiseService implements AdMerchandiseBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f100552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f100553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f100554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f100555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AdRepository f100556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C7893a f100557g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C8043a f100558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f100559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f100560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f100561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f100562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f100563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f100564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f100565p = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0(this) { // from class: com.bilibili.ship.theseus.united.page.intro.module.merchandise.g

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MerchandiseService f100587a;

        {
            this.f100587a = this;
        }

        public final Object invoke() {
            MerchandiseService merchandiseService = this.f100587a;
            f fVar = new f(new h(merchandiseService));
            BuildersKt.launch$default(merchandiseService.f100551a, (CoroutineContext) null, (CoroutineStart) null, new MerchandiseService$panelComponent$2$2$1(fVar, merchandiseService, null), 3, (Object) null);
            BuildersKt.launch$default(merchandiseService.f100551a, (CoroutineContext) null, (CoroutineStart) null, new MerchandiseService$panelComponent$2$2$2(merchandiseService, fVar, null), 3, (Object) null);
            return fVar;
        }
    });

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MerchandiseService f100566a;

        public a(MerchandiseService merchandiseService) {
            this.f100566a = merchandiseService;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService$onMoreClick$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandiseService$onMoreClick$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MerchandiseService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MerchandiseService merchandiseService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = merchandiseService;
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
                MerchandiseService merchandiseService = this.this$0;
                this.label = 1;
                merchandiseService.getClass();
                ArrayList arrayList = new ArrayList();
                SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList);
                selectKt$selectCancellingUnselected$scope$1.b(new MerchandiseService$showMerchandisePanel$2$1(merchandiseService, null));
                selectKt$selectCancellingUnselected$scope$1.b(new MerchandiseService$showMerchandisePanel$2$2(merchandiseService, null));
                selectKt$selectCancellingUnselected$scope$1.b(new MerchandiseService$showMerchandisePanel$2$3(merchandiseService, null));
                Unit unit = Unit.INSTANCE;
                Object objFirst = FlowKt.first(FlowKt.merge(arrayList), this);
                if (objFirst != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objFirst = Unit.INSTANCE;
                }
                if (objFirst == coroutine_suspended) {
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
    public MerchandiseService(@NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull BackActionRepository backActionRepository, @NotNull AdRepository adRepository, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar2, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f100551a = coroutineScope;
        this.f100552b = pageReportService;
        this.f100553c = gVar;
        this.f100554d = theseusFloatLayerService;
        this.f100555e = backActionRepository;
        this.f100556f = adRepository;
        this.f100557g = c7893a;
        this.h = aVar;
        this.f100558i = c8043a;
        this.f100559j = aVar2;
        this.f100560k = introContentSizeRepository;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.moss.api.MossException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonIOException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws com.bilibili.lib.moss.api.MossException, com.google.gson.JsonSyntaxException, com.google.gson.JsonIOException {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService.a(com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandiseService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @NotNull
    public final RunningUIComponent b() {
        a aVar = new a(this);
        d dVar = this.f100561l;
        d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchandiseData");
            dVar2 = null;
        }
        return new RunningUIComponent(new MerchandiseComponent(aVar, dVar2, this.f100551a), 0, (Function1) null, 6);
    }

    public final Map<String, String> c() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String str = this.f100556f.f98934j;
        if (str != null) {
            mapCreateMapBuilder.put("trackid_id", str);
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    public final Map<String, String> d() {
        d dVar = this.f100561l;
        d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchandiseData");
            dVar2 = null;
        }
        List<c> list = dVar2.f100579c;
        SourceContent sourceContent = null;
        if (list != null) {
            c cVar = (c) CollectionsKt.firstOrNull(list);
            sourceContent = null;
            if (cVar != null) {
                sourceContent = cVar.f100576e;
            }
        }
        return AdMerchandiseKt.getMerchandiseParams(sourceContent);
    }

    public final void dismissPanel() {
        this.f100556f.b().dismissPanel();
    }

    @NotNull
    public final Flow<Integer> getHorizontalPaddingFlow() {
        return this.f100560k.f100020a;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.f100551a;
    }

    public final boolean isPanelShowing() {
        return this.f100556f.b().isPanelShowing();
    }

    @Nullable
    public final Object onButtonClick(@NotNull Continuation<? super Unit> continuation) {
        PageReportService.g(this.f100552b, "united.player-video-detail.middle.mall-card.click", MapsKt.plus(c(), d()), 4);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object onCardClick(@NotNull Continuation<? super Unit> continuation) {
        PageReportService.g(this.f100552b, "united.player-video-detail.middle.mall-card.click", MapsKt.plus(c(), d()), 4);
        return Unit.INSTANCE;
    }

    public final void onMoreClick() {
        BuildersKt.launch$default(this.f100551a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        PageReportService.g(this.f100552b, "united.player-video-detail.middle.mall-card-show-more.click", MapsKt.plus(c(), d()), 4);
    }

    public final <T extends IPanelData> void showPanel(int i7, @Nullable T t7, @Nullable IAdPanelListener iAdPanelListener) {
        if (isPanelShowing()) {
            return;
        }
        this.f100556f.b().showPanel(i7, t7, iAdPanelListener);
    }
}
