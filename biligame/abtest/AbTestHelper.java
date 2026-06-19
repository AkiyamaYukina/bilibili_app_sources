package com.bilibili.biligame.abtest;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.api.BiligameAbExpInfo;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.generator.GameServiceGenerator;
import com.bilibili.biligame.dd.BiligameDDUtilKt;
import com.bilibili.biligame.report3.ReportParams;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.utils.ABTestUtil;
import com.bilibili.biligame.utils.BiliCallGameExsKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import go.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.AppBuildConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/abtest/AbTestHelper.class */
@StabilityInferred(parameters = 0)
public final class AbTestHelper {
    public static final int $stable;

    @NotNull
    public static final String TAG = "AbTestHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static JSONObject f62133a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f62135c;
    public static volatile boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static long f62140i;

    @NotNull
    public static final AbTestHelper INSTANCE = new AbTestHelper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static List<BiligameAbExpInfo> f62134b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final com.bilibili.biligame.api.a f62136d = (com.bilibili.biligame.api.a) GameServiceGenerator.createService(com.bilibili.biligame.api.a.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final StringBuilder f62137e = new StringBuilder();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f62138f = AppBuildConfig.Companion.getDebug();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f62139g = ABTestUtil.INSTANCE.isGameAbExp();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/abtest/AbTestHelper$a.class */
    public static final class a extends c<BiligameApiResponse<List<? extends BiligameAbExpInfo>>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Function1<Boolean, Unit> f62141d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, Unit> function1) {
            this.f62141d = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        @Override // go.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onCache(com.bilibili.biligame.api.BiligameApiResponse<java.util.List<? extends com.bilibili.biligame.api.BiligameAbExpInfo>> r5) {
            /*
                r4 = this;
                r0 = r5
                com.bilibili.biligame.api.BiligameApiResponse r0 = (com.bilibili.biligame.api.BiligameApiResponse) r0
                r7 = r0
                com.bilibili.biligame.abtest.AbTestHelper r0 = com.bilibili.biligame.abtest.AbTestHelper.INSTANCE
                r5 = r0
                r0 = r7
                if (r0 == 0) goto L27
                r0 = r7
                T r0 = r0.data
                java.util.List r0 = (java.util.List) r0
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L27
                r0 = r5
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
                r6 = r0
                r0 = r6
                r5 = r0
                r0 = r6
                if (r0 != 0) goto L2f
            L27:
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r5 = r0
            L2f:
                r0 = r5
                com.bilibili.biligame.abtest.AbTestHelper.access$setMAbExpInfoList$p(r0)
                boolean r0 = com.bilibili.biligame.abtest.AbTestHelper.access$getMDebug$p()
                if (r0 == 0) goto La0
                java.lang.StringBuilder r0 = com.bilibili.biligame.abtest.AbTestHelper.access$getSb$p()
                kotlin.text.StringsKt.k(r0)
                r0 = r7
                if (r0 == 0) goto L83
                r0 = r7
                T r0 = r0.data
                java.util.List r0 = (java.util.List) r0
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L83
                r0 = r5
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
                r5 = r0
            L59:
                r0 = r5
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L83
                r0 = r5
                java.lang.Object r0 = r0.next()
                com.bilibili.biligame.api.BiligameAbExpInfo r0 = (com.bilibili.biligame.api.BiligameAbExpInfo) r0
                r6 = r0
                java.lang.StringBuilder r0 = com.bilibili.biligame.abtest.AbTestHelper.access$getSb$p()
                r1 = r6
                java.lang.String r1 = r1.getExpId()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = com.bilibili.biligame.abtest.AbTestHelper.access$getSb$p()
                java.lang.String r1 = "，"
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L59
            L83:
                java.lang.StringBuilder r0 = com.bilibili.biligame.abtest.AbTestHelper.access$getSb$p()
                r5 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = " ====onCacheSafe ==  \n 实验IDs =="
                r1.<init>(r2)
                r6 = r0
                r0 = r6
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = "AbTestHelper"
                r1 = r6
                java.lang.String r1 = r1.toString()
                tv.danmaku.android.log.BLog.i(r0, r1)
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.abtest.AbTestHelper.a.onCache(java.lang.Object):void");
        }

        @Override // go.c
        public final void onError(Throwable th) {
            AbTestHelper.f62135c = true;
            if (AbTestHelper.f62138f) {
                M.b(" ====onError ====", th != null ? th.getMessage() : null, AbTestHelper.TAG);
            }
            Function1<Boolean, Unit> function1 = this.f62141d;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        @Override // go.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSuccess(com.bilibili.biligame.api.BiligameApiResponse<java.util.List<? extends com.bilibili.biligame.api.BiligameAbExpInfo>> r5) {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.abtest.AbTestHelper.a.onSuccess(java.lang.Object):void");
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.lib.accounts.subscribe.PassportObserver, java.lang.Object] */
    static {
        BiliAccounts.get(BiliContext.application()).subscribe((PassportObserver) new Object(), new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT, Topic.ACCOUNT_SWITCH});
        $stable = 8;
    }

