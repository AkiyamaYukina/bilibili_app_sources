package com.bilibili.upper.module.manuscript.model;

import android.content.SharedPreferences;
import java.util.LinkedList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/model/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList<String> f113669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f113670b;

    public final void a() {
        SharedPreferences.Editor editorEdit = this.f113670b.edit();
        int i7 = 0;
        while (i7 < 15) {
            editorEdit.putString("search_history_" + i7, i7 < this.f113669a.size() ? this.f113669a.get(i7) : "");
            i7++;
        }
        editorEdit.apply();
    }
}
