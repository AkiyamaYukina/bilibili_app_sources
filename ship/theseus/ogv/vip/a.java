package com.bilibili.ship.theseus.ogv.vip;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.PayStatus;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/a.class */
@Deprecated(message = "Migrate to kntr Router.")
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f94836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f94837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8043a f94838c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/a$a.class */
    public static final class C0757a extends TypeToken<Map<String, ? extends String>> {
    }

    @Inject
    public a(@NotNull Context context, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull C8043a c8043a) {
        this.f94836a = context;
        this.f94837b = ogvCurrentEpisodeRepository;
        this.f94838c = c8043a;
    }

    @NotNull
    public final String a(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Map<String, String> map) {
        String string;
        Uri uri = Uri.parse(str);
        if (Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/open_page")) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            String queryParameter = uri.getQueryParameter("url");
            String str4 = queryParameter;
            if (queryParameter == null) {
                str4 = "";
            }
            String string2 = c(str4, str2, str3, map).toString();
            for (String str5 : queryParameterNames) {
                if (Intrinsics.areEqual(str5, "url")) {
                    builderClearQuery.appendQueryParameter(str5, string2);
                } else {
                    builderClearQuery.appendQueryParameter(str5, uri.getQueryParameter(str5));
                }
            }
            string = builderClearQuery.toString();
        } else {
            string = c(str, str2, str3, map).toString();
        }
        return string;
    }

    public final Map<String, String> b(Map<String, String> map) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(map);
        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = this.f94837b;
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        mapCreateMapBuilder.put("ep_id", ogvEpisodeC != null ? String.valueOf(ogvEpisodeC.f93555a) : null);
        OgvEpisode ogvEpisodeC2 = ogvCurrentEpisodeRepository.c();
        String strValueOf = null;
        if (ogvEpisodeC2 != null) {
            PayStatus payStatus = ogvEpisodeC2.f93559e;
            strValueOf = null;
            if (payStatus != null) {
                strValueOf = String.valueOf(payStatus.m9146getValue().intValue());
            }
        }
        mapCreateMapBuilder.put("ep_status", strValueOf);
        C8043a c8043a = this.f94838c;
        mapCreateMapBuilder.put("from_spmid", c8043a.a().f123881c);
        mapCreateMapBuilder.put("from_out_spmid", c8043a.a().f123883e);
        mapCreateMapBuilder.put("spmid", c8043a.a().f123880b);
        return MapsKt.build(mapCreateMapBuilder);
    }

    public final Uri c(String str, String str2, String str3, Map<String, String> map) {
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        Map<String, String> mapB = b(map);
        for (String str4 : queryParameterNames) {
            if (Intrinsics.areEqual(str4, "order_report_params")) {
                String queryParameter = uri.getQueryParameter("order_report_params");
                builderClearQuery.appendQueryParameter("order_report_params", JsonUtilKt.toJson(MapsKt.plus((queryParameter == null || StringsKt.isBlank(queryParameter)) ? MapsKt.emptyMap() : (Map) JsonUtilKt.parseJson(queryParameter, new C0757a().getType()), mapB)));
            } else {
                builderClearQuery.appendQueryParameter(str4, uri.getQueryParameter(str4));
            }
        }
        if (!queryParameterNames.contains("source_from")) {
            builderClearQuery.appendQueryParameter("source_from", str2);
        }
        if (!queryParameterNames.contains("appSubId") && str3 != null && str3.length() != 0) {
            builderClearQuery.appendQueryParameter("appSubId", str3);
        }
        if (!queryParameterNames.contains("order_report_params")) {
            builderClearQuery.appendQueryParameter("order_report_params", JsonUtilKt.toJson(mapB));
        }
        return builderClearQuery.build();
    }
}
