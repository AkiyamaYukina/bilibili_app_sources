package com.bilibili.montage.avutil;

import android.os.Handler;
import android.os.Looper;
import com.bilibili.montage.MontageStreamingContext;
import com.bilibili.montage.SystemLoader;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageWaveformDataGenerator.class */
public class MontageWaveformDataGenerator {
    private static final int MONTAGE_WAVEFORMDATA_MESSAGE = 5;
    private static final int MONTAGE_WAVE_AUDIO_DURATION_MESSAGE = 16;
    private static final int MONTAGE_WAVE_SAMPLE_COUNT_MESSAGE = 15;
    private static final String TAG = "MontageWaveformDataGenerator";
    private boolean m_asyncGetSampleCount;
    private Handler m_callbackHandle;
    private WaveformDataCallback m_waveformDataCallback;
    private long m_waveformDataGenerator = 1;
    private long m_nextTaskId = 1;
    private ConcurrentHashMap<Long, Task> m_taskMap = new ConcurrentHashMap<>();
    private WaveformSampleCountCallback m_waveformSampleCountCallback = null;
    private WaveformAudioDurationCallback m_waveformAudioDurationCallback = null;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageWaveformDataGenerator$Task.class */
    public static class Task {
        public String m_audioFilePath;
        public long m_audioFileSampleCount;
        private float[] m_leftWaveformData;
        private float[] m_rightWaveformData;
        private long m_samplesPerGroup;
        public long taskId;
        public long waveformTaskId;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageWaveformDataGenerator$WaveformAudioDurationCallback.class */
    public interface WaveformAudioDurationCallback {
        void onWaveformAudioDuration(String str, long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageWaveformDataGenerator$WaveformDataCallback.class */
    public interface WaveformDataCallback {
        void onWaveformDataGenerationFailed(long j7, String str, long j8);

        void onWaveformDataReady(long j7, String str, long j8, long j9, float[] fArr, float[] fArr2);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageWaveformDataGenerator$WaveformSampleCountCallback.class */
    public interface WaveformSampleCountCallback {
        void onWaveformSampleCount(String str, long j7);
    }

    static {
        SystemLoader.setup();
    }

    public MontageWaveformDataGenerator() {
        this.m_callbackHandle = null;
        this.m_asyncGetSampleCount = true;
        nativeInit(new WeakReference(this));
        if (this.m_callbackHandle == null) {
            this.m_callbackHandle = new Handler(Looper.getMainLooper());
        }
        if (MontageStreamingContext.executeGetDeviceDecision("montage_get_sample_count_async", "true").equals("false")) {
            this.m_asyncGetSampleCount = false;
        }
        LogSinker.i(TAG, "asyncGetSampleCount:" + this.m_asyncGetSampleCount);
    }

    private native void nativeCancelTask(long j7);

    private native long nativeGenerateWaveformData(String str, long j7, long j8, long j9, long j10, int i7);

    private native long nativeGetAudioFileDuration(String str);

    private native void nativeGetAudioFileDurationAsync(String str);

    private native long nativeGetAudioFileSampleCount(String str);

    private native void nativeGetAudioFileSampleCountAsync(String str);

    private native void nativeInit(Object obj);

    private static void postEventFromNative(Object obj, int i7, int i8, int i9, Object obj2) {
        Handler handler;
        Task value;
        if (obj == null) {
            LogSinker.e(TAG, "Mon.JAVA. weakThis is null");
            return;
        }
        MontageWaveformDataGenerator montageWaveformDataGenerator = (MontageWaveformDataGenerator) ((WeakReference) obj).get();
        if (montageWaveformDataGenerator == null || (handler = montageWaveformDataGenerator.m_callbackHandle) == null) {
            LogSinker.e(TAG, "Mon.JAVA. waveGenerator is null");
            return;
        }
        if (i7 != 5) {
            if (i7 == 15) {
                if (montageWaveformDataGenerator.m_waveformSampleCountCallback == null) {
                    LogSinker.e(TAG, "Mon.JAVA. m_waveformSampleCountCallback is null");
                    return;
                } else {
                    handler.post(new Runnable(montageWaveformDataGenerator, obj2, i8) { // from class: com.bilibili.montage.avutil.MontageWaveformDataGenerator.1
                        final int val$arg1;
                        final Object val$obj;
                        final MontageWaveformDataGenerator val$waveGenerator;

                        {
                            this.val$waveGenerator = montageWaveformDataGenerator;
                            this.val$obj = obj2;
                            this.val$arg1 = i8;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (this.val$waveGenerator.m_waveformSampleCountCallback != null) {
                                Object obj3 = this.val$obj;
                                this.val$waveGenerator.m_waveformSampleCountCallback.onWaveformSampleCount(obj3 != null ? (String) obj3 : "", this.val$arg1);
                            }
                        }
                    });
                    return;
                }
            }
            if (i7 != 16) {
                return;
            }
            if (montageWaveformDataGenerator.m_waveformAudioDurationCallback == null) {
                LogSinker.e(TAG, "Mon.JAVA. m_waveformAudioDurationCallback is null");
                return;
            } else {
                handler.post(new Runnable(montageWaveformDataGenerator, obj2, i8) { // from class: com.bilibili.montage.avutil.MontageWaveformDataGenerator.2
                    final int val$arg1;
                    final Object val$obj;
                    final MontageWaveformDataGenerator val$waveGenerator;

                    {
                        this.val$waveGenerator = montageWaveformDataGenerator;
                        this.val$obj = obj2;
                        this.val$arg1 = i8;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (this.val$waveGenerator.m_waveformAudioDurationCallback != null) {
                            Object obj3 = this.val$obj;
                            this.val$waveGenerator.m_waveformAudioDurationCallback.onWaveformAudioDuration(obj3 != null ? (String) obj3 : "", this.val$arg1);
                        }
                    }
                });
                return;
            }
        }
        if (montageWaveformDataGenerator.m_waveformDataCallback == null) {
            LogSinker.e(TAG, "Mon.JAVA. m_waveformDataCallback is null");
            return;
        }
        Task task = (Task) obj2;
        Iterator<Map.Entry<Long, Task>> it = montageWaveformDataGenerator.m_taskMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                value = null;
                break;
            } else {
                value = it.next().getValue();
                if (value.waveformTaskId == task.waveformTaskId) {
                    break;
                }
            }
        }
        if (montageWaveformDataGenerator.m_asyncGetSampleCount && task != null && value != null) {
            value.m_audioFileSampleCount = task.m_audioFileSampleCount;
        }
        montageWaveformDataGenerator.m_callbackHandle.post(new Runnable(value, montageWaveformDataGenerator, task) { // from class: com.bilibili.montage.avutil.MontageWaveformDataGenerator.3
            final Task val$finalDesTask;
            final Task val$returnedTask;
            final MontageWaveformDataGenerator val$waveGenerator;

            {
                this.val$finalDesTask = value;
                this.val$waveGenerator = montageWaveformDataGenerator;
                this.val$returnedTask = task;
            }

            @Override // java.lang.Runnable
            public void run() {
                MontageWaveformDataGenerator montageWaveformDataGenerator2;
                if (this.val$finalDesTask == null || (montageWaveformDataGenerator2 = this.val$waveGenerator) == null || montageWaveformDataGenerator2.m_waveformDataCallback == null) {
                    return;
                }
                Task task2 = this.val$finalDesTask;
                if (0 == task2.m_audioFileSampleCount) {
                    WaveformDataCallback waveformDataCallback = this.val$waveGenerator.m_waveformDataCallback;
                    Task task3 = this.val$finalDesTask;
                    waveformDataCallback.onWaveformDataGenerationFailed(task3.taskId, task3.m_audioFilePath, task3.m_samplesPerGroup);
                    return;
                }
                Task task4 = this.val$returnedTask;
                task2.m_audioFileSampleCount = task4.m_audioFileSampleCount;
                task2.m_leftWaveformData = task4.m_leftWaveformData;
                this.val$finalDesTask.m_rightWaveformData = this.val$returnedTask.m_rightWaveformData;
                WaveformDataCallback waveformDataCallback2 = this.val$waveGenerator.m_waveformDataCallback;
                Task task5 = this.val$finalDesTask;
                waveformDataCallback2.onWaveformDataReady(task5.taskId, task5.m_audioFilePath, task5.m_audioFileSampleCount, task5.m_samplesPerGroup, this.val$finalDesTask.m_leftWaveformData, this.val$finalDesTask.m_rightWaveformData);
            }
        });
        if (value != null) {
            montageWaveformDataGenerator.m_taskMap.remove(Long.valueOf(value.taskId));
        }
    }

