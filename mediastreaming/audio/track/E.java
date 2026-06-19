package com.bilibili.mediastreaming.audio.track;

import com.bilibili.playset.MultiTypeListDetailActivity;
import kntr.watch.later.watchlater.redux.viewmodel.WatchLaterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nh0.C8093a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/E.class */
public final /* synthetic */ class E implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f65818b;

    public /* synthetic */ E(Object obj, int i7) {
        this.f65817a = i7;
        this.f65818b = obj;
    }

    public final Object invoke() {
        Object obj = this.f65818b;
        switch (this.f65817a) {
            case 0:
                iC.f fVar = ((BiliAudioRecordTrack) obj).f65787i;
                if (fVar != null) {
                    fVar.b("audioRecord is null", -1, (C8093a) null);
                }
                break;
            case 1:
                int i7 = MultiTypeListDetailActivity.f83895o1;
                break;
            case 2:
                ((Function0) obj).invoke();
                break;
            default:
                ((WatchLaterViewModel) obj).K0();
                break;
        }
        return Unit.INSTANCE;
    }
}
