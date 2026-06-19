package com.bilibili.opd.app.bizcommon.context.provider;

import G.p;
import android.app.Application;
import android.net.Uri;
import com.bilibili.base.BiliContext;
import com.bilibili.live.streaming.source.TextSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/provider/MallProviderParamsHelper.class */
public final class MallProviderParamsHelper {

    @NotNull
    public static final MallProviderParamsHelper INSTANCE = new MallProviderParamsHelper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f73551a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/provider/MallProviderParamsHelper$ActiveProviderParams.class */
    public static final class ActiveProviderParams {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        public static final String MALL_MODULE_ACTIVE = "isMallActive";

        @NotNull
        public static final String QUERY_TYPE_PAGE_ACTIVE = "0";

        @NotNull
        public static final String QUERY_TYPE_SESSION_INFO = "1";

        @NotNull
        public static final String URI_QUERY_ACTIVE = "isActive";

        @NotNull
        public static final String URI_QUERY_MSOURCE = "msource";

        @NotNull
        public static final String URI_QUERY_PAGE = "page";

        @NotNull
        public static final String URI_QUERY_TYPE = "queryType";

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/provider/MallProviderParamsHelper$ActiveProviderParams$Companion.class */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Uri.Builder getBaseUriBuilder() {
                return MallProviderParamsHelper.access$getBaseUriBuilder(MallProviderParamsHelper.INSTANCE).path("/mall/activeStatus");
            }
        }
    }

    static {
        Application application = BiliContext.application();
        f73551a = p.a(application != null ? application.getPackageName() : null, ".mall.singletonprovider");
    }

    public static final Uri.Builder access$getBaseUriBuilder(MallProviderParamsHelper mallProviderParamsHelper) {
        mallProviderParamsHelper.getClass();
        return new Uri.Builder().scheme(TextSource.CFG_CONTENT).authority(f73551a);
    }
}