    public void cancelTask(long j7) {
        Task task = this.m_taskMap.get(Long.valueOf(j7));
        if (task != null) {
            if (!isReleased()) {
                nativeCancelTask(task.waveformTaskId);
            }
            this.m_taskMap.remove(Long.valueOf(j7));
        }
    }

    public long generateWaveformData(String str, long j7, long j8, long j9, int i7) {
        long j10;
        if (isReleased() || str == null || j7 <= 0) {
            return 0L;
        }
        if (this.m_asyncGetSampleCount) {
            j10 = 0;
        } else {
            long audioFileSampleCount = getAudioFileSampleCount(str);
            j10 = audioFileSampleCount;
            if (audioFileSampleCount <= 0) {
                return 0L;
            }
        }
        Task task = new Task();
        long j11 = this.m_nextTaskId;
        this.m_nextTaskId = 1 + j11;
        task.waveformTaskId = j11;
        task.taskId = j11;
        task.m_audioFilePath = str;
        task.m_audioFileSampleCount = j10;
        task.m_samplesPerGroup = j7;
        this.m_taskMap.put(Long.valueOf(task.taskId), task);
        if (nativeGenerateWaveformData(str, j7, j8, j9, task.waveformTaskId, i7) != 0) {
            return task.taskId;
        }
        this.m_taskMap.remove(Long.valueOf(task.taskId));
        return 0L;
    }

