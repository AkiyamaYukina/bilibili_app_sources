package com.bilibili.biligame.business.pegasus.config;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.business.pegasus.bean.PegasusConfigBean;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.SharedPrefX;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/config/PegasusDialogViewConfig.class */
public final class PegasusDialogViewConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static final SharedPrefX f62717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static List<PegasusConfigBean> f62718b;

    static {
        Application application = BiliContext.application();
        f62717a = application != null ? BLKV.getBLSharedPreferences$default(application, "biligame_install_panel", true, 0, 4, (Object) null) : null;
    }

    @Nullable
    public static PegasusConfigBean a() {
        PegasusConfigBean pegasusConfigBean;
        Object next;
        try {
            if (f62718b == null) {
                SharedPrefX sharedPrefX = f62717a;
                String string = sharedPrefX != null ? sharedPrefX.getString("pggasus_view_config", "") : null;
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                f62718b = JSON.parseArray(string, PegasusConfigBean.class);
            }
            List<PegasusConfigBean> list = f62718b;
            pegasusConfigBean = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((PegasusConfigBean) next).getKey(), "download_panel")) {
                        break;
                    }
                }
                pegasusConfigBean = (PegasusConfigBean) next;
            }
        } catch (Exception e7) {
            pegasusConfigBean = null;
        }
        return pegasusConfigBean;
    }

    @Nullable
    public static PegasusConfigBean b() {
        PegasusConfigBean pegasusConfigBean;
        Object next;
        try {
            if (f62718b == null) {
                SharedPrefX sharedPrefX = f62717a;
                String string = sharedPrefX != null ? sharedPrefX.getString("pggasus_view_config", "") : null;
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                f62718b = JSON.parseArray(string, PegasusConfigBean.class);
            }
            List<PegasusConfigBean> list = f62718b;
            pegasusConfigBean = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((PegasusConfigBean) next).getKey(), "install_panel")) {
                        break;
                    }
                }
                pegasusConfigBean = (PegasusConfigBean) next;
            }
        } catch (Exception e7) {
            pegasusConfigBean = null;
        }
        return pegasusConfigBean;
    }

    @Nullable
    public static PegasusConfigBean c() {
        PegasusConfigBean pegasusConfigBean;
        Object next;
        try {
            if (f62718b == null) {
                SharedPrefX sharedPrefX = f62717a;
                String string = sharedPrefX != null ? sharedPrefX.getString("pggasus_view_config", "") : null;
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                f62718b = JSON.parseArray(string, PegasusConfigBean.class);
            }
            List<PegasusConfigBean> list = f62718b;
            pegasusConfigBean = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((PegasusConfigBean) next).getKey(), "small_game_remain_notice")) {
                        break;
                    }
                }
                pegasusConfigBean = (PegasusConfigBean) next;
            }
        } catch (Exception e7) {
            pegasusConfigBean = null;
        }
        return pegasusConfigBean;
    }

    @Nullable
    public static PegasusConfigBean d() {
        PegasusConfigBean pegasusConfigBean;
        Object next;
        try {
            if (f62718b == null) {
                SharedPrefX sharedPrefX = f62717a;
                String string = sharedPrefX != null ? sharedPrefX.getString("pggasus_view_config", "") : null;
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                f62718b = JSON.parseArray(string, PegasusConfigBean.class);
            }
            List<PegasusConfigBean> list = f62718b;
            pegasusConfigBean = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((PegasusConfigBean) next).getKey(), "small_game_play_later_notice")) {
                        break;
                    }
                }
                pegasusConfigBean = (PegasusConfigBean) next;
            }
        } catch (Exception e7) {
            pegasusConfigBean = null;
        }
        return pegasusConfigBean;
    }

    public static void e(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new PegasusDialogViewConfig$savePegasusDialogConfig$1(str, null), 2, (Object) null);
    }
}
