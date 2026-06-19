package com.bilibili.pegasus.components.interest;

import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageReturnReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestTipsCloseType;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseItemUi;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/e.class */
public final class e {
    @NotNull
    public static final String a() {
        return Fp0.a.f6386a ? "tianma" : "interest";
    }

    public static void b(InterestChainProcess interestChainProcess, int i7, InterestChainErrorCode interestChainErrorCode, String str, Integer num, String str2, int i8) {
        if ((i8 & 4) != 0) {
            interestChainErrorCode = InterestChainErrorCode.NONE;
        }
        if ((i8 & 8) != 0) {
            str = null;
        }
        if ((i8 & 16) != 0) {
            num = null;
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("process", String.valueOf(interestChainProcess.getPathCode())), TuplesKt.to(NotificationCompat.CATEGORY_STATUS, String.valueOf(i7)), TuplesKt.to("error_code", String.valueOf(interestChainErrorCode.getCode())), TuplesKt.to("is_first_start", EnvironmentManager.getInstance().isFirstStart() ? "1" : "0")});
        if (num != null) {
            mapMutableMapOf.put("empty_reason", String.valueOf(num.intValue()));
        }
        if (str != null) {
            mapMutableMapOf.put("strategy", str);
        }
        if (str2 != null) {
            mapMutableMapOf.put("api", str2);
        }
        BLog.i("[Interest]reportInterestChainProcess", "params = " + mapMutableMapOf);
        Neurons.reportExposure$default(true, "main.interest-select.process.0.show", mapMutableMapOf, (List) null, 8, (Object) null);
    }

    public static void c(int i7, long j7, List list, JSONObject jSONObject, String str, String str2, String str3, String str4, int i8, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i9) {
        String str12 = (i9 & 32) != 0 ? "" : str2;
        if ((i9 & 64) != 0) {
            str3 = "";
        }
        if ((i9 & 128) != 0) {
            str4 = "";
        }
        if ((i9 & 256) != 0) {
            i8 = 0;
        }
        if ((i9 & 512) != 0) {
            str5 = null;
        }
        String str13 = (i9 & 1024) != 0 ? com.bilibili.pegasus.request.b.g() ? "1" : "2" : str6;
        String str14 = (i9 & 4096) != 0 ? null : str7;
        String str15 = (i9 & 8192) != 0 ? "" : str8;
        String str16 = (i9 & 16384) != 0 ? "" : str9;
        String str17 = (32768 & i9) != 0 ? "" : str10;
        String str18 = (i9 & 65536) != 0 ? "" : str11;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((InterestChooseItem) it.next()).getId()));
        }
        Pair pair = TuplesKt.to("interest_id_list", d.a(arrayList));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String name = ((InterestChooseItem) it2.next()).getName();
            String str19 = name;
            if (name == null) {
                str19 = "";
            }
            arrayList2.add(str19);
        }
        Pair pair2 = TuplesKt.to("interest_list", d.a(arrayList2));
        if (str == null) {
            str = "";
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{pair, pair2, TuplesKt.to("interest_pos_list", str), TuplesKt.to("content_cnt", String.valueOf(list.size())), TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str13), TuplesKt.to("is_valid_input", "1")});
        if (jSONObject != null && !jSONObject.isEmpty()) {
            mapMutableMapOf.put("extra_select", jSONObject.toString());
        }
        if (str12 != null && !StringsKt.isBlank(str12)) {
            mapMutableMapOf.put("sub_interest_id_list", str12);
        }
        if (str3 != null && !StringsKt.isBlank(str3)) {
            mapMutableMapOf.put("sub_interest_list", str3);
        }
        if (str4 != null && !StringsKt.isBlank(str4)) {
            mapMutableMapOf.put("sub_interest_pos_list", str4);
        }
        if (i8 != 0) {
            mapMutableMapOf.put("sub_content_cnt", String.valueOf(i8));
        }
        if (str5 != null && !StringsKt.isBlank(str5)) {
            mapMutableMapOf.put("extra_msg", str5);
        }
        if (str14 != null) {
            mapMutableMapOf.put("pre_extra_select", str14);
        }
        mapMutableMapOf.put("pre_interest_id_list", str15);
        mapMutableMapOf.put("pre_interest_list", str16);
        mapMutableMapOf.put("pre_sub_interest_id_list", str17);
        mapMutableMapOf.put("pre_sub_interest_list", str18);
        mapMutableMapOf.put("pre_spc_interest_id_list", "");
        mapMutableMapOf.put("pre_spc_interest_list", "");
        Neurons.reportClick(true, "main.interest-select.submit.0.click", mapMutableMapOf);
    }

    public static void d(int i7, long j7, List list, JSONObject jSONObject, String str, String str2, String str3, String str4, int i8, List list2, List list3, List list4, int i9, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10) {
        String str12 = (i10 & 32) != 0 ? "" : str2;
        String str13 = (i10 & 64) != 0 ? "" : str3;
        if ((i10 & 128) != 0) {
            str4 = "";
        }
        if ((i10 & 256) != 0) {
            i8 = 0;
        }
        if ((i10 & 512) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if ((i10 & 1024) != 0) {
            list3 = CollectionsKt.emptyList();
        }
        if ((i10 & 2048) != 0) {
            list4 = CollectionsKt.emptyList();
        }
        if ((i10 & 4096) != 0) {
            i9 = 0;
        }
        String str14 = com.bilibili.pegasus.request.b.g() ? "1" : "2";
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((InterestChooseItemUi) it.next()).getId()));
        }
        Pair pair = TuplesKt.to("interest_id_list", d.a(arrayList));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String name = ((InterestChooseItemUi) it2.next()).getName();
            if (name == null) {
                name = "";
            }
            arrayList2.add(name);
        }
        Pair pair2 = TuplesKt.to("interest_list", d.a(arrayList2));
        if (str == null) {
            str = "";
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{pair, pair2, TuplesKt.to("interest_pos_list", str), TuplesKt.to("content_cnt", String.valueOf(((ArrayList) list).size())), TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str14), TuplesKt.to("is_valid_input", "1")});
        if (!list2.isEmpty()) {
            mapMutableMapOf.put("spc_interest_id_list", d.a(list2));
        }
        List list5 = list3;
        if (!list5.isEmpty()) {
            mapMutableMapOf.put("spc_interest_list", d.a(list3));
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            mapMutableMapOf.put("extra_select", jSONObject.toString());
        }
        if (str12 != null && !StringsKt.isBlank(str12)) {
            mapMutableMapOf.put("sub_interest_id_list", str12);
        }
        if (str13 != null && !StringsKt.isBlank(str13)) {
            mapMutableMapOf.put("sub_interest_list", str13);
        }
        if (str4 != null && !StringsKt.isBlank(str4)) {
            mapMutableMapOf.put("sub_interest_pos_list", str4);
        }
        if (i8 != 0) {
            mapMutableMapOf.put("sub_content_cnt", String.valueOf(i8));
        }
        if (!list5.isEmpty()) {
            mapMutableMapOf.put("spc_interest_list", d.a(list3));
        }
        if (!list4.isEmpty()) {
            mapMutableMapOf.put("spc_interest_pos_list", d.a(list4));
        }
        if (i9 != 0) {
            mapMutableMapOf.put("spc_content_cnt", String.valueOf(i9));
        }
        if (str5 != null) {
            mapMutableMapOf.put("pre_extra_select", str5);
        }
        mapMutableMapOf.put("pre_interest_id_list", str6);
        mapMutableMapOf.put("pre_interest_list", str7);
        mapMutableMapOf.put("pre_sub_interest_id_list", str8);
        mapMutableMapOf.put("pre_sub_interest_list", str9);
        mapMutableMapOf.put("pre_spc_interest_id_list", str10);
        mapMutableMapOf.put("pre_spc_interest_list", str11);
        Neurons.reportClick(true, "main.interest-select.submit.0.click", mapMutableMapOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(int r8, long r9, @org.jetbrains.annotations.NotNull com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason r11, @org.jetbrains.annotations.Nullable com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType r12, @org.jetbrains.annotations.Nullable java.lang.String r13) {
        /*
            java.lang.String r0 = "style"
            r1 = r8
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r15 = r0
            java.lang.String r0 = "unique_id"
            r1 = r9
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r14 = r0
            java.lang.String r0 = "strategy"
            r1 = r13
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r13 = r0
            java.lang.String r0 = "reason"
            r1 = r11
            java.lang.String r1 = r1.getReason()
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r16 = r0
            r0 = r12
            if (r0 == 0) goto L3f
            r0 = r12
            java.lang.String r0 = r0.getType()
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 != 0) goto L42
        L3f:
            java.lang.String r0 = ""
            r11 = r0
        L42:
            r0 = 1
            java.lang.String r1 = "main.interest-select.close.0.click"
            r2 = 5
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            r3 = r2
            r4 = 0
            r5 = r15
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r14
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 3
            r5 = r16
            r3[r4] = r5
            r3 = r2
            r4 = 4
            java.lang.String r5 = "page_type"
            r6 = r11
            kotlin.Pair r5 = kotlin.TuplesKt.to(r5, r6)
            r3[r4] = r5
            java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r2)
            com.bilibili.lib.neuron.api.Neurons.reportClick(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.e.e(int, long, com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason, com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType, java.lang.String):void");
    }

    public static void f(String str, long j7, int i7, boolean z6, int i8) {
        if ((i8 & 8) != 0) {
            str = null;
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("is_initiative", z6 ? "1" : Intrinsics.areEqual(str, "three_point") ? "1" : "0"), TuplesKt.to("strategy", com.bilibili.pegasus.request.b.g() ? "1" : "2")});
        if (str != null) {
            mapMutableMapOf.put(Constant.IN_KEY_REASON, str);
        }
        Neurons.reportClick(true, "main.interest-select.close.0.click", mapMutableMapOf);
    }

    public static void g(int i7, long j7, String str) {
        String strA = a();
        Gp0.a.b(InterestEvent.SHOW, null, null, null, 14);
        Neurons.reportExposure$default(true, "main.interest-select.0.0.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str)}), (List) null, 8, (Object) null);
        b(InterestChainProcess.SHOW, 1, null, str, null, strA, 20);
    }

    public static final void h(int i7, int i8, long j7, long j8, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Neurons.reportClick(true, "main.interest-select.extra-btn.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("interest_id", String.valueOf(j8)), TuplesKt.to("title", str), TuplesKt.to("pos", String.valueOf(i8)), TuplesKt.to("name", str2), TuplesKt.to("action_type", "select"), TuplesKt.to("strategy", str3)}));
    }

    public static void j(int i7, long j7, long j8, String str, int i8, String str2, String str3, boolean z6, int i9) {
        if ((i9 & 64) != 0) {
            str3 = com.bilibili.pegasus.request.b.g() ? "1" : "2";
        }
        if ((i9 & 128) != 0) {
            z6 = false;
        }
        Neurons.reportExposure$default(true, "main.interest-select.extra-btn.0.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("interest_id", String.valueOf(j8)), TuplesKt.to("title", str), TuplesKt.to("pos", String.valueOf(i8)), TuplesKt.to("name", str2), TuplesKt.to("strategy", str3), TuplesKt.to("is_pre_select", z6 ? "1" : "0")}), (List) null, 8, (Object) null);
    }

    public static void k(int i7, long j7, long j8, String str, int i8, String str2, int i9, int i10, boolean z6, String str3, int i11) {
        String str4 = (i11 & 32) != 0 ? "" : str2;
        if ((i11 & 64) != 0) {
            i9 = 0;
        }
        if ((i11 & 128) != 0) {
            i10 = 0;
        }
        Neurons.reportClick(true, "main.interest-select.interest.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("interest_name", str), TuplesKt.to("interest_id", String.valueOf(j8)), TuplesKt.to("interest_pos", String.valueOf(i8)), TuplesKt.to("sub_interest_name", str4 == null ? "" : str4), TuplesKt.to("sub_interest_id", String.valueOf(i9)), TuplesKt.to("sub_interest_pos", String.valueOf(i10)), TuplesKt.to("action_type", z6 ? "select" : "cancel"), TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", (i11 & 512) != 0 ? com.bilibili.pegasus.request.b.g() ? "1" : "2" : str3), TuplesKt.to("is_default_selected", "0")}));
    }

    public static void l(InterestChooseItem interestChooseItem, int i7, String str, int i8, int i9, int i10, long j7, String str2, boolean z6, int i11) {
        String str3 = (i11 & 4) != 0 ? "" : str;
        if ((i11 & 8) != 0) {
            i8 = 0;
        }
        if ((i11 & 16) != 0) {
            i9 = 0;
        }
        String str4 = (i11 & 128) != 0 ? com.bilibili.pegasus.request.b.g() ? "1" : "2" : str2;
        if ((i11 & 256) != 0) {
            z6 = false;
        }
        Pair pair = TuplesKt.to("interest_name", interestChooseItem.getName());
        Pair pair2 = TuplesKt.to("interest_id", String.valueOf(interestChooseItem.getId()));
        Pair pair3 = TuplesKt.to("interest_pos", String.valueOf(i7));
        if (str3 == null) {
            str3 = "";
        }
        Neurons.reportExposure$default(true, "main.interest-select.interest.0.show", MapsKt.mapOf(new Pair[]{pair, pair2, pair3, TuplesKt.to("sub_interest_name", str3), TuplesKt.to("sub_interest_id", String.valueOf(i8)), TuplesKt.to("sub_interest_pos", String.valueOf(i9)), TuplesKt.to("style", String.valueOf(i10)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str4), TuplesKt.to("is_pre_select", z6 ? "1" : "0")}), (List) null, 8, (Object) null);
    }

    public static void m(int i7, long j7) {
        Neurons.reportExposure$default(true, "main.interest-select.close.0.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", com.bilibili.pegasus.request.b.g() ? "1" : "2")}), (List) null, 8, (Object) null);
    }

    public static void n(int i7, long j7, long j8, String str, int i8, String str2, int i9, int i10, boolean z6, String str3, int i11) {
        if ((i11 & 512) != 0) {
            str3 = null;
        }
        String str4 = com.bilibili.pegasus.request.b.g() ? "1" : "2";
        Pair pair = TuplesKt.to("interest_name", str);
        Pair pair2 = TuplesKt.to("interest_id", String.valueOf(j8));
        Pair pair3 = TuplesKt.to("interest_pos", String.valueOf(i8));
        String str5 = str2;
        if (str2 == null) {
            str5 = "";
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{pair, pair2, pair3, TuplesKt.to("sub_interest_name", str5), TuplesKt.to("sub_interest_id", String.valueOf(i9)), TuplesKt.to("sub_interest_pos", String.valueOf(i10)), TuplesKt.to("action_type", z6 ? "select" : "cancel"), TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str4)});
        if (str3 != null && !StringsKt.isBlank(str3)) {
            mapMutableMapOf.put("extra_msg", str3);
        }
        Neurons.reportClick(true, "main.interest-select.interest.0.click", mapMutableMapOf);
    }

    public static void o(InterestChooseItem interestChooseItem, int i7, String str, int i8, int i9, int i10, long j7, String str2, boolean z6, int i11) {
        if ((i11 & 128) != 0) {
            str2 = "";
        }
        String str3 = com.bilibili.pegasus.request.b.g() ? "1" : "2";
        if ((i11 & 512) != 0) {
            z6 = false;
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("interest_id", String.valueOf(interestChooseItem.getId())), TuplesKt.to("interest_pos", String.valueOf(i7)), TuplesKt.to("sub_interest_id", String.valueOf(i8)), TuplesKt.to("sub_interest_pos", String.valueOf(i9)), TuplesKt.to("style", String.valueOf(i10)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str3), TuplesKt.to("is_pre_select", z6 ? "1" : "0")});
        if (!StringsKt.isBlank(str2)) {
            mapMutableMapOf.put("extra_msg", str2);
        }
        String name = interestChooseItem.getName();
        if (name != null && !StringsKt.isBlank(name)) {
            mapMutableMapOf.put("interest_name", interestChooseItem.getName());
        }
        if (str != null && !StringsKt.isBlank(str)) {
            mapMutableMapOf.put("sub_interest_name", str);
        }
        Neurons.reportExposure$default(true, "main.interest-select.interest.0.show", mapMutableMapOf, (List) null, 8, (Object) null);
    }

    public static final void p(int i7, long j7, @Nullable String str) {
        Neurons.reportClick(true, "main.interest-select.three-point.continue.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str)}));
    }

    public static final void q(int i7, long j7, @Nullable String str) {
        Neurons.reportExposure$default(true, "main.interest-select.three-point.0.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str)}), (List) null, 8, (Object) null);
    }

    public static void r(int i7, long j7) {
        q(i7, j7, (EnvironmentManager.getInstance().isFirstStart() && com.bilibili.pegasus.request.h.a()) ? "1" : "2");
    }

    public static final void s(int i7, long j7, @NotNull InterestPageReturnReason interestPageReturnReason, @NotNull InterestPageType interestPageType, @Nullable String str) {
        Neurons.reportClick(true, "main.interest-select.return.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("strategy", str), TuplesKt.to(Constant.IN_KEY_REASON, interestPageReturnReason.getReason()), TuplesKt.to("page_type", interestPageType.getType())}));
    }

    public static final void t(int i7, long j7, int i8, @NotNull String str, @Nullable String str2) {
        Neurons.reportExposure$default(true, "main.interest-select.client.0.show", MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("style", String.valueOf(i7)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("code", String.valueOf(i8)), TuplesKt.to(NotificationCompat.CATEGORY_MESSAGE, str), TuplesKt.to("strategy", str2)}), (List) null, 8, (Object) null);
    }

    public static final void v(int i7, int i8, long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, int i9, @Nullable JSONObject jSONObject, @Nullable String str4) {
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("action_type", String.valueOf(i7)), TuplesKt.to("style", String.valueOf(i8)), TuplesKt.to("unique_id", String.valueOf(j7)), TuplesKt.to("interest_id_list", str), TuplesKt.to("interest_list", str2), TuplesKt.to("interest_pos_list", str3), TuplesKt.to("content_cnt", String.valueOf(i9)), TuplesKt.to("strategy", str4)});
        if (jSONObject != null && !jSONObject.isEmpty()) {
            mapMutableMapOf.put("extra_select", jSONObject.toString());
        }
        Neurons.reportClick(true, "main.interest-select.step-btn.0.click", mapMutableMapOf);
    }

    public static final void x(@NotNull InterestTipsCloseType interestTipsCloseType) {
        Neurons.reportClick(true, "main.interest-select.banner.0.click", MapsKt.mapOf(TuplesKt.to("action_type", interestTipsCloseType.getType())));
    }
}
