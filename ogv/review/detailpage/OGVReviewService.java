package com.bilibili.ogv.review.detailpage;

import I.E;
import K7.L;
import android.content.Context;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ogv.pub.community.MediaInfo;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;
import com.bilibili.ogv.pub.review.bean.ShortReview;
import com.bilibili.ogv.review.data.BangumiReviewApiService;
import com.bilibili.ogv.review.data.ReviewTag;
import com.bilibili.ogv.review.data.ReviewType;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zl0.C9206e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/OGVReviewService.class */
@StabilityInferred(parameters = 0)
public final class OGVReviewService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f72262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<a> f72263b = io.reactivex.rxjava3.subjects.a.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<Pair<ReviewType, List<ReviewItem>>> f72264c = io.reactivex.rxjava3.subjects.a.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<ReviewType, b> f72265d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<List<ReviewTag>> f72266e = io.reactivex.rxjava3.subjects.a.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final io.reactivex.rxjava3.subjects.a<ReviewPublishInfo> f72267f = io.reactivex.rxjava3.subjects.a.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PublishSubject<ReviewType> f72268g = PublishSubject.create();

    @Nullable
    public ReviewPublishInfo.PublishReview h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f72269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f72270j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/OGVReviewService$ReviewLoadState.class */
    public static final class ReviewLoadState {
        private static final EnumEntries $ENTRIES;
        private static final ReviewLoadState[] $VALUES;
        public static final ReviewLoadState LOADING = new ReviewLoadState("LOADING", 0);
        public static final ReviewLoadState LOAD_SUCCESS = new ReviewLoadState("LOAD_SUCCESS", 1);
        public static final ReviewLoadState LOAD_ERROR = new ReviewLoadState("LOAD_ERROR", 2);

        private static final /* synthetic */ ReviewLoadState[] $values() {
            return new ReviewLoadState[]{LOADING, LOAD_SUCCESS, LOAD_ERROR};
        }

        static {
            ReviewLoadState[] reviewLoadStateArr$values = $values();
            $VALUES = reviewLoadStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(reviewLoadStateArr$values);
        }

        private ReviewLoadState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ReviewLoadState> getEntries() {
            return $ENTRIES;
        }

        public static ReviewLoadState valueOf(String str) {
            return (ReviewLoadState) Enum.valueOf(ReviewLoadState.class, str);
        }

        public static ReviewLoadState[] values() {
            return (ReviewLoadState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/OGVReviewService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ReviewLoadState f72271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72273c;

        public a(@NotNull ReviewLoadState reviewLoadState, boolean z6, boolean z7) {
            this.f72271a = reviewLoadState;
            this.f72272b = z6;
            this.f72273c = z7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f72271a == aVar.f72271a && this.f72272b == aVar.f72272b && this.f72273c == aVar.f72273c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72273c) + z.a(this.f72271a.hashCode() * 31, 31, this.f72272b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ReviewLoadStateWithLoadMore(loadState=");
            sb.append(this.f72271a);
            sb.append(", isLoadingMore=");
            sb.append(this.f72272b);
            sb.append(", hasNext=");
            return androidx.appcompat.app.i.a(sb, this.f72273c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/OGVReviewService$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public MediaInfo f72274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f72275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f72276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public List<ReviewItem> f72277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f72278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f72279f;

        public b() {
            this(null);
        }

        public b(Object obj) {
            ArrayList arrayList = new ArrayList();
            this.f72274a = null;
            this.f72275b = "";
            this.f72276c = false;
            this.f72277d = arrayList;
            this.f72278e = 0;
            this.f72279f = false;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f72274a, bVar.f72274a) && Intrinsics.areEqual(this.f72275b, bVar.f72275b) && this.f72276c == bVar.f72276c && Intrinsics.areEqual(this.f72277d, bVar.f72277d) && this.f72278e == bVar.f72278e && this.f72279f == bVar.f72279f;
        }

        public final int hashCode() {
            MediaInfo mediaInfo = this.f72274a;
            return Boolean.hashCode(this.f72279f) + I.a(this.f72278e, e0.a(z.a(E.a((mediaInfo == null ? 0 : mediaInfo.hashCode()) * 31, 31, this.f72275b), 31, this.f72276c), 31, this.f72277d), 31);
        }

        @NotNull
        public final String toString() {
            MediaInfo mediaInfo = this.f72274a;
            String str = this.f72275b;
            boolean z6 = this.f72276c;
            List<ReviewItem> list = this.f72277d;
            int i7 = this.f72278e;
            boolean z7 = this.f72279f;
            StringBuilder sb = new StringBuilder("ReviewTabState(mediaInfo=");
            sb.append(mediaInfo);
            sb.append(", nextCursor=");
            sb.append(str);
            sb.append(", hasNext=");
            L.b(sb, z6, ", modules=", list, ", page=");
            sb.append(i7);
            sb.append(", isTabLoading=");
            sb.append(z7);
            sb.append(")");
            return sb.toString();
        }
    }

    public OGVReviewService(@NotNull Context context) {
        this.f72262a = context;
    }

    public static /* synthetic */ void d(OGVReviewService oGVReviewService, ReviewType reviewType, boolean z6, Lifecycle lifecycle, ReviewSourceType reviewSourceType, ShortReview shortReview, long j7, int i7, int i8) {
        if ((i8 & 16) != 0) {
            shortReview = null;
        }
        if ((i8 & 32) != 0) {
            j7 = 0;
        }
        if ((i8 & 64) != 0) {
            i7 = ReviewType.SHORT_REVIEW.m7667getValue().intValue();
        }
        oGVReviewService.c(reviewType, z6, lifecycle, reviewSourceType, shortReview, j7, i7, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.fragment.app.Fragment r6, boolean r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.detailpage.OGVReviewService.a(androidx.fragment.app.Fragment, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2 r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.detailpage.OGVReviewService.b(boolean, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.bilibili.okretro.call.rxjava.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.review.data.ReviewType r11, final boolean r12, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r13, @org.jetbrains.annotations.NotNull com.bilibili.ogv.review.detailpage.ReviewSourceType r14, @org.jetbrains.annotations.Nullable final com.bilibili.ogv.pub.review.bean.ShortReview r15, long r16, int r18, final boolean r19) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.detailpage.OGVReviewService.c(com.bilibili.ogv.review.data.ReviewType, boolean, androidx.lifecycle.Lifecycle, com.bilibili.ogv.review.detailpage.ReviewSourceType, com.bilibili.ogv.pub.review.bean.ShortReview, long, int, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [io.reactivex.rxjava3.functions.Consumer, java.lang.Object] */
    public final void e(@NotNull Lifecycle lifecycle) {
        BangumiReviewApiService bangumiReviewApiService = C9206e.f130331a;
        Single<ReviewPublishInfo> userReview = C9206e.f130331a.getUserReview(this.f72270j);
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(userReview.subscribe(new Consumer(this) { // from class: com.bilibili.ogv.review.detailpage.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OGVReviewService f72346a;

            {
                this.f72346a = this;
            }

            public final void accept(Object obj) {
                ReviewPublishInfo reviewPublishInfo = (ReviewPublishInfo) obj;
                ReviewPublishInfo.PublishReview publishReview = reviewPublishInfo.f71724b;
                OGVReviewService oGVReviewService = this.f72346a;
                oGVReviewService.h = publishReview;
                oGVReviewService.f72267f.onNext(reviewPublishInfo);
            }
        }, (Consumer) new Object()), lifecycle);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.detailpage.OGVReviewService.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
