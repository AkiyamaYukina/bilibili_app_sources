package com.bilibili.ogv.operation.entrance.filmlist;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import bz0.C5175a;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.supermenu.SuperMenu;
import com.bilibili.app.comm.supermenu.share.q;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ogv.operation.entrance.filmlist.OGVFilmListService;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.relation.FollowStateManager;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListFragment.class */
@StabilityInferred(parameters = 0)
public final class OGVFilmListFragment extends BaseFragment implements IPvTracker, Oj0.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final KProperty<Object>[] f69988l = {new MutablePropertyReference0Impl(OGVFilmListFragment.class, "guidePopupShowed", "<v#0>", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69990c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public SuperMenu f69994g;

    @Nullable
    public OGVFilmListPage h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public o f69995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f69996j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f69989b = LazyKt.lazy(new C5175a(this, 2));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f69991d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f69992e = "pgc.operation-playlist";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f69993f = "pgc.operation-playlist.0.0";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Boolean> f69997k = io.reactivex.rxjava3.subjects.a.d(Boolean.FALSE);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListFragment$a.class */
    public final class a extends q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f69998a = "pgc.operation-playlist.list.share.click";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OGVFilmListFragment f69999b;

        public a(OGVFilmListFragment oGVFilmListFragment) {
            this.f69999b = oGVFilmListFragment;
        }

        public final void onFetchFailed(int i7) {
            OGVFilmListFragment oGVFilmListFragment = this.f69999b;
            ToastHelper.showToastShort(oGVFilmListFragment.getContext(), 2131822095);
            oGVFilmListFragment.f69994g = null;
        }

        public final void onFetchSuccess(@NotNull SuperMenu superMenu) {
            superMenu.scene("").spmid(this.f69998a).show();
            this.f69999b.f69994g = superMenu;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.entrance.filmlist.OGVFilmListFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListFragment$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final View $view;
        int label;
        final OGVFilmListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OGVFilmListFragment oGVFilmListFragment, View view, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oGVFilmListFragment;
            this.$view = view;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$view, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OGVFilmListService.f70027a.getClass();
                OGVFilmListService oGVFilmListService = OGVFilmListService.a.f70029b;
                int i8 = this.this$0.f69990c;
                String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                this.label = 1;
                Object filmListPageData = oGVFilmListService.getFilmListPageData(i8, strCurrentPolarisActionId, this);
                obj = filmListPageData;
                if (filmListPageData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
            OGVFilmListFragment oGVFilmListFragment = this.this$0;
            View view = this.$view;
            if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
                BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
                BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
                BLog.w("OGVFilmListFragment$onViewCreated$1-invokeSuspend", "[ogv-operation-OGVFilmListFragment$onViewCreated$1-invokeSuspend] " + biliApiException.getMessage(), biliApiException);
            } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
                Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
                BLog.w("OGVFilmListFragment$onViewCreated$1-invokeSuspend", "[ogv-operation-OGVFilmListFragment$onViewCreated$1-invokeSuspend] " + exception.getMessage(), exception);
            } else {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                OGVFilmListPage oGVFilmListPage = (OGVFilmListPage) ((BiliApiResponse.Success) biliApiResponse).getData();
                oGVFilmListFragment.h = oGVFilmListPage;
                p pVarKf = oGVFilmListFragment.kf();
                int color = ContextCompat.getColor(view.getContext(), R$color.Ba0_u);
                if (!Intrinsics.areEqual(oGVFilmListPage, pVarKf.f70057b)) {
                    pVarKf.f70057b = oGVFilmListPage;
                    pVarKf.notifyPropertyChanged(428);
                }
                if (color != pVarKf.f70065k) {
                    pVarKf.f70065k = color;
                    pVarKf.notifyPropertyChanged(426);
                }
                String str = oGVFilmListPage.f70002c;
                if (!Intrinsics.areEqual(str, pVarKf.f70061f)) {
                    pVarKf.f70061f = str;
                    pVarKf.notifyPropertyChanged(57);
                }
                String str2 = pVarKf.f70073s;
                String str3 = oGVFilmListPage.f70002c;
                if (!Intrinsics.areEqual(str3, str2)) {
                    pVarKf.f70073s = str3;
                    pVarKf.notifyPropertyChanged(681);
                }
                boolean zIsBlank = StringsKt.isBlank(oGVFilmListPage.f70009k);
                MutableState mutableState = pVarKf.f70069o;
                mutableState.setValue(Boolean.valueOf(!zIsBlank));
                boolean z6 = !StringsKt.isBlank(oGVFilmListPage.f70010l);
                if (z6 != pVarKf.f70071q) {
                    pVarKf.f70071q = z6;
                    pVarKf.notifyPropertyChanged(557);
                }
                boolean z7 = oGVFilmListPage.a() != null;
                if (z7 != pVarKf.f70072r) {
                    pVarKf.f70072r = z7;
                    pVarKf.notifyPropertyChanged(685);
                }
                FilmListUpInfo filmListUpInfoA = oGVFilmListPage.a();
                if (filmListUpInfoA != null) {
                    String str4 = pVarKf.f70073s;
                    String str5 = filmListUpInfoA.f69985c;
                    if (!Intrinsics.areEqual(str5, str4)) {
                        pVarKf.f70073s = str5;
                        pVarKf.notifyPropertyChanged(681);
                    }
                    String str6 = pVarKf.f70074t;
                    String str7 = filmListUpInfoA.f69984b;
                    if (!Intrinsics.areEqual(str7, str6)) {
                        pVarKf.f70074t = str7;
                        pVarKf.notifyPropertyChanged(683);
                    }
                    boolean z8 = pVarKf.f70077w;
                    boolean z9 = filmListUpInfoA.f69986d;
                    if (z9 != z8) {
                        pVarKf.f70077w = z9;
                        pVarKf.notifyPropertyChanged(232);
                    }
                    OGVFilmListFragment oGVFilmListFragment2 = pVarKf.f70058c;
                    if (oGVFilmListFragment2 != null) {
                        o oVar = new o(pVarKf);
                        oGVFilmListFragment2.f69995i = oVar;
                        long j7 = filmListUpInfoA.f69983a;
                        oGVFilmListFragment2.f69996j = j7;
                        FollowStateManager.Companion.getInstance().register(j7, oVar);
                    }
                }
                String str8 = pVarKf.h;
                String str9 = oGVFilmListPage.f70001b;
                if (!Intrinsics.areEqual(str9, str8)) {
                    pVarKf.h = str9;
                    pVarKf.notifyPropertyChanged(640);
                }
                String str10 = pVarKf.f70068n;
                String str11 = oGVFilmListPage.f70004e;
                if (!Intrinsics.areEqual(str11, str10)) {
                    pVarKf.f70068n = str11;
                    pVarKf.notifyPropertyChanged(739);
                }
                boolean z10 = pVarKf.f70076v;
                boolean z11 = oGVFilmListPage.h;
                if (z11 != z10) {
                    pVarKf.f70076v = z11;
                    pVarKf.notifyPropertyChanged(209);
                }
                int i9 = pVarKf.f70075u;
                int i10 = oGVFilmListPage.f70005f;
                if (i10 != i9) {
                    pVarKf.f70075u = i10;
                    pVarKf.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FACE_OCCLUSION_SEGMENT_MIN_THRESHOLD);
                }
                for (OGVFilmListPageItem oGVFilmListPageItem : oGVFilmListPage.f70006g) {
                    q qVar = new q(oGVFilmListPageItem.f70013a, oGVFilmListPageItem, pVarKf.f70058c, pVarKf.f70059d, pVarKf.f70060e);
                    String str12 = qVar.f70085i;
                    String str13 = oGVFilmListPageItem.f70014b;
                    if (!Intrinsics.areEqual(str13, str12)) {
                        qVar.f70085i = str13;
                        qVar.notifyPropertyChanged(128);
                    }
                    String str14 = qVar.f70086j;
                    String str15 = oGVFilmListPageItem.f70015c;
                    if (!Intrinsics.areEqual(str15, str14)) {
                        qVar.f70086j = str15;
                        qVar.notifyPropertyChanged(640);
                    }
                    String str16 = qVar.f70087k;
                    String str17 = oGVFilmListPageItem.f70021j;
                    if (!Intrinsics.areEqual(str17, str16)) {
                        qVar.f70087k = str17;
                        qVar.notifyPropertyChanged(523);
                    }
                    String str18 = qVar.f70088l;
                    String str19 = oGVFilmListPageItem.f70017e;
                    if (!Intrinsics.areEqual(str19, str18)) {
                        qVar.f70088l = str19;
                        qVar.notifyPropertyChanged(90);
                    }
                    String str20 = qVar.f70089m;
                    String str21 = oGVFilmListPageItem.f70018f;
                    if (!Intrinsics.areEqual(str21, str20)) {
                        qVar.f70089m = str21;
                        qVar.notifyPropertyChanged(91);
                    }
                    String str22 = qVar.f70090n;
                    String str23 = oGVFilmListPageItem.f70019g;
                    if (!Intrinsics.areEqual(str23, str22)) {
                        qVar.f70090n = str23;
                        qVar.notifyPropertyChanged(3);
                    }
                    String str24 = qVar.f70092p;
                    String str25 = oGVFilmListPageItem.h;
                    if (!Intrinsics.areEqual(str25, str24)) {
                        qVar.f70092p = str25;
                        qVar.notifyPropertyChanged(437);
                    }
                    boolean zA = oGVFilmListPageItem.a();
                    if (zA != qVar.f70093q) {
                        qVar.f70093q = zA;
                        qVar.notifyPropertyChanged(216);
                    }
                    int i11 = qVar.f70094r;
                    int i12 = oGVFilmListPageItem.f70020i;
                    if (i12 != i11) {
                        qVar.f70094r = i12;
                        qVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FACE_OCCLUSION_SEGMENT_MIN_THRESHOLD);
                    }
                    String str26 = qVar.f70091o;
                    String str27 = oGVFilmListPageItem.f70022k;
                    if (!Intrinsics.areEqual(str27, str26)) {
                        qVar.f70091o = str27;
                        qVar.notifyPropertyChanged(476);
                    }
                    pVarKf.f70067m.add(qVar);
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    Neurons.reportExposure$default(false, G.p.a(pVarKf.f70059d, ".list.plaza.show"), oGVFilmListPage.f70012n, (List) null, 8, (Object) null);
                }
                if (pVarKf.f70072r) {
                    Neurons.reportExposure$default(false, G.p.a(pVarKf.f70059d, ".list.up.show"), oGVFilmListPage.f70012n, (List) null, 8, (Object) null);
                    Neurons.reportExposure$default(false, G.p.a(pVarKf.f70059d, ".list.upfollow.show"), oGVFilmListPage.f70012n, (List) null, 8, (Object) null);
                }
                if (pVarKf.f70071q) {
                    Neurons.reportExposure$default(false, G.p.a(pVarKf.f70059d, ".list.comment.show"), oGVFilmListPage.f70012n, (List) null, 8, (Object) null);
                }
                Neurons.reportExposure$default(false, G.p.a(pVarKf.f70059d, ".list.collect.show"), oGVFilmListPage.f70012n, (List) null, 8, (Object) null);
                Neurons.reportExposure$default(false, G.p.a(pVarKf.f70059d, ".list.share.show"), oGVFilmListPage.f70012n, (List) null, 8, (Object) null);
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(oGVFilmListFragment), (CoroutineContext) null, (CoroutineStart) null, new OGVFilmListFragment$onViewCreated$1$1$1(oGVFilmListFragment, oGVFilmListPage, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // Oj0.e
    @NotNull
    public final String getPageId() {
        return this.f69992e;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "pgc.operation-playlist.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        BiliAccountInfo biliAccountInfo = com.bilibili.ogv.infra.account.a.f67851a;
        VipUserInfo vipInfo = biliAccountInfo.getVipInfo();
        bundle.putString("vip_status", String.valueOf(vipInfo != null ? vipInfo.getVipStatus() : 0));
        VipUserInfo vipInfo2 = biliAccountInfo.getVipInfo();
        int vipType = 0;
        if (vipInfo2 != null) {
            vipType = vipInfo2.getVipType();
        }
        bundle.putString("vip_type", String.valueOf(vipType));
        bundle.putString("from_out_spmid", this.f69991d);
        bundle.putString("playlist_id", String.valueOf(this.f69990c));
        return bundle;
    }

    public final void jf(long j7, boolean z6) {
        BuildersKt.launch$default(LifecycleKt.getCoroutineScope(getLifecycle()), (CoroutineContext) null, (CoroutineStart) null, new OGVFilmListFragment$followUp$1(z6, j7, this, null), 3, (Object) null);
    }

    public final p kf() {
        return (p) this.f69989b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    @Override // androidx.fragment.app.Fragment
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r8, @org.jetbrains.annotations.Nullable android.view.ViewGroup r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.entrance.filmlist.OGVFilmListFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        SuperMenu superMenu = this.f69994g;
        if (superMenu != null) {
            superMenu.cancel();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (EntryPointKt.getMemleakOptEnable()) {
            p pVarKf = kf();
            if (!Intrinsics.areEqual((Object) null, pVarKf.f70058c)) {
                pVarKf.f70058c = null;
                pVarKf.notifyPropertyChanged(1);
            }
        }
        this.f69997k.onComplete();
        com.bilibili.ogv.infra.legacy.exposure.d.g(this, p3());
        o oVar = this.f69995i;
        if (oVar != null) {
            FollowStateManager.Companion.getInstance().unregister(this.f69996j, oVar);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f69997k.onNext(Boolean.FALSE);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f69997k.onNext(Boolean.TRUE);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        p pVarKf = kf();
        if (!Intrinsics.areEqual(this, pVarKf.f70058c)) {
            pVarKf.f70058c = this;
            pVarKf.notifyPropertyChanged(1);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, view, null), 3, (Object) null);
    }

    @Override // Oj0.e
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Boolean> x8() {
        return this.f69997k;
    }
}
