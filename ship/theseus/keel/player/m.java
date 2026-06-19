package com.bilibili.ship.theseus.keel.player;

import kotlin.jvm.internal.Ref;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/m.class */
public final class m implements ReadWriteProperty<Object, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.BooleanRef f91125a;

    public m(Ref.BooleanRef booleanRef) {
        this.f91125a = booleanRef;
    }

    public final Object getValue(Object obj, KProperty kProperty) {
        return Boolean.valueOf(this.f91125a.element);
    }

    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        this.f91125a.element = ((Boolean) obj2).booleanValue();
    }
}
