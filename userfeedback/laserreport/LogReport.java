package com.bilibili.userfeedback.laserreport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.userfeedback.laserreport.LogReportService;
import go.b;
import tv.danmaku.android.log.BLog;
import w8.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/LogReport.class */
@Keep
public class LogReport {
    public static final String LAST_REPORT = "LAST_REPORT";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/LogReport$a.class */
    public final class a extends BiliApiDataCallback<LogReportService.LogDate> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f114708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LogReportStrategy f114709c;

        public a(Context context, LogReportStrategy logReportStrategy) {
            this.f114708b = context;
            this.f114709c = logReportStrategy;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable LogReportService.LogDate logDate) {
            LogReportService.LogDate logDate2 = logDate;
            if (logDate2 != null && logDate2.log_date != 0) {
                UploadFeedbackUploadHelper.uploadLog(this.f114708b, this.f114709c);
                return;
            }
            BLog.e("LogReport", "---data-error---" + logDate2);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            b.a(new StringBuilder("---queryReportTask---onError---"), th, "LogReport");
        }
    }

    public static void report(Context context, LogReportStrategy logReportStrategy) {
        Context applicationContext = context.getApplicationContext();
        if (System.currentTimeMillis() - BiliGlobalPreferenceHelper.getInstance(context).optLong(LAST_REPORT, 0L) >= logReportStrategy.intervalTime) {
            AccountService accountService = (AccountService) d.a(BLRouter.INSTANCE, AccountService.class, "default");
            ((LogReportService) ServiceGenerator.createService(LogReportService.class)).queryReportTask(accountService == null ? "" : accountService.getAccessToken(), logReportStrategy.sourceType).enqueue(new a(applicationContext, logReportStrategy));
        }
    }
}
