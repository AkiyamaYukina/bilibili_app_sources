package com.bilibili.search2.eastereggs;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.tencent.map.geolocation.TencentLocation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/a.class */
@StabilityInferred(parameters = 0)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SearchResultAll.EasterEgg f86506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public j f86507b;

    /* JADX INFO: renamed from: com.bilibili.search2.eastereggs.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/a$a.class */
    public static final /* synthetic */ class C0577a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f86508a;

        static {
            int[] iArr = new int[NoShowReason.values().length];
            try {
                iArr[NoShowReason.SHOW_COUNT_END.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[NoShowReason.CLOSE_COUNT_END.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[NoShowReason.NO_FILE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f86508a = iArr;
        }
    }

    public a(@NotNull SearchResultAll.EasterEgg easterEgg) {
        this.f86506a = easterEgg;
    }

    public abstract void a(@NotNull Context context, @NotNull FragmentManager fragmentManager);

    public abstract void b();

    public abstract void c();

    public abstract boolean d(@NotNull Context context, @NotNull FragmentManager fragmentManager);

    public final void e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchResultAll.EasterEgg easterEgg = this.f86506a;
        linkedHashMap.put("query", easterEgg.getQuery());
        linkedHashMap.put("trackid", easterEgg.getTrackId());
        linkedHashMap.put("moduleid", String.valueOf(easterEgg.getId()));
        linkedHashMap.put("click_area", "close");
        linkedHashMap.put("abtestid", easterEgg.getAbtestId());
        linkedHashMap.put("egg_type", String.valueOf(easterEgg.getEggType()));
        Neurons.reportClick(false, "search.search-result.search-egg.all.click", linkedHashMap);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void f(@NotNull Context context, @NotNull NoShowReason noShowReason) throws NoWhenBranchMatchedException {
        int i7;
        int i8;
        HashMap map = new HashMap();
        SearchResultAll.EasterEgg easterEgg = this.f86506a;
        map.put("query", easterEgg.getQuery());
        map.put("egg_id", String.valueOf(easterEgg.getId()));
        map.put("noshow_reason", String.valueOf(noShowReason.getType()));
        int i9 = C0577a.f86508a[noShowReason.ordinal()];
        if (i9 == 1) {
            SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
            map.put("show_cnt", String.valueOf(SearchLocalDataManager.g(easterEgg.getId())));
            map.put("show_max_cnt", String.valueOf(easterEgg.getShowCount()));
        } else if (i9 == 2) {
            SharedPrefX sharedPrefX2 = SearchLocalDataManager.f86501a;
            map.put("close_cnt", String.valueOf(SearchLocalDataManager.d(easterEgg.getId())));
            map.put("close_max_cnt", String.valueOf(easterEgg.getCloseCount()));
        } else {
            if (i9 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            map.put(TencentLocation.NETWORK_PROVIDER, (FreeDataManager.getInstance().isTf() && Connectivity.isConnected(Connectivity.getWifiNetworkInfo(context))) ? "2" : "1");
            map.put("egg_size", String.valueOf(easterEgg.getSourceSize()));
            SharedPrefX sharedPrefX3 = SearchLocalDataManager.f86501a;
            int id = easterEgg.getId();
            SharedPrefX sharedPrefX4 = SearchLocalDataManager.f86501a;
            boolean z6 = false;
            if (sharedPrefX4 != null) {
                i7 = sharedPrefX4.getInt("prefix_egg_download_failed_count_" + id, 0);
            } else {
                i7 = 0;
            }
            map.put("download_failed", String.valueOf(i7));
            int id2 = easterEgg.getId();
            SharedPrefX sharedPrefX5 = SearchLocalDataManager.f86501a;
            if (sharedPrefX5 != null) {
                i8 = sharedPrefX5.getInt("prefix_egg_delete_count_" + id2, 0);
            } else {
                i8 = 0;
            }
            map.put("delete_resource", String.valueOf(i8));
            int id3 = easterEgg.getId();
            SharedPrefX sharedPrefX6 = SearchLocalDataManager.f86501a;
            if (sharedPrefX6 != null) {
                z6 = sharedPrefX6.getBoolean("prefix_egg_has_pre_download_" + id3, false);
            }
            map.put("has_pre_download", String.valueOf(z6));
        }
        boolean z7 = Xs0.b.f28321a;
        Neurons.report$default(false, 0, "search.search-result.search-egg.0.other", map, (String) null, 0, 48, (Object) null);
    }

    public final void g(long j7) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SearchResultAll.EasterEgg easterEgg = this.f86506a;
        linkedHashMap.put("query", easterEgg.getQuery());
        linkedHashMap.put("trackid", easterEgg.getTrackId());
        linkedHashMap.put("moduleid", String.valueOf(easterEgg.getId()));
        linkedHashMap.put("abtestid", easterEgg.getAbtestId());
        linkedHashMap.put("egg_type", String.valueOf(easterEgg.getEggType()));
        if (j7 > 0) {
            linkedHashMap.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(j7));
        }
        Neurons.reportExposure$default(false, "search.search-result.search-egg.all.show", linkedHashMap, (List) null, 8, (Object) null);
    }
}
