package com.bilibili.ship.theseus.united.player.controlcontainer;

import android.content.Context;
import com.bilibili.app.gemini.player.widget.a;
import com.bilibili.ship.theseus.united.player.controlcontainer.d;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/c.class */
public final class c extends a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f104443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Context context) {
        super(context);
        this.f104443b = bVar;
    }

    public final IControlWidget a(Class<? extends IControlWidget> cls, ControlContainerType controlContainerType) {
        b bVar = this.f104443b;
        d dVar = (d) bVar.f104438d.get(cls);
        return dVar == null ? super.a(cls, controlContainerType) : dVar.a(new d.a(bVar.f104437c, controlContainerType));
    }
}
