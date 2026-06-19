package com.bilibili.studio.editor.asr.core.remote;

import androidx.core.app.o;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.editor.asr.core.bean.AsrCreateTaskResultNew;
import com.bilibili.studio.editor.asr.core.bean.AsrResponse;
import com.bilibili.studio.editor.asr.core.config.AsrStep;
import com.bilibili.studio.editor.asr.core.exception.AsrServerErrorException;
import com.bilibili.studio.editor.asr.core.remote.h;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function1;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/remote/h.class */
@Deprecated(message = "本质不再被调用，都在[FastAsrRemoteTask]")
public final class h extends f {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/remote/h$a.class */
    public static final class a extends TypeReference<AsrResponse<AsrCreateTaskResultNew>> {
    }

    @Override // com.bilibili.studio.editor.asr.core.remote.k
    @NotNull
    public final AsrStep a() {
        return AsrStep.QUERY_REMOTE_TASK;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.studio.editor.asr.core.remote.g] */
    @Override // com.bilibili.studio.editor.asr.core.remote.f
    public final void b(@Nullable final String str, @NotNull final Dw0.a aVar) throws InterruptedException {
        aVar.getClass();
        ?? r02 = new Function1(this, aVar, str) { // from class: com.bilibili.studio.editor.asr.core.remote.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f105560a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Dw0.a f105561b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105562c;

            {
                this.f105560a = this;
                this.f105561b = aVar;
                this.f105562c = str;
            }

            public final Object invoke(Object obj) throws AsrServerErrorException {
                ((Integer) obj).getClass();
                h hVar = this.f105560a;
                hVar.getClass();
                Dw0.a aVar2 = this.f105561b;
                aVar2.getClass();
                String str2 = this.f105562c;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                Response responseExecute = Fw0.b.a(aVar2).newCall(new Request.Builder().url("https://member.bilibili.com/x/creative-tool/asr/common/task/result?model_id=asr_common&biz_name=pink&task_id=".concat(str3)).get().build()).execute();
                ResponseBody responseBodyBody = responseExecute.body();
                AsrResponse asrResponse = (AsrResponse) JSON.parseObject(responseBodyBody != null ? responseBodyBody.string() : null, new h.a(), new Feature[0]);
                if (!responseExecute.isSuccessful()) {
                    AsrServerErrorException asrServerErrorException = new AsrServerErrorException(AsrStep.QUERY_REMOTE_TASK, o.a(responseExecute.code(), "Server Error code:", " msg:", responseExecute.message()));
                    BLog.e("AsrRemoteTask", asrServerErrorException.getMessage());
                    throw asrServerErrorException;
                }
                if (asrResponse != null && asrResponse.getCode() == 0 && asrResponse.getData() != null) {
                    return Boolean.valueOf(hVar.e((AsrCreateTaskResultNew) asrResponse.getData()));
                }
                AsrServerErrorException asrServerErrorException2 = new AsrServerErrorException(AsrStep.QUERY_REMOTE_TASK, o.a(asrResponse.getCode(), "Server Error code:", " msg:", asrResponse.getMessage()));
                BLog.e("AsrRemoteTask", asrServerErrorException2.getMessage());
                throw asrServerErrorException2;
            }
        };
        for (int i7 = 0; i7 < 120 && !((Boolean) r02.invoke(Integer.valueOf(i7))).booleanValue(); i7++) {
            Thread.sleep(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE);
        }
    }
}
