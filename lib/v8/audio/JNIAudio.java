package com.bilibili.lib.v8.audio;

import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/audio/JNIAudio.class */
public class JNIAudio {
    private static ConcurrentHashMap<Integer, EventListener> eventListeners = new ConcurrentHashMap<>();
    private static List<AudioBufferListener> audioBufferListeners = new CopyOnWriteArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/audio/JNIAudio$AudioBufferListener.class */
    public interface AudioBufferListener {
        void onBufferFill(short[] sArr);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/audio/JNIAudio$EventListener.class */
    public interface EventListener {
        void onError(int i7, int i8);

        void onEvent(int i7, String str);
    }

    public static native int createAudioContext();

    public static native void destroy(int i7);

    public static native void destroyAll(int[] iArr);

    public static void destroyUnregisterAll(int[] iArr) {
        for (int i7 : iArr) {
            unregisterEventListener(i7);
        }
        destroyAll(iArr);
    }

    public static native double getBuffered(int i7);

    public static native double getCurrentTime(int i7);

    public static native double getDuration(int i7);

    public static native String getSrc(int i7);

    public static native double getStartTime(int i7);

    public static native double getVolume(int i7);

    public static native int initAudio(String str);

    public static native boolean isAutoplay(int i7);

    public static native boolean isLoop(int i7);

    public static native boolean isPaused(int i7);

    public static native void pause(int i7);

    public static native void pauseAll();

    public static native void pauseRecord();

    public static native void play(int i7);

    @Keep
    public static void pushAudioBuffer(short[] sArr) {
        Iterator<AudioBufferListener> it = audioBufferListeners.iterator();
        while (it.hasNext()) {
            it.next().onBufferFill(sArr);
        }
    }

    @Keep
    public static void pushError(int i7, int i8) {
        EventListener eventListener = eventListeners.get(Integer.valueOf(i7));
        if (eventListener != null) {
            eventListener.onError(i7, i8);
        }
    }

    @Keep
    public static void pushEvent(int i7, String str) {
        EventListener eventListener = eventListeners.get(Integer.valueOf(i7));
        if (eventListener != null) {
            eventListener.onEvent(i7, str);
        }
    }

    public static void registerAudioBufferListener(AudioBufferListener audioBufferListener) {
        audioBufferListeners.add(audioBufferListener);
    }

    public static void registerEventListener(int i7, EventListener eventListener) {
        eventListeners.put(Integer.valueOf(i7), eventListener);
    }

    public static native void resumeRecord();

    public static native void seek(int i7, double d7);

    public static native void setAllVolumeFactor(double d7);

    public static native void setAutoplay(int i7, boolean z6);

    public static native void setLoop(int i7, boolean z6);

    public static native void setPlayable(boolean z6);

    public static native void setSrc(int i7, String str, long j7);

    public static native void setStartTime(int i7, double d7);

    public static native void setVolume(int i7, double d7);

    public static native void setup(int i7, String str, long j7, double d7, boolean z6, boolean z7, double d8, boolean z8, boolean z9, double d9);

    public static native void startRecord();

    public static native void stop(int i7);

    public static native void stopRecord();

    public static boolean supportRecord() {
        try {
            stopRecord();
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    public static void unregisterAudioBufferListener(AudioBufferListener audioBufferListener) {
        audioBufferListeners.remove(audioBufferListener);
    }

    public static void unregisterEventListener(int i7) {
        eventListeners.remove(Integer.valueOf(i7));
    }
}
