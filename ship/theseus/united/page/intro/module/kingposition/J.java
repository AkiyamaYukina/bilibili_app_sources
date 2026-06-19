package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.lib.blconfig.ConfigManager;
import com.opensource.svgaplayer.SVGACallback;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/J.class */
public final class J implements SVGAParser.ParseCompletion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SVGAImageView f100234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.popupwindow.g f100235b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/J$a.class */
    public static final class a implements SVGACallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.united.page.popupwindow.g f100236a;

        public a(com.bilibili.ship.theseus.united.page.popupwindow.g gVar) {
            this.f100236a = gVar;
        }

        public final void onFinished() {
            this.f100236a.dismiss();
        }

        public final void onPause() {
        }

        public final void onPreStart() {
        }

        public final void onRepeat() {
        }

        public final void onStep(int i7, double d7) {
        }
    }

    public J(SVGAImageView sVGAImageView, com.bilibili.ship.theseus.united.page.popupwindow.g gVar) {
        this.f100234a = sVGAImageView;
        this.f100235b = gVar;
    }

    public final void onCacheExist() {
    }

    public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
        SVGAImageView sVGAImageView = this.f100234a;
        sVGAImageView.setLoops(1);
        sVGAImageView.setVideoItem(sVGAVideoEntity, ConfigManager.Companion.isHitFF("svga.canvas.drawer.repair.beila.like.bug"));
        sVGAImageView.setCallback(new a(this.f100235b));
        sVGAImageView.stepToFrame(0, true);
    }

    public final void onError() {
    }
}
