package com.bilibili.ogv.operation.entrance;

import Ak0.d;
import Dk0.b;
import Nl0.f;
import Nl0.i;
import Pk0.w;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.media.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.FragmentManager;
import com.bilibili.app.authorspace.local.service.j;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.ogv.infra.util.e;
import com.bilibili.ogv.opbase.BangumiFragmentAnimStoreVo;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogv.opbase.HomeRecommendPage;
import com.bilibili.ogv.opbase.InComing;
import com.bilibili.ogv.opbase.ModuleMine;
import com.bilibili.ogv.opbase.RecommendModule;
import com.bilibili.ogv.operation.api.RemoteLogicService;
import com.bilibili.ogv.operation.entrance.BangumiOperationFragmentV4;
import com.bilibili.ogv.operation.incoming.BangumiAnimationDialogFragment;
import com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4;
import com.bilibili.ogv.operation.modular.modules.C5474e;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.okretro.call.rxjava.c;
import com.bilibili.playerbizcommon.utils.PlayUrlFlagsManager;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.google.gson.JsonParseException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.C8509b;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/BangumiOperationFragmentV4.class */
@StabilityInferred(parameters = 0)
public final class BangumiOperationFragmentV4 extends BangumiBaseModularFragmentV4 implements IPvTracker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f69966A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f69969t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f69971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f69972w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public BangumiAnimationDialogFragment f69974y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f69975z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f69967r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f69968s = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public String f69970u = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public Bundle f69973x = new Bundle();

    public static Single sf(String str, String str2, String str3, boolean z6) {
        return b.f2961a.operationPageV2(str, str2, str3, z6 ? 1 : 0, null, PlayUrlFlagsManager.getFnVer(), PlayUrlFlagsManager.getFnVal(), IjkOptionsHelper.isSupport4K() ? "1" : "0", f.i(), GAdCoreKt.getGAdExtra().get(), Hj0.b.a() ? "1" : "0");
    }

    @Override // Oj0.e
    @NotNull
    public final String getPageId() {
        return C8509b.a(this.f69971v, this.f69968s, "-");
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4
    @NotNull
    public final String getPageName() {
        return this.f69967r;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final String getPvEventId() {
        return this.f69968s.length() == 0 ? null : a.a("pgc.", this.f69968s, ".0.0.pv");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return this.f69973x;
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4
    public final boolean jf() {
        HomeRecommendPage homeRecommendPage;
        InComing inComingB;
        int i7;
        BangumiFragmentAnimStoreVo bangumiFragmentAnimStoreVo;
        int iAbs;
        long jMid = com.bilibili.ogv.infra.account.a.f67852b.mid();
        String str = getPageId() + jMid;
        Lazy lazy = i.f17294a;
        long jLongValue = ((Number) i.a(C4496a.a("tab_resource_anim_", str), 0L)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((jLongValue > 0 && Nl0.a.b(jLongValue, jCurrentTimeMillis)) || (homeRecommendPage = this.f70316o) == null || (inComingB = homeRecommendPage.b()) == null || (i7 = inComingB.f69847c) <= 0) {
            return false;
        }
        String str2 = inComingB.f69845a;
        if (str2.length() <= 0) {
            str2 = inComingB.f69846b;
            if (str2.length() <= 0) {
                return false;
            }
        }
        String strA = j.a(jMid, str2);
        try {
            bangumiFragmentAnimStoreVo = (BangumiFragmentAnimStoreVo) JsonUtilKt.parseJson((String) i.a("tab_resource_anim_" + ByteString.Companion.encodeUtf8(strA).md5().hex(), ""), new d().getType());
        } catch (JsonParseException e7) {
            e.b(e7);
            bangumiFragmentAnimStoreVo = null;
        }
        if (bangumiFragmentAnimStoreVo == null) {
            return true;
        }
        Long l7 = bangumiFragmentAnimStoreVo.f69673a;
        if ((l7 != null ? l7.longValue() : 0L) > 0) {
            Calendar calendarC = Nl0.a.c(bangumiFragmentAnimStoreVo.f69673a.longValue());
            Calendar calendarC2 = Nl0.a.c(jCurrentTimeMillis);
            if (calendarC == null || calendarC2 == null) {
                iAbs = -1;
            } else {
                int i8 = calendarC.get(1);
                int i9 = calendarC2.get(1);
                int i10 = calendarC.get(6);
                int i11 = calendarC2.get(6);
                if (i8 != i9) {
                    int i12 = 0;
                    while (i8 < i9) {
                        i12 = ((i8 % 4 != 0 || i8 % 100 == 0) && i8 % 400 != 0) ? i12 + 365 : i12 + 366;
                        i8++;
                    }
                    iAbs = (i11 - i10) + i12;
                } else {
                    iAbs = Math.abs(i11 - i10);
                }
            }
            if (iAbs >= 7) {
                String strHex = ByteString.Companion.encodeUtf8(strA).md5().hex();
                Lazy lazy2 = i.f17294a;
                String strA2 = C4496a.a("tab_resource_anim_", strHex);
                SharedPreferences.Editor editorEdit = i.b().edit();
                editorEdit.remove(strA2);
                editorEdit.apply();
                return true;
            }
        }
        if (bangumiFragmentAnimStoreVo.f69675c >= i7) {
            return false;
        }
        Long l8 = bangumiFragmentAnimStoreVo.f69674b;
        return (l8 != null ? l8.longValue() : 0L) <= 0 || !Nl0.a.b(bangumiFragmentAnimStoreVo.f69674b.longValue(), jCurrentTimeMillis);
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4
    @Nullable
    public final Single<HomeRecommendPage> lf() {
        return this.f69966A ? sf(this.f69967r, this.f69970u, this.f70315n, false) : null;
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4
    @NotNull
    public final Single<HomeRecommendPage> mf() {
        Single<HomeRecommendPage> singleOperationPage;
        if (this.f69966A) {
            singleOperationPage = sf(this.f69967r, this.f69970u, this.f70315n, true);
        } else {
            String str = this.f69967r;
            String str2 = this.f69970u;
            RemoteLogicService remoteLogicService = b.f2961a;
            Long l7 = Ak0.e.f328a.get(str + "_" + str2);
            singleOperationPage = remoteLogicService.operationPage(str, str2, l7 != null ? l7.longValue() : 0L, null, PlayUrlFlagsManager.getFnVer(), PlayUrlFlagsManager.getFnVal(), IjkOptionsHelper.isSupport4K() ? "1" : "0", f.i(), GAdCoreKt.getGAdExtra().get(), Hj0.b.a() ? "1" : "0");
        }
        return singleOperationPage;
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4
    @NotNull
    public final Map<String, String> nf() {
        return MapsKt.mapOf(new Pair("tab_id", String.valueOf(this.f69972w)));
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4
    @NotNull
    public final String of() {
        return this.f69968s;
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("page_id");
            String str = string;
            if (string == null) {
                str = "";
            }
            this.f69967r = str;
            String string2 = arguments.getString("page_name");
            String str2 = string2;
            if (string2 == null) {
                str2 = "";
            }
            this.f69968s = str2;
            String string3 = arguments.getString("sub_page_id");
            String str3 = string3;
            if (string3 == null) {
                str3 = "";
            }
            this.f69970u = str3;
            this.f69971v = arguments.getInt("page_index");
            this.f69972w = arguments.getLong("tab_id");
            Bundle bundle2 = arguments.getBundle("report");
            Bundle bundle3 = bundle2;
            if (bundle2 == null) {
                bundle3 = new Bundle();
            }
            this.f69973x = bundle3;
            String string4 = arguments.getString("tab_name");
            String str4 = string4;
            if (string4 == null) {
                str4 = "";
            }
            bundle3.putString("tab_name", str4);
            String string5 = arguments.getString("page_type");
            String str5 = string5;
            if (string5 == null) {
                str5 = "";
            }
            this.f69966A = Intrinsics.areEqual(str5, "");
        }
        this.f70311j = 10;
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (EntryPointKt.getMemleakOptEnable()) {
            this.f69974y = null;
        }
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4
    @NotNull
    public final w pf() {
        return new w(requireActivity(), this, getPageId(), this.f69968s);
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4
    public final void qf() {
        if (this.f69966A) {
            this.f70304b.onNext(Boolean.TRUE);
        }
        super.qf();
        this.f69975z = true;
        refresh();
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4
    public final void rf() {
        Map<String, String> map;
        if (!this.f69966A) {
            if (Intrinsics.areEqual(this.f70304b.e(), Boolean.TRUE)) {
                tf(null, null);
            }
            g2();
            return;
        }
        HomeRecommendPage homeRecommendPage = this.f70316o;
        if (homeRecommendPage == null || (map = homeRecommendPage.h) == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f69973x.putString(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.bilibili.ogv.operation.modular.base.BangumiBaseModularFragmentV4, com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        BangumiAnimationDialogFragment bangumiAnimationDialogFragment;
        super.setUserVisibleCompat(z6);
        if (z6 && !this.f69969t) {
            tf(null, null);
            return;
        }
        BangumiAnimationDialogFragment bangumiAnimationDialogFragment2 = this.f69974y;
        if (bangumiAnimationDialogFragment2 == null || !bangumiAnimationDialogFragment2.isAdded() || (bangumiAnimationDialogFragment = this.f69974y) == null) {
            return;
        }
        bangumiAnimationDialogFragment.dismissAllowingStateLoss();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [io.reactivex.rxjava3.functions.Consumer, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        PageViewTracker.getInstance().setFragmentVisibility(this, z6);
        if (z6 && this.f69975z && com.bilibili.ogv.infra.account.a.f67852b.isLogin() && kf().getItemCount() != 0) {
            Single<ModuleMine> moduleMine = b.f2961a.getModuleMine(getPageId(), this.f69972w, PlayUrlFlagsManager.getFnVer(), PlayUrlFlagsManager.getFnVal(), IjkOptionsHelper.isSupport4K() ? "1" : "0", f.i(), Hj0.b.a() ? "1" : "0");
            Functions.v vVar = Functions.a;
            c.a(moduleMine.subscribe(new Consumer(this) { // from class: Fk0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiOperationFragmentV4 f6209a;

                {
                    this.f6209a = this;
                }

                public final void accept(Object obj) {
                    Object obj2;
                    w wVarKf = this.f6209a.kf();
                    List<RecommendModule> modules = ((ModuleMine) obj).getModules();
                    wVarKf.getClass();
                    if (modules != null) {
                        Iterator<T> it = modules.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            Object next = it.next();
                            RecommendModule recommendModule = (RecommendModule) next;
                            if (Intrinsics.areEqual("follow", recommendModule != null ? recommendModule.f69903d : null)) {
                                obj2 = next;
                                break;
                            }
                        }
                        RecommendModule recommendModule2 = (RecommendModule) obj2;
                        if (recommendModule2 == null) {
                            return;
                        }
                        Iterator it2 = ((ArrayList) wVarKf.h).iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i7 = -1;
                                break;
                            }
                            Object first = ((Pair) it2.next()).getFirst();
                            RecommendModule recommendModule3 = first instanceof RecommendModule ? (RecommendModule) first : null;
                            if (Intrinsics.areEqual("follow", recommendModule3 != null ? recommendModule3.f69903d : null)) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 == -1) {
                            return;
                        }
                        for (CommonCard commonCard : recommendModule2.b()) {
                            String str = recommendModule2.f69903d;
                            String str2 = str;
                            if (str == null) {
                                str2 = "";
                            }
                            commonCard.f69747a0 = str2;
                            commonCard.f69757e0 = wVarKf.f19018d;
                        }
                        if (recommendModule2.b().isEmpty()) {
                            List<Pair<Object, Integer>> list = wVarKf.h;
                            int i8 = C5474e.f70614a;
                            ((ArrayList) list).set(i7, TuplesKt.to(recommendModule2, 2131499628));
                        } else {
                            List<Pair<Object, Integer>> list2 = wVarKf.h;
                            int i9 = Sk0.b.f22987d;
                            ((ArrayList) list2).set(i7, TuplesKt.to(recommendModule2, 2131499597));
                        }
                        wVarKf.notifyItemChanged(i7);
                    }
                }
            }, (Consumer) new Object()), getLifecycle());
        }
    }

    public final void tf(@Nullable Rect rect, @Nullable Nk0.e eVar) {
        HomeRecommendPage homeRecommendPage;
        InComing inComingB;
        InComing inComingB2;
        this.f69969t = true;
        if (!jf() || (homeRecommendPage = this.f70316o) == null || (inComingB = homeRecommendPage.b()) == null || inComingB.f69848d != 2 || rect == null) {
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        HomeRecommendPage homeRecommendPage2 = this.f70316o;
        if (homeRecommendPage2 == null || (inComingB2 = homeRecommendPage2.b()) == null) {
            return;
        }
        if (this.f69974y == null) {
            BangumiAnimationDialogFragment bangumiAnimationDialogFragment = new BangumiAnimationDialogFragment();
            bangumiAnimationDialogFragment.h = rect;
            bangumiAnimationDialogFragment.f70210i = inComingB2;
            this.f69974y = bangumiAnimationDialogFragment;
        }
        BangumiAnimationDialogFragment bangumiAnimationDialogFragment2 = this.f69974y;
        if (bangumiAnimationDialogFragment2 != null) {
            String str = this.f69968s;
            String pageId = getPageId();
            bangumiAnimationDialogFragment2.h = rect;
            bangumiAnimationDialogFragment2.f70210i = inComingB2;
            bangumiAnimationDialogFragment2.f70212k = str;
            bangumiAnimationDialogFragment2.f70213l = pageId;
            bangumiAnimationDialogFragment2.f70218q = true;
        }
        BangumiAnimationDialogFragment bangumiAnimationDialogFragment3 = this.f69974y;
        if (bangumiAnimationDialogFragment3 == null || bangumiAnimationDialogFragment3.isAdded() || parentFragmentManager.findFragmentByTag("BangumiAnimationDialogFragment") != null) {
            return;
        }
        BangumiAnimationDialogFragment bangumiAnimationDialogFragment4 = this.f69974y;
        if (bangumiAnimationDialogFragment4 != null) {
            if (bangumiAnimationDialogFragment4.isAdded()) {
                parentFragmentManager.beginTransaction().show(bangumiAnimationDialogFragment4).commitAllowingStateLoss();
            } else {
                parentFragmentManager.beginTransaction().add(bangumiAnimationDialogFragment4, "BangumiAnimationDialogFragment").commitAllowingStateLoss();
            }
        }
        parentFragmentManager.executePendingTransactions();
    }
}
