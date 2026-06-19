package com.bilibili.studio.editor.moudle.caption.manager;

import Ny0.p;
import android.content.Context;
import androidx.compose.ui.platform.C4481p;
import com.bilibili.base.MainThread;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.tts.TtsManager;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/manager/e.class */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Float[] f105778g = {Float.valueOf(0.0f), Float.valueOf(10.0f), Float.valueOf(20.0f), Float.valueOf(30.0f), Float.valueOf(40.0f), Float.valueOf(50.0f), Float.valueOf(60.0f), Float.valueOf(70.0f), Float.valueOf(80.0f), Float.valueOf(90.0f), Float.valueOf(99.0f)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Job f105780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Job f105781c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public p.a f105783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f105784f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Yv0.e f105779a = new Yv0.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TtsManager f105782d = new TtsManager();

    public final void a() {
        Job job = this.f105780b;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.f105781c;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f105784f;
        if (zw0.b.j()) {
            Xz0.d dVar = Xz0.d.f28458a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf((jCurrentTimeMillis - j7) / 1000.0d)}, 1));
            dVar.getClass();
            Xz0.d.u(str, str2);
        }
    }

    public final void c(@NotNull final Context context, @NotNull final TtsManagerRequest ttsManagerRequest) {
        this.f105780b = BuildersKt.launch$default(this.f105779a, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorCaptionTtsManager$startProgressJob$1(this, null), 2, (Object) null);
        String str = ttsManagerRequest.text;
        EditTtsInfo editTtsInfo = ttsManagerRequest.editTtsInfo;
        Integer numValueOf = 0;
        ArrayList arrayListA = C4481p.a(str);
        if (editTtsInfo.getSpeedRate() != -1) {
            numValueOf = Integer.valueOf(editTtsInfo.getSpeedRate());
        }
        String ttsVoiceEngine = editTtsInfo.getTtsVoiceEngine();
        String ttsVoice = editTtsInfo.getTtsVoice();
        this.f105784f = System.currentTimeMillis();
        if (zw0.b.j()) {
            Xz0.d.f28458a.getClass();
            Xz0.d.u("start", "");
        }
        Pair pair = TuplesKt.to("speed_level", numValueOf);
        Pair pair2 = TuplesKt.to("pitch_level", 0);
        String str2 = ttsVoice;
        if (ttsVoice == null) {
            str2 = "tianmei";
        }
        Pair pair3 = TuplesKt.to("font_name", str2);
        Pair pair4 = TuplesKt.to("volume", 50);
        Pair pair5 = TuplesKt.to("encode_type", "mp3");
        Pair pair6 = TuplesKt.to("sample_rate", 24000);
        String str3 = ttsVoiceEngine;
        if (ttsVoiceEngine == null) {
            str3 = "bili";
        }
        this.f105782d.f(new com.bilibili.studio.editor.tts.g(context, arrayListA, null, MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, TuplesKt.to("voice_engine", str3), TuplesKt.to("model_id", "tts_pink")}), 12, new Function1(this, context, ttsManagerRequest) { // from class: com.bilibili.studio.editor.moudle.caption.manager.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f105766a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f105767b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TtsManagerRequest f105768c;

            {
                this.f105766a = this;
                this.f105767b = context;
                this.f105768c = ttsManagerRequest;
            }

            public final Object invoke(Object obj) {
                Context context2 = this.f105767b;
                final List list = (List) obj;
                final e eVar = this.f105766a;
                eVar.a();
                ToastHelper.showToastShort(context2, 2131842252);
                final int i7 = 0;
                final TtsManagerRequest ttsManagerRequest2 = this.f105768c;
                MainThread.runOnMainThread(new Function0(list, i7, eVar, ttsManagerRequest2) { // from class: com.bilibili.studio.editor.moudle.caption.manager.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f105772a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f105773b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f105774c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final Object f105775d;

                    {
                        this.f105772a = i7;
                        this.f105773b = list;
                        this.f105774c = eVar;
                        this.f105775d = ttsManagerRequest2;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:60:0x024a  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0258  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke() throws java.lang.CloneNotSupportedException {
                        /*
                            Method dump skipped, instruction units count: 724
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.manager.c.invoke():java.lang.Object");
                    }
                });
                if (eVar.f105783e != null) {
                    eVar.b("success");
                }
                return Unit.INSTANCE;
            }
        }, new Function2(this, context, ttsManagerRequest) { // from class: com.bilibili.studio.editor.moudle.caption.manager.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f105769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f105770b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TtsManagerRequest f105771c;

            {
                this.f105769a = this;
                this.f105770b = context;
                this.f105771c = ttsManagerRequest;
            }

            public final Object invoke(Object obj, Object obj2) {
                Context context2 = this.f105770b;
                ((Long) obj).getClass();
                e eVar = this.f105769a;
                eVar.a();
                ToastHelper.showToastShort(context2, 2131842261);
                MainThread.runOnMainThread(new bG.b(eVar, this.f105771c));
                if (eVar.f105783e != null) {
                    eVar.b("fail");
                }
                return Unit.INSTANCE;
            }
        }, 4));
    }
}
