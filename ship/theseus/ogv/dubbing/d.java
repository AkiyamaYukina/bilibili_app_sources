package com.bilibili.ship.theseus.ogv.dubbing;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.r;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.ogv.w;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f91844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91845b;

    @Inject
    public d(@NotNull BiliAccounts biliAccounts, long j7) {
        this.f91844a = biliAccounts;
        this.f91845b = j7;
    }

    @NotNull
    public final Pair<Long, Integer> a(boolean z6) {
        Long longOrNull;
        String str = z6 ? "bangumi_dubbing_guide_tip_shown_fullscreen" : "bangumi_dubbing_guide_tip_shown_halfscreen";
        SharedPreferences sharedPreferences = w.f94906a;
        long jMid = this.f91844a.mid();
        StringBuilder sbA = r.a(str);
        sbA.append(this.f91845b);
        sbA.append(jMid);
        String string = sharedPreferences.getString(sbA.toString(), "");
        List listR = StringsKt.R(string != null ? string : "", new String[]{"#"}, 0, 6);
        String str2 = (String) CollectionsKt.getOrNull(listR, 0);
        long jLongValue = (str2 == null || (longOrNull = StringsKt.toLongOrNull(str2)) == null) ? 0L : longOrNull.longValue();
        String str3 = (String) CollectionsKt.getOrNull(listR, 1);
        int iIntValue = 0;
        if (str3 != null) {
            Integer intOrNull = StringsKt.toIntOrNull(str3);
            iIntValue = 0;
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue();
            }
        }
        return new Pair<>(Long.valueOf(jLongValue), Integer.valueOf(iIntValue));
    }
}
