package com.bilibili.studio.editor.asr.core.remote;

import androidx.compose.ui.text.font.C4496a;
import androidx.core.app.o;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.editor.asr.core.bean.AsrCreateTaskResultNew;
import com.bilibili.studio.editor.asr.core.bean.AsrRequestParam;
import com.bilibili.studio.editor.asr.core.bean.AsrResponse;
import com.bilibili.studio.editor.asr.core.config.AsrStep;
import com.bilibili.studio.editor.asr.core.exception.AsrBaseException;
import com.bilibili.studio.editor.asr.core.exception.AsrOtherException;
import com.bilibili.studio.editor.asr.core.exception.AsrQueryFailedException;
import com.bilibili.studio.editor.asr.core.exception.AsrQueryHasBeenDeletedException;
import com.bilibili.studio.editor.asr.core.exception.AsrQueryNoResultException;
import com.bilibili.studio.editor.asr.core.exception.AsrServerErrorException;
import com.tencent.connect.common.Constants;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/remote/f.class */
public abstract class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Dw0.a f105553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AsrRequestParam f105554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<AsrStep, Long> f105555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<? super String, Unit> f105556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<? super AsrBaseException, Unit> f105557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public AsrCreateTaskResultNew f105558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f105559g;

    @NotNull
    public final ThreadPoolExecutor h;

    public f(@NotNull Dw0.a aVar, @NotNull AsrRequestParam asrRequestParam, @NotNull Map<AsrStep, Long> map, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super AsrBaseException, Unit> function12) {
        this.f105553a = aVar;
        this.f105554b = asrRequestParam;
        this.f105555c = map;
        this.f105556d = function1;
        this.f105557e = function12;
        Hw0.d dVar = Fw0.b.f6462a;
        Lazy lazy = zw0.b.f130950a;
        String strDd = DeviceDecision.INSTANCE.dd("uper.asr_audio_task_concurrent_count", Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
        this.h = Fw0.b.b(strDd != null ? Integer.parseInt(strDd) : 10);
    }

    public abstract void b(@Nullable String str, @NotNull Dw0.a aVar);

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.studio.editor.asr.core.remote.b] */
    public final void c(final String str) throws InterruptedException {
        boolean z6;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.f105559g = System.currentTimeMillis();
        this.f105553a.getClass();
        ?? r02 = new Function1(this, str, objectRef) { // from class: com.bilibili.studio.editor.asr.core.remote.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f105545a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105546b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Ref.ObjectRef f105547c;

            {
                this.f105545a = this;
                this.f105546b = str;
                this.f105547c = objectRef;
            }

            public final Object invoke(Object obj) {
                Object obj2;
                boolean z7 = true;
                String str2 = this.f105546b;
                ((Integer) obj).getClass();
                f fVar = this.f105545a;
                fVar.getClass();
                try {
                    Result.Companion companion = Result.Companion;
                    com.bilibili.studio.editor.asr.core.util.a.c(null, fVar.a(), new com.bilibili.mini.player.common.utils.c(1, fVar, str2));
                    obj2 = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj2);
                if (th2 != null) {
                    th2.printStackTrace();
                    Ew0.b.f4798a.d("AsrBaseRemote", th2.getMessage());
                    AsrBaseException asrBaseException = null;
                    if (th2 instanceof AsrBaseException) {
                        asrBaseException = (AsrBaseException) th2;
                    }
                    AsrBaseException asrOtherException = asrBaseException;
                    if (asrBaseException == null) {
                        asrOtherException = new AsrOtherException(AsrStep.START_REMOTE_TASK, C4496a.a("AsrBaseRemote ", th2.getMessage()));
                    }
                    this.f105547c.element = asrOtherException;
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            }
        };
        int i7 = 0;
        while (true) {
            z6 = false;
            if (i7 >= 3) {
                break;
            }
            if (((Boolean) r02.invoke(Integer.valueOf(i7))).booleanValue()) {
                z6 = true;
                break;
            } else {
                Thread.sleep(3);
                i7++;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z6);
        if (z6) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            this.f105555c.put(a(), Long.valueOf(System.currentTimeMillis() - this.f105559g));
            AsrBaseException asrBaseException = (AsrBaseException) objectRef.element;
            AsrBaseException asrOtherException = asrBaseException;
            if (asrBaseException == null) {
                asrOtherException = new AsrOtherException(AsrStep.START_REMOTE_TASK, "AsrBaseRemote onFailed");
            }
            this.f105557e.invoke(asrOtherException);
        }
    }

    public final void d(@Nullable final String str) {
        this.f105559g = System.currentTimeMillis();
        this.h.execute(new Runnable(this, str) { // from class: com.bilibili.studio.editor.asr.core.remote.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f105551a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105552b;

            {
                this.f105551a = this;
                this.f105552b = str;
            }

            /* JADX WARN: Type inference failed for: r0v57, types: [com.bilibili.studio.editor.asr.core.remote.a] */
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                boolean z6;
                f fVar = this.f105551a;
                String str2 = this.f105552b;
                AsrCreateTaskResultNew asrCreateTaskResultNew = fVar.f105558f;
                if (asrCreateTaskResultNew != null) {
                    fVar.c(asrCreateTaskResultNew.getTaskId());
                    return;
                }
                com.bilibili.bililive.room.ui.roomv3.topoperation.biz.dmvote.d dVar = new com.bilibili.bililive.room.ui.roomv3.topoperation.biz.dmvote.d(fVar, 2);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                fVar.f105553a.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("model_id", "asr_common");
                JSONObject jSONObject2 = new JSONObject();
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                jSONObject2.put("resource", str3);
                jSONObject2.put("model_type", "16k_zh");
                jSONObject2.put("innet_result", Boolean.FALSE);
                Boolean bool = Boolean.TRUE;
                jSONObject2.put("vad", bool);
                String captionType = fVar.f105554b.getCaptionType();
                if (captionType.length() <= 0) {
                    captionType = null;
                }
                String str4 = captionType;
                if (captionType == null) {
                    str4 = "auto";
                }
                jSONObject2.put("caption_type", str4);
                jSONObject2.put("punc", bool);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_itn", bool);
                jSONObject3.put("max_punctuated_length", 25);
                jSONObject2.put("punc_param", jSONObject3);
                jSONObject2.put("with_word_level_result", bool);
                jSONObject2.put("with_vad_result", bool);
                jSONObject2.put("hotword_list", "");
                jSONObject.put("params", jSONObject2.toString());
                jSONObject.put("biz_name", "pink");
                ?? r02 = new Function1(fVar, jSONObject, dVar, objectRef) { // from class: com.bilibili.studio.editor.asr.core.remote.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final f f105541a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final JSONObject f105542b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final com.bilibili.bililive.room.ui.roomv3.topoperation.biz.dmvote.d f105543c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final Ref.ObjectRef f105544d;

                    {
                        this.f105541a = fVar;
                        this.f105542b = jSONObject;
                        this.f105543c = dVar;
                        this.f105544d = objectRef;
                    }

                    public final Object invoke(Object obj) {
                        JSONObject jSONObject4 = this.f105542b;
                        final com.bilibili.bililive.room.ui.roomv3.topoperation.biz.dmvote.d dVar2 = this.f105543c;
                        ((Integer) obj).getClass();
                        final f fVar2 = this.f105541a;
                        fVar2.getClass();
                        boolean z7 = true;
                        try {
                            Result.Companion companion = Result.Companion;
                            Request requestBuild = new Request.Builder().url("https://member.bilibili.com/x/creative-tool/asr/common/task").post(RequestBody.create(MediaType.parse("application/json"), jSONObject4.toJSONString())).build();
                            Hw0.d dVar3 = Fw0.b.f6462a;
                            final Call callNewCall = Fw0.b.a(fVar2.f105553a).newCall(requestBuild);
                            com.bilibili.studio.editor.asr.core.util.a.c(callNewCall, AsrStep.START_REMOTE_TASK, new Function0(callNewCall, fVar2, dVar2) { // from class: com.bilibili.studio.editor.asr.core.remote.c

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final Call f105548a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final f f105549b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final com.bilibili.bililive.room.ui.roomv3.topoperation.biz.dmvote.d f105550c;

                                {
                                    this.f105548a = callNewCall;
                                    this.f105549b = fVar2;
                                    this.f105550c = dVar2;
                                }

                                public final Object invoke() throws AsrServerErrorException {
                                    Response responseExecute = this.f105548a.execute();
                                    ResponseBody responseBodyBody = responseExecute.body();
                                    AsrResponse asrResponse = (AsrResponse) JSON.parseObject(responseBodyBody != null ? responseBodyBody.string() : null, new e(), new Feature[0]);
                                    if (!responseExecute.isSuccessful()) {
                                        throw new AsrServerErrorException(AsrStep.START_REMOTE_TASK, o.a(responseExecute.code(), "Server Error code:", " msg:", responseExecute.message()));
                                    }
                                    if (asrResponse == null || asrResponse.getCode() != 0 || asrResponse.getData() == null) {
                                        throw new AsrServerErrorException(AsrStep.START_REMOTE_TASK, o.a(asrResponse.getCode(), "Server Error code:", " msg:", asrResponse.getMessage()));
                                    }
                                    f fVar3 = this.f105549b;
                                    fVar3.f105555c.put(AsrStep.START_REMOTE_TASK, Long.valueOf(System.currentTimeMillis() - fVar3.f105559g));
                                    this.f105550c.invoke(asrResponse.getData());
                                    return Unit.INSTANCE;
                                }
                            });
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
                            if (th2 != null) {
                                th2.printStackTrace();
                                Ew0.b.f4798a.d("AsrBaseRemote", th2.getMessage());
                                AsrBaseException asrBaseException = th2 instanceof AsrBaseException ? (AsrBaseException) th2 : null;
                                AsrBaseException asrOtherException = asrBaseException;
                                if (asrBaseException == null) {
                                    asrOtherException = new AsrOtherException(AsrStep.START_REMOTE_TASK, C4496a.a("AsrBaseRemote ", th2.getMessage()));
                                }
                                this.f105544d.element = asrOtherException;
                                z7 = false;
                            }
                        }
                        return Boolean.valueOf(z7);
                    }
                };
                int i7 = 0;
                while (true) {
                    z6 = false;
                    if (i7 >= 3) {
                        break;
                    }
                    if (((Boolean) r02.invoke(Integer.valueOf(i7))).booleanValue()) {
                        z6 = true;
                        break;
                    } else {
                        Thread.sleep(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE);
                        i7++;
                    }
                }
                Boolean boolValueOf = null;
                if (!z6) {
                    boolValueOf = Boolean.valueOf(z6);
                }
                if (boolValueOf != null) {
                    Map<AsrStep, Long> map = fVar.f105555c;
                    AsrStep asrStep = AsrStep.START_REMOTE_TASK;
                    map.put(asrStep, Long.valueOf(System.currentTimeMillis() - fVar.f105559g));
                    AsrBaseException asrBaseException = (AsrBaseException) objectRef.element;
                    AsrBaseException asrOtherException = asrBaseException;
                    if (asrBaseException == null) {
                        asrOtherException = new AsrOtherException(asrStep, "AsrBaseRemote onFailed");
                    }
                    fVar.f105557e.invoke(asrOtherException);
                }
            }
        });
    }

    public final boolean e(@NotNull AsrCreateTaskResultNew asrCreateTaskResultNew) throws AsrQueryNoResultException, AsrQueryHasBeenDeletedException, AsrOtherException, AsrQueryFailedException {
        int state = asrCreateTaskResultNew.getState();
        if (state == 0) {
            BLog.d("AsrBaseRemote", "result:" + asrCreateTaskResultNew.getTaskId());
            String result = asrCreateTaskResultNew.getResult();
            if (result == null) {
                return false;
            }
            this.f105555c.put(AsrStep.QUERY_REMOTE_TASK, Long.valueOf(System.currentTimeMillis() - this.f105559g));
            this.f105556d.invoke(result);
            return true;
        }
        if (state == 1) {
            return false;
        }
        if (state == 2) {
            AsrQueryNoResultException asrQueryNoResultException = new AsrQueryNoResultException(AsrStep.QUERY_REMOTE_TASK, "no result");
            BLog.e("AsrBaseRemote", asrQueryNoResultException.getMessage());
            throw asrQueryNoResultException;
        }
        if (state == 3) {
            AsrQueryFailedException asrQueryFailedException = new AsrQueryFailedException(AsrStep.QUERY_REMOTE_TASK, "task failed}");
            BLog.e("AsrBaseRemote", asrQueryFailedException.getMessage());
            throw asrQueryFailedException;
        }
        if (state == 4) {
            AsrQueryHasBeenDeletedException asrQueryHasBeenDeletedException = new AsrQueryHasBeenDeletedException(AsrStep.QUERY_REMOTE_TASK, "has been deleted");
            BLog.e("AsrBaseRemote", asrQueryHasBeenDeletedException.getMessage());
            throw asrQueryHasBeenDeletedException;
        }
        if (state != 5) {
            AsrOtherException asrOtherException = new AsrOtherException(AsrStep.QUERY_REMOTE_TASK, "query other error");
            BLog.e("AsrBaseRemote", asrOtherException.getMessage());
            throw asrOtherException;
        }
        AsrQueryHasBeenDeletedException asrQueryHasBeenDeletedException2 = new AsrQueryHasBeenDeletedException(AsrStep.QUERY_REMOTE_TASK, "time out");
        BLog.e("AsrBaseRemote", asrQueryHasBeenDeletedException2.getMessage());
        throw asrQueryHasBeenDeletedException2;
    }
}
