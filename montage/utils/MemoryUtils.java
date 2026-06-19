package com.bilibili.montage.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.montage.avutil.LogSinker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/utils/MemoryUtils.class */
public class MemoryUtils {
    private static final String TAG = "MemoryUtils";

    public static long getAvailableMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(GameCenterBottomTabConfig.TAB_TYPE_ACT);
        if (activityManager == null) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long getJVMMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static Map<String, Integer> getMemoryStat() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            map.put("Java Heap", Integer.valueOf(Integer.parseInt(memoryInfo.getMemoryStat("summary.java-heap"))));
            map.put("Native Heap", Integer.valueOf(Integer.parseInt(memoryInfo.getMemoryStat("summary.native-heap"))));
            map.put("Code", Integer.valueOf(Integer.parseInt(memoryInfo.getMemoryStat("summary.code"))));
            map.put("Stack", Integer.valueOf(Integer.parseInt(memoryInfo.getMemoryStat("summary.stack"))));
            map.put("Graphics", Integer.valueOf(Integer.parseInt(memoryInfo.getMemoryStat("summary.graphics"))));
            map.put("Private Other", Integer.valueOf(Integer.parseInt(memoryInfo.getMemoryStat("summary.private-other"))));
            map.put("System", Integer.valueOf(Integer.parseInt(memoryInfo.getMemoryStat("summary.system"))));
            map.put("TOTAL PSS", Integer.valueOf(Integer.parseInt(memoryInfo.getMemoryStat("summary.total-pss"))));
            map.put("TOTAL SWAP", Integer.valueOf(Integer.parseInt(memoryInfo.getMemoryStat("summary.total-swap"))));
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        LogSinker.i(TAG, "getMemoryStat time cost" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return map;
    }

    public static long getTotalMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(GameCenterBottomTabConfig.TAB_TYPE_ACT);
        if (activityManager == null) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static long getUsedMemory(Context context) {
        return getTotalMemory(context) - getAvailableMemory(context);
    }

    public static long getUsedMemoryForApp(Context context) {
        if (((ActivityManager) context.getSystemService(GameCenterBottomTabConfig.TAB_TYPE_ACT)) != null) {
            return r0.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        }
        return 0L;
    }
}
