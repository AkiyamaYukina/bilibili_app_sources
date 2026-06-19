package com.bilibili.upper.module.datacollect;

import android.content.SharedPreferences;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import java.io.File;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/datacollect/UpperDraftCollect$checkDraftUpload$1.class */
final class UpperDraftCollect$checkDraftUpload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c $uploader;
    Object L$0;
    int label;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperDraftCollect$checkDraftUpload$1(d dVar, c cVar, Continuation<? super UpperDraftCollect$checkDraftUpload$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$uploader = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperDraftCollect$checkDraftUpload$1(this.this$0, this.$uploader, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List listB;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutLong;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) UpperFawkesDeviceDecision.f105508x.getValue()).booleanValue()) {
                    BLog.i("UpperDraftCollect", "enableUploadDraft = false,do not upload");
                    return Unit.INSTANCE;
                }
                SharedPrefX sharedPrefX = (SharedPrefX) this.this$0.f113084b.getValue();
                if (sharedPrefX != null) {
                    if (System.currentTimeMillis() - sharedPrefX.getLong("upper_last_upload_time", 0L) >= 86400000) {
                        listB = d.b(this.this$0);
                        if (listB.isEmpty()) {
                            BLog.e("UpperDraftCollect", "has no draft，return");
                            return Unit.INSTANCE;
                        }
                        String strA = d.a(this.this$0, listB);
                        c cVar = this.$uploader;
                        this.L$0 = listB;
                        this.label = 1;
                        cVar.getClass();
                        obj = c.a(strA, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                BLog.i("UpperDraftCollect", "24h upload,return");
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listB = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str == null || str.length() == 0) {
                BLog.e("UpperDraftCollect", "upload failed ,uploadUri=" + str);
            } else {
                SharedPrefX sharedPrefX2 = (SharedPrefX) this.this$0.f113084b.getValue();
                if (sharedPrefX2 != null && (editorEdit = sharedPrefX2.edit()) != null && (editorPutLong = editorEdit.putLong("upper_last_upload_time", System.currentTimeMillis())) != null) {
                    editorPutLong.apply();
                }
                d.c(this.this$0, listB);
                d.d(this.this$0, listB, str);
            }
            File file = new File((String) this.this$0.f113085c.getValue());
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
