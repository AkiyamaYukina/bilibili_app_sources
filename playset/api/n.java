package com.bilibili.playset.api;

import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.video.story.player.quality.StoryQualityService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/n.class */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f84096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f84097c;

    public /* synthetic */ n(int i7, Object obj, Object obj2) {
        this.f84095a = i7;
        this.f84096b = obj;
        this.f84097c = obj2;
    }

    public final Object invoke(Object obj) {
        int i7;
        switch (this.f84095a) {
            case 0:
                ((BiliCall) ((Function1) this.f84096b).invoke((String) obj)).enqueue((BiliApiDataCallback) this.f84097c);
                break;
            default:
                PlayIndex playIndex = ((MediaResource) obj).getPlayIndex();
                if (playIndex != null) {
                    StoryQualityService storyQualityService = (StoryQualityService) this.f84096b;
                    storyQualityService.t.setValue((com.bilibili.player.tangram.basic.c) this.f84097c);
                    int i8 = playIndex.mQuality;
                    if (i8 < 0) {
                        i7 = 0;
                    } else {
                        i7 = i8;
                        if (i8 == 15) {
                            i7 = 16;
                        }
                    }
                    storyQualityService.p.setValue(new com.bilibili.player.tangram.basic.a(i7));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
