package com.bilibili.ship.theseus.ogv.intro;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.floatlayer.d;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/Q.class */
@StabilityInferred(parameters = 0)
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f92267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentManager f92268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f92269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f92270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.promptbar.c f92271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Context f92273g;

    @Inject
    public Q(@NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull FragmentManager fragmentManager, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull com.bilibili.ship.theseus.united.page.intro.module.promptbar.c cVar2, @NotNull OgvSeason ogvSeason, @NotNull Context context) {
        this.f92267a = cVar;
        this.f92268b = fragmentManager;
        this.f92269c = theseusFloatLayerService;
        this.f92270d = gVar;
        this.f92271e = cVar2;
        this.f92272f = ogvSeason;
        this.f92273g = context;
    }

    @Deprecated(message = "Migrate to kntr Router.")
    @NotNull
    public final String a(@NotNull String str) {
        String string;
        Uri uri = Uri.parse(str);
        if (Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT) && Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/open_page")) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            String queryParameter = uri.getQueryParameter("url");
            String str2 = queryParameter;
            if (queryParameter == null) {
                str2 = "";
            }
            String string2 = b(str2).toString();
            for (String str3 : queryParameterNames) {
                if (Intrinsics.areEqual(str3, "url")) {
                    builderClearQuery.appendQueryParameter(str3, string2);
                } else {
                    builderClearQuery.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
            string = builderClearQuery.toString();
        } else {
            string = b(str).toString();
        }
        return string;
    }

    public final Uri b(String str) {
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        long j7 = this.f92272f.f94449a;
        if (!queryParameterNames.contains("season_id")) {
            builderBuildUpon.appendQueryParameter("season_id", String.valueOf(j7));
        }
        if (!queryParameterNames.contains("scene")) {
            builderBuildUpon.appendQueryParameter("scene", "play_page");
        }
        return builderBuildUpon.build();
    }

    @Nullable
    public final Object c(@NotNull String str, @NotNull SuspendLambda suspendLambda) {
        Class<? extends Fragment> cls;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f92267a;
        if (cVar.h().f102988b) {
            cVar.g();
        }
        Uri uri = Uri.parse(str);
        String str2 = str;
        if (Intrinsics.areEqual(uri.getScheme(), LogReportStrategy.TAG_DEFAULT)) {
            str2 = str;
            if (Intrinsics.areEqual(uri.getHost(), "pgc")) {
                str2 = str;
                if (Intrinsics.areEqual(uri.getPath(), "/open_page")) {
                    String queryParameter = Uri.parse(str).getQueryParameter("url");
                    str2 = queryParameter;
                    if (queryParameter == null) {
                        str2 = "";
                    }
                }
            }
        }
        if (StringsKt.isBlank(str2)) {
            return Unit.INSTANCE;
        }
        d.a aVar = new d.a(null);
        aVar.m(false);
        if (true != aVar.f99748f) {
            aVar.f99748f = true;
            aVar.notifyPropertyChanged(687);
        }
        int color = ContextCompat.getColor(this.f92273g, R$color.Text2);
        if (color != aVar.f99749g) {
            aVar.f99749g = color;
            aVar.notifyPropertyChanged(303);
        }
        Qj0.d dVarA = Qj0.c.a(str2);
        if (dVarA == null || (cls = dVarA.f19963a) == null) {
            return Unit.INSTANCE;
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvVipCashierShowingService$keepVipCashierLayerShowing$2(aVar, this, cls, dVarA, null), suspendLambda);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
