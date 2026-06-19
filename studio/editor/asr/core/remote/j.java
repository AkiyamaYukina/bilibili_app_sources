package com.bilibili.studio.editor.asr.core.remote;

import Cw0.m;
import androidx.core.app.o;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.editor.asr.core.bean.AsrCreateTaskResultNew;
import com.bilibili.studio.editor.asr.core.bean.AsrResponse;
import com.bilibili.studio.editor.asr.core.config.AsrStep;
import com.bilibili.studio.editor.asr.core.exception.AsrOtherException;
import com.bilibili.studio.editor.asr.core.exception.AsrQueryFailedException;
import com.bilibili.studio.editor.asr.core.exception.AsrQueryHasBeenDeletedException;
import com.bilibili.studio.editor.asr.core.exception.AsrQueryNoResultException;
import com.bilibili.studio.editor.asr.core.exception.AsrServerErrorException;
import com.bilibili.studio.editor.asr.core.remote.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/remote/j.class */
public final class j extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public m f105566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f105567j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/remote/j$a.class */
    public static final class a extends TypeReference<AsrResponse<AsrCreateTaskResultNew>> {
    }

    public j() {
        throw null;
    }

    @Override // com.bilibili.studio.editor.asr.core.remote.k
    @NotNull
    public final AsrStep a() {
        return this.f105567j ? AsrStep.QUERY_FAST_REMOTE_TASK : AsrStep.QUERY_REMOTE_TASK;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.studio.editor.asr.core.remote.i] */
    @Override // com.bilibili.studio.editor.asr.core.remote.f
    public final void b(@Nullable final String str, @NotNull final Dw0.a aVar) throws InterruptedException {
        aVar.getClass();
        ?? r02 = new Function1(this, aVar, str) { // from class: com.bilibili.studio.editor.asr.core.remote.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f105563a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Dw0.a f105564b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105565c;

            {
                this.f105563a = this;
                this.f105564b = aVar;
                this.f105565c = str;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invoke(Object obj) throws AsrQueryNoResultException, AsrQueryHasBeenDeletedException, AsrOtherException, NoWhenBranchMatchedException, AsrServerErrorException, AsrQueryFailedException {
                ((Integer) obj).getClass();
                j jVar = this.f105563a;
                jVar.getClass();
                Dw0.a aVar2 = this.f105564b;
                aVar2.getClass();
                String str2 = this.f105565c;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                Response responseExecute = Fw0.b.a(aVar2).newCall(new Request.Builder().url(android.support.v4.media.a.a("https://member.bilibili.com/x/creative-tool/asr/common/task/result?task_id=", str3, "&model_id=asr_common&biz_name=pink")).get().build()).execute();
                ResponseBody responseBodyBody = responseExecute.body();
                boolean zE = false;
                AsrResponse asrResponse = (AsrResponse) JSON.parseObject(responseBodyBody != null ? responseBodyBody.string() : null, new j.a(), new Feature[0]);
                if (!responseExecute.isSuccessful()) {
                    AsrServerErrorException asrServerErrorException = new AsrServerErrorException(AsrStep.QUERY_REMOTE_TASK, o.a(responseExecute.code(), "Server Error code:", " msg:", responseExecute.message()));
                    BLog.e("AsrRemoteTask", asrServerErrorException.getMessage());
                    throw asrServerErrorException;
                }
                if (asrResponse == null || asrResponse.getCode() != 0 || asrResponse.getData() == null) {
                    AsrServerErrorException asrServerErrorException2 = new AsrServerErrorException(AsrStep.QUERY_REMOTE_TASK, o.a(asrResponse.getCode(), "Server Error code:", " msg:", asrResponse.getMessage()));
                    BLog.e("AsrRemoteTask", asrServerErrorException2.getMessage());
                    throw asrServerErrorException2;
                }
                if (jVar.f105567j) {
                    AsrCreateTaskResultNew asrCreateTaskResultNew = (AsrCreateTaskResultNew) asrResponse.getData();
                    String result = asrCreateTaskResultNew.getResult();
                    if (result != null && result.length() != 0) {
                        jVar.f105555c.put(AsrStep.QUERY_FAST_REMOTE_TASK, Long.valueOf(System.currentTimeMillis() - jVar.f105559g));
                        jVar.f105566i.invoke(asrCreateTaskResultNew.getResult());
                        zE = true;
                    } else {
                        if (asrCreateTaskResultNew.getState() == 2) {
                            AsrQueryFailedException asrQueryFailedException = new AsrQueryFailedException(AsrStep.FINISH_TASK, "no result");
                            BLog.e("AsrRemoteTask", asrQueryFailedException.getMessage());
                            throw asrQueryFailedException;
                        }
                        if (asrCreateTaskResultNew.getState() == 3) {
                            AsrQueryFailedException asrQueryFailedException2 = new AsrQueryFailedException(AsrStep.FINISH_TASK, "task failed");
                            BLog.e("AsrRemoteTask", asrQueryFailedException2.getMessage());
                            throw asrQueryFailedException2;
                        }
                        if (asrCreateTaskResultNew.getState() == 4) {
                            AsrQueryHasBeenDeletedException asrQueryHasBeenDeletedException = new AsrQueryHasBeenDeletedException(AsrStep.QUERY_FAST_REMOTE_TASK, "has been deleted");
                            BLog.e("AsrRemoteTask", asrQueryHasBeenDeletedException.getMessage());
                            throw asrQueryHasBeenDeletedException;
                        }
                        if (asrCreateTaskResultNew.getState() == 5) {
                            AsrQueryHasBeenDeletedException asrQueryHasBeenDeletedException2 = new AsrQueryHasBeenDeletedException(AsrStep.QUERY_FAST_REMOTE_TASK, "time out");
                            BLog.e("AsrRemoteTask", asrQueryHasBeenDeletedException2.getMessage());
                            throw asrQueryHasBeenDeletedException2;
                        }
                    }
                } else {
                    zE = jVar.e((AsrCreateTaskResultNew) asrResponse.getData());
                }
                return Boolean.valueOf(zE);
            }
        };
        for (int i7 = 0; i7 < 120 && !((Boolean) r02.invoke(Integer.valueOf(i7))).booleanValue(); i7++) {
            Thread.sleep(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE);
        }
    }
}
