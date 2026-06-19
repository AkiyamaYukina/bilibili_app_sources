package com.bilibili.mediastreaming.audio.croutine;

import android.os.Process;
import androidx.appcompat.app.n;
import com.bilibili.mediastreaming.audio.IBiliAudioLoggerObserver;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/croutine/BiliAudioCoroutineKt.class */
public final class BiliAudioCoroutineKt {
    public static final <T> T a(boolean z6, String str, CoroutineScope coroutineScope, CoroutineStart coroutineStart, Function0<? extends T> function0) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (z6) {
            System.currentTimeMillis();
            T t7 = (T) function0.invoke();
            objectRef.element = t7;
            return t7;
        }
        if (n.a(Thread.currentThread())) {
            com.bilibili.mediastreaming.audio.a.a(IBiliAudioLoggerObserver.Severity.LS_ERROR, "BiliCoroutineScope", "warning!!! current thread is Main, Not recommended Invoke!!!!, funcName:" + str, null);
        }
        BuildersKt.runBlocking$default((CoroutineContext) null, new BiliAudioCoroutineKt$innerInvoke$1(str, BuildersKt.launch(coroutineScope, coroutineScope.getCoroutineContext(), coroutineStart, new BiliAudioCoroutineKt$innerInvoke$job$1(objectRef, function0, str, null)), null), 1, (Object) null);
        return (T) objectRef.element;
    }

    public static final Job b(boolean z6, String str, CoroutineScope coroutineScope, CoroutineStart coroutineStart, Function0<Unit> function0) {
        if (!z6) {
            return BuildersKt.launch(coroutineScope, coroutineScope.getCoroutineContext(), coroutineStart, new BiliAudioCoroutineKt$innerPostTask$1(function0, null));
        }
        System.currentTimeMillis();
        function0.invoke();
        return null;
    }

    @Nullable
    public static final <T> T c(@NotNull CoroutineScope coroutineScope, @Nullable String str, int i7, @NotNull CoroutineStart coroutineStart, @NotNull Function0<? extends T> function0) {
        return (T) a(Process.myTid() == i7, str, coroutineScope, coroutineStart, function0);
    }

    public static Object d(CoroutineScope coroutineScope, String str, long j7, Function0 function0) {
        return a(Thread.currentThread().getId() == j7, str, coroutineScope, CoroutineStart.DEFAULT, function0);
    }
}
