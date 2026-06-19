package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import com.bilibili.ship.theseus.united.page.videoquality.K;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import java.io.File;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/L.class */
public final class L implements SVGAParser.ParseCompletion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f103729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f103730b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/L$a.class */
    public static final class a extends N implements K.a {
        public final Animatable<Float, AnimationVector1D> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f103731i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final SVGAVideoEntity f103732j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SVGAVideoEntity sVGAVideoEntity) {
            super(sVGAVideoEntity);
            this.f103732j = sVGAVideoEntity;
            this.h = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            this.f103731i = (sVGAVideoEntity.getFrames() * 1000) / sVGAVideoEntity.getFPS();
        }

        @Override // com.bilibili.ship.theseus.united.page.videoquality.K.a
        public final int a() {
            return this.f103731i;
        }

        @Override // com.bilibili.ship.theseus.united.page.videoquality.K.a
        public final Animatable<Float, AnimationVector1D> getAnimatable() {
            return this.h;
        }
    }

    public L(CancellableContinuationImpl cancellableContinuationImpl, File file) {
        this.f103729a = cancellableContinuationImpl;
        this.f103730b = file;
    }

    public final void onCacheExist() {
    }

    public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f103729a;
        if (cancellableContinuationImpl.isActive()) {
            com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, new a(sVGAVideoEntity));
        }
    }

    public final void onError() {
        com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-QualityVisionResources$loadSvga$2$1-onError] ", androidx.core.content.b.b(this.f103730b, "SVGA loading failed. file = "), "QualityVisionResources$loadSvga$2$1-onError", (Throwable) null);
        CancellableContinuationImpl cancellableContinuationImpl = this.f103729a;
        if (cancellableContinuationImpl.isActive()) {
            com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, null);
        }
    }
}
