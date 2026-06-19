package com.bilibili.userfeedback;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.BiliApiParseException;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.utils.ExBilowUtil;
import com.bilibili.userfeedback.UserFeedbackService;
import com.bilibili.userfeedback.model.UserFeedbackItem;
import java.io.IOException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/a.class */
public final class a {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.api.BiliApiException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean a(android.content.Context r10, @androidx.annotation.Nullable java.lang.String r11, @androidx.annotation.Nullable java.lang.String r12, @androidx.annotation.Nullable java.lang.String r13, @androidx.annotation.Nullable java.lang.String r14, @androidx.annotation.Nullable java.lang.String r15) throws com.bilibili.api.BiliApiException {
        /*
            r0 = r10
            if (r0 != 0) goto L8
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L8:
            com.bilibili.base.SharedPreferencesHelper r0 = new com.bilibili.base.SharedPreferencesHelper
            r1 = r0
            r2 = r10
            java.lang.String r3 = "feedback_user_info"
            r1.<init>(r2, r3)
            java.lang.String r1 = "preference_info_qq"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            r19 = r0
            com.bilibili.base.SharedPreferencesHelper r0 = new com.bilibili.base.SharedPreferencesHelper
            r1 = r0
            r2 = r10
            java.lang.String r3 = "feedback_user_info"
            r1.<init>(r2, r3)
            java.lang.String r1 = "preference_info_email"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            r20 = r0
            com.bilibili.lib.blrouter.BLRouter r0 = com.bilibili.lib.blrouter.BLRouter.INSTANCE
            java.lang.Class<com.bilibili.moduleservice.account.AccountService> r1 = com.bilibili.moduleservice.account.AccountService.class
            java.lang.String r2 = "default"
            java.lang.Object r0 = w8.d.a(r0, r1, r2)
            com.bilibili.moduleservice.account.AccountService r0 = (com.bilibili.moduleservice.account.AccountService) r0
            r18 = r0
            r0 = r18
            if (r0 != 0) goto L48
        L42:
            r0 = 0
            r18 = r0
            goto L6b
        L48:
            r0 = r18
            long r0 = r0.getMid()
            r16 = r0
            r0 = r16
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L42
            r0 = r16
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L64
            goto L42
        L64:
            r0 = r16
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r18 = r0
        L6b:
            r0 = r10
            r1 = r19
            r2 = r20
            r3 = r18
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            com.bilibili.userfeedback.model.UserFeedbackItem r0 = b(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: com.bilibili.api.BiliApiException -> L98 retrofit2.HttpException -> L9c com.bilibili.okretro.BiliApiParseException -> La0 java.io.IOException -> La4
            r11 = r0
            r0 = r11
            if (r0 == 0) goto Lae
            r0 = r11
            long r0 = r0.ctime     // Catch: com.bilibili.api.BiliApiException -> L98 retrofit2.HttpException -> L9c com.bilibili.okretro.BiliApiParseException -> La0 java.io.IOException -> La4
            r16 = r0
            r0 = r10
            com.bilibili.base.BiliGlobalPreferenceHelper r0 = com.bilibili.base.BiliGlobalPreferenceHelper.getInstance(r0)     // Catch: com.bilibili.api.BiliApiException -> L98 retrofit2.HttpException -> L9c com.bilibili.okretro.BiliApiParseException -> La0 java.io.IOException -> La4
            java.lang.String r1 = "preference_newest_feedback_time"
            r2 = r16
            r0.setLong(r1, r2)     // Catch: com.bilibili.api.BiliApiException -> L98 retrofit2.HttpException -> L9c com.bilibili.okretro.BiliApiParseException -> La0 java.io.IOException -> La4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: com.bilibili.api.BiliApiException -> L98 retrofit2.HttpException -> L9c com.bilibili.okretro.BiliApiParseException -> La0 java.io.IOException -> La4
            r10 = r0
            r0 = r10
            return r0
        L98:
            r10 = move-exception
            goto La5
        L9c:
            r10 = move-exception
            goto La5
        La0:
            r10 = move-exception
            goto La5
        La4:
            r10 = move-exception
        La5:
            java.lang.String r0 = "AddFeedbackItemAction"
            r1 = r10
            java.lang.String r1 = r1.getMessage()
            tv.danmaku.android.log.BLog.d(r0, r1)
        Lae:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.userfeedback.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.Boolean");
    }

    public static UserFeedbackItem b(Context context, String str, @Nullable String str2, @Nullable String str3, String str4, String str5, String str6, String str7, String str8) throws BiliApiException, HttpException, IOException, BiliApiParseException {
        return (UserFeedbackItem) ExBilowUtil.extractResponseData(((UserFeedbackService) ServiceGenerator.createService(UserFeedbackService.class)).feedbackAdd(new UserFeedbackService.FeedbackParamsMap(context, str, str2, str4, str5, str6, str3, str7, str8)).execute());
    }
}
