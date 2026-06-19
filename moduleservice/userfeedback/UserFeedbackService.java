package com.bilibili.moduleservice.userfeedback;

import android.content.Context;
import androidx.annotation.WorkerThread;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/userfeedback/UserFeedbackService.class */
public interface UserFeedbackService {
    static /* synthetic */ void startSobot$default(UserFeedbackService userFeedbackService, Context context, String str, String str2, String str3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSobot");
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        userFeedbackService.startSobot(context, str, str2, str3);
    }

    static /* synthetic */ String uploadFeedbackLog$default(UserFeedbackService userFeedbackService, String str, String str2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFeedbackLog");
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        return userFeedbackService.uploadFeedbackLog(str, str2);
    }

    static /* synthetic */ void uploadFeedbackReport$default(UserFeedbackService userFeedbackService, Context context, Long l7, Long l8, String str, String str2, Boolean bool, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFeedbackReport");
        }
        if ((i7 & 32) != 0) {
            bool = Boolean.FALSE;
        }
        userFeedbackService.uploadFeedbackReport(context, l7, l8, str, str2, bool);
    }

    @WorkerThread
    boolean addReportItem(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5);

    @WorkerThread
    @Nullable
    String checkNewestFeedback(@Nullable Context context);

    @WorkerThread
    @Nullable
    String requestFeedbackPlatformTags(@Nullable String str, @Nullable String str2);

    @WorkerThread
    @Nullable
    String requestFeedbackTags(@NotNull String str);

    void startSobot(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable String str3);

    @Nullable
    String uploadFeedbackLog(@Nullable String str, @Nullable String str2);

    void uploadFeedbackReport(@Nullable Context context, @Nullable Long l7, @Nullable Long l8, @Nullable String str, @Nullable String str2, @Nullable Boolean bool);

    void uploadFeedbackUpload(@Nullable Context context, @Nullable Serializable serializable);

    @WorkerThread
    @Nullable
    String uploadLog(@Nullable Context context);
}
