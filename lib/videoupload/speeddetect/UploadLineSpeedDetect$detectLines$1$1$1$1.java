package com.bilibili.lib.videoupload.speeddetect;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.lib.foundation.FoundationAlias;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import ug0.C8730c;
import vg0.C8808b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadLineSpeedDetect$detectLines$1$1$1$1.class */
public final class UploadLineSpeedDetect$detectLines$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Line>, Object> {
    final String $ip;
    final Line $it;
    final int $postSize;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadLineSpeedDetect$detectLines$1$1$1$1(Line line, int i7, String str, Continuation<? super UploadLineSpeedDetect$detectLines$1$1$1$1> continuation) {
        super(2, continuation);
        this.$it = line;
        this.$postSize = i7;
        this.$ip = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadLineSpeedDetect$detectLines$1$1$1$1(this.$it, this.$postSize, this.$ip, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Line> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ConcurrentHashMap<String, Line> concurrentHashMap = UploadLineSpeedDetect.f65120a;
        Line line = this.$it;
        int i7 = this.$postSize;
        if (UploadLineSpeedDetect.b(line)) {
            byte[] bArr = new byte[i7];
            long jCurrentTimeMillis = System.currentTimeMillis();
            OkHttpClient.Builder builderNewBuilder = C8730c.b(FoundationAlias.getFapp()).f127860b.newBuilder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient okHttpClientBuild = builderNewBuilder.readTimeout(50L, timeUnit).writeTimeout(50L, timeUnit).connectTimeout(50L, timeUnit).build();
            Request.Builder builderPost = new Request.Builder().post(RequestBody.create(MediaType.get("application/octet-stream"), bArr));
            String probeUrl = line.getProbeUrl();
            if (!StringsKt.Z(probeUrl, "http")) {
                probeUrl = C4496a.a("https:", probeUrl);
            }
            if (okHttpClientBuild.newCall(builderPost.url(probeUrl).build()).execute().isSuccessful()) {
                C8808b.b("[BiliUpload] detectSingleLine success probeUrl=" + line.getProbeUrl());
                line.setLatency(System.currentTimeMillis() - jCurrentTimeMillis);
                line.setUploadSize((long) i7);
                line.setUploadSuccess(1);
                line.setDetectTime(System.currentTimeMillis());
            } else {
                C8808b.a("[BiliUpload] detectSingleLine fail probeUrl=" + line.getProbeUrl());
            }
        }
        C8808b.b("[BiliUpload] detectLines end url=" + this.$it.getProbeUrl() + " spend=" + this.$it.getLatency());
        ConcurrentHashMap<String, Line> concurrentHashMap2 = UploadLineSpeedDetect.f65120a;
        Line line2 = concurrentHashMap2.get(this.$ip);
        if (line2 == null || (this.$it.getUploadSuccess() > 0 && this.$it.getLatency() < line2.getLatency())) {
            concurrentHashMap2.put(this.$ip, this.$it);
        }
        return this.$it;
    }
}
