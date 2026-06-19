package com.bilibili.studio.media;

import J1.z;
import android.net.Uri;
import androidx.compose.runtime.C4277b;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.studio.media.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/b.class */
public class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f108587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f108588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f108589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public c f108590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Uri f108591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f108592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f108593g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f108594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f108595j;

    public b() {
        this(0);
    }

    public /* synthetic */ b(int i7) {
        this(-1L, "", -1L, c.b.f108597a);
    }

    public b(long j7, @NotNull String str, long j8, @NotNull c cVar) {
        this.f108587a = j7;
        this.f108588b = str;
        this.f108589c = j8;
        this.f108590d = cVar;
    }

    @NotNull
    public String toString() {
        long j7 = this.f108587a;
        String str = this.f108588b;
        long j8 = this.f108589c;
        c cVar = this.f108590d;
        Uri uri = this.f108591e;
        long j9 = this.f108592f;
        long j10 = this.f108593g;
        int i7 = this.h;
        int i8 = this.f108594i;
        int i9 = this.f108595j;
        StringBuilder sbA = n.a(j7, "Media(id=", ", path='", str);
        z.a(j8, "', createTime=", ", mediaType=", sbA);
        sbA.append(cVar);
        sbA.append(", uri=");
        sbA.append(uri);
        sbA.append(", size=");
        sbA.append(j9);
        z.a(j10, ", duration=", ", width=", sbA);
        C4690e.a(i7, i8, ", height=", ", orientation=", sbA);
        return C4277b.a(i9, ")", sbA);
    }
}
