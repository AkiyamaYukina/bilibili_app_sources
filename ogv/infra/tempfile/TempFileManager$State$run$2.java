package com.bilibili.ogv.infra.tempfile;

import Lj0.a;
import android.util.Log;
import com.bilibili.lib.okdownloader.BiliDownloader;
import com.bilibili.lib.okdownloader.Task;
import com.bilibili.ogv.infra.tempfile.e;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/tempfile/TempFileManager$State$run$2.class */
final class TempFileManager$State$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    Object L$0;
    int label;
    final e this$0;
    final e.a this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempFileManager$State$run$2(e eVar, e.a aVar, Continuation<? super TempFileManager$State$run$2> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.this$1 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TempFileManager$State$run$2(this.this$0, this.this$1, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        a.d dVarA;
        a.b bVar;
        File file;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            File file2 = this.this$0.f67942a;
            if (!file2.exists() && !file2.mkdirs()) {
                Log.w("Files", "Create directory failed.");
            } else if (file2.isFile()) {
                Log.w("Files", "Path " + file2 + " is already taken by a file.");
            } else {
                String strHex = ByteString.Companion.encodeUtf8(this.this$1.f67946a.a()).md5().hex();
                Lj0.a aVar = this.this$0.f67943b;
                synchronized (aVar) {
                    aVar.d();
                    aVar.b();
                    Lj0.a.q(strHex);
                    a.c cVar = aVar.f14697k.get(strHex);
                    if (cVar != null && cVar.f14716e) {
                        dVarA = cVar.a();
                        if (dVarA != null) {
                            aVar.f14698l++;
                            aVar.f14696j.writeUtf8("READ").writeByte(32).writeUtf8(strHex).writeByte(10);
                            if (aVar.e()) {
                                ((ThreadPoolExecutor) aVar.f14705s).execute(aVar.f14706t);
                            }
                        }
                    }
                    dVarA = null;
                }
                if (dVarA != null) {
                    dVarA.close();
                    return dVarA.f14720b[0];
                }
                Lj0.a aVar2 = this.this$0.f67943b;
                synchronized (aVar2) {
                    aVar2.d();
                    aVar2.b();
                    Lj0.a.q(strHex);
                    a.c cVar2 = aVar2.f14697k.get(strHex);
                    if (cVar2 != null && cVar2.f14717f != null) {
                        bVar = null;
                    } else if (aVar2.f14702p || aVar2.f14703q) {
                        ((ThreadPoolExecutor) aVar2.f14705s).execute(aVar2.f14706t);
                        bVar = null;
                    } else {
                        aVar2.f14696j.writeUtf8("DIRTY").writeByte(32).writeUtf8(strHex).writeByte(10);
                        aVar2.f14696j.flush();
                        if (aVar2.f14699m) {
                            bVar = null;
                        } else {
                            a.c cVar3 = cVar2;
                            if (cVar2 == null) {
                                cVar3 = new a.c(aVar2, strHex);
                                aVar2.f14697k.put(strHex, cVar3);
                            }
                            a.b bVar2 = new a.b(aVar2, cVar3);
                            cVar3.f14717f = bVar2;
                            bVar = bVar2;
                        }
                    }
                }
                synchronized (bVar.f14711d) {
                    bVar.f14709b[0] = true;
                    file = bVar.f14708a.f14715d[0];
                }
                d dVar = this.this$1.f67946a;
                this.L$0 = bVar;
                this.label = 1;
                dVar.getClass();
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                Task taskBuild = BiliDownloader.Companion.get(dVar.f67941b).create(dVar.f67940a, "ogv_temp").into(file.getParentFile().getAbsolutePath()).fileName(file.getName()).addListener(new c(cancellableContinuationImpl, dVar)).build();
                taskBuild.enqueue();
                cancellableContinuationImpl.invokeOnCancellation(new b(dVar, taskBuild));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    result = Unit.INSTANCE;
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new IOException("Building cache directory failed.");
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.b bVar3 = (a.b) this.L$0;
        ResultKt.throwOnFailure(obj);
        bVar = bVar3;
        synchronized (bVar.f14711d) {
            if (bVar.f14710c) {
                throw new IllegalStateException();
            }
            if (bVar.f14708a.f14717f == bVar) {
                bVar.f14711d.c(bVar, true);
            }
            bVar.f14710c = true;
        }
        return bVar.f14708a.f14714c[0];
    }
}
