package com.bilibili.search2.result.all;

import Ps0.C2787h;
import Yt0.C3151e;
import Yt0.C3153g;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.search2.api.FilterValue;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import com.bilibili.search2.result.ogv.SearchColorModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.auth.v2.BiliAuthFragmentV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/ResultAllDropDown.class */
@StabilityInferred(parameters = 0)
public final class ResultAllDropDown {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SearchResultAllFragment f87157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LifecycleCoroutineScope f87158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SearchResultAllViewModel f87159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C3153g f87160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Context f87161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList<C3151e> f87162f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f87163g = true;

    @NotNull
    public final b h = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/ResultAllDropDown$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f87164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f87165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f87166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f87167d;

        public a(@NotNull String str, @NotNull String str2, boolean z6, boolean z7) {
            this.f87164a = str;
            this.f87165b = str2;
            this.f87166c = z6;
            this.f87167d = z7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f87164a, aVar.f87164a) && Intrinsics.areEqual(this.f87165b, aVar.f87165b) && this.f87166c == aVar.f87166c && this.f87167d == aVar.f87167d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87167d) + androidx.compose.animation.z.a(I.E.a(this.f87164a.hashCode() * 31, 31, this.f87165b), 31, this.f87166c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("FilterParam(areaForNeuron=");
            sb.append(this.f87164a);
            sb.append(", subModuleForNeuron=");
            sb.append(this.f87165b);
            sb.append(", reChoose=");
            sb.append(this.f87166c);
            sb.append(", needSearch=");
            return androidx.appcompat.app.i.a(sb, this.f87167d, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/ResultAllDropDown$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResultAllDropDown f87168a;

        public b(ResultAllDropDown resultAllDropDown) {
            this.f87168a = resultAllDropDown;
        }

        public final void a(C3153g c3153g, boolean z6, boolean z7) {
            SearchColorModel searchColorModelB;
            MutableLiveData<Boolean> mutableLiveData;
            SearchColorModel searchColorModelB2;
            MutableLiveData<Boolean> mutableLiveData2;
            T9.e.a("onPopupWindowShow show:", "ResultAllDropDown", z6);
            com.bilibili.search2.result.w wVar = c3153g.f29220g;
            if (wVar != null && wVar.f88594c != z6) {
                wVar.f88594c = z6;
                wVar.a();
            }
            ResultAllDropDown resultAllDropDown = this.f87168a;
            final OgvThemeColorHelper ogvThemeColorHelperK2 = resultAllDropDown.f87157a.K2();
            boolean zAreEqual = (ogvThemeColorHelperK2 == null || (searchColorModelB2 = ogvThemeColorHelperK2.b()) == null || (mutableLiveData2 = searchColorModelB2.f88303n) == null) ? false : Intrinsics.areEqual(mutableLiveData2.getValue(), Boolean.TRUE);
            if (z6 && zAreEqual && ogvThemeColorHelperK2 != null && (searchColorModelB = ogvThemeColorHelperK2.b()) != null && (mutableLiveData = searchColorModelB.h) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            SearchResultAllFragment searchResultAllFragment = resultAllDropDown.f87157a;
            boolean z8 = z6 ? !searchResultAllFragment.kf() : false;
            SearchResultAllViewModel searchResultAllViewModel = resultAllDropDown.f87159c;
            if (searchResultAllViewModel.h1() != null && z7) {
                SearchResultAll searchResultAllH1 = searchResultAllViewModel.h1();
                String str = z6 ? "open" : "close";
                boolean z9 = Xs0.b.f28321a;
                HashMap map = new HashMap();
                map.put("query", searchResultAllH1.query);
                map.put("trackid", searchResultAllH1.trackId);
                map.put("abtestid", searchResultAllH1.expStr);
                map.put("action_type", str);
                Neurons.reportClick(false, "search.search-result.filter-button.0.click", map);
            }
            if (ogvThemeColorHelperK2 != null) {
                if (z8 && zAreEqual) {
                    final int i7 = 0;
                    searchResultAllFragment.Sf().a.post(new Runnable(ogvThemeColorHelperK2, i7) { // from class: com.bilibili.search2.result.all.k

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f87295a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f87296b;

                        {
                            this.f87295a = i7;
                            this.f87296b = ogvThemeColorHelperK2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (this.f87295a) {
                                case 0:
                                    ((OgvThemeColorHelper) this.f87296b).b().h.setValue(Boolean.TRUE);
                                    break;
                                default:
                                    BiliAuthFragmentV2 biliAuthFragmentV2 = (BiliAuthFragmentV2) this.f87296b;
                                    BLog.i("Auth_BiliAuthFragment", "FacialRecognition::onRequestStart");
                                    Pb1.m mVar = biliAuthFragmentV2.f;
                                    if (mVar != null) {
                                        mVar.b();
                                        HandlerThreads.postDelayed(0, mVar.i, 500L);
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    ogvThemeColorHelperK2.b().h.setValue(Boolean.valueOf(z6));
                }
                if (ogvThemeColorHelperK2.d()) {
                    return;
                }
                com.bilibili.search2.result.w wVar2 = c3153g.f29220g;
                if (z6) {
                    if (searchResultAllViewModel.f87233A || wVar2 == null || wVar2.f88592a.getVisibility() != 0) {
                        return;
                    }
                    C3153g.c(false);
                    return;
                }
                boolean z10 = false;
                if (wVar2 != null) {
                    z10 = false;
                    if (wVar2.f88592a.getVisibility() == 0) {
                        z10 = true;
                    }
                }
                searchResultAllViewModel.f87233A = z10;
                C3153g.c(true);
            }
        }
    }

    public ResultAllDropDown(@NotNull SearchResultAllFragment searchResultAllFragment, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull SearchResultAllViewModel searchResultAllViewModel, @NotNull C3153g c3153g) {
        this.f87157a = searchResultAllFragment;
        this.f87158b = lifecycleCoroutineScope;
        this.f87159c = searchResultAllViewModel;
        this.f87160d = c3153g;
        this.f87161e = searchResultAllFragment.getContext();
    }

    public static void c(C2787h c2787h, C3151e c3151e, com.bilibili.search2.result.base.j jVar) {
        int i7 = 0;
        for (Object obj : c2787h.f19202b) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            FilterValue filterValue = (FilterValue) obj;
            C3151e c3151e2 = new C3151e();
            ((Hh1.c) c3151e2).a = filterValue.getValue();
            ((Hh1.c) c3151e2).d = filterValue.getParam();
            c3151e2.f29210l = c2787h.f19205e;
            c3151e2.f29209k = filterValue.getSubModuleForNeuron();
            c3151e2.f29211m = c2787h.f19206f;
            if (Intrinsics.areEqual(filterValue.getValue(), "time_customized")) {
                c3151e2.h = true;
            }
            ((Hh1.c) c3151e2).b = jVar.b(i7);
            List<C3151e> list = c3151e.f29207i;
            if (list != null) {
                ((ArrayList) list).add(c3151e2);
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String[] a() {
        /*
            r3 = this;
            r0 = r3
            android.content.Context r0 = r0.f87161e
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1f
            r0 = r4
            android.content.res.Resources r0 = r0.getResources()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1f
            r0 = r4
            r1 = 2130903134(0x7f03005e, float:1.7413077E38)
            java.lang.String[] r0 = r0.getStringArray(r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L24
        L1f:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r4 = r0
        L24:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.ResultAllDropDown.a():java.lang.String[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(@org.jetbrains.annotations.Nullable Ps0.C r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.ResultAllDropDown.b(Ps0.C):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.ResultAllDropDown.d():void");
    }
}
