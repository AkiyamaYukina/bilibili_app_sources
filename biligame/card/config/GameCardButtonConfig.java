package com.bilibili.biligame.card.config;

import com.alibaba.fastjson.JSON;
import com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/config/GameCardButtonConfig.class */
public final class GameCardButtonConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f62849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f62850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f62851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public BiliGameCardDataBean f62853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Boolean> f62854f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/config/GameCardButtonConfig$GameCardButtonConfigBuilder.class */
    public static final class GameCardButtonConfigBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f62855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f62856b = "0";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f62857c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f62858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public BiliGameCardDataBean f62859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Function1<? super String, Boolean> f62860f;

        public static /* synthetic */ GameCardButtonConfigBuilder setChannelExtra$default(GameCardButtonConfigBuilder gameCardButtonConfigBuilder, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = "";
            }
            return gameCardButtonConfigBuilder.setChannelExtra(str);
        }

        public static /* synthetic */ GameCardButtonConfigBuilder setChannelId$default(GameCardButtonConfigBuilder gameCardButtonConfigBuilder, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = "0";
            }
            return gameCardButtonConfigBuilder.setChannelId(str);
        }

        @NotNull
        public final GameCardButtonConfig build() {
            return new GameCardButtonConfig(this.f62855a, this.f62856b, this.f62857c, this.f62858d, this.f62859e, this.f62860f, null);
        }

        @NotNull
        public final GameCardButtonConfigBuilder setChannelExtra(@NotNull String str) {
            this.f62857c = str;
            return this;
        }

        @NotNull
        public final GameCardButtonConfigBuilder setChannelId(@NotNull String str) {
            this.f62856b = str;
            return this;
        }

        @NotNull
        public final GameCardButtonConfigBuilder setData(@Nullable BiliGameCardDataBean biliGameCardDataBean) {
            this.f62859e = biliGameCardDataBean;
            return this;
        }

        @NotNull
        public final GameCardButtonConfigBuilder setGameBaseId(long j7) {
            this.f62855a = j7;
            return this;
        }

        @NotNull
        public final GameCardButtonConfigBuilder setJumpInterceptor(@Nullable Function1<? super String, Boolean> function1) {
            this.f62860f = function1;
            return this;
        }

        @NotNull
        public final GameCardButtonConfigBuilder setRawData(@Nullable String str) {
            try {
                this.f62859e = (BiliGameCardDataBean) JSON.parseObject(str, BiliGameCardDataBean.class);
            } catch (Exception e7) {
                BLog.d("GameCardButtonConfig", e7);
            }
            return this;
        }

        @NotNull
        public final GameCardButtonConfigBuilder showComplianceDialog(boolean z6) {
            this.f62858d = z6;
            return this;
        }
    }

    public GameCardButtonConfig() {
        throw null;
    }

    public GameCardButtonConfig(long j7, String str, String str2, boolean z6, BiliGameCardDataBean biliGameCardDataBean, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this.f62849a = j7;
        this.f62850b = str;
        this.f62851c = str2;
        this.f62852d = z6;
        this.f62853e = biliGameCardDataBean;
        this.f62854f = function1;
    }

    @NotNull
    public final String getChannelExtra() {
        return this.f62851c;
    }

    @NotNull
    public final String getChannelId() {
        return this.f62850b;
    }

    @Nullable
    public final BiliGameCardDataBean getData() {
        return this.f62853e;
    }

    public final long getGameBaseId() {
        return this.f62849a;
    }

    @Nullable
    public final Function1<String, Boolean> getJumpInterceptor() {
        return this.f62854f;
    }

    public final boolean getShowComplianceDialog() {
        return this.f62852d;
    }

    public final void setChannelExtra(@NotNull String str) {
        this.f62851c = str;
    }

    public final void setChannelId(@NotNull String str) {
        this.f62850b = str;
    }

    public final void setData(@Nullable BiliGameCardDataBean biliGameCardDataBean) {
        this.f62853e = biliGameCardDataBean;
    }

    public final void setGameBaseId(long j7) {
        this.f62849a = j7;
    }

    public final void setJumpInterceptor(@Nullable Function1<? super String, Boolean> function1) {
        this.f62854f = function1;
    }

    public final void setShowComplianceDialog(boolean z6) {
        this.f62852d = z6;
    }
}
