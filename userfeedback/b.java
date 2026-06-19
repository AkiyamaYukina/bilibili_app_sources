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
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/b.class */
public final class b {
    public static List<UserFeedbackItem> a(Context context, @Nullable String str) throws BiliApiException, HttpException, IOException, BiliApiParseException {
        return (List) ExBilowUtil.extractResponseData(((UserFeedbackService) ServiceGenerator.createService(UserFeedbackService.class)).feedbackReply(new UserFeedbackService.FeedbackListParamsMap(context, str, 1)).execute());
    }
}
