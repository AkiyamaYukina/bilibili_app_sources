package com.bilibili.studio.editor.tts;

import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager.class */
public final class TtsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Yv0.e f108316a = new Yv0.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, Map<String, Pair<TtsInputBean, String>>> f108317b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, Map<String, Triple<TtsInputBean, String, String>>> f108318c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public BiliTemplateEngineManager f108319d;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.studio.editor.tts.TtsManager r6, com.bilibili.studio.editor.tts.g r7, java.lang.String r8, kotlin.Pair r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.tts.TtsManager.a(com.bilibili.studio.editor.tts.TtsManager, com.bilibili.studio.editor.tts.g, java.lang.String, kotlin.Pair, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.studio.editor.tts.TtsManager r6, com.bilibili.studio.editor.tts.g r7, java.lang.String r8, kotlin.Triple r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.tts.TtsManager.b(com.bilibili.studio.editor.tts.TtsManager, com.bilibili.studio.editor.tts.g, java.lang.String, kotlin.Triple, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.studio.editor.tts.TtsManager r10, com.bilibili.studio.editor.tts.g r11, java.lang.String r12, com.bilibili.studio.editor.tts.bean.TtsInputBean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.tts.TtsManager.c(com.bilibili.studio.editor.tts.TtsManager, com.bilibili.studio.editor.tts.g, java.lang.String, com.bilibili.studio.editor.tts.bean.TtsInputBean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.bilibili.studio.editor.tts.TtsManager r10, com.bilibili.studio.editor.tts.g r11, java.lang.String r12, com.bilibili.studio.editor.tts.bean.TtsInputBean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.tts.TtsManager.d(com.bilibili.studio.editor.tts.TtsManager, com.bilibili.studio.editor.tts.g, java.lang.String, com.bilibili.studio.editor.tts.bean.TtsInputBean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static String e(Map map) {
        return "format:" + map.get("encode_type") + "sample_rate:" + map.get("sample_rate") + "voice:" + map.get("font_name") + "volume:" + map.get("volume") + "speech_rate:" + map.get("speed_level") + "pitch_rate:" + map.get("pitch_level") + "voice_engine:" + map.get("voice_engine");
    }

    public final void f(@NotNull g gVar) {
        BiliTemplateEngineManager biliTemplateEngineManager = this.f108319d;
        BiliTemplateEngineManager biliTemplateEngineManager2 = biliTemplateEngineManager;
        if (biliTemplateEngineManager == null) {
            biliTemplateEngineManager2 = new BiliTemplateEngineManager(gVar.f108355e);
            biliTemplateEngineManager2.i(gVar.f108351a);
        }
        this.f108319d = biliTemplateEngineManager2;
        BuildersKt.launch$default(this.f108316a, (CoroutineContext) null, (CoroutineStart) null, new TtsManager$start$2(this, gVar, new ArrayList(), null), 3, (Object) null);
    }

    public final void g(@NotNull g gVar) {
        BiliTemplateEngineManager biliTemplateEngineManager = this.f108319d;
        BiliTemplateEngineManager biliTemplateEngineManager2 = biliTemplateEngineManager;
        if (biliTemplateEngineManager == null) {
            biliTemplateEngineManager2 = new BiliTemplateEngineManager(0);
            biliTemplateEngineManager2.i(gVar.f108351a);
        }
        this.f108319d = biliTemplateEngineManager2;
        BuildersKt.launch$default(this.f108316a, Dispatchers.getIO(), (CoroutineStart) null, new TtsManager$startLongTts$2(gVar, this, null), 2, (Object) null);
    }
}
