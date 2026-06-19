package com.bilibili.search2.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/NegativeFeedback.class */
@StabilityInferred(parameters = 0)
public final class NegativeFeedback implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "default_words_feedback_title")
    @Nullable
    private String defaultWordsFeedbackTitle;

    @JSONField(name = "feedback_list")
    @Nullable
    private List<FeedbackItem> feedbackList;

    @JSONField(name = "feedback_reason_title")
    @Nullable
    private String feedbackReasonTitle;

    @JSONField(name = "feedback_title_v2")
    @Nullable
    private String feedbackTitle;

    @JSONField(name = "submit_success_text")
    @Nullable
    private String submitSuccessText;

    @JSONField(name = "submit_text")
    @Nullable
    private String submitText;

    @JSONField(name = "toast_time")
    private int toastTime;

    @Nullable
    public final String getDefaultWordsFeedbackTitle() {
        return this.defaultWordsFeedbackTitle;
    }

    @Nullable
    public final List<FeedbackItem> getFeedbackList() {
        return this.feedbackList;
    }

    @Nullable
    public final String getFeedbackReasonTitle() {
        return this.feedbackReasonTitle;
    }

    @Nullable
    public final String getFeedbackTitle() {
        return this.feedbackTitle;
    }

    @Nullable
    public final String getSubmitSuccessText() {
        return this.submitSuccessText;
    }

    @Nullable
    public final String getSubmitText() {
        return this.submitText;
    }

    public final int getToastTime() {
        return this.toastTime;
    }

    public final void setDefaultWordsFeedbackTitle(@Nullable String str) {
        this.defaultWordsFeedbackTitle = str;
    }

    public final void setFeedbackList(@Nullable List<FeedbackItem> list) {
        this.feedbackList = list;
    }

    public final void setFeedbackReasonTitle(@Nullable String str) {
        this.feedbackReasonTitle = str;
    }

    public final void setFeedbackTitle(@Nullable String str) {
        this.feedbackTitle = str;
    }

    public final void setSubmitSuccessText(@Nullable String str) {
        this.submitSuccessText = str;
    }

    public final void setSubmitText(@Nullable String str) {
        this.submitText = str;
    }

    public final void setToastTime(int i7) {
        this.toastTime = i7;
    }
}
