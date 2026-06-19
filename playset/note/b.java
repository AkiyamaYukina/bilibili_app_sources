package com.bilibili.playset.note;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.Observer;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playset.note.RspNoteList;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/b.class */
public final class b implements Observer<Bundle> {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Bundle bundle) {
        Bundle bundle2 = bundle;
        boolean z6 = bundle2.getBoolean("is_editing");
        Parcelable parcelable = bundle2.getParcelable("note");
        RspNoteList.NoteBean noteBean = parcelable instanceof RspNoteList.NoteBean ? (RspNoteList.NoteBean) parcelable : null;
        if (z6 || noteBean == null) {
            return;
        }
        RspNoteList.NoteBean.ARC arc = noteBean.arc;
        long j7 = arc != null ? arc.oid : -1L;
        long j8 = noteBean.noteId;
        HashMap map = new HashMap(2);
        map.put(GameCardButton.extraAvid, Long.toString(j7));
        map.put("noteId", Long.toString(j8));
        Neurons.reportClick(false, "main.mynote.note-card.0.click", map);
    }
}
