package com.bilibili.studio.videoeditor.capturev3.logic;

import android.app.Application;
import android.text.TextUtils;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.videoeditor.util.I;
import com.bilibili.studio.videoeditor.util.J;
import java.io.File;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/CaptureRecordManager$initData$1.class */
public final class CaptureRecordManager$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $isFromEditor;
    final boolean $isOnlyOneCaptureInstance;
    int label;
    final CaptureRecordManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureRecordManager$initData$1(CaptureRecordManager captureRecordManager, boolean z6, boolean z7, Continuation<? super CaptureRecordManager$initData$1> continuation) {
        super(2, continuation);
        this.this$0 = captureRecordManager;
        this.$isOnlyOneCaptureInstance = z6;
        this.$isFromEditor = z7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptureRecordManager$initData$1(this.this$0, this.$isOnlyOneCaptureInstance, this.$isFromEditor, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean zContains;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CaptureRecordManager captureRecordManager = this.this$0;
        boolean z6 = this.$isOnlyOneCaptureInstance;
        boolean z7 = this.$isFromEditor;
        J j7 = captureRecordManager.f109189b;
        if (j7 != null && captureRecordManager.f109190c != null) {
            j7.d(BiliContext.application());
            captureRecordManager.f109190c.a(BiliContext.application());
            Application application = BiliContext.application();
            if (PB0.c.f18584a == null) {
                PB0.c.b(application);
            }
            String str = PB0.c.f18584a;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists()) {
                    File[] fileArrListFiles = file.listFiles();
                    ArrayList arrayList = new ArrayList();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        for (File file2 : fileArrListFiles) {
                            BLog.e("CaptureRecordManager", " checkAndDeleteNotRecordFiles " + file2.getAbsolutePath());
                            String absolutePath = file2.getAbsolutePath();
                            arrayList.add(absolutePath);
                            if (!captureRecordManager.f109189b.b(absolutePath) && !z7) {
                                I i7 = captureRecordManager.f109190c;
                                synchronized (i7) {
                                    if (!i7.f110203b) {
                                        throw new IllegalArgumentException("You must call readFromSp before checkVideoReferenced");
                                    }
                                    zContains = i7.f110202a.contains(absolutePath);
                                    BLog.e("I", "checkVideoReferenced videoPath=" + absolutePath + ",isReferenced=" + zContains);
                                }
                                if (!zContains && z6) {
                                    PB0.c.a(absolutePath);
                                }
                            }
                        }
                    }
                    I i8 = captureRecordManager.f109190c;
                    Application application2 = BiliContext.application();
                    synchronized (i8) {
                        if (arrayList.size() == 0) {
                            BLog.e("I", "updateRecord files == null || files.size() == 0");
                            i8.f110202a.clear();
                            i8.b(application2);
                        } else if (!i8.f110202a.isEmpty()) {
                            BLog.e("I", "updateRecord files.size=" + arrayList.size() + ",list.size=" + i8.f110202a.size());
                            ArrayList arrayList2 = new ArrayList();
                            for (int i9 = 0; i9 < i8.f110202a.size(); i9++) {
                                String str2 = i8.f110202a.get(i9);
                                if (arrayList.contains(str2)) {
                                    arrayList2.add(str2);
                                }
                            }
                            i8.f110202a.clear();
                            i8.f110202a.addAll(arrayList2);
                            i8.b(application2);
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
