package com.bilibili.studio.editor.moudle.caption.manager;

import com.bilibili.studio.editor.moudle.caption.manager.CaptionDataManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/manager/CaptionDataManager$installCaption$1.class */
public final class CaptionDataManager$installCaption$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $captionId;
    final CaptionDataManager.a $onInstalledListener;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionDataManager$installCaption$1(int i7, CaptionDataManager.a aVar, Continuation<? super CaptionDataManager$installCaption$1> continuation) {
        super(2, continuation);
        this.$captionId = i7;
        this.$onInstalledListener = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptionDataManager$installCaption$1(this.$captionId, this.$onInstalledListener, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0139 A[Catch: Exception -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0034, B:65:0x0273, B:67:0x02a9, B:70:0x02b6, B:72:0x02bf, B:18:0x005e, B:38:0x0107, B:41:0x0139, B:43:0x014f, B:45:0x01b2, B:46:0x01b8, B:46:0x01b8, B:47:0x01bb, B:50:0x01e7, B:55:0x01fc, B:58:0x0216, B:60:0x021d, B:19:0x0065, B:26:0x0090, B:28:0x009b, B:30:0x00b3, B:32:0x00bb, B:34:0x00f9, B:21:0x0070), top: B:76:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b2 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0034, B:65:0x0273, B:67:0x02a9, B:70:0x02b6, B:72:0x02bf, B:18:0x005e, B:38:0x0107, B:41:0x0139, B:43:0x014f, B:45:0x01b2, B:46:0x01b8, B:46:0x01b8, B:47:0x01bb, B:50:0x01e7, B:55:0x01fc, B:58:0x0216, B:60:0x021d, B:19:0x0065, B:26:0x0090, B:28:0x009b, B:30:0x00b3, B:32:0x00bb, B:34:0x00f9, B:21:0x0070), top: B:76:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7 A[Catch: Exception -> 0x003e, TRY_ENTER, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0034, B:65:0x0273, B:67:0x02a9, B:70:0x02b6, B:72:0x02bf, B:18:0x005e, B:38:0x0107, B:41:0x0139, B:43:0x014f, B:45:0x01b2, B:46:0x01b8, B:46:0x01b8, B:47:0x01bb, B:50:0x01e7, B:55:0x01fc, B:58:0x0216, B:60:0x021d, B:19:0x0065, B:26:0x0090, B:28:0x009b, B:30:0x00b3, B:32:0x00bb, B:34:0x00f9, B:21:0x0070), top: B:76:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021d A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0034, B:65:0x0273, B:67:0x02a9, B:70:0x02b6, B:72:0x02bf, B:18:0x005e, B:38:0x0107, B:41:0x0139, B:43:0x014f, B:45:0x01b2, B:46:0x01b8, B:46:0x01b8, B:47:0x01bb, B:50:0x01e7, B:55:0x01fc, B:58:0x0216, B:60:0x021d, B:19:0x0065, B:26:0x0090, B:28:0x009b, B:30:0x00b3, B:32:0x00bb, B:34:0x00f9, B:21:0x0070), top: B:76:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a9 A[Catch: Exception -> 0x003e, TRY_ENTER, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0034, B:65:0x0273, B:67:0x02a9, B:70:0x02b6, B:72:0x02bf, B:18:0x005e, B:38:0x0107, B:41:0x0139, B:43:0x014f, B:45:0x01b2, B:46:0x01b8, B:46:0x01b8, B:47:0x01bb, B:50:0x01e7, B:55:0x01fc, B:58:0x0216, B:60:0x021d, B:19:0x0065, B:26:0x0090, B:28:0x009b, B:30:0x00b3, B:32:0x00bb, B:34:0x00f9, B:21:0x0070), top: B:76:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bf A[Catch: Exception -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:11:0x0034, B:65:0x0273, B:67:0x02a9, B:70:0x02b6, B:72:0x02bf, B:18:0x005e, B:38:0x0107, B:41:0x0139, B:43:0x014f, B:45:0x01b2, B:46:0x01b8, B:46:0x01b8, B:47:0x01bb, B:50:0x01e7, B:55:0x01fc, B:58:0x0216, B:60:0x021d, B:19:0x0065, B:26:0x0090, B:28:0x009b, B:30:0x00b3, B:32:0x00bb, B:34:0x00f9, B:21:0x0070), top: B:76:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.manager.CaptionDataManager$installCaption$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
