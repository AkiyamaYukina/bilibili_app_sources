package com.bilibili.music.podcast.utils;

import com.bilibili.music.podcast.data.MusicPlayVideo;
import gi0.C7309M;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: renamed from: com.bilibili.music.podcast.utils.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/j.class */
public final class C5430j implements C7309M.a<MusicPlayVideo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5431k f67010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f67011b;

    public C5430j(C5431k c5431k, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f67010a = c5431k;
        this.f67011b = cancellableContinuationImpl;
    }

    @Override // gi0.C7309M.a
    public final void a() {
        C7309M c7309mA = C5431k.a(this.f67010a);
        if (c7309mA != null) {
            ((ArrayList) c7309mA.f120137p).remove(this);
        }
        Result.Companion companion = Result.Companion;
        this.f67011b.resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }
}
