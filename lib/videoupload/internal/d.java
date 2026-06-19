package com.bilibili.lib.videoupload.internal;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.BufferedSink;
import tg0.InterfaceC8662a;
import vg0.C8808b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/d.class */
public final class d extends RequestBody implements H91.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC8662a f65079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f65080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f65081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f65082d;

    public d(InterfaceC8662a interfaceC8662a, Long l7, c cVar, k kVar) {
        this.f65079a = interfaceC8662a;
        this.f65080b = kVar;
        this.f65081c = l7.longValue();
        this.f65082d = cVar;
        if (interfaceC8662a != null) {
            return;
        }
        throw new IllegalStateException("taskId=" + l7 + " mChunkFile == null");
    }

    public final long contentLength() {
        return this.f65079a.m();
    }

    public final MediaType contentType() {
        return MediaType.parse("application/octet-stream");
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        long j7;
        int i7;
        byte[] bArr = new byte[8192];
        this.f65079a.getClass();
        try {
            c cVar = this.f65082d;
            if (cVar.f65074a != 0) {
                cVar.f65078e = false;
                Job job = cVar.f65076c;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                cVar.f65076c = BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), (CoroutineContext) null, (CoroutineStart) null, new ChunkNoChangeTimeoutTimer$start$1(cVar, null), 3, (Object) null);
            }
            long j8 = 0;
            loop0: while (true) {
                int i8 = 0;
                j7 = j8;
                do {
                    int i9 = this.f65079a.read(bArr);
                    if (i9 == -1) {
                        break loop0;
                    }
                    j8 = j7 + ((long) i9);
                    bufferedSink.write(bArr, 0, i9);
                    i7 = i8 + 1;
                    c cVar2 = this.f65082d;
                    synchronized (cVar2) {
                        if (cVar2.f65074a != 0) {
                            cVar2.f65077d = System.currentTimeMillis();
                        }
                    }
                    j7 = j8;
                    i8 = i7;
                } while (i7 != 10);
                this.f65080b.a(j8);
            }
            this.f65080b.a(j7);
            if (j7 == 0) {
                C8808b.a("[BiliUpload] taskId=" + this.f65081c + " ChunkRequestBody chunk file is empty ！！！！ " + this.f65079a + ",readLength=8192");
            }
        } finally {
            C8808b.a("[BiliUpload] taskId=" + this.f65081c + " ChunkRequestBody close " + this.f65079a + ",readLength=8192");
            Util.closeQuietly(this.f65079a);
            this.f65082d.a();
        }
    }
}
