package com.bilibili.opd.app.bizcommon.context.configservice;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/configservice/HomeDowngradeConfig.class */
@Keep
public final class HomeDowngradeConfig {

    @Nullable
    private Boolean enableDowngrade;

    @Nullable
    private String entryList;

    @Nullable
    private String mainHomeUrl;

    @Nullable
    private String secondHomeUrl;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/configservice/HomeDowngradeConfig$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Boolean f73532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f73533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f73534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f73535d;
    }

    private HomeDowngradeConfig(a aVar) {
        this.enableDowngrade = aVar.f73532a;
        this.mainHomeUrl = aVar.f73533b;
        this.secondHomeUrl = aVar.f73534c;
        this.entryList = aVar.f73535d;
    }

    public /* synthetic */ HomeDowngradeConfig(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    @Nullable
    public final Boolean getEnableDowngrade() {
        return this.enableDowngrade;
    }

    @Nullable
    public final String getEntryList() {
        return this.entryList;
    }

    @Nullable
    public final String getMainHomeUrl() {
        return this.mainHomeUrl;
    }

    @Nullable
    public final String getSecondHomeUrl() {
        return this.secondHomeUrl;
    }

    public final void setEnableDowngrade(@Nullable Boolean bool) {
        this.enableDowngrade = bool;
    }

    public final void setEntryList(@Nullable String str) {
        this.entryList = str;
    }

    public final void setMainHomeUrl(@Nullable String str) {
        this.mainHomeUrl = str;
    }

    public final void setSecondHomeUrl(@Nullable String str) {
        this.secondHomeUrl = str;
    }
}
