package com.bilibili.biligame.api.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/BiligameCloudGameNoticeBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameCloudGameNoticeBean {

    @JSONField(name = "id")
    @Nullable
    private String id;

    @JSONField(name = "jump_url")
    @Nullable
    private String jumpUrl;

    @JSONField(name = "notice_content")
    @Nullable
    private String noticeContent;

    @JSONField(name = "notice_name")
    @Nullable
    private String noticeName;

    @JSONField(name = "notice_type")
    @Nullable
    private String noticeType;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final String NTICETEXT = "TEXT";

    @NotNull
    private static final String NTICEIMAGE = "IMAGE";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/BiligameCloudGameNoticeBean$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getNTICEIMAGE() {
            return BiligameCloudGameNoticeBean.NTICEIMAGE;
        }

        @NotNull
        public final String getNTICETEXT() {
            return BiligameCloudGameNoticeBean.NTICETEXT;
        }
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getNoticeContent() {
        return this.noticeContent;
    }

    @Nullable
    public final String getNoticeName() {
        return this.noticeName;
    }

    @Nullable
    public final String getNoticeType() {
        return this.noticeType;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setNoticeContent(@Nullable String str) {
        this.noticeContent = str;
    }

    public final void setNoticeName(@Nullable String str) {
        this.noticeName = str;
    }

    public final void setNoticeType(@Nullable String str) {
        this.noticeType = str;
    }
}
