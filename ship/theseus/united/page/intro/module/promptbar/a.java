package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import im.session.home.F;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/a.class */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f100694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f100695c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f100693a = i7;
        this.f100694b = obj;
        this.f100695c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.f100693a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                PromptBarVo promptBarVo = (PromptBarVo) this.f100694b;
                int i7 = iIntValue;
                if (promptBarVo.d().size() == 1) {
                    i7 = iIntValue;
                    if (iIntValue == 1) {
                        i7 = 0;
                    }
                }
                TextVo textVo = (TextVo) CollectionsKt.getOrNull(promptBarVo.d(), i7);
                if (textVo != null) {
                    c cVar = (c) this.f100695c;
                    cVar.c(textVo);
                    cVar.b(textVo);
                }
                break;
            default:
                ((F) this.f100694b).e.put(((im.session.model.a) this.f100695c).f, LayoutCoordinatesKt.boundsInParent((LayoutCoordinates) obj));
                break;
        }
        return Unit.INSTANCE;
    }
}
