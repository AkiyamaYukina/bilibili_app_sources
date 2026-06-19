package com.bilibili.lib.videoupload.internal;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.RandomAccessFile;
import tg0.InterfaceC8662a;
import v.C8770a;
import vg0.C8808b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/b.class */
public final class b extends RandomAccessFile implements InterfaceC8662a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f65069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f65070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f65071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f65072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f65073e;

    @Override // tg0.InterfaceC8662a
    public final long m() {
        return this.f65071c;
    }

    @Override // java.io.RandomAccessFile, tg0.InterfaceC8662a
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int iMin = (int) Math.min(this.f65071c - this.f65072d, i8);
        this.f65072d += (long) iMin;
        if (iMin != 0) {
            return super.read(bArr, i7, iMin);
        }
        C8808b.a("[BiliUpload] taskId=0 read len =0, " + toString());
        return -1;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChunkFile{mName='");
        sb.append(this.f65069a);
        sb.append("', mOffset=");
        sb.append(this.f65070b);
        sb.append(", mLength=");
        sb.append(this.f65071c);
        sb.append(", mCurPos=");
        sb.append(this.f65072d);
        sb.append(", errorMsg='");
        return C8770a.a(sb, this.f65073e, "', taskId='0'}");
    }
}
