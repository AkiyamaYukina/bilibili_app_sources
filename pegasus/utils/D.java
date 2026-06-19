package com.bilibili.pegasus.utils;

import android.view.View;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.opd.app.bizcommon.context.KFCFragmentLoaderActivity;
import com.bilibili.spmid.SPMID;
import com.bilibili.spmid.SPMTrackNodeWrapper;
import com.tencent.bugly.BuglyStrategy;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/D.class */
public final class D {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.pegasus.utils.i, java.lang.Object] */
    public static final void a(@NotNull View view, @NotNull Pair<SPMID, ? extends HashMap<String, String>> pair) {
        Object tag = view.getTag(2131311980);
        C5765i c5765i = null;
        SPMTrackNodeWrapper sPMTrackNodeWrapper = tag instanceof SPMTrackNodeWrapper ? (SPMTrackNodeWrapper) tag : null;
        if (sPMTrackNodeWrapper instanceof C5765i) {
            c5765i = (C5765i) sPMTrackNodeWrapper;
        }
        if (c5765i != null) {
            c5765i.f78872a = pair;
            return;
        }
        ?? obj = new Object();
        obj.f78872a = pair;
        view.setTag(2131311980, obj);
    }

    @NotNull
    public static final String b() {
        String buvid = BuvidHelper.getBuvid();
        int iNextInt = Random.Default.nextInt(KFCFragmentLoaderActivity.REQ_CODE_LOGIN, BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH);
        return buvid + System.currentTimeMillis() + iNextInt;
    }
}
