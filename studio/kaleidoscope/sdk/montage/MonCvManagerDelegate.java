package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.blcv.CvModelType;
import com.bilibili.montage.blcv.MontageCvManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCvManagerDelegate.class */
public class MonCvManagerDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MontageCvManager f108390a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCvManagerDelegate$IMonCvDetectCallback.class */
    public interface IMonCvDetectCallback {
        void onCompleted();

        void onError(int i7, int i8);

        void onProgress(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCvManagerDelegate$a.class */
    public static final class a implements MontageCvManager.ICvDetectCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IMonCvDetectCallback f108391a;

        public a(@NonNull IMonCvDetectCallback iMonCvDetectCallback) {
            this.f108391a = iMonCvDetectCallback;
        }

        @Override // com.bilibili.montage.blcv.MontageCvManager.ICvDetectCallback
        public final void onCompleted() {
            this.f108391a.onCompleted();
        }

        @Override // com.bilibili.montage.blcv.MontageCvManager.ICvDetectCallback
        public final void onError(int i7, String str) {
            this.f108391a.onError(i7, i7);
        }

        @Override // com.bilibili.montage.blcv.MontageCvManager.ICvDetectCallback
        public final void onProgress(int i7) {
            this.f108391a.onProgress(i7);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.studio.kaleidoscope.sdk.montage.MonCvManagerDelegate, java.lang.Object] */
    public static MonCvManagerDelegate createCvManagerDelegate(String str, long j7, IMonCvDetectCallback iMonCvDetectCallback) {
        MontageCvManager montageCvManager = new MontageCvManager(str, j7, new a(iMonCvDetectCallback));
        ?? obj = new Object();
        obj.f108390a = montageCvManager;
        return obj;
    }

    public static void setCacheBasePath(String str) {
        MontageCvManager.setCacheBasePath(str);
    }

    public static void setCvModelPath(Map<Integer, String> map) {
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            int iIntValue = num.intValue();
            map2.put(CvModelType.valueOf(iIntValue), map.get(num));
            Objects.toString(CvModelType.valueOf(iIntValue));
            map.get(num);
        }
        MontageCvManager.setCvModelPath(map2);
    }

    public void cancel() {
        MontageCvManager montageCvManager = this.f108390a;
        if (montageCvManager == null) {
            return;
        }
        montageCvManager.cancel();
    }

    public void release() {
        MontageCvManager montageCvManager = this.f108390a;
        if (montageCvManager == null) {
            return;
        }
        montageCvManager.release();
        this.f108390a = null;
    }

    public void start(long j7, long j8) {
        MontageCvManager montageCvManager = this.f108390a;
        if (montageCvManager == null) {
            return;
        }
        montageCvManager.start(j7, j8);
    }
}
