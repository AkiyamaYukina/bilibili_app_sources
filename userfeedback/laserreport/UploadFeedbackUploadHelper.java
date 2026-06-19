package com.bilibili.userfeedback.laserreport;

import Bs.o;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import bolts.Continuation;
import bolts.Task;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.networkstats.NetworkFlowStatsManager;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.userfeedback.UserFeedbackService;
import com.bilibili.userfeedback.model.UserFeedbackItem;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import nJ0.C8080a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/UploadFeedbackUploadHelper.class */
@Keep
public class UploadFeedbackUploadHelper {
    private static final int ERROR_CODE_UPLOAD_EMPTY = 18003;
    private static final int ERROR_CODE_UPLOAD_TOO_LARGE = 18002;
    private static final String NO_LOG_FILE = "log_file_not_found";
    private static final String TAG = "UploadFeedbackUploadAction";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/UploadFeedbackUploadHelper$a.class */
    public final class a implements Continuation<Boolean, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogReportStrategy f114711a;

        public a(LogReportStrategy logReportStrategy) {
            this.f114711a = logReportStrategy;
        }

        @Override // bolts.Continuation
        public final Void then(Task<Boolean> task) throws Exception {
            if (task == null || !task.isCompleted() || !task.getResult().booleanValue() || !this.f114711a.deleteAfterReport) {
                return null;
            }
            BLog.deleteLogs();
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/UploadFeedbackUploadHelper$b.class */
    public final class b implements Continuation<String, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f114712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LogReportStrategy f114713b;

        public b(Context context, LogReportStrategy logReportStrategy) {
            this.f114712a = context;
            this.f114713b = logReportStrategy;
        }

        @Override // bolts.Continuation
        @Nullable
        public final Boolean then(Task<String> task) throws Exception {
            Boolean boolValueOf;
            if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                boolValueOf = Boolean.valueOf(UploadFeedbackUploadHelper.dealWithLogUploadResult(this.f114712a, this.f114713b, task));
            } else {
                BLog.e(UploadFeedbackUploadHelper.TAG, "network error");
                boolValueOf = null;
            }
            return boolValueOf;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/UploadFeedbackUploadHelper$c.class */
    public final class c implements Callable<String> {
        @Override // java.util.concurrent.Callable
        @Nullable
        public final String call() throws Exception {
            String strA = null;
            try {
                NetworkFlowStatsManager networkFlowStatsManager = NetworkFlowStatsManager.f67364a;
                BLog.syncLog(4, NetworkFlowStatsManager.b());
                BLog.syncLog(4, NetworkFlowStatsManager.c());
                File fileZippingLogFiles = BLog.zippingLogFiles(17, (List) null);
                if (fileZippingLogFiles != null && fileZippingLogFiles.exists() && fileZippingLogFiles.isFile()) {
                    strA = C8080a.a(fileZippingLogFiles.getAbsolutePath(), null);
                } else {
                    BLog.e(UploadFeedbackUploadHelper.TAG, "log_file_not_found!");
                    strA = UploadFeedbackUploadHelper.NO_LOG_FILE;
                }
            } catch (Exception e7) {
                o.a(e7, new StringBuilder("Exception! "), UploadFeedbackUploadHelper.TAG);
            }
            return strA;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/UploadFeedbackUploadHelper$d.class */
    public final class d extends BiliApiDataCallback<UserFeedbackItem> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f114714b;

        public d(Context context) {
            this.f114714b = context;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(@Nullable UserFeedbackItem userFeedbackItem) {
            BiliGlobalPreferenceHelper.getInstance(this.f114714b).setLong(LogReport.LAST_REPORT, System.currentTimeMillis());
            UploadFeedbackUploadHelper.updateQueryTask(this.f114714b);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            go.b.a(new StringBuilder("---uploadError---"), th, UploadFeedbackUploadHelper.TAG);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/UploadFeedbackUploadHelper$e.class */
    public final class e extends BiliApiDataCallback<Void> {
        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final /* bridge */ /* synthetic */ void onDataSuccess(@Nullable Void r32) {
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            go.b.a(new StringBuilder("---updateError---"), th, UploadFeedbackUploadHelper.TAG);
        }
    }

    private static void addFeedback(Context context, String str, LogReportStrategy logReportStrategy) {
        ((UserFeedbackService) ServiceGenerator.createService(UserFeedbackService.class)).feedbackAdd(new UserFeedbackService.FeedbackParamsMap(context, "", "", logReportStrategy.message, "", str, android.support.v4.media.session.a.a(new StringBuilder(), logReportStrategy.mid, ""), null, null)).enqueue(new d(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public static boolean dealWithLogUploadResult(Context context, LogReportStrategy logReportStrategy, Task<String> task) {
        if (task == null || task.isFaulted() || task.isCancelled() || TextUtils.isEmpty(task.getResult())) {
            BLog.e(TAG, "未知错误, 日志文件上传失败");
            return false;
        }
        if (task.getResult().equals(NO_LOG_FILE)) {
            BLog.e(TAG, "本地暂无日志文件");
            return false;
        }
        if (!task.isCompleted()) {
            return false;
        }
        JSONObject object = JSON.parseObject(task.getResult());
        int intValue = object.getIntValue("code");
        if (intValue == 0) {
            JSONObject jSONObject = object.getJSONObject("data");
            if (jSONObject == null) {
                return false;
            }
            String string = jSONObject.getString("url");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            addFeedback(context, string, logReportStrategy);
            return true;
        }
        if (intValue == ERROR_CODE_UPLOAD_TOO_LARGE) {
            BLog.e(TAG, "日志上传失败,文件太大");
            return false;
        }
        if (intValue == ERROR_CODE_UPLOAD_EMPTY) {
            BLog.e(TAG, "图片上传失败, 文件无内容");
            return false;
        }
        T7.a.a(intValue, "图片上传失败,", TAG);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateQueryTask(Context context) {
        AccountService accountService = (AccountService) w8.d.a(BLRouter.INSTANCE, AccountService.class, "default");
        ((LogReportService) ServiceGenerator.createService(LogReportService.class)).updateReportTask(2, accountService == null ? "" : accountService.getAccessToken(), 1, "").enqueue(new BiliApiDataCallback());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.Callable] */
    public static void uploadLog(Context context, LogReportStrategy logReportStrategy) {
        Task.callInBackground(new Object()).continueWith(new b(context, logReportStrategy), Task.UI_THREAD_EXECUTOR).continueWith(new a(logReportStrategy), Task.BACKGROUND_EXECUTOR);
    }
}
