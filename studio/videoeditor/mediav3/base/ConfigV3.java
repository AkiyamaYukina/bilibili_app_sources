package com.bilibili.studio.videoeditor.mediav3.base;

import G.p;
import android.text.TextUtils;
import androidx.compose.runtime.I0;
import cn.com.chinatelecom.account.api.d.m;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.videoeditor.C6597e;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.d;
import com.bilibili.studio.videoeditor.common.mod.Mod;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kntr.base.utils.foundation.CpuUtils;
import kotlin.Lazy;
import tv.danmaku.android.log.BLog;
import v.C8770a;
import zw0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/base/ConfigV3.class */
public final class ConfigV3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f109843g = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f109848e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f109844a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, String> f109845b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, String> f109846c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, String> f109847d = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<ModFlagV3> f109849f = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/base/ConfigV3$ModFlagV3.class */
    public enum ModFlagV3 {
        CV,
        LIC,
        SO
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/base/ConfigV3$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f109850a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.studio.videoeditor.mediav3.base.ConfigV3$ModFlagV3[] r0 = com.bilibili.studio.videoeditor.mediav3.base.ConfigV3.ModFlagV3.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.studio.videoeditor.mediav3.base.ConfigV3.a.f109850a = r0
                r0 = r4
                com.bilibili.studio.videoeditor.mediav3.base.ConfigV3$ModFlagV3 r1 = com.bilibili.studio.videoeditor.mediav3.base.ConfigV3.ModFlagV3.CV     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.mediav3.base.ConfigV3.a.f109850a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                com.bilibili.studio.videoeditor.mediav3.base.ConfigV3$ModFlagV3 r1 = com.bilibili.studio.videoeditor.mediav3.base.ConfigV3.ModFlagV3.SO     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.mediav3.base.ConfigV3.a.f109850a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                com.bilibili.studio.videoeditor.mediav3.base.ConfigV3$ModFlagV3 r1 = com.bilibili.studio.videoeditor.mediav3.base.ConfigV3.ModFlagV3.LIC     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.mediav3.base.ConfigV3.a.m10472clinit():void");
        }
    }

    public static String a() {
        String strA = C6597e.a("uper", "android_aurora_resources", "", null);
        if (!TextUtils.isEmpty(strA) && m.b(strA)) {
            return p.a(strA, "standardTemplates/adaptDefaultCaption/");
        }
        BLog.e("ConfigV3", "android_aurora_resources not exists soDirPath = " + strA);
        throw new FileNotExistedError("android_aurora_resources sdk mod path is empty");
    }

    public static String b() {
        String strA = C6597e.a("uper", "android_aurora_resources", "", null);
        if (TextUtils.isEmpty(strA) || !m.b(strA)) {
            throw new FileNotExistedError("android_aurora_resources sdk mod path is empty");
        }
        return p.a(strA, "standardTemplates/defaultCaption/");
    }

    public static String c() {
        return CpuUtils.getMyCpuArch2(BiliContext.application()) == CpuUtils.ARCH.ARM64 ? "android_bmm_aurora_64" : "android_bmm_aurora_32";
    }

    public static String d() {
        return CpuUtils.getMyCpuArch2(BiliContext.application()) == CpuUtils.ARCH.ARM64 ? "android_bmm_effect_64" : "android_bmm_effect_32";
    }

    public static String e() {
        return CpuUtils.getMyCpuArch2(BiliContext.application()) == CpuUtils.ARCH.ARM64 ? "android_bmm_imagefilter_64" : "android_bmm_imagefilter_32";
    }

    public static String f() {
        return CpuUtils.getMyCpuArch2(BiliContext.application()) == CpuUtils.ARCH.ARM64 ? "android_bmm_64" : "android_bmm_32";
    }

    public static String h() {
        return CpuUtils.getMyCpuArch2(BiliContext.application()) == CpuUtils.ARCH.ARM64 ? "android_cv_64" : "android_cv_32";
    }

    public static List<String> i(ModFlagV3 modFlagV3) {
        ArrayList arrayList = new ArrayList();
        if (a.f109850a[modFlagV3.ordinal()] == 2 && BiliContext.application() != null) {
            arrayList.add(f());
            arrayList.add(d());
            arrayList.add(e());
            arrayList.add("android_aurora_thirdparty");
            arrayList.add(h());
        }
        return arrayList;
    }

    public static String j() {
        return CpuUtils.getMyCpuArch2(BiliContext.application()) == CpuUtils.ARCH.ARM64 ? "android_mon_64" : "android_mon_32";
    }

    public static String k() {
        return CpuUtils.getMyCpuArch2(BiliContext.application()) == CpuUtils.ARCH.ARM64 ? "android_mon_third_party_64" : "android_mon_third_party_32";
    }

    public static void n() {
        String str = CenterPlusStatisticsHelper.f105195a;
        CenterPlusStatisticsHelper.p("modDownloadingStartTime");
        q(c(), true);
        q(f(), true);
        q("android_aurora_thirdparty", true);
        q(e(), true);
        q(j(), true);
        q(k(), true);
        q("android_aurora_resources", true);
        q(d(), true);
        LinkedHashMap linkedHashMap = new LinkedHashMap(12);
        Lazy lazy = b.f130950a;
        if (ConfigManager.Companion.ab2().getWithDefault("upper.auto_download_tag_mod", true)) {
            Mod mod = SB0.a.h;
            linkedHashMap.put(mod.getName(), mod.getFile());
            if (!UpperFawkesDeviceDecision.h()) {
                Mod mod2 = SB0.a.f22770i;
                linkedHashMap.put(mod2.getName(), mod2.getFile());
                Mod mod3 = SB0.a.f22771j;
                linkedHashMap.put(mod3.getName(), mod3.getFile());
            }
        }
        linkedHashMap.put("android_cv_model_1", "");
        linkedHashMap.put("android_cv_model_4", "");
        linkedHashMap.put("android_cv_model_2", "");
        linkedHashMap.put("android_cv_model_3", "");
        linkedHashMap.put(h(), "");
        Mod mod4 = SB0.a.f22772k;
        linkedHashMap.put(mod4.getName(), mod4.getFile());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            q((String) ((Map.Entry) it.next()).getKey(), false);
        }
    }

    public static void q(String str, boolean z6) {
        ModResourceClient.getInstance().update(BiliContext.application(), I0.a("uper", str, z6), (ModResourceClient.OnUpdateCallback) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g(java.lang.String r4) {
        /*
            r3 = this;
            r0 = r3
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f109846c
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1f
            r0 = r6
            r5 = r0
            java.lang.String r0 = "-"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
        L1f:
            r0 = r3
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f109847d
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3e
            r0 = r6
            r5 = r0
            java.lang.String r0 = "-"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
        L3e:
            r0 = r3
            r0.p()
            r0 = r3
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f109847d
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
        L4e:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.mediav3.base.ConfigV3.g(java.lang.String):java.lang.String");
    }

    public final String l(String str, boolean z6) {
        ModResource modResource = ModResourceClient.getInstance().get(BiliContext.application(), "uper", str);
        if (modResource.isAvailable() && FC0.a.a(modResource)) {
            StringBuilder sb = new StringBuilder();
            sb.append(modResource.getResourceDirPath());
            return C8770a.a(sb, File.separator, "");
        }
        if (!z6) {
            return "-";
        }
        BLog.d("ConfigV3", "download mo: modName = " + str + "; fileName = ");
        ModResourceClient.getInstance().update(BiliContext.application(), I0.a("uper", str, true), new com.bilibili.studio.videoeditor.mediav3.base.a(this));
        return "-";
    }

    public final void m(boolean z6) {
        this.f109845b.put(c(), l(c(), z6));
        this.f109845b.put(f(), l(f(), z6));
        this.f109845b.put(d(), l(d(), z6));
        this.f109845b.put(e(), l(e(), z6));
        this.f109845b.put("android_aurora_thirdparty", l("android_aurora_thirdparty", z6));
        this.f109845b.put(h(), l(h(), z6));
        this.f109846c.put("android_cv_model_4", l("android_cv_model_4", z6));
        p();
    }

    public final boolean o(ModFlagV3 modFlagV3) {
        int i7 = a.f109850a[modFlagV3.ordinal()];
        if (i7 == 1) {
            if (!((ArrayList) this.f109849f).contains(ModFlagV3.CV)) {
                return true;
            }
            for (String str : this.f109846c.keySet()) {
                if (this.f109846c.get(str).isEmpty() || this.f109846c.get(str).equals("-")) {
                    return false;
                }
            }
            return true;
        }
        if (i7 == 2) {
            if (!((ArrayList) this.f109849f).contains(ModFlagV3.SO)) {
                return true;
            }
            for (String str2 : this.f109845b.keySet()) {
                if (this.f109845b.get(str2).isEmpty() || this.f109845b.get(str2).equals("-")) {
                    return false;
                }
            }
        }
        if (!((ArrayList) this.f109849f).contains(ModFlagV3.LIC)) {
            return true;
        }
        for (String str3 : this.f109844a.keySet()) {
            if (this.f109844a.get(str3).isEmpty() || this.f109844a.get(str3).equals("-")) {
                return false;
            }
        }
        return true;
    }

    public final void p() {
        this.f109847d.put("android_cv_model_1", l("android_cv_model_1", false));
        this.f109847d.put("android_cv_model_2", l("android_cv_model_2", false));
        this.f109847d.put("android_cv_model_3", l("android_cv_model_3", false));
    }
}
