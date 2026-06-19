package com.bilibili.studio.videoeditor.util;

import L50.a;
import androidx.annotation.NonNull;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.videocompile.internal.strategy.Export4KStrategy;
import com.bilibili.studio.videoeditor.editor.editdata.FileInfo;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/P.class */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Float> f110212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Float, List<Size>> f110213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Float, String> f110214c;

    static {
        ArrayList arrayList = new ArrayList();
        f110212a = arrayList;
        HashMap map = new HashMap();
        f110213b = map;
        HashMap map2 = new HashMap();
        f110214c = map2;
        Float fValueOf = Float.valueOf(1.777f);
        arrayList.add(fValueOf);
        Float fValueOf2 = Float.valueOf(1.333f);
        arrayList.add(fValueOf2);
        Float fValueOf3 = Float.valueOf(2.0f);
        arrayList.add(fValueOf3);
        Float fValueOf4 = Float.valueOf(1.0f);
        arrayList.add(fValueOf4);
        Float fValueOf5 = Float.valueOf(0.5f);
        arrayList.add(fValueOf5);
        Float fValueOf6 = Float.valueOf(0.75f);
        arrayList.add(fValueOf6);
        Float fValueOf7 = Float.valueOf(0.5625f);
        arrayList.add(fValueOf7);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Size(640, 360));
        arrayList2.add(new Size(856, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
        arrayList2.add(new Size(1280, 720));
        arrayList2.add(new Size(1920, 1080));
        arrayList2.add(new Size(3840, 2160));
        map.put(fValueOf, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new Size(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, 360));
        arrayList3.add(new Size(640, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
        arrayList3.add(new Size(960, 720));
        arrayList3.add(new Size(1440, 1080));
        arrayList3.add(new Size(2880, 2160));
        map.put(fValueOf2, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new Size(720, 360));
        arrayList4.add(new Size(960, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
        arrayList4.add(new Size(1440, 720));
        arrayList4.add(new Size(2160, 1080));
        arrayList4.add(new Size(3840, 2160));
        map.put(fValueOf3, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new Size(360, 360));
        arrayList5.add(new Size(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
        arrayList5.add(new Size(720, 720));
        arrayList5.add(new Size(1080, 1080));
        arrayList5.add(new Size(2160, 2160));
        map.put(fValueOf4, arrayList5);
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new Size(360, 720));
        arrayList6.add(new Size(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, 960));
        arrayList6.add(new Size(720, 1440));
        arrayList6.add(new Size(1080, 2160));
        arrayList6.add(new Size(2160, 3840));
        map.put(fValueOf5, arrayList6);
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new Size(360, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
        arrayList7.add(new Size(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, 640));
        arrayList7.add(new Size(720, 960));
        arrayList7.add(new Size(1080, 1440));
        arrayList7.add(new Size(2160, 2880));
        map.put(fValueOf6, arrayList7);
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new Size(360, 640));
        arrayList8.add(new Size(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, 856));
        arrayList8.add(new Size(720, 1280));
        arrayList8.add(new Size(1080, 1920));
        arrayList8.add(new Size(2160, 3840));
        map.put(fValueOf7, arrayList8);
        map2.put(fValueOf, "16:9");
        map2.put(fValueOf2, "4:3");
        map2.put(fValueOf3, "2:1");
        map2.put(fValueOf4, "1:1");
        map2.put(fValueOf5, "1:2");
        map2.put(fValueOf6, "3:4");
        map2.put(fValueOf7, "9:16");
    }

    public static Size a(float f7, int i7, int i8) {
        q4.D.a(i7, i8, "adjustResolutionByRatio before w:", " h:", "ResolutionUtil");
        if (f7 == 0.0f) {
            return null;
        }
        int iMin = Math.min(i7, i8);
        List<Size> list = (List) ((HashMap) f110213b).get(Float.valueOf(f7));
        if (list != null) {
            for (Size size : list) {
                if (Math.min(size.getWidth(), size.getHeight()) == iMin) {
                    BLog.d("ResolutionUtil", "adjustResolutionByRatio after w:" + size.getWidth() + " h:" + size.getHeight());
                    return size;
                }
            }
        }
        BLog.d("ResolutionUtil", "adjustResolutionByRatio after no match");
        return new Size(i7, i8);
    }

    public static float b(int i7, int i8, List list) {
        float f7;
        float f8;
        float f9 = 0.0f;
        float f10 = 0.0f;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                float f11 = (i7 * 1.0f) / i8;
                float f12 = Float.MAX_VALUE;
                int i9 = 0;
                while (true) {
                    f10 = f9;
                    if (i9 >= arrayList.size()) {
                        break;
                    }
                    float fFloatValue = ((Float) arrayList.get(i9)).floatValue();
                    float fAbs = Math.abs(fFloatValue - f11);
                    if (fAbs < f12) {
                        f7 = fFloatValue;
                        f8 = fAbs;
                    } else {
                        f7 = f9;
                        f8 = f12;
                        if (fAbs == f12) {
                            f7 = f9;
                            f8 = f12;
                            if (Math.abs(fFloatValue - 1.0f) < Math.abs(f9 - 1.0f)) {
                                f7 = fFloatValue;
                                f8 = f12;
                            }
                        }
                    }
                    i9++;
                    f9 = f7;
                    f12 = f8;
                }
            } else {
                f10 = 0.0f;
            }
        }
        return f10;
    }

    public static String c(int i7, int i8) {
        return (String) ((HashMap) f110214c).get(Float.valueOf(b(i7, i8, f110212a)));
    }

    public static Size d(@NonNull List<FileInfo> list) {
        Size size;
        R50.o oVarC;
        L50.a aVar = a.a.a;
        if ((aVar.a != null ? R50.r.u() : null) == null) {
            return new Size(0, 0);
        }
        String filePath = list.get(0).getFilePath();
        if (!fC0.a.e(filePath)) {
            q4.M.b("getBestResolutionSize first file is not exist path is ", filePath, "ResolutionUtil");
        }
        R50.o oVarE = e(filePath);
        float fB = b(oVarE.getWidth(), oVarE.getHeight(), f110212a);
        ArrayList arrayList = new ArrayList();
        Iterator<FileInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(e(it.next().getFilePath()));
        }
        boolean z6 = true;
        boolean z7 = fB < 1.0f;
        int iF = f(arrayList);
        List list2 = (List) ((HashMap) f110213b).get(Float.valueOf(fB));
        Size size2 = new Size(0, 0);
        R50.r rVarU = aVar.a != null ? R50.r.u() : null;
        R50.p pVar = rVarU != null ? rVarU.a : null;
        if (pVar == null) {
            oVarC = null;
        } else if (list2 == null) {
            BLog.e("ResolutionUtil", "getBestResolution get bestList is null , bestRatio = " + fB);
            oVarC = pVar.c(0, 0);
        } else {
            if (!((UpperFawkesDeviceDecision.ExportQualityOptimizationConfig) UpperFawkesDeviceDecision.f105490i.getValue()).getIgnore4KLimit() || !h()) {
                z6 = false;
            }
            ResolutionType resolutionTypeG = g(iF, z6);
            if (!z7) {
                int i7 = resolutionTypeG.size;
                Iterator it2 = list2.iterator();
                do {
                    size = size2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    size = (Size) it2.next();
                } while (size.getHeight() != i7);
            } else {
                int i8 = resolutionTypeG.size;
                Iterator it3 = list2.iterator();
                do {
                    size = size2;
                    if (!it3.hasNext()) {
                        break;
                    }
                    size = (Size) it3.next();
                } while (size.getWidth() != i8);
            }
            oVarC = pVar.c(size.getWidth(), size.getHeight());
        }
        if (oVarC == null) {
            return new Size(0, 0);
        }
        BLog.e("ResolutionUtil", "timeline resolution width = " + oVarC.getWidth() + " ,height = " + oVarC.getHeight());
        return new Size(oVarC.getWidth(), oVarC.getHeight());
    }

    public static P50.l e(String str) {
        L50.a aVar = a.a.a;
        R50.r rVarU = aVar.a != null ? R50.r.u() : null;
        R50.a aVarS = rVarU != null ? rVarU.s(str) : null;
        R50.r rVarU2 = aVar.a != null ? R50.r.u() : null;
        R50.p pVar = rVarU2 != null ? rVarU2.a : null;
        if (aVarS == null) {
            return pVar == null ? null : pVar.c(0, 0);
        }
        int videoStreamRotation = aVarS.a.getVideoStreamRotation(0);
        R50.o oVarA = aVarS.a();
        return (videoStreamRotation == 1 || videoStreamRotation == 3) ? pVar.c(oVarA.getHeight(), oVarA.getWidth()) : oVarA;
    }

    public static int f(ArrayList arrayList) {
        R50.p pVar = null;
        R50.r rVarU = a.a.a.a != null ? R50.r.u() : null;
        if (rVarU != null) {
            pVar = rVarU.a;
        }
        if (pVar == null) {
            return 0;
        }
        P50.l lVarC = pVar.c(0, 0);
        P50.l lVarC2 = pVar.c(0, 0);
        Iterator it = arrayList.iterator();
        P50.l lVar = lVarC;
        while (it.hasNext()) {
            P50.l lVar2 = (P50.l) it.next();
            if ((lVar2.getWidth() * 1.0f) / lVar2.getHeight() < 1.0f) {
                if (lVar.getWidth() < lVar2.getWidth()) {
                    lVar = lVar2;
                }
            } else if (lVarC2.getHeight() < lVar2.getHeight()) {
                lVarC2 = lVar2;
            }
        }
        return Math.max(lVarC2.getHeight(), lVar.getWidth());
    }

    public static ResolutionType g(int i7, boolean z6) {
        return i7 >= 1600 ? z6 ? ResolutionType.RES_2160 : ResolutionType.RES_1080 : i7 > 720 ? ResolutionType.RES_1080 : i7 > 480 ? ResolutionType.RES_720 : ResolutionType.RES_480;
    }

    public static boolean h() {
        Lazy lazy = zw0.b.f130950a;
        Boolean bool = (Boolean) ConfigManager.Companion.ab().get("uper.editor_4k_switch", Boolean.FALSE);
        if (!(bool != null ? bool.booleanValue() : false)) {
            return false;
        }
        if (Export4KStrategy.enableExport4KByEncoder()) {
            return Export4KStrategy.isSupport4KByMediaCodec();
        }
        boolean z6 = false;
        if (com.bilibili.studio.videoeditor.media.performance.a.e().f109842d != 1) {
            z6 = false;
            if (com.bilibili.studio.videoeditor.media.performance.a.e().f109842d != 2) {
                z6 = true;
            }
        }
        return z6;
    }
}
