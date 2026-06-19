package com.bilibili.studio.upper.publish;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bapis.bilibili.broadcast.message.archive.VideoDataReply;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.studio.upper.publish.model.ArchiveCheckStatus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/PublishDynamicMossCallback$onNext$1.class */
public final class PublishDynamicMossCallback$onNext$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final VideoDataReply $videoData;
    int label;
    final PublishDynamicMossCallback this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.upper.publish.PublishDynamicMossCallback$onNext$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/PublishDynamicMossCallback$onNext$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IA0.a $archiveInfo;
        int label;
        final PublishDynamicMossCallback this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PublishDynamicMossCallback publishDynamicMossCallback, IA0.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = publishDynamicMossCallback;
            this.$archiveInfo = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$archiveInfo, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (PublishDynamicMossCallback.c(this.this$0, this.$archiveInfo.f10087d)) {
                PublishDynamicMossCallback publishDynamicMossCallback = this.this$0;
                IA0.a aVar = this.$archiveInfo;
                publishDynamicMossCallback.getClass();
                String str = aVar.f10084a;
                IA0.b bVar = publishDynamicMossCallback.f108669c;
                bVar.f10090a.remove(IA0.b.c(str));
                bVar.d();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishDynamicMossCallback$onNext$1(VideoDataReply videoDataReply, PublishDynamicMossCallback publishDynamicMossCallback, Continuation<? super PublishDynamicMossCallback$onNext$1> continuation) {
        super(2, continuation);
        this.$videoData = videoDataReply;
        this.this$0 = publishDynamicMossCallback;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PublishDynamicMossCallback$onNext$1(this.$videoData, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int intValue;
        ArchiveCheckStatus archiveCheckStatus;
        JSONObject object;
        long jLongValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            int i8 = 0;
            long j7 = 0;
            try {
                object = JSON.parseObject(this.$videoData.getData());
                jLongValue = object.getLong("Aid").longValue();
                j7 = jLongValue;
                intValue = object.getIntValue("Status");
            } catch (Exception e7) {
                e = e7;
                intValue = 0;
            }
            try {
                BLog.i("PublishDynamicMossCallback", "MossCallback onNext jsonObject=" + object);
                j7 = jLongValue;
            } catch (Exception e8) {
                e = e8;
                j7 = jLongValue;
                e.printStackTrace();
                defpackage.a.b("PUBLISH_DEBUG, ArchiveReviewStatus, json parse error: ", e.getMessage(), "PublishDynamicMossCallback");
            }
            IA0.a aVarB = this.this$0.f108669c.b(j7);
            if (aVarB == null) {
                return Unit.INSTANCE;
            }
            ArchiveCheckStatus[] archiveCheckStatusArrValues = ArchiveCheckStatus.values();
            int length = archiveCheckStatusArrValues.length;
            while (true) {
                if (i8 >= length) {
                    archiveCheckStatus = null;
                    break;
                }
                archiveCheckStatus = archiveCheckStatusArrValues[i8];
                if (archiveCheckStatus.getValue() == intValue) {
                    break;
                }
                i8++;
            }
            ArchiveCheckStatus archiveCheckStatus2 = archiveCheckStatus;
            if (archiveCheckStatus == null) {
                archiveCheckStatus2 = ArchiveCheckStatus.uploadError;
            }
            if (aVarB.f10087d.compareTo(archiveCheckStatus2) >= 0) {
                return Unit.INSTANCE;
            }
            String str = aVarB.f10084a;
            long j8 = aVarB.f10085b;
            String str2 = aVarB.f10086c;
            StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(j8, "PUBLISH_DEBUG, archive moss arrived: id: ", str, ", aid: ");
            sbA.append(", cid: ");
            sbA.append(str2);
            sbA.append(", status: ");
            sbA.append(archiveCheckStatus2);
            Xi1.b.a(sbA, UtilsKt.DOT, "PublishDynamicMossCallback");
            aVarB.f10087d = archiveCheckStatus2;
            this.this$0.f108669c.d();
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, aVarB, null);
            this.label = 1;
            if (BuildersKt.withContext(immediate, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        h.a("moss", "success");
        return Unit.INSTANCE;
    }
}
