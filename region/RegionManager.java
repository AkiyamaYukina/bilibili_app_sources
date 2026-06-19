package com.bilibili.region;

import android.content.SharedPreferences;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.foundation.FoundationAlias;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/region/RegionManager.class */
public final class RegionManager implements IRegionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static SharedPrefX f85870a;

    @NotNull
    public static final RegionManager INSTANCE = new RegionManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Flow<String> f85871b = FlowKt.distinctUntilChanged(FlowKt.callbackFlow(new RegionManager$regionFlow$1(null)));

    public static void a() {
        if (f85870a != null) {
            return;
        }
        f85870a = BLKV.getBLSharedPreferences$default(FoundationAlias.getFapp(), new File(FoundationAlias.getFapp().getDir("blkv", 0), "region_store.raw_kv"), false, 0, 6, (Object) null);
    }

    @NotNull
    public final String currentRegion() {
        String str;
        String legalRegion = getLegalRegion();
        if (legalRegion == null || legalRegion.length() == 0) {
            String ipRegion = getIpRegion();
            str = "CN";
            if (ipRegion != null) {
                if (ipRegion.length() == 0) {
                    str = "CN";
                } else {
                    String ipRegion2 = getIpRegion();
                    str = ipRegion2;
                    if (ipRegion2 == null) {
                        str = "CN";
                    }
                }
            }
        } else {
            String legalRegion2 = getLegalRegion();
            str = legalRegion2;
            if (legalRegion2 == null) {
                str = "CN";
            }
        }
        return str;
    }

    @Override // com.bilibili.region.IRegionManager
    @Nullable
    public String getIpRegion() {
        a();
        SharedPrefX sharedPrefX = f85870a;
        String string = "";
        if (sharedPrefX != null) {
            string = sharedPrefX.getString("ip_region", "");
            if (string == null) {
                string = "";
            }
        }
        return string;
    }

    @Override // com.bilibili.region.IRegionManager
    @Nullable
    public String getLegalRegion() {
        a();
        SharedPrefX sharedPrefX = f85870a;
        String string = "";
        if (sharedPrefX != null) {
            string = sharedPrefX.getString("legal_region", "");
            if (string == null) {
                string = "";
            }
        }
        return string;
    }

    @Override // com.bilibili.region.IRegionManager
    @Nullable
    public String getRecentRegion() {
        a();
        SharedPrefX sharedPrefX = f85870a;
        String string = "";
        if (sharedPrefX != null) {
            string = sharedPrefX.getString("recent_region", "");
            if (string == null) {
                string = "";
            }
        }
        return string;
    }

    @NotNull
    public final Flow<String> getRegionFlow() {
        return f85871b;
    }

    public final boolean isChina() {
        String strCurrentRegion = currentRegion();
        return Intrinsics.areEqual(strCurrentRegion, "CN") || Intrinsics.areEqual(strCurrentRegion, "TW") || Intrinsics.areEqual(strCurrentRegion, "HK") || Intrinsics.areEqual(strCurrentRegion, "MO");
    }

    @Override // com.bilibili.region.IRegionManager
    public void setIpRegion(@Nullable String str) {
        SharedPreferences.Editor editorEdit;
        a();
        SharedPrefX sharedPrefX = f85870a;
        if (sharedPrefX == null || (editorEdit = sharedPrefX.edit()) == null) {
            return;
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        SharedPreferences.Editor editorPutString = editorEdit.putString("ip_region", str2);
        if (editorPutString != null) {
            editorPutString.commit();
        }
    }

    @Override // com.bilibili.region.IRegionManager
    public void setLegalRegion(@Nullable String str) {
        SharedPreferences.Editor editorEdit;
        a();
        SharedPrefX sharedPrefX = f85870a;
        if (sharedPrefX == null || (editorEdit = sharedPrefX.edit()) == null) {
            return;
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        SharedPreferences.Editor editorPutString = editorEdit.putString("legal_region", str2);
        if (editorPutString != null) {
            editorPutString.commit();
        }
    }

    @Override // com.bilibili.region.IRegionManager
    public void setRecentRegion(@Nullable String str) {
        SharedPreferences.Editor editorEdit;
        a();
        SharedPrefX sharedPrefX = f85870a;
        if (sharedPrefX == null || (editorEdit = sharedPrefX.edit()) == null) {
            return;
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        SharedPreferences.Editor editorPutString = editorEdit.putString("recent_region", str2);
        if (editorPutString != null) {
            editorPutString.commit();
        }
    }
}