    public long getAudioFileDuration(String str) {
        return str == null ? 0L : nativeGetAudioFileDuration(str);
    }

    public void getAudioFileDurationAsync(String str, WaveformAudioDurationCallback waveformAudioDurationCallback) {
        if (waveformAudioDurationCallback == null) {
            return;
        }
        this.m_waveformAudioDurationCallback = waveformAudioDurationCallback;
        if (str == null) {
            LogSinker.e(TAG, "audioFilePath is null");
        } else {
            nativeGetAudioFileDurationAsync(str);
        }
    }

    public long getAudioFileSampleCount(String str) {
        return str == null ? 0L : nativeGetAudioFileSampleCount(str);
    }

    public void getAudioFileSampleCountAsync(String str, WaveformSampleCountCallback waveformSampleCountCallback) {
        if (waveformSampleCountCallback == null) {
            return;
        }
        this.m_waveformSampleCountCallback = waveformSampleCountCallback;
        if (str == null) {
            LogSinker.e(TAG, "audioFilePath is null");
        } else {
            nativeGetAudioFileSampleCountAsync(str);
        }
    }

    public boolean isReleased() {
        return this.m_waveformDataGenerator == 0;
    }

    public void release() {
        if (isReleased()) {
            return;
        }
        Iterator<Map.Entry<Long, Task>> it = this.m_taskMap.entrySet().iterator();
        while (it.hasNext()) {
            nativeCancelTask(it.next().getValue().waveformTaskId);
        }
        this.m_taskMap.clear();
        this.m_waveformDataCallback = null;
        this.m_waveformDataGenerator = 0L;
    }

    public void setWaveformDataCallback(WaveformDataCallback waveformDataCallback) {
        this.m_waveformDataCallback = waveformDataCallback;
    }
}
