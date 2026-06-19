package com.bilibili.lib.storage;

import androidx.annotation.Keep;
import com.bilibili.lib.foundation.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.tencent.map.geolocation.TencentLocation;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf0.C8654b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/storage/StorageConfig.class */
@Keep
public final class StorageConfig {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final String TAG = "StorageConfig";

    @SerializedName("list")
    @Nullable
    private ArrayList<ConfigItem> configList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/storage/StorageConfig$ConfigItem.class */
    @Keep
    public static final class ConfigItem {

        @SerializedName("black_list")
        @Nullable
        private String blackList;

        @SerializedName("expire_strategy")
        private int expireStrategy;

        @SerializedName(TencentLocation.FAKE)
        private boolean fake;

        @SerializedName("high_priority")
        private boolean highPriority;

        @SerializedName("ignore_module")
        private boolean ignoreModule;

        @SerializedName("max_version")
        private long maxVersion;

        @SerializedName("min_version")
        private long minVersion;

        @SerializedName("mod")
        @Nullable
        private String mod;

        @SerializedName("mod_module")
        @Nullable
        private String modModule;

        @SerializedName("module")
        @Nullable
        private String module;

        @SerializedName("name")
        @NotNull
        private final String name;

        @SerializedName("path")
        @Nullable
        private String path;

        @SerializedName("strategy_info")
        @Nullable
        private StrategyInfo strategyInfo;

        @SerializedName("trigger")
        @Nullable
        private String trigger;

        @SerializedName("url")
        @Nullable
        private String url;

        @SerializedName("white_list")
        @Nullable
        private String whiteList;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/storage/StorageConfig$ConfigItem$StrategyInfo.class */
        @Keep
        public static final class StrategyInfo {

            @SerializedName("dir_expand_hierarchy")
            private int dirExpandHierarchy = -1;

            @SerializedName("expire_time")
            private long expireTime;

            @SerializedName("limit_size")
            private double limitSize;

            @SerializedName("time_sort_type")
            private int orderType;

            @SerializedName("remove_suffix")
            @Nullable
            private String removeFileSuffix;

            @SerializedName("size_type")
            @Nullable
            private String sizeType;

            public final int getDirExpandHierarchy() {
                return this.dirExpandHierarchy;
            }

            public final long getExpireTime() {
                return this.expireTime;
            }

            public final double getLimitSize() {
                return this.limitSize;
            }

            public final int getOrderType() {
                return this.orderType;
            }

            @Nullable
            public final String getRemoveFileSuffix() {
                return this.removeFileSuffix;
            }

            @Nullable
            public final String getSizeType() {
                return this.sizeType;
            }

            public final void setDirExpandHierarchy(int i7) {
                this.dirExpandHierarchy = i7;
            }

            public final void setExpireTime(long j7) {
                this.expireTime = j7;
            }

            public final void setLimitSize(double d7) {
                this.limitSize = d7;
            }

            public final void setOrderType(int i7) {
                this.orderType = i7;
            }

            public final void setRemoveFileSuffix(@Nullable String str) {
                this.removeFileSuffix = str;
            }

            public final void setSizeType(@Nullable String str) {
                this.sizeType = str;
            }
        }

        public ConfigItem(@NotNull String str) {
            this.name = str;
        }

        @NotNull
        public final ConfigItem blackList(@NotNull String str) {
            this.blackList = str;
            return this;
        }

        @NotNull
        public final ConfigItem dirExpandHierarchy(int i7) {
            if (this.strategyInfo == null) {
                this.strategyInfo = new StrategyInfo();
            }
            this.strategyInfo.setDirExpandHierarchy(i7);
            return this;
        }

        @NotNull
        public final ConfigItem expireStrategy(int i7) {
            this.expireStrategy = i7;
            return this;
        }

        @NotNull
        public final ConfigItem expireTime(long j7) {
            if (this.strategyInfo == null) {
                this.strategyInfo = new StrategyInfo();
            }
            this.strategyInfo.setExpireTime(j7);
            return this;
        }

        @NotNull
        public final ConfigItem fake(boolean z6) {
            this.fake = this.fake;
            return this;
        }

        @Nullable
        public final String getBlackList() {
            return this.blackList;
        }

        public final int getExpireStrategy() {
            return this.expireStrategy;
        }

        public final boolean getFake() {
            return this.fake;
        }

        public final boolean getHighPriority() {
            return this.highPriority;
        }

        public final boolean getIgnoreModule() {
            return this.ignoreModule;
        }

