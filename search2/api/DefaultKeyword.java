package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.interfaces.v1.DefaultWordsReply;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/DefaultKeyword.class */
@StabilityInferred(parameters = 0)
@Keep
public final class DefaultKeyword implements com.bilibili.app.comm.list.common.api.b {
    public static final int $stable = 8;

    @JSONField(name = "animationTimeMilli")
    private long animationTimeMilli;

    @JSONField(name = "goto")
    @Nullable
    private String defaultWordGoto;
    private int defaultWordType = 1;

    @JSONField(name = "enableAnimation")
    private long enableAnimation;

    @JSONField(name = "enableRefresh")
    private long enableRefresh;

    @JSONField(name = "exp_str")
    @Nullable
    private String expStr;
    private long flashScreenQueryId;
    private boolean fromTM;
    private boolean isExposed;

    @JSONField(name = "param")
    @Nullable
    private String param;

    @JSONField(name = "refreshIntervalMilli")
    private long refreshIntervalMilli;
    private int refreshTimes;

    @JSONField(name = "show")
    @Nullable
    private String show;

    @JSONField(name = "show_front")
    private int showFront;

    @Nullable
    private String tabName;

    @JSONField(name = "trackid")
    @Nullable
    private String trackId;

    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    private String uri;

    @JSONField(name = "value")
    @Nullable
    private String value;

    @JSONField(name = "word")
    @Nullable
    private String word;

    public DefaultKeyword() {
    }

    public DefaultKeyword(@NotNull DefaultWordsReply defaultWordsReply) {
        setTrackId(defaultWordsReply.getTrackid());
        setParam(defaultWordsReply.getParam());
        setShow(defaultWordsReply.getShow());
        setWord(defaultWordsReply.getWord());
        setShowFront((int) defaultWordsReply.getShowFront());
        setExpStr(defaultWordsReply.getExpStr());
        setUri(defaultWordsReply.getUri());
        setValue(defaultWordsReply.getValue());
        setDefaultWordGoto(defaultWordsReply.getGoto());
        setEnableRefresh(defaultWordsReply.getEnableRefresh());
        setRefreshIntervalMilli(defaultWordsReply.getRefreshIntervalMilli());
        setEnableAnimation(defaultWordsReply.getEnableAnimation());
        setAnimationTimeMilli(defaultWordsReply.getAnimationTimeMilli());
    }

    public /* bridge */ /* synthetic */ boolean enableAnimation() {
        return super.enableAnimation();
    }

    public /* bridge */ /* synthetic */ boolean enableRefresh() {
        return super.enableRefresh();
    }

    public long getAnimationTimeMilli() {
        return this.animationTimeMilli;
    }

    @Nullable
    public String getDefaultWordGoto() {
        return this.defaultWordGoto;
    }

    public int getDefaultWordType() {
        return this.defaultWordType;
    }

    public long getEnableAnimation() {
        return this.enableAnimation;
    }

    public long getEnableRefresh() {
        return this.enableRefresh;
    }

    @Nullable
    public String getExpStr() {
        return this.expStr;
    }

    public long getFlashScreenQueryId() {
        return this.flashScreenQueryId;
    }

    public boolean getFromTM() {
        return this.fromTM;
    }

    @Nullable
    public String getParam() {
        return this.param;
    }

    public long getRefreshIntervalMilli() {
        return this.refreshIntervalMilli;
    }

    public int getRefreshTimes() {
        return this.refreshTimes;
    }

    @Nullable
    public String getShow() {
        return this.show;
    }

    public int getShowFront() {
        return this.showFront;
    }

    @Nullable
    public String getTabName() {
        return this.tabName;
    }

    @Nullable
    public String getTrackId() {
        return this.trackId;
    }

    @Nullable
    public String getUri() {
        return this.uri;
    }

    @Nullable
    public String getValue() {
        return this.value;
    }

    @Nullable
    public String getWord() {
        return this.word;
    }

    @JSONField(serialize = false)
    public boolean isExposed() {
        return this.isExposed;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isShowFront() {
        boolean z6 = true;
        if (getShowFront() != 1) {
            z6 = false;
        }
        return z6;
    }

    public void setAnimationTimeMilli(long j7) {
        this.animationTimeMilli = j7;
    }

    public void setDefaultWordGoto(@Nullable String str) {
        this.defaultWordGoto = str;
    }

    public void setDefaultWordType(int i7) {
        this.defaultWordType = i7;
    }

    public void setEnableAnimation(long j7) {
        this.enableAnimation = j7;
    }

    public void setEnableRefresh(long j7) {
        this.enableRefresh = j7;
    }

    public void setExpStr(@Nullable String str) {
        this.expStr = str;
    }

    @JSONField(deserialize = false)
    public void setExposed(boolean z6) {
        this.isExposed = z6;
    }

    public void setFlashScreenQueryId(long j7) {
        this.flashScreenQueryId = j7;
    }

    public void setFromTM(boolean z6) {
        this.fromTM = z6;
    }

    public void setParam(@Nullable String str) {
        this.param = str;
    }

    public void setRefreshIntervalMilli(long j7) {
        this.refreshIntervalMilli = j7;
    }

    public void setRefreshTimes(int i7) {
        this.refreshTimes = i7;
    }

    public void setShow(@Nullable String str) {
        this.show = str;
    }

    public void setShowFront(int i7) {
        this.showFront = i7;
    }

    public void setTabName(@Nullable String str) {
        this.tabName = str;
    }

    public void setTrackId(@Nullable String str) {
        this.trackId = str;
    }

    public void setUri(@Nullable String str) {
        this.uri = str;
    }

    public void setValue(@Nullable String str) {
        this.value = str;
    }

    public void setWord(@Nullable String str) {
        this.word = str;
    }
}
