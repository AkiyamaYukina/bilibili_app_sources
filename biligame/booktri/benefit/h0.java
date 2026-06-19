package com.bilibili.biligame.booktri.benefit;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameCopyWriting;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.bean.GameOfficialInfo;
import com.bilibili.biligame.api.bean.gamedetail.ActivityInfoBean;
import com.bilibili.biligame.api.book.AutoDownloadStatus;
import com.bilibili.biligame.api.book.GameBookResp;
import com.bilibili.biligame.bean.BiligameNewGiftDetail;
import com.bilibili.biligame.bean.benefit.GameBenefitAllReceiveBean;
import com.bilibili.biligame.booktri.benefit.AbstractC5291b;
import com.bilibili.biligame.booktri.benefit.AbstractC5292c;
import com.bilibili.biligame.mod.ErrorConfigManager;
import com.bilibili.biligame.report3.GameApiReporterKt;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.ui.coupons.bean.UserCouponsDetailBean;
import com.bilibili.biligame.viewmodel.BaseViewModel;
import com.bilibili.okretro.call.json.JsonUtilKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/h0.class */
@StabilityInferred(parameters = 0)
public final class h0 extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f62398e = LazyKt.lazy(new Ba.c(6));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<AbstractC5292c> f62399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<AbstractC5292c> f62400g;

    @Nullable
    public AutoDownloadStatus h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f62401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f62402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public GameOfficialInfo f62403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f62404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f62405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public List<? extends BiligameMainGame> f62406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f62407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f62408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public String f62409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<AbstractC5291b> f62410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final StateFlow<AbstractC5291b> f62411s;

    public h0() {
        MutableStateFlow<AbstractC5292c> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC5292c.C0343c.f62364a);
        this.f62399f = MutableStateFlow;
        this.f62400g = FlowKt.asStateFlow(MutableStateFlow);
        this.f62401i = "安卓版游戏上线后WIFI下将自动下载";
        this.f62402j = "可在游戏中心-我的-我的预约设置";
        this.f62406n = CollectionsKt.emptyList();
        this.f62408p = "";
        MutableStateFlow<AbstractC5291b> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f62410r = MutableStateFlow2;
        this.f62411s = FlowKt.asStateFlow(MutableStateFlow2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I0(h0 h0Var, BiligameApiResponse biligameApiResponse, int i7) {
        h0Var.getClass();
        int i8 = biligameApiResponse.code;
        MutableStateFlow<AbstractC5291b> mutableStateFlow = h0Var.f62410r;
        if (i8 == -1017) {
            mutableStateFlow.setValue(AbstractC5291b.a.f62358a);
            return;
        }
        MutableStateFlow<AbstractC5292c> mutableStateFlow2 = h0Var.f62399f;
        if (i8 == -905) {
            mutableStateFlow2.setValue(new AbstractC5292c.e(new C5294e(String.valueOf(ErrorConfigManager.INSTANCE.getBookCaptcha(String.valueOf(i8))), h0Var.h, Boolean.valueOf(h0Var.f62405m), h0Var.f62401i, h0Var.f62402j, null, true, CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), null)));
            return;
        }
        if (i8 == -105) {
            h0Var.L0(String.valueOf(i8), "");
            return;
        }
        if (i8 == -101) {
            mutableStateFlow.setValue(AbstractC5291b.C0342b.f62359a);
            mutableStateFlow2.setValue(AbstractC5292c.C0343c.f62364a);
            return;
        }
        List<Integer> reservedGames = null;
        if (i8 != 0) {
            h0Var.L0(String.valueOf(i8), biligameApiResponse.message);
            GameApiReporterKt.reportApiError(BiligameCopyWriting.KEY_BOOK, biligameApiResponse.code, (String) null, MapsKt.mapOf(TuplesKt.to("game_base_id", String.valueOf(i7))));
            return;
        }
        AutoDownloadStatus autoDownloadStatus = h0Var.h;
        boolean z6 = h0Var.f62405m;
        String str = h0Var.f62401i;
        String str2 = h0Var.f62402j;
        GameOfficialInfo gameOfficialInfo = h0Var.f62403k;
        List<? extends BiligameMainGame> listEmptyList = h0Var.f62404l ? h0Var.f62406n : CollectionsKt.emptyList();
        GameBookResp reserveResult = ((GameBenefitAllReceiveBean) biligameApiResponse.data).getReserveResult();
        if (reserveResult != null) {
            reservedGames = reserveResult.getReservedGames();
        }
        List<BiligameNewGiftDetail> giftList = ((GameBenefitAllReceiveBean) biligameApiResponse.data).getGiftList();
        List<BiligameNewGiftDetail> listEmptyList2 = giftList;
        if (giftList == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List<UserCouponsDetailBean> couponList = ((GameBenefitAllReceiveBean) biligameApiResponse.data).getCouponList();
        List<UserCouponsDetailBean> listEmptyList3 = couponList;
        if (couponList == null) {
            listEmptyList3 = CollectionsKt.emptyList();
        }
        List<ActivityInfoBean> activityList = ((GameBenefitAllReceiveBean) biligameApiResponse.data).getActivityList();
        List<ActivityInfoBean> listEmptyList4 = activityList;
        if (activityList == null) {
            listEmptyList4 = CollectionsKt.emptyList();
        }
        mutableStateFlow2.setValue(new AbstractC5292c.e(new C5294e("恭喜您，预约成功", autoDownloadStatus, Boolean.valueOf(z6), str, str2, gameOfficialInfo, false, listEmptyList, listEmptyList2, listEmptyList3, listEmptyList4, reservedGames)));
    }

    public static final String J0(h0 h0Var, String str) {
        JSONObject jSONObject;
        h0Var.getClass();
        if (str == null || str.length() == 0) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = JSON.parseObject(str);
            } catch (Exception e7) {
                jSONObject = new JSONObject();
            }
        }
        ReporterV3 reporterV3 = ReporterV3.INSTANCE;
        jSONObject.put("current_pv_event_id", reporterV3.getSCurPvId());
        String sCurrentClickEventId = reporterV3.getSCurrentClickEventId();
        String str2 = sCurrentClickEventId;
        if (sCurrentClickEventId == null) {
            str2 = "";
        }
        jSONObject.put("current_event_id", str2);
        return JsonUtilKt.toJson(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K0(h0 h0Var, int i7, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, int i8) {
        if ((i8 & 8) != 0) {
            str3 = null;
        }
        if ((i8 & 16) != 0) {
            str4 = null;
        }
        if ((i8 & 32) != 0) {
            str5 = null;
        }
        if ((i8 & 64) != 0) {
            str6 = null;
        }
        if ((i8 & 128) != 0) {
            num = null;
        }
        if ((i8 & 256) != 0) {
            str7 = null;
        }
        if ((i8 & 512) != 0) {
            str8 = null;
        }
        h0Var.f62407o = i7;
        h0Var.f62408p = str;
        h0Var.f62409q = str2;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(h0Var), (CoroutineContext) null, (CoroutineStart) null, new BookTriBenefitViewModel$bookWithRiskControl$1(h0Var, i7, str, str3, str4, str5, str6, num, str7, str8, str2, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L0(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.Nullable java.lang.String r9) {
        /*
            r7 = this;
            com.bilibili.biligame.mod.ErrorConfigManager r0 = com.bilibili.biligame.mod.ErrorConfigManager.INSTANCE
            r12 = r0
            r0 = r12
            r1 = r8
            java.lang.String r0 = r0.getBookCaptchaTitle(r1)
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L1a
            r0 = r9
            r10 = r0
            r0 = r9
            int r0 = r0.length()
            if (r0 != 0) goto L21
        L1a:
            r0 = r12
            r1 = r8
            java.lang.String r0 = r0.getBookCaptcha(r1)
            r10 = r0
        L21:
            com.bilibili.biligame.booktri.benefit.c$b r0 = new com.bilibili.biligame.booktri.benefit.c$b
            r1 = r0
            com.bilibili.biligame.booktri.benefit.d r2 = new com.bilibili.biligame.booktri.benefit.d
            r3 = r2
            r4 = r11
            r5 = r10
            r3.<init>(r4, r5)
            r1.<init>(r2)
            r8 = r0
            r0 = r7
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.biligame.booktri.benefit.c> r0 = r0.f62399f
            r1 = r8
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.h0.L0(java.lang.String, java.lang.String):void");
    }
}
