package com.bilibili.studio.videoeditor.ms;

import android.content.Context;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.studio.editor.timeline.UpperEngineScene;
import com.bilibili.studio.editor.timeline.k;
import com.bilibili.studio.videoeditor.C6597e;
import com.bilibili.studio.videoeditor.mediav3.base.ConfigV3;
import dalvik.system.PathClassLoader;
import java.util.ArrayList;
import java.util.List;
import kntr.base.utils.foundation.CpuUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/EditorEngineSDKLoadManager.class */
public class EditorEngineSDKLoadManager {
    public static void a(String str, List list) {
        if (str == null || str.length() == 0) {
            return;
        }
        list.add(str);
    }

    public static String b(String str, ModResourceClient.OnUpdateCallback onUpdateCallback) {
        return C6597e.a("uper", str, "", onUpdateCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r3) {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager.c(android.content.Context):void");
    }

    public static void destroy() {
        k.a.f108315a.b(UpperEngineScene.MAIN_DEFAULT);
    }

    public static List<String> getAllSoDirPathList(Context context) {
        List<String> soDirPathList = getSoDirPathList(context);
        a(getMonSoDirPath(context), soDirPathList);
        a(getMonThirdPartySoDirPath(context), soDirPathList);
        return soDirPathList;
    }

    public static String getAuroraResourcesDirPath() {
        return C6597e.a("uper", "android_aurora_resources", "", null);
    }

    public static String getAuroraThirdPartPath(Context context) {
        return getAuroraThirdPartPath(context, null);
    }

    public static String getAuroraThirdPartPath(Context context, ModResourceClient.OnUpdateCallback onUpdateCallback) {
        return b("android_aurora_thirdparty", onUpdateCallback);
    }

    public static String getBMMAuroraSoDirPath(Context context) {
        return getBMMAuroraSoDirPath(context, null);
    }

    public static String getBMMAuroraSoDirPath(Context context, ModResourceClient.OnUpdateCallback onUpdateCallback) {
        return b(ConfigV3.c(), onUpdateCallback);
    }

    public static String getBMMEffectDirPath(Context context) {
        return getBMMEffectDirPath(context, null);
    }

    public static String getBMMEffectDirPath(Context context, ModResourceClient.OnUpdateCallback onUpdateCallback) {
        return b(ConfigV3.d(), onUpdateCallback);
    }

    public static String getBMMImageFilterDirPath() {
        return C6597e.a("uper", ConfigV3.e(), "", null);
    }

    public static String getBMMSoDirPath(Context context) {
        return getBMMSoDirPath(context, null);
    }

    public static String getBMMSoDirPath(Context context, ModResourceClient.OnUpdateCallback onUpdateCallback) {
        return b(ConfigV3.f(), onUpdateCallback);
    }

    public static String getCVSoDirPath(Context context) {
        return getCVSoDirPath(context, null);
    }

    public static String getCVSoDirPath(Context context, ModResourceClient.OnUpdateCallback onUpdateCallback) {
        return b(ConfigV3.h(), onUpdateCallback);
    }

    public static String getMonSoDirPath(Context context) {
        return getMonSoDirPath(context, null);
    }

    public static String getMonSoDirPath(Context context, ModResourceClient.OnUpdateCallback onUpdateCallback) {
        return b(ConfigV3.j(), onUpdateCallback);
    }

    public static String getMonThirdPartySoDirPath(Context context) {
        return getMonThirdPartySoDirPath(context, null);
    }

    public static String getMonThirdPartySoDirPath(Context context, ModResourceClient.OnUpdateCallback onUpdateCallback) {
        return b(ConfigV3.k(), onUpdateCallback);
    }

    public static PathClassLoader getPathClassLoader(Context context) {
        ClassLoader parent = context.getClassLoader().getParent();
        if (parent instanceof PathClassLoader) {
            return (PathClassLoader) parent;
        }
        ClassLoader classLoader = context.getClassLoader();
        if (classLoader instanceof PathClassLoader) {
            return (PathClassLoader) classLoader;
        }
        throw new IllegalArgumentException("not found PathClassLoader");
    }

    public static String getPbDirPath(Context context) {
        return b(CpuUtils.getMyCpuArch2(BiliContext.application()) == CpuUtils.ARCH.ARM64 ? "arm-32" : "arm-64", null);
    }

    public static List<String> getSoDirPathList(Context context) {
        ArrayList arrayList = new ArrayList();
        a(getBMMAuroraSoDirPath(context), arrayList);
        a(getBMMSoDirPath(context), arrayList);
        a(getBMMEffectDirPath(context), arrayList);
        a(getAuroraThirdPartPath(context), arrayList);
        a(getCVSoDirPath(context), arrayList);
        a(getBMMImageFilterDirPath(), arrayList);
        return arrayList;
    }

    public static void init(Context context) {
        synchronized (EditorEngineSDKLoadManager.class) {
            try {
                init(context, "otherBusiness");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void init(Context context, String str) {
        synchronized (EditorEngineSDKLoadManager.class) {
            try {
                k.a.f108315a.e(context, UpperEngineScene.MAIN_DEFAULT.setInitFrom(str), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void initMontageLibraryDirPath(Context context) {
        synchronized (EditorEngineSDKLoadManager.class) {
            try {
                c(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated(since = "临时方案不要随便使用，目前是排查问题所增加")
    public static void initMontageLibraryDirPath(Context context, boolean z6) {
        synchronized (EditorEngineSDKLoadManager.class) {
            try {
                c(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void registerBMMSoDownloadListener(Context context, ModResourceClient.OnUpdateObserver onUpdateObserver) {
        ModResourceClient.getInstance().subscribe("uper", ConfigV3.f(), onUpdateObserver);
    }

    public static void registerCVSoDownloadListener(Context context, ModResourceClient.OnUpdateObserver onUpdateObserver) {
        ModResourceClient.getInstance().subscribe("uper", ConfigV3.h(), onUpdateObserver);
    }

    public static void removeCallback() {
        C6597e.f109453a = null;
    }

    public static void unRegisterBMMSoDownloadListener(Context context, ModResourceClient.OnUpdateObserver onUpdateObserver) {
        ModResourceClient.getInstance().unsubscribe("uper", ConfigV3.f(), onUpdateObserver);
    }

    public static void unRegisterCVSoDownloadListener(Context context, ModResourceClient.OnUpdateObserver onUpdateObserver) {
        ModResourceClient.getInstance().unsubscribe("uper", ConfigV3.h(), onUpdateObserver);
    }
}
