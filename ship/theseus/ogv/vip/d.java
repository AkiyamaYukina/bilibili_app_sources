package com.bilibili.ship.theseus.ogv.vip;

import Ig0.C2295a;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.dynamic.v2.TextWithPriority;
import com.bilibili.biligame.ui.feed.widget.bottomtip.v;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.Q;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.util.Map;
import javax.inject.Inject;
import kntr.common.router.UrisKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvSeason f94840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f94841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Q f94842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f94843d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/d$a.class */
    public static final class a {
        @NotNull
        public static Uri a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, @NotNull Map map) {
            Uri uri2 = uri;
            if (uri == null) {
                uri2 = UrisKt.toUri("bilibili://vip/cashier");
            }
            if (uri2.isHierarchical() && Intrinsics.areEqual(uri2.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri2.getHost(), "pgc") && Intrinsics.areEqual(uri2.getPath(), "/open_page")) {
                return UrisKt.updateQueryParameter(uri2, "url", new v(str, 1, str2, map)).buildUpon().appendQueryParameter("i_am_vip", "1").build();
            }
            final int i7 = 0;
            return UrisKt.updateQueryParameter(UrisKt.updateQueryParameter(UrisKt.updateQueryParameter(UrisKt.updateQueryParameter(uri2, "source_from", new Ih1.a(str, 2)), "appSubId", new com.bilibili.bililive.biz.interactions.popularredpacket.view.record.a(str2, 1)), "i_am_vip", new Function1(i7) { // from class: com.bilibili.ship.theseus.ogv.vip.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f94839a;

                {
                    this.f94839a = i7;
                }

                public final Object invoke(Object obj) {
                    switch (this.f94839a) {
                        case 0:
                            return CollectionsKt.listOf("1");
                        case 1:
                            return ((TextWithPriority) obj).getText();
                        default:
                            return GridItemSpan.m1425boximpl(LazyGridSpanKt.GridItemSpan(3));
                    }
                }
            }), "order_report_params", new C2295a(map, 4));
        }

        public static boolean b(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (uri.isHierarchical()) {
                uri2 = uri;
                if (Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT)) {
                    uri2 = uri;
                    if (Intrinsics.areEqual(uri.getHost(), "pgc")) {
                        uri2 = uri;
                        if (Intrinsics.areEqual(uri.getPath(), "/open_page")) {
                            String queryParameter = uri.getQueryParameter("url");
                            uri2 = queryParameter != null ? Uri.Companion.parse(queryParameter) : null;
                        }
                    }
                }
            }
            if (uri2 == null) {
                return false;
            }
            if (Intrinsics.areEqual(uri2.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri2.getHost(), "vip")) {
                return Intrinsics.areEqual(uri2.getPath(), "/cashier");
            }
            if (Intrinsics.areEqual(uri2.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri2.getHost(), "user_center")) {
                return Intrinsics.areEqual(CollectionsKt.take(uri2.getPathSegments(), 2), CollectionsKt.listOf(new String[]{"vip", "buy"}));
            }
            return false;
        }

        public static boolean c(@NotNull Uri uri) {
            return b(uri) || uri.getQueryParameter("i_am_vip") != null;
        }
    }

    @Inject
    public d(@NotNull OgvSeason ogvSeason, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Q q7, @NotNull C8043a c8043a) {
        this.f94840a = ogvSeason;
        this.f94841b = ogvCurrentEpisodeRepository;
        this.f94842c = q7;
        this.f94843d = c8043a;
    }
}