    public static String a(BiligameAbExpInfo biligameAbExpInfo) {
        String string;
        if (biligameAbExpInfo != null) {
            String expId = biligameAbExpInfo.getExpId();
            String groupId = biligameAbExpInfo.getGroupId();
            StringBuilder sb = new StringBuilder(ReporterMap.LEFT_BRACES);
            sb.append("\"ab_exp_id\":\"" + expId + "\"");
            sb.append(",");
            sb.append("\"ab_group_id\":\"" + groupId + "\"");
            sb.append(ReporterMap.RIGHT_BRACES);
            string = sb.toString();
        } else {
            string = null;
        }
        return string;
    }

    public static final JSONObject access$getDetailJumpFeedPageList(AbTestHelper abTestHelper) {
        Object next;
        abTestHelper.getClass();
        Iterator<T> it = f62134b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            BiligameAbExpInfo biligameAbExpInfo = (BiligameAbExpInfo) next;
            if (Intrinsics.areEqual(biligameAbExpInfo.getGroupName(), "new_detail_page_exp_group") && biligameAbExpInfo.getHitExp()) {
                break;
            }
        }
        BiligameAbExpInfo biligameAbExpInfo2 = (BiligameAbExpInfo) next;
        JSONObject extInfo = null;
        if (biligameAbExpInfo2 != null) {
            extInfo = biligameAbExpInfo2.getExtInfo();
        }
        return extInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getAllExpInfo$default(AbTestHelper abTestHelper, boolean z6, Function1 function1, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        if ((i7 & 2) != 0) {
            function1 = null;
        }
        abTestHelper.getAllExpInfo(z6, function1);
    }

