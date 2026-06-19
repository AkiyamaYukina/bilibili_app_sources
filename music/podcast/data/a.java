package com.bilibili.music.podcast.data;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import com.bapis.bilibili.app.listener.v1.PickArchiveAuthor;
import com.bapis.bilibili.app.listener.v1.PkcmArchive;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/a.class */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f66429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f66430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f66431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f66432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f66433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f66434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f66435g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f66436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f66437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f66438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f66439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f66440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f66441n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f66442o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final String f66443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f66444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f66445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f66446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f66447t;

    /* JADX INFO: renamed from: com.bilibili.music.podcast.data.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/a$a.class */
    public static final class C0380a {
        @NotNull
        public static a a(@NotNull PkcmArchive pkcmArchive, long j7, long j8, @NotNull String str) {
            PlayItem item = pkcmArchive.getArc().getItem();
            f fVar = new f(item.getItemType(), item.getOid(), item.getSubIdList(), item.getEt());
            String cover = pkcmArchive.getArc().getCover();
            String title = pkcmArchive.getArc().getTitle();
            PickArchiveAuthor owner = pkcmArchive.getArc().getOwner();
            return new a(fVar, cover, title, new b(owner.getMid(), owner.getName()), pkcmArchive.getArc().getDuration(), pkcmArchive.getArc().getParts(), pkcmArchive.getArc().getStatView(), pkcmArchive.getArc().getStatReply(), pkcmArchive.getArc().getState(), pkcmArchive.getArc().getMessage(), pkcmArchive.getPickReason(), j8, j7, str, pkcmArchive.getArc().getUseStatViewVt(), pkcmArchive.getArc().getStatViewVtText());
        }
    }

    public a(@NotNull f fVar, @Nullable String str, @Nullable String str2, @NotNull b bVar, long j7, int i7, int i8, int i9, int i10, @Nullable String str3, @Nullable String str4, long j8, long j9, @NotNull String str5, boolean z6, @NotNull String str6) {
        this.f66429a = fVar;
        this.f66430b = str;
        this.f66431c = str2;
        this.f66432d = bVar;
        this.f66433e = j7;
        this.f66434f = i7;
        this.f66435g = i8;
        this.h = i9;
        this.f66436i = i10;
        this.f66437j = str3;
        this.f66438k = str4;
        this.f66439l = j8;
        this.f66440m = j9;
        this.f66441n = str5;
        this.f66442o = z6;
        this.f66443p = str6;
        this.f66446s = i10 >= 0;
    }

    @Override // com.bilibili.music.podcast.data.e
    public final int a() {
        return 2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f66429a, aVar.f66429a) && Intrinsics.areEqual(this.f66430b, aVar.f66430b) && Intrinsics.areEqual(this.f66431c, aVar.f66431c) && Intrinsics.areEqual(this.f66432d, aVar.f66432d) && this.f66433e == aVar.f66433e && this.f66434f == aVar.f66434f && this.f66435g == aVar.f66435g && this.h == aVar.h && this.f66436i == aVar.f66436i && Intrinsics.areEqual(this.f66437j, aVar.f66437j) && Intrinsics.areEqual(this.f66438k, aVar.f66438k) && this.f66439l == aVar.f66439l && this.f66440m == aVar.f66440m && Intrinsics.areEqual(this.f66441n, aVar.f66441n) && this.f66442o == aVar.f66442o && Intrinsics.areEqual(this.f66443p, aVar.f66443p);
    }

    public final int hashCode() {
        int iHashCode = this.f66429a.hashCode();
        String str = this.f66430b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f66431c;
        int iA = I.a(this.f66436i, I.a(this.h, I.a(this.f66435g, I.a(this.f66434f, C3554n0.a((this.f66432d.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.f66433e), 31), 31), 31), 31);
        String str3 = this.f66437j;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f66438k;
        return this.f66443p.hashCode() + z.a(E.a(C3554n0.a(C3554n0.a((((iA + iHashCode3) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f66439l), 31, this.f66440m), 31, this.f66441n), 31, this.f66442o);
    }

    @Override // com.bilibili.music.podcast.data.e, com.bilibili.music.podcast.utils.InterfaceC5425e
    public final boolean isReported() {
        return this.f66444q;
    }

    @Override // com.bilibili.music.podcast.data.e, com.bilibili.music.podcast.utils.InterfaceC5425e
    public final void setReported(boolean z6) {
        this.f66444q = true;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Archive(item=");
        sb.append(this.f66429a);
        sb.append(", cover=");
        sb.append(this.f66430b);
        sb.append(", title=");
        sb.append(this.f66431c);
        sb.append(", author=");
        sb.append(this.f66432d);
        sb.append(", duration=");
        sb.append(this.f66433e);
        sb.append(", parts=");
        sb.append(this.f66434f);
        sb.append(", viewCount=");
        sb.append(this.f66435g);
        sb.append(", replyCount=");
        sb.append(this.h);
        sb.append(", state=");
        sb.append(this.f66436i);
        sb.append(", message=");
        sb.append(this.f66437j);
        sb.append(", recommendation=");
        sb.append(this.f66438k);
        sb.append(", pickId=");
        sb.append(this.f66439l);
        sb.append(", cardId=");
        sb.append(this.f66440m);
        sb.append(", headerTitle=");
        sb.append(this.f66441n);
        sb.append(", isVt=");
        sb.append(this.f66442o);
        sb.append(", viewContent=");
        return C8770a.a(sb, this.f66443p, ")");
    }
}
