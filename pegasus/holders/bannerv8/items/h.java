package com.bilibili.pegasus.holders.bannerv8.items;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.adcommon.data.AdInfo;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.ExtraParams;
import com.bilibili.pegasus.data.base.BasePegasusData;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8340D;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/h.class */
public final class h {
    public static final void a(@NotNull BasePegasusData basePegasusData, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z6, @Nullable Map map, boolean z7) {
        AdInfo adInfo;
        Pair<String, String> pairA = C8340D.a();
        if (map != null) {
            map.put(pairA.getFirst(), pairA.getSecond());
        } else {
            map = MapsKt.mapOf(new Pair[]{TuplesKt.to("track_id", basePegasusData.getTrackId()), TuplesKt.to("dalao_feature", basePegasusData.getDalaoFeature()), TuplesKt.to("click_type", z7 ? "2" : "1"), pairA});
        }
        C8340D.f(basePegasusData, str, str2, str3, map, false);
        if (!z6 || (adInfo = basePegasusData.getAdInfo()) == null) {
            return;
        }
        if (!adInfo.isAdLoc()) {
            GAdCoreKt.getGAdReport().clickContent(adInfo.getReportInfo());
            return;
        }
        ExtraParams extraParamsBuild = new ExtraParams.ExtraBuilder().IS_MOVE_CLICK(z7 ? 1 : 0).build();
        extraParamsBuild.IS_PEGASUS_V3();
        GAdCoreKt.getGAdReport().event("click", adInfo.getReportInfo(), extraParamsBuild);
    }

    public static final void b(@NotNull RecyclerView.ViewHolder viewHolder, @Nullable String str) {
        View view = viewHolder.itemView;
        Context context = view.getContext();
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = viewHolder.getBindingAdapter();
        view.setContentDescription(context.getString(2131845110, str, Integer.valueOf(absoluteAdapterPosition + 1), Integer.valueOf(bindingAdapter != null ? bindingAdapter.getItemCount() : 0)));
    }
}