    public final void getAllExpInfo(boolean z6, @Nullable Function1<? super Boolean, Unit> function1) {
        boolean z7 = f62139g;
        BLog.i(TAG, " 主战游戏中心实验总开关：" + z7 + " ");
        if (!z7) {
            f62134b.clear();
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (!h || System.currentTimeMillis() - f62140i > BiligameDDUtilKt.getGameABInfoRequestInternal() * 1000 || z6) {
            BiliCallGameExsKt.trackWithBlog(f62136d.getAllExpInfo(), true).enqueue(new a(function1));
        } else if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.biligame.api.BiligameAbExpInfo getBiliGameExpInfo(@org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.abtest.AbTestHelper.getBiliGameExpInfo(java.lang.String, java.lang.String):com.bilibili.biligame.api.BiligameAbExpInfo");
    }

    @Nullable
    public final BiligameAbExpInfo getBiliGameExpInfo(@Nullable String str, @Nullable String str2, @Nullable List<BiligameAbExpInfo> list) {
        BiligameAbExpInfo biligameAbExpInfo = null;
        if (str2 != null) {
            if (str2.length() == 0) {
                biligameAbExpInfo = null;
            } else {
                List<BiligameAbExpInfo> list2 = list;
                biligameAbExpInfo = null;
                if (list2 != null) {
                    if (!list2.isEmpty()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (Intrinsics.areEqual(((BiligameAbExpInfo) obj).getExpId(), str2)) {
                                arrayList.add(obj);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        BiligameAbExpInfo biligameAbExpInfo2 = null;
                        while (true) {
                            biligameAbExpInfo = biligameAbExpInfo2;
                            if (!it.hasNext()) {
                                break;
                            }
                            BiligameAbExpInfo biligameAbExpInfo3 = (BiligameAbExpInfo) it.next();
                            boolean z6 = jCurrentTimeMillis >= biligameAbExpInfo3.getExpStartTime() && jCurrentTimeMillis <= biligameAbExpInfo3.getExpEndTime();
                            if (str == null || str.length() == 0) {
                                if (biligameAbExpInfo3.getHitExp() && z6) {
                                    biligameAbExpInfo2 = biligameAbExpInfo3;
                                }
                            } else if (Intrinsics.areEqual(str, biligameAbExpInfo3.getGroupId()) && biligameAbExpInfo3.getHitExp() && z6) {
                                biligameAbExpInfo2 = biligameAbExpInfo3;
                            }
                        }
                    } else {
                        biligameAbExpInfo = null;
                    }
                }
            }
        }
        return biligameAbExpInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[EDGE_INSN: B:27:0x007a->B:21:0x007a BREAK  A[LOOP:0: B:3:0x000d->B:28:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:3:0x000d->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean getDetailActShowOnce() {
        /*
            r3 = this;
            java.util.List<com.bilibili.biligame.api.BiligameAbExpInfo> r0 = com.bilibili.biligame.abtest.AbTestHelper.f62134b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        Ld:
            r0 = r8
            boolean r0 = r0.hasNext()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L77
            r0 = r8
            java.lang.Object r0 = r0.next()
            r7 = r0
            r0 = r7
            com.bilibili.biligame.api.BiligameAbExpInfo r0 = (com.bilibili.biligame.api.BiligameAbExpInfo) r0
            r10 = r0
            r0 = r10
            com.alibaba.fastjson.JSONObject r0 = r0.getExtInfo()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6e
            r0 = r9
            java.lang.String r1 = "game_detail_page_default_select_act_tab_only_on_first_visit"
            boolean r0 = r0.containsKey(r1)
            r1 = 1
            if (r0 != r1) goto L6e
            r0 = r10
            com.alibaba.fastjson.JSONObject r0 = r0.getExtInfo()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L63
            r0 = r9
            java.lang.String r1 = "game_detail_page_default_select_act_tab_only_on_first_visit"
            java.lang.Boolean r0 = r0.getBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r5 = r0
            goto L65
        L63:
            r0 = 0
            r5 = r0
        L65:
            r0 = r5
            if (r0 == 0) goto L6e
            r0 = 1
            r4 = r0
            goto L70
        L6e:
            r0 = 0
            r4 = r0
        L70:
            r0 = r4
            if (r0 == 0) goto Ld
            goto L7a
        L77:
            r0 = 0
            r7 = r0
        L7a:
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L83
            r0 = 1
            r5 = r0
        L83:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.abtest.AbTestHelper.getDetailActShowOnce():boolean");
    }

    @NotNull
    public final String getGroupHotComment() {
        return isHotCommentLabel() ? "mark_hot_comment_exp_group" : "";
    }

    public final boolean getHomeCenterPlayingTab() {
        Object next;
        Iterator<T> it = f62134b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            BiligameAbExpInfo biligameAbExpInfo = (BiligameAbExpInfo) next;
            if (Intrinsics.areEqual(biligameAbExpInfo.getExpName(), "gc_add_played_tab_exp") && biligameAbExpInfo.getHitExp()) {
                break;
            }
        }
        return next != null;
    }

    public final boolean getMineGrowthPlanABTestRouter() {
        Object next;
        Iterator<T> it = f62134b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            BiligameAbExpInfo biligameAbExpInfo = (BiligameAbExpInfo) next;
            if (Intrinsics.areEqual(biligameAbExpInfo.getGroupName(), "game_center_growthplan_mine_exp") && biligameAbExpInfo.getHitExp()) {
                break;
            }
        }
        return next != null;
    }

    public final boolean getMiniGameInUseExp() {
        Object obj;
        Iterator<T> it = f62134b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            BiligameAbExpInfo biligameAbExpInfo = (BiligameAbExpInfo) next;
            if (Intrinsics.areEqual(biligameAbExpInfo.getExpName(), "mini_game_in_use_exp")) {
                obj = next;
                if (Intrinsics.areEqual(biligameAbExpInfo.getGroupName(), "exp_group_4")) {
                    break;
                }
                if (Intrinsics.areEqual(biligameAbExpInfo.getGroupName(), "exp_group_5")) {
                    obj = next;
                    break;
                }
            }
        }
        return obj != null;
    }

    @NotNull
    public final String getReportExpInfo() {
        String groupName;
        StringBuilder sb = new StringBuilder();
        for (BiligameAbExpInfo biligameAbExpInfo : f62134b) {
            String expName = biligameAbExpInfo.getExpName();
            if (expName != null && !StringsKt.isBlank(expName) && (groupName = biligameAbExpInfo.getGroupName()) != null && !StringsKt.isBlank(groupName)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(biligameAbExpInfo.getExpName());
                sb.append(":");
                sb.append(biligameAbExpInfo.getGroupName());
            }
        }
        return sb.toString();
    }

    @NotNull
    public final Map<String, String> getReportExtraGameAbInfo(@Nullable BiligameAbExpInfo biligameAbExpInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strA = a(biligameAbExpInfo);
        if (strA != null) {
            linkedHashMap.put("game_ab_info", strA);
        }
        return linkedHashMap;
    }

    public final boolean getVideoCardBottomGameInfo() {
        Object next;
        Iterator<T> it = f62134b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            BiligameAbExpInfo biligameAbExpInfo = (BiligameAbExpInfo) next;
            if (Intrinsics.areEqual(biligameAbExpInfo.getGroupName(), "detail_video_card_exp_group") && biligameAbExpInfo.getHitExp()) {
                break;
            }
        }
        return next != null;
    }

    public final boolean isBindRoleEnable() {
        return true;
    }

    public final boolean isHotCommentLabel() {
        Object next;
        boolean z6 = true;
        if (ABTestUtil.INSTANCE.isGameHotCommentLabel()) {
            return true;
        }
        Iterator<T> it = f62134b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            BiligameAbExpInfo biligameAbExpInfo = (BiligameAbExpInfo) next;
            if (Intrinsics.areEqual(biligameAbExpInfo.getGroupName(), "mark_hot_comment_exp_group") && biligameAbExpInfo.getHitExp()) {
                break;
            }
        }
        if (next == null) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isPageJumpDetailFeed(@Nullable String str) {
        if (ABTestUtil.INSTANCE.isDetailSwitchToFeed()) {
            return true;
        }
        if (str == null || StringsKt.isBlank(str)) {
            return false;
        }
        JSONObject jSONObject = f62133a;
        return Intrinsics.areEqual(jSONObject != null ? jSONObject.getString(str) : null, "1");
    }

    public final void reportClick(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map, @Nullable BiligameAbExpInfo biligameAbExpInfo) {
        reportV2Click(context, str2, str3, str5, map, biligameAbExpInfo);
        reportV3Click(str, str2, str4, str5, map, biligameAbExpInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void reportV2Click(@org.jetbrains.annotations.Nullable android.content.Context r5, @org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> r9, @org.jetbrains.annotations.Nullable com.bilibili.biligame.api.BiligameAbExpInfo r10) {
        /*
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L96
            r0 = r6
            if (r0 == 0) goto L96
            r0 = r7
            if (r0 != 0) goto Lf
            goto L96
        Lf:
            r0 = r10
            java.lang.String r0 = a(r0)
            r10 = r0
            r0 = r5
            com.bilibili.biligame.report.ReportHelper r0 = com.bilibili.biligame.report.ReportHelper.getHelperInstance(r0)
            r1 = r6
            com.bilibili.biligame.report.ReportHelper r0 = r0.setModule(r1)
            r1 = r7
            com.bilibili.biligame.report.ReportHelper r0 = r0.setGadata(r1)
            r1 = r8
            com.bilibili.biligame.report.ReportHelper r0 = r0.setValue(r1)
            r7 = r0
            r0 = r10
            if (r0 == 0) goto L39
            r0 = r10
            com.bilibili.biligame.report.ReportExtra r0 = com.bilibili.biligame.report.ReportExtra.createWithGameAbInfo(r0)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L3e
        L39:
            r0 = 1
            com.bilibili.biligame.report.ReportExtra r0 = com.bilibili.biligame.report.ReportExtra.create(r0)
            r5 = r0
        L3e:
            r0 = r9
            if (r0 == 0) goto L8d
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L50
            goto L8d
        L50:
            r0 = r9
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L5d:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L8d
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r8 = r0
            r0 = r5
            r1 = r8
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r2 = r8
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            com.bilibili.biligame.report.ReportExtra r0 = r0.put(r1, r2)
            goto L5d
        L8d:
            r0 = r7
            r1 = r5
            com.bilibili.biligame.report.ReportHelper r0 = r0.setExtra(r1)
            com.bilibili.biligame.report.ReportHelper r0 = r0.clickReport()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.abtest.AbTestHelper.reportV2Click(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.util.Map, com.bilibili.biligame.api.BiligameAbExpInfo):void");
    }

    public final void reportV3Click(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Map<String, String> map, @Nullable BiligameAbExpInfo biligameAbExpInfo) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        ReportParams reportParamsCreateWithGameBaseId = ReportParams.Companion.createWithGameBaseId(str4);
        String strA = a(biligameAbExpInfo);
        if (strA != null) {
            reportParamsCreateWithGameBaseId.put("game_ab_info", strA);
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                reportParamsCreateWithGameBaseId.put(entry.getKey(), entry.getValue());
            }
        }
        ReporterV3.reportClick(str, str2, str3, reportParamsCreateWithGameBaseId.build());
    }
}
