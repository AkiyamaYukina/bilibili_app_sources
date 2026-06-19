package com.bilibili.pegasus.components.topview;

import android.view.View;
import androidx.compose.foundation.text.C0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.home.v1.l;
import com.bilibili.adcommon.config.DDConfig;
import com.bilibili.adcommon.data.AdInfo;
import com.bilibili.adcommon.data.IAdReportInfo;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.AdBannerData;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.ReportPresetKt;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.HolderExtra;
import com.bilibili.pegasus.HolderStyle;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.vm.F;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2;
import com.bilibili.pegasus.vm.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import pp0.C8340D;
import q4.r;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewReplaceCardComponent.class */
@StabilityInferred(parameters = 0)
public final class TopViewReplaceCardComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f77165k = "TopViewReplaceCardComponent";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f77166l = DDConfig.INSTANCE.getSplashTopViewBannerMixinExp();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77167m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77168n = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SplashViewModel.class), new d(this), new e(this), new f(this));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewReplaceCardComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopViewReplaceCardComponent f77169a;

        public a(TopViewReplaceCardComponent topViewReplaceCardComponent) {
            this.f77169a = topViewReplaceCardComponent;
        }

        public final Object invoke() {
            return this.f77169a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewReplaceCardComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopViewReplaceCardComponent f77172a;

        public b(TopViewReplaceCardComponent topViewReplaceCardComponent) {
            this.f77172a = topViewReplaceCardComponent;
        }

        public final Object invoke() {
            return this.f77172a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewReplaceCardComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopViewReplaceCardComponent f77173a;

        public c(TopViewReplaceCardComponent topViewReplaceCardComponent) {
            this.f77173a = topViewReplaceCardComponent;
        }

        public final Object invoke() {
            return this.f77173a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewReplaceCardComponent$d.class */
    public static final class d implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopViewReplaceCardComponent f77174a;

        public d(TopViewReplaceCardComponent topViewReplaceCardComponent) {
            this.f77174a = topViewReplaceCardComponent;
        }

        public final Object invoke() {
            return this.f77174a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewReplaceCardComponent$e.class */
    public static final class e implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopViewReplaceCardComponent f77175a;

        public e(TopViewReplaceCardComponent topViewReplaceCardComponent) {
            this.f77175a = topViewReplaceCardComponent;
        }

        public final Object invoke() {
            return this.f77175a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewReplaceCardComponent$f.class */
    public static final class f implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopViewReplaceCardComponent f77176a;

        public f(TopViewReplaceCardComponent topViewReplaceCardComponent) {
            this.f77176a = topViewReplaceCardComponent;
        }

        public final Object invoke() {
            return this.f77176a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.topview.TopViewReplaceCardComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/topview/TopViewReplaceCardComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TopViewReplaceCardComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TopViewReplaceCardComponent topViewReplaceCardComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = topViewReplaceCardComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            List mutableList;
            String strValueOf;
            AdInfo adInfo;
            AdBannerData adBannerDataA;
            AdInfo adInfo2;
            AdBannerData adBannerDataA2;
            HolderExtra extra;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TopViewReplaceCardComponent topViewReplaceCardComponent = this.this$0;
                StateFlow pageVisibleStateFlow = topViewReplaceCardComponent.getPageVisibleStateFlow();
                StateFlow state = ((SplashViewModel) this.this$0.f77168n.getValue()).getState();
                PegasusViewModel$special$$inlined$map$2 pegasusViewModel$special$$inlined$map$2 = ((PegasusViewModel) this.this$0.f77167m.getValue()).f79022o;
                this.label = 1;
                Object objB = TopViewReplaceCardComponent.b(topViewReplaceCardComponent, pageVisibleStateFlow, state, pegasusViewModel$special$$inlined$map$2, this);
                obj = objB;
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                TopViewReplaceCardComponent topViewReplaceCardComponent2 = this.this$0;
                gp0.b bVar = (gp0.b) pair.component1();
                List list = (List) pair.component2();
                PegasusHolderData pegasusHolderData = (PegasusHolderData) CollectionsKt.getOrNull(list, 0);
                if (pegasusHolderData != null && (extra = pegasusHolderData.getExtra()) != null && extra.isInsertCardFlush()) {
                    BLog.i("TopViewReplaceCardComponent", "not need insert card, already insert by TopViewCardInjectLogic");
                    return Unit.INSTANCE;
                }
                topViewReplaceCardComponent2.getClass();
                C0.c(bVar.g(), "start bannerInjection bannerId=", "TopViewReplaceCardComponent");
                List mutableList2 = CollectionsKt.toMutableList(list);
                Iterator it = mutableList2.iterator();
                int i8 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i8 = -1;
                        break;
                    }
                    if (((PegasusHolderData) it.next()) instanceof gp0.c) {
                        break;
                    }
                    i8++;
                }
                ViewModelLazy viewModelLazy = topViewReplaceCardComponent2.f77167m;
                if (i8 == -1) {
                    PegasusHolderData pegasusHolderData2 = (PegasusHolderData) CollectionsKt.first(mutableList2);
                    HolderStyle holderStyle = pegasusHolderData2.getHolderStyle();
                    BasePegasusData basePegasusData = (BasePegasusData) pegasusHolderData2;
                    gp0.c cVarB = com.bilibili.pegasus.components.topview.a.b(bVar, basePegasusData.getTrackId());
                    if (com.bilibili.pegasus.components.topview.a.c(bVar, cVarB)) {
                        if (holderStyle.isDoubleColumnCard() && holderStyle.isSmallCard()) {
                            BLog.i("TopViewReplaceCardComponent", "insert topview banner [double column]");
                            PegasusViewModel pegasusViewModel = (PegasusViewModel) viewModelLazy.getValue();
                            pegasusViewModel.getClass();
                            pegasusViewModel.z(pegasusViewModel, new h(cVarB, 0));
                            AdBannerData adBannerDataA3 = bVar.a();
                            IAdReportInfo reportInfo = null;
                            if (adBannerDataA3 != null) {
                                AdInfo adInfo3 = adBannerDataA3.getAdInfo();
                                reportInfo = null;
                                if (adInfo3 != null) {
                                    reportInfo = adInfo3.getReportInfo();
                                }
                            }
                            GAdCoreKt.getGAdReport().uiEvent("topview_banner_mixin_success", ReportPresetKt.toReportPreset(reportInfo));
                        } else if (holderStyle.isDoubleColumnCard() && !holderStyle.isSmallCard()) {
                            defpackage.a.b("insert topview banner [double column] and remove big card:", basePegasusData.getTitle(), "TopViewReplaceCardComponent");
                            C8340D.h(basePegasusData, null, null, null, null);
                            PegasusViewModel pegasusViewModel2 = (PegasusViewModel) viewModelLazy.getValue();
                            pegasusViewModel2.getClass();
                            pegasusViewModel2.z(pegasusViewModel2, new F(pegasusHolderData2, cVarB));
                            AdBannerData adBannerDataA4 = bVar.a();
                            IAdReportInfo reportInfo2 = null;
                            if (adBannerDataA4 != null) {
                                AdInfo adInfo4 = adBannerDataA4.getAdInfo();
                                reportInfo2 = null;
                                if (adInfo4 != null) {
                                    reportInfo2 = adInfo4.getReportInfo();
                                }
                            }
                            GAdCoreKt.getGAdReport().uiEvent("topview_banner_mixin_success", ReportPresetKt.toReportPreset(reportInfo2));
                        } else if (!holderStyle.isDoubleColumnCard()) {
                            BLog.i("TopViewReplaceCardComponent", "insert topview banner [single column]");
                            PegasusViewModel pegasusViewModel3 = (PegasusViewModel) viewModelLazy.getValue();
                            pegasusViewModel3.getClass();
                            pegasusViewModel3.z(pegasusViewModel3, new h(cVarB, 0));
                            AdBannerData adBannerDataA5 = bVar.a();
                            IAdReportInfo reportInfo3 = null;
                            if (adBannerDataA5 != null) {
                                AdInfo adInfo5 = adBannerDataA5.getAdInfo();
                                reportInfo3 = null;
                                if (adInfo5 != null) {
                                    reportInfo3 = adInfo5.getReportInfo();
                                }
                            }
                            GAdCoreKt.getGAdReport().uiEvent("topview_banner_mixin_success", ReportPresetKt.toReportPreset(reportInfo3));
                        }
                    }
                } else {
                    gp0.c cVar = (gp0.c) mutableList2.get(i8);
                    List<gp0.b> listK = cVar.k();
                    if (listK != null && (mutableList = CollectionsKt.toMutableList(listK)) != null) {
                        if (!mutableList.isEmpty() && ((gp0.b) CollectionsKt.first(mutableList)).p() && DDConfig.INSTANCE.getAllowRemoveAdFirstFrame()) {
                            gp0.b bVar2 = (gp0.b) CollectionsKt.firstOrNull(mutableList);
                            r.a("existing banner: remove first banner ad frame=> ", (bVar2 == null || (adBannerDataA2 = bVar2.a()) == null) ? null : adBannerDataA2.getTitle(), " ", "TopViewReplaceCardComponent");
                            gp0.b bVar3 = (gp0.b) CollectionsKt.getOrNull(mutableList, 0);
                            C8340D.h(cVar, bVar3 != null ? com.bilibili.pegasus.components.topview.a.d(bVar3) : null, bVar3 != null ? bVar3.getType() : null, (bVar3 == null || (adBannerDataA = bVar3.a()) == null || (adInfo2 = adBannerDataA.getAdInfo()) == null) ? null : String.valueOf(adInfo2.getCreativeId()), 1);
                            mutableList.remove(0);
                        } else if (mutableList.size() >= DDConfig.INSTANCE.getMinFramesToAllowDelete()) {
                            int lastIndex = CollectionsKt.getLastIndex(mutableList);
                            gp0.b bVar4 = (gp0.b) mutableList.remove(CollectionsKt.getLastIndex(mutableList));
                            String strD = com.bilibili.pegasus.components.topview.a.d(bVar4);
                            String type = bVar4.getType();
                            if (bVar4.p()) {
                                AdBannerData adBannerDataA6 = bVar4.a();
                                strValueOf = (adBannerDataA6 == null || (adInfo = adBannerDataA6.getAdInfo()) == null) ? null : String.valueOf(adInfo.getCreativeId());
                            } else {
                                strValueOf = String.valueOf(bVar4.g());
                            }
                            C8340D.h(cVar, strD, type, strValueOf, Integer.valueOf(lastIndex + 1));
                            BLog.i("TopViewReplaceCardComponent", l.a(bVar4.getIndex(), bVar4.g(), "existing banner: remove last banner frame=> id:", ", index:"));
                        }
                        mutableList.add(0, bVar);
                        if (com.bilibili.pegasus.components.topview.a.c(bVar, cVar)) {
                            gp0.c cVarF = gp0.c.f(cVar, mutableList);
                            cVarF.f120535A.setInsertCardFlush(true);
                            BLog.i("TopViewReplaceCardComponent", "existing banner: replace topview banner");
                            PegasusViewModel pegasusViewModel4 = (PegasusViewModel) viewModelLazy.getValue();
                            pegasusViewModel4.getClass();
                            pegasusViewModel4.z(pegasusViewModel4, new F(cVar, cVarF));
                            AdBannerData adBannerDataA7 = bVar.a();
                            IAdReportInfo reportInfo4 = null;
                            if (adBannerDataA7 != null) {
                                AdInfo adInfo6 = adBannerDataA7.getAdInfo();
                                reportInfo4 = null;
                                if (adInfo6 != null) {
                                    reportInfo4 = adInfo6.getReportInfo();
                                }
                            }
                            GAdCoreKt.getGAdReport().uiEvent("topview_banner_mixin_success", ReportPresetKt.toReportPreset(reportInfo4));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.pegasus.components.topview.TopViewReplaceCardComponent r9, kotlinx.coroutines.flow.StateFlow r10, kotlinx.coroutines.flow.StateFlow r11, com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.topview.TopViewReplaceCardComponent.b(com.bilibili.pegasus.components.topview.TopViewReplaceCardComponent, kotlinx.coroutines.flow.StateFlow, kotlinx.coroutines.flow.StateFlow, com.bilibili.pegasus.vm.PegasusViewModel$special$$inlined$map$2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean getComponentEnable() {
        return this.f77166l;
    }

    @NotNull
    public final String getComponentName() {
        return this.f77165k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
