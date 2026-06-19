package com.bilibili.biligame.api.site;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/site/AnswerStatus.class */
@StabilityInferred(parameters = 0)
@Keep
public final class AnswerStatus {
    public static final int $stable = 8;
    private int captcha;
    private final int edition;

    @JSONField(name = "first_answer")
    private int firstAnswer;

    @Nullable
    private String hid;
    private long mid;
    private int number;

    @Nullable
    private String progress;

    @Nullable
    private final String result;
    private int score;

    @Nullable
    private final String stage;

    @JSONField(name = "start_time")
    @Nullable
    private final String startTime;
    private int status;

    @Nullable
    private String text;

    @Nullable
    private String url;

    public final int getCaptcha() {
        return this.captcha;
    }

    public final int getEdition() {
        return this.edition;
    }

    public final int getFirstAnswer() {
        return this.firstAnswer;
    }

    @Nullable
    public final String getHid() {
        return this.hid;
    }

    public final long getMid() {
        return this.mid;
    }

    public final int getNumber() {
        return this.number;
    }

    @Nullable
    public final String getProgress() {
        return this.progress;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public final int getScore() {
        return this.score;
    }

    @Nullable
    public final String getStage() {
        return this.stage;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setCaptcha(int i7) {
        this.captcha = i7;
    }

    public final void setFirstAnswer(int i7) {
        this.firstAnswer = i7;
    }

    public final void setHid(@Nullable String str) {
        this.hid = str;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setNumber(int i7) {
        this.number = i7;
    }

    public final void setProgress(@Nullable String str) {
        this.progress = str;
    }

    public final void setScore(int i7) {
        this.score = i7;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