        public final long getMaxVersion() {
            return this.maxVersion;
        }

        public final long getMinVersion() {
            return this.minVersion;
        }

        @Nullable
        public final String getMod() {
            return this.mod;
        }

        @Nullable
        public final String getModModule() {
            return this.modModule;
        }

        @Nullable
        public final String getModule() {
            return this.module;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getPath() {
            return this.path;
        }

        @Nullable
        public final StrategyInfo getStrategyInfo() {
            return this.strategyInfo;
        }

        @Nullable
        public final String getTrigger() {
            return this.trigger;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        public final String getWhiteList() {
            return this.whiteList;
        }

        @NotNull
        public final ConfigItem ignoreModule(boolean z6) {
            this.ignoreModule = z6;
            return this;
        }

        @NotNull
        public final ConfigItem limitSize(double d7) {
            if (this.strategyInfo == null) {
                this.strategyInfo = new StrategyInfo();
            }
            this.strategyInfo.setLimitSize(d7);
            return this;
        }

        @NotNull
        public final ConfigItem maxVersion(long j7) {
            this.maxVersion = j7;
            return this;
        }

        @NotNull
        public final ConfigItem minVersion(long j7) {
            this.minVersion = j7;
            return this;
        }

        @NotNull
        public final ConfigItem module(@NotNull String str) {
            this.module = str;
            return this;
        }

        @NotNull
        public final ConfigItem orderType(int i7) {
            if (this.strategyInfo == null) {
                this.strategyInfo = new StrategyInfo();
            }
            this.strategyInfo.setOrderType(i7);
            return this;
        }

        @NotNull
        public final ConfigItem path(@NotNull String str) {
            this.path = str;
            return this;
        }

        @NotNull
        public final ConfigItem removeFileSuffix(@NotNull String str) {
            if (this.strategyInfo == null) {
                this.strategyInfo = new StrategyInfo();
            }
            this.strategyInfo.setRemoveFileSuffix(str);
            return this;
        }

        public final void setBlackList(@Nullable String str) {
            this.blackList = str;
        }

        public final void setExpireStrategy(int i7) {
            this.expireStrategy = i7;
        }

        public final void setFake(boolean z6) {
            this.fake = z6;
        }

        public final void setHighPriority(boolean z6) {
            this.highPriority = z6;
        }

        public final void setIgnoreModule(boolean z6) {
            this.ignoreModule = z6;
        }

        public final void setMaxVersion(long j7) {
            this.maxVersion = j7;
        }

        public final void setMinVersion(long j7) {
            this.minVersion = j7;
        }

        public final void setMod(@Nullable String str) {
            this.mod = str;
        }

        public final void setModModule(@Nullable String str) {
            this.modModule = str;
        }

        public final void setModule(@Nullable String str) {
            this.module = str;
        }

        public final void setPath(@Nullable String str) {
            this.path = str;
        }

        public final void setStrategyInfo(@Nullable StrategyInfo strategyInfo) {
            this.strategyInfo = strategyInfo;
        }

        public final void setTrigger(@Nullable String str) {
            this.trigger = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }

        public final void setWhiteList(@Nullable String str) {
            this.whiteList = str;
        }

        @NotNull
        public final ConfigItem sizeType(@NotNull String str) {
            if (this.strategyInfo == null) {
                this.strategyInfo = new StrategyInfo();
            }
            this.strategyInfo.setSizeType(str);
            return this;
        }

        @NotNull
        public final ConfigItem trigger(@NotNull String str) {
            this.trigger = str;
            return this;
        }

        @NotNull
        public final ConfigItem whiteList(@NotNull String str) {
            this.whiteList = str;
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/storage/StorageConfig$a.class */
    public static final class a {
        @Nullable
        public static StorageConfig a(@NotNull String str) {
            try {
                return (StorageConfig) Objects.getSGlobalGson().fromJson(str, StorageConfig.class);
            } catch (Exception e7) {
                C8654b.f127503a.w();
                return null;
            }
        }
    }

    @NotNull
    public final StorageConfig addConfigItem(@NotNull ConfigItem configItem) {
        if (this.configList == null) {
            this.configList = new ArrayList<>();
        }
        this.configList.add(configItem);
        return this;
    }

    @Nullable
    public final ArrayList<ConfigItem> getConfigList() {
        return this.configList;
    }

    public final void setConfigList(@Nullable ArrayList<ConfigItem> arrayList) {
        this.configList = arrayList;
    }
}
