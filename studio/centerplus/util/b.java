package com.bilibili.studio.centerplus.util;

import android.content.SharedPreferences;
import com.bilibili.lib.mobilescore.MobileScoreService;
import com.bilibili.lib.mobilescore.bean.MobileScoreParam;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/b.class */
public final class b {
    @JvmStatic
    public static final void a(@NotNull BaseAppCompatActivity baseAppCompatActivity) {
        try {
            Result.Companion companion = Result.Companion;
            zB0.j jVarA = zB0.j.a(baseAppCompatActivity);
            Boolean bool = Boolean.FALSE;
            SharedPreferences sharedPreferences = jVarA.a;
            Boolean boolValueOf = bool;
            if (sharedPreferences != null) {
                boolValueOf = bool;
                if (sharedPreferences.contains("creation_last_grade_as_live_exist")) {
                    boolValueOf = Boolean.valueOf(jVarA.a.getBoolean("creation_last_grade_as_live_exist", false));
                }
            }
            if (boolValueOf.booleanValue()) {
                int iB = zB0.j.a(baseAppCompatActivity).b("creation_last_grade_as_live", 2);
                BLog.e("DevicePerformanceManager", "read from sp, values is" + iB);
                com.bilibili.studio.videoeditor.media.performance.a.e().f109842d = iB;
                return;
            }
            MobileScoreParam mobileScoreParam = new MobileScoreParam();
            mobileScoreParam.setChannel("pink_center_plus");
            mobileScoreParam.setBizKeys(CollectionsKt.arrayListOf(new String[]{"processor_level"}));
            MobileScoreService.Companion.create().getMobileScore(mobileScoreParam, new Ci.a(baseAppCompatActivity, 2));
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }
}
