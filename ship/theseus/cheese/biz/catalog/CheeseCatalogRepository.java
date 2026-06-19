package com.bilibili.ship.theseus.cheese.biz.catalog;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.okretro.response.BiliApiResponse;
import com.google.gson.annotations.SerializedName;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogRepository.class */
@StabilityInferred(parameters = 0)
public final class CheeseCatalogRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f89101a = LazyKt.lazy((Function0) new Object());

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogRepository$CheeseLiveLinkVo.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class CheeseLiveLinkVo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("url")
        @NotNull
        private final String f89102a;

        public CheeseLiveLinkVo() {
            this(null, 1);
        }

        public CheeseLiveLinkVo(String str, int i7) {
            this.f89102a = (i7 & 1) != 0 ? "" : str;
        }

        @NotNull
        public final String a() {
            return this.f89102a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheeseLiveLinkVo) && Intrinsics.areEqual(this.f89102a, ((CheeseLiveLinkVo) obj).f89102a);
        }

        public final int hashCode() {
            return this.f89102a.hashCode();
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.a.a("CheeseLiveLinkVo(liveLinkUrl=", this.f89102a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogRepository$CoursewareInfo.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class CoursewareInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f89103a;

        public CoursewareInfo() {
            this(null, 1);
        }

        public CoursewareInfo(String str, int i7) {
            this.f89103a = (i7 & 1) != 0 ? "" : str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CoursewareInfo) && Intrinsics.areEqual(this.f89103a, ((CoursewareInfo) obj).f89103a);
        }

        public final int hashCode() {
            return this.f89103a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("CoursewareInfo(url="), this.f89103a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogRepository$a.class */
    @BaseUrl("https://api.bilibili.com")
    public interface a {
        @GET("/pugv/app/course/download")
        @Nullable
        Object getCoursewareUrl(@Query("file_id") long j7, @Query("season_id") long j8, @Query("section_id") long j9, @Query("episode_id") long j10, @NotNull Continuation<? super BiliApiResponse<CoursewareInfo>> continuation);

        @GET("/pugv/view/app/live/jump")
        @Nullable
        Object getLiveLinkData(@Query("ep_id") long j7, @NotNull Continuation<? super BiliApiResponse<CheeseLiveLinkVo>> continuation);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    @Inject
    public CheeseCatalogRepository() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogRepository.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogRepository.b(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
