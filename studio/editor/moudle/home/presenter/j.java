package com.bilibili.studio.editor.moudle.home.presenter;

import android.app.Application;
import android.text.TextUtils;
import androidx.compose.foundation.text.selection.C3751q;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.upper.UpperService;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/j.class */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public UpperService f107249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final gz0.e f107250b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final k f107251c = new k();

    public static String c() {
        Application application = BiliContext.application();
        return application == null ? C3751q.a(System.currentTimeMillis(), "none_") : ec.a.a(BiliAccounts.get(application).mid(), System.currentTimeMillis(), "_");
    }

    public final void a(EditVideoInfo editVideoInfo) {
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        UpperService upperService = this.f107249a;
        if (upperService == null) {
            upperService = (UpperService) BLRouter.INSTANCE.get(UpperService.class, "default");
            this.f107249a = upperService;
        }
        if (upperService != null && upperService.hasDraft(application)) {
            fC0.e.a(application, editVideoInfo);
        }
    }

    public final void b(EditVideoInfo editVideoInfo, boolean z6, String str, String str2) {
        if (!z6 || TextUtils.isEmpty(str)) {
            gz0.a.a("【编辑器-分区预测】", "失败～success=" + z6 + ",partitionTaskId=" + str);
            return;
        }
        editVideoInfo.setPartitionTaskId(str, str2);
        gz0.a.a("【编辑器-分区预测】", "成功～" + editVideoInfo.getPartitionPrediction());
        a(editVideoInfo);
    }
}
